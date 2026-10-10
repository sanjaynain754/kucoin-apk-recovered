.class public final Lcom/kubi/sdk/site/startup/SiteFetchStartupTask;
.super Ljava/lang/Object;
.source "SiteFetchStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "site"
    priority = 0x0
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->MainPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Async:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/sdk/site/startup/SiteFetchStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "LSite_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSiteFetchStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,40:1\n47#2,4:41\n*S KotlinDebug\n*F\n+ 1 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n*L\n31#1:41,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 6
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
    const-string p1, "Startup"

    .line 8
    .line 9
    const-string v0, "SiteStartupTask start"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance p1, Lkotlinx/coroutines/l0;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v0, "siteUpdate"

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    sget-object v0, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 23
    .line 24
    new-instance v1, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    new-instance v3, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask$run$1;

    .line 38
    const/4 p1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct {v3, p1}, Lcom/kubi/sdk/site/startup/SiteFetchStartupTask$run$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 42
    const/4 v4, 0x3

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 49
    return-void
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
.end method
