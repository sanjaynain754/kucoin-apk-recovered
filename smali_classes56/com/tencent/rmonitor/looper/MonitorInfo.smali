.class public final Lcom/tencent/rmonitor/looper/MonitorInfo;
.super Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007\u00a2\u0006\u0004\u0008I\u0010JJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004J\u000e\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002J\u0008\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0004J\u0008\u0010\u001a\u001a\u00020\u0019H\u0016R\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\"\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010\u001e\"\u0004\u0008#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u001c\u001a\u0004\u0008%\u0010\u001e\"\u0004\u0008&\u0010 R\"\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010(\u001a\u0004\u0008.\u0010*\"\u0004\u0008/\u0010,R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u0010(\u001a\u0004\u00081\u0010*\"\u0004\u00082\u0010,R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008:\u0010<\"\u0004\u0008=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\"\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010;\u001a\u0004\u0008D\u0010<\"\u0004\u0008E\u0010>R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010(R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010(R\u0016\u0010F\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010;\u00a8\u0006L"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/MonitorInfo;",
        "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;",
        "",
        "getQuickTraceFlag",
        "",
        "delay",
        "",
        "setCollectStackMsgDelayInMs",
        "cost",
        "setCollectStackMsgCostInUs",
        "",
        "count",
        "setCollectStackMsgCount",
        "flag",
        "setQuickTraceFlag",
        "reset",
        "copy",
        "checkUseFileToTransStacks",
        "collectStackMsgDelayInMs",
        "collectStackMsgCostInUs",
        "addCollectStackMsgSample",
        "getCollectStackMsgCount",
        "",
        "getAvgCollectStackMsgCost",
        "getAvgCollectStackMsgDelay",
        "",
        "toString",
        "threadId",
        "Ljava/lang/String;",
        "getThreadId",
        "()Ljava/lang/String;",
        "setThreadId",
        "(Ljava/lang/String;)V",
        "threadName",
        "getThreadName",
        "setThreadName",
        "scene",
        "getScene",
        "setScene",
        "lastStackRequestTime",
        "J",
        "getLastStackRequestTime",
        "()J",
        "setLastStackRequestTime",
        "(J)V",
        "cacheRealStackTime",
        "getCacheRealStackTime",
        "setCacheRealStackTime",
        "duration",
        "getDuration",
        "setDuration",
        "Lorg/json/JSONObject;",
        "fullStack",
        "Lorg/json/JSONObject;",
        "getFullStack",
        "()Lorg/json/JSONObject;",
        "setFullStack",
        "(Lorg/json/JSONObject;)V",
        "isAppInForeground",
        "Z",
        "()Z",
        "setAppInForeground",
        "(Z)V",
        "Lcom/tencent/bugly/proguard/qa;",
        "lagParam",
        "Lcom/tencent/bugly/proguard/qa;",
        "getLagParam",
        "()Lcom/tencent/bugly/proguard/qa;",
        "isDetectedLongLag",
        "setDetectedLongLag",
        "collectStackMsgCount",
        "I",
        "quickTraceFlag",
        "<init>",
        "()V",
        "Companion",
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
.field public static final Companion:Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final MAX_STACK_LENGTH:I = 0x80000

.field public static final POOL_CAPACITY:I = 0xa

.field public static final TAG:Ljava/lang/String; = "RMonitor_looper_MonitorInfo"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final recyclablePool:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/tencent/bugly/common/utils/RecyclablePool;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private volatile cacheRealStackTime:J

.field private collectStackMsgCostInUs:J

.field private collectStackMsgCount:I

.field private collectStackMsgDelayInMs:J

.field private volatile duration:J

.field private volatile fullStack:Lorg/json/JSONObject;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private volatile isAppInForeground:Z

.field private isDetectedLongLag:Z

.field private final lagParam:Lcom/tencent/bugly/proguard/qa;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile lastStackRequestTime:J

.field private quickTraceFlag:Z

.field private volatile scene:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private volatile threadId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile threadName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->Companion:Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->recyclablePool:Ljava/lang/ThreadLocal;

    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/qa;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qa;-><init>()V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 17
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public static final synthetic access$getRecyclablePool$cp()Ljava/lang/ThreadLocal;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->recyclablePool:Ljava/lang/ThreadLocal;

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
.end method


