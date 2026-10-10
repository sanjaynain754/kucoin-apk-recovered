package com.kubi.home.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetBannerEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/entity/WidgetBannerImageEntity;", "", "img_large", "", "img_small", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImg_large", "()Ljava/lang/String;", "getImg_small", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WidgetBannerImageEntity {

    @Nullable
    private final String img_large;

    @Nullable
    private final String img_small;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetBannerImageEntity)) {
            return false;
        }
        WidgetBannerImageEntity widgetBannerImageEntity = (WidgetBannerImageEntity) other;
        return Intrinsics.areEqual(this.img_large, widgetBannerImageEntity.img_large) && Intrinsics.areEqual(this.img_small, widgetBannerImageEntity.img_small);
    }

    public static /* synthetic */ WidgetBannerImageEntity copy$default(WidgetBannerImageEntity widgetBannerImageEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = widgetBannerImageEntity.img_large;
        }
        if ((i11 & 2) != 0) {
            str2 = widgetBannerImageEntity.img_small;
        }
        return widgetBannerImageEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImg_large() {
        return this.img_large;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImg_small() {
        return this.img_small;
    }

    @NotNull
    public final WidgetBannerImageEntity copy(@Nullable String img_large, @Nullable String img_small) {
        return new WidgetBannerImageEntity(img_large, img_small);
    }

    @Nullable
    public final String getImg_large() {
        return this.img_large;
    }

    @Nullable
    public final String getImg_small() {
        return this.img_small;
    }

    public int hashCode() {
        String str = this.img_large;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img_small;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetBannerImageEntity(img_large=" + this.img_large + ", img_small=" + this.img_small + ')';
    }

    public WidgetBannerImageEntity(@Nullable String str, @Nullable String str2) {
        this.img_large = str;
        this.img_small = str2;
    }
}
