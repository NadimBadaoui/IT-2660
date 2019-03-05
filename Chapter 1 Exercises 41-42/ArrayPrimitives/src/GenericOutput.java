public class GenericOutput<T>
{

	public <T> void outputNumericArray(T[] array)
	{
            for (T array1 : array) {
                System.out.println(array1); 
            }
	
	}

}