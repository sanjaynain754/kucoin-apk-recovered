package com.trtc.uikit.livekit.p180kc.interceptor;

import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27041f;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.uikit.livekit.p180kc.helper.LiveRemoteConfigHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LiveFlutterRouteToRnInterceptor.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tH\u0002J$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/interceptor/LiveFlutterRouteToRnInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "buildRnRoute", "", "routePath", "routeParam", "uri", "Landroid/net/Uri;", "extractRoutePath", "collectExtraQueryParams", "", "parseQueryString", SearchIntents.EXTRA_QUERY, "shouldCollectQueryParam", "key", "appendQueryParams", "baseRoute", ReportDataTable.COLUMN_PARAMS, "mapFlutterRouteToRn", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveFlutterRouteToRnInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveFlutterRouteToRnInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveFlutterRouteToRnInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1869#2,2:112\n1869#2,2:114\n*S KotlinDebug\n*F\n+ 1 LiveFlutterRouteToRnInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveFlutterRouteToRnInterceptor\n*L\n57#1:112,2\n69#1:114,2\n*E\n"})
public final class LiveFlutterRouteToRnInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f79165a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f79166b = CollectionsKt.listOf((Object[]) new String[]{"live/request", "live/list", "live/report"});

    /* JADX INFO: compiled from: LiveFlutterRouteToRnInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/interceptor/LiveFlutterRouteToRnInterceptor$Companion;", "", "<init>", "()V", "flutterRoutes", "", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m81523c(String str, Map<String, String> map) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "&route=", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str;
        }
        int i11 = iIndexOf$default + 7;
        String strSubstring = str.substring(i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (map.isEmpty()) {
            return str;
        }
        String strEncode = Uri.encode(strSubstring + '?' + CollectionsKt.joinToString$default(map.entrySet(), "&", null, null, 0, null, new Function1() { // from class: com.trtc.uikit.livekit.kc.interceptor.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveFlutterRouteToRnInterceptor.m81522d((Map.Entry) obj);
            }
        }, 30, null));
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        sb2.append(strEncode);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public final String m81526g(String str) {
        return StringsKt.trimStart(StringsKt.substringBefore$default(str, "?", (String) null, 2, (Object) null), '/');
    }

    /* JADX INFO: renamed from: d */
    public static final CharSequence m81522d(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((String) it.getKey()) + '=' + ((String) it.getValue());
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (LiveRemoteConfigHelper.f79162a.m81519a() && Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER)) {
            String strM66668h = C27041f.m66668h(postcard.getUri().getQueryParameter("route"));
            String strM81526g = m81526g(strM66668h);
            if (f79166b.contains(strM81526g)) {
                Router.f46192a.m56184f(m81524e(strM81526g, strM66668h, postcard.getUri())).m4048k();
                return true;
            }
        }
        return chain.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m81525f(String str, Uri uri) {
        String queryParameter;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strSubstringAfter = StringsKt.substringAfter(str, "?", "");
        if (strSubstringAfter.length() > 0) {
            linkedHashMap.putAll(m81528i(strSubstringAfter));
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str2 : queryParameterNames) {
            Intrinsics.checkNotNull(str2);
            if (m81529j(str2) && (queryParameter = uri.getQueryParameter(str2)) != null) {
                linkedHashMap.put(str2, queryParameter);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, String> m81528i(String str) {
        int iIndexOf$default;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null)) {
            if (str2.length() != 0 && (iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, "=", 0, false, 6, (Object) null)) != -1) {
                String strSubstring = str2.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (m81529j(strSubstring)) {
                    linkedHashMap.put(strSubstring, strSubstring2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m81529j(String str) {
        return (Intrinsics.areEqual(str, "route") || Intrinsics.areEqual(str, "needLogin")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final String m81524e(String str, String str2, Uri uri) {
        return m81523c(m81527h(str), m81525f(str2, uri));
    }

    /* JADX INFO: renamed from: h */
    public final String m81527h(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1119931284) {
            if (iHashCode != -728898633) {
                if (iHashCode == 964428769 && str.equals("live/list")) {
                    return "krn/router?biz=live&entry=main&component=live_rn_app&route=LiveListPage";
                }
            } else if (str.equals("live/report")) {
                return "krn/router?biz=live&entry=main&component=live_rn_app&needLogin=true&route=LiveReportPage";
            }
        } else if (str.equals("live/request")) {
            return "krn/router?biz=live&entry=main&component=live_rn_app&needLogin=true&route=LiveApplyPage";
        }
        return str;
    }
}
