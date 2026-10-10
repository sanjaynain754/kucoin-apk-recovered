package com.kubi.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareParam.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR+\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m90084d2 = {"Lcom/kubi/share/api/CustomDisplay;", "Landroid/os/Parcelable;", "supportCustom", "", "customCallback", "Lkotlin/Function2;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/fragment/app/DialogFragment;", "", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "getSupportCustom", "()Z", "getCustomCallback$annotations", "()V", "getCustomCallback", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CustomDisplay implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomDisplay> CREATOR = new C24538a();

    @Nullable
    private final Function2<AppCompatTextView, DialogFragment, Unit> customCallback;
    private final boolean supportCustom;

    /* JADX INFO: renamed from: com.kubi.share.api.CustomDisplay$a */
    /* JADX INFO: compiled from: ShareParam.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24538a implements Parcelable.Creator<CustomDisplay> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomDisplay createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomDisplay(parcel.readInt() != 0, null, 2, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomDisplay[] newArray(int i11) {
            return new CustomDisplay[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomDisplay() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomDisplay)) {
            return false;
        }
        CustomDisplay customDisplay = (CustomDisplay) other;
        return this.supportCustom == customDisplay.supportCustom && Intrinsics.areEqual(this.customCallback, customDisplay.customCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomDisplay(boolean z11, @Nullable Function2<? super AppCompatTextView, ? super DialogFragment, Unit> function2) {
        this.supportCustom = z11;
        this.customCallback = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomDisplay copy$default(CustomDisplay customDisplay, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = customDisplay.supportCustom;
        }
        if ((i11 & 2) != 0) {
            function2 = customDisplay.customCallback;
        }
        return customDisplay.copy(z11, function2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSupportCustom() {
        return this.supportCustom;
    }

    @Nullable
    public final Function2<AppCompatTextView, DialogFragment, Unit> component2() {
        return this.customCallback;
    }

    @NotNull
    public final CustomDisplay copy(boolean supportCustom, @Nullable Function2<? super AppCompatTextView, ? super DialogFragment, Unit> customCallback) {
        return new CustomDisplay(supportCustom, customCallback);
    }

    @Nullable
    public final Function2<AppCompatTextView, DialogFragment, Unit> getCustomCallback() {
        return this.customCallback;
    }

    public final boolean getSupportCustom() {
        return this.supportCustom;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.supportCustom) * 31;
        Function2<AppCompatTextView, DialogFragment, Unit> function2 = this.customCallback;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    @NotNull
    public String toString() {
        return "CustomDisplay(supportCustom=" + this.supportCustom + ", customCallback=" + this.customCallback + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.supportCustom ? 1 : 0);
    }

    public /* synthetic */ CustomDisplay(boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : function2);
    }

    public static /* synthetic */ void getCustomCallback$annotations() {
    }
}
