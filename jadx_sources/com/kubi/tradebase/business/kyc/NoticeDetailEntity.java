package com.kubi.tradebase.business.kyc;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoticeDetailEntity.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;", "", "title", "", "content", "buttonAgree", "buttonAgreeWebUrl", "buttonAgreeAppUrl", "buttonRefuse", "buttonRefuseWebUrl", "buttonRefuseAppUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getButtonAgree", "getButtonAgreeWebUrl", "getButtonAgreeAppUrl", "getButtonRefuse", "getButtonRefuseWebUrl", "getButtonRefuseAppUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NoticeDetailEntity {

    @Nullable
    private final String buttonAgree;

    @Nullable
    private final String buttonAgreeAppUrl;

    @Nullable
    private final String buttonAgreeWebUrl;

    @Nullable
    private final String buttonRefuse;

    @Nullable
    private final String buttonRefuseAppUrl;

    @Nullable
    private final String buttonRefuseWebUrl;

    @Nullable
    private final String content;

    @Nullable
    private final String title;

    public NoticeDetailEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ NoticeDetailEntity copy$default(NoticeDetailEntity noticeDetailEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = noticeDetailEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = noticeDetailEntity.content;
        }
        if ((i11 & 4) != 0) {
            str3 = noticeDetailEntity.buttonAgree;
        }
        if ((i11 & 8) != 0) {
            str4 = noticeDetailEntity.buttonAgreeWebUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = noticeDetailEntity.buttonAgreeAppUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = noticeDetailEntity.buttonRefuse;
        }
        if ((i11 & 64) != 0) {
            str7 = noticeDetailEntity.buttonRefuseWebUrl;
        }
        if ((i11 & 128) != 0) {
            str8 = noticeDetailEntity.buttonRefuseAppUrl;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return noticeDetailEntity.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeDetailEntity)) {
            return false;
        }
        NoticeDetailEntity noticeDetailEntity = (NoticeDetailEntity) other;
        return Intrinsics.areEqual(this.title, noticeDetailEntity.title) && Intrinsics.areEqual(this.content, noticeDetailEntity.content) && Intrinsics.areEqual(this.buttonAgree, noticeDetailEntity.buttonAgree) && Intrinsics.areEqual(this.buttonAgreeWebUrl, noticeDetailEntity.buttonAgreeWebUrl) && Intrinsics.areEqual(this.buttonAgreeAppUrl, noticeDetailEntity.buttonAgreeAppUrl) && Intrinsics.areEqual(this.buttonRefuse, noticeDetailEntity.buttonRefuse) && Intrinsics.areEqual(this.buttonRefuseWebUrl, noticeDetailEntity.buttonRefuseWebUrl) && Intrinsics.areEqual(this.buttonRefuseAppUrl, noticeDetailEntity.buttonRefuseAppUrl);
    }

    public NoticeDetailEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.title = str;
        this.content = str2;
        this.buttonAgree = str3;
        this.buttonAgreeWebUrl = str4;
        this.buttonAgreeAppUrl = str5;
        this.buttonRefuse = str6;
        this.buttonRefuseWebUrl = str7;
        this.buttonRefuseAppUrl = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonAgree() {
        return this.buttonAgree;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonAgreeWebUrl() {
        return this.buttonAgreeWebUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonAgreeAppUrl() {
        return this.buttonAgreeAppUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButtonRefuse() {
        return this.buttonRefuse;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getButtonRefuseWebUrl() {
        return this.buttonRefuseWebUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getButtonRefuseAppUrl() {
        return this.buttonRefuseAppUrl;
    }

    @NotNull
    public final NoticeDetailEntity copy(@Nullable String title, @Nullable String content, @Nullable String buttonAgree, @Nullable String buttonAgreeWebUrl, @Nullable String buttonAgreeAppUrl, @Nullable String buttonRefuse, @Nullable String buttonRefuseWebUrl, @Nullable String buttonRefuseAppUrl) {
        return new NoticeDetailEntity(title, content, buttonAgree, buttonAgreeWebUrl, buttonAgreeAppUrl, buttonRefuse, buttonRefuseWebUrl, buttonRefuseAppUrl);
    }

    @Nullable
    public final String getButtonAgree() {
        return this.buttonAgree;
    }

    @Nullable
    public final String getButtonAgreeAppUrl() {
        return this.buttonAgreeAppUrl;
    }

    @Nullable
    public final String getButtonAgreeWebUrl() {
        return this.buttonAgreeWebUrl;
    }

    @Nullable
    public final String getButtonRefuse() {
        return this.buttonRefuse;
    }

    @Nullable
    public final String getButtonRefuseAppUrl() {
        return this.buttonRefuseAppUrl;
    }

    @Nullable
    public final String getButtonRefuseWebUrl() {
        return this.buttonRefuseWebUrl;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonAgree;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonAgreeWebUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonAgreeAppUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonRefuse;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buttonRefuseWebUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.buttonRefuseAppUrl;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NoticeDetailEntity(title=" + this.title + ", content=" + this.content + ", buttonAgree=" + this.buttonAgree + ", buttonAgreeWebUrl=" + this.buttonAgreeWebUrl + ", buttonAgreeAppUrl=" + this.buttonAgreeAppUrl + ", buttonRefuse=" + this.buttonRefuse + ", buttonRefuseWebUrl=" + this.buttonRefuseWebUrl + ", buttonRefuseAppUrl=" + this.buttonRefuseAppUrl + ')';
    }

    public /* synthetic */ NoticeDetailEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8);
    }
}
