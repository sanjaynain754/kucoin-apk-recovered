package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/AdditionMessage;", "Landroid/os/Parcelable;", "showButton", "", "showDrawButton", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getShowButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowDrawButton", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/operation/lib/entity/AdditionMessage;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AdditionMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionMessage> CREATOR = new C19503a();

    @Nullable
    private final Boolean showButton;

    @Nullable
    private final Boolean showDrawButton;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.AdditionMessage$a */
    /* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19503a implements Parcelable.Creator<AdditionMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdditionMessage createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdditionMessage(boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AdditionMessage[] newArray(int i11) {
            return new AdditionMessage[i11];
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
        if (!(other instanceof AdditionMessage)) {
            return false;
        }
        AdditionMessage additionMessage = (AdditionMessage) other;
        return Intrinsics.areEqual(this.showButton, additionMessage.showButton) && Intrinsics.areEqual(this.showDrawButton, additionMessage.showDrawButton);
    }

    public static /* synthetic */ AdditionMessage copy$default(AdditionMessage additionMessage, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = additionMessage.showButton;
        }
        if ((i11 & 2) != 0) {
            bool2 = additionMessage.showDrawButton;
        }
        return additionMessage.copy(bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getShowButton() {
        return this.showButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShowDrawButton() {
        return this.showDrawButton;
    }

    @NotNull
    public final AdditionMessage copy(@Nullable Boolean showButton, @Nullable Boolean showDrawButton) {
        return new AdditionMessage(showButton, showDrawButton);
    }

    @Nullable
    public final Boolean getShowButton() {
        return this.showButton;
    }

    @Nullable
    public final Boolean getShowDrawButton() {
        return this.showDrawButton;
    }

    public int hashCode() {
        Boolean bool = this.showButton;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showDrawButton;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdditionMessage(showButton=" + this.showButton + ", showDrawButton=" + this.showDrawButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.showButton;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showDrawButton;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public AdditionMessage(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.showButton = bool;
        this.showDrawButton = bool2;
    }
}
