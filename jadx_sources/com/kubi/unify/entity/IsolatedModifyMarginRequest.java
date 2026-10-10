package com.kubi.unify.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolatedModifyMarginRequest.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/unify/entity/IsolatedModifyMarginRequest;", "", "symbol", "", "marginAmount", "positionSide", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getMarginAmount", "getPositionSide", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolatedModifyMarginRequest {

    @NotNull
    private final String marginAmount;

    @NotNull
    private final String positionSide;

    @NotNull
    private final String symbol;

    @NotNull
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedModifyMarginRequest)) {
            return false;
        }
        IsolatedModifyMarginRequest isolatedModifyMarginRequest = (IsolatedModifyMarginRequest) other;
        return Intrinsics.areEqual(this.symbol, isolatedModifyMarginRequest.symbol) && Intrinsics.areEqual(this.marginAmount, isolatedModifyMarginRequest.marginAmount) && Intrinsics.areEqual(this.positionSide, isolatedModifyMarginRequest.positionSide) && Intrinsics.areEqual(this.type, isolatedModifyMarginRequest.type);
    }

    public IsolatedModifyMarginRequest(@NotNull String symbol, @NotNull String marginAmount, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginAmount, "marginAmount");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        this.symbol = symbol;
        this.marginAmount = marginAmount;
        this.positionSide = positionSide;
        this.type = type;
    }

    public static /* synthetic */ IsolatedModifyMarginRequest copy$default(IsolatedModifyMarginRequest isolatedModifyMarginRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = isolatedModifyMarginRequest.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = isolatedModifyMarginRequest.marginAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = isolatedModifyMarginRequest.positionSide;
        }
        if ((i11 & 8) != 0) {
            str4 = isolatedModifyMarginRequest.type;
        }
        return isolatedModifyMarginRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarginAmount() {
        return this.marginAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final IsolatedModifyMarginRequest copy(@NotNull String symbol, @NotNull String marginAmount, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginAmount, "marginAmount");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return new IsolatedModifyMarginRequest(symbol, marginAmount, positionSide, type);
    }

    @NotNull
    public final String getMarginAmount() {
        return this.marginAmount;
    }

    @NotNull
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.symbol.hashCode() * 31) + this.marginAmount.hashCode()) * 31) + this.positionSide.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "IsolatedModifyMarginRequest(symbol=" + this.symbol + ", marginAmount=" + this.marginAmount + ", positionSide=" + this.positionSide + ", type=" + this.type + ')';
    }
}
