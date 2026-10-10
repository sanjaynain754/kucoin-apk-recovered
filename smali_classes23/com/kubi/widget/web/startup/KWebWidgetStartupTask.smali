.class public final Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;
.super Ljava/lang/Object;
.source "KWebWidgetStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "k_web_widget"
    priority = 0x64
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->Application:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Await:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u0008H\u0002J\u0008\u0010\u000c\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "dependencies",
        "Lcom/kubi/widget/web/startup/KWebStartupDependencies;",
        "<init>",
        "(Lcom/kubi/widget/web/startup/KWebStartupDependencies;)V",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "runLegacy",
        "runParallelPrepare",
        "LWebWidget_googleRelease"
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
.field private final dependencies:Lcom/kubi/widget/web/startup/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    sget-object v0, Lcom/kubi/widget/web/startup/b;->a:Lcom/kubi/widget/web/startup/b;

    invoke-direct {p0, v0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;-><init>(Lcom/kubi/widget/web/startup/j;)V

    return-void
.end method

.method public constructor <init>(Lcom/kubi/widget/web/startup/j;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/startup/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dependencies"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    return-void
.end method

.method public static synthetic a(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$1(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic b(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$0(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic c(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$3(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic d(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$6(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic e(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$2(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic f(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$5(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic g(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$4(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic h(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare$lambda$7(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final runLegacy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/widget/web/startup/j;->f()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lcom/kubi/widget/web/startup/j;->n()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lcom/kubi/widget/web/startup/j;->k()V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lcom/kubi/widget/web/startup/j;->e()V

    .line 21
    return-void
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
.end method

.method private final runParallelPrepare()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/startup/KWebParallelPrepareRunner;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lcom/kubi/widget/web/startup/j;->i()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/kubi/widget/web/startup/KWebParallelPrepareRunner;-><init>(Lkotlinx/coroutines/j0;)V

    .line 12
    .line 13
    new-instance v1, Lcom/kubi/widget/web/startup/l;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/startup/l;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 17
    .line 18
    new-instance v2, Lcom/kubi/widget/web/startup/m;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, p0}, Lcom/kubi/widget/web/startup/m;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 22
    .line 23
    new-instance v3, Lcom/kubi/widget/web/startup/n;

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, p0}, Lcom/kubi/widget/web/startup/n;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 27
    .line 28
    new-instance v4, Lcom/kubi/widget/web/startup/o;

    .line 29
    .line 30
    .line 31
    invoke-direct {v4, p0}, Lcom/kubi/widget/web/startup/o;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 32
    .line 33
    new-instance v5, Lcom/kubi/widget/web/startup/p;

    .line 34
    .line 35
    .line 36
    invoke-direct {v5, p0}, Lcom/kubi/widget/web/startup/p;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 37
    .line 38
    new-instance v6, Lcom/kubi/widget/web/startup/q;

    .line 39
    .line 40
    .line 41
    invoke-direct {v6, p0}, Lcom/kubi/widget/web/startup/q;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 42
    .line 43
    new-instance v7, Lcom/kubi/widget/web/startup/r;

    .line 44
    .line 45
    .line 46
    invoke-direct {v7, p0}, Lcom/kubi/widget/web/startup/r;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 47
    .line 48
    new-instance v8, Lcom/kubi/widget/web/startup/s;

    .line 49
    .line 50
    .line 51
    invoke-direct {v8, p0}, Lcom/kubi/widget/web/startup/s;-><init>(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {v0 .. v8}, Lcom/kubi/widget/web/startup/KWebParallelPrepareRunner;->b(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 55
    return-void
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
.end method

.method private static final runParallelPrepare$lambda$0(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/widget/web/startup/j;->l()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static final runParallelPrepare$lambda$1(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/widget/web/startup/j;->g()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static final runParallelPrepare$lambda$2(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lcom/kubi/widget/web/startup/t;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/widget/web/startup/j;->a()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static final runParallelPrepare$lambda$3(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1}, Lcom/kubi/widget/web/startup/j;->c(Lcom/kubi/widget/web/startup/t;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method private static final runParallelPrepare$lambda$4(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/widget/web/startup/j;->h()V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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

.method private static final runParallelPrepare$lambda$5(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1}, Lcom/kubi/widget/web/startup/j;->m(Lcom/kubi/widget/web/startup/t;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method private static final runParallelPrepare$lambda$6(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;Lcom/kubi/widget/web/startup/t;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1}, Lcom/kubi/widget/web/startup/j;->d(Lcom/kubi/widget/web/startup/t;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method private static final runParallelPrepare$lambda$7(Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/widget/web/startup/j;->j()V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->dependencies:Lcom/kubi/widget/web/startup/j;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lcom/kubi/widget/web/startup/j;->b()Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runParallelPrepare()V

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;->runLegacy()V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method
