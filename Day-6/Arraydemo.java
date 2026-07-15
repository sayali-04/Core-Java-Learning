public class Arraydemo {

    public static void main(String[] args) {
        // int nums[]=new int[3];   or int nums[]={101,102,103};

        //1D array
        
        // // nums[0]=101;
        // // nums[1]=102;
        // // nums[2]=103;

        // // System.out.println(nums[0]);
        // // System.out.println(nums[1]);
        // // System.out.println(nums[2]);

        // // System.out.println(nums.length);

        // int x=101;
        // for(int i=0; i<nums.length; i++){
        //     nums[i]=x;
        //     x++;
        // }
        // for(int i=0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        //OR
        // int nums[]={1,2,3};
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
 
        // }


        //2D array

        // int marks[][]=new int [3][3];

        // marks[0][0]=50;
        // marks[0][1]=30;
        // marks[0][2]=90;

        // marks[1][0]=60;
        // marks[1][1]=40;
        // marks[1][2]=80;

        // marks[2][0]=70;
        // marks[2][1]=50;
        // marks[2][2]=70;

        // for(int rows=0; rows<3; rows++){
        //     for(int cols=0; cols<3;cols++){
        //         System.out.print(marks[rows][cols]);
        //     }
        //     System.out.println();
        // }

         // 2-D array
        int[][] marks = {
            {12, 14, 56},
            {34, 45, 67},
            {45, 67, 78}
        };

        for(int row = 0; row < marks.length; row++) {
            for(int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

    }
}