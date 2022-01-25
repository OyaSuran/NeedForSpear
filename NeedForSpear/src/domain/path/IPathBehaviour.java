package domain.path;

import domain.obstacle.Obstacle;
import domain.util.PosVector;

public interface IPathBehaviour {

    public void initialPath(Obstacle obs);


    public PosVector nextPosition();

}
