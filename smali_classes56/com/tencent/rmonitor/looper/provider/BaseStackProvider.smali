.class public abstract Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/looper/provider/BaseStackProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\u00a2\u0006\u0004\u0008-\u0010.J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000cH\u0016J\u0010\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\u0013\u001a\u00020\nH&J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000cH&J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000cH&J\u0008\u0010\u0016\u001a\u00020\nH&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0004J\u0008\u0010\u0019\u001a\u00020\u0018H\u0004J\u0008\u0010\u001a\u001a\u00020\u0018H\u0004J\u0006\u0010\u001b\u001a\u00020\u0008J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0008J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010$\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0016\u0010\'\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u00060"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;",
        "Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;",
        "Ljava/lang/Thread;",
        "thread",
        "Lcom/tencent/bugly/proguard/qa;",
        "lagParam",
        "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;",
        "callback",
        "",
        "prepare",
        "",
        "stop",
        "",
        "startTime",
        "dispatchStart",
        "endTime",
        "duration",
        "dispatchEnd",
        "init",
        "release",
        "Lcom/tencent/rmonitor/looper/MonitorInfo;",
        "monitorInfo",
        "checkStackTraceNormal",
        "getLooperThread",
        "",
        "getLooperThreadName",
        "getLooperThreadId",
        "shouldSuspendBeforeGetStack",
        "normal",
        "markStackTrace",
        "appendData",
        "Lcom/tencent/bugly/proguard/qa;",
        "getLagParam",
        "()Lcom/tencent/bugly/proguard/qa;",
        "looperThreadName",
        "Ljava/lang/String;",
        "looperThreadId",
        "looperThread",
        "Ljava/lang/Thread;",
        "isInit",
        "Z",
        "Lcom/tencent/rmonitor/looper/MonitorInfo;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isStackTraceNormal",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
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
.field public static final Companion:Lcom/tencent/rmonitor/looper/provider/BaseStackProvider$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_looper_StackProvider"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private volatile isInit:Z

.field private isStackTraceNormal:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final lagParam:Lcom/tencent/bugly/proguard/qa;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile looperThread:Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private looperThreadId:Ljava/lang/String;

.field private looperThreadName:Ljava/lang/String;

.field private monitorInfo:Lcom/tencent/rmonitor/looper/MonitorInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->Companion:Lcom/tencent/rmonitor/looper/provider/BaseStackProvider$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/qa;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qa;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isStackTraceNormal:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    return-void
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


# virtual methods
.method public final appendData(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 1
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "monitorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getScene()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setAppInForeground(Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setScene(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThreadId()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setThreadId(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThreadName()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setThreadName(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/qa;->a(Lcom/tencent/bugly/proguard/qa;)V

    .line 51
    :cond_0
    return-void
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
.end method

.method public abstract checkStackTraceNormal()V
.end method

.method public dispatchEnd(JJ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "RMonitor_looper_StackProvider"

    const-string p3, "dispatch end fail because provide is not prepared."

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->monitorInfo:Lcom/tencent/rmonitor/looper/MonitorInfo;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1, p3, p4}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setDuration(J)V

    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    .line 5
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->dispatchEnd(Lcom/tencent/rmonitor/looper/MonitorInfo;JJ)V

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/looper/MonitorInfo;->Companion:Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;->recycle(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    const/4 p1, 0x0

    .line 7
    iput-object p1, v0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->monitorInfo:Lcom/tencent/rmonitor/looper/MonitorInfo;

    return-void
.end method

.method public abstract dispatchEnd(Lcom/tencent/rmonitor/looper/MonitorInfo;JJ)V
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public dispatchStart(J)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    const-string v1, "RMonitor_looper_StackProvider"

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "dispatch start fail because provide is not prepared."

    filled-new-array {v1, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isStackTraceNormal:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->checkStackTraceNormal()V

    .line 5
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "dispatch start fail because stack trace not normal."

    filled-new-array {v1, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->monitorInfo:Lcom/tencent/rmonitor/looper/MonitorInfo;

    if-eqz v0, :cond_2

    .line 7
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "last msg not call dispatchEnd, key: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 8
    sget-object v1, Lcom/tencent/rmonitor/looper/MonitorInfo;->Companion:Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;->recycle(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 9
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/looper/MonitorInfo;->Companion:Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;->obtain()Lcom/tencent/rmonitor/looper/MonitorInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->monitorInfo:Lcom/tencent/rmonitor/looper/MonitorInfo;

    if-eqz v0, :cond_3

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setLastStackRequestTime(J)V

    .line 11
    invoke-virtual {p0, v0, p1, p2}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->dispatchStart(Lcom/tencent/rmonitor/looper/MonitorInfo;J)V

    :cond_3
    return-void
.end method

.method public abstract dispatchStart(Lcom/tencent/rmonitor/looper/MonitorInfo;J)V
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final getLagParam()Lcom/tencent/bugly/proguard/qa;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->lagParam:Lcom/tencent/bugly/proguard/qa;

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

.method public final getLooperThread()Ljava/lang/Thread;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThread:Ljava/lang/Thread;

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

.method public final getLooperThreadId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThreadId:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "looperThreadId"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getLooperThreadName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThreadName:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "looperThreadName"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public abstract init(Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z
    .param p1    # Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final markStackTrace(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isStackTraceNormal:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isStackTraceNormal:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "markStackTrace, pre: "

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, ", new: "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string v0, "RMonitor_looper_StackProvider"

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 47
    :cond_0
    return-void
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
.end method

.method public prepare(Ljava/lang/Thread;Lcom/tencent/bugly/proguard/qa;Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z
    .locals 2
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/proguard/qa;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "thread"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "lagParam"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "callback"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "thread.name"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThreadName:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 30
    move-result-wide v0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThreadId:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThread:Ljava/lang/Thread;

    .line 39
    .line 40
    iget-object p1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/qa;->a(Lcom/tencent/bugly/proguard/qa;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p3}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->init(Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z

    .line 47
    move-result p1

    .line 48
    .line 49
    iput-boolean p1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    .line 50
    .line 51
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 52
    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "prepare stack provider, isInit: "

    .line 56
    .line 57
    .line 58
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, ", lagParam: "

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object p2

    .line 76
    .line 77
    const-string p3, "RMonitor_looper_StackProvider"

    .line 78
    .line 79
    .line 80
    filled-new-array {p3, p2}, [Ljava/lang/String;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 85
    .line 86
    iget-boolean p1, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    .line 87
    return p1
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
.end method

.method public abstract release()V
.end method

.method public final shouldSuspendBeforeGetStack()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 5
    return v0
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

.method public stop()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->isInit:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->release()V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->looperThread:Ljava/lang/Thread;

    .line 10
    .line 11
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 12
    .line 13
    const-string v1, "RMonitor_looper_StackProvider"

    .line 14
    .line 15
    const-string v2, "stop"

    .line 16
    .line 17
    .line 18
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 23
    return-void
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
