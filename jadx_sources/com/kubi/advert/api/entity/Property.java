package com.kubi.advert.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromotionConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/advert/api/entity/Property;", "", "property", "", "value", "name", "lang", "jumpType", "jumpUrl", "backupValues", "Lcom/kubi/advert/api/entity/BackupValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/advert/api/entity/BackupValue;)V", "getProperty", "()Ljava/lang/String;", "getValue", "getName", "getLang", "getJumpType", "getJumpUrl", "getBackupValues", "()Lcom/kubi/advert/api/entity/BackupValue;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Property {

    @Nullable
    private final BackupValue backupValues;

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
        if (!(other instanceof Property)) {
            return false;
        }
        Property property = (Property) other;
        return Intrinsics.areEqual(this.property, property.property) && Intrinsics.areEqual(this.value, property.value) && Intrinsics.areEqual(this.name, property.name) && Intrinsics.areEqual(this.lang, property.lang) && Intrinsics.areEqual(this.jumpType, property.jumpType) && Intrinsics.areEqual(this.jumpUrl, property.jumpUrl) && Intrinsics.areEqual(this.backupValues, property.backupValues);
    }

    public static /* synthetic */ Property copy$default(Property property, String str, String str2, String str3, String str4, String str5, String str6, BackupValue backupValue, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = property.property;
        }
        if ((i11 & 2) != 0) {
            str2 = property.value;
        }
        if ((i11 & 4) != 0) {
            str3 = property.name;
        }
        if ((i11 & 8) != 0) {
            str4 = property.lang;
        }
        if ((i11 & 16) != 0) {
            str5 = property.jumpType;
        }
        if ((i11 & 32) != 0) {
            str6 = property.jumpUrl;
        }
        if ((i11 & 64) != 0) {
            backupValue = property.backupValues;
        }
        String str7 = str6;
        BackupValue backupValue2 = backupValue;
        String str8 = str5;
        String str9 = str3;
        return property.copy(str, str2, str9, str4, str8, str7, backupValue2);
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
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BackupValue getBackupValues() {
        return this.backupValues;
    }

    @NotNull
    public final Property copy(@Nullable String property, @Nullable String value, @Nullable String name, @Nullable String lang, @Nullable String jumpType, @Nullable String jumpUrl, @Nullable BackupValue backupValues) {
        return new Property(property, value, name, lang, jumpType, jumpUrl, backupValues);
    }

    @Nullable
    public final BackupValue getBackupValues() {
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
        BackupValue backupValue = this.backupValues;
        return iHashCode6 + (backupValue != null ? backupValue.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Property(property=" + this.property + ", value=" + this.value + ", name=" + this.name + ", lang=" + this.lang + ", jumpType=" + this.jumpType + ", jumpUrl=" + this.jumpUrl + ", backupValues=" + this.backupValues + ')';
    }

    public Property(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable BackupValue backupValue) {
        this.property = str;
        this.value = str2;
        this.name = str3;
        this.lang = str4;
        this.jumpType = str5;
        this.jumpUrl = str6;
        this.backupValues = backupValue;
    }
}
