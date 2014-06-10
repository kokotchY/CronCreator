package be.kokotchy.model.fields;

/**
 * Created by kokotchY on 10/6/2014.
 */
public class Seconds implements Value {
	private int fixedValue;

	private FieldType type = FieldType.EMPTY;

	@Override
	public String getValue() {
		switch (type) {
			case FIXED_VALUE:
				return String.valueOf(fixedValue);
		}
		return "";
	}

	public void setFixedValue(int value) {
		this.fixedValue = value;
		type = FieldType.FIXED_VALUE;
	}
}
