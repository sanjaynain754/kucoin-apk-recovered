package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.SurfaceEdge;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_DualSurfaceProcessorNode_In extends DualSurfaceProcessorNode.AbstractC1115In {
    private final List<DualOutConfig> outConfigs;
    private final SurfaceEdge primarySurfaceEdge;
    private final SurfaceEdge secondarySurfaceEdge;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DualSurfaceProcessorNode.AbstractC1115In) {
            DualSurfaceProcessorNode.AbstractC1115In abstractC1115In = (DualSurfaceProcessorNode.AbstractC1115In) obj;
            if (this.primarySurfaceEdge.equals(abstractC1115In.getPrimarySurfaceEdge()) && this.secondarySurfaceEdge.equals(abstractC1115In.getSecondarySurfaceEdge()) && this.outConfigs.equals(abstractC1115In.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC1115In
    public List<DualOutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC1115In
    public SurfaceEdge getPrimarySurfaceEdge() {
        return this.primarySurfaceEdge;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC1115In
    public SurfaceEdge getSecondarySurfaceEdge() {
        return this.secondarySurfaceEdge;
    }

    public int hashCode() {
        return ((((this.primarySurfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.secondarySurfaceEdge.hashCode()) * 1000003) ^ this.outConfigs.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.primarySurfaceEdge + ", secondarySurfaceEdge=" + this.secondarySurfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }

    public AutoValue_DualSurfaceProcessorNode_In(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, List<DualOutConfig> list) {
        if (surfaceEdge != null) {
            this.primarySurfaceEdge = surfaceEdge;
            if (surfaceEdge2 != null) {
                this.secondarySurfaceEdge = surfaceEdge2;
                if (list != null) {
                    this.outConfigs = list;
                    return;
                }
                throw new NullPointerException("Null outConfigs");
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }
}
