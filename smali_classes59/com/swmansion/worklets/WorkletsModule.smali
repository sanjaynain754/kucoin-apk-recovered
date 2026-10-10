.class public Lcom/swmansion/worklets/WorkletsModule;
.super Lcom/swmansion/reanimated/NativeWorkletsModuleSpec;
.source "WorkletsModule.java"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "WorkletsModule"
.end annotation


# instance fields
.field private final mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

.field private mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lt6/a;
    .end annotation
.end field

.field private final mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "worklets"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/swmansion/reanimated/NativeWorkletsModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 4
    .line 5
    new-instance v0, Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/swmansion/worklets/WorkletsMessageQueueThread;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    new-instance v0, Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/swmansion/worklets/AndroidUIScheduler;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 24
    .line 25
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 26
    return-void
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
    .line 79
    .line 80
    .line 81
.end method

.method private native initHybrid(JLjava/lang/String;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/swmansion/worklets/AndroidUIScheduler;)Lcom/facebook/jni/HybridData;
    .annotation build Landroidx/annotation/OptIn;
        markerClass = {
            Lcom/facebook/react/common/annotations/FrameworkAPI;
        }
    .end annotation
.end method

.method private native invalidateCpp()V
.end method


# virtual methods
.method public getAndroidUIScheduler()Lcom/swmansion/worklets/AndroidUIScheduler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

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

.method public getHybridData()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

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

.method public installTurboModule(Ljava/lang/String;)Z
    .locals 9
    .annotation build Landroidx/annotation/OptIn;
        markerClass = {
            Lcom/facebook/react/common/annotations/FrameworkAPI;
        }
    .end annotation

    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    .line 15
    move-result-wide v3

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lwb0/b;->a(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    .line 19
    move-result-object v7

    .line 20
    .line 21
    iget-object v6, p0, Lcom/swmansion/worklets/WorkletsModule;->mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 22
    .line 23
    iget-object v8, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 24
    move-object v2, p0

    .line 25
    move-object v5, p1

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v2 .. v8}, Lcom/swmansion/worklets/WorkletsModule;->initHybrid(JLjava/lang/String;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/swmansion/worklets/AndroidUIScheduler;)Lcom/facebook/jni/HybridData;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iput-object p1, v2, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 32
    const/4 p1, 0x1

    .line 33
    return p1
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
    .line 79
    .line 80
    .line 81
.end method

.method public invalidate()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/swmansion/worklets/WorkletsModule;->invalidateCpp()V

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/swmansion/worklets/AndroidUIScheduler;->c()V

    .line 29
    return-void
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
.end method
