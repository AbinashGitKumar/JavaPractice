package practice.singleTon;

	 class SingleTon implements Cloneable {

	public static void main(String[] args) {

	}

	private static SingleTon instance = null;

	private SingleTon() {
      System.out.println("private constructor so it can't be called from outside the class");
	}

	public static final SingleTon getInstance() {
		if (instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null) {
					instance = new SingleTon();
				}
			}
		}

		return instance;
	}
	
	/**
	 * Even if you clone the object same object would be returned. 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	/**
	 * Even if you deserialize the serialized object same instance would be returned
	 * and SingleTon pattern would not break.
	 */
	protected Object readResolve() {
		return instance;
	}
}
