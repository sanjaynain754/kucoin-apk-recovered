package com.kubi.share.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareReferralEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/share/api/entity/ShareReferralEntity;", "", "title", "", "ads", "Lcom/kubi/share/api/entity/Ads;", "referralCode", "referralUrl", "<init>", "(Ljava/lang/String;Lcom/kubi/share/api/entity/Ads;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getAds", "()Lcom/kubi/share/api/entity/Ads;", "setAds", "(Lcom/kubi/share/api/entity/Ads;)V", "getReferralCode$annotations", "()V", "getReferralCode", "setReferralCode", "getReferralUrl", "setReferralUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShareReferralEntity {

    @Nullable
    private Ads ads;

    @Nullable
    private String referralCode;

    @Nullable
    private String referralUrl;

    @Nullable
    private String title;

    public ShareReferralEntity(@Nullable String str, @Nullable Ads ads, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.ads = ads;
        this.referralCode = str2;
        this.referralUrl = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareReferralEntity)) {
            return false;
        }
        ShareReferralEntity shareReferralEntity = (ShareReferralEntity) other;
        return Intrinsics.areEqual(this.title, shareReferralEntity.title) && Intrinsics.areEqual(this.ads, shareReferralEntity.ads) && Intrinsics.areEqual(this.referralCode, shareReferralEntity.referralCode) && Intrinsics.areEqual(this.referralUrl, shareReferralEntity.referralUrl);
    }

    public static /* synthetic */ ShareReferralEntity copy$default(ShareReferralEntity shareReferralEntity, String str, Ads ads, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareReferralEntity.title;
        }
        if ((i11 & 2) != 0) {
            ads = shareReferralEntity.ads;
        }
        if ((i11 & 4) != 0) {
            str2 = shareReferralEntity.referralCode;
        }
        if ((i11 & 8) != 0) {
            str3 = shareReferralEntity.referralUrl;
        }
        return shareReferralEntity.copy(str, ads, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Ads getAds() {
        return this.ads;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferralUrl() {
        return this.referralUrl;
    }

    @NotNull
    public final ShareReferralEntity copy(@Nullable String title, @Nullable Ads ads, @Nullable String referralCode, @Nullable String referralUrl) {
        return new ShareReferralEntity(title, ads, referralCode, referralUrl);
    }

    @Nullable
    public final Ads getAds() {
        return this.ads;
    }

    @Nullable
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    public final String getReferralUrl() {
        return this.referralUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ads ads = this.ads;
        int iHashCode2 = (iHashCode + (ads == null ? 0 : ads.hashCode())) * 31;
        String str2 = this.referralCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referralUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAds(@Nullable Ads ads) {
        this.ads = ads;
    }

    public final void setReferralCode(@Nullable String str) {
        this.referralCode = str;
    }

    public final void setReferralUrl(@Nullable String str) {
        this.referralUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "ShareReferralEntity(title=" + this.title + ", ads=" + this.ads + ", referralCode=" + this.referralCode + ", referralUrl=" + this.referralUrl + ')';
    }

    public /* synthetic */ ShareReferralEntity(String str, Ads ads, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : ads, (i11 & 4) != 0 ? null : str2, str3);
    }

    @Deprecated(message = "use IShareService.get().getShareReferralCode()")
    public static /* synthetic */ void getReferralCode$annotations() {
    }
}
