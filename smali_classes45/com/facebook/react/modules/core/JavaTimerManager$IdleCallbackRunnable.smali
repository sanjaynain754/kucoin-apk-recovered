.class final Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;
.super Ljava/lang/Object;
.source "JavaTimerManager.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "IdleCallbackRunnable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;",
        "Ljava/lang/Runnable;",
        "frameStartTime",
        "",
        "<init>",
        "(Lcom/facebook/react/modules/core/JavaTimerManager;J)V",
        "isCancelled",
        "",
        "run",
        "",
        "cancel",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJavaTimerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTimerManager.kt\ncom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"
    }
.end annotation


# instance fields
.field private final frameStartTime:J

.field private volatile isCancelled:Z

.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-wide p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->frameStartTime:J

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
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->isCancelled:Z

    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->isCancelled:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->frameStartTime:J

    .line 8
    .line 9
    .line 10
    const v2, 0xf4240

    .line 11
    int-to-long v2, v2

    .line 12
    div-long/2addr v0, v2

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/facebook/react/common/SystemClock;->uptimeMillis()J

    .line 16
    move-result-wide v2

    .line 17
    sub-long/2addr v2, v0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/common/SystemClock;->currentTimeMillis()J

    .line 21
    move-result-wide v0

    .line 22
    sub-long/2addr v0, v2

    .line 23
    .line 24
    .line 25
    const v4, 0x41855555

    .line 26
    long-to-float v2, v2

    .line 27
    sub-float/2addr v4, v2

    .line 28
    .line 29
    const/high16 v2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    cmpg-float v2, v4, v2

    .line 32
    .line 33
    if-gez v2, :cond_1

    .line 34
    :goto_0
    return-void

    .line 35
    .line 36
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getIdleCallbackGuard$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    iget-object v3, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 43
    monitor-enter v2

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {v3}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getSendIdleEvents$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Z

    .line 47
    move-result v3

    .line 48
    .line 49
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit v2

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getJavaScriptTimerExecutor$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;

    .line 58
    move-result-object v2

    .line 59
    long-to-double v0, v0

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v0, v1}, Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;->callIdleCallbacks(D)V

    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 65
    const/4 v1, 0x0

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$setCurrentIdleCallbackRunnable$p(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;)V

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    monitor-exit v2

    .line 72
    throw v0
    .line 73
    .line 74
    .line 75
.end method
