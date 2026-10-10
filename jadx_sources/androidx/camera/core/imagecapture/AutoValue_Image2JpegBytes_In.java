package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Packet;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_Image2JpegBytes_In extends Image2JpegBytes.AbstractC0962In {
    private final int jpegQuality;
    private final Packet<ImageProxy> packet;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Image2JpegBytes.AbstractC0962In) {
            Image2JpegBytes.AbstractC0962In abstractC0962In = (Image2JpegBytes.AbstractC0962In) obj;
            if (this.packet.equals(abstractC0962In.getPacket()) && this.jpegQuality == abstractC0962In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0962In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0962In
    public Packet<ImageProxy> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }

    public AutoValue_Image2JpegBytes_In(Packet<ImageProxy> packet, int i11) {
        if (packet != null) {
            this.packet = packet;
            this.jpegQuality = i11;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
