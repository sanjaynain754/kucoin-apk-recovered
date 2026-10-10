.class public abstract Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$Unknown;,
        Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0013\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'(\u00a8\u0006)"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;",
        "Landroid/os/Parcelable;",
        "()V",
        "CancelGroupAdmin",
        "ChangeGroupAvatar",
        "ChangeGroupIntroduction",
        "ChangeGroupMuteAll",
        "ChangeGroupName",
        "ChangeGroupNotification",
        "ChangeGroupOwner",
        "ChangeInviteToGroupApproval",
        "ChangeJoinGroupApproval",
        "InviteToGroup",
        "JoinGroup",
        "KickedFromGroup",
        "MuteGroupMember",
        "PinGroupMessage",
        "QuitGroup",
        "RecallMessage",
        "SetGroupAdmin",
        "Unknown",
        "UnpinGroupMessage",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$Unknown;",
        "Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo;-><init>()V

    return-void
.end method
