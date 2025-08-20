/**
 * @author Neil Dillon - 40205697
 */
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * This class represents a standard email with a EmailID, SenderAddress
 * ,RecipientAddress ,SentTimestamp ,Subject ,Body ,Category ,Priority
 * 
 */
public class StandardEmail implements Email {
	private static final int HIGH_PRIORITY = 1;
	private static final int MEDIUM_PRIORITY = 2;
	private static final int LOW_PRIORITY = 3;
	private static final String WORK_CATEGORY = "Work"; //Enum for this if more time potentially
	private static final String PERSONAL_CATEGORY = "Personal";
	private static final String PROMOTION_CATEGORY = "Promotion";
	private static final String EMAIL_SYMBOL = "@";
	// Instance vars

	private String emailId;
	private String senderAddress;
	private String recipientAddress;
	private LocalDateTime sentTimestamp;
	private String subject;
	private String body;
	private String category;
	private int priority;

	// Constructor

	/**
	 * This creates a new standard email object with a specified EmailID,
	 * SenderAddress ,RecipientAddress ,SentTimestamp ,Subject ,Body ,Category
	 * ,Priority
	 * 
	 * @param emailId          - The unique id of each email
	 * @param senderAddress    - The email address of the sender
	 * @param recipientAddress - The email address the email is going to
	 * @param sentTimestamp    - The time when the email was sent
	 * @param subject          - The subject line of the email
	 * @param body             - The main body of the email
	 * @param category         - This represents the category of the email e.g work
	 * @param priority         - This represents how important the email is from 1
	 *                         (high) - 3 (low)
	 */

	public StandardEmail(String emailId, String senderAddress, String recipientAddress, LocalDateTime sentTimestamp,
			String subject, String body, String category, int priority) throws IllegalArgumentException {
		this.setEmailId(emailId);
		this.setSenderAddress(senderAddress);
		this.setRecipientAddress(recipientAddress);
		this.setSentTimestamp(sentTimestamp);
		this.setSubject(subject);
		this.setBody(body);
		this.setCategory(category);
		this.setPriority(priority);
	}

	// Getters and Setters

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) throws IllegalArgumentException {
		
		if (emailId == null) {
			throw new IllegalArgumentException();
		}
		this.emailId = emailId;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) throws IllegalArgumentException {

		if (senderAddress.contains(EMAIL_SYMBOL) && senderAddress.contains(".")) {
			this.senderAddress = senderAddress;

		} else {
			throw new IllegalArgumentException("Invalid sender's email address");
		}
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) throws IllegalArgumentException {

		if (recipientAddress.contains(EMAIL_SYMBOL) && recipientAddress.contains(".")) {
			this.recipientAddress = recipientAddress;

		} else {
			throw new IllegalArgumentException("Invalid sender's email address");
		}
	}

	public LocalDateTime getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(LocalDateTime sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		
		if (category == null) {
			throw new IllegalArgumentException("Category cannot be null");
		} else {
			String categoryToLower = category.toLowerCase();
			category = categoryToLower;
		}
		this.category = category;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) throws IllegalArgumentException {

		if (priority == HIGH_PRIORITY || priority == MEDIUM_PRIORITY || priority == LOW_PRIORITY) {
			this.priority = priority;
		} else {
			throw new IllegalArgumentException("Priority can only be  1 = High, 2 = Medium, 3 = Low");

		}
	}

	@Override
	public void displayContent() {

		System.out.printf("%-20s: %-12s\n" , "Email ID" , this.getEmailId());
		System.out.printf("%-20s: %-12s\n" , "Sender" , this.getSenderAddress());
		System.out.printf("%-20s: %-12s\n" , "Recipient" , this.getRecipientAddress());
		System.out.printf("%-20s: %-12s\n" , "Subject" , this.getSubject());
		System.out.printf("%-20s: %-12s\n" , "Sent" , this.getSentTimestamp());
		System.out.printf("%-20s: %-12s\n" , "Category" , this.getCategory());
		System.out.printf("%-20s: %-12s\n" , "Priority" , this.getPriority());
		System.out.printf("%-20s: %-12s\n" , "Body" , this.getBody());
		
	}

	/**
	 * This method creates a string representation of the email.
	 */
	@Override
	public String emailToText() {
		
		return this.getEmailId()+","+this.getSenderAddress()+","+this.getRecipientAddress()+","+this.getSentTimestamp()+","+this.getSubject()+","+this.getBody()+","+this.getCategory()+","+this.getPriority();
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, category, emailId, priority, recipientAddress, senderAddress, sentTimestamp, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardEmail other = (StandardEmail) obj;
		return Objects.equals(body, other.body) && Objects.equals(category, other.category)
				&& Objects.equals(emailId, other.emailId) && priority == other.priority
				&& Objects.equals(recipientAddress, other.recipientAddress)
				&& Objects.equals(senderAddress, other.senderAddress)
				&& Objects.equals(sentTimestamp, other.sentTimestamp) && Objects.equals(subject, other.subject);
	}
	
	

}
