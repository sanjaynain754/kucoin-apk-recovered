package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NavigationAvatarEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/entity/NavigationAvatarEntity;", "", "imageUrl", "", "daytimeImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getDaytimeImageUrl", "avatar", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NavigationAvatarEntity {

    @SerializedName("daytime_image_url")
    @Nullable
    private final String daytimeImageUrl;

    @Nullable
    private final String imageUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationAvatarEntity)) {
            return false;
        }
        NavigationAvatarEntity navigationAvatarEntity = (NavigationAvatarEntity) other;
        return Intrinsics.areEqual(this.imageUrl, navigationAvatarEntity.imageUrl) && Intrinsics.areEqual(this.daytimeImageUrl, navigationAvatarEntity.daytimeImageUrl);
    }

    public static /* synthetic */ NavigationAvatarEntity copy$default(NavigationAvatarEntity navigationAvatarEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationAvatarEntity.imageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = navigationAvatarEntity.daytimeImageUrl;
        }
        return navigationAvatarEntity.copy(str, str2);
    }

    @NotNull
    public final String avatar() {
        return DayNightThemeManager.f28592a.m33187l() ? C27041f.m66668h(this.daytimeImageUrl) : C27041f.m66668h(this.imageUrl);
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

    @NotNull
    public final NavigationAvatarEntity copy(@Nullable String imageUrl, @Nullable String daytimeImageUrl) {
        return new NavigationAvatarEntity(imageUrl, daytimeImageUrl);
    }

    @Nullable
    public final String getDaytimeImageUrl() {
        return this.daytimeImageUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.daytimeImageUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NavigationAvatarEntity(imageUrl=" + this.imageUrl + ", daytimeImageUrl=" + this.daytimeImageUrl + ')';
    }

    public NavigationAvatarEntity(@Nullable String str, @Nullable String str2) {
        this.imageUrl = str;
        this.daytimeImageUrl = str2;
    }
}
