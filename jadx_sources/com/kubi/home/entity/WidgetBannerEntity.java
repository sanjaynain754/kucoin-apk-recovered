package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetBannerEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m90084d2 = {"Lcom/kubi/home/entity/WidgetBannerEntity;", "", "id", "", "positionCode", "title", "url", "daySrcImgMap", "Lcom/kubi/home/entity/WidgetBannerImageEntity;", "nightSrcImgMap", "srcTextMap", "Lcom/kubi/home/entity/WidgetBannerTextEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/home/entity/WidgetBannerImageEntity;Lcom/kubi/home/entity/WidgetBannerImageEntity;Lcom/kubi/home/entity/WidgetBannerTextEntity;)V", "getId", "()Ljava/lang/String;", "getPositionCode", "getTitle", "getUrl", "getDaySrcImgMap", "()Lcom/kubi/home/entity/WidgetBannerImageEntity;", "getNightSrcImgMap", "getSrcTextMap", "()Lcom/kubi/home/entity/WidgetBannerTextEntity;", "getDisplayImageUrl", "isFullType", "", "getSubTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WidgetBannerEntity {

    @Nullable
    private final WidgetBannerImageEntity daySrcImgMap;

    @Nullable
    private final String id;

    @Nullable
    private final WidgetBannerImageEntity nightSrcImgMap;

    @Nullable
    private final String positionCode;

    @Nullable
    private final WidgetBannerTextEntity srcTextMap;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetBannerEntity)) {
            return false;
        }
        WidgetBannerEntity widgetBannerEntity = (WidgetBannerEntity) other;
        return Intrinsics.areEqual(this.id, widgetBannerEntity.id) && Intrinsics.areEqual(this.positionCode, widgetBannerEntity.positionCode) && Intrinsics.areEqual(this.title, widgetBannerEntity.title) && Intrinsics.areEqual(this.url, widgetBannerEntity.url) && Intrinsics.areEqual(this.daySrcImgMap, widgetBannerEntity.daySrcImgMap) && Intrinsics.areEqual(this.nightSrcImgMap, widgetBannerEntity.nightSrcImgMap) && Intrinsics.areEqual(this.srcTextMap, widgetBannerEntity.srcTextMap);
    }

    @Nullable
    public final String getSubTitle(boolean isFullType) {
        if (isFullType) {
            WidgetBannerTextEntity widgetBannerTextEntity = this.srcTextMap;
            if (widgetBannerTextEntity != null) {
                return widgetBannerTextEntity.getLarge_text2();
            }
            return null;
        }
        WidgetBannerTextEntity widgetBannerTextEntity2 = this.srcTextMap;
        if (widgetBannerTextEntity2 != null) {
            return widgetBannerTextEntity2.getSmall_text2();
        }
        return null;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public static /* synthetic */ WidgetBannerEntity copy$default(WidgetBannerEntity widgetBannerEntity, String str, String str2, String str3, String str4, WidgetBannerImageEntity widgetBannerImageEntity, WidgetBannerImageEntity widgetBannerImageEntity2, WidgetBannerTextEntity widgetBannerTextEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = widgetBannerEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = widgetBannerEntity.positionCode;
        }
        if ((i11 & 4) != 0) {
            str3 = widgetBannerEntity.title;
        }
        if ((i11 & 8) != 0) {
            str4 = widgetBannerEntity.url;
        }
        if ((i11 & 16) != 0) {
            widgetBannerImageEntity = widgetBannerEntity.daySrcImgMap;
        }
        if ((i11 & 32) != 0) {
            widgetBannerImageEntity2 = widgetBannerEntity.nightSrcImgMap;
        }
        if ((i11 & 64) != 0) {
            widgetBannerTextEntity = widgetBannerEntity.srcTextMap;
        }
        WidgetBannerImageEntity widgetBannerImageEntity3 = widgetBannerImageEntity2;
        WidgetBannerTextEntity widgetBannerTextEntity2 = widgetBannerTextEntity;
        WidgetBannerImageEntity widgetBannerImageEntity4 = widgetBannerImageEntity;
        String str5 = str3;
        return widgetBannerEntity.copy(str, str2, str5, str4, widgetBannerImageEntity4, widgetBannerImageEntity3, widgetBannerTextEntity2);
    }

    public static /* synthetic */ String getDisplayImageUrl$default(WidgetBannerEntity widgetBannerEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return widgetBannerEntity.getDisplayImageUrl(z11);
    }

    public static /* synthetic */ String getSubTitle$default(WidgetBannerEntity widgetBannerEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return widgetBannerEntity.getSubTitle(z11);
    }

    public static /* synthetic */ String getTitle$default(WidgetBannerEntity widgetBannerEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return widgetBannerEntity.getTitle(z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionCode() {
        return this.positionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final WidgetBannerImageEntity getDaySrcImgMap() {
        return this.daySrcImgMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WidgetBannerImageEntity getNightSrcImgMap() {
        return this.nightSrcImgMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WidgetBannerTextEntity getSrcTextMap() {
        return this.srcTextMap;
    }

    @NotNull
    public final WidgetBannerEntity copy(@Nullable String id2, @Nullable String positionCode, @Nullable String title, @Nullable String url, @Nullable WidgetBannerImageEntity daySrcImgMap, @Nullable WidgetBannerImageEntity nightSrcImgMap, @Nullable WidgetBannerTextEntity srcTextMap) {
        return new WidgetBannerEntity(id2, positionCode, title, url, daySrcImgMap, nightSrcImgMap, srcTextMap);
    }

    @Nullable
    public final WidgetBannerImageEntity getDaySrcImgMap() {
        return this.daySrcImgMap;
    }

    @Nullable
    public final String getDisplayImageUrl(boolean isFullType) {
        WidgetBannerImageEntity widgetBannerImageEntity = DayNightThemeManager.f28592a.m33187l() ? this.daySrcImgMap : this.nightSrcImgMap;
        if (isFullType) {
            if (widgetBannerImageEntity != null) {
                return widgetBannerImageEntity.getImg_large();
            }
            return null;
        }
        if (widgetBannerImageEntity != null) {
            return widgetBannerImageEntity.getImg_small();
        }
        return null;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final WidgetBannerImageEntity getNightSrcImgMap() {
        return this.nightSrcImgMap;
    }

    @Nullable
    public final String getPositionCode() {
        return this.positionCode;
    }

    @Nullable
    public final WidgetBannerTextEntity getSrcTextMap() {
        return this.srcTextMap;
    }

    @Nullable
    public final String getTitle(boolean isFullType) {
        if (isFullType) {
            WidgetBannerTextEntity widgetBannerTextEntity = this.srcTextMap;
            if (widgetBannerTextEntity != null) {
                return widgetBannerTextEntity.getLarge_text1();
            }
            return null;
        }
        WidgetBannerTextEntity widgetBannerTextEntity2 = this.srcTextMap;
        if (widgetBannerTextEntity2 != null) {
            return widgetBannerTextEntity2.getSmall_text1();
        }
        return null;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WidgetBannerImageEntity widgetBannerImageEntity = this.daySrcImgMap;
        int iHashCode5 = (iHashCode4 + (widgetBannerImageEntity == null ? 0 : widgetBannerImageEntity.hashCode())) * 31;
        WidgetBannerImageEntity widgetBannerImageEntity2 = this.nightSrcImgMap;
        int iHashCode6 = (iHashCode5 + (widgetBannerImageEntity2 == null ? 0 : widgetBannerImageEntity2.hashCode())) * 31;
        WidgetBannerTextEntity widgetBannerTextEntity = this.srcTextMap;
        return iHashCode6 + (widgetBannerTextEntity != null ? widgetBannerTextEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetBannerEntity(id=" + this.id + ", positionCode=" + this.positionCode + ", title=" + this.title + ", url=" + this.url + ", daySrcImgMap=" + this.daySrcImgMap + ", nightSrcImgMap=" + this.nightSrcImgMap + ", srcTextMap=" + this.srcTextMap + ')';
    }

    public WidgetBannerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable WidgetBannerImageEntity widgetBannerImageEntity, @Nullable WidgetBannerImageEntity widgetBannerImageEntity2, @Nullable WidgetBannerTextEntity widgetBannerTextEntity) {
        this.id = str;
        this.positionCode = str2;
        this.title = str3;
        this.url = str4;
        this.daySrcImgMap = widgetBannerImageEntity;
        this.nightSrcImgMap = widgetBannerImageEntity2;
        this.srcTextMap = widgetBannerTextEntity;
    }
}
