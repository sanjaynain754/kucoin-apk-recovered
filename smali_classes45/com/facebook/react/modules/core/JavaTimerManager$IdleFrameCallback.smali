.class final Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;
.super Ljava/lang/Object;
.source "JavaTimerManager.kt"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "IdleFrameCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;",
        "Landroid/view/Choreographer$FrameCallback;",
        "<init>",
        "(Lcom/facebook/react/modules/core/JavaTimerManager;)V",
        "doFrame",
        "",
        "frameTimeNanos",
        "",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

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
.end method


# virtual methods
.method public doFrame(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$isPaused$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$isRunningTasks$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getCurrentIdleCallbackRunnable$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->cancel()V

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 39
    .line 40
    new-instance v1, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v0, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;J)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$setCurrentIdleCallbackRunnable$p(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;)V

    .line 47
    .line 48
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getReactApplicationContext$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getCurrentIdleCallbackRunnable$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getReactChoreographer$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    sget-object p2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->IDLE_EVENT:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
