package p677ux;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.route.config.issue.RouteConfigException;
import com.kubi.route.config.model.RouteEntry;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.util.pattern.C43316f;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import vh0.InterfaceC45553b;
import zh0.C46879e;

/* JADX INFO: renamed from: ux.b */
/* JADX INFO: compiled from: RoutePathUtils.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\nJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\nJ%\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0015\u0010\fJ%\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lux/b;", "", "<init>", "()V", "", "externalUrl", "", "Lcom/kubi/route/config/model/RouteEntry;", "routeMap", "i", "(Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/route/config/model/RouteEntry;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Ljava/util/Map;", "f", "externalUrlStr", "g", "routeQuery", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/route/config/model/RouteEntry;Ljava/util/Map;)Lcom/kubi/route/config/model/RouteEntry;", "c", "b", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Landroid/net/Uri;", "e", "(Landroid/net/Uri;)Ljava/util/Map;", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRoutePathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutePathUtils.kt\ncom/kubi/route/config/utils/RoutePathUtils\n+ 2 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n44#2,2:276\n44#2,2:279\n44#2,2:282\n44#2,2:284\n29#3:278\n29#3:281\n29#3:286\n478#4,7:287\n215#5,2:294\n215#5,2:296\n1603#6,9:298\n1855#6:307\n1856#6:309\n1612#6:310\n1#7:308\n*S KotlinDebug\n*F\n+ 1 RoutePathUtils.kt\ncom/kubi/route/config/utils/RoutePathUtils\n*L\n48#1:276,2\n80#1:279,2\n110#1:282,2\n172#1:284,2\n61#1:278\n93#1:281\n209#1:286\n217#1:287,7\n233#1:294,2\n247#1:296,2\n264#1:298,9\n264#1:307\n264#1:309\n264#1:310\n264#1:308\n*E\n"})
public final class C45324b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45324b f101918a = new C45324b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final RouteEntry m100194a(@NotNull RouteEntry routeEntry, @NotNull Map<String, String> routeQuery) {
        String strM100195b;
        Intrinsics.checkNotNullParameter(routeEntry, "<this>");
        Intrinsics.checkNotNullParameter(routeQuery, "routeQuery");
        String fallback = routeEntry.getFallback();
        if (fallback != null && fallback.length() != 0) {
            routeQuery = MapsKt.plus(routeQuery, MapsKt.mapOf(TuplesKt.m90091to("backup", URLEncoder.encode(routeEntry.getFallback(), StandardCharsets.UTF_8.name()))));
        }
        String path = routeEntry.getPath();
        return new RouteEntry((path == null || (strM100195b = m100195b(path, routeQuery)) == null) ? null : m100196c(strM100195b), routeEntry.getBiz(), routeEntry.getMode(), routeEntry.getSiteTypeList(), routeEntry.getFallback());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m100195b(@NotNull String str, @NotNull Map<String, String> routeQuery) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(routeQuery, "routeQuery");
        Iterator<Map.Entry<String, String>> it = routeQuery.entrySet().iterator();
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ('{' + key + '}'), false, 2, (Object) null)) {
                str = StringsKt.replace$default(str2, '{' + key + '}', value, false, 4, (Object) null);
            } else {
                str = str2 + (StringsKt.contains$default((CharSequence) str2, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?") + key + '=' + value;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m100196c(@NotNull String str) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!Intrinsics.areEqual(m100201h(str), "krn/router")) {
            return str;
        }
        Uri uri = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        Map<String, String> mapM100198e = m100198e(uri);
        String str2 = mapM100198e.get("route");
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapM100198e.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "route")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Charset charset = StandardCharsets.UTF_8;
        String strEncode = URLEncoder.encode(m100195b(URLDecoder.decode(str2, charset.name()), linkedHashMap), charset.name());
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        builderClearQuery.appendQueryParameter("route", strEncode);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        String string = builderClearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, String> m100197d(@NotNull String externalUrl) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        try {
            Uri uri = Uri.parse(externalUrl);
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
            if (uri.getScheme() == null) {
                C44128b.m97261e("RoutePathUtils", "getExternalQueryByUrl error: scheme is null");
                return MapsKt.emptyMap();
            }
            if (Intrinsics.areEqual(uri.getScheme(), "kucoin")) {
                return m100198e(uri);
            }
            return Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS) ? m100198e(uri) : MapsKt.emptyMap();
        } catch (Exception e11) {
            C44128b.m97261e("RoutePathUtils", "getExternalQueryByUrl error: " + e11);
            C43846g.m96568c(new RouteConfigException(e11, "RoutePathUtils", false, null, 8, null), null, 2, null);
            return MapsKt.emptyMap();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, String> m100198e(@NotNull Uri uri) {
        Pair pairM90091to;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return MapsKt.emptyMap();
        }
        List<String> listSplit$default = StringsKt.split$default((CharSequence) encodedQuery, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String str : listSplit$default) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "=", 0, false, 6, (Object) null);
            if (iIndexOf$default >= 0) {
                String strTake = StringsKt.take(str, iIndexOf$default);
                String strSubstring = str.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                pairM90091to = TuplesKt.m90091to(strTake, strSubstring);
            } else {
                pairM90091to = null;
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final RouteEntry m100199f(@NotNull String externalUrl, @Nullable Map<String, RouteEntry> routeMap) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        String strM100201h = m100201h(externalUrl);
        if (strM100201h == null) {
            return null;
        }
        RouteEntry routeEntry = routeMap != null ? routeMap.get(strM100201h) : null;
        if (routeEntry != null) {
            return m100194a(routeEntry, m100197d(externalUrl));
        }
        C44128b.m97266j("RoutePathUtils", "getRouteEntryByEqual error: routeMap does not contain key " + strM100201h);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final RouteEntry m100200g(@NotNull String externalUrlStr, @Nullable Map<String, RouteEntry> routeMap) {
        Map<String, String> mapPlus;
        Intrinsics.checkNotNullParameter(externalUrlStr, "externalUrlStr");
        String strM100201h = m100201h(externalUrlStr);
        if (strM100201h == null) {
            return null;
        }
        if (routeMap == null) {
            routeMap = MapsKt.emptyMap();
        }
        for (Map.Entry<String, RouteEntry> entry : routeMap.entrySet()) {
            String key = entry.getKey();
            RouteEntry value = entry.getValue();
            try {
                if (StringsKt.contains$default((CharSequence) key, (CharSequence) "{", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) key, (CharSequence) "}", false, 2, (Object) null)) {
                    C43316f c43316fM103211d = new C46879e().m103211d(key);
                    if (c43316fM103211d.m95347m(InterfaceC45553b.m100603b(strM100201h))) {
                        C43316f.b bVarM95346l = c43316fM103211d.m95346l(InterfaceC45553b.m100603b(strM100201h));
                        if (bVarM95346l == null) {
                            mapPlus = m100197d(externalUrlStr);
                        } else {
                            Map<String, String> mapM100197d = m100197d(externalUrlStr);
                            Map<String, String> mapM95355b = bVarM95346l.m95355b();
                            Intrinsics.checkNotNullExpressionValue(mapM95355b, "getUriVariables(...)");
                            mapPlus = MapsKt.plus(mapM100197d, mapM95355b);
                        }
                        return m100194a(value, mapPlus);
                    }
                    continue;
                }
            } catch (Exception e11) {
                C44128b.m97261e("RoutePathUtils", "getRouteEntryByRegex error: invalid regex pattern " + key + ", exception: " + e11);
                C43846g.m96568c(new RouteConfigException(e11, "RoutePathUtils", false, null, 8, null), null, 2, null);
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m100201h(@NotNull String externalUrl) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        try {
            Uri uri = Uri.parse(externalUrl);
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
            if (uri.getScheme() == null) {
                C44128b.m97261e("RoutePathUtils", "getRoutePathByUrl error: scheme is null");
                return null;
            }
            if (!Intrinsics.areEqual(uri.getScheme(), "kucoin")) {
                C44128b.m97261e("RoutePathUtils", "getRoutePathByUrl getRoutePathByUrl no https");
                C44128b.m97266j("RoutePathUtils", "getRoutePathByUrl error: scheme is not kucoin or https");
                return null;
            }
            return StringsKt.trimStart(uri.getAuthority() + uri.getPath(), '/');
        } catch (Exception e11) {
            C44128b.m97261e("RoutePathUtils", "getRoutePathByUrl error: " + e11);
            C43846g.m96568c(new RouteConfigException(e11, "RoutePathUtils", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final RouteEntry m100202i(@NotNull String externalUrl, @Nullable Map<String, RouteEntry> routeMap) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        try {
            if (externalUrl.length() != 0 && routeMap != null) {
                RouteEntry routeEntryM100199f = m100199f(externalUrl, routeMap);
                if (routeEntryM100199f != null) {
                    C44128b.m97266j("RoutePathUtils", "queryRouteEntry by equal success, configKey: " + externalUrl + ", routeEntry: " + routeEntryM100199f);
                    return routeEntryM100199f;
                }
                RouteEntry routeEntryM100200g = m100200g(externalUrl, routeMap);
                if (routeEntryM100200g != null) {
                    C44128b.m97266j("RoutePathUtils", "queryRouteEntry by regex success, configKey: " + externalUrl + ", routeEntry: " + routeEntryM100200g);
                    return routeEntryM100200g;
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("RoutePathUtils", "queryRouteEntry error: " + e11);
            C43846g.m96568c(new RouteConfigException(e11, "RoutePathUtils", false, null, 8, null), null, 2, null);
        }
    }
}
