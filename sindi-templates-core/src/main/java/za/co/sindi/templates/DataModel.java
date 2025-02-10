package za.co.sindi.templates;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author buhake.sindi
 * @since 10 February 2024
 */
public class DataModel extends AbstractMap<String, Object> implements Map<String, Object> {

	private Map<String, Object> context = new LinkedHashMap<>();
	
	/* (non-Javadoc)
	 * @see java.util.AbstractMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public Object put(String key, Object value) {
		// TODO Auto-generated method stub
		return context.put(key, value);
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractMap#entrySet()
	 */
	@Override
	public Set<Entry<String, Object>> entrySet() {
		// TODO Auto-generated method stub
		return context.entrySet();
	}
}
