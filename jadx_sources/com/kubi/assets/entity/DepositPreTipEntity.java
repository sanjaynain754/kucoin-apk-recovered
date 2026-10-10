package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DepositPreTipEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositPreTipEntity;", "", "code", "", "preTip", "disabledTip", "currencyChainTips", "", "Lcom/kubi/assets/entity/DepositChainPreTipEntity;", "chainTips", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getPreTip", "setPreTip", "getDisabledTip", "setDisabledTip", "getCurrencyChainTips", "()Ljava/util/List;", "setCurrencyChainTips", "(Ljava/util/List;)V", "getChainTips", "setChainTips", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DepositPreTipEntity {

    @Nullable
    private List<DepositChainPreTipEntity> chainTips;

    @Nullable
    private String code;

    @Nullable
    private List<DepositChainPreTipEntity> currencyChainTips;

    @Nullable
    private String disabledTip;

    @Nullable
    private String preTip;

    @Nullable
    public final List<DepositChainPreTipEntity> getChainTips() {
        return this.chainTips;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<DepositChainPreTipEntity> getCurrencyChainTips() {
        return this.currencyChainTips;
    }

    @Nullable
    public final String getDisabledTip() {
        return this.disabledTip;
    }

    @Nullable
    public final String getPreTip() {
        return this.preTip;
    }

    public final void setChainTips(@Nullable List<DepositChainPreTipEntity> list) {
        this.chainTips = list;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setCurrencyChainTips(@Nullable List<DepositChainPreTipEntity> list) {
        this.currencyChainTips = list;
    }

    public final void setDisabledTip(@Nullable String str) {
        this.disabledTip = str;
    }

    public final void setPreTip(@Nullable String str) {
        this.preTip = str;
    }

    public DepositPreTipEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<DepositChainPreTipEntity> list, @Nullable List<DepositChainPreTipEntity> list2) {
        this.code = str;
        this.preTip = str2;
        this.disabledTip = str3;
        this.currencyChainTips = list;
        this.chainTips = list2;
    }
}
