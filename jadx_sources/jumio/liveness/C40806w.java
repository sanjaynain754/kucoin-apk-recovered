package jumio.liveness;

import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.ExtensionsKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.w */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40806w extends FunctionReferenceImpl implements Function1 {
    public C40806w(C40809z c40809z) {
        super(1, c40809z, C40809z.class, "finish", "finish(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LivenessDataModel p11 = (LivenessDataModel) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        C40809z c40809z = (C40809z) this.receiver;
        if (!c40809z.f90663z.getAndSet(true)) {
            c40809z.setResult(true);
            Log.m14474i("LivenessExtractionClient", "Finished image capturing");
            LogLevel logLevel = LogLevel.OFF;
            ImageData[] f14113b = p11.getF14113b();
            if (f14113b != null) {
                for (ImageData imageData : f14113b) {
                    imageData.setCameraPosition(ExtensionsKt.getCameraPosition(c40809z.getF13860r()));
                }
            }
            c40809z.publishResult((StaticModel) p11);
        }
        return Unit.INSTANCE;
    }
}
