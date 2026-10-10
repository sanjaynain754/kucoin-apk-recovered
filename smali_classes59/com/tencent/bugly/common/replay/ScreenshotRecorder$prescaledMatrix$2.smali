.class final Lcom/tencent/bugly/common/replay/ScreenshotRecorder$prescaledMatrix$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/ScreenshotRecorder;-><init>(Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/Matrix;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/Matrix;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/ScreenshotRecorder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$prescaledMatrix$2;->this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.method public final invoke()Landroid/graphics/Matrix;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$prescaledMatrix$2;->this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 3
    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->getConfig()Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;->getScaleFactorX()F

    move-result v2

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->getConfig()Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;->getScaleFactorY()F

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$prescaledMatrix$2;->invoke()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method
