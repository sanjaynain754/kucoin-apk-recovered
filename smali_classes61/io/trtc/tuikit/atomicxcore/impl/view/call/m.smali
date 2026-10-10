.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/x;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/m;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

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
    check-cast p1, Ljava/util/Map;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/m;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/m;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-static {p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(Lio/trtc/tuikit/atomicxcore/impl/view/call/x;I)V

    .line 28
    .line 29
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    return-object p1
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
