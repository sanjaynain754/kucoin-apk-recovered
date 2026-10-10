package com.kubi.advert.api.entity;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PageConfigEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/advert/api/entity/ConfigProperty;", "", "property", "", "value", "name", "lang", "jumpType", "jumpUrl", "backupValues", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getProperty", "()Ljava/lang/String;", "getValue", "getName", "getLang", "getJumpType", "getJumpUrl", "getBackupValues", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ConfigProperty {

    @Nullable
    private final Map<String, String> backupValues;

    @Nullable
    private final String jumpType;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String lang;

    @Nullable
    private final String name;

    @Nullable
    private final String property;

    @Nullable
    private final String value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigProperty)) {
            return false;
        }
        ConfigProperty configProperty = (ConfigProperty) other;
        return Intrinsics.areEqual(this.property, configProperty.property) && Intrinsics.areEqual(this.value, configProperty.value) && Intrinsics.areEqual(this.name, configProperty.name) && Intrinsics.areEqual(this.lang, configProperty.lang) && Intrinsics.areEqual(this.jumpType, configProperty.jumpType) && Intrinsics.areEqual(this.jumpUrl, configProperty.jumpUrl) && Intrinsics.areEqual(this.backupValues, configProperty.backupValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigProperty copy$default(ConfigProperty configProperty, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configProperty.property;
        }
        if ((i11 & 2) != 0) {
            str2 = configProperty.value;
        }
        if ((i11 & 4) != 0) {
            str3 = configProperty.name;
        }
        if ((i11 & 8) != 0) {
            str4 = configProperty.lang;
        }
        if ((i11 & 16) != 0) {
            str5 = configProperty.jumpType;
        }
        if ((i11 & 32) != 0) {
            str6 = configProperty.jumpUrl;
        }
        if ((i11 & 64) != 0) {
            map = configProperty.backupValues;
        }
        String str7 = str6;
        Map map2 = map;
        String str8 = str5;
        String str9 = str3;
        return configProperty.copy(str, str2, str9, str4, str8, str7, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProperty() {
        return this.property;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final Map<String, String> component7() {
        return this.backupValues;
    }

    @NotNull
    public final ConfigProperty copy(@Nullable String property, @Nullable String value, @Nullable String name, @Nullable String lang, @Nullable String jumpType, @Nullable String jumpUrl, @Nullable Map<String, String> backupValues) {
        return new ConfigProperty(property, value, name, lang, jumpType, jumpUrl, backupValues);
    }

    @Nullable
    public final Map<String, String> getBackupValues() {
        return this.backupValues;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getProperty() {
        return this.property;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.property;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lang;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jumpUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.backupValues;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConfigProperty(property=" + this.property + ", value=" + this.value + ", name=" + this.name + ", lang=" + this.lang + ", jumpType=" + this.jumpType + ", jumpUrl=" + this.jumpUrl + ", backupValues=" + this.backupValues + ')';
    }

    public ConfigProperty(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map) {
        this.property = str;
        this.value = str2;
        this.name = str3;
        this.lang = str4;
        this.jumpType = str5;
        this.jumpUrl = str6;
        this.backupValues = map;
    }
}
