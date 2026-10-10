.class public final Lcom/jumio/core/scope/DefaultScopeProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/scope/ScopeProviderInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\"\u001a\u00020\u0001H\u0016J\u0008\u0010#\u001a\u00020$H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018*\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00108VX\u0096\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u0018*\u0004\u0008\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00108VX\u0096\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010\u0018*\u0004\u0008\u001d\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u00108VX\u0096\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u0018*\u0004\u0008 \u0010\u0016\u00a8\u0006%"
    }
    d2 = {
        "Lcom/jumio/core/scope/DefaultScopeProvider;",
        "Lcom/jumio/core/scope/ScopeProviderInterface;",
        "mainDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "mainImmediateDispatcher",
        "backgroundDispatcher",
        "ioDispatcher",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V",
        "getMainDispatcher",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "getMainImmediateDispatcher",
        "getBackgroundDispatcher",
        "getIoDispatcher",
        "mainScopeLazy",
        "Lkotlin/Lazy;",
        "Lkotlinx/coroutines/CoroutineScope;",
        "mainImmediateScopeLazy",
        "backgroundScopeLazy",
        "ioScopeLazy",
        "mainScope",
        "getMainScope$delegate",
        "(Lcom/jumio/core/scope/DefaultScopeProvider;)Ljava/lang/Object;",
        "getMainScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "mainImmediateScope",
        "getMainImmediateScope$delegate",
        "getMainImmediateScope",
        "backgroundScope",
        "getBackgroundScope$delegate",
        "getBackgroundScope",
        "ioScope",
        "getIoScope$delegate",
        "getIoScope",
        "fork",
        "cancelAll",
        "",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/j0;

.field public final b:Lkotlinx/coroutines/j0;

.field public final c:Lkotlinx/coroutines/j0;

.field public final d:Lkotlinx/coroutines/j0;

.field public final e:Lkotlin/Lazy;

.field public final f:Lkotlin/Lazy;

.field public final g:Lkotlin/Lazy;

.field public final h:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/jumio/core/scope/DefaultScopeProvider;-><init>(Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mainDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainImmediateDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->a:Lkotlinx/coroutines/j0;

    .line 4
    iput-object p2, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->b:Lkotlinx/coroutines/j0;

    .line 5
    iput-object p3, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->c:Lkotlinx/coroutines/j0;

    .line 6
    iput-object p4, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->d:Lkotlinx/coroutines/j0;

    .line 7
    new-instance p1, Lv9/a;

    invoke-direct {p1, p0}, Lv9/a;-><init>(Lcom/jumio/core/scope/DefaultScopeProvider;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->e:Lkotlin/Lazy;

    .line 8
    new-instance p1, Lv9/b;

    invoke-direct {p1, p0}, Lv9/b;-><init>(Lcom/jumio/core/scope/DefaultScopeProvider;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->f:Lkotlin/Lazy;

    .line 9
    new-instance p1, Lv9/c;

    invoke-direct {p1, p0}, Lv9/c;-><init>(Lcom/jumio/core/scope/DefaultScopeProvider;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->g:Lkotlin/Lazy;

    .line 10
    new-instance p1, Lv9/d;

    invoke-direct {p1, p0}, Lv9/d;-><init>(Lcom/jumio/core/scope/DefaultScopeProvider;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->h:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 11
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 12
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object p2

    invoke-virtual {p2}, Lkotlinx/coroutines/e2;->getImmediate()Lkotlinx/coroutines/e2;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 13
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    move-result-object p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 14
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object p4

    .line 15
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/scope/DefaultScopeProvider;-><init>(Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;)V

    return-void
.end method

.method public static final a(Lcom/jumio/core/scope/DefaultScopeProvider;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static final b(Lcom/jumio/core/scope/DefaultScopeProvider;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getIoDispatcher()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static final c(Lcom/jumio/core/scope/DefaultScopeProvider;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainImmediateDispatcher()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static final d(Lcom/jumio/core/scope/DefaultScopeProvider;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainDispatcher()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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


# virtual methods
.method public cancelAll()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->isInitialized()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainScope()Lkotlinx/coroutines/m0;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/z1;->i(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->f:Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lkotlin/Lazy;->isInitialized()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainImmediateScope()Lkotlinx/coroutines/m0;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/z1;->i(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->g:Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Lkotlin/Lazy;->isInitialized()Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getBackgroundScope()Lkotlinx/coroutines/m0;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/z1;->i(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->h:Lkotlin/Lazy;

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Lkotlin/Lazy;->isInitialized()Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getIoScope()Lkotlinx/coroutines/m0;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/z1;->i(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 79
    :cond_3
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public fork()Lcom/jumio/core/scope/ScopeProviderInterface;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/scope/DefaultScopeProvider;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainDispatcher()Lkotlinx/coroutines/j0;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getMainImmediateDispatcher()Lkotlinx/coroutines/j0;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/jumio/core/scope/DefaultScopeProvider;->getIoDispatcher()Lkotlinx/coroutines/j0;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/jumio/core/scope/DefaultScopeProvider;-><init>(Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;Lkotlinx/coroutines/j0;)V

    .line 22
    return-object v0
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

.method public getBackgroundDispatcher()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->c:Lkotlinx/coroutines/j0;

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

.method public getBackgroundScope()Lkotlinx/coroutines/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getIoDispatcher()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->d:Lkotlinx/coroutines/j0;

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

.method public getIoScope()Lkotlinx/coroutines/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->h:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getMainDispatcher()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->a:Lkotlinx/coroutines/j0;

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

.method public getMainImmediateDispatcher()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->b:Lkotlinx/coroutines/j0;

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

.method public getMainImmediateScope()Lkotlinx/coroutines/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getMainScope()Lkotlinx/coroutines/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scope/DefaultScopeProvider;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlinx/coroutines/x1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/scope/ScopeProviderInterface;->postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlinx/coroutines/x1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
