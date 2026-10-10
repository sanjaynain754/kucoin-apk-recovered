package com.kubi.sdk.function.language.dynamic.client;

import android.content.Context;
import com.kubi.sdk.function.language.issue.LangConfigMessage;
import com.kubi.sdk.site.info.SiteInfoManager;
import cz.C36557a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p847zy.C46943e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: LocalConfigClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u001a\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007J\u001e\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/LocalConfigClient;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dynamicLangMap", "", "", "assetsClient", "Lcom/kubi/sdk/function/language/dynamic/client/AssetsConfigClient;", "saveEtag", "", "etag", "getETag", "saveConfig", "config", "checkConfigAvailable", "", "getUniqueKey", "key", "getValue", "originKey", "clearAssetsCache", "Companion", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocalConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/LocalConfigClient\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,98:1\n23#2,2:99\n32#2:101\n48#3,2:102\n1193#4,2:104\n1267#4,4:106\n216#5,2:110\n*S KotlinDebug\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/LocalConfigClient\n*L\n30#1:99,2\n34#1:101\n39#1:102,2\n43#1:104,2\n43#1:106,4\n46#1:110,2\n*E\n"})
public final class LocalConfigClient {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f46823c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public Map<String, String> f46824a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AssetsConfigClient f46825b;

    /* JADX INFO: compiled from: LocalConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/LocalConfigClient$Companion;", "", "<init>", "()V", "TAG", "", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LocalConfigClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46824a = MapsKt.emptyMap();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f46825b = new AssetsConfigClient(applicationContext);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57020a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            return true;
        }
        C43840a.m96550d("checkConfigAvailable routes is null or empty", "LangLocalConfigClient");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m57021b() {
        this.f46825b.m57017a();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m57022c() {
        return C46392a.m102326h(C36557a.f79397a.m81828a(), "");
    }

    /* JADX INFO: renamed from: d */
    public final String m57023d(String str) {
        StringBuilder sb2 = new StringBuilder();
        C46943e c46943e = C46943e.f104811a;
        sb2.append(c46943e.m103419a());
        sb2.append('_');
        sb2.append(c46943e.m103421c());
        sb2.append('_');
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m57024e(@NotNull String originKey) {
        Intrinsics.checkNotNullParameter(originKey, "originKey");
        String strM57023d = m57023d(originKey);
        String strM81829b = this.f46824a.get(strM57023d);
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        siteInfoManager.m58113g("LangLocalConfigClient", "getValue from mem key=" + strM57023d + ", value=" + strM81829b);
        if (strM81829b == null || strM81829b.length() == 0) {
            strM81829b = C36557a.f79397a.m81829b(strM57023d);
            siteInfoManager.m58113g("LangLocalConfigClient", "getValue from mmkv key=" + strM57023d + ", kv_value=" + strM81829b);
        }
        if (strM81829b == null || strM81829b.length() == 0) {
            strM81829b = this.f46825b.m57018b(originKey);
            siteInfoManager.m58113g("LangLocalConfigClient", "getValue from assets key=" + originKey + ", assets_value=" + strM81829b);
        }
        return strM81829b == null ? "" : strM81829b;
    }

    /* JADX INFO: renamed from: f */
    public final void m57025f(@NotNull Map<String, String> config) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(config, "config");
        if (!m57020a(config)) {
            C43846g.m96568c(new LangConfigMessage("saveConfig config is invalid", "LangLocalConfigClient", false, 4, null), null, 2, null);
            C44128b.m97270n("LangLocalConfigClient", "config is invalid,config: " + config);
            return;
        }
        Set<Map.Entry<String, String>> setEntrySet = config.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM90091to = TuplesKt.m90091to(m57023d((String) entry.getKey()), (String) entry.getValue());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        this.f46824a = linkedHashMap;
        try {
            Result.Companion companion = Result.INSTANCE;
            for (Map.Entry<String, String> entry2 : config.entrySet()) {
                C36557a.f79397a.m81830c(m57023d(entry2.getKey()), entry2.getValue());
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("LangLocalConfigClient", "save config error: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57026g(@Nullable String str) {
        StorageId<String> storageIdM81828a = C36557a.f79397a.m81828a();
        if (str == null) {
            str = "";
        }
        C46392a.m102333p(storageIdM81828a, str);
    }
}
