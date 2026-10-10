package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/PayDetail;", "", JAnalysisConstants.Account.KEY_ACCOUNT, "", "buyCurrencyAmount", "Ljava/math/BigDecimal;", "payFiatCurrencyAmount", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAccount", "()Ljava/lang/String;", "getBuyCurrencyAmount", "()Ljava/math/BigDecimal;", "getPayFiatCurrencyAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayDetail {

    @Nullable
    private final String account;

    @Nullable
    private final BigDecimal buyCurrencyAmount;

    @Nullable
    private final BigDecimal payFiatCurrencyAmount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayDetail)) {
            return false;
        }
        PayDetail payDetail = (PayDetail) other;
        return Intrinsics.areEqual(this.account, payDetail.account) && Intrinsics.areEqual(this.buyCurrencyAmount, payDetail.buyCurrencyAmount) && Intrinsics.areEqual(this.payFiatCurrencyAmount, payDetail.payFiatCurrencyAmount);
    }

    public static /* synthetic */ PayDetail copy$default(PayDetail payDetail, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payDetail.account;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = payDetail.buyCurrencyAmount;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = payDetail.payFiatCurrencyAmount;
        }
        return payDetail.copy(str, bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBuyCurrencyAmount() {
        return this.buyCurrencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPayFiatCurrencyAmount() {
        return this.payFiatCurrencyAmount;
    }

    @NotNull
    public final PayDetail copy(@Nullable String account, @Nullable BigDecimal buyCurrencyAmount, @Nullable BigDecimal payFiatCurrencyAmount) {
        return new PayDetail(account, buyCurrencyAmount, payFiatCurrencyAmount);
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final BigDecimal getBuyCurrencyAmount() {
        return this.buyCurrencyAmount;
    }

    @Nullable
    public final BigDecimal getPayFiatCurrencyAmount() {
        return this.payFiatCurrencyAmount;
    }

    public int hashCode() {
        String str = this.account;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.buyCurrencyAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.payFiatCurrencyAmount;
        return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PayDetail(account=" + this.account + ", buyCurrencyAmount=" + this.buyCurrencyAmount + ", payFiatCurrencyAmount=" + this.payFiatCurrencyAmount + ')';
    }

    public PayDetail(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.account = str;
        this.buyCurrencyAmount = bigDecimal;
        this.payFiatCurrencyAmount = bigDecimal2;
    }
}
