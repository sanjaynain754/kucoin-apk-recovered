package jumio.liveness;

import com.jumio.commons.log.Log;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.LivenessUX;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C40781J implements LivenessUX.EventHandler {

    /* JADX INFO: renamed from: a */
    public final C40792i f90594a;

    /* JADX INFO: renamed from: b */
    public final C40793j f90595b;

    public C40781J(C40792i forwardToDaClient, C40793j handleEvent) {
        Intrinsics.checkNotNullParameter(forwardToDaClient, "forwardToDaClient");
        Intrinsics.checkNotNullParameter(handleEvent, "handleEvent");
        this.f90594a = forwardToDaClient;
        this.f90595b = handleEvent;
    }

    @Override // com.jumio.liveness.LivenessUX.EventHandler
    public final void onReceiveEvent(DaClient2.EventView event) {
        Intrinsics.checkNotNullParameter(event, "event");
        DaClient2.Event eventCopy = event.copy();
        Log.logThreadInfoWithMessage$default(Log.INSTANCE, "onReceiveEvent: " + eventCopy, "DefaultDaClient", null, 4, null);
        this.f90595b.invoke(eventCopy);
    }

    @Override // com.jumio.liveness.LivenessUX.EventHandler
    public final void onReceiveEventForForwarding(long j11) {
        this.f90594a.invoke(Long.valueOf(j11));
    }
}
