package mt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mt.u, reason: from toString */
/* JADX INFO: compiled from: SelectLabelDialogView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0007\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/otc/view/SelectLabel;", "", "value", "", "iconValue", "isSelect", "", "isIconText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/String;", "getIconValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/otc/view/SelectLabel;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SelectLabel {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String value;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String iconValue;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Boolean isSelect;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean isIconText;

    public SelectLabel(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.value = str;
        this.iconValue = str2;
        this.isSelect = bool;
        this.isIconText = bool2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLabel)) {
            return false;
        }
        SelectLabel selectLabel = (SelectLabel) other;
        return Intrinsics.areEqual(this.value, selectLabel.value) && Intrinsics.areEqual(this.iconValue, selectLabel.iconValue) && Intrinsics.areEqual(this.isSelect, selectLabel.isSelect) && Intrinsics.areEqual(this.isIconText, selectLabel.isIconText);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIconValue() {
        return this.iconValue;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIsIconText() {
        return this.isIconText;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsSelect() {
        return this.isSelect;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSelect;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isIconText;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelectLabel(value=" + this.value + ", iconValue=" + this.iconValue + ", isSelect=" + this.isSelect + ", isIconText=" + this.isIconText + ')';
    }

    public /* synthetic */ SelectLabel(String str, String str2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2);
    }
}
