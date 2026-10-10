.class public interface abstract Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;
.super Ljava/lang/Object;
.source "TUIConferenceInvitationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "InviteUsersCallback"
.end annotation


# virtual methods
.method public abstract onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationCode;",
            ">;)V"
        }
    .end annotation
.end method
