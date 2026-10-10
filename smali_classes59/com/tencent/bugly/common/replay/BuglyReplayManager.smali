.class public final Lcom/tencent/bugly/common/replay/BuglyReplayManager;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/replay/IReplay;
.implements Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;
.implements Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;,
        Lcom/tencent/bugly/common/replay/BuglyReplayManager$RecorderExecutorServiceThreadFactory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001A\u0008\u0007\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002LMB\u0011\u0008\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008J\u0010KJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0006\u0010\u000c\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u0008J\u0008\u0010\u000e\u001a\u00020\u0004H\u0016J\u0008\u0010\u000f\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u0004H\u0016J\u0008\u0010\u0011\u001a\u00020\u0004H\u0016J\u0008\u0010\u0012\u001a\u00020\u0004H\u0016J\u0008\u0010\u0013\u001a\u00020\u0004H\u0016J\u0008\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R0\u0010&\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060$0#j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060$`%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R#\u00107\u001a\n 2*\u0004\u0018\u000101018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010>\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010@\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010I\u00a8\u0006N"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/BuglyReplayManager;",
        "Lcom/tencent/bugly/common/replay/IReplay;",
        "Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;",
        "Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;",
        "",
        "init",
        "Landroid/view/View;",
        "root",
        "",
        "added",
        "onRootViewsChanged",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "getBuglyReplayOptions",
        "isInitialize",
        "start",
        "resume",
        "pause",
        "stop",
        "close",
        "onForeground",
        "onBackground",
        "Landroid/app/Activity;",
        "activity",
        "onCreate",
        "onPostCreate",
        "onStart",
        "onResume",
        "onPause",
        "onStop",
        "onDestroy",
        "options",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isRecording",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Ljava/util/ArrayList;",
        "Ljava/lang/ref/WeakReference;",
        "Lkotlin/collections/ArrayList;",
        "rootViews",
        "Ljava/util/ArrayList;",
        "Lcom/tencent/bugly/proguard/u0;",
        "rootViewsLock",
        "Lcom/tencent/bugly/proguard/u0;",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorder;",
        "recorder",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorder;",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;",
        "recorderConfig",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "kotlin.jvm.PlatformType",
        "capturer$delegate",
        "Lkotlin/Lazy;",
        "getCapturer",
        "()Ljava/util/concurrent/ScheduledExecutorService;",
        "capturer",
        "Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;",
        "mainLooperHandler",
        "Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;",
        "Lcom/tencent/bugly/common/replay/ReplayCache;",
        "replayCache",
        "Lcom/tencent/bugly/common/replay/ReplayCache;",
        "initialize",
        "Z",
        "enableThisTime",
        "com/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1",
        "periodicRunnable",
        "Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;",
        "screenshotRecorderCallback",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;",
        "Lcom/tencent/bugly/common/replay/RootViewsSpy;",
        "rootViewsSpy",
        "Lcom/tencent/bugly/common/replay/RootViewsSpy;",
        "<init>",
        "(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V",
        "Companion",
        "RecorderExecutorServiceThreadFactory",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile INSTANCE:Lcom/tencent/bugly/common/replay/BuglyReplayManager; = null
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "BuglyReplayManager"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final capturer$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private enableThisTime:Z

.field private initialize:Z

.field private final isRecording:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mainLooperHandler:Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private recorderConfig:Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final replayCache:Lcom/tencent/bugly/common/replay/ReplayCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rootViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rootViewsLock:Lcom/tencent/bugly/proguard/u0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final screenshotRecorderCallback:Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->Companion:Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;

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
.end method

.method private constructor <init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->options:Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->isRecording:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/u0;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/u0;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsLock:Lcom/tencent/bugly/proguard/u0;

    .line 7
    sget-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$capturer$2;->INSTANCE:Lcom/tencent/bugly/common/replay/BuglyReplayManager$capturer$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->capturer$delegate:Lkotlin/Lazy;

    .line 8
    new-instance v0, Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;-><init>(Landroid/os/Looper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->mainLooperHandler:Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;

    .line 9
    new-instance v0, Lcom/tencent/bugly/common/replay/ReplayCache;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/common/replay/ReplayCache;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V

    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->replayCache:Lcom/tencent/bugly/common/replay/ReplayCache;

    .line 10
    new-instance p1, Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)V

    iput-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 11
    new-instance p1, Lcom/tencent/bugly/common/replay/BuglyReplayManager$screenshotRecorderCallback$1;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$screenshotRecorderCallback$1;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)V

    iput-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->screenshotRecorderCallback:Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V

    return-void
.end method

