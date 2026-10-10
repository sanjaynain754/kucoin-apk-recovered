package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/entity/WealthAssetEntity;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "summary", "Lcom/kubi/assets/entity/Summary;", "wealthHomeUrl", "", "wealthTransactionUrl", "<init>", "(ZLcom/kubi/assets/entity/Summary;Ljava/lang/String;Ljava/lang/String;)V", "getOpen", "()Z", "getSummary", "()Lcom/kubi/assets/entity/Summary;", "getWealthHomeUrl", "()Ljava/lang/String;", "getWealthTransactionUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WealthAssetEntity {
    private final boolean open;

    @Nullable
    private final Summary summary;

    @Nullable
    private final String wealthHomeUrl;

    @Nullable
    private final String wealthTransactionUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WealthAssetEntity)) {
            return false;
        }
        WealthAssetEntity wealthAssetEntity = (WealthAssetEntity) other;
        return this.open == wealthAssetEntity.open && Intrinsics.areEqual(this.summary, wealthAssetEntity.summary) && Intrinsics.areEqual(this.wealthHomeUrl, wealthAssetEntity.wealthHomeUrl) && Intrinsics.areEqual(this.wealthTransactionUrl, wealthAssetEntity.wealthTransactionUrl);
    }

    public static /* synthetic */ WealthAssetEntity copy$default(WealthAssetEntity wealthAssetEntity, boolean z11, Summary summary, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = wealthAssetEntity.open;
        }
        if ((i11 & 2) != 0) {
            summary = wealthAssetEntity.summary;
        }
        if ((i11 & 4) != 0) {
            str = wealthAssetEntity.wealthHomeUrl;
        }
        if ((i11 & 8) != 0) {
            str2 = wealthAssetEntity.wealthTransactionUrl;
        }
        return wealthAssetEntity.copy(z11, summary, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOpen() {
        return this.open;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWealthHomeUrl() {
        return this.wealthHomeUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWealthTransactionUrl() {
        return this.wealthTransactionUrl;
    }

    @NotNull
    public final WealthAssetEntity copy(boolean open, @Nullable Summary summary, @Nullable String wealthHomeUrl, @Nullable String wealthTransactionUrl) {
        return new WealthAssetEntity(open, summary, wealthHomeUrl, wealthTransactionUrl);
    }

    public final boolean getOpen() {
        return this.open;
    }

    @Nullable
    public final Summary getSummary() {
        return this.summary;
    }

    @Nullable
    public final String getWealthHomeUrl() {
        return this.wealthHomeUrl;
    }

    @Nullable
    public final String getWealthTransactionUrl() {
        return this.wealthTransactionUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.open) * 31;
        Summary summary = this.summary;
        int iHashCode2 = (iHashCode + (summary == null ? 0 : summary.hashCode())) * 31;
        String str = this.wealthHomeUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wealthTransactionUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WealthAssetEntity(open=" + this.open + ", summary=" + this.summary + ", wealthHomeUrl=" + this.wealthHomeUrl + ", wealthTransactionUrl=" + this.wealthTransactionUrl + ')';
    }

    public WealthAssetEntity(boolean z11, @Nullable Summary summary, @Nullable String str, @Nullable String str2) {
        this.open = z11;
        this.summary = summary;
        this.wealthHomeUrl = str;
        this.wealthTransactionUrl = str2;
    }
}
