package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AllContractLeverageUpdateRequest.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "", "primarySymbol", "", "leverage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrimarySymbol", "()Ljava/lang/String;", "getLeverage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AllContractLeverageUpdateRequest {

    @NotNull
    private final String leverage;

    @NotNull
    private final String primarySymbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllContractLeverageUpdateRequest)) {
            return false;
        }
        AllContractLeverageUpdateRequest allContractLeverageUpdateRequest = (AllContractLeverageUpdateRequest) other;
        return Intrinsics.areEqual(this.primarySymbol, allContractLeverageUpdateRequest.primarySymbol) && Intrinsics.areEqual(this.leverage, allContractLeverageUpdateRequest.leverage);
    }

    public AllContractLeverageUpdateRequest(@NotNull String primarySymbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        this.primarySymbol = primarySymbol;
        this.leverage = leverage;
    }

    public static /* synthetic */ AllContractLeverageUpdateRequest copy$default(AllContractLeverageUpdateRequest allContractLeverageUpdateRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = allContractLeverageUpdateRequest.primarySymbol;
        }
        if ((i11 & 2) != 0) {
            str2 = allContractLeverageUpdateRequest.leverage;
        }
        return allContractLeverageUpdateRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimarySymbol() {
        return this.primarySymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final AllContractLeverageUpdateRequest copy(@NotNull String primarySymbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        return new AllContractLeverageUpdateRequest(primarySymbol, leverage);
    }

    @NotNull
    public final String getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final String getPrimarySymbol() {
        return this.primarySymbol;
    }

    public int hashCode() {
        return (this.primarySymbol.hashCode() * 31) + this.leverage.hashCode();
    }

    @NotNull
    public String toString() {
        return "AllContractLeverageUpdateRequest(primarySymbol=" + this.primarySymbol + ", leverage=" + this.leverage + ')';
    }
}
