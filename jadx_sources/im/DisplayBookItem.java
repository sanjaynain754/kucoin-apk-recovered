package im;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im.f, reason: from toString */
/* JADX INFO: compiled from: BookEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/logic/book/DisplayBookItem;", "", "displayPrice", "", "displayAmount", "displayProgress", "", "isDelegationMark", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZ)V", "getDisplayPrice", "()Ljava/lang/String;", "getDisplayAmount", "getDisplayProgress", "()F", "()Z", "setDelegationMark", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DisplayBookItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String displayPrice;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String displayAmount;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final float displayProgress;

    /* JADX INFO: renamed from: d, reason: from toString */
    public boolean isDelegationMark;

    public DisplayBookItem() {
        this(null, null, 0.0f, false, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayBookItem)) {
            return false;
        }
        DisplayBookItem displayBookItem = (DisplayBookItem) other;
        return Intrinsics.areEqual(this.displayPrice, displayBookItem.displayPrice) && Intrinsics.areEqual(this.displayAmount, displayBookItem.displayAmount) && Float.compare(this.displayProgress, displayBookItem.displayProgress) == 0 && this.isDelegationMark == displayBookItem.isDelegationMark;
    }

    public DisplayBookItem(@Nullable String str, @Nullable String str2, float f11, boolean z11) {
        this.displayPrice = str;
        this.displayAmount = str2;
        this.displayProgress = f11;
        this.isDelegationMark = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getDisplayProgress() {
        return this.displayProgress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsDelegationMark() {
        return this.isDelegationMark;
    }

    /* JADX INFO: renamed from: e */
    public final void m87459e(boolean z11) {
        this.isDelegationMark = z11;
    }

    public int hashCode() {
        String str = this.displayPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayAmount;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.hashCode(this.displayProgress)) * 31) + Boolean.hashCode(this.isDelegationMark);
    }

    @NotNull
    public String toString() {
        return "DisplayBookItem(displayPrice=" + this.displayPrice + ", displayAmount=" + this.displayAmount + ", displayProgress=" + this.displayProgress + ", isDelegationMark=" + this.isDelegationMark + ')';
    }

    public /* synthetic */ DisplayBookItem(String str, String str2, float f11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? false : z11);
    }
}
