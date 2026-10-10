package al;

import com.kubi.kucoin.exception.AppRouterException;
import com.kubi.sdk.protocol.ProtocolException;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: al.a */
/* JADX INFO: compiled from: AppRouterIssue.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 176)
@SourceDebugExtension({"SMAP\nAppRouterIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt$categoryException$1\n*L\n1#1,109:1\n*E\n"})
public final class RunnableC0377a implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f1121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1122c;

    public RunnableC0377a(Throwable th2, String str) {
        this.f1121b = th2;
        this.f1122c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0378b.m1482e(this.f1121b)) {
            if (C0378b.m1483f(this.f1121b)) {
                return;
            } else {
                C0378b.m1484g(1);
            }
        } else if (this.f1121b instanceof ProtocolException) {
            C0378b.m1484g(2);
        }
        C43846g.m96568c(new AppRouterException(this.f1121b, this.f1122c, false, null, 8, null), null, 2, null);
    }
}
