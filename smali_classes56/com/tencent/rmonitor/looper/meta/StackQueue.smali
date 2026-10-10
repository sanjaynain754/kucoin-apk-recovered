.class public final Lcom/tencent/rmonitor/looper/meta/StackQueue;
.super Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0019\u0010\u000c\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\n2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0008\u0012\u0004\u0012\u00020\n0\u0015J\u0008\u0010\u0016\u001a\u00020\nH\u0016J\u0008\u0010\u0017\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/meta/StackQueue;",
        "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;",
        "()V",
        "curStackFrame",
        "Lcom/tencent/rmonitor/looper/meta/StackFrame;",
        "sliceIndex",
        "",
        "stackFrameQueue",
        "",
        "addStackFrameToQueue",
        "",
        "stackFrame",
        "addStackTrace",
        "stackTrace",
        "",
        "Ljava/lang/StackTraceElement;",
        "([Ljava/lang/StackTraceElement;)V",
        "buildNewFrame",
        "(I[Ljava/lang/StackTraceElement;)Lcom/tencent/rmonitor/looper/meta/StackFrame;",
        "dealStackTrace",
        "callback",
        "Lkotlin/Function1;",
        "reset",
        "resetCurStackFrame",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final poolProvider:Lcom/tencent/rmonitor/looper/meta/PoolProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sliceIndex:I

.field private final stackFrameQueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/looper/meta/StackFrame;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->Companion:Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;

    .line 11
    .line 12
    const-class v1, Lcom/tencent/rmonitor/looper/meta/StackQueue;

    .line 13
    .line 14
    const/16 v2, 0x23

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/tencent/rmonitor/looper/meta/PoolProvider;-><init>(Ljava/lang/Class;I)V

    .line 18
    .line 19
    sput-object v0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->poolProvider:Lcom/tencent/rmonitor/looper/meta/PoolProvider;

    .line 20
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static final synthetic access$getPoolProvider$cp()Lcom/tencent/rmonitor/looper/meta/PoolProvider;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->poolProvider:Lcom/tencent/rmonitor/looper/meta/PoolProvider;

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

.method private final addStackFrameToQueue(Lcom/tencent/rmonitor/looper/meta/StackFrame;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/tencent/rmonitor/looper/meta/StackFrame;->setEndTime(J)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_0
    return-void
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

.method private final buildNewFrame(I[Ljava/lang/StackTraceElement;)Lcom/tencent/rmonitor/looper/meta/StackFrame;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/meta/StackFrame;->Companion:Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;->obtain()Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lcom/tencent/rmonitor/looper/meta/StackFrame;->init(I[Ljava/lang/StackTraceElement;)V

    .line 12
    :cond_0
    return-object v0
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
.end method

.method private final resetCurStackFrame()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

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
.end method


# virtual methods
.method public final addStackTrace([Ljava/lang/StackTraceElement;)V
    .locals 2
    .param p1    # [Ljava/lang/StackTraceElement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "stackTrace"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->sliceIndex:I

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->buildNewFrame(I[Ljava/lang/StackTraceElement;)Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/looper/meta/StackFrame;->isSameStackTrace([Ljava/lang/StackTraceElement;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/rmonitor/looper/meta/StackFrame;->getFrameCount()I

    .line 28
    move-result p1

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/looper/meta/StackFrame;->setFrameCount(I)V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-direct {p0, v0}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->addStackFrameToQueue(Lcom/tencent/rmonitor/looper/meta/StackFrame;)V

    .line 38
    .line 39
    iget v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->sliceIndex:I

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->buildNewFrame(I[Ljava/lang/StackTraceElement;)Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 46
    .line 47
    :goto_0
    iget p1, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->sliceIndex:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    iput p1, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->sliceIndex:I

    .line 52
    return-void
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

.method public final dealStackTrace(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/looper/meta/StackFrame;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->addStackFrameToQueue(Lcom/tencent/rmonitor/looper/meta/StackFrame;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->resetCurStackFrame()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public reset()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->curStackFrame:Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lcom/tencent/rmonitor/looper/meta/StackFrame;->Companion:Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;->recycle(Lcom/tencent/rmonitor/looper/meta/StackFrame;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/meta/StackQueue;->resetCurStackFrame()V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    .line 22
    :goto_0
    if-ge v2, v0, :cond_1

    .line 23
    .line 24
    sget-object v3, Lcom/tencent/rmonitor/looper/meta/StackFrame;->Companion:Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    check-cast v4, Lcom/tencent/rmonitor/looper/meta/StackFrame;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;->recycle(Lcom/tencent/rmonitor/looper/meta/StackFrame;)V

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->stackFrameQueue:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 44
    .line 45
    iput v1, p0, Lcom/tencent/rmonitor/looper/meta/StackQueue;->sliceIndex:I

    .line 46
    return-void
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
