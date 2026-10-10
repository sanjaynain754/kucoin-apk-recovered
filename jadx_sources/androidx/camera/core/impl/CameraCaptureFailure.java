package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes23.dex */
public class CameraCaptureFailure {
    private final Reason mReason;

    public enum Reason {
        ERROR
    }

    public Object getCaptureFailure() {
        return null;
    }

    public Reason getReason() {
        return this.mReason;
    }

    public CameraCaptureFailure(Reason reason) {
        this.mReason = reason;
    }
}
