import org.python.core.PyException;
import org.python.util.PythonInterpreter;

public class Main {
    public static void main(String[] args) throws PyException{
	PythonInterpreter intrp = new PythonInterpreter();
	intrp.exec("import solution");
	intrp.exec("solution.main()");
    }
}