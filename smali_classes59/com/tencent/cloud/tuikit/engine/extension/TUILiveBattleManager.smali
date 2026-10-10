.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
.super Ljava/lang/Object;
.source "TUILiveBattleManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleStoppedReason;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleCode;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
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
.method public abstract acceptBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
.end method

.method public abstract cancelBattleRequest(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract exitBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract rejectBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V
.end method

.method public abstract requestBattle(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;",
            ")V"
        }
    .end annotation
.end method
