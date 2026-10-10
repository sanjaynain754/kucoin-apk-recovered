package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.processing.Edge;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.AbstractC0960In {
    private final Edge<TakePictureManager.CaptureError> errorEdge;
    private final ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final List<Integer> outputFormats;
    private final PostviewSettings postviewSettings;
    private final Edge<ProcessingRequest> requestEdge;
    private final Size size;
    private final boolean virtualCamera;

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        PostviewSettings postviewSettings;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptureNode.AbstractC0960In) {
            CaptureNode.AbstractC0960In abstractC0960In = (CaptureNode.AbstractC0960In) obj;
            if (this.size.equals(abstractC0960In.getSize()) && this.inputFormat == abstractC0960In.getInputFormat() && this.outputFormats.equals(abstractC0960In.getOutputFormats()) && this.virtualCamera == abstractC0960In.isVirtualCamera() && ((imageReaderProxyProvider = this.imageReaderProxyProvider) != null ? imageReaderProxyProvider.equals(abstractC0960In.getImageReaderProxyProvider()) : abstractC0960In.getImageReaderProxyProvider() == null) && ((postviewSettings = this.postviewSettings) != null ? postviewSettings.equals(abstractC0960In.getPostviewSettings()) : abstractC0960In.getPostviewSettings() == null) && this.requestEdge.equals(abstractC0960In.getRequestEdge()) && this.errorEdge.equals(abstractC0960In.getErrorEdge())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public Edge<TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public List<Integer> getOutputFormats() {
        return this.outputFormats;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public PostviewSettings getPostviewSettings() {
        return this.postviewSettings;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public Edge<ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = (((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormats.hashCode()) * 1000003) ^ (this.virtualCamera ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        PostviewSettings postviewSettings = this.postviewSettings;
        return ((((iHashCode2 ^ (postviewSettings != null ? postviewSettings.hashCode() : 0)) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0960In
    public boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    public String toString() {
        return "In{size=" + this.size + ", inputFormat=" + this.inputFormat + ", outputFormats=" + this.outputFormats + ", virtualCamera=" + this.virtualCamera + ", imageReaderProxyProvider=" + this.imageReaderProxyProvider + ", postviewSettings=" + this.postviewSettings + ", requestEdge=" + this.requestEdge + ", errorEdge=" + this.errorEdge + "}";
    }

    public AutoValue_CaptureNode_In(Size size, int i11, List<Integer> list, boolean z11, ImageReaderProxyProvider imageReaderProxyProvider, PostviewSettings postviewSettings, Edge<ProcessingRequest> edge, Edge<TakePictureManager.CaptureError> edge2) {
        if (size != null) {
            this.size = size;
            this.inputFormat = i11;
            if (list != null) {
                this.outputFormats = list;
                this.virtualCamera = z11;
                this.imageReaderProxyProvider = imageReaderProxyProvider;
                this.postviewSettings = postviewSettings;
                if (edge != null) {
                    this.requestEdge = edge;
                    if (edge2 != null) {
                        this.errorEdge = edge2;
                        return;
                    }
                    throw new NullPointerException("Null errorEdge");
                }
                throw new NullPointerException("Null requestEdge");
            }
            throw new NullPointerException("Null outputFormats");
        }
        throw new NullPointerException("Null size");
    }
}
