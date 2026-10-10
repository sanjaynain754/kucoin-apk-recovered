.class public interface abstract Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetSeatListCallback;
.super Ljava/lang/Object;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GetSeatListCallback"
.end annotation


# virtual methods
.method public abstract onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatInfo;",
            ">;)V"
        }
    .end annotation
.end method
