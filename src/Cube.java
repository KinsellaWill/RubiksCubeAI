/**
 * Created by willkinsella on 6/28/16.
 */
public class Cube {

    private char[] colors;
    private Piece[] pieces;
    private Corner[] corners;
    private Edge[] edges;

    public Cube(){
        //sets up a blank cube
        //20 configurable pieces(20 not center pieces)



        pieces = new Piece[20];
        corners = new Corner[8];
        edges = new Edge[12];

        int cornerCounter = 0;
        int edgeCounter = 0;

        for(int i = 0; i < 20; i++){
            if(i == 0|| i == 2 || i == 4 || i == 6 || i == 12 || i == 14 || i == 16 || i == 18){
                corners[cornerCounter] = new Corner();
                pieces[i] = corners[cornerCounter];
                cornerCounter++;
            }
            else{
                edges[edgeCounter] = new Edge();
                pieces[i] = edges[edgeCounter];
                edgeCounter++;
            }
        }
    }

    public void randomize(){

        for(int i = 0; i < corners.length; i++){
            corners[i].setRandomCorner();
        }
        for(int i = 0; i < edges.length; i++){
            edges[i].setRandomEdge();
        }

    }

    /**
     *
     *
     *
     *
     *
     *
     * Below are methods for movement.
     *
     *
     * As of this comment, they haven't been written
     *
     *
     * Dear god they'll be long.
     *
     *
     *
     *
     *
     *
     */
}
