.class public final Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008a\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0011\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0011\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u0010\'J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0007H\u00c6\u0003J\t\u0010o\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010q\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010s\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010t\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0011H\u00c6\u0003J\u000f\u0010u\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0011H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010 H\u00c6\u0003J\t\u0010w\u001a\u00020\u000fH\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010&H\u00c6\u0003J\t\u0010|\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010iJ\n\u0010\u0080\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000fH\u00c6\u0003J\u0010\u0010\u0082\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u0092\u0002\u0010\u0083\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00072\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00112\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00112\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010!\u001a\u00020\u000f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0084\u0001J\n\u0010\u0085\u0001\u001a\u00020\u000fH\u00d6\u0001J\u0016\u0010\u0086\u0001\u001a\u00020\u00072\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u00d6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000fH\u00d6\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001e\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0008\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000fH\u00d6\u0001R \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R \u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010)\"\u0004\u0008-\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u00102\"\u0004\u00083\u00104R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u00102\"\u0004\u00085\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010/\"\u0004\u0008?\u00101R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u00102\"\u0004\u0008A\u00104R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u001c\u0010\"\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008R\u0010)\"\u0004\u0008S\u0010+R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008X\u0010/\"\u0004\u0008Y\u00101R\u001a\u0010!\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Z\u0010G\"\u0004\u0008[\u0010IR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\\\u0010K\"\u0004\u0008]\u0010MR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008f\u00102\"\u0004\u0008g\u00104R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010l\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010k\u00a8\u0006\u0090\u0001"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;",
        "Landroid/os/Parcelable;",
        "msgID",
        "",
        "sender",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;",
        "isSelf",
        "",
        "receiver",
        "groupID",
        "timestamp",
        "",
        "status",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;",
        "progress",
        "",
        "atUserList",
        "",
        "isPinned",
        "messageType",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;",
        "messageBody",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;",
        "needReadReceipt",
        "receipt",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;",
        "supportExtension",
        "extensionList",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
        "reactionList",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
        "replyMessageInfo",
        "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
        "repliedMessageCount",
        "quoteMessageInfo",
        "offlinePushInfo",
        "Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;",
        "rawMessage",
        "Lcom/tencent/imsdk/v2/V2TIMMessage;",
        "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V",
        "getAtUserList",
        "()Ljava/util/List;",
        "setAtUserList",
        "(Ljava/util/List;)V",
        "getExtensionList",
        "setExtensionList",
        "getGroupID",
        "()Ljava/lang/String;",
        "setGroupID",
        "(Ljava/lang/String;)V",
        "()Z",
        "setPinned",
        "(Z)V",
        "setSelf",
        "getMessageBody",
        "()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;",
        "setMessageBody",
        "(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;)V",
        "getMessageType",
        "()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;",
        "setMessageType",
        "(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;)V",
        "getMsgID",
        "setMsgID",
        "getNeedReadReceipt",
        "setNeedReadReceipt",
        "getOfflinePushInfo",
        "()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;",
        "setOfflinePushInfo",
        "(Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;)V",
        "getProgress",
        "()I",
        "setProgress",
        "(I)V",
        "getQuoteMessageInfo",
        "()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
        "setQuoteMessageInfo",
        "(Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;)V",
        "getRawMessage",
        "()Lcom/tencent/imsdk/v2/V2TIMMessage;",
        "setRawMessage",
        "(Lcom/tencent/imsdk/v2/V2TIMMessage;)V",
        "getReactionList",
        "setReactionList",
        "getReceipt",
        "()Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;",
        "setReceipt",
        "(Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;)V",
        "getReceiver",
        "setReceiver",
        "getRepliedMessageCount",
        "setRepliedMessageCount",
        "getReplyMessageInfo",
        "setReplyMessageInfo",
        "getSender",
        "()Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;",
        "setSender",
        "(Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;)V",
        "getStatus",
        "()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;",
        "setStatus",
        "(Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;)V",
        "getSupportExtension",
        "setSupportExtension",
        "getTimestamp",
        "()Ljava/lang/Long;",
        "setTimestamp",
        "(Ljava/lang/Long;)V",
        "Ljava/lang/Long;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private atUserList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private extensionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private groupID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isPinned:Z

.field private isSelf:Z

.field private messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private msgID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private needReadReceipt:Z

.field private offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private progress:I

.field private quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private reactionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private receiver:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private repliedMessageCount:I

.field private replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private supportExtension:Z

