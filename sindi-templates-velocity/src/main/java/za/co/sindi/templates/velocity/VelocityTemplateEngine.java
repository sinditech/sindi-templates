package za.co.sindi.templates.velocity;

import java.util.Objects;

import org.apache.velocity.app.VelocityEngine;

import za.co.sindi.templates.Template;
import za.co.sindi.templates.TemplateEngine;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public class VelocityTemplateEngine implements TemplateEngine {
	
	private VelocityEngine velocityEngine;

	/**
	 * @param velocityEngine
	 */
	public VelocityTemplateEngine(VelocityEngine velocityEngine) {
		super();
		this.velocityEngine = Objects.requireNonNull(velocityEngine, "A Velocity Engine is required.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.TemplateEngine#getTemplate(java.lang.String)
	 */
	@Override
	public Template getTemplate(String name) {
		// TODO Auto-generated method stub
		return new VelocityTemplate(velocityEngine.getTemplate(name));
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.TemplateEngine#getTemplate(java.lang.String, java.lang.String)
	 */
	@Override
	public Template getTemplate(String name, String encoding) {
		// TODO Auto-generated method stub
		return new VelocityTemplate(velocityEngine.getTemplate(name, encoding));
	}
}
