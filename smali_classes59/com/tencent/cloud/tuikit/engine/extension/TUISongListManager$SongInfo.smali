.class public Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;
.super Ljava/lang/Object;
.source "TUISongListManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SongInfo"
.end annotation


# instance fields
.field public artistName:Ljava/lang/String;

.field public coverUrl:Ljava/lang/String;

.field public duration:I

.field public requester:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

.field public songId:Ljava/lang/String;

.field public songName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->songId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->songName:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->artistName:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->coverUrl:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->duration:I

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;->requester:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 24
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
