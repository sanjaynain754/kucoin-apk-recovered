.class public interface abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCompletion;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RequestCompletion"
.end annotation


# virtual methods
.method public abstract onAccepted(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Ljava/lang/String;)V
.end method

.method public abstract onCancelled(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
.end method

.method public abstract onError(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onRejected(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
.end method

.method public abstract onTimeout(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
.end method
