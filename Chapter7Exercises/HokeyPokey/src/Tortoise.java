// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.biped.TortoiseResource;
// </editor-fold>

class Tortoise extends Biped {

    /* Construct new Tortoise */
    public Tortoise() {
        super(TortoiseResource.DEFAULT);
    }

    public void hokeyPokeyVerse(SJoint bodyPart) {
        bodyPart.turn(TurnDirection.BACKWARD, 0.25);
        bodyPart.turn(TurnDirection.FORWARD, 0.25);
        this.shake(bodyPart);
        this.turnAround();
    }

    public void shake(SJoint bodyPart) {
        bodyPart.turn(TurnDirection.BACKWARD, 0.25);
        bodyPart.turn(TurnDirection.RIGHT, 0.125);
        bodyPart.turn(TurnDirection.LEFT, 0.25);
        bodyPart.turn(TurnDirection.RIGHT, 0.25);
        bodyPart.turn(TurnDirection.LEFT, 0.125);
        bodyPart.turn(TurnDirection.FORWARD, 0.25);
    }

    public void turnAround() {
        this.getRightShoulder().turn(TurnDirection.BACKWARD, 0.25);
        this.getLeftShoulder().turn(TurnDirection.BACKWARD, 0.25);
        this.turn(TurnDirection.LEFT, 1.0);
        this.getRightShoulder().turn(TurnDirection.FORWARD, 0.25);
        this.getLeftShoulder().turn(TurnDirection.FORWARD, 0.25);
        this.delay(2.0);
    }

    public void hokeyPokey() {
        {
            this.hokeyPokeyVerse(this.getRightHip());
            this.hokeyPokeyVerse(this.getLeftHip());
            this.hokeyPokeyVerse(this.getRightShoulder());
            this.hokeyPokeyVerse(this.getLeftShoulder());
        }
    }
}
