package p435ln;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln.n, reason: from toString */
/* JADX INFO: compiled from: InfoCell.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/kyc/multitype/InfoCell;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "backgroundColorRes", "", "iconRes", ViewProps.PADDING, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getBackgroundColorRes", "()Ljava/lang/Integer;", "setBackgroundColorRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconRes", "setIconRes", "getPadding", "setPadding", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/kyc/multitype/InfoCell;", "equals", "", "other", "hashCode", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class InfoCell {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public String label;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public Integer backgroundColorRes;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public Integer iconRes;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public Integer padding;

    public InfoCell(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.label = str;
        this.backgroundColorRes = num;
        this.iconRes = num2;
        this.padding = num3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoCell)) {
            return false;
        }
        InfoCell infoCell = (InfoCell) other;
        return Intrinsics.areEqual(this.label, infoCell.label) && Intrinsics.areEqual(this.backgroundColorRes, infoCell.backgroundColorRes) && Intrinsics.areEqual(this.iconRes, infoCell.iconRes) && Intrinsics.areEqual(this.padding, infoCell.padding);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBackgroundColorRes() {
        return this.backgroundColorRes;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPadding() {
        return this.padding;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.backgroundColorRes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.iconRes;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.padding;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InfoCell(label=" + this.label + ", backgroundColorRes=" + this.backgroundColorRes + ", iconRes=" + this.iconRes + ", padding=" + this.padding + ')';
    }

    public /* synthetic */ InfoCell(String str, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}
