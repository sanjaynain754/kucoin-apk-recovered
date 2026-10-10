.class public interface abstract Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "BattleObserver"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J&\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\'J&\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\'J&\u0010\r\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\'J&\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\'J&\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\'J\'\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012\u00a2\u0006\u0002\u0008\u0013H\'J\u0012\u0010\u0014\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u001c\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\nH\'J\u001c\u0010\u0017\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;",
        "",
        "onBattleEnded",
        "",
        "battleInfo",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;",
        "onBattleRequestAccept",
        "battleId",
        "",
        "inviter",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;",
        "invitee",
        "onBattleRequestCancelled",
        "onBattleRequestReceived",
        "onBattleRequestReject",
        "onBattleRequestTimeout",
        "onBattleScoreChanged",
        "battleUserList",
        "",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "onBattleStarted",
        "onUserExitBattle",
        "battleUser",
        "onUserJoinBattle",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onBattleEnded(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleRequestAccept(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleRequestCancelled(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleRequestReceived(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleRequestReject(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleRequestTimeout(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleScoreChanged(Ljava/lang/String;Ljava/util/List;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onBattleStarted(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserExitBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method

.method public abstract onUserJoinBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation
.end method
