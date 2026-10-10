package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.Packet;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_JpegBytes2Disk_In extends JpegBytes2Disk.AbstractC0963In {
    private final ImageCapture.OutputFileOptions outputFileOptions;
    private final Packet<byte[]> packet;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JpegBytes2Disk.AbstractC0963In) {
            JpegBytes2Disk.AbstractC0963In abstractC0963In = (JpegBytes2Disk.AbstractC0963In) obj;
            if (this.packet.equals(abstractC0963In.getPacket()) && this.outputFileOptions.equals(abstractC0963In.getOutputFileOptions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.AbstractC0963In
    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.AbstractC0963In
    public Packet<byte[]> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.outputFileOptions.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.packet + ", outputFileOptions=" + this.outputFileOptions + "}";
    }

    public AutoValue_JpegBytes2Disk_In(Packet<byte[]> packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet != null) {
            this.packet = packet;
            if (outputFileOptions != null) {
                this.outputFileOptions = outputFileOptions;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }
}
