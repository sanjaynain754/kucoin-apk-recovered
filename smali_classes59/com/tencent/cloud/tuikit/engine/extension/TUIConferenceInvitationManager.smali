.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;
.super Ljava/lang/Object;
.source "TUIConferenceInvitationManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationCode;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public abstract accept(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V
.end method

.method public abstract cancelInvitation(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getInvitationList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;)V
.end method

.method public abstract inviteUsers(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract reject(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V
.end method
