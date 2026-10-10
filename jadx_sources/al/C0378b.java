package al;

import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: al.b */
/* JADX INFO: compiled from: AppRouterIssue.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "isRouterNotFound", "", "isRouterQRNotFound", "isQRStackTrace", "categoryMessage", "msg", "ROUTER_NOT_FOUND", "", "ROUTER_PROTOCOL_EXCEPTION", "techEvent", "code", "LAppRouter_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppRouterIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,109:1\n15#2,2:110\n12637#3,2:112\n*S KotlinDebug\n*F\n+ 1 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n*L\n49#1:110,2\n95#1:112,2\n*E\n"})
public final class C0378b {
    /* JADX INFO: renamed from: g */
    public static final void m1484g(int i11) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_ROUTER, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1481d(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) "com.kubi.qrcode", false, 2, (Object) null)) {
                return true;
            }
        }
        Throwable cause = th2.getCause();
        if (cause == null || !m1481d(cause)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1482e(Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            return false;
        }
        return StringsKt.startsWith$default(message, "未找到对应路由", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1483f(Throwable th2) {
        if (m1482e(th2)) {
            return m1481d(th2);
        }
        return false;
    }
}
