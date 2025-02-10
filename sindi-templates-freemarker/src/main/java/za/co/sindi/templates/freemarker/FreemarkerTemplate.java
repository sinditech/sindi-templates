package za.co.sindi.templates.freemarker;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

import freemarker.template.TemplateException;
import za.co.sindi.templates.DataModel;
import za.co.sindi.templates.Template;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public class FreemarkerTemplate implements Template {

	private freemarker.template.Template template;
	
	/**
	 * @param template
	 */
	public FreemarkerTemplate(freemarker.template.Template template) {
		super();
		this.template = Objects.requireNonNull(template, "A Freemarker template is required.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.Template#render(za.co.sindi.templates.DataModel, java.io.Writer)
	 */
	@Override
	public void render(DataModel model, Writer writer) {
		// TODO Auto-generated method stub
		try {
			template.process(model, writer);
		} catch (TemplateException | IOException e) {
			// TODO Auto-generated catch block
			throw new za.co.sindi.templates.TemplateException(e);
		}
	}
}
