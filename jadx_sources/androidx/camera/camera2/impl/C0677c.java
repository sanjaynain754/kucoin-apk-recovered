package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.camera2.impl.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C0677c {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SessionConfiguration m1632a(int i11, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i11, list, executor, stateCallback);
    }
}
