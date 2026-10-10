.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/m0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/m0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 7
    .line 8
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->battleState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleState;

    .line 9
    .line 10
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleState;->battleId:Landroidx/lifecycle/LiveData;

    .line 11
    .line 12
    const-string v0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;->getBattleID()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p1
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
