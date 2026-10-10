.class public abstract synthetic Lio/trtc/tuikit/atomicxcore/api/view/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getActiveCall()Lkotlinx/coroutines/flow/w;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
