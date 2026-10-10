package jumio.liveness;

import com.jumio.liveness.DaClient2;
import com.jumio.liveness.DelegateCameraData;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.q */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40800q extends FunctionReferenceImpl implements Function1 {
    public C40800q(DelegateCameraData delegateCameraData) {
        super(1, delegateCameraData, DelegateCameraData.class, "handleEvent", "handleEvent(Lcom/jumio/liveness/DaClient2$Event;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DaClient2.Event p11 = (DaClient2.Event) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        DelegateCameraData.access$handleEvent((DelegateCameraData) this.receiver, p11);
        return Unit.INSTANCE;
    }
}
