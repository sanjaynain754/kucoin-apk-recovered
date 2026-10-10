package jumio.liveness;

import com.jumio.liveness.LivenessUX;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: jumio.liveness.e */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40788e extends FunctionReferenceImpl implements Function1 {
    public C40788e(C40797n c40797n) {
        super(1, c40797n, C40797n.class, "forwardToLivenessUx", "forwardToLivenessUx(J)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        LivenessUX livenessUX;
        long jLongValue = ((Number) obj).longValue();
        C40797n c40797n = (C40797n) this.receiver;
        synchronized (c40797n.f90635i) {
            try {
                LivenessUX livenessUX2 = c40797n.f90629c;
                if (livenessUX2 != null && !livenessUX2.isClosed() && (livenessUX = c40797n.f90629c) != null) {
                    livenessUX.onReceiveNativeEvent(jLongValue);
                }
                unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }
}
