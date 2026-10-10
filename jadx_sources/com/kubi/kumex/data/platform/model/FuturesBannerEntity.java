package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesBannerEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesBannerEntity;", "", "id", "", "title", "path", "publishTime", "", "dayImageUrl", "nightImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPath", "getPublishTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDayImageUrl", "getNightImageUrl", "getDisplayImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/FuturesBannerEntity;", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesBannerEntity {

    @Nullable
    private final String dayImageUrl;

    @Nullable
    private final String id;

    @Nullable
    private final String nightImageUrl;

    @Nullable
    private final String path;

    @Nullable
    private final Long publishTime;

    @Nullable
    private final String title;

    public FuturesBannerEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesBannerEntity)) {
            return false;
        }
        FuturesBannerEntity futuresBannerEntity = (FuturesBannerEntity) other;
        return Intrinsics.areEqual(this.id, futuresBannerEntity.id) && Intrinsics.areEqual(this.title, futuresBannerEntity.title) && Intrinsics.areEqual(this.path, futuresBannerEntity.path) && Intrinsics.areEqual(this.publishTime, futuresBannerEntity.publishTime) && Intrinsics.areEqual(this.dayImageUrl, futuresBannerEntity.dayImageUrl) && Intrinsics.areEqual(this.nightImageUrl, futuresBannerEntity.nightImageUrl);
    }

    public FuturesBannerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5) {
        this.id = str;
        this.title = str2;
        this.path = str3;
        this.publishTime = l11;
        this.dayImageUrl = str4;
        this.nightImageUrl = str5;
    }

    public static /* synthetic */ FuturesBannerEntity copy$default(FuturesBannerEntity futuresBannerEntity, String str, String str2, String str3, Long l11, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresBannerEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = futuresBannerEntity.title;
        }
        if ((i11 & 4) != 0) {
            str3 = futuresBannerEntity.path;
        }
        if ((i11 & 8) != 0) {
            l11 = futuresBannerEntity.publishTime;
        }
        if ((i11 & 16) != 0) {
            str4 = futuresBannerEntity.dayImageUrl;
        }
        if ((i11 & 32) != 0) {
            str5 = futuresBannerEntity.nightImageUrl;
        }
        String str6 = str4;
        String str7 = str5;
        return futuresBannerEntity.copy(str, str2, str3, l11, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPublishTime() {
        return this.publishTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDayImageUrl() {
        return this.dayImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNightImageUrl() {
        return this.nightImageUrl;
    }

    @NotNull
    public final FuturesBannerEntity copy(@Nullable String id2, @Nullable String title, @Nullable String path, @Nullable Long publishTime, @Nullable String dayImageUrl, @Nullable String nightImageUrl) {
        return new FuturesBannerEntity(id2, title, path, publishTime, dayImageUrl, nightImageUrl);
    }

    @Nullable
    public final String getDayImageUrl() {
        return this.dayImageUrl;
    }

    @Nullable
    public final String getDisplayImageUrl() {
        return DayNightThemeManager.f28592a.m33187l() ? this.dayImageUrl : this.nightImageUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNightImageUrl() {
        return this.nightImageUrl;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Long getPublishTime() {
        return this.publishTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.path;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.publishTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.dayImageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nightImageUrl;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesBannerEntity(id=" + this.id + ", title=" + this.title + ", path=" + this.path + ", publishTime=" + this.publishTime + ", dayImageUrl=" + this.dayImageUrl + ", nightImageUrl=" + this.nightImageUrl + ')';
    }

    public /* synthetic */ FuturesBannerEntity(String str, String str2, String str3, Long l11, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }
}
