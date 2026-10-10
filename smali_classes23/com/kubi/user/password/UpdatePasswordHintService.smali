.class public final Lcom/kubi/user/password/UpdatePasswordHintService;
.super Ljava/lang/Object;
.source "UpdatePasswordHintService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000c\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0012\u001a\u00020\rJ\r\u0010\u0013\u001a\u00020\rH\u0001\u00a2\u0006\u0002\u0008\u0014J\r\u0010\u0015\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0008\u0016J\r\u0010\u0017\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0008\u0018J\r\u0010\u0019\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0008\u001aJ\u0019\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00078\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/user/password/UpdatePasswordHintService;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "queryChangePasswordLoader",
        "Lcom/kubi/sdk/util/PreLoader;",
        "Lcom/kubi/user/password/UpdatePasswordHintEntity;",
        "getQueryChangePasswordLoader$UserCenterLib_googleRelease$annotations",
        "getQueryChangePasswordLoader$UserCenterLib_googleRelease",
        "()Lcom/kubi/sdk/util/PreLoader;",
        "queryUpdatePasswordHintData",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "expandPasswordDuration",
        "showUpdatePasswordHintDialog",
        "",
        "registerUpdatePasswordListener",
        "reset",
        "reset$UserCenterLib_googleRelease",
        "canShowUpdatePasswordDialog",
        "canShowUpdatePasswordDialog$UserCenterLib_googleRelease",
        "canUpdatePassword",
        "canUpdatePassword$UserCenterLib_googleRelease",
        "needUpdatePassword",
        "needUpdatePassword$UserCenterLib_googleRelease",
        "withReport",
        "message",
        "withReport$UserCenterLib_googleRelease",
        "UserCenterLib_googleRelease"
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
        "SMAP\nUpdatePasswordHintService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatePasswordHintService.kt\ncom/kubi/user/password/UpdatePasswordHintService\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,157:1\n57#2,8:158\n57#2,8:166\n67#2,2:176\n17#3,2:174\n47#4,4:178\n*S KotlinDebug\n*F\n+ 1 UpdatePasswordHintService.kt\ncom/kubi/user/password/UpdatePasswordHintService\n*L\n61#1:158,8\n85#1:166,8\n151#1:176,2\n142#1:174,2\n101#1:178,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/user/password/UpdatePasswordHintService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/sdk/util/PreLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/sdk/util/PreLoader<",
            "Lcom/kubi/user/password/UpdatePasswordHintEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/user/password/UpdatePasswordHintService;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/user/password/UpdatePasswordHintService;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/user/password/UpdatePasswordHintService;->a:Lcom/kubi/user/password/UpdatePasswordHintService;

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/sdk/util/PreLoader;->e:Lcom/kubi/sdk/util/PreLoader$Companion;

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/user/password/UpdatePasswordHintService$queryChangePasswordLoader$1;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Lcom/kubi/user/password/UpdatePasswordHintService$queryChangePasswordLoader$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/util/PreLoader$Companion;->create(Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/util/PreLoader;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sput-object v0, Lcom/kubi/user/password/UpdatePasswordHintService;->b:Lcom/kubi/sdk/util/PreLoader;

    .line 22
    return-void
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
    .line 19
    .line 20
.end method

.method public static synthetic a(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/user/password/UpdatePasswordHintService;->g(Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/user/password/UpdatePasswordHintService;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static final g(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Lkotlinx/coroutines/l0;

    .line 9
    .line 10
    const-string v0, "UpdatePasswordHintService"

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    sget-object v0, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 24
    .line 25
    new-instance v1, Lcom/kubi/user/password/UpdatePasswordHintService$a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v0}, Lcom/kubi/user/password/UpdatePasswordHintService$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v3, Lcom/kubi/user/password/UpdatePasswordHintService$registerUpdatePasswordListener$disposable$1$1;

    .line 39
    const/4 p0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, p0}, Lcom/kubi/user/password/UpdatePasswordHintService$registerUpdatePasswordListener$disposable$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 43
    const/4 v4, 0x3

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 50
    .line 51
    sget-object p0, Lcom/kubi/user/password/a;->a:Lcom/kubi/user/password/a;

    .line 52
    .line 53
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v1}, Lcom/kubi/user/password/a;->a(J)V

    .line 57
    .line 58
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object p0
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

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.method public final c()Z
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/password/UpdatePasswordHintService;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->d()Lcom/kubi/user/config/UserInfo$LoginState;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/user/config/UserInfo$LoginState;->Login:Lcom/kubi/user/config/UserInfo$LoginState;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final d()Z
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-class v2, Le70/j;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast v0, Le70/j;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Le70/j;->a()Z

    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
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

.method public final e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/password/UpdatePasswordHintService;->c()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/user/password/UpdatePasswordHintService;->i()V

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/user/password/UpdatePasswordHintService;->b:Lcom/kubi/sdk/util/PreLoader;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/util/PreLoader;->e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    return-object p1

    .line 26
    .line 27
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p1
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
.end method

.method public final f()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/password/UpdatePasswordHintService;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->e()Lio/reactivex/Observable;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/user/password/b;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/kubi/user/password/b;-><init>()V

    .line 19
    .line 20
    new-instance v2, Lcom/kubi/user/password/c;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v1}, Lcom/kubi/user/password/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

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

.method public final i()V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/password/UpdatePasswordHintService;->b:Lcom/kubi/sdk/util/PreLoader;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/util/PreLoader;->f()V

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
.end method
