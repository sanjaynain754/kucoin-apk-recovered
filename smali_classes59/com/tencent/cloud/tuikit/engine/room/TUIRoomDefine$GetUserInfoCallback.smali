.class public interface abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserInfoCallback;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GetUserInfoCallback"
.end annotation


# virtual methods
.method public abstract onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V
.end method
