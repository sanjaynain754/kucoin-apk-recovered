package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.processing.Packet;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.AbstractC0957In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bitmap2JpegBytes.AbstractC0957In) {
            Bitmap2JpegBytes.AbstractC0957In abstractC0957In = (Bitmap2JpegBytes.AbstractC0957In) obj;
            if (this.packet.equals(abstractC0957In.getPacket()) && this.jpegQuality == abstractC0957In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0957In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0957In
    public Packet<Bitmap> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }

    public AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i11) {
        if (packet != null) {
            this.packet = packet;
            this.jpegQuality = i11;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
