.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/k;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

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
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lkotlin/Unit;

    .line 3
    .line 4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/k;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 5
    .line 6
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->b:Landroid/os/Handler;

    .line 7
    .line 8
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->d:Ljava/lang/Runnable;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/k;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    iput-boolean p2, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->c:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a()V

    .line 20
    .line 21
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p1
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
