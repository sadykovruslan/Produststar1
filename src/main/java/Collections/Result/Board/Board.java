package Collections.Result.Board;

public class Board implements Comparable<Board>{
    String name;
    Float score;

    @Override
    public String toString() {
        return name + " has average mark: " + score;
    }

    @Override
    public int compareTo(Board o) {
        if (o.score == this.score) {
            return 0;
        } else if (o.score < this.score) {
            return 1;
        } else return -1;
    }

}
