package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;", "Landroid/os/Parcelable;", "forwardType", "Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;", "mergedForwardInfo", "Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;)V", "getForwardType", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;", "setForwardType", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;)V", "getMergedForwardInfo", "()Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;", "setMergedForwardInfo", "(Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class MessageForwardOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageForwardOption> CREATOR = new Creator();

    @NotNull
    private MessageForwardType forwardType;

    @Nullable
    private MergedForwardInfo mergedForwardInfo;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageForwardOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageForwardOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageForwardOption(MessageForwardType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MergedForwardInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageForwardOption[] newArray(int i11) {
            return new MessageForwardOption[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageForwardOption() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageForwardOption)) {
            return false;
        }
        MessageForwardOption messageForwardOption = (MessageForwardOption) other;
        return this.forwardType == messageForwardOption.forwardType && Intrinsics.areEqual(this.mergedForwardInfo, messageForwardOption.mergedForwardInfo);
    }

    public MessageForwardOption(@NotNull MessageForwardType forwardType, @Nullable MergedForwardInfo mergedForwardInfo) {
        Intrinsics.checkNotNullParameter(forwardType, "forwardType");
        this.forwardType = forwardType;
        this.mergedForwardInfo = mergedForwardInfo;
    }

    public static /* synthetic */ MessageForwardOption copy$default(MessageForwardOption messageForwardOption, MessageForwardType messageForwardType, MergedForwardInfo mergedForwardInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messageForwardType = messageForwardOption.forwardType;
        }
        if ((i11 & 2) != 0) {
            mergedForwardInfo = messageForwardOption.mergedForwardInfo;
        }
        return messageForwardOption.copy(messageForwardType, mergedForwardInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageForwardType getForwardType() {
        return this.forwardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MergedForwardInfo getMergedForwardInfo() {
        return this.mergedForwardInfo;
    }

    @NotNull
    public final MessageForwardOption copy(@NotNull MessageForwardType forwardType, @Nullable MergedForwardInfo mergedForwardInfo) {
        Intrinsics.checkNotNullParameter(forwardType, "forwardType");
        return new MessageForwardOption(forwardType, mergedForwardInfo);
    }

    @NotNull
    public final MessageForwardType getForwardType() {
        return this.forwardType;
    }

    @Nullable
    public final MergedForwardInfo getMergedForwardInfo() {
        return this.mergedForwardInfo;
    }

    public int hashCode() {
        int iHashCode = this.forwardType.hashCode() * 31;
        MergedForwardInfo mergedForwardInfo = this.mergedForwardInfo;
        return iHashCode + (mergedForwardInfo == null ? 0 : mergedForwardInfo.hashCode());
    }

    public final void setForwardType(@NotNull MessageForwardType messageForwardType) {
        Intrinsics.checkNotNullParameter(messageForwardType, "<set-?>");
        this.forwardType = messageForwardType;
    }

    public final void setMergedForwardInfo(@Nullable MergedForwardInfo mergedForwardInfo) {
        this.mergedForwardInfo = mergedForwardInfo;
    }

    @NotNull
    public String toString() {
        return "MessageForwardOption(forwardType=" + this.forwardType + ", mergedForwardInfo=" + this.mergedForwardInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.forwardType.name());
        MergedForwardInfo mergedForwardInfo = this.mergedForwardInfo;
        if (mergedForwardInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mergedForwardInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ MessageForwardOption(MessageForwardType messageForwardType, MergedForwardInfo mergedForwardInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageForwardType.SEPARATE : messageForwardType, (i11 & 2) != 0 ? null : mergedForwardInfo);
    }
}
