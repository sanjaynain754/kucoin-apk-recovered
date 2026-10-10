.class public final Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/BuglyReplayManager;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1",
        "Ljava/lang/Runnable;",
        "run",
        "",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/bugly/common/replay/BuglyReplayManager;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;->this$0:Lcom/tencent/bugly/common/replay/BuglyReplayManager;

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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;->this$0:Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$getRecorder$p(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->capture()V

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;->this$0:Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$getRecorderConfig$p(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;->getFrameRate()I

    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x1

    .line 28
    :goto_0
    int-to-long v1, v1

    .line 29
    .line 30
    const-wide/16 v3, 0x3e8

    .line 31
    div-long/2addr v3, v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0, v3, v4}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->runInDumpThread(Ljava/lang/Runnable;J)V

    .line 35
    return-void
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
.end method
