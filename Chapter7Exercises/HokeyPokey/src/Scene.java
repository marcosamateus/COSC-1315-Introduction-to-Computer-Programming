// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.biped.YetiBabyResource;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>

class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Procedures and functions for this scene */
    public void myFirstMethod() {
        this.delay(2.0);
        doTogether(() -> {
            this.playAudio(new AudioSource(Resources.HokeyPokeySong_wav));
        }, () -> {
            this.playAudio(new AudioSource(Resources.HokeyPokeySong_wav));
        }, () -> {
            this.tortoise.hokeyPokey();
        }, () -> {
            this.tortoise2.hokeyPokey();
        });
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Tortoise tortoise = new Tortoise();
    private final Tortoise tortoise2 = new Tortoise();
    private final Alien alien = new Alien();
    private final YetiBaby yetiBaby = new YetiBaby(YetiBabyResource.WITH_SCARF);
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.098017, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.tortoise.setPaint(Color.WHITE);
        this.tortoise.setOpacity(1.0);
        this.tortoise.setName("tortoise");
        this.tortoise.setVehicle(this);
        this.tortoise.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tortoise.setPositionRelativeToVehicle(new Position(0.134, 0.0, -0.237));
        this.tortoise.setScale(new Scale(1.55, 1.55, 1.55));
        this.tortoise.getSpineMiddle().setPositionRelativeToVehicle(new Position(-9.82E-17, 3.09E-17, -0.119));
        this.tortoise.getSpineUpper().setPositionRelativeToVehicle(new Position(-1.39E-16, -1.86E-16, -0.103));
        this.tortoise.getNeck().setPositionRelativeToVehicle(new Position(-1.46E-31, 7.21E-17, -0.0751));
        this.tortoise.getHead().setPositionRelativeToVehicle(new Position(-4.88E-32, 3.45E-16, -0.0394));
        this.tortoise.getMouth().setPositionRelativeToVehicle(new Position(-3.0E-17, 0.031, -0.0649));
        this.tortoise.getRightEye().setPositionRelativeToVehicle(new Position(0.0728, 0.0907, -0.097));
        this.tortoise.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0728, 0.0907, -0.097));
        this.tortoise.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0728, 0.0907, -0.097));
        this.tortoise.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0728, 0.0907, -0.097));
        this.tortoise.getRightHip().setPositionRelativeToVehicle(new Position(0.0575, 0.00107, -0.122));
        this.tortoise.getRightKnee().setPositionRelativeToVehicle(new Position(-4.12E-17, 3.87E-16, -0.145));
        this.tortoise.getRightAnkle().setPositionRelativeToVehicle(new Position(2.75E-17, 4.98E-17, -0.152));
        this.tortoise.getRightFoot().setPositionRelativeToVehicle(new Position(-2.75E-17, 1.1E-16, -0.168));
        this.tortoise.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0575, 0.00107, -0.122));
        this.tortoise.getLeftKnee().setPositionRelativeToVehicle(new Position(6.46E-16, -1.23E-16, -0.145));
        this.tortoise.getLeftAnkle().setPositionRelativeToVehicle(new Position(6.12E-16, -1.75E-16, -0.152));
        this.tortoise.getLeftFoot().setPositionRelativeToVehicle(new Position(9.17E-13, 0.0, -0.168));
        this.tortoise.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0176, -0.0439, -0.0431));
        this.tortoise.getRightShoulder().setPositionRelativeToVehicle(new Position(4.81E-17, 1.73E-12, -0.0713));
        this.tortoise.getRightElbow().setPositionRelativeToVehicle(new Position(-1.84E-17, -2.78E-14, -0.134));
        this.tortoise.getRightWrist().setPositionRelativeToVehicle(new Position(-5.71E-17, 3.3E-16, -0.104));
        this.tortoise.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0176, -0.0439, -0.0431));
        this.tortoise.getLeftShoulder().setPositionRelativeToVehicle(new Position(3.44E-17, 2.2E-16, -0.0713));
        this.tortoise.getLeftElbow().setPositionRelativeToVehicle(new Position(-1.13E-16, -2.09E-15, -0.134));
        this.tortoise.getLeftWrist().setPositionRelativeToVehicle(new Position(-6.87E-17, 3.3E-16, -0.104));
        this.tortoise2.setPaint(Color.WHITE);
        this.tortoise2.setOpacity(1.0);
        this.tortoise2.setName("tortoise2");
        this.tortoise2.setVehicle(this);
        this.tortoise2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tortoise2.setPositionRelativeToVehicle(new Position(-0.938, 0.0, -0.263));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(1.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.alien.setPositionRelativeToVehicle(new Position(2.96, 0.0, 3.57));
        this.yetiBaby.setPaint(Color.WHITE);
        this.yetiBaby.setOpacity(1.0);
        this.yetiBaby.setName("yetiBaby");
        this.yetiBaby.setVehicle(this);
        this.yetiBaby.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.yetiBaby.setPositionRelativeToVehicle(new Position(-3.01, 0.0, 2.72));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Procedures and functions to handle multiple scenes */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Tortoise getTortoise() {
        return this.tortoise;
    }

    public Tortoise getTortoise2() {
        return this.tortoise2;
    }

    public Alien getAlien() {
        return this.alien;
    }

    public YetiBaby getYetiBaby() {
        return this.yetiBaby;
    }
    // </editor-fold>
}
