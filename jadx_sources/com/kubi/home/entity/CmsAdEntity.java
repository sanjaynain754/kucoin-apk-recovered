package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CmsAdEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/entity/CmsAdEntity;", "", "imageUrl", "", "daytimeImageUrl", "url", "alt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getDaytimeImageUrl", "getUrl", "getAlt", "iconUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CmsAdEntity {

    @Nullable
    private final String alt;

    @SerializedName("daytime_image_url")
    @Nullable
    private final String daytimeImageUrl;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsAdEntity)) {
            return false;
        }
        CmsAdEntity cmsAdEntity = (CmsAdEntity) other;
        return Intrinsics.areEqual(this.imageUrl, cmsAdEntity.imageUrl) && Intrinsics.areEqual(this.daytimeImageUrl, cmsAdEntity.daytimeImageUrl) && Intrinsics.areEqual(this.url, cmsAdEntity.url) && Intrinsics.areEqual(this.alt, cmsAdEntity.alt);
    }

    public static /* synthetic */ CmsAdEntity copy$default(CmsAdEntity cmsAdEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cmsAdEntity.imageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = cmsAdEntity.daytimeImageUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = cmsAdEntity.url;
        }
        if ((i11 & 8) != 0) {
            str4 = cmsAdEntity.alt;
        }
        return cmsAdEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDaytimeImageUrl() {
        return this.daytimeImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    public final CmsAdEntity copy(@Nullable String imageUrl, @Nullable String daytimeImageUrl, @Nullable String url, @Nullable String alt) {
        return new CmsAdEntity(imageUrl, daytimeImageUrl, url, alt);
    }

    @Nullable
    public final String getAlt() {
        return this.alt;
    }

    @Nullable
    public final String getDaytimeImageUrl() {
        return this.daytimeImageUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.daytimeImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.alt;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String iconUrl() {
        return DayNightThemeManager.f28592a.m33187l() ? C27041f.m66668h(this.daytimeImageUrl) : C27041f.m66668h(this.imageUrl);
    }

    @NotNull
    public String toString() {
        return "CmsAdEntity(imageUrl=" + this.imageUrl + ", daytimeImageUrl=" + this.daytimeImageUrl + ", url=" + this.url + ", alt=" + this.alt + ')';
    }

    public CmsAdEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.imageUrl = str;
        this.daytimeImageUrl = str2;
        this.url = str3;
        this.alt = str4;
    }
}
