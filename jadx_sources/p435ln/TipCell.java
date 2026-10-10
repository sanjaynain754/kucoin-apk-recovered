package p435ln;

import android.text.SpannableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln.h0, reason: from toString */
/* JADX INFO: compiled from: TipCell.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m90084d2 = {"Lcom/kubi/kyc/multitype/TipCell;", "", "tip", "Landroid/text/SpannableString;", "textColor", "", "textSize", "", "showDot", "", "<init>", "(Landroid/text/SpannableString;ILjava/lang/Float;Z)V", "getTip", "()Landroid/text/SpannableString;", "setTip", "(Landroid/text/SpannableString;)V", "getTextColor", "()I", "getTextSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getShowDot", "()Z", "component1", "component2", "component3", "component4", "copy", "(Landroid/text/SpannableString;ILjava/lang/Float;Z)Lcom/kubi/kyc/multitype/TipCell;", "equals", "other", "hashCode", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TipCell {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public SpannableString tip;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int textColor;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Float textSize;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean showDot;

    public TipCell(@NotNull SpannableString tip, int i11, @Nullable Float f11, boolean z11) {
        Intrinsics.checkNotNullParameter(tip, "tip");
        this.tip = tip;
        this.textColor = i11;
        this.textSize = f11;
        this.showDot = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCell)) {
            return false;
        }
        TipCell tipCell = (TipCell) other;
        return Intrinsics.areEqual(this.tip, tipCell.tip) && this.textColor == tipCell.textColor && Intrinsics.areEqual((Object) this.textSize, (Object) tipCell.textSize) && this.showDot == tipCell.showDot;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowDot() {
        return this.showDot;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getTextSize() {
        return this.textSize;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SpannableString getTip() {
        return this.tip;
    }

    /* JADX INFO: renamed from: e */
    public final void m92723e(@NotNull SpannableString spannableString) {
        Intrinsics.checkNotNullParameter(spannableString, "<set-?>");
        this.tip = spannableString;
    }

    public int hashCode() {
        int iHashCode = ((this.tip.hashCode() * 31) + Integer.hashCode(this.textColor)) * 31;
        Float f11 = this.textSize;
        return ((iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31) + Boolean.hashCode(this.showDot);
    }

    @NotNull
    public String toString() {
        return "TipCell(tip=" + ((Object) this.tip) + ", textColor=" + this.textColor + ", textSize=" + this.textSize + ", showDot=" + this.showDot + ')';
    }

    public /* synthetic */ TipCell(SpannableString spannableString, int i11, Float f11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(spannableString, i11, (i12 & 4) != 0 ? null : f11, (i12 & 8) != 0 ? false : z11);
    }
}
