// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.WonderlandTreeResource;
// </editor-fold>

class WonderlandTree extends Prop {

    /* Construct new WonderlandTree */
    public WonderlandTree(WonderlandTreeResource resource) {
        super(resource);
    }

    public void setWonderlandTreeResource(WonderlandTreeResource wonderlandTreeResource) {
        this.setJointedModelResource(wonderlandTreeResource);
    }
}
