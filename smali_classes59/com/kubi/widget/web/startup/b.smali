.class public final Lcom/kubi/widget/web/startup/b;
.super Ljava/lang/Object;
.source "KWebStartupDependencies.kt"

# interfaces
.implements Lcom/kubi/widget/web/startup/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\r\u001a\u00020\u000bH\u0016J\u0008\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u000b2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u0008\u0010\u0018\u001a\u00020\u000bH\u0016J\u0016\u0010\u0019\u001a\u00020\u000b2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u001c\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140\u0010H\u0016J\u0008\u0010\u001b\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/widget/web/startup/DefaultKWebStartupDependencies;",
        "Lcom/kubi/widget/web/startup/KWebStartupDependencies;",
        "<init>",
        "()V",
        "prepareDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "getPrepareDispatcher",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "isParallelEnabled",
        "",
        "loadExperimentLegacy",
        "",
        "loadSiteAndBaseLegacy",
        "loadWhitePageLegacy",
        "loadSsgLegacy",
        "prepareExperiment",
        "Lcom/kubi/widget/web/startup/PreparedConfig;",
        "prepareWhitePage",
        "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;",
        "prepareSsg",
        "",
        "Lcom/kubi/sdk/web/config/WebSsgInfo;",
        "applyExperiment",
        "prepared",
        "applySiteAndBase",
        "applyWhitePage",
        "applySsg",
        "registerSsgObserver",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKWebStartupDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/DefaultKWebStartupDependencies\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,131:1\n35#2,4:132\n39#2:138\n44#3,2:136\n*S KotlinDebug\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/DefaultKWebStartupDependencies\n*L\n49#1:132,4\n49#1:138\n49#1:136,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/widget/web/startup/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlinx/coroutines/j0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/startup/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/startup/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/widget/web/startup/b;->a:Lcom/kubi/widget/web/startup/b;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x3

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v3, v1, v2, v1}, Lkotlinx/coroutines/j0;->limitedParallelism$default(Lkotlinx/coroutines/j0;ILjava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/j0;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/kubi/widget/web/startup/b;->b:Lkotlinx/coroutines/j0;

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
.end method

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
.end method

.method public static synthetic o()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/startup/b;->p()Ljava/lang/Boolean;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final p()Ljava/lang/Boolean;
    .locals 8

    .line 1
    .line 2
    const-string v0, "android_startup_kweb_parallel_prepare"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/widget/web/startup/b$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/b$a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "object : TypeToken<T>() {}.type"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object v2, v0

    .line 27
    .line 28
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 29
    .line 30
    const/16 v6, 0x8

    .line 31
    const/4 v7, 0x0

    .line 32
    .line 33
    const-string v3, "RemoteConfig"

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    const/4 v0, 0x2

    .line 40
    const/4 v2, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 44
    move-object v0, v2

    .line 45
    .line 46
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    return-object v0
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
.end method


# virtual methods
.method public a()Lcom/kubi/widget/web/startup/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/util/List<",
            "Lx00/d;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/SsgConfigHelper;->a:Lcom/kubi/widget/web/helper/SsgConfigHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/SsgConfigHelper;->n()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public b()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/startup/k;->a:Lcom/kubi/widget/web/startup/k;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/widget/web/startup/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/startup/k;->a(Lkotlin/jvm/functions/Function0;)Z

    .line 11
    move-result v0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public c(Lcom/kubi/widget/web/startup/t;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "prepared"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Lt80/a;->a:Lt80/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lt80/a;->a(Lcom/kubi/widget/web/startup/t;)V

    .line 12
    return-void
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
.end method

.method public d(Lcom/kubi/widget/web/startup/t;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "+",
            "Ljava/util/List<",
            "Lx00/d;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "prepared"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/widget/web/helper/SsgConfigHelper;->a:Lcom/kubi/widget/web/helper/SsgConfigHelper;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/kubi/widget/web/helper/SsgConfigHelper;->e(Lcom/kubi/widget/web/startup/t;)V

    .line 12
    return-void
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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/SsgConfigHelper;->a:Lcom/kubi/widget/web/helper/SsgConfigHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/SsgConfigHelper;->f()V

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
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lt80/a;->a:Lt80/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lt80/a;->b()V

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
.end method

.method public g()Lcom/kubi/widget/web/startup/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->e()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public h()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/startup/i;->a:Lcom/kubi/widget/web/startup/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/startup/i;->d()V

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
.end method

.method public i()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/startup/b;->b:Lkotlinx/coroutines/j0;

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
.end method

.method public j()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/SsgConfigHelper;->a:Lcom/kubi/widget/web/helper/SsgConfigHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/SsgConfigHelper;->g()V

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
.end method

.method public k()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->d()V

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
.end method

.method public l()Lcom/kubi/widget/web/startup/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lt80/a;->a:Lt80/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lt80/a;->c()Lcom/kubi/widget/web/startup/t;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public m(Lcom/kubi/widget/web/startup/t;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "prepared"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a(Lcom/kubi/widget/web/startup/t;)V

    .line 12
    return-void
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
.end method

.method public n()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/startup/i;->a:Lcom/kubi/widget/web/startup/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/widget/web/startup/i;->d()V

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
.end method
