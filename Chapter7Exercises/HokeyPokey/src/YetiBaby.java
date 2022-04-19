// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.biped.YetiBabyResource;
// </editor-fold>

class YetiBaby extends Biped {

    /* Construct new YetiBaby */
    public YetiBaby(YetiBabyResource resource) {
        super(resource);
    }

    public void setYetiBabyResource(YetiBabyResource yetiBabyResource) {
        this.setJointedModelResource(yetiBabyResource);
    }
}
