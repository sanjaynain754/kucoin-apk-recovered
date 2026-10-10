.class public interface abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RequestCallback"
.end annotation


# virtual methods
.method public abstract onAccepted(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onCancelled(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onError(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onRejected(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTimeout(Ljava/lang/String;Ljava/lang/String;)V
.end method
