package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotBannerEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m90084d2 = {"Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "", "id", "", TUIConstants.TUIChat.NOTICE, "webLink", "appLink", "endTime", "noticeType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getNotice", "getWebLink", "getAppLink", "getEndTime", "getNoticeType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotBannerItemEntity {

    @Nullable
    private final String appLink;

    @Nullable
    private final String endTime;

    @Nullable
    private final String id;

    @Nullable
    private final String notice;
    private final int noticeType;

    @Nullable
    private final String webLink;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotBannerItemEntity)) {
            return false;
        }
        SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) other;
        return Intrinsics.areEqual(this.id, spotBannerItemEntity.id) && Intrinsics.areEqual(this.notice, spotBannerItemEntity.notice) && Intrinsics.areEqual(this.webLink, spotBannerItemEntity.webLink) && Intrinsics.areEqual(this.appLink, spotBannerItemEntity.appLink) && Intrinsics.areEqual(this.endTime, spotBannerItemEntity.endTime) && this.noticeType == spotBannerItemEntity.noticeType;
    }

    public static /* synthetic */ SpotBannerItemEntity copy$default(SpotBannerItemEntity spotBannerItemEntity, String str, String str2, String str3, String str4, String str5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = spotBannerItemEntity.id;
        }
        if ((i12 & 2) != 0) {
            str2 = spotBannerItemEntity.notice;
        }
        if ((i12 & 4) != 0) {
            str3 = spotBannerItemEntity.webLink;
        }
        if ((i12 & 8) != 0) {
            str4 = spotBannerItemEntity.appLink;
        }
        if ((i12 & 16) != 0) {
            str5 = spotBannerItemEntity.endTime;
        }
        if ((i12 & 32) != 0) {
            i11 = spotBannerItemEntity.noticeType;
        }
        String str6 = str5;
        int i13 = i11;
        return spotBannerItemEntity.copy(str, str2, str3, str4, str6, i13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNotice() {
        return this.notice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWebLink() {
        return this.webLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppLink() {
        return this.appLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNoticeType() {
        return this.noticeType;
    }

    @NotNull
    public final SpotBannerItemEntity copy(@Nullable String id2, @Nullable String notice, @Nullable String webLink, @Nullable String appLink, @Nullable String endTime, int noticeType) {
        return new SpotBannerItemEntity(id2, notice, webLink, appLink, endTime, noticeType);
    }

    @Nullable
    public final String getAppLink() {
        return this.appLink;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNotice() {
        return this.notice;
    }

    public final int getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getWebLink() {
        return this.webLink;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appLink;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTime;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.noticeType);
    }

    @NotNull
    public String toString() {
        return "SpotBannerItemEntity(id=" + this.id + ", notice=" + this.notice + ", webLink=" + this.webLink + ", appLink=" + this.appLink + ", endTime=" + this.endTime + ", noticeType=" + this.noticeType + ')';
    }

    public SpotBannerItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i11) {
        this.id = str;
        this.notice = str2;
        this.webLink = str3;
        this.appLink = str4;
        this.endTime = str5;
        this.noticeType = i11;
    }
}
