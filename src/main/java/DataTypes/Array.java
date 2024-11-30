package DataTypes;

public class Array {
    static int[] arr1 = new int [3];
    static int[] arr2 = {2,-5,8};



    public static void ArrayPlus(){
        arr1[0] = 4;
        arr1[1] = -34;
        arr1[2] = 49;
        for (int i=0; i<3; i++){
            System.out.println(arr1[i] + arr2[i]);
        }

    }


}
