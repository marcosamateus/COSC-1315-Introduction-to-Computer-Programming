// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.prop.WonderlandTreeResource;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;
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
        while (this.water.getWidth() > 0.1) {
            this.water.setWidth(this.water.getWidth() - 0.1);
        }
        this.tree.setHeight(this.tree.getHeight() + 0.1);
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Disc water = new Disc();
    private final WonderlandTree tree = new WonderlandTree(WonderlandTreeResource.DEFAULT);
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.996401, 0.0847628, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(0.903, 1.88, -9.01));
        this.water.setRadius(1.5681);
        this.water.setPaint(Color.CYAN);
        this.water.setOpacity(1.0);
        this.water.setName("water");
        this.water.setVehicle(this);
        this.water.setOrientationRelativeToVehicle(new Orientation(0.0, 0.149668, 0.0, 0.988736));
        this.water.setPositionRelativeToVehicle(new Position(0.0, 0.01, 0.0));
        this.tree.setPaint(Color.WHITE);
        this.tree.setOpacity(1.0);
        this.tree.setName("tree");
        this.tree.setVehicle(this);
        this.tree.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tree.setPositionRelativeToVehicle(new Position(-0.177, 0.0, 1.66));
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

    public Disc getWater() {
        return this.water;
    }

    public WonderlandTree getTree() {
        return this.tree;
    }
    // </editor-fold>
}
