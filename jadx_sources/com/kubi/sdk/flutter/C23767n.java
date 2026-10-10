package com.kubi.sdk.flutter;

import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.router.utils.RouteExKt;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.n */
/* JADX INFO: compiled from: FlutterEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\t\u001a\u00020\u0005\u001a\u0006\u0010\n\u001a\u00020\u0005\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\rH\u0080\b¢\u0006\u0002\u0010\u000e\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u000f\u001a\u0012\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"toFlutterRoute", "", "needLogin", "", "jumpFlutter", "", "jumpFlutterSearch", "searchHint", "from", "jumpHomeFeedTabEdit", "jumpToRequestLive", "transmitGet", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/flutter/transmit/ITransmit;", "()Lcom/kubi/sdk/flutter/transmit/ITransmit;", "Lcom/kubi/router/model/Postcard;", "appendQuery", "toNativeRoute", "toQueryParams", "bundle", "Landroid/os/Bundle;", "KC_FLUTTER_CALLBACK_ID", "LFlutter_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C23767n {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56878b(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        m56877a(str, z11);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m56884h(C4400a c4400a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m56882f(c4400a, z11);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m56885i(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m56883g(str, z11);
    }

    @Deprecated(message = "use KCFlutterRouteManager", replaceWith = @ReplaceWith(expression = "KCFlutterRouteManager.open(this, needLogin)", imports = {}))
    /* JADX INFO: renamed from: a */
    public static final void m56877a(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        RouteExKt.m56217H(m56883g(str, z11));
    }

    /* JADX INFO: renamed from: c */
    public static final void m56879c(@NotNull String searchHint, @NotNull String from) {
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(from, "from");
        String strEncode = Uri.encode(searchHint);
        String strEncode2 = Uri.encode(from);
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/search?placeholder=" + strEncode + "&from=" + strEncode2, false, null, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m56880d() {
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "home/feed/tabEdit", false, null, 6, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m56881e() {
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "live/request", false, null, 6, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m56882f(@NotNull C4400a c4400a, boolean z11) {
        Intrinsics.checkNotNullParameter(c4400a, "<this>");
        if (!Intrinsics.areEqual(RouteExKt.m56216G(c4400a.getUri()), ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER)) {
            C44128b.m97260d("Postcard.toFlutterRoute error: not flutter route, uri=" + c4400a.getUri());
            String string = c4400a.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String queryParameter = c4400a.getUri().getQueryParameter("route");
        if (queryParameter == null) {
            queryParameter = RouteExKt.m56284y(c4400a.getBundle(), "route");
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            C44128b.m97260d("Postcard.toFlutterRoute error: route is null or empty, uri=" + c4400a.getUri());
            String string2 = c4400a.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        Bundle bundleM56242d = RouteExKt.m56242d(c4400a.getBundle(), c4400a.getUri());
        bundleM56242d.remove("route");
        bundleM56242d.remove("needLogin");
        bundleM56242d.remove("kcFlutterCallbackId");
        String strM56886j = m56886j(bundleM56242d);
        if (!z11 || strM56886j.length() <= 0) {
            return queryParameter;
        }
        if (StringsKt.contains$default((CharSequence) queryParameter, (CharSequence) "?", false, 2, (Object) null)) {
            return queryParameter + Typography.amp + strM56886j;
        }
        return queryParameter + '?' + strM56886j;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m56883g(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "flutter?route=" + Uri.encode(str) + "&needLogin=" + z11;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m56886j(@Nullable Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb2.append(next);
            sb2.append("=");
            String strM56239b0 = RouteExKt.m56239b0(bundle, next);
            if (strM56239b0 == null) {
                strM56239b0 = "";
            }
            sb2.append(Uri.encode(strM56239b0));
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
