package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ContractRiskLimitEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001e\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "symbol", "getSymbol", "setSymbol", FirebaseAnalytics.Param.LEVEL, "", "getLevel", "()Ljava/lang/Integer;", "setLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "maxRiskLimit", "Ljava/math/BigDecimal;", "getMaxRiskLimit", "()Ljava/math/BigDecimal;", "setMaxRiskLimit", "(Ljava/math/BigDecimal;)V", "minRiskLimit", "getMinRiskLimit", "setMinRiskLimit", "maxLeverage", "getMaxLeverage", "setMaxLeverage", "initialMargin", "getInitialMargin", "setInitialMargin", "maintainMargin", "getMaintainMargin", "setMaintainMargin", "isTrial", "", "()Ljava/lang/Boolean;", "setTrial", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContractRiskLimitEntity implements Serializable {

    @Nullable
    private String id;

    @Nullable
    private BigDecimal initialMargin;

    @Nullable
    private Boolean isTrial;

    @Nullable
    private Integer level;

    @Nullable
    private BigDecimal maintainMargin;

    @Nullable
    private BigDecimal maxLeverage;

    @Nullable
    private BigDecimal maxRiskLimit;

    @Nullable
    private BigDecimal minRiskLimit;

    @Nullable
    private String symbol;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getInitialMargin() {
        return this.initialMargin;
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final BigDecimal getMaintainMargin() {
        return this.maintainMargin;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    public final BigDecimal getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: isTrial, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setInitialMargin(@Nullable BigDecimal bigDecimal) {
        this.initialMargin = bigDecimal;
    }

    public final void setLevel(@Nullable Integer num) {
        this.level = num;
    }

    public final void setMaintainMargin(@Nullable BigDecimal bigDecimal) {
        this.maintainMargin = bigDecimal;
    }

    public final void setMaxLeverage(@Nullable BigDecimal bigDecimal) {
        this.maxLeverage = bigDecimal;
    }

    public final void setMaxRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.maxRiskLimit = bigDecimal;
    }

    public final void setMinRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.minRiskLimit = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTrial(@Nullable Boolean bool) {
        this.isTrial = bool;
    }
}
