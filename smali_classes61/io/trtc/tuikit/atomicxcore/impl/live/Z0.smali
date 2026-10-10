.class public abstract Lio/trtc/tuikit/atomicxcore/impl/live/Z0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object p0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 4
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    .line 5
    :cond_2
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)Z
    .locals 5

    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 10
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v3

    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    move-result v3

    .line 11
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 12
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    move-result v2

    .line 13
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 14
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result v3

    if-ne v2, v3, :cond_1

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
