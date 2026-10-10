.class public interface abstract Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ConnectionObserver"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008f\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0013\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u0007H\'JG\u0010\u0008\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u00072\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u00072\u0013\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u0007H\'J\u0012\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u0012\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u001c\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\'J\u0012\u0010\u0019\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\nH\'J\u0012\u0010\u001b\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\nH\'J\u0012\u0010\u001d\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\nH\'J\u0012\u0010\u001e\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\nH\'J\u0012\u0010\u001f\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\nH\'J\u0008\u0010 \u001a\u00020\u0003H\'J\u0012\u0010!\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\""
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;",
        "",
        "onConnectedRoomsUpdated",
        "",
        "hostUserList",
        "",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "onConnectedUsersUpdated",
        "userList",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
        "joinList",
        "leaveList",
        "onCrossRoomConnectionAccepted",
        "hostUser",
        "onCrossRoomConnectionCancelled",
        "onCrossRoomConnectionExited",
        "onCrossRoomConnectionRejected",
        "onCrossRoomConnectionRequest",
        "onCrossRoomConnectionTimeout",
        "inviter",
        "invitee",
        "onRoomDismissed",
        "roomId",
        "",
        "onUserConnectionAccepted",
        "userInfo",
        "onUserConnectionCancelled",
        "inviterUser",
        "onUserConnectionExited",
        "onUserConnectionRejected",
        "onUserConnectionRequest",
        "onUserConnectionTerminated",
        "onUserConnectionTimeout",
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


# virtual methods
.method public abstract onConnectedRoomsUpdated(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onConnectedUsersUpdated(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionAccepted(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionExited(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionRejected(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionRequest(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onCrossRoomConnectionTimeout(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onRoomDismissed(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionAccepted(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionCancelled(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionExited(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionRejected(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionRequest(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionTerminated()V
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserConnectionTimeout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method
