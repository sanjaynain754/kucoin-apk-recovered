package androidx.camera.core.processing;

import androidx.camera.core.processing.util.OutConfig;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.AbstractC1107In {
    private final List<OutConfig> outConfigs;
    private final SurfaceEdge surfaceEdge;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceProcessorNode.AbstractC1107In) {
            SurfaceProcessorNode.AbstractC1107In abstractC1107In = (SurfaceProcessorNode.AbstractC1107In) obj;
            if (this.surfaceEdge.equals(abstractC1107In.getSurfaceEdge()) && this.outConfigs.equals(abstractC1107In.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC1107In
    public List<OutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC1107In
    public SurfaceEdge getSurfaceEdge() {
        return this.surfaceEdge;
    }

    public int hashCode() {
        return ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.outConfigs.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.surfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List<OutConfig> list) {
        if (surfaceEdge != null) {
            this.surfaceEdge = surfaceEdge;
            if (list != null) {
                this.outConfigs = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }
}
