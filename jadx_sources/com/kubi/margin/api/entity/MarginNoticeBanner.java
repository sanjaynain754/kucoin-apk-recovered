package com.kubi.margin.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginNoticeBanner.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginNoticeBanner;", "", "id", "", "bannerId", "closeKeepDay", "", "content", "createdAt", "language", "status", "webUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBannerId", "getCloseKeepDay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContent", "getCreatedAt", "getLanguage", "getStatus", "getWebUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/margin/api/entity/MarginNoticeBanner;", "equals", "", "other", "hashCode", "", "toString", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginNoticeBanner {

    @Nullable
    private final String bannerId;

    @Nullable
    private final Long closeKeepDay;

    @Nullable
    private final String content;

    @Nullable
    private final String createdAt;

    @Nullable
    private final String id;

    @Nullable
    private final String language;

    @Nullable
    private final String status;

    @Nullable
    private final String webUrl;

    public MarginNoticeBanner() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginNoticeBanner)) {
            return false;
        }
        MarginNoticeBanner marginNoticeBanner = (MarginNoticeBanner) other;
        return Intrinsics.areEqual(this.id, marginNoticeBanner.id) && Intrinsics.areEqual(this.bannerId, marginNoticeBanner.bannerId) && Intrinsics.areEqual(this.closeKeepDay, marginNoticeBanner.closeKeepDay) && Intrinsics.areEqual(this.content, marginNoticeBanner.content) && Intrinsics.areEqual(this.createdAt, marginNoticeBanner.createdAt) && Intrinsics.areEqual(this.language, marginNoticeBanner.language) && Intrinsics.areEqual(this.status, marginNoticeBanner.status) && Intrinsics.areEqual(this.webUrl, marginNoticeBanner.webUrl);
    }

    public MarginNoticeBanner(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.id = str;
        this.bannerId = str2;
        this.closeKeepDay = l11;
        this.content = str3;
        this.createdAt = str4;
        this.language = str5;
        this.status = str6;
        this.webUrl = str7;
    }

    public static /* synthetic */ MarginNoticeBanner copy$default(MarginNoticeBanner marginNoticeBanner, String str, String str2, Long l11, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginNoticeBanner.id;
        }
        if ((i11 & 2) != 0) {
            str2 = marginNoticeBanner.bannerId;
        }
        if ((i11 & 4) != 0) {
            l11 = marginNoticeBanner.closeKeepDay;
        }
        if ((i11 & 8) != 0) {
            str3 = marginNoticeBanner.content;
        }
        if ((i11 & 16) != 0) {
            str4 = marginNoticeBanner.createdAt;
        }
        if ((i11 & 32) != 0) {
            str5 = marginNoticeBanner.language;
        }
        if ((i11 & 64) != 0) {
            str6 = marginNoticeBanner.status;
        }
        if ((i11 & 128) != 0) {
            str7 = marginNoticeBanner.webUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return marginNoticeBanner.copy(str, str2, l11, str3, str10, str11, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    @NotNull
    public final MarginNoticeBanner copy(@Nullable String id2, @Nullable String bannerId, @Nullable Long closeKeepDay, @Nullable String content, @Nullable String createdAt, @Nullable String language, @Nullable String status, @Nullable String webUrl) {
        return new MarginNoticeBanner(id2, bannerId, closeKeepDay, content, createdAt, language, status, webUrl);
    }

    @Nullable
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    public final Long getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.closeKeepDay;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.language;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.webUrl;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginNoticeBanner(id=" + this.id + ", bannerId=" + this.bannerId + ", closeKeepDay=" + this.closeKeepDay + ", content=" + this.content + ", createdAt=" + this.createdAt + ", language=" + this.language + ", status=" + this.status + ", webUrl=" + this.webUrl + ')';
    }

    public /* synthetic */ MarginNoticeBanner(String str, String str2, Long l11, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7);
    }
}
