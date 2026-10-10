package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotBannerEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/core/spot/entity/SpotBannerPushEntity;", "", "type", "", "category", "blockCode", "symbolCode", "noticeType", "", "checksum", "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCategory", "getBlockCode", "getSymbolCode", "getNoticeType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChecksum", "getLang", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/spot/entity/SpotBannerPushEntity;", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotBannerPushEntity {

    @Nullable
    private final String blockCode;

    @Nullable
    private final String category;

    @Nullable
    private final String checksum;

    @Nullable
    private final String lang;

    @Nullable
    private final Integer noticeType;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotBannerPushEntity)) {
            return false;
        }
        SpotBannerPushEntity spotBannerPushEntity = (SpotBannerPushEntity) other;
        return Intrinsics.areEqual(this.type, spotBannerPushEntity.type) && Intrinsics.areEqual(this.category, spotBannerPushEntity.category) && Intrinsics.areEqual(this.blockCode, spotBannerPushEntity.blockCode) && Intrinsics.areEqual(this.symbolCode, spotBannerPushEntity.symbolCode) && Intrinsics.areEqual(this.noticeType, spotBannerPushEntity.noticeType) && Intrinsics.areEqual(this.checksum, spotBannerPushEntity.checksum) && Intrinsics.areEqual(this.lang, spotBannerPushEntity.lang);
    }

    public static /* synthetic */ SpotBannerPushEntity copy$default(SpotBannerPushEntity spotBannerPushEntity, String str, String str2, String str3, String str4, Integer num, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotBannerPushEntity.type;
        }
        if ((i11 & 2) != 0) {
            str2 = spotBannerPushEntity.category;
        }
        if ((i11 & 4) != 0) {
            str3 = spotBannerPushEntity.blockCode;
        }
        if ((i11 & 8) != 0) {
            str4 = spotBannerPushEntity.symbolCode;
        }
        if ((i11 & 16) != 0) {
            num = spotBannerPushEntity.noticeType;
        }
        if ((i11 & 32) != 0) {
            str5 = spotBannerPushEntity.checksum;
        }
        if ((i11 & 64) != 0) {
            str6 = spotBannerPushEntity.lang;
        }
        String str7 = str5;
        String str8 = str6;
        Integer num2 = num;
        String str9 = str3;
        return spotBannerPushEntity.copy(str, str2, str9, str4, num2, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlockCode() {
        return this.blockCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final SpotBannerPushEntity copy(@Nullable String type, @Nullable String category, @Nullable String blockCode, @Nullable String symbolCode, @Nullable Integer noticeType, @Nullable String checksum, @Nullable String lang) {
        return new SpotBannerPushEntity(type, category, blockCode, symbolCode, noticeType, checksum, lang);
    }

    @Nullable
    public final String getBlockCode() {
        return this.blockCode;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getChecksum() {
        return this.checksum;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final Integer getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blockCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.noticeType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.checksum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lang;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotBannerPushEntity(type=" + this.type + ", category=" + this.category + ", blockCode=" + this.blockCode + ", symbolCode=" + this.symbolCode + ", noticeType=" + this.noticeType + ", checksum=" + this.checksum + ", lang=" + this.lang + ')';
    }

    public SpotBannerPushEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6) {
        this.type = str;
        this.category = str2;
        this.blockCode = str3;
        this.symbolCode = str4;
        this.noticeType = num;
        this.checksum = str5;
        this.lang = str6;
    }
}
