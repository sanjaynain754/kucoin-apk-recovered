package com.kubi.loan.repo.trade.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.BaseConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverManualBorrow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/loan/repo/trade/model/LeverManualBorrow;", "", "<init>", "()V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "loanSize", "Ljava/math/BigDecimal;", "getLoanSize", "()Ljava/math/BigDecimal;", "setLoanSize", "(Ljava/math/BigDecimal;)V", "actualSize", "getActualSize", "setActualSize", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverManualBorrow {

    @NotNull
    private BigDecimal actualSize;

    @NotNull
    private String currency = "";

    @NotNull
    private BigDecimal loanSize;

    @NotNull
    public final BigDecimal getActualSize() {
        return this.actualSize;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final BigDecimal getLoanSize() {
        return this.loanSize;
    }

    public final void setActualSize(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.actualSize = bigDecimal;
    }

    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final void setLoanSize(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.loanSize = bigDecimal;
    }

    public LeverManualBorrow() {
        BaseConstants baseConstants = BaseConstants.f46539a;
        this.loanSize = new BigDecimal(baseConstants.m56608a().toString());
        this.actualSize = new BigDecimal(baseConstants.m56608a().toString());
    }
}
