package hackerrank;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Solution {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Object o ;
		int num = 9;
			Class<?>[] privateFieldClass = Solution.class.getDeclaredClasses();
				
				Class<?>[] privateClass = privateFieldClass[0].getDeclaredClasses();
				
					Constructor<?> contructor = privateClass[0].getDeclaredConstructors()[0];
					contructor.setAccessible(true);
					try {
						o = contructor.newInstance(new Solution.Inner());
						
						Method privMethod = privateClass[0].getDeclaredMethods()[0];
						System.out.println(((num&num-1)==0?"power of 2":"not a power of 2"));
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				
		
	}
	
	static class Inner{
		
		private class Private{
			private String powerof2(int numm) {
				return "som";
				
			}
		}

		
	}
}

class DoNotTerminate {
	public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1l;
	}
}