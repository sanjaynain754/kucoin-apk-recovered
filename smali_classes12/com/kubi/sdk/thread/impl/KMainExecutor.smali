.class public final Lcom/kubi/sdk/thread/impl/KMainExecutor;
.super Ljava/lang/Object;
.source "KMainExecutor.kt"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Lcom/kubi/sdk/thread/IKExecutor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/thread/impl/KMainExecutor$MainThreadException;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/sdk/thread/impl/KMainExecutor;",
        "Ljava/util/concurrent/Executor;",
        "Lcom/kubi/sdk/thread/IKExecutor;",
        "<init>",
        "()V",
        "Ljava/lang/Runnable;",
        "command",
        "",
        "execute",
        "(Ljava/lang/Runnable;)V",
        "",
        "b",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "Lq00/c;",
        "c",
        "Lq00/c;",
        "monitor",
        "Landroid/os/Handler;",
        "d",
        "Landroid/os/Handler;",
        "mainHandler",
        "MainThreadException",
        "ThreadPool_release"
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lq00/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "kPool-main"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->b:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Lq00/e;->a:Lq00/e;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lq00/e;->a(Lcom/kubi/sdk/thread/IKExecutor;)Lq00/c;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 16
    .line 17
    new-instance v0, Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->d:Landroid/os/Handler;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic a(Lcom/kubi/sdk/thread/impl/KMainExecutor;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/sdk/thread/impl/KMainExecutor;->b(Lcom/kubi/sdk/thread/impl/KMainExecutor;Ljava/lang/Runnable;)V

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

.method public static final b(Lcom/kubi/sdk/thread/impl/KMainExecutor;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lq00/c;->b(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, p1, v0}, Lq00/c;->a(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    .line 23
    :try_start_1
    sget-object v1, Lq00/e;->a:Lq00/e;

    .line 24
    .line 25
    new-instance v2, Lcom/kubi/sdk/thread/impl/KMainExecutor$MainThreadException;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/kubi/sdk/thread/impl/KMainExecutor$MainThreadException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lq00/e;->b(Lcom/kubi/sdk/thread/KThreadException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    iget-object p0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, p1, v0}, Lq00/c;->a(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    .line 37
    return-void

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    .line 40
    iget-object p0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, p1, v0}, Lq00/c;->a(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    .line 44
    throw v1
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
.method public execute(Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->c:Lq00/c;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->d:Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface {v0, p1}, Lq00/c;->c(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->d:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v1, Lp00/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Lp00/a;-><init>(Lcom/kubi/sdk/thread/impl/KMainExecutor;Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/thread/impl/KMainExecutor;->b:Ljava/lang/String;

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
