.class public final Lcom/kubi/network/subscribe/period/PeriodExecutor;
.super Landroid/os/HandlerThread;
.source "PeriodExecutor.kt"

# interfaces
.implements Lzr/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/network/subscribe/period/PeriodExecutor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/HandlerThread;",
        "Lzr/a<",
        "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000  2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001!B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kubi/network/subscribe/period/PeriodExecutor;",
        "Landroid/os/HandlerThread;",
        "Lzr/a;",
        "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
        "Ler/a;",
        "socketClient",
        "onetimeExecutor",
        "<init>",
        "(Ler/a;Lzr/a;)V",
        "",
        "start",
        "()V",
        "request",
        "d",
        "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V",
        "c",
        "f",
        "",
        "e",
        "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)I",
        "b",
        "Ler/a;",
        "Lzr/a;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "count",
        "Lyr/a;",
        "Lyr/a;",
        "heartbeatQueue",
        "",
        "Ljava/util/List;",
        "executeQueue",
        "g",
        "Companion",
        "network-core-subscribe_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPeriodExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodExecutor.kt\ncom/kubi/network/subscribe/period/PeriodExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n766#2:94\n857#2,2:95\n766#2:97\n857#2,2:98\n1855#2,2:100\n*S KotlinDebug\n*F\n+ 1 PeriodExecutor.kt\ncom/kubi/network/subscribe/period/PeriodExecutor\n*L\n72#1:94\n72#1:95,2\n74#1:97\n74#1:98,2\n76#1:100,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/kubi/network/subscribe/period/PeriodExecutor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Ler/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lzr/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzr/a<",
            "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lyr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/subscribe/period/PeriodExecutor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/network/subscribe/period/PeriodExecutor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->g:Lcom/kubi/network/subscribe/period/PeriodExecutor$Companion;

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

.method public constructor <init>(Ler/a;Lzr/a;)V
    .locals 1
    .param p1    # Ler/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lzr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ler/a;",
            "Lzr/a<",
            "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "socketClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "onetimeExecutor"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "PeriodExecutor"

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->b:Ler/a;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->c:Lzr/a;

    .line 20
    .line 21
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance p1, Lyr/a;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Lyr/a;-><init>()V

    .line 32
    .line 33
    iput-object p1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    iput-object p1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->f:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/kubi/network/subscribe/period/PeriodExecutor;->start()V

    .line 44
    return-void
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

.method public static final synthetic b(Lcom/kubi/network/subscribe/period/PeriodExecutor;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/network/subscribe/period/PeriodExecutor;->f()V

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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/network/api/subscribe/model/PeriodRequest;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/network/subscribe/period/PeriodExecutor;->d(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V

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

.method public final c()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lyr/a;->clear()V

    .line 9
    .line 10
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0

    .line 15
    throw v1
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

.method public d(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V
    .locals 2
    .param p1    # Lcom/kubi/network/api/subscribe/model/PeriodRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lyr/a;->a(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0

    .line 20
    throw p1
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

.method public final e(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->b:Ler/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ler/a;->c()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "connected"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/PeriodRequest;->getConnectedPeriod()I

    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/PeriodRequest;->getDisconnectPeriod()I

    .line 23
    move-result p1

    .line 24
    return p1
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

.method public final f()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/network/socket/utils/g;->a:Lcom/kubi/network/socket/utils/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/network/socket/utils/g;->h()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v0, "CATEGORY_SOCKET"

    .line 25
    .line 26
    const-string v1, "Socket\u8f6e\u8bad\u8ba1\u6570\u91cd\u7f6e"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 38
    monitor-enter v0

    .line 39
    .line 40
    :try_start_0
    iget-object v1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->f:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 44
    .line 45
    iget-object v1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->f:Ljava/util/List;

    .line 46
    .line 47
    iget-object v2, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e:Lyr/a;

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v0

    .line 52
    .line 53
    sget-object v0, Lcom/kubi/network/socket/utils/d;->a:Lcom/kubi/network/socket/utils/d;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/network/socket/utils/d;->b()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    iget-object v1, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->f:Ljava/util/List;

    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    move-result v3

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    move-result-object v3

    .line 79
    move-object v4, v3

    .line 80
    .line 81
    check-cast v4, Lcom/kubi/network/api/subscribe/model/PeriodRequest;

    .line 82
    .line 83
    iget-object v5, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 87
    move-result v5

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v4}, Lcom/kubi/network/subscribe/period/PeriodExecutor;->e(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)I

    .line 91
    move-result v4

    .line 92
    rem-int/2addr v5, v4

    .line 93
    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    move-result v3

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    move-result-object v3

    .line 118
    move-object v4, v3

    .line 119
    .line 120
    check-cast v4, Lcom/kubi/network/api/subscribe/model/PeriodRequest;

    .line 121
    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Lcom/kubi/network/api/subscribe/model/PeriodRequest;->getSupportBackground()Z

    .line 126
    move-result v4

    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    goto :goto_2

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    move-result v1

    .line 141
    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    check-cast v1, Lcom/kubi/network/api/subscribe/model/PeriodRequest;

    .line 149
    .line 150
    iget-object v2, p0, Lcom/kubi/network/subscribe/period/PeriodExecutor;->c:Lzr/a;

    .line 151
    .line 152
    .line 153
    invoke-interface {v2, v1}, Lzr/a;->a(Ljava/lang/Object;)V

    .line 154
    goto :goto_3

    .line 155
    :cond_7
    :goto_4
    return-void

    .line 156
    :catchall_0
    move-exception v1

    .line 157
    monitor-exit v0

    .line 158
    throw v1
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
.end method

.method public start()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Thread;->start()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/network/subscribe/period/PeriodExecutor$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, v0}, Lcom/kubi/network/subscribe/period/PeriodExecutor$a;-><init>(Lcom/kubi/network/subscribe/period/PeriodExecutor;Landroid/os/Looper;)V

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    const-wide/16 v2, 0x3e8

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

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
.end method
