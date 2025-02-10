package za.co.sindi.templates;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public interface TemplateEngine {

	public Template getTemplate(final String name);
	public Template getTemplate(final String name, final String encoding);
	
	default String render(final String name, final DataModel model) {
		return getTemplate(name).render(model);
	}
	
	default String render(final String name, final String encoding, final DataModel model) {
		return getTemplate(name, encoding).render(model);
	}
}
