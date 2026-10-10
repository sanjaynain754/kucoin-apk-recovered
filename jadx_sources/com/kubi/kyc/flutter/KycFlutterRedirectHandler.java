package com.kubi.kyc.flutter;

import android.net.Uri;
import com.kubi.kyc.exception.KycException;
import com.kubi.kyc.exception.KycMessage;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.transmit.KycFlutterRedirectResult;
import hn.C38234d;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kyc.flutter.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KycFlutterRedirectHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/kyc/flutter/KycFlutterRedirectHandler;", "", "<init>", "()V", "handleRedirect", "Lcom/kubi/sdk/flutter/transmit/KycFlutterRedirectResult;", "postcard", "Lcom/kubi/router/model/Postcard;", "handleRedirectInternal", "redirectToRnOrFallback", "flutterRouteValue", "", "isKycFlutterRedirectRoute", "", "buildRnRedirectRoute", "extractFlutterRouteValue", "extractRouteFromEncodedQuery", "encodedQuery", "extractFlutterRoutePath", "isUrlEncoded", "value", "safeUriDecode", "normalizeRoutePath", "path", "TAG", "QUERY_PARAM_ROUTE", "ROUTE_QUERY_PREFIX", "QUERY_PARAM_SEPARATOR", "", "ROUTE_QUERY_START", "ENCODE_FLAG", "RN_ROUTE_PARAM_PREFIX", "LOG_ROUTE_EMPTY_PREFIX", "LOG_RN_REDIRECT_FAILED_PREFIX", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycFlutterRedirectHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycFlutterRedirectHandler.kt\ncom/kubi/kyc/flutter/KycFlutterRedirectHandler\n+ 2 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n44#2,2:145\n48#2,2:147\n48#2,2:149\n44#2,2:151\n44#2,2:153\n44#2,2:156\n44#2,2:158\n1#3:155\n*S KotlinDebug\n*F\n+ 1 KycFlutterRedirectHandler.kt\ncom/kubi/kyc/flutter/KycFlutterRedirectHandler\n*L\n23#1:145,2\n38#1:147,2\n52#1:149,2\n56#1:151,2\n67#1:153,2\n93#1:156,2\n125#1:158,2\n*E\n"})
public final class KycFlutterRedirectHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KycFlutterRedirectHandler f31215a = new KycFlutterRedirectHandler();

    /* JADX INFO: renamed from: d */
    public final String m36792d(String str) {
        int iIndexOf$default;
        if (str == null || str.length() == 0 || (iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "route=", 0, false, 6, (Object) null)) < 0) {
            return null;
        }
        int i11 = iIndexOf$default + 6;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, Typography.amp, i11, false, 4, (Object) null);
        if (iIndexOf$default2 < 0) {
            String strSubstring = str.substring(i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(i11, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m36796h(String str) {
        if (StringsKt.contains$default((CharSequence) str, '%', false, 2, (Object) null)) {
            return !Intrinsics.areEqual(m36799k(str), str);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final KycFlutterRedirectResult m36798j(String str) {
        Object objM103844constructorimpl;
        KycFlutterRedirectResult kycFlutterRedirectResult;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM36789a = m36789a(str);
            C44128b.m97259c("KycFlutterRedirectHandler", "Redirecting to RN KYC route: " + strM36789a);
            if (Router.f46192a.m56184f(strM36789a).m4048k()) {
                kycFlutterRedirectResult = KycFlutterRedirectResult.REDIRECTED;
            } else {
                C43846g.m96568c(new KycMessage("rn redirect navigation failed: " + strM36789a, "KycFlutterRedirectHandler", false, 4, null), null, 2, null);
                kycFlutterRedirectResult = KycFlutterRedirectResult.FALLBACK_FLUTTER;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(kycFlutterRedirectResult);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "KycFlutterRedirectHandler", false, null, 8, null), null, 2, null);
            objM103844constructorimpl = KycFlutterRedirectResult.FALLBACK_FLUTTER;
        }
        return (KycFlutterRedirectResult) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: c */
    public final String m36791c(C4400a c4400a) {
        Object objM103844constructorimpl;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM36792d = m36792d(c4400a.getUri().getEncodedQuery());
            if (strM36792d == null || strM36792d.length() == 0) {
                strM36792d = c4400a.getUri().getQueryParameter("route");
                if (strM36792d == null) {
                    strM36792d = RouteExKt.m56284y(c4400a.getBundle(), "route");
                }
                if (strM36792d == null || strM36792d.length() <= 0) {
                    strM36792d = null;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(strM36792d);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            obj = objM103844constructorimpl;
        } else {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "KycFlutterRedirectHandler", false, null, 8, null), null, 2, null);
        }
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KycFlutterRedirectResult m36793e(@NotNull C4400a postcard) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(m36794f(postcard));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "KycFlutterRedirectHandler", false, null, 8, null), null, 2, null);
            objM103844constructorimpl = KycFlutterRedirectResult.FALLBACK_FLUTTER;
        }
        return (KycFlutterRedirectResult) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36795g(C4400a c4400a) {
        Object objM103844constructorimpl;
        boolean zAreEqual;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM36790b = m36790b(c4400a);
            if (strM36790b == null) {
                zAreEqual = false;
            } else {
                C44128b.m97259c("KycFlutterRedirectHandler", "Checking if route is KYC flutter redirect, extracted path: " + strM36790b);
                zAreEqual = Intrinsics.areEqual(m36797i(strM36790b), "kyc/redirect");
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(zAreEqual));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "KycFlutterRedirectHandler", false, null, 8, null), null, 2, null);
            objM103844constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final String m36799k(String str) {
        Object objM103844constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Uri.decode(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            obj = objM103844constructorimpl;
        } else {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "KycFlutterRedirectHandler", false, null, 8, null), null, 2, null);
            obj = str;
        }
        return (String) obj;
    }

    /* JADX INFO: renamed from: a */
    public final String m36789a(String str) {
        if (!m36796h(str)) {
            str = Uri.encode(str);
        }
        return "krn/router?biz=kyc&entry=main&component=kucoin_kyc_rn&needLogin=true&route=" + str;
    }

    /* JADX INFO: renamed from: b */
    public final String m36790b(C4400a c4400a) {
        String strM36791c = m36791c(c4400a);
        if (strM36791c == null) {
            return null;
        }
        String strM36799k = m36799k(strM36791c);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strM36799k, '?', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            String strSubstring = strM36799k.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        return strM36799k;
    }

    /* JADX INFO: renamed from: f */
    public final KycFlutterRedirectResult m36794f(C4400a c4400a) {
        if (!m36795g(c4400a)) {
            return KycFlutterRedirectResult.NOT_APPLICABLE;
        }
        if (!C38234d.f85931a.m86314h()) {
            return KycFlutterRedirectResult.NOT_APPLICABLE;
        }
        String strM36791c = m36791c(c4400a);
        C44128b.m97259c("KycFlutterRedirectHandler", "Intercepting KYC flutter redirect, extracted route: " + strM36791c);
        if (strM36791c != null && strM36791c.length() != 0) {
            return m36798j(strM36791c);
        }
        C43846g.m96568c(new KycMessage("kyc redirect route is empty, uri=" + c4400a.getUri(), "KycFlutterRedirectHandler", false, 4, null), null, 2, null);
        return KycFlutterRedirectResult.FALLBACK_FLUTTER;
    }

    /* JADX INFO: renamed from: i */
    public final String m36797i(String str) {
        return StringsKt.trim(StringsKt.trim((CharSequence) str).toString(), '/');
    }
}
