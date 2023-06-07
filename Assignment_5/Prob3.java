/**
 * Represents a figure that can be displayed.
 */
interface Figure {
    /**
     * Prints the figure.
     */
    void getFigure();
}

/**
 * Represents an upward hat figure (/\\).
 */
class UpwardHat implements Figure {
    /**
     * Prints the upward hat figure.
     */
    @Override
    public void getFigure() {
        System.out.print("/\\ ");
    }
}

/**
 * Represents a downward hat figure (\\/).
 */
class DownwardHat implements Figure {
    /**
     * Prints the downward hat figure.
     */
    @Override
    public void getFigure() {
        System.out.print("\\/ ");
    }
}

/**
 * Represents a face figure (:)).
 */
class FaceMaker implements Figure {
    /**
     * Prints the face figure.
     */
    @Override
    public void getFigure() {
        System.out.print(":) ");
    }
}

/**
 * Represents a vertical figure (||).
 */
class Vertical implements Figure {
    /**
     * Prints the vertical figure.
     */
    @Override
    public void getFigure() {
        System.out.print("|| ");
    }
}

/**
 * Represents the Driver class for testing the figures.
 */
public class Driver {
    /**
     * The main method of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new UpwardHat();
        figures[1] = new UpwardHat();
        figures[2] = new DownwardHat();
        figures[3] = new FaceMaker();
        figures[4] = new Vertical();

        // Print figures without class names
        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println();

        // Print figures with class names
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName() + " :");
            figure.getFigure();
        }
    }
}
