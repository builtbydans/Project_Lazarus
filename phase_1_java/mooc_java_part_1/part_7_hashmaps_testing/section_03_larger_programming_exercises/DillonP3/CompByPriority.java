/**
 * @author Neil Dillon - 40205697
 */
import java.util.Comparator;

/**
 * Orders the emails in ascending order in terms of of their priority level (1 being the
 * highest priority – and will therefore be listed first).
 */
public class CompByPriority implements Comparator<StandardEmail> {

	@Override
	public int compare(StandardEmail o1, StandardEmail o2) {
		return Integer.compare(o1.getPriority(), o2.getPriority());
	}

}
