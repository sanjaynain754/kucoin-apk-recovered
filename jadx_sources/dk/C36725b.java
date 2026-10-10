package dk;

import java.util.concurrent.atomic.AtomicBoolean;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dk.b */
/* JADX INFO: compiled from: HttpDnsException.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"", "code", "", "msg", "c", "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/StringBuffer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flag", "name", "", "", "b", "(Ljava/lang/StringBuffer;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Ljava/lang/Object;)V", "httpdns_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C36725b {
    /* JADX INFO: renamed from: b */
    public static final void m82301b(StringBuffer stringBuffer, AtomicBoolean atomicBoolean, String str, Object obj) {
        if (obj != null) {
            if (!atomicBoolean.compareAndSet(false, true)) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(str + " = " + obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m82302c(Integer num, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        m82301b(stringBuffer, atomicBoolean, "code", num);
        m82301b(stringBuffer, atomicBoolean, "msg", str);
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n … \"msg\", msg)\n}.toString()");
        return string;
    }
}
