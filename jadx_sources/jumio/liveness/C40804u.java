package jumio.liveness;

import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: jumio.liveness.u */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40804u extends FunctionReferenceImpl implements Function0 {
    public C40804u(C40809z c40809z) {
        super(0, c40809z, C40809z.class, "dumpDebugFrame", "dumpDebugFrame()V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C40809z) this.receiver).f90653A.set(true);
        return Unit.INSTANCE;
    }
}
