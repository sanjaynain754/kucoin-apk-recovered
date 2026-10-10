.class public final Lcom/kubi/monitor/helper/FrameMetricsHelper;
.super Ljava/lang/Object;
.source "FrameMetricsHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/monitor/helper/FrameMetricsHelper;",
        "",
        "Landroid/app/Activity;",
        "activity",
        "<init>",
        "(Landroid/app/Activity;)V",
        "",
        "e",
        "()V",
        "Lyq/a;",
        "c",
        "()Lyq/a;",
        "Landroid/util/SparseIntArray;",
        "frameTimes",
        "d",
        "(Landroid/util/SparseIntArray;)Lyq/a;",
        "Landroidx/core/app/FrameMetricsAggregator;",
        "a",
        "Landroidx/core/app/FrameMetricsAggregator;",
        "frameMetricsAggregator",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "b",
        "Ljava/lang/ref/WeakReference;",
        "activityRef",
        "",
        "Z",
        "isStopped",
        "Companion",
        "Monitor_release"
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
.field public static final d:Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroidx/core/app/FrameMetricsAggregator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->d:Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion$hasFrameMetricsAggregatorClass$2;->INSTANCE:Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion$hasFrameMetricsAggregatorClass$2;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->e:Lkotlin/Lazy;

    .line 17
    .line 18
    new-instance v0, Landroid/os/Handler;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    sput-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->f:Landroid/os/Handler;

    .line 28
    return-void
    .line 29
    .line 30
.end method

.method public constructor <init>(Landroid/app/Activity;)V
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
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->d:Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;->isScreenTraceSupported()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroidx/core/app/FrameMetricsAggregator;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Landroidx/core/app/FrameMetricsAggregator;-><init>()V

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    :goto_0
    iput-object v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->a:Landroidx/core/app/FrameMetricsAggregator;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->b:Ljava/lang/ref/WeakReference;

    .line 33
    return-void
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

.method public static synthetic a(Lcom/kubi/monitor/helper/FrameMetricsHelper;Landroidx/core/app/FrameMetricsAggregator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/monitor/helper/FrameMetricsHelper;->f(Lcom/kubi/monitor/helper/FrameMetricsHelper;Landroidx/core/app/FrameMetricsAggregator;)V

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
.end method

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->e:Lkotlin/Lazy;

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
.end method

.method public static final f(Lcom/kubi/monitor/helper/FrameMetricsHelper;Landroidx/core/app/FrameMetricsAggregator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "$aggregator"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->b:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroid/app/Activity;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    iget-boolean p0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->c:Z

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 29
    move-result p0

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 35
    move-result p0

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/core/app/FrameMetricsAggregator;->add(Landroid/app/Activity;)V

    .line 41
    :cond_1
    :goto_0
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
.end method


# virtual methods
.method public final c()Lyq/a;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->c:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->a:Landroidx/core/app/FrameMetricsAggregator;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    move-object v0, v1

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator;->reset()[Landroid/util/SparseIntArray;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    return-object v1

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    .line 20
    aget-object v0, v0, v2

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    return-object v1

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0, v0}, Lcom/kubi/monitor/helper/FrameMetricsHelper;->d(Landroid/util/SparseIntArray;)Lyq/a;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
    .line 29
    .line 30
.end method

.method public final d(Landroid/util/SparseIntArray;)Lyq/a;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    move v5, v4

    .line 10
    .line 11
    :goto_0
    if-ge v1, v0, :cond_3

    .line 12
    .line 13
    add-int/lit8 v6, v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 17
    move-result v7

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 21
    move-result v1

    .line 22
    add-int/2addr v2, v1

    .line 23
    .line 24
    const/16 v8, 0xbb8

    .line 25
    .line 26
    if-le v7, v8, :cond_0

    .line 27
    add-int/2addr v5, v1

    .line 28
    .line 29
    :cond_0
    const/16 v8, 0x2bc

    .line 30
    .line 31
    if-le v7, v8, :cond_1

    .line 32
    add-int/2addr v4, v1

    .line 33
    .line 34
    :cond_1
    const/16 v8, 0x10

    .line 35
    .line 36
    if-le v7, v8, :cond_2

    .line 37
    add-int/2addr v3, v1

    .line 38
    :cond_2
    move v1, v6

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_3
    new-instance p1, Lyq/a;

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v2, v3, v4, v5}, Lyq/a;-><init>(IIII)V

    .line 45
    return-object p1
.end method

.method public final e()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/monitor/helper/FrameMetricsHelper;->a:Landroidx/core/app/FrameMetricsAggregator;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    sget-object v1, Lcom/kubi/monitor/helper/FrameMetricsHelper;->f:Landroid/os/Handler;

    .line 8
    .line 9
    new-instance v2, Lcom/kubi/monitor/helper/c;

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, p0, v0}, Lcom/kubi/monitor/helper/c;-><init>(Lcom/kubi/monitor/helper/FrameMetricsHelper;Landroidx/core/app/FrameMetricsAggregator;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 16
    return-void
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
.end method
