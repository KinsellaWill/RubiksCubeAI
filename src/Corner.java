/**
 * Created by willkinsella on 6/28/16.
 */
public class Corner implements Piece {

    private char[] colors;
    private static int w;
    private static int y;
    private static int g;
    private static int r;
    private static int o;
    private static int b;

    public Corner() {
        colors = new char[3];
    }
    
    
    public static void setColorsLeft() {
        w = 4; //0
        y = 4; //1
        g = 4; //2
        r = 4; //3
        o = 4; //4
        b = 4; //5
    }

    public void setRandomCorner() {
        //for setting a new random corner color configuration to the current corner piece

        
        double[] randoms = new double[3];
        for(int i = 0; i < 3; i++) {
            boolean continuing = false;
            while(!continuing) {
                randoms[i] = Math.random()*6;
                if(randoms[i] < 1 && w != 0) {
                    if(i == 0) {
                        colors[i] = 'w';
                        continuing = true;
                    } else  {
                        for(int subtracts = 1; subtracts < i; subtracts++)  {
                            if (colors[i - subtracts] != 'y')  {
                                colors[i] = 'w';
                                continuing = true;
                            }
                        }
                    }
                }
                else if(randoms[i] < 2 && y != 0) {
                    if (i == 0) {
                        colors[i] = 'y';
                        continuing = true;
                    } else {
                        for (int subtracts = 1; subtracts < i; subtracts++) {
                            if (colors[i - subtracts] != 'w') {
                                colors[i] = 'y';
                                continuing = true;
                            }
                        }
                    }
                }
                else if(randoms[i] < 3 && g != 0) {
                    if (i == 0) {
                        colors[i] = 'g';
                        continuing = true;
                    } else {
                        for (int subtracts = 1; subtracts < i; subtracts++) {
                            if (colors[i - subtracts] != 'b') {
                                colors[i] = 'g';
                                continuing = true;
                            }
                        }
                    }
                }
                else if(randoms[i] < 4 && r != 0) {
                    if (i == 0) {
                        colors[i] = 'r';
                        continuing = true;
                    } else {
                        for (int subtracts = 1; subtracts < i; subtracts++) {
                            if (colors[i - subtracts] != 'o') {
                                colors[i] = 'r';
                                continuing = true;
                            }
                        }
                    }
                }
                else if(randoms[i] < 5 && o != 0) {
                    if (i == 0) {
                        colors[i] = 'o';
                        continuing = true;
                    } else {
                        for (int subtracts = 1; subtracts < i; subtracts++) {
                            if (colors[i - subtracts] != 'r') {
                                colors[i] = 'o';
                                continuing = true;
                            }
                        }
                    }
                }
                else if(b != 0) {
                    if (i == 0) {
                        colors[i] = 'b';
                        continuing = true;
                    } else {
                        for (int subtracts = 1; subtracts < i; subtracts++) {
                            if (colors[i - subtracts] != 'g') {
                                colors[i] = 'b';
                                continuing = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public char[] getColors() {
        return colors;
    }
}
