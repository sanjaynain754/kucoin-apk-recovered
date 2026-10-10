package com.kubi.kumex.record.done.viewModel;

import com.kubi.broker.MultiBizType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.InterfaceC46192a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.done.viewModel.b, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: DelegateRecordViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/record/done/viewModel/FiltersInfo;", "", "symbol", "", "type", "time", "Lcom/kubi/futures/dialog/pop/BaseTime;", "accountType", "Lcom/kubi/broker/MultiBizType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/futures/dialog/pop/BaseTime;Lcom/kubi/broker/MultiBizType;)V", "getSymbol", "()Ljava/lang/String;", "getType", "getTime", "()Lcom/kubi/futures/dialog/pop/BaseTime;", "getAccountType", "()Lcom/kubi/broker/MultiBizType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiltersInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String type;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC46192a time;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final MultiBizType accountType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersInfo)) {
            return false;
        }
        FiltersInfo filtersInfo = (FiltersInfo) other;
        return Intrinsics.areEqual(this.symbol, filtersInfo.symbol) && Intrinsics.areEqual(this.type, filtersInfo.type) && Intrinsics.areEqual(this.time, filtersInfo.time) && this.accountType == filtersInfo.accountType;
    }

    public FiltersInfo(@Nullable String str, @Nullable String str2, @NotNull InterfaceC46192a time, @NotNull MultiBizType accountType) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.symbol = str;
        this.type = str2;
        this.time = time;
        this.accountType = accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MultiBizType getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC46192a getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.time.hashCode()) * 31) + this.accountType.hashCode();
    }

    @NotNull
    public String toString() {
        return "FiltersInfo(symbol=" + this.symbol + ", type=" + this.type + ", time=" + this.time + ", accountType=" + this.accountType + ')';
    }
}
