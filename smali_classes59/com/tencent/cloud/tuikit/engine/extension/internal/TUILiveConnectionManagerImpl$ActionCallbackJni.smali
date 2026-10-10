.class Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ActionCallbackJni;
.super Ljava/lang/Object;
.source "TUILiveConnectionManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ActionCallbackJni"
.end annotation


# instance fields
.field private final mCallback:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ActionCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 6
    return-void
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
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "ActionCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ActionCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 12
    :cond_0
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSuccess()V
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "ActionCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ActionCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onSuccess()V

    .line 8
    :cond_0
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
