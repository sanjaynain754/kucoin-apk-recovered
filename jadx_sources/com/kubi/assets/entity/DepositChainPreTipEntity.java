package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DepositChainPreTipEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositChainPreTipEntity;", "", "chain", "", "preTip", "disabledTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChain", "()Ljava/lang/String;", "setChain", "(Ljava/lang/String;)V", "getPreTip", "setPreTip", "getDisabledTip", "setDisabledTip", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DepositChainPreTipEntity {

    @Nullable
    private String chain;

    @Nullable
    private String disabledTip;

    @Nullable
    private String preTip;

    @Nullable
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    public final String getDisabledTip() {
        return this.disabledTip;
    }

    @Nullable
    public final String getPreTip() {
        return this.preTip;
    }

    public final void setChain(@Nullable String str) {
        this.chain = str;
    }

    public final void setDisabledTip(@Nullable String str) {
        this.disabledTip = str;
    }

    public final void setPreTip(@Nullable String str) {
        this.preTip = str;
    }

    public DepositChainPreTipEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.chain = str;
        this.preTip = str2;
        this.disabledTip = str3;
    }
}
