package jumio.liveness;

import com.jumio.liveness.DaClient2;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.j */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40793j extends FunctionReferenceImpl implements Function1 {
    public C40793j(C40797n c40797n) {
        super(1, c40797n, C40797n.class, "handleLivenessUxEvent", "handleLivenessUxEvent(Lcom/jumio/liveness/DaClient2$Event;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DaClient2.Event p11 = (DaClient2.Event) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        C40797n.m89286a((C40797n) this.receiver, p11);
        return Unit.INSTANCE;
    }
}
