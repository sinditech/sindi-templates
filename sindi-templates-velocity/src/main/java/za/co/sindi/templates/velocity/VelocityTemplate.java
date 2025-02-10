package za.co.sindi.templates.velocity;

import java.io.Writer;
import java.util.Objects;

import org.apache.velocity.VelocityContext;

import za.co.sindi.templates.DataModel;
import za.co.sindi.templates.Template;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public class VelocityTemplate implements Template {

	private org.apache.velocity.Template template;
	
	/**
	 * @param template
	 */
	public VelocityTemplate(org.apache.velocity.Template template) {
		super();
		this.template = Objects.requireNonNull(template, "A Velocity template is required.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.Template#render(za.co.sindi.templates.DataModel, java.io.Writer)
	 */
	@Override
	public void render(DataModel model, Writer writer) {
		// TODO Auto-generated method stub
		template.merge(new VelocityContext(model), writer);
	}
}
