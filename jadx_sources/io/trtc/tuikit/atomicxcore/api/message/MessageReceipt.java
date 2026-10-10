package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006!"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;", "Landroid/os/Parcelable;", "isPeerRead", "", "readCount", "", "unreadCount", "(ZII)V", "()Z", "setPeerRead", "(Z)V", "getReadCount", "()I", "setReadCount", "(I)V", "getUnreadCount", "setUnreadCount", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageReceipt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageReceipt> CREATOR = new Creator();
    private boolean isPeerRead;
    private int readCount;
    private int unreadCount;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageReceipt> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageReceipt createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageReceipt(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageReceipt[] newArray(int i11) {
            return new MessageReceipt[i11];
        }
    }

    public MessageReceipt() {
        this(false, 0, 0, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReceipt)) {
            return false;
        }
        MessageReceipt messageReceipt = (MessageReceipt) other;
        return this.isPeerRead == messageReceipt.isPeerRead && this.readCount == messageReceipt.readCount && this.unreadCount == messageReceipt.unreadCount;
    }

    public MessageReceipt(boolean z11, int i11, int i12) {
        this.isPeerRead = z11;
        this.readCount = i11;
        this.unreadCount = i12;
    }

    public static /* synthetic */ MessageReceipt copy$default(MessageReceipt messageReceipt, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = messageReceipt.isPeerRead;
        }
        if ((i13 & 2) != 0) {
            i11 = messageReceipt.readCount;
        }
        if ((i13 & 4) != 0) {
            i12 = messageReceipt.unreadCount;
        }
        return messageReceipt.copy(z11, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsPeerRead() {
        return this.isPeerRead;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReadCount() {
        return this.readCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final MessageReceipt copy(boolean isPeerRead, int readCount, int unreadCount) {
        return new MessageReceipt(isPeerRead, readCount, unreadCount);
    }

    public final int getReadCount() {
        return this.readCount;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.isPeerRead;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return Integer.hashCode(this.unreadCount) + AbstractC39396a.m88225a(this.readCount, r11 * 31, 31);
    }

    public final boolean isPeerRead() {
        return this.isPeerRead;
    }

    public final void setPeerRead(boolean z11) {
        this.isPeerRead = z11;
    }

    public final void setReadCount(int i11) {
        this.readCount = i11;
    }

    public final void setUnreadCount(int i11) {
        this.unreadCount = i11;
    }

    @NotNull
    public String toString() {
        return "MessageReceipt(isPeerRead=" + this.isPeerRead + ", readCount=" + this.readCount + ", unreadCount=" + this.unreadCount + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isPeerRead ? 1 : 0);
        parcel.writeInt(this.readCount);
        parcel.writeInt(this.unreadCount);
    }

    public /* synthetic */ MessageReceipt(boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
