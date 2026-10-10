package v80;

import android.net.Uri;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.sdk.web.util.C24335h;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: v80.i */
/* JADX INFO: compiled from: WebShareSiteUriUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nJ>\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nJ\u0006\u0010\u0013\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/WebShareSiteUriUtils;", "", "<init>", "()V", "removeKeys", "", "", "getRemoveKeys", "()Ljava/util/List;", "siteContryPath", "", "getIgnoreLang", "", "uri", "Landroid/net/Uri;", ReportDataTable.COLUMN_PARAMS, "reconstructParams", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getContryPath", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebShareSiteUriUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebShareSiteUriUtils.kt\ncom/kubi/widget/web/sharesite/WebShareSiteUriUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1#2:48\n1#2:53\n1#2:55\n827#3:49\n855#3,2:50\n2756#3:52\n2756#3:54\n*S KotlinDebug\n*F\n+ 1 WebShareSiteUriUtils.kt\ncom/kubi/widget/web/sharesite/WebShareSiteUriUtils\n*L\n29#1:53\n34#1:55\n28#1:49\n28#1:50,2\n29#1:52\n34#1:54\n*E\n"})
public final class C45478i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45478i f102499a = new C45478i();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f102500b = CollectionsKt.listOf((Object[]) new String[]{"lang", "appNeedLang", "appIgnoreLang"});

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, String> f102501c = MapsKt.mapOf(TuplesKt.m90091to(SiteType.EUROPE_NAME, "eu"), TuplesKt.m90091to(SiteType.EUROPE_STAGING_NAME, "eu"), TuplesKt.m90091to(SiteType.AUSTRALIA_NAME, "au"));

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<String> m100435b(@NotNull Uri uri, @NotNull Map<String, String> params) {
        List listSplit$default;
        List listSplit$default2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = params.get("appIgnoreLang");
        if (str != null && (listSplit$default2 = StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null)) != null) {
            linkedHashSet.addAll(listSplit$default2);
        }
        String strM58888g = C24335h.f48569a.m58888g(uri, "appIgnoreLang");
        if (strM58888g != null && (listSplit$default = StringsKt.split$default((CharSequence) strM58888g, new char[]{','}, false, 0, 6, (Object) null)) != null) {
            linkedHashSet.addAll(listSplit$default);
        }
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100434a() {
        SiteConfigEntity siteConfigEntityM58039f = SiteConfigManager.f47884a.m58039f();
        String asString = null;
        JsonElement basicProperties = siteConfigEntityM58039f != null ? siteConfigEntityM58039f.getBasicProperties() : null;
        JsonObject jsonObject = basicProperties instanceof JsonObject ? (JsonObject) basicProperties : null;
        JsonElement jsonElement = jsonObject != null ? jsonObject.get("siteRegion") : null;
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            asString = jsonElement.getAsString();
        }
        return asString == null ? "" : asString;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final LinkedHashMap<String, String> m100436c(@NotNull Uri uri, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!f102500b.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            C24335h c24335h = C24335h.f48569a;
            Intrinsics.checkNotNull(str);
            String strM58888g = c24335h.m58888g(uri, str);
            if (strM58888g != null) {
                linkedHashMap.put(str, strM58888g);
            }
        }
        linkedHashMap.putAll(params);
        Iterator<T> it = f102500b.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        return linkedHashMap;
    }
}
