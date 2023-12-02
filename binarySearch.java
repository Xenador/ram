import java.util.*;
public class Binarysearch implements letters {
    public static int binary(int[] letters,int target)
    {
        int start = 0;
        int end = letters.length-1;
        while(end >= start)
        {
            int mid = start + (end - start)/2;
            if(letters[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid +1;
            }
        }
        return(letters[start%(letters.length)]);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of an letters");
        int size = scan.nextInt();
        int[] letters = new int[size];
        System.out.println("Please enter the elements of the letters");
        for(int i=0;i<size;i++)
        {
            letters[i]=scan.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target = scan.nextInt();
        System.out.println(binary(letters, target));
    }
}
