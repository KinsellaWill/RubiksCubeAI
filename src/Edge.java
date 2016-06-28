/**
 * Created by willkinsella on 6/28/16.
 */
public class Edge implements Piece {

    private char[] colors;
    private static int w;
    private static int y;
    private static int g;
    private static int r;
    private static int o;
    private static int b;

    public Edge() {
        colors = new char[2];
    }
    
    public static void setColorsLeft() {
        
        w = 4; //0
        y = 4; //1
        g = 4; //2
        r = 4; //3
        o = 4; //4
        b = 4; //5
    }

    public void setRandomEdge() {
        //For setting a new random edge color configuration to the current edge piece
        double[] randoms = new double[2];
        for(int i = 0; i < 2; i++) {
            boolean continuing = false;
            while(!continuing) {
                randoms[i] = Math.random() * 6;
                if (randoms[i] < 1 && w != 0)  {
                    if (i == 0)  {
                        colors[i] = 'w';
                        continuing = true;
                    } else if (colors[0] != 'y')  {
                        colors[i] = 'w';
                        continuing = true;
                    }
                } else if (randoms[i] < 2 && y != 0)  {
                    if (i == 0)  {
                        colors[i] = 'y';
                        continuing = true;
                    } else if (colors[0] != 'w')  {
                        colors[i] = 'y';
                        continuing = true;
                    }
                } else if (randoms[i] < 3 && g != 0)  {
                    if (i == 0)  {
                        colors[i] = 'g';
                        continuing = true;
                    } else if (colors[0] != 'b')  {
                        colors[i] = 'g';
                        continuing = true;
                    }
                } else if (randoms[i] < 4 && r != 0)  {
                    if (i == 0)  {
                        colors[i] = 'r';
                        continuing = true;
                    } else if (colors[0] != 'o')  {
                        colors[i] = 'r';
                        continuing = true;
                    }
                } else if (randoms[i] < 5 && o != 0)  {
                    if (i == 0)  {
                        colors[i] = 'o';
                        continuing = true;
                    } else if (colors[0] != 'r')  {
                        colors[i] = 'o';
                        continuing = true;
                    }
                } else if (b != 0)  {
                    if (i == 0)  {
                        colors[i] = 'b';
                        continuing = true;
                    } else if (colors[0] != 'g')  {
                        colors[i] = 'b';
                        continuing = true;
                    }
                }
            }
        }


    }

    public char[] getColors() {
        return colors;
    }
}
