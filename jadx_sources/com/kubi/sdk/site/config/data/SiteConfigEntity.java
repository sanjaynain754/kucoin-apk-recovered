package com.kubi.sdk.site.config.data;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/site/config/data/SiteConfigEntity;", "", "siteType", "", "basicProperties", "Lcom/google/gson/JsonElement;", "extProperties", "", "Lcom/kubi/sdk/site/config/data/ExtConfigsEntity;", "functions", "Lcom/kubi/sdk/site/config/data/FunctionsEntity;", "bizConfigs", "Lcom/kubi/sdk/site/config/data/BizConfigsEntity;", "<init>", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSiteType", "()Ljava/lang/String;", "getBasicProperties", "()Lcom/google/gson/JsonElement;", "getExtProperties", "()Ljava/util/List;", "getFunctions", "getBizConfigs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SiteConfigEntity {

    @Nullable
    private final JsonElement basicProperties;

    @Nullable
    private final List<BizConfigsEntity> bizConfigs;

    @Nullable
    private final List<ExtConfigsEntity> extProperties;

    @Nullable
    private final List<FunctionsEntity> functions;

    @Nullable
    private final String siteType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteConfigEntity)) {
            return false;
        }
        SiteConfigEntity siteConfigEntity = (SiteConfigEntity) other;
        return Intrinsics.areEqual(this.siteType, siteConfigEntity.siteType) && Intrinsics.areEqual(this.basicProperties, siteConfigEntity.basicProperties) && Intrinsics.areEqual(this.extProperties, siteConfigEntity.extProperties) && Intrinsics.areEqual(this.functions, siteConfigEntity.functions) && Intrinsics.areEqual(this.bizConfigs, siteConfigEntity.bizConfigs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SiteConfigEntity copy$default(SiteConfigEntity siteConfigEntity, String str, JsonElement jsonElement, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = siteConfigEntity.siteType;
        }
        if ((i11 & 2) != 0) {
            jsonElement = siteConfigEntity.basicProperties;
        }
        if ((i11 & 4) != 0) {
            list = siteConfigEntity.extProperties;
        }
        if ((i11 & 8) != 0) {
            list2 = siteConfigEntity.functions;
        }
        if ((i11 & 16) != 0) {
            list3 = siteConfigEntity.bizConfigs;
        }
        List list4 = list3;
        List list5 = list;
        return siteConfigEntity.copy(str, jsonElement, list5, list2, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getBasicProperties() {
        return this.basicProperties;
    }

    @Nullable
    public final List<ExtConfigsEntity> component3() {
        return this.extProperties;
    }

    @Nullable
    public final List<FunctionsEntity> component4() {
        return this.functions;
    }

    @Nullable
    public final List<BizConfigsEntity> component5() {
        return this.bizConfigs;
    }

    @NotNull
    public final SiteConfigEntity copy(@Nullable String siteType, @Nullable JsonElement basicProperties, @Nullable List<ExtConfigsEntity> extProperties, @Nullable List<FunctionsEntity> functions, @Nullable List<BizConfigsEntity> bizConfigs) {
        return new SiteConfigEntity(siteType, basicProperties, extProperties, functions, bizConfigs);
    }

    @Nullable
    public final JsonElement getBasicProperties() {
        return this.basicProperties;
    }

    @Nullable
    public final List<BizConfigsEntity> getBizConfigs() {
        return this.bizConfigs;
    }

    @Nullable
    public final List<ExtConfigsEntity> getExtProperties() {
        return this.extProperties;
    }

    @Nullable
    public final List<FunctionsEntity> getFunctions() {
        return this.functions;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    public int hashCode() {
        String str = this.siteType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonElement jsonElement = this.basicProperties;
        int iHashCode2 = (iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        List<ExtConfigsEntity> list = this.extProperties;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<FunctionsEntity> list2 = this.functions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BizConfigsEntity> list3 = this.bizConfigs;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SiteConfigEntity(siteType=" + this.siteType + ", basicProperties=" + this.basicProperties + ", extProperties=" + this.extProperties + ", functions=" + this.functions + ", bizConfigs=" + this.bizConfigs + ')';
    }

    public SiteConfigEntity(@Nullable String str, @Nullable JsonElement jsonElement, @Nullable List<ExtConfigsEntity> list, @Nullable List<FunctionsEntity> list2, @Nullable List<BizConfigsEntity> list3) {
        this.siteType = str;
        this.basicProperties = jsonElement;
        this.extProperties = list;
        this.functions = list2;
        this.bizConfigs = list3;
    }
}
