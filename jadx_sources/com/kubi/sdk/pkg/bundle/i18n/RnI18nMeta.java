package com.kubi.sdk.pkg.bundle.i18n;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RnI18nModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u001d\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000bHÆ\u0003Jb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0006\u0010\"\u001a\u00020\u001fJ\u0016\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006J\u0016\u0010'\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "", "cdn", "", "hostProjectId", "packages", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPackageMeta;", "priority", "", "preset", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getCdn", "()Ljava/lang/String;", "getHostProjectId", "getPackages", "()Ljava/util/List;", "getPreset", "()Ljava/util/Map;", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "equals", "", "other", "hashCode", "isValid", "presetCovers", "siteType", "lang", "projectIds", "shouldNativePrefetch", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnI18nModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nModels.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1#2:88\n1855#3,2:89\n*S KotlinDebug\n*F\n+ 1 RnI18nModels.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta\n*L\n32#1:89,2\n*E\n"})
public final /* data */ class RnI18nMeta {

    @Nullable
    private final String cdn;

    @SerializedName(alternate = {"hostProjectId"}, value = "host_project_id")
    @Nullable
    private final String hostProjectId;

    @Nullable
    private final List<RnI18nPackageMeta> packages;

    @Nullable
    private final Map<String, List<String>> preset;

    @Nullable
    private final Integer priority;

    public RnI18nMeta() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnI18nMeta)) {
            return false;
        }
        RnI18nMeta rnI18nMeta = (RnI18nMeta) other;
        return Intrinsics.areEqual(this.cdn, rnI18nMeta.cdn) && Intrinsics.areEqual(this.hostProjectId, rnI18nMeta.hostProjectId) && Intrinsics.areEqual(this.packages, rnI18nMeta.packages) && Intrinsics.areEqual(this.priority, rnI18nMeta.priority) && Intrinsics.areEqual(this.preset, rnI18nMeta.preset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RnI18nMeta(@Nullable String str, @Nullable String str2, @Nullable List<RnI18nPackageMeta> list, @Nullable Integer num, @Nullable Map<String, ? extends List<String>> map) {
        this.cdn = str;
        this.hostProjectId = str2;
        this.packages = list;
        this.priority = num;
        this.preset = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RnI18nMeta copy$default(RnI18nMeta rnI18nMeta, String str, String str2, List list, Integer num, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rnI18nMeta.cdn;
        }
        if ((i11 & 2) != 0) {
            str2 = rnI18nMeta.hostProjectId;
        }
        if ((i11 & 4) != 0) {
            list = rnI18nMeta.packages;
        }
        if ((i11 & 8) != 0) {
            num = rnI18nMeta.priority;
        }
        if ((i11 & 16) != 0) {
            map = rnI18nMeta.preset;
        }
        Map map2 = map;
        List list2 = list;
        return rnI18nMeta.copy(str, str2, list2, num, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCdn() {
        return this.cdn;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHostProjectId() {
        return this.hostProjectId;
    }

    @Nullable
    public final List<RnI18nPackageMeta> component3() {
        return this.packages;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final Map<String, List<String>> component5() {
        return this.preset;
    }

    @NotNull
    public final RnI18nMeta copy(@Nullable String cdn, @Nullable String hostProjectId, @Nullable List<RnI18nPackageMeta> packages, @Nullable Integer priority, @Nullable Map<String, ? extends List<String>> preset) {
        return new RnI18nMeta(cdn, hostProjectId, packages, priority, preset);
    }

    @Nullable
    public final String getCdn() {
        return this.cdn;
    }

    @Nullable
    public final String getHostProjectId() {
        return this.hostProjectId;
    }

    @Nullable
    public final List<RnI18nPackageMeta> getPackages() {
        return this.packages;
    }

    @Nullable
    public final Map<String, List<String>> getPreset() {
        return this.preset;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    public int hashCode() {
        String str = this.cdn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hostProjectId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RnI18nPackageMeta> list = this.packages;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, List<String>> map = this.preset;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.cdn;
        return (str2 == null || StringsKt.isBlank(str2) || (str = this.hostProjectId) == null || StringsKt.isBlank(str)) ? false : true;
    }

    public final boolean presetCovers(@NotNull String siteType, @NotNull String lang) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Map<String, List<String>> map = this.preset;
        if (map == null) {
            return false;
        }
        List<String> listEmptyList = map.get(siteType);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList.contains(lang);
    }

    public final boolean shouldNativePrefetch(@NotNull String siteType, @NotNull String lang) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        return (this.priority == null || presetCovers(siteType, lang)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "RnI18nMeta(cdn=" + this.cdn + ", hostProjectId=" + this.hostProjectId + ", packages=" + this.packages + ", priority=" + this.priority + ", preset=" + this.preset + ')';
    }

    @NotNull
    public final List<String> projectIds() {
        String string;
        String string2;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String str = this.hostProjectId;
        if (str != null && (string2 = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (string2.length() <= 0) {
                string2 = null;
            }
            if (string2 != null) {
                listCreateListBuilder.add(string2);
            }
        }
        List<RnI18nPackageMeta> listEmptyList = this.packages;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Iterator<T> it = listEmptyList.iterator();
        while (it.hasNext()) {
            String projectId = ((RnI18nPackageMeta) it.next()).getProjectId();
            if (projectId != null && (string = StringsKt.trim((CharSequence) projectId).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    listCreateListBuilder.add(string);
                }
            }
        }
        return CollectionsKt.distinct(CollectionsKt.build(listCreateListBuilder));
    }

    public /* synthetic */ RnI18nMeta(String str, String str2, List list, Integer num, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : map);
    }
}
