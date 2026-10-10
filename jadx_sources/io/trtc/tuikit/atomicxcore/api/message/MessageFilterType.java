package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0004J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;", "Landroid/os/Parcelable;", "value", "", "(I)V", "getValue", "()I", "component1", "contains", "", "other", "copy", "describeContents", "equals", "", "hashCode", "or", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageFilterType implements Parcelable {
    private final int value;

    @NotNull
    public static final Parcelable.Creator<MessageFilterType> CREATOR = new Creator();

    @JvmField
    @NotNull
    public static final MessageFilterType All = new MessageFilterType(1);

    @JvmField
    @NotNull
    public static final MessageFilterType Image = new MessageFilterType(2);

    @JvmField
    @NotNull
    public static final MessageFilterType Video = new MessageFilterType(4);

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageFilterType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageFilterType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageFilterType(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageFilterType[] newArray(int i11) {
            return new MessageFilterType[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageFilterType) && this.value == ((MessageFilterType) other).value;
    }

    public static /* synthetic */ MessageFilterType copy$default(MessageFilterType messageFilterType, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = messageFilterType.value;
        }
        return messageFilterType.copy(i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final boolean contains(@NotNull MessageFilterType other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (other.value & this.value) != 0;
    }

    @NotNull
    public final MessageFilterType copy(int value) {
        return new MessageFilterType(value);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @NotNull
    /* JADX INFO: renamed from: or */
    public final MessageFilterType m88227or(@NotNull MessageFilterType other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new MessageFilterType(other.value | this.value);
    }

    @NotNull
    public String toString() {
        return "MessageFilterType(value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.value);
    }

    public MessageFilterType(int i11) {
        this.value = i11;
    }
}
