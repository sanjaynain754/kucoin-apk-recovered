package com.kubi.spot.business;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.m3, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: NFTDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/spot/business/NFTItem;", "", "isMediaJump", "", "url", "", "medeaJumpText", "mediaJumpLink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getUrl", "()Ljava/lang/String;", "getMedeaJumpText", "getMediaJumpLink", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NFTItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isMediaJump;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String url;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String medeaJumpText;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String mediaJumpLink;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NFTItem)) {
            return false;
        }
        NFTItem nFTItem = (NFTItem) other;
        return this.isMediaJump == nFTItem.isMediaJump && Intrinsics.areEqual(this.url, nFTItem.url) && Intrinsics.areEqual(this.medeaJumpText, nFTItem.medeaJumpText) && Intrinsics.areEqual(this.mediaJumpLink, nFTItem.mediaJumpLink);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMedeaJumpText() {
        return this.medeaJumpText;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMediaJumpLink() {
        return this.mediaJumpLink;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsMediaJump() {
        return this.isMediaJump;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isMediaJump) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.medeaJumpText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaJumpLink;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NFTItem(isMediaJump=" + this.isMediaJump + ", url=" + this.url + ", medeaJumpText=" + this.medeaJumpText + ", mediaJumpLink=" + this.mediaJumpLink + ')';
    }

    public NFTItem(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.isMediaJump = z11;
        this.url = str;
        this.medeaJumpText = str2;
        this.mediaJumpLink = str3;
    }
}
