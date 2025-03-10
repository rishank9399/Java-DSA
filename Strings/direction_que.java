package Strings;

public class direction_que {

    public static float getShortestPath(String path){

        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            switch (dir) {
                    case 'N':
                    y++;
                    break;

                    case 'S':
                    y--;
                    break;

                    case 'E':
                    x++;
                    break;

                    case 'W':
                    x--;
                    break;

                default:
                return 0;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
