.class Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$UserListResult;
.super Ljava/lang/Object;
.source "TUIRoomEngineJni.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserListResult"
.end annotation


# instance fields
.field private mUserListResult:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineJni$UserListResult;->mUserListResult:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;

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

.method public static createUserListResult(JLjava/util/List;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "UserListResult"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;)",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;-><init>()V

    .line 6
    .line 7
    iput-wide p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->nextSequence:J

    .line 8
    .line 9
    iput-object p2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->userInfoList:Ljava/util/List;

    .line 10
    return-object v0
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
