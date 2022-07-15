package gr.codelearn.core.showcase.stream;

public class Transaction {
	private Integer value;
	private Integer id;

	public Integer getValue() {
		return value;
	}

	public void setValue(final Integer value) {
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Transaction(final Integer id, final Integer value) {
		this.value = value;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Transaction{" + "value=" + value + ", id=" + id + '}';
	}
}
