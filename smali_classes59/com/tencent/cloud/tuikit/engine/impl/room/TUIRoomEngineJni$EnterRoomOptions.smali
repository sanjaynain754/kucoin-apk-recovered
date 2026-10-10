.class Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;
.super Ljava/lang/Object;
.source "TUIRoomEngineJni.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EnterRoomOptions"
.end annotation


# instance fields
.field private mOptions:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;->mOptions:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;

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
.method public getPassword()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "EnterRoomOptions"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$EnterRoomOptions;->mOptions:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;->password:Ljava/lang/String;

    .line 5
    return-object v0
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
