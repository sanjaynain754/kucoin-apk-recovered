package to;

import com.dianping.logan.C5458a;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import p669uo.C45282b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import so.InterfaceC44530a;
import so.InterfaceC44532c;

/* JADX INFO: renamed from: to.a */
/* JADX INFO: compiled from: DiskLogAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lto/a;", "Lso/a;", "Lso/c;", "<init>", "()V", "", "priority", "type", "", "tag", "", "d", "(IILjava/lang/String;)Z", "msg", "", "b", "(IILjava/lang/String;Ljava/lang/String;)V", "c", "(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "logMsg", "log", "(Ljava/lang/String;)V", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class C45054a implements InterfaceC44530a, InterfaceC44532c {
    @Override // so.InterfaceC44530a
    /* JADX INFO: renamed from: b */
    public void mo57205b(int priority, int type, @NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (m99651d(priority, type, tag)) {
            C5458a.m7499f(m99650c(priority, type, tag, msg), type);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m99650c(int priority, int type, @NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuffer stringBuffer = new StringBuffer();
        C45282b c45282b = C45282b.f101815a;
        stringBuffer.append(c45282b.m100084a());
        stringBuffer.append(C33627eb.f69716f);
        stringBuffer.append(c45282b.m100085b(priority));
        stringBuffer.append(C33627eb.f69716f);
        stringBuffer.append(tag);
        stringBuffer.append(": ");
        stringBuffer.append(msg);
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …msg)\n        }.toString()");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public boolean m99651d(int priority, int type, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return type >= 4 && priority > 3;
    }

    @Override // so.InterfaceC44532c
    public void log(@NotNull String logMsg) {
        Intrinsics.checkNotNullParameter(logMsg, "logMsg");
        C5458a.m7499f(logMsg, 6);
    }

    @Override // so.InterfaceC44530a
    /* JADX INFO: renamed from: a */
    public boolean mo57204a() {
        return InterfaceC44530a.a.m98543a(this);
    }
}
