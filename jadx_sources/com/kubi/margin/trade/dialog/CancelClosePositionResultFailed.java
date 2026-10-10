package com.kubi.margin.trade.dialog;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.c, reason: from toString */
/* JADX INFO: compiled from: CrossMarginCloseContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$CancelClosePositionResultFailed;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event;", "e", "", "<init>", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CancelClosePositionResultFailed implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Throwable e;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CancelClosePositionResultFailed) && Intrinsics.areEqual(this.e, ((CancelClosePositionResultFailed) other).e);
    }

    public CancelClosePositionResultFailed(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.e = e11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getE() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    @NotNull
    public String toString() {
        return "CancelClosePositionResultFailed(e=" + this.e + ')';
    }
}
