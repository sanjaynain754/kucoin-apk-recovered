package jumio.liveness;

import com.jumio.liveness.DaClient2;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: jumio.liveness.i */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40792i extends FunctionReferenceImpl implements Function1 {
    public C40792i(C40797n c40797n) {
        super(1, c40797n, C40797n.class, "forwardToDaClient", "forwardToDaClient(J)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        DaClient2 daClient2;
        long jLongValue = ((Number) obj).longValue();
        C40797n c40797n = (C40797n) this.receiver;
        synchronized (c40797n.f90634h) {
            try {
                DaClient2 daClient3 = c40797n.f90628b;
                if (daClient3 != null && !daClient3.isClosed() && (daClient2 = c40797n.f90628b) != null) {
                    daClient2.sendNativeEvent(jLongValue);
                }
                unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }
}
