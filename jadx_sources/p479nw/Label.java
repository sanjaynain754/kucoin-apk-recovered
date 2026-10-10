package p479nw;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nw.d, reason: from toString */
/* JADX INFO: compiled from: Label.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/Label;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "screenPositionX", "", "screenPositionY", "needShow", "", "value", "", "<init>", "(Ljava/lang/String;FFZD)V", "getLabel", "()Ljava/lang/String;", "getScreenPositionX", "()F", "setScreenPositionX", "(F)V", "getScreenPositionY", "setScreenPositionY", "getNeedShow", "()Z", "setNeedShow", "(Z)V", "getValue", "()D", "setValue", "(D)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Label {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String label;

    /* JADX INFO: renamed from: b, reason: from toString */
    public float screenPositionX;

    /* JADX INFO: renamed from: c, reason: from toString */
    public float screenPositionY;

    /* JADX INFO: renamed from: d, reason: from toString */
    public boolean needShow;

    /* JADX INFO: renamed from: e, reason: from toString */
    public double value;

    public Label() {
        this(null, 0.0f, 0.0f, false, 0.0d, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Label)) {
            return false;
        }
        Label label = (Label) other;
        return Intrinsics.areEqual(this.label, label.label) && Float.compare(this.screenPositionX, label.screenPositionX) == 0 && Float.compare(this.screenPositionY, label.screenPositionY) == 0 && this.needShow == label.needShow && Double.compare(this.value, label.value) == 0;
    }

    public Label(@NotNull String label, float f11, float f12, boolean z11, double d11) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.screenPositionX = f11;
        this.screenPositionY = f12;
        this.needShow = z11;
        this.value = d11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScreenPositionX() {
        return this.screenPositionX;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getScreenPositionY() {
        return this.screenPositionY;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: e */
    public final void m94055e(float f11) {
        this.screenPositionX = f11;
    }

    /* JADX INFO: renamed from: f */
    public final void m94056f(float f11) {
        this.screenPositionY = f11;
    }

    public int hashCode() {
        return (((((((this.label.hashCode() * 31) + Float.hashCode(this.screenPositionX)) * 31) + Float.hashCode(this.screenPositionY)) * 31) + Boolean.hashCode(this.needShow)) * 31) + Double.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "Label(label=" + this.label + ", screenPositionX=" + this.screenPositionX + ", screenPositionY=" + this.screenPositionY + ", needShow=" + this.needShow + ", value=" + this.value + ')';
    }

    public /* synthetic */ Label(String str, float f11, float f12, boolean z11, double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? 0.0d : d11);
    }
}
