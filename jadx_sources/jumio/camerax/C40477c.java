package jumio.camerax;

import androidx.camera.core.CameraEffect;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C40477c extends CameraEffect {

    /* JADX INFO: renamed from: a */
    public final C40490p f89862a;

    /* JADX INFO: renamed from: b */
    public final C40477c f89863b;

    public C40477c() {
        C40490p cameraXProcessor = new C40490p();
        C40474C errorListener = new C40474C();
        Intrinsics.checkNotNullParameter(cameraXProcessor, "cameraXProcessor");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        super(1, cameraXProcessor.getExecutor(), cameraXProcessor, errorListener);
        this.f89862a = cameraXProcessor;
        this.f89863b = this;
    }
}
