package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ResizeNearestNeighborOptionsT {
    private boolean alignCorners = false;
    private boolean halfPixelCenters = false;

    public boolean getAlignCorners() {
        return this.alignCorners;
    }

    public boolean getHalfPixelCenters() {
        return this.halfPixelCenters;
    }

    public void setAlignCorners(boolean z11) {
        this.alignCorners = z11;
    }

    public void setHalfPixelCenters(boolean z11) {
        this.halfPixelCenters = z11;
    }
}
