package jumio.camerax;

import com.jumio.camerax.CameraXManager;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: jumio.camerax.n */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40488n extends FunctionReferenceImpl implements Function2 {
    public C40488n(CameraXManager cameraXManager) {
        super(2, cameraXManager, CameraXManager.class, "requestFocus", "requestFocus(II)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((CameraXManager) this.receiver).requestFocus(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }
}
