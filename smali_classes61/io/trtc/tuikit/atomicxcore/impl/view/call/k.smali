.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/k;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/k;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

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
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/k;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setStatus(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;)V

    .line 14
    .line 15
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/k;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 16
    .line 17
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getRemark()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setRemark(Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/k;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 27
    .line 28
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getName()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setName(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/k;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->c()V

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p1
.end method
