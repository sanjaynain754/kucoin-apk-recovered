.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;
.super Ljava/lang/Object;
.source "TUILiveConnectionManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionCode;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;
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
.method public abstract acceptConnection(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;)V
.end method

.method public abstract cancelConnectionRequest(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract disconnect(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract rejectConnection(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;)V
.end method

.method public abstract requestConnection(Ljava/util/List;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;",
            ")V"
        }
    .end annotation
.end method
