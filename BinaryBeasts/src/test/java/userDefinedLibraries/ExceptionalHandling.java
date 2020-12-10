package userDefinedLibraries;

/**
 * This class is defined in order to handle exceptions.
 * 
 * @author BINARYBEASTS
 * @since 2020/11/27
 * 
 */

@SuppressWarnings("serial")
public class ExceptionalHandling extends Exception{
	public static void FileNotFoundException (Exception error){
		error.printStackTrace();
	}
	public static void IOException (Exception error){
		error.printStackTrace();
	}
	public static void popupException(Exception error){
		System.out.println("Popup is not present");
	}
}