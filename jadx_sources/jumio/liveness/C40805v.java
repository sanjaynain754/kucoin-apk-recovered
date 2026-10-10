package jumio.liveness;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.sdk.enums.JumioFallbackReason;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: jumio.liveness.v */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40805v extends FunctionReferenceImpl implements Function1 {
    public C40805v(Object obj) {
        super(1, obj, C40809z.class, "onLivenessError", "onLivenessError(Ljava/lang/Exception;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Exception p11 = (Exception) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        C40809z c40809z = (C40809z) this.receiver;
        c40809z.getClass();
        Log.m14469e("LivenessExtractionClient", "Liveness error: " + Reflection.getOrCreateKotlinClass(p11.getClass()).getSimpleName() + " | " + p11.getMessage());
        Log.printStackTrace(p11);
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("message", p11.getMessage());
        Analytics.INSTANCE.add(MobileEvents.misc("livenessError", metaInfo));
        c40809z.triggerFallback(JumioFallbackReason.SCANNING_ERROR);
        return Unit.INSTANCE;
    }
}
