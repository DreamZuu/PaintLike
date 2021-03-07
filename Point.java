
public class Point extends Figure {
        // Attributs
        private int x;
        private int y;
        
        // Constructeur
        public Point(String nom, String couleur, int x, int y) {
                super(nom, couleur);
                this.x = x;
                this.y = y;
        }
        
        // Getters/Setters
        public int getX() {
                return x;
        }
        
        public void setX(int x) {
                this.x = x;
        }
        
        public int getY() {
                return y;
        }
        
        public void setY(int y) {
                this.y = y;
        }

        
        // Methodes
        /**Calcul de la distance entre deux points
         * @param un point P
         * @return la longeur (int) entre le point courant et celui en param
         */
        public int getDistance(Point P) {
        	return (int) Math.sqrt(Math.pow((this.x-P.x),2)+Math.pow((this.y-P.y),2));
        }
        
        /**Test d'egalite de valeur entre deux objets
         * @param une figure p
         * @return 1 ou 0 en fonction de si l'egalite est vrai ou pas
         */
        public boolean equals(Figure p) {
        	Point p1 = (Point)p;
        	return x==p1.x && y==p1.y;
        }
        
        /**Mise en forme ecrite de l'affichage
    	 * @return l'ensemble des elements 
    	 */
        public String toString() {
        	return "[("+getNom()+":" + x +","+y+") "+getCouleur()+"]";
        }
        
        /**Translation d'un point
    	 * @param dx valeur de translation de x
    	 * @param dy valeur de translation de y
    	 */
        public void translater(int dx, int dy) {
                x += dx;
                y += dy;
        }
        /**Clonage en profondeur d'un point 
         * @return la copie du point courant 
         */
        public Point Clone() {
        	return new Point(getNom()+"(Clone)",getCouleur(),x, y);
        }
        
        /**Centre de la figure
         * @return le milieu du point (lui meme)
         */
        public Point getCentre() {
                return this;
        }
        
}