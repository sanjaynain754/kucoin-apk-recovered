package com.kubi.assets.bill;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FilterOptionDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/bill/FilterOptionItem;", "Landroid/os/Parcelable;", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getLabel", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FilterOptionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FilterOptionItem> CREATOR = new C9570a();
    private boolean checked;

    @NotNull
    private final String id;

    @NotNull
    private final String label;

    /* JADX INFO: renamed from: com.kubi.assets.bill.FilterOptionItem$a */
    /* JADX INFO: compiled from: FilterOptionDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9570a implements Parcelable.Creator<FilterOptionItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterOptionItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FilterOptionItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FilterOptionItem[] newArray(int i11) {
            return new FilterOptionItem[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterOptionItem)) {
            return false;
        }
        FilterOptionItem filterOptionItem = (FilterOptionItem) other;
        return Intrinsics.areEqual(this.id, filterOptionItem.id) && Intrinsics.areEqual(this.label, filterOptionItem.label) && this.checked == filterOptionItem.checked;
    }

    public FilterOptionItem(@NotNull String id2, @NotNull String label, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.id = id2;
        this.label = label;
        this.checked = z11;
    }

    public static /* synthetic */ FilterOptionItem copy$default(FilterOptionItem filterOptionItem, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = filterOptionItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = filterOptionItem.label;
        }
        if ((i11 & 4) != 0) {
            z11 = filterOptionItem.checked;
        }
        return filterOptionItem.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final FilterOptionItem copy(@NotNull String id2, @NotNull String label, boolean checked) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        return new FilterOptionItem(id2, label, checked);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.checked);
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    @NotNull
    public String toString() {
        return "FilterOptionItem(id=" + this.id + ", label=" + this.label + ", checked=" + this.checked + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeInt(this.checked ? 1 : 0);
    }
}
