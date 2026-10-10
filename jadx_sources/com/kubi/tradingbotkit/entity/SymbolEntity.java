package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SymbolEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/SymbolEntity;", "", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolEntity {

    @Nullable
    private Integer status = 0;

    @Nullable
    private String symbol;

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }
}