# virtual methods
.method public final addCollectStackMsgSample(JJ)V
    .locals 4

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-lez v2, :cond_0

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 9
    add-long/2addr v2, p1

    .line 10
    .line 11
    iput-wide v2, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 12
    .line 13
    :cond_0
    cmp-long p1, p3, v0

    .line 14
    .line 15
    if-lez p1, :cond_1

    .line 16
    .line 17
    iget-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 18
    add-long/2addr p1, p3

    .line 19
    .line 20
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 21
    .line 22
    :cond_1
    iget p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 27
    return-void
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
.end method

.method public final checkUseFileToTransStacks()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    .line 15
    :goto_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    const/high16 v2, 0x80000

    .line 22
    .line 23
    if-le v1, v2, :cond_1

    .line 24
    const/4 v0, 0x1

    .line 25
    :catchall_0
    :cond_1
    return v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final copy()Lcom/tencent/rmonitor/looper/MonitorInfo;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

    .line 20
    .line 21
    iput-wide v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

    .line 22
    .line 23
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

    .line 26
    .line 27
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

    .line 28
    .line 29
    iput-wide v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

    .line 30
    .line 31
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

    .line 32
    .line 33
    iput-object v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

    .line 36
    .line 37
    iput-boolean v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

    .line 38
    .line 39
    iget-object v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/qa;->a(Lcom/tencent/bugly/proguard/qa;)V

    .line 45
    .line 46
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 47
    .line 48
    iput-wide v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 49
    .line 50
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 51
    .line 52
    iput-wide v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 53
    .line 54
    iget v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 55
    .line 56
    iput v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 57
    .line 58
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

    .line 59
    .line 60
    iput-boolean v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

    .line 61
    .line 62
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

    .line 63
    .line 64
    iput-boolean v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

    .line 65
    return-object v0
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
.end method

.method public final getAvgCollectStackMsgCost()D
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 7
    long-to-double v1, v1

    .line 8
    .line 9
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 10
    mul-double/2addr v1, v3

    .line 11
    int-to-double v3, v0

    .line 12
    div-double/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    return-wide v0
.end method

.method public final getAvgCollectStackMsgDelay()J
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 7
    int-to-long v3, v0

    .line 8
    div-long/2addr v1, v3

    .line 9
    return-wide v1

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getCacheRealStackTime()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

    .line 3
    return-wide v0
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
.end method

.method public final getCollectStackMsgCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

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
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

    .line 3
    return-wide v0
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
.end method

.method public final getFullStack()Lorg/json/JSONObject;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

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
.end method

.method public final getLagParam()Lcom/tencent/bugly/proguard/qa;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

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
.end method

.method public final getLastStackRequestTime()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

    .line 3
    return-wide v0
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
.end method

.method public final getQuickTraceFlag()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

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
.end method

.method public final getScene()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

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
.end method

.method public final getThreadId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

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
.end method

.method public final getThreadName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

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
.end method

.method public final isAppInForeground()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

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
.end method

.method public final isDetectedLongLag()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

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
.end method

.method public reset()V
    .locals 4

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

    .line 23
    .line 24
    iget-object v3, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/qa;->a()V

    .line 28
    .line 29
    iput-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 30
    .line 31
    iput-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 32
    .line 33
    iput v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

    .line 38
    return-void
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
    .line 82
    .line 83
    .line 84
.end method

.method public final setAppInForeground(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

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
.end method

.method public final setCacheRealStackTime(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

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
.end method

.method public final setCollectStackMsgCostInUs(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

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
.end method

.method public final setCollectStackMsgCount(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

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
.end method

.method public final setCollectStackMsgDelayInMs(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

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
.end method

.method public final setDetectedLongLag(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

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
.end method

.method public final setDuration(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

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
.end method

.method public final setFullStack(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->fullStack:Lorg/json/JSONObject;

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
.end method

.method public final setLastStackRequestTime(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

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
.end method

.method public final setQuickTraceFlag(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

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
.end method

.method public final setScene(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

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
.end method

.method public final setThreadId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

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
.end method

.method public final setThreadName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

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
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "MonitorInfo(threadId="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadId:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", threadName="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->threadName:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", scene="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->scene:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", lastStackRequestTime="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lastStackRequestTime:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", cacheRealStackTime="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->cacheRealStackTime:J

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", duration="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->duration:J

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", isAppInForeground="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", lagParam="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", collectStackMsgDelayInMs="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgDelayInMs:J

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, ", collectStackMsgCostInUs="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget-wide v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCostInUs:J

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, ", collectStackMsgCount="

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    iget v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->collectStackMsgCount:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, ", quickTraceFlag="

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->quickTraceFlag:Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, ", isDetectedLongLag="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-boolean v1, p0, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag:Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    move-result-object v0

    .line 137
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method
