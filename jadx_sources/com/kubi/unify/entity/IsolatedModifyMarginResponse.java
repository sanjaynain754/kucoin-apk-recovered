package com.kubi.unify.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolatedModifyMarginResponse.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/unify/entity/IsolatedModifyMarginResponse;", "", "symbol", "", "marginAmount", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getMarginAmount", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolatedModifyMarginResponse {

    @NotNull
    private final String marginAmount;

    @NotNull
    private final String symbol;

    @NotNull
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedModifyMarginResponse)) {
            return false;
        }
        IsolatedModifyMarginResponse isolatedModifyMarginResponse = (IsolatedModifyMarginResponse) other;
        return Intrinsics.areEqual(this.symbol, isolatedModifyMarginResponse.symbol) && Intrinsics.areEqual(this.marginAmount, isolatedModifyMarginResponse.marginAmount) && Intrinsics.areEqual(this.type, isolatedModifyMarginResponse.type);
    }

    public IsolatedModifyMarginResponse(@NotNull String symbol, @NotNull String marginAmount, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginAmount, "marginAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.symbol = symbol;
        this.marginAmount = marginAmount;
        this.type = type;
    }

    public static /* synthetic */ IsolatedModifyMarginResponse copy$default(IsolatedModifyMarginResponse isolatedModifyMarginResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = isolatedModifyMarginResponse.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = isolatedModifyMarginResponse.marginAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = isolatedModifyMarginResponse.type;
        }
        return isolatedModifyMarginResponse.copy(str, str2, str3);
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
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final IsolatedModifyMarginResponse copy(@NotNull String symbol, @NotNull String marginAmount, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginAmount, "marginAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        return new IsolatedModifyMarginResponse(symbol, marginAmount, type);
    }

    @NotNull
    public final String getMarginAmount() {
        return this.marginAmount;
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
        return (((this.symbol.hashCode() * 31) + this.marginAmount.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "IsolatedModifyMarginResponse(symbol=" + this.symbol + ", marginAmount=" + this.marginAmount + ", type=" + this.type + ')';
    }
}
