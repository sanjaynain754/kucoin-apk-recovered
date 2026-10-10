package jumio.liveness;

import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.liveness.DaClient;
import com.jumio.liveness.DaClient2;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.f */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40789f extends FunctionReferenceImpl implements Function1 {
    public C40789f(C40797n c40797n) {
        super(1, c40797n, C40797n.class, "handleDaClientEvent", "handleDaClientEvent(Lcom/jumio/liveness/DaClient2$Event;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DaClient2.Event p11 = (DaClient2.Event) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        C40797n c40797n = (C40797n) this.receiver;
        c40797n.getClass();
        String name = p11.getName();
        if (Intrinsics.areEqual(name, DaClient.EVENT_SERVER_DATA_BLOB)) {
            C41696j.m91104d(c40797n.f90627a.getIoScope(), null, null, new C40791h(c40797n, p11, null), 3, null);
        } else if (Intrinsics.areEqual(name, DaClient.EVENT_POSE)) {
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
        }
        return Unit.INSTANCE;
    }
}
