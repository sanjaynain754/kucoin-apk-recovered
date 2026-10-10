.class public final Lio/reactivex/internal/operators/flowable/FlowableRangeLong;
.super Lio/reactivex/Flowable;
.source "FlowableRangeLong.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeConditionalSubscription;,
        Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeSubscription;,
        Lio/reactivex/internal/operators/flowable/FlowableRangeLong$BaseRangeSubscription;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Flowable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final end:J

.field final start:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/reactivex/Flowable;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->start:J

    .line 6
    add-long/2addr p1, p3

    .line 7
    .line 8
    iput-wide p1, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->end:J

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
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
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


# virtual methods
.method public subscribeActual(Lsh0/c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh0/c<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lio/reactivex/internal/fuseable/ConditionalSubscriber;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeConditionalSubscription;

    .line 7
    move-object v2, p1

    .line 8
    .line 9
    check-cast v2, Lio/reactivex/internal/fuseable/ConditionalSubscriber;

    .line 10
    .line 11
    iget-wide v3, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->start:J

    .line 12
    .line 13
    iget-wide v5, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->end:J

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeConditionalSubscription;-><init>(Lio/reactivex/internal/fuseable/ConditionalSubscriber;JJ)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Lsh0/c;->onSubscribe(Lsh0/d;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    new-instance v2, Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeSubscription;

    .line 23
    .line 24
    iget-wide v4, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->start:J

    .line 25
    .line 26
    iget-wide v6, p0, Lio/reactivex/internal/operators/flowable/FlowableRangeLong;->end:J

    .line 27
    move-object v3, p1

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v2 .. v7}, Lio/reactivex/internal/operators/flowable/FlowableRangeLong$RangeSubscription;-><init>(Lsh0/c;JJ)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3, v2}, Lsh0/c;->onSubscribe(Lsh0/d;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
