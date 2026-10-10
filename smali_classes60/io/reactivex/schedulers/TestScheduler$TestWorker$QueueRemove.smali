.class final Lio/reactivex/schedulers/TestScheduler$TestWorker$QueueRemove;
.super Ljava/lang/Object;
.source "TestScheduler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/schedulers/TestScheduler$TestWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "QueueRemove"
.end annotation


# instance fields
.field final synthetic this$1:Lio/reactivex/schedulers/TestScheduler$TestWorker;

.field final timedAction:Lio/reactivex/schedulers/TestScheduler$TimedRunnable;


# direct methods
.method public constructor <init>(Lio/reactivex/schedulers/TestScheduler$TestWorker;Lio/reactivex/schedulers/TestScheduler$TimedRunnable;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/reactivex/schedulers/TestScheduler$TestWorker$QueueRemove;->this$1:Lio/reactivex/schedulers/TestScheduler$TestWorker;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lio/reactivex/schedulers/TestScheduler$TestWorker$QueueRemove;->timedAction:Lio/reactivex/schedulers/TestScheduler$TimedRunnable;

    .line 8
    return-void
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
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/reactivex/schedulers/TestScheduler$TestWorker$QueueRemove;->this$1:Lio/reactivex/schedulers/TestScheduler$TestWorker;

    .line 3
    .line 4
    iget-object v0, v0, Lio/reactivex/schedulers/TestScheduler$TestWorker;->this$0:Lio/reactivex/schedulers/TestScheduler;

    .line 5
    .line 6
    iget-object v0, v0, Lio/reactivex/schedulers/TestScheduler;->queue:Ljava/util/Queue;

    .line 7
    .line 8
    iget-object v1, p0, Lio/reactivex/schedulers/TestScheduler$TestWorker$QueueRemove;->timedAction:Lio/reactivex/schedulers/TestScheduler$TimedRunnable;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 12
    return-void
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
.end method
