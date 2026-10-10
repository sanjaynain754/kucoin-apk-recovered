.class public final Log0/k$a;
.super Ljava/lang/Object;
.source "LimitedDispatcher.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Log0/k$a;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "currentTask",
        "<init>",
        "(Log0/k;Ljava/lang/Runnable;)V",
        "",
        "run",
        "()V",
        "b",
        "Ljava/lang/Runnable;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n29#2:155\n16#3:156\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n*L\n139#1:155\n139#1:156\n*E\n"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic c:Log0/k;


# direct methods
.method public constructor <init>(Log0/k;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Log0/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Log0/k$a;->c:Log0/k;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Log0/k$a;->b:Ljava/lang/Runnable;

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
.method public run()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :cond_0
    :try_start_0
    iget-object v1, p0, Log0/k$a;->b:Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    .line 10
    :try_start_1
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v1}, Lkotlinx/coroutines/k0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Log0/k$a;->c:Log0/k;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Log0/k;->M(Log0/k;)Ljava/lang/Runnable;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    iput-object v1, p0, Log0/k$a;->b:Ljava/lang/Runnable;

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    const/16 v1, 0x10

    .line 29
    .line 30
    if-lt v0, v1, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Log0/k$a;->c:Log0/k;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Log0/k;->p(Log0/k;)Lkotlinx/coroutines/j0;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    iget-object v2, p0, Log0/k$a;->c:Log0/k;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Log0/i;->d(Lkotlinx/coroutines/j0;Lkotlin/coroutines/CoroutineContext;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Log0/k$a;->c:Log0/k;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Log0/k;->p(Log0/k;)Lkotlinx/coroutines/j0;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iget-object v1, p0, Log0/k$a;->c:Log0/k;

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, p0}, Log0/i;->c(Lkotlinx/coroutines/j0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    :goto_1
    return-void

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    .line 59
    iget-object v1, p0, Log0/k$a;->c:Log0/k;

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Log0/k;->L(Log0/k;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    iget-object v2, p0, Log0/k$a;->c:Log0/k;

    .line 66
    monitor-enter v1

    .line 67
    .line 68
    .line 69
    :try_start_2
    invoke-static {}, Log0/k;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 74
    monitor-exit v1

    .line 75
    throw v0

    .line 76
    :catchall_2
    move-exception v0

    .line 77
    monitor-exit v1

    .line 78
    throw v0
    .line 79
    .line 80
.end method
