package arrayPart_Questions;

public class trappingRainwater_2 {

    public static int trapped_Rainwater(int height[], int width){

        //left max array
        int leftMax[] = new int [height.length];

        leftMax[0] = height[0];

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Right max array
        int rightMax[] = new int [height.length];

        rightMax[height.length - 1] = height[height.length - 1];

        for(int i=height.length-2; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        //Calculating trappedWater
        int trappedRainwater = 0;

        for(int i=0; i<height.length; i++){

            //calculating waterlevel
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //calculating trapped water
            trappedRainwater += (waterlevel - height[i]) * width;
        }
        
        return trappedRainwater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int width = 1;

        System.out.println(trapped_Rainwater(height, width));
    }
}
