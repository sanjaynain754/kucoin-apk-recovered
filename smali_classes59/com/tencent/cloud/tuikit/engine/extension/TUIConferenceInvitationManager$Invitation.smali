.class public Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;
.super Ljava/lang/Object;
.source "TUIConferenceInvitationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Invitation"
.end annotation


# instance fields
.field public invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

.field public inviter:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

.field public status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;->NONE:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

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
.end method
