package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.payment.data.entities.BannerInfo;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReleaseCrypto.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "", DbParams.KEY_CHANNEL_RESULT, "", "banner", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "<init>", "(Ljava/lang/Boolean;Lcom/kubi/payment/data/entities/BannerInfo$Banner;)V", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBanner", "()Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/kubi/payment/data/entities/BannerInfo$Banner;)Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReleaseCrypto {

    @SerializedName("marketingActivity")
    @Nullable
    private final BannerInfo.Banner banner;

    @SerializedName(DbParams.KEY_CHANNEL_RESULT)
    @Nullable
    private final Boolean result;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseCrypto)) {
            return false;
        }
        ReleaseCrypto releaseCrypto = (ReleaseCrypto) other;
        return Intrinsics.areEqual(this.result, releaseCrypto.result) && Intrinsics.areEqual(this.banner, releaseCrypto.banner);
    }

    public static /* synthetic */ ReleaseCrypto copy$default(ReleaseCrypto releaseCrypto, Boolean bool, BannerInfo.Banner banner, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = releaseCrypto.result;
        }
        if ((i11 & 2) != 0) {
            banner = releaseCrypto.banner;
        }
        return releaseCrypto.copy(bool, banner);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BannerInfo.Banner getBanner() {
        return this.banner;
    }

    @NotNull
    public final ReleaseCrypto copy(@Nullable Boolean result, @Nullable BannerInfo.Banner banner) {
        return new ReleaseCrypto(result, banner);
    }

    @Nullable
    public final BannerInfo.Banner getBanner() {
        return this.banner;
    }

    @Nullable
    public final Boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        Boolean bool = this.result;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BannerInfo.Banner banner = this.banner;
        return iHashCode + (banner != null ? banner.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReleaseCrypto(result=" + this.result + ", banner=" + this.banner + ')';
    }

    public ReleaseCrypto(@Nullable Boolean bool, @Nullable BannerInfo.Banner banner) {
        this.result = bool;
        this.banner = banner;
    }
}