.field private timestamp:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo$Creator;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo$Creator;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 25

    const v23, 0x3fffff

    const/16 v24, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {v0 .. v24}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Lcom/tencent/imsdk/v2/V2TIMMessage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;",
            "Z",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;",
            "Z",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
            "I",
            "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
            "Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;",
            "Lcom/tencent/imsdk/v2/V2TIMMessage;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p16

    move-object/from16 v1, p17

    const-string v2, "sender"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "status"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "atUserList"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "messageType"

    invoke-static {p11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extensionList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reactionList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 5
    iput-boolean p3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 6
    iput-object p4, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 9
    iput-object p7, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 10
    iput p8, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 11
    iput-object p9, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 12
    iput-boolean p10, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 13
    iput-object p11, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    move-object p1, p12

    .line 14
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move/from16 p1, p13

    .line 15
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    move/from16 p1, p15

    .line 17
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 18
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 19
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 25
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    .line 26
    sget-object v9, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->INIT:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    .line 27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    .line 28
    sget-object v13, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move/from16 v5, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    .line 29
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v16

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v17

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v0, v0, v22

    if-eqz v0, :cond_15

    const/16 p23, 0x0

    :goto_15
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p15, v2

    move/from16 p4, v3

    move-object/from16 p3, v4

    move/from16 p16, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p14, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move/from16 p20, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    goto :goto_15

    .line 31
    :goto_16
    invoke-direct/range {p1 .. p23}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move/from16 p16, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component10()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component11()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component12()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component13()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component14()Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component15()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component18()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component19()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component2()Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component20()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component21()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component22()Lcom/tencent/imsdk/v2/V2TIMMessage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component3()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component7()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component8()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final copy(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 24
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Lcom/tencent/imsdk/v2/V2TIMMessage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageType;",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;",
            "Z",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;",
            "Z",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
            "I",
            "Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;",
            "Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;",
            "Lcom/tencent/imsdk/v2/V2TIMMessage;",
            ")",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "sender"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "status"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "atUserList"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageType"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionList"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionList"

    move-object/from16 v2, p17

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v18, v2

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v23}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-object v1
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 13
    .line 14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 26
    .line 27
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 39
    .line 40
    if-eq v1, v3, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    return v2

    .line 53
    .line 54
    :cond_5
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-nez v1, :cond_6

    .line 63
    return v2

    .line 64
    .line 65
    :cond_6
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 66
    .line 67
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_7

    .line 74
    return v2

    .line 75
    .line 76
    :cond_7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 77
    .line 78
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 79
    .line 80
    if-eq v1, v3, :cond_8

    .line 81
    return v2

    .line 82
    .line 83
    :cond_8
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 84
    .line 85
    iget v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 86
    .line 87
    if-eq v1, v3, :cond_9

    .line 88
    return v2

    .line 89
    .line 90
    :cond_9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 91
    .line 92
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result v1

    .line 97
    .line 98
    if-nez v1, :cond_a

    .line 99
    return v2

    .line 100
    .line 101
    :cond_a
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 102
    .line 103
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 104
    .line 105
    if-eq v1, v3, :cond_b

    .line 106
    return v2

    .line 107
    .line 108
    :cond_b
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 109
    .line 110
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 111
    .line 112
    if-eq v1, v3, :cond_c

    .line 113
    return v2

    .line 114
    .line 115
    :cond_c
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 116
    .line 117
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    move-result v1

    .line 122
    .line 123
    if-nez v1, :cond_d

    .line 124
    return v2

    .line 125
    .line 126
    :cond_d
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 127
    .line 128
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 129
    .line 130
    if-eq v1, v3, :cond_e

    .line 131
    return v2

    .line 132
    .line 133
    :cond_e
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 134
    .line 135
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    move-result v1

    .line 140
    .line 141
    if-nez v1, :cond_f

    .line 142
    return v2

    .line 143
    .line 144
    :cond_f
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 145
    .line 146
    iget-boolean v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 147
    .line 148
    if-eq v1, v3, :cond_10

    .line 149
    return v2

    .line 150
    .line 151
    :cond_10
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 152
    .line 153
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    move-result v1

    .line 158
    .line 159
    if-nez v1, :cond_11

    .line 160
    return v2

    .line 161
    .line 162
    :cond_11
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 163
    .line 164
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    move-result v1

    .line 169
    .line 170
    if-nez v1, :cond_12

    .line 171
    return v2

    .line 172
    .line 173
    :cond_12
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 174
    .line 175
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    move-result v1

    .line 180
    .line 181
    if-nez v1, :cond_13

    .line 182
    return v2

    .line 183
    .line 184
    :cond_13
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 185
    .line 186
    iget v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 187
    .line 188
    if-eq v1, v3, :cond_14

    .line 189
    return v2

    .line 190
    .line 191
    :cond_14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 192
    .line 193
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    move-result v1

    .line 198
    .line 199
    if-nez v1, :cond_15

    .line 200
    return v2

    .line 201
    .line 202
    :cond_15
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 203
    .line 204
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    move-result v1

    .line 209
    .line 210
    if-nez v1, :cond_16

    .line 211
    return v2

    .line 212
    .line 213
    :cond_16
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 214
    .line 215
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 216
    .line 217
    .line 218
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    move-result p1

    .line 220
    .line 221
    if-nez p1, :cond_17

    .line 222
    return v2

    .line 223
    :cond_17
    return v0
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public final getAtUserList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getExtensionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getGroupID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getMessageType()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getMsgID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getNeedReadReceipt()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getOfflinePushInfo()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getQuoteMessageInfo()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getReactionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getReceipt()Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getReceiver()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRepliedMessageCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getReplyMessageInfo()Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getSender()Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getStatus()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getSupportExtension()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getTimestamp()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public hashCode()I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    const/16 v2, 0x1f

    .line 14
    mul-int/2addr v0, v2

    .line 15
    .line 16
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;->hashCode()I

    .line 20
    move-result v3

    .line 21
    add-int/2addr v3, v0

    .line 22
    mul-int/2addr v3, v2

    .line 23
    .line 24
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 25
    const/4 v4, 0x1

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    move v0, v4

    .line 29
    :cond_1
    add-int/2addr v3, v0

    .line 30
    mul-int/2addr v3, v2

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    move v0, v1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 40
    move-result v0

    .line 41
    :goto_1
    add-int/2addr v3, v0

    .line 42
    mul-int/2addr v3, v2

    .line 43
    .line 44
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    move v0, v1

    .line 48
    goto :goto_2

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 52
    move-result v0

    .line 53
    :goto_2
    add-int/2addr v3, v0

    .line 54
    mul-int/2addr v3, v2

    .line 55
    .line 56
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    move v0, v1

    .line 60
    goto :goto_3

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 64
    move-result v0

    .line 65
    :goto_3
    add-int/2addr v3, v0

    .line 66
    mul-int/2addr v3, v2

    .line 67
    .line 68
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 72
    move-result v0

    .line 73
    add-int/2addr v0, v3

    .line 74
    mul-int/2addr v0, v2

    .line 75
    .line 76
    iget v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/call/a;->a(III)I

    .line 80
    move-result v0

    .line 81
    .line 82
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 86
    move-result v3

    .line 87
    add-int/2addr v3, v0

    .line 88
    mul-int/2addr v3, v2

    .line 89
    .line 90
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    move v0, v4

    .line 94
    :cond_5
    add-int/2addr v3, v0

    .line 95
    mul-int/2addr v3, v2

    .line 96
    .line 97
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 101
    move-result v0

    .line 102
    add-int/2addr v0, v3

    .line 103
    mul-int/2addr v0, v2

    .line 104
    .line 105
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 106
    .line 107
    if-nez v3, :cond_6

    .line 108
    move v3, v1

    .line 109
    goto :goto_4

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->hashCode()I

    .line 113
    move-result v3

    .line 114
    :goto_4
    add-int/2addr v0, v3

    .line 115
    mul-int/2addr v0, v2

    .line 116
    .line 117
    iget-boolean v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 118
    .line 119
    if-eqz v3, :cond_7

    .line 120
    move v3, v4

    .line 121
    :cond_7
    add-int/2addr v0, v3

    .line 122
    mul-int/2addr v0, v2

    .line 123
    .line 124
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 125
    .line 126
    if-nez v3, :cond_8

    .line 127
    move v3, v1

    .line 128
    goto :goto_5

    .line 129
    .line 130
    .line 131
    :cond_8
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;->hashCode()I

    .line 132
    move-result v3

    .line 133
    :goto_5
    add-int/2addr v0, v3

    .line 134
    mul-int/2addr v0, v2

    .line 135
    .line 136
    iget-boolean v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 137
    .line 138
    if-eqz v3, :cond_9

    .line 139
    goto :goto_6

    .line 140
    :cond_9
    move v4, v3

    .line 141
    :goto_6
    add-int/2addr v0, v4

    .line 142
    mul-int/2addr v0, v2

    .line 143
    .line 144
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 148
    move-result v3

    .line 149
    add-int/2addr v3, v0

    .line 150
    mul-int/2addr v3, v2

    .line 151
    .line 152
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 156
    move-result v0

    .line 157
    add-int/2addr v0, v3

    .line 158
    mul-int/2addr v0, v2

    .line 159
    .line 160
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 161
    .line 162
    if-nez v3, :cond_a

    .line 163
    move v3, v1

    .line 164
    goto :goto_7

    .line 165
    .line 166
    .line 167
    :cond_a
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->hashCode()I

    .line 168
    move-result v3

    .line 169
    :goto_7
    add-int/2addr v0, v3

    .line 170
    mul-int/2addr v0, v2

    .line 171
    .line 172
    iget v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/call/a;->a(III)I

    .line 176
    move-result v0

    .line 177
    .line 178
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 179
    .line 180
    if-nez v3, :cond_b

    .line 181
    move v3, v1

    .line 182
    goto :goto_8

    .line 183
    .line 184
    .line 185
    :cond_b
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->hashCode()I

    .line 186
    move-result v3

    .line 187
    :goto_8
    add-int/2addr v0, v3

    .line 188
    mul-int/2addr v0, v2

    .line 189
    .line 190
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 191
    .line 192
    if-nez v3, :cond_c

    .line 193
    move v3, v1

    .line 194
    goto :goto_9

    .line 195
    .line 196
    .line 197
    :cond_c
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;->hashCode()I

    .line 198
    move-result v3

    .line 199
    :goto_9
    add-int/2addr v0, v3

    .line 200
    mul-int/2addr v0, v2

    .line 201
    .line 202
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 203
    .line 204
    if-nez v2, :cond_d

    .line 205
    goto :goto_a

    .line 206
    .line 207
    .line 208
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 209
    move-result v1

    .line 210
    :goto_a
    add-int/2addr v0, v1

    .line 211
    return v0
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public final isPinned()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final isSelf()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setAtUserList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setExtensionList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setGroupID(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setMessageBody(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setMessageType(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/MessageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setMsgID(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setNeedReadReceipt(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setOfflinePushInfo(Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setPinned(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setProgress(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setQuoteMessageInfo(Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setRawMessage(Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 0
    .param p1    # Lcom/tencent/imsdk/v2/V2TIMMessage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setReactionList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setReceipt(Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setReceiver(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setRepliedMessageCount(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setReplyMessageInfo(Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setSelf(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setSender(Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setStatus(Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setSupportExtension(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setTimestamp(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "MessageInfo(msgID="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", sender="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", isSelf="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", receiver="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", groupID="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", timestamp="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", status="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", progress="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", atUserList="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, ", isPinned="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, ", messageType="

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, ", messageBody="

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, ", needReadReceipt="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, ", receipt="

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, ", supportExtension="

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v1, ", extensionList="

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, ", reactionList="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v1, ", replyMessageInfo="

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, ", repliedMessageCount="

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, ", quoteMessageInfo="

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v1, ", offlinePushInfo="

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v1, ", rawMessage="

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const/16 v1, 0x29

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    move-result-object v0

    .line 232
    return-object v0
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "out"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->msgID:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->sender:Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 16
    .line 17
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isSelf:Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 21
    .line 22
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receiver:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->groupID:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->timestamp:Ljava/lang/Long;

    .line 33
    const/4 v1, 0x1

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 47
    move-result-wide v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 51
    .line 52
    :goto_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->status:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    .line 61
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->progress:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->atUserList:Ljava/util/List;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 70
    .line 71
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->isPinned:Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 75
    .line 76
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageType:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    .line 85
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->messageBody:Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->writeToParcel(Landroid/os/Parcel;I)V

    .line 98
    .line 99
    :goto_1
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->needReadReceipt:Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 103
    .line 104
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->receipt:Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    .line 105
    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    goto :goto_2

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;->writeToParcel(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    :goto_2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->supportExtension:Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    .line 123
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->extensionList:Ljava/util/List;

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 127
    move-result v3

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    move-result v3

    .line 139
    .line 140
    if-eqz v3, :cond_3

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    move-result-object v3

    .line 145
    .line 146
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;->writeToParcel(Landroid/os/Parcel;I)V

    .line 150
    goto :goto_3

    .line 151
    .line 152
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->reactionList:Ljava/util/List;

    .line 153
    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 156
    move-result v3

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    move-result v3

    .line 168
    .line 169
    if-eqz v3, :cond_4

    .line 170
    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;->writeToParcel(Landroid/os/Parcel;I)V

    .line 179
    goto :goto_4

    .line 180
    .line 181
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->replyMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 182
    .line 183
    if-nez v0, :cond_5

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    goto :goto_5

    .line 188
    .line 189
    .line 190
    :cond_5
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 194
    .line 195
    :goto_5
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->repliedMessageCount:I

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 199
    .line 200
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->quoteMessageInfo:Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    .line 201
    .line 202
    if-nez v0, :cond_6

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 206
    goto :goto_6

    .line 207
    .line 208
    .line 209
    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 213
    .line 214
    :goto_6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->offlinePushInfo:Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 215
    .line 216
    if-nez v0, :cond_7

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 220
    goto :goto_7

    .line 221
    .line 222
    .line 223
    :cond_7
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 227
    .line 228
    :goto_7
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->rawMessage:Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 232
    return-void
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method
