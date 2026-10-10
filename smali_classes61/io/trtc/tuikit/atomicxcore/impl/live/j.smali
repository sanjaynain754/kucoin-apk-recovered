.class public final Lio/trtc/tuikit/atomicxcore/impl/live/j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/j;->a:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/j;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/j;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/j;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/live/a;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;->onUserExitBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 19
    .line 20
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
