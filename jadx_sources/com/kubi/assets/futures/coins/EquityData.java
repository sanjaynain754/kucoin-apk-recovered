package com.kubi.assets.futures.coins;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetFuturesCoinsConstant.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/EquityData;", "", "amount", "", FirebaseAnalytics.Param.PRICE, "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getPrice", "getContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EquityData {

    @Nullable
    private final String amount;

    @NotNull
    private final String content;

    @Nullable
    private final String price;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityData)) {
            return false;
        }
        EquityData equityData = (EquityData) other;
        return Intrinsics.areEqual(this.amount, equityData.amount) && Intrinsics.areEqual(this.price, equityData.price) && Intrinsics.areEqual(this.content, equityData.content);
    }

    public EquityData(@Nullable String str, @Nullable String str2, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.amount = str;
        this.price = str2;
        this.content = content;
    }

    public static /* synthetic */ EquityData copy$default(EquityData equityData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = equityData.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = equityData.price;
        }
        if ((i11 & 4) != 0) {
            str3 = equityData.content;
        }
        return equityData.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final EquityData copy(@Nullable String amount, @Nullable String price, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new EquityData(amount, price, content);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "EquityData(amount=" + this.amount + ", price=" + this.price + ", content=" + this.content + ')';
    }
}