.method public static final synthetic access$getINSTANCE$cp()Lcom/tencent/bugly/common/replay/BuglyReplayManager;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->INSTANCE:Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public static final synthetic access$getRecorder$p(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)Lcom/tencent/bugly/common/replay/ScreenshotRecorder;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 3
    return-object p0
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic access$getRecorderConfig$p(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorderConfig:Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    .line 3
    return-object p0
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic access$getReplayCache$p(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)Lcom/tencent/bugly/common/replay/ReplayCache;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->replayCache:Lcom/tencent/bugly/common/replay/ReplayCache;

    .line 3
    return-object p0
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic access$setINSTANCE$cp(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->INSTANCE:Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private final getCapturer()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->capturer$delegate:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private final init()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "replay_report"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    instance-of v2, v0, Lcom/tencent/bugly/proguard/kf;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast v0, Lcom/tencent/bugly/proguard/kf;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kf;->d()Ljava/lang/Boolean;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v2, "replayReportConfig.isReplayReportEnabled()"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iput-boolean v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    sget-object v0, Lcom/tencent/bugly/common/replay/RootViewsSpy;->Companion:Lcom/tencent/bugly/common/replay/RootViewsSpy$Companion;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy$Companion;->install()Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 59
    .line 60
    :cond_2
    iput-boolean v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 61
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->init()V

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "BuglyReplayManager"

    .line 16
    .line 17
    const-string v2, "close: not enabled"

    .line 18
    .line 19
    .line 20
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->getListeners()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->getListeners()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->stop()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->getCapturer()Ljava/util/concurrent/ScheduledExecutorService;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    const-string v1, "capturer"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/tencent/bugly/common/replay/tool/ExecutorsKt;->gracefullyShutdown(Ljava/util/concurrent/ExecutorService;)V

    .line 71
    .line 72
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->cancelFromDumpThread(Ljava/lang/Runnable;)V

    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final getBuglyReplayOptions()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->options:Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final isInitialize()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    return v0
    .line 4
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
.end method

.method public onBackground()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->pause()V

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
.end method

.method public onCreate(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onDestroy(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onForeground()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->resume()V

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
.end method

.method public onPause(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onPostCreate(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onResume(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onRootViewsChanged(Landroid/view/View;Z)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "root"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsLock:Lcom/tencent/bugly/proguard/u0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u0;->a()Lcom/tencent/bugly/proguard/i8;

    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    :try_start_0
    iget-object p2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    iget-object p2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 28
    .line 29
    if-eqz p2, :cond_4

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->bind(Landroid/view/View;)V

    .line 33
    .line 34
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->unbind(Landroid/view/View;)V

    .line 45
    .line 46
    :cond_1
    iget-object p2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v2, Lcom/tencent/bugly/common/replay/BuglyReplayManager$onRootViewsChanged$1$1;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, p1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$onRootViewsChanged$1$1;-><init>(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v2}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 55
    .line 56
    iget-object p2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    check-cast p2, Landroid/view/View;

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-object p2, v1

    .line 73
    .line 74
    :goto_0
    if-eqz p2, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    move-result p1

    .line 79
    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->bind(Landroid/view/View;)V

    .line 88
    .line 89
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    goto :goto_1

    .line 91
    .line 92
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_1
    invoke-static {v0, v1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 96
    return-void

    .line 97
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    :catchall_1
    move-exception p2

    .line 99
    .line 100
    .line 101
    invoke-static {v0, p1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 102
    throw p2
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public onStart(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onStop(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public pause()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->init()V

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "BuglyReplayManager"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "pause: not enabled"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->pause()V

    .line 34
    .line 35
    :cond_2
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->cancelFromDumpThread(Ljava/lang/Runnable;)V

    .line 41
    return-void
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

.method public resume()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->init()V

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "BuglyReplayManager"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "resume: not enabled"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->resume()V

    .line 34
    .line 35
    :cond_2
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->cancelFromDumpThread(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 43
    .line 44
    const-wide/16 v2, 0x64

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->runInDumpThread(Ljava/lang/Runnable;J)V

    .line 48
    return-void
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

.method public start()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->init()V

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "BuglyReplayManager"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "start: not enabled"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->isRecording:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    const/4 v1, 0x1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    sget-object v0, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;->Companion:Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    const-string v2, "getGlobalContext()"

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v2, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->options:Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;->from(Landroid/content/Context;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    iput-object v4, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorderConfig:Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    .line 56
    .line 57
    new-instance v3, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 58
    .line 59
    .line 60
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    .line 62
    iget-object v5, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->options:Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->mainLooperHandler:Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;

    .line 65
    .line 66
    new-instance v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager$RecorderExecutorServiceThreadFactory;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$RecorderExecutorServiceThreadFactory;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    move-result-object v7

    .line 74
    .line 75
    .line 76
    const-string/jumbo v0, "newSingleThreadScheduled\u2026orServiceThreadFactory())"

    .line 77
    .line 78
    .line 79
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    iget-object v8, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->screenshotRecorderCallback:Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;

    .line 82
    .line 83
    .line 84
    invoke-direct/range {v3 .. v8}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;-><init>(Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;)V

    .line 85
    .line 86
    iput-object v3, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 87
    .line 88
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 89
    .line 90
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->cancelFromDumpThread(Ljava/lang/Runnable;)V

    .line 94
    .line 95
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 96
    .line 97
    const-wide/16 v2, 0x64

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->runInDumpThread(Ljava/lang/Runnable;J)V

    .line 101
    .line 102
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->getListeners()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 115
    move-result v0

    .line 116
    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsSpy:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->getListeners()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    :cond_3
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentAppOnForeground(Landroid/content/Context;)Z

    .line 140
    move-result v0

    .line 141
    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->pause()V

    .line 150
    :cond_4
    :goto_0
    return-void
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public stop()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->initialize:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->init()V

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->enableThisTime:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "BuglyReplayManager"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "stop: not enabled"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViewsLock:Lcom/tencent/bugly/proguard/u0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u0;->a()Lcom/tencent/bugly/proguard/i8;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    iget-object v3, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    check-cast v2, Landroid/view/View;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v2}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->unbind(Landroid/view/View;)V

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_3
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->rootViews:Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    const/4 v1, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->close()V

    .line 85
    .line 86
    :cond_4
    iput-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->recorder:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->isRecording:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    const/4 v1, 0x0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 93
    .line 94
    sget-object v0, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->periodicRunnable:Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->cancelFromDumpThread(Ljava/lang/Runnable;)V

    .line 100
    return-void

    .line 101
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    :catchall_1
    move-exception v2

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 106
    throw v2
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
