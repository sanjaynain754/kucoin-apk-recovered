package io.trtc.tuikit.atomicxcore.api.message;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00065"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;", "Landroid/os/Parcelable;", "msgID", "", "msgSender", "msgAbstract", "msgStatus", "Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;", "messageType", "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "messageBody", "Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;)V", "getMessageBody", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;", "setMessageBody", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;)V", "getMessageType", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "setMessageType", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;)V", "getMsgAbstract", "()Ljava/lang/String;", "setMsgAbstract", "(Ljava/lang/String;)V", "getMsgID", "setMsgID", "getMsgSender", "setMsgSender", "getMsgStatus", "()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;", "setMsgStatus", "(Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ReplyMessageInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReplyMessageInfo> CREATOR = new Creator();

    @Nullable
    private MessageBody messageBody;

    @Nullable
    private MessageType messageType;

    @Nullable
    private String msgAbstract;

    @Nullable
    private String msgID;

    @Nullable
    private String msgSender;

    @Nullable
    private MessageStatus msgStatus;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ReplyMessageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReplyMessageInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReplyMessageInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MessageStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MessageType.valueOf(parcel.readString()), parcel.readInt() != 0 ? MessageBody.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReplyMessageInfo[] newArray(int i11) {
            return new ReplyMessageInfo[i11];
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
        if (!(other instanceof ReplyMessageInfo)) {
            return false;
        }
        ReplyMessageInfo replyMessageInfo = (ReplyMessageInfo) other;
        return Intrinsics.areEqual(this.msgID, replyMessageInfo.msgID) && Intrinsics.areEqual(this.msgSender, replyMessageInfo.msgSender) && Intrinsics.areEqual(this.msgAbstract, replyMessageInfo.msgAbstract) && this.msgStatus == replyMessageInfo.msgStatus && this.messageType == replyMessageInfo.messageType && Intrinsics.areEqual(this.messageBody, replyMessageInfo.messageBody);
    }

    public static /* synthetic */ ReplyMessageInfo copy$default(ReplyMessageInfo replyMessageInfo, String str, String str2, String str3, MessageStatus messageStatus, MessageType messageType, MessageBody messageBody, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = replyMessageInfo.msgID;
        }
        if ((i11 & 2) != 0) {
            str2 = replyMessageInfo.msgSender;
        }
        if ((i11 & 4) != 0) {
            str3 = replyMessageInfo.msgAbstract;
        }
        if ((i11 & 8) != 0) {
            messageStatus = replyMessageInfo.msgStatus;
        }
        if ((i11 & 16) != 0) {
            messageType = replyMessageInfo.messageType;
        }
        if ((i11 & 32) != 0) {
            messageBody = replyMessageInfo.messageBody;
        }
        MessageType messageType2 = messageType;
        MessageBody messageBody2 = messageBody;
        return replyMessageInfo.copy(str, str2, str3, messageStatus, messageType2, messageBody2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsgID() {
        return this.msgID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsgSender() {
        return this.msgSender;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsgAbstract() {
        return this.msgAbstract;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageStatus getMsgStatus() {
        return this.msgStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MessageType getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    @NotNull
    public final ReplyMessageInfo copy(@Nullable String msgID, @Nullable String msgSender, @Nullable String msgAbstract, @Nullable MessageStatus msgStatus, @Nullable MessageType messageType, @Nullable MessageBody messageBody) {
        return new ReplyMessageInfo(msgID, msgSender, msgAbstract, msgStatus, messageType, messageBody);
    }

    @Nullable
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    @Nullable
    public final MessageType getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final String getMsgAbstract() {
        return this.msgAbstract;
    }

    @Nullable
    public final String getMsgID() {
        return this.msgID;
    }

    @Nullable
    public final String getMsgSender() {
        return this.msgSender;
    }

    @Nullable
    public final MessageStatus getMsgStatus() {
        return this.msgStatus;
    }

    public int hashCode() {
        String str = this.msgID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msgSender;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.msgAbstract;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MessageStatus messageStatus = this.msgStatus;
        int iHashCode4 = (iHashCode3 + (messageStatus == null ? 0 : messageStatus.hashCode())) * 31;
        MessageType messageType = this.messageType;
        int iHashCode5 = (iHashCode4 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        MessageBody messageBody = this.messageBody;
        return iHashCode5 + (messageBody != null ? messageBody.hashCode() : 0);
    }

    public final void setMessageBody(@Nullable MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    public final void setMessageType(@Nullable MessageType messageType) {
        this.messageType = messageType;
    }

    public final void setMsgAbstract(@Nullable String str) {
        this.msgAbstract = str;
    }

    public final void setMsgID(@Nullable String str) {
        this.msgID = str;
    }

    public final void setMsgSender(@Nullable String str) {
        this.msgSender = str;
    }

    public final void setMsgStatus(@Nullable MessageStatus messageStatus) {
        this.msgStatus = messageStatus;
    }

    @NotNull
    public String toString() {
        return "ReplyMessageInfo(msgID=" + this.msgID + ", msgSender=" + this.msgSender + ", msgAbstract=" + this.msgAbstract + ", msgStatus=" + this.msgStatus + ", messageType=" + this.messageType + ", messageBody=" + this.messageBody + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.msgID);
        parcel.writeString(this.msgSender);
        parcel.writeString(this.msgAbstract);
        MessageStatus messageStatus = this.msgStatus;
        if (messageStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(messageStatus.name());
        }
        MessageType messageType = this.messageType;
        if (messageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(messageType.name());
        }
        MessageBody messageBody = this.messageBody;
        if (messageBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageBody.writeToParcel(parcel, flags);
        }
    }

    public ReplyMessageInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable MessageStatus messageStatus, @Nullable MessageType messageType, @Nullable MessageBody messageBody) {
        this.msgID = str;
        this.msgSender = str2;
        this.msgAbstract = str3;
        this.msgStatus = messageStatus;
        this.messageType = messageType;
        this.messageBody = messageBody;
    }
}
