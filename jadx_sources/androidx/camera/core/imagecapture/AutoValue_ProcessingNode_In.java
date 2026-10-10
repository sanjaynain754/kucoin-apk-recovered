package androidx.camera.core.imagecapture;

import androidx.camera.core.processing.Edge;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.AbstractC0964In {
    private final Edge<ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final List<Integer> outputFormats;
    private final Edge<ProcessingNode.InputPacket> postviewEdge;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessingNode.AbstractC0964In) {
            ProcessingNode.AbstractC0964In abstractC0964In = (ProcessingNode.AbstractC0964In) obj;
            if (this.edge.equals(abstractC0964In.getEdge()) && this.postviewEdge.equals(abstractC0964In.getPostviewEdge()) && this.inputFormat == abstractC0964In.getInputFormat() && this.outputFormats.equals(abstractC0964In.getOutputFormats())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0964In
    public Edge<ProcessingNode.InputPacket> getEdge() {
        return this.edge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0964In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0964In
    public List<Integer> getOutputFormats() {
        return this.outputFormats;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0964In
    public Edge<ProcessingNode.InputPacket> getPostviewEdge() {
        return this.postviewEdge;
    }

    public int hashCode() {
        return ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormats.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.edge + ", postviewEdge=" + this.postviewEdge + ", inputFormat=" + this.inputFormat + ", outputFormats=" + this.outputFormats + "}";
    }

    public AutoValue_ProcessingNode_In(Edge<ProcessingNode.InputPacket> edge, Edge<ProcessingNode.InputPacket> edge2, int i11, List<Integer> list) {
        if (edge != null) {
            this.edge = edge;
            if (edge2 != null) {
                this.postviewEdge = edge2;
                this.inputFormat = i11;
                if (list != null) {
                    this.outputFormats = list;
                    return;
                }
                throw new NullPointerException("Null outputFormats");
            }
            throw new NullPointerException("Null postviewEdge");
        }
        throw new NullPointerException("Null edge");
    }
}
