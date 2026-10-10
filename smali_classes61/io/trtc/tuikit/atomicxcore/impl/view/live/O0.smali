.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/O0;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/O0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

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
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    move-result p1

    .line 7
    .line 8
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/O0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 9
    .line 10
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 11
    .line 12
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->mediaState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;

    .line 13
    .line 14
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;->isMirrorEnabled:Landroidx/lifecycle/LiveData;

    .line 15
    .line 16
    const-string v0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>"

    .line 17
    .line 18
    .line 19
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
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
