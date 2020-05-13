package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {

		//Automatic type casting(long->float)     (widening)
		byte x=2;
		int y=x;
		System.out.println("from byte to int "+y);
        short z=9;
        y=z;
        System.out.println("from short to int "+y);
        long longVal=1234567;
        float floatVal=longVal;
        System.out.println("from long to float "+ floatVal);
        char charval='A';
        int w=charval;
        System.out.println("From char to int "+w);
        char q='a';
        double s=q;
        System.out.println("from char to double "+s);
        /*
        from byte to int 2
        from short to int 9
        from long to float 1234567.0
        from char to double 97.0
        */

        
        
        
        //manual type casting                      (narrowing)
        float r=2.3f;
        int intVal=(int)r;
        System.out.println("from float value to int "+intVal);
        double doubleVal=2.266458;
        int val=(int)doubleVal;
        System.out.println("form double to int "+val);
        /*
        from float value to int 2
        form double to int 2
		*/
	}

}
