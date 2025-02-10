package za.co.sindi.templates;

import java.io.StringWriter;
import java.io.Writer;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public interface Template {
	
	default String render(DataModel model) {
		StringWriter writer = new StringWriter();
		render(model, writer);
		return writer.toString();
	}

	public void render(DataModel model, Writer writer);
}
