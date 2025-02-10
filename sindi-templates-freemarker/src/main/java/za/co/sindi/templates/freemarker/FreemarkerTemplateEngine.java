package za.co.sindi.templates.freemarker;

import java.io.IOException;
import java.util.Objects;

import freemarker.template.Configuration;
import za.co.sindi.templates.Template;
import za.co.sindi.templates.TemplateEngine;
import za.co.sindi.templates.TemplateException;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public class FreemarkerTemplateEngine implements TemplateEngine {
	
	private Configuration configuration;

	/**
	 * @param configuration
	 */
	public FreemarkerTemplateEngine(Configuration configuration) {
		super();
		this.configuration = Objects.requireNonNull(configuration, "A Freemarker Configuration is required.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.TemplateEngine#getTemplate(java.lang.String)
	 */
	@Override
	public Template getTemplate(String name) {
		// TODO Auto-generated method stub
		try {
			return new FreemarkerTemplate(configuration.getTemplate(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new TemplateException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.templates.TemplateEngine#getTemplate(java.lang.String, java.lang.String)
	 */
	@Override
	public Template getTemplate(String name, String encoding) {
		// TODO Auto-generated method stub
		try {
			return new FreemarkerTemplate(configuration.getTemplate(name, encoding));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new TemplateException(e);
		}
	}
}
