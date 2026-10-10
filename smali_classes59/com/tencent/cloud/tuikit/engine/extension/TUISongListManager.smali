.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager;
.super Ljava/lang/Object;
.source "TUISongListManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongListResult;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongListChangeReason;
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
.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$Observer;)V
.end method

.method public abstract addSong(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongInfo;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getPlayedList(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongListCallback;)V
.end method

.method public abstract getWaitingList(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$SongListCallback;)V
.end method

.method public abstract playNextSong(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUISongListManager$Observer;)V
.end method

.method public abstract removeSong(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
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

.method public abstract setNextSong(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method
