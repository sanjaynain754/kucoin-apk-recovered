package jumio.core;

import com.jumio.core.scanpart.JVisionScanPart;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.Y1 */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40622Y1 extends FunctionReferenceImpl implements Function1 {
    public C40622Y1(JVisionScanPart jVisionScanPart) {
        super(1, jVisionScanPart, JVisionScanPart.class, "onEnable", "onEnable(Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC40513C1 p11 = (AbstractC40513C1) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        JVisionScanPart.access$onEnable((JVisionScanPart) this.receiver, p11);
        return Unit.INSTANCE;
    }
}
