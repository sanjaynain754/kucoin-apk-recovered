.class public interface abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PlayCallback"
.end annotation


# virtual methods
.method public abstract onLoading(Ljava/lang/String;)V
.end method

.method public abstract onPlayError(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onPlaying(Ljava/lang/String;)V
.end method
