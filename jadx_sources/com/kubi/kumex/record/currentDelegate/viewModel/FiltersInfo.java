package com.kubi.kumex.record.currentDelegate.viewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.m, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: TodoDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/viewModel/FiltersInfo;", "", "symbol", "", "fundsType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getFundsType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiltersInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String fundsType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersInfo)) {
            return false;
        }
        FiltersInfo filtersInfo = (FiltersInfo) other;
        return Intrinsics.areEqual(this.symbol, filtersInfo.symbol) && Intrinsics.areEqual(this.fundsType, filtersInfo.fundsType);
    }

    public FiltersInfo(@Nullable String str, @NotNull String fundsType) {
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        this.symbol = str;
        this.fundsType = fundsType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.fundsType.hashCode();
    }

    @NotNull
    public String toString() {
        return "FiltersInfo(symbol=" + this.symbol + ", fundsType=" + this.fundsType + ')';
    }
}
