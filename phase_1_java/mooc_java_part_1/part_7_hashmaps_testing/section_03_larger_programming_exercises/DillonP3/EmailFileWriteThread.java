/**
 * @author Neil Dillon - 40205697
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmailFileWriteThread implements Runnable {

	@Override
	public void run() {

		writeListToCSV(EmailProcessor.generateListToWrite());

	}

	public void writeListToCSV(List<String> listToWrite) {

		File file = new File("emails_processed.csv");

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
				bufferedWriter.write("EmailID" + "," + "SenderAddress" + "," + "RecipientAddress" + ","
						+ "SentTimestamp" + "," + "Subject" + "," + "Body" + "," + "Category" + "," + "Priority\n");

				for (String string : listToWrite) {
					bufferedWriter.write(string + "\n");
				}
			}

			System.out.println("File written to successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
