package jumio.liveness;

import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.liveness.DaClient2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C40787d implements DaClient2.EventHandler {

    /* JADX INFO: renamed from: a */
    public final C40788e f90612a;

    /* JADX INFO: renamed from: b */
    public final C40789f f90613b;

    /* JADX INFO: renamed from: c */
    public C40800q f90614c;

    public C40787d(C40788e forwardToLivenessUx, C40789f handleEvent) {
        Intrinsics.checkNotNullParameter(forwardToLivenessUx, "forwardToLivenessUx");
        Intrinsics.checkNotNullParameter(handleEvent, "handleEvent");
        this.f90612a = forwardToLivenessUx;
        this.f90613b = handleEvent;
    }

    @Override // com.jumio.liveness.DaClient2.EventHandler
    public final void onEventForForwarding(long j11) {
        this.f90612a.invoke(Long.valueOf(j11));
    }

    @Override // com.jumio.liveness.DaClient2.EventHandler
    public final void onResponse(DaClient2.EventView eventView) {
        Intrinsics.checkNotNullParameter(eventView, "eventView");
        DaClient2.Event eventCopy = eventView.copy();
        Log.INSTANCE.logThreadInfoWithMessage("onResponse: " + eventCopy, "DefaultDaClient", LogLevel.DEBUG);
        this.f90613b.invoke(eventCopy);
        C40800q c40800q = this.f90614c;
        if (c40800q != null) {
            c40800q.invoke(eventCopy);
        }
    }
}
