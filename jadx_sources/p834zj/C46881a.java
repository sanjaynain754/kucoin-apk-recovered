package p834zj;

import com.kubi.host.exception.EventCode;
import com.kubi.host.exception.HostIssueException;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zj.a */
/* JADX INFO: compiled from: HostIssueException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", "e", "", "source", "", "b", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lcom/kubi/host/exception/EventCode;", "code", "c", "(Lcom/kubi/host/exception/EventCode;)V", "Host_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46881a {
    /* JADX INFO: renamed from: b */
    public static final void m103216b(Throwable th2, String str) {
        C43846g.m96568c(new HostIssueException(th2, str, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m103217c(@NotNull EventCode code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C43847h.m96575d(KunlunTechEventEnum.CATE_HOST, code.ordinal());
    }
}
