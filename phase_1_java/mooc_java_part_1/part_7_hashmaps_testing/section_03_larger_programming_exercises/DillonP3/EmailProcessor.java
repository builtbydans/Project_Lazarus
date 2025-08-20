/**
 * @author Neil Dillon - 40205697
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 * Email processor class which has separate static methods within the class to
 * achieve the logic required for each specific task and then the methods can be
 * called as needed from the main method to demonstrate the functionality.
 */
public class EmailProcessor {

	public static List<StandardEmail> emailListPub = new ArrayList<StandardEmail>();

	public static void main(String[] args) {

		List<StandardEmail> emailList =  new LinkedList<StandardEmail>(readEmailCSV());
		emailListPub.addAll(emailList);

		emailProcessingOrder(emailList); // Task 1
		System.out.println();
		unqiueEmailAddresses(emailList); // Task 2
		System.out.println(); // extra print line between each method for better readability
		emailStatisticsPerCategory(emailList); // Task 3 (part 1)
		System.out.println();
		emailStatisticsPerSender(emailList); // Task 3 (part 2)
		System.out.println();
		priorityOrdering(emailList); //Task 4
		System.out.println();
		generateListToWrite(); //Task
		EmailFileWriteThread emailFileWriteThread = new EmailFileWriteThread();
		Thread thread = new Thread(emailFileWriteThread);
		thread.start();
	}

	/**
	 * This method returns a list with all emails and their emailToText() method
	 * 
	 * @return
	 */
	public static synchronized List<String> generateListToWrite() {

		List<String> emailsToString = new LinkedList<String>();

		for (StandardEmail string : emailListPub) {

			emailsToString.add(string.emailToText());
		}

		return emailsToString;
	}

	/**
	 * This method processes each email and outputs a message to the console
	 * indicating the email's subject.
	 * 
	 * @param emailList
	 */
	public static void emailProcessingOrder(List<StandardEmail> emailList) {

		if (emailList.isEmpty()) {
			System.out.println("List is empty!");
		}

		Queue<String> emailSubjects = new LinkedList<String>();

		for (StandardEmail emailSub : emailList) {

			emailSubjects.add(emailSub.getSubject());

		}

		System.out.println("Email Processing Order:");

		int count = 1;

		while (count < emailSubjects.size()) {

			try {
				Thread.sleep(1000); // Thread sleep to simulate sending process
				System.out.println("Sending: " + emailSubjects.poll());

			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * This method displays the emails in ascending order of their priority level (1
	 * being the highest priority – and will therefore be listed first).
	 * 
	 * @param emailList
	 */
	public static void priorityOrdering(List<StandardEmail> emailList) {

		if (emailList.isEmpty()) {
			System.out.println("List is empty!");
		}
		Collections.sort(emailList, new CompByPriority());

		System.out.println("Emails Ordered By Priority:");
		for (StandardEmail standardEmail : emailList) {
			standardEmail.displayContent();
			System.out.println("--------------------------------------------");
		}
	}

	/**
	 * This method shows the number of emails sent by each unique sender
	 */
	public static void emailStatisticsPerSender(List<StandardEmail> emailList) {

		if (emailList.isEmpty()) {
			System.out.println("List is empty!");
		}

		Map<String, Integer> emailsPerSender = new TreeMap<String, Integer>();

		for (StandardEmail standardEmail : emailList) {

			if (!emailsPerSender.containsKey(standardEmail.getSenderAddress())) {
				emailsPerSender.put(standardEmail.getSenderAddress(), 1);
			} else {
				int freq = emailsPerSender.get(standardEmail.getSenderAddress());
				emailsPerSender.put(standardEmail.getRecipientAddress(), freq + 1);
			}
		}

		System.out.println("Emails Per Sender:");

		for (String senderEmail : emailsPerSender.keySet()) {
			System.out.println(senderEmail + ": " + emailsPerSender.get(senderEmail));
		}

	}

	/**
	 * This method shows the number of emails associated with each unique category
	 * e.g work
	 * 
	 * @param emailList
	 */

	public static void emailStatisticsPerCategory(List<StandardEmail> emailList) {

		if (emailList.isEmpty()) {
			System.out.println("List is empty!");
		}

		Map<String, Integer> emailsPerCategory = new TreeMap<String, Integer>();

		for (StandardEmail standardEmail : emailList) {

			if (!emailsPerCategory.containsKey(standardEmail.getCategory())) {
				emailsPerCategory.put(standardEmail.getCategory(), 1);
			} else {
				int freq = emailsPerCategory.get(standardEmail.getCategory());
				emailsPerCategory.put(standardEmail.getCategory(), freq + 1);
			}
		}

		System.out.println("Emails Per Category:");
		for (String standardEmail : emailsPerCategory.keySet()) {

			System.out.println(standardEmail + ": " + emailsPerCategory.get(standardEmail));
		}
	}

	/**
	 * This method displays the unique email addresses to the console on one address
	 * per line
	 * 
	 * @param emailList
	 */
	public static void unqiueEmailAddresses(List<StandardEmail> emailList) {

		if (emailList.isEmpty()) {
			System.out.println("List is empty!");
		}

		Set<String> seenSenderAddresses = new HashSet<String>();
		Set<String> seenRecipentAddresses = new HashSet<String>();
		Set<String> uniqueAddresses = new HashSet<String>();

		for (StandardEmail standardEmail : emailList) {
			seenSenderAddresses.add(standardEmail.getSenderAddress());
			seenRecipentAddresses.add(standardEmail.getRecipientAddress());
		}

		uniqueAddresses.addAll(seenRecipentAddresses);
		uniqueAddresses.addAll(seenSenderAddresses);

		System.out.println("Unique Email Addresses:");
		for (String string : uniqueAddresses) {
			System.out.println(string);
		}
	}

	/**
	 * Reads in the email data from the CSV file and populates the emails list.
	 */
	public static List<StandardEmail> readEmailCSV() {

		List<StandardEmail> emailListToReturn = new LinkedList<StandardEmail>();

		int attemptedRead = 0;
		int successfulRead = 0;

		String fileName = "emails.csv";
		String line;
		File file = new File(fileName);

		try {
			FileReader fileReader = new FileReader(file);
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				line = bufferedReader.readLine(); // Ignore headings

				while ((line = bufferedReader.readLine()) != null) {

					attemptedRead++;
					String[] parts = line.split(",");

					if (parts.length < 8)
						continue; // Part 1

					boolean skip = false; // Part 2

					for (String string : parts) {

						if (string.trim().isEmpty() || string.equalsIgnoreCase("null")) {
							skip = true;
							break;
						}
					}

					if (skip)
						continue; // Part 3

					try {

						String emailID = parts[0].trim();
						String senderAddress = parts[1].trim();
						String recipientAddress = parts[2].trim();
						LocalDateTime sentTimestamp = LocalDateTime.parse(parts[3].trim());
						String subject = parts[4].trim();
						String body = parts[5].trim();
						String category = parts[6].trim();
						int priority = Integer.parseInt(parts[7].trim());

						StandardEmail standardEmail = new StandardEmail(emailID, senderAddress, recipientAddress,
								sentTimestamp, subject, body, category, priority);
						emailListToReturn.add(standardEmail);
						successfulRead++;
					} catch (Exception ex) {
						// System.out.println(line); This line was attempt at printing out invalid lines
					}
				}

				System.out.println("---------------------------------------------------");
				System.out.println("Attempted to Read " + attemptedRead + " messages");
				System.out.println("Successfully Read " + successfulRead + " messages");
				System.out.println("---------------------------------------------------");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emailListToReturn;

	}

}
