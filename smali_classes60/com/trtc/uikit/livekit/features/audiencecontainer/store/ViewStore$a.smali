.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;
.super Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;
.source "ViewStore.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$BattleEventListener;",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;",
        "<init>",
        "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V",
        "onBattleEnded",
        "",
        "battleInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;-><init>()V

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
.end method

.method public static synthetic a(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->b(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V

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
.end method

.method public static final b(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->c(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)Lkotlinx/coroutines/flow/n;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 10
    return-void
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
.end method


# virtual methods
.method public onBattleEnded(Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "battleInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->a(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    check-cast p1, Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    move-result p1

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->c(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)Lkotlinx/coroutines/flow/n;

    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x0

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->c(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)Lkotlinx/coroutines/flow/n;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->b(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)Landroid/os/Handler;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 58
    .line 59
    new-instance v0, Lee0/k;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, p2}, Lee0/k;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V

    .line 63
    .line 64
    const-wide/16 v1, 0x1388

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
