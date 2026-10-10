package jumio.liveness;

import com.jumio.commons.log.Log;
import com.jumio.liveness.DaClient2;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.c */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40786c {
    /* JADX INFO: renamed from: a */
    public static final void m89283a(DaClient2 daClient2, String event, Pair[] attributes, long j11) {
        Intrinsics.checkNotNullParameter(daClient2, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        try {
            if (daClient2.isClosed()) {
                return;
            }
            daClient2.sendEvent(new DaClient2.Event(event, j11, attributes));
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }
}
