package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends DefaultSurfaceProcessor.PendingSnapshot {
    private final CallbackToFutureAdapter.Completer<Void> completer;
    private final int jpegQuality;
    private final int rotationDegrees;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DefaultSurfaceProcessor.PendingSnapshot) {
            DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (DefaultSurfaceProcessor.PendingSnapshot) obj;
            if (this.jpegQuality == pendingSnapshot.getJpegQuality() && this.rotationDegrees == pendingSnapshot.getRotationDegrees() && this.completer.equals(pendingSnapshot.getCompleter())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public CallbackToFutureAdapter.Completer<Void> getCompleter() {
        return this.completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @IntRange(from = 0, m1553to = 100)
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @IntRange(from = 0, m1553to = 359)
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.jpegQuality ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.completer.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.jpegQuality + ", rotationDegrees=" + this.rotationDegrees + ", completer=" + this.completer + "}";
    }

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i11, int i12, CallbackToFutureAdapter.Completer<Void> completer) {
        this.jpegQuality = i11;
        this.rotationDegrees = i12;
        if (completer != null) {
            this.completer = completer;
            return;
        }
        throw new NullPointerException("Null completer");
    }
}
