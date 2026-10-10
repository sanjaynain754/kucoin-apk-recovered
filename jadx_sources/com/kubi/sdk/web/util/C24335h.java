package com.kubi.sdk.web.util;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.host.HostManager;
import com.kubi.sdk.pkg.util.C23989f;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.helper.C24308d;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d10.InterfaceC36593a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.h */
/* JADX INFO: compiled from: UriHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\r*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u0005*\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/web/util/h;", "", "<init>", "()V", "", "Landroid/net/Uri;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Landroid/net/Uri;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "key", "g", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "", "defaultVal", "f", "(Landroid/net/Uri;Ljava/lang/String;Z)Z", "", ReportDataTable.COLUMN_PARAMS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;Ljava/util/Map;)Landroid/net/Uri;", "c", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "b", "url", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUriHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriHelper.kt\ncom/kubi/sdk/web/util/UriHelper\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,203:1\n86#2,3:204\n85#2,4:209\n215#3,2:207\n*S KotlinDebug\n*F\n+ 1 UriHelper.kt\ncom/kubi/sdk/web/util/UriHelper\n*L\n35#1:204,3\n164#1:209,4\n115#1:207,2\n*E\n"})
public final class C24335h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24335h f48569a = new C24335h();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Uri m58882a(@NotNull Uri uri, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.isEmpty()) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "{\n            buildUpon(…       .build()\n        }");
        return uriBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Uri m58883b(@NotNull Uri uri, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        HostManager hostManager = HostManager.a;
        List listH = hostManager.h();
        String strM = hostManager.m();
        if (!StringsKt.startsWith$default(string, strM, false, 2, (Object) null)) {
            C44128b.m97266j("KWebLangPath", "langPath skip reason=notH5UrlPrefix url=" + string + " h5Url=" + strM + " h5Hosts=" + listH + " params=" + params);
            return uri;
        }
        String str = params.get("appIgnoreLang");
        List listSplit$default = str != null ? StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null) : null;
        if (listSplit$default == null) {
            listSplit$default = CollectionsKt.emptyList();
        }
        String strM58888g = m58888g(uri, "appIgnoreLang");
        List listSplit$default2 = strM58888g != null ? StringsKt.split$default((CharSequence) strM58888g, new char[]{','}, false, 0, 6, (Object) null) : null;
        if (listSplit$default2 == null) {
            listSplit$default2 = CollectionsKt.emptyList();
        }
        Set set = CollectionsKt.toSet(CollectionsKt.plus((Collection) listSplit$default, (Iterable) listSplit$default2));
        WebConfig webConfig = WebConfig.f48355a;
        boolean zContains = set.contains(webConfig.m58591b());
        C44128b.m97266j("KWebLangPath", "langPath enter url=" + string + " h5Url=" + strM + " h5Hosts=" + listH + " currentLang=" + webConfig.m58591b() + " ignoreSet=" + set + " shouldIgnore=" + zContains + " params=" + params);
        InterfaceC36593a interfaceC36593aM58597h = webConfig.m58597h();
        if (interfaceC36593aM58597h == null) {
            C44128b.m97266j("KWebLangPath", "langPath skip reason=shareSiteNull url=" + string);
            C43846g.m96568c(new WebCoreMessage("WebShareSite is null", "UriHelper", false, 4, null), null, 2, null);
            return uri;
        }
        C23989f.f47493a.m57888e("UriHelper", "webShareSite:>>>>> " + interfaceC36593aM58597h.getClass().getSimpleName());
        Uri uriMo81882d = interfaceC36593aM58597h.mo81882d(uri, params, webConfig.m58591b());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("langPath result shareSite=");
        sb2.append(interfaceC36593aM58597h.getClass().getSimpleName());
        sb2.append(" changed=");
        sb2.append(!Intrinsics.areEqual(uriMo81882d, uri));
        sb2.append(" shouldIgnore=");
        sb2.append(zContains);
        sb2.append(" from=");
        sb2.append(string);
        sb2.append(" to=");
        sb2.append(uriMo81882d);
        C44128b.m97266j("KWebLangPath", sb2.toString());
        return uriMo81882d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m58884c(@NotNull String str, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Uri uriM58889h = m58889h(str);
        if (uriM58889h == null) {
            return str;
        }
        String string = m58883b(uriM58889h, params).toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.changeUrlToLangPath(params).toString()");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m58885d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
            return str;
        }
        if (StringsKt.startsWith$default(str, "/", false, 2, (Object) null)) {
            return HostManager.a.m() + str;
        }
        return HostManager.a.m() + '/' + str;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58886e(@NotNull String str, @Nullable String str2) {
        Uri uriM58889h;
        Uri uriM58889h2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str2 == null || (uriM58889h = m58889h(str2)) == null || (uriM58889h2 = m58889h(str)) == null) {
            return false;
        }
        if (Intrinsics.areEqual(uriM58889h.getEncodedPath(), uriM58889h2.getEncodedPath())) {
            C43840a.m96550d("nav refresh " + str2, "UriHelper");
            return false;
        }
        if (Intrinsics.areEqual(C24308d.m58707f(uriM58889h), C24308d.m58707f(uriM58889h2))) {
            C43840a.m96550d("nav lang " + str2, "UriHelper");
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58887f(@NotNull Uri uri, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return uri.getBooleanQueryParameter(key, z11);
        } catch (Exception unused) {
            return z11;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m58888g(@NotNull Uri uri, @NotNull String key) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return uri.getQueryParameter(key);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Uri m58889h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "UriHelper", false, str + " url parse error", 4, null), null, 2, null);
            return null;
        }
    }
}
