.class public final Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;
.super Ljava/lang/Object;
.source "GoogleFacebookSdkFlavorImpl.kt"

# interfaces
.implements Lcom/kubi/advert/flavor/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;",
        "Lcom/kubi/advert/flavor/IFacebookSdkFlavor;",
        "<init>",
        "()V",
        "initialize",
        "",
        "application",
        "Landroid/app/Application;",
        "fbEvent",
        "eventName",
        "",
        "params",
        "",
        "buildCommParams",
        "Landroid/os/Bundle;",
        "Companion",
        "AdvertLib_googleRelease"
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
        "SMAP\nGoogleFacebookSdkFlavorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n+ 2 AdvertEx.kt\ncom/kubi/advert/AdvertExKt\n+ 3 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,85:1\n40#2,3:86\n45#3,4:89\n45#3,4:97\n47#4,4:93\n*S KotlinDebug\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n*L\n37#1:86,3\n55#1:89,4\n51#1:97,4\n60#1:93,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;->a:Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;

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
    .line 21
    .line 22
.end method

.method public static synthetic b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;->f()V

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
.end method

.method public static final synthetic c(Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;)Landroid/os/Bundle;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;->d()Landroid/os/Bundle;

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
.end method

.method public static final f()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {v0}, Lcom/facebook/a;->U(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/a;->k()V

    .line 8
    .line 9
    sget-object v1, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/facebook/a;->j(Lcom/facebook/LoggingBehavior;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/facebook/a;->V(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/facebook/a;->T(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    move-object v2, v0

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/advert/exception/AdvertException;

    .line 30
    .line 31
    const/16 v6, 0x8

    .line 32
    const/4 v7, 0x0

    .line 33
    .line 34
    const-string v3, "GoogleFacebookSdkFlavorImpl"

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/kubi/advert/exception/AdvertException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    const/4 v0, 0x2

    .line 41
    const/4 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 45
    :cond_0
    return-void
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
.end method


# virtual methods
.method public a(Landroid/app/Application;)V
    .locals 7
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
    :try_start_0
    const-string v0, "FacebookSdk start initialize, google."

    .line 8
    .line 9
    const-string v1, "GoogleFacebookSdkFlavorImpl"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lvk/s;->Q()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/facebook/a;->W(Z)V

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/advert/flavor/a;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcom/kubi/advert/flavor/a;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, Lcom/facebook/a;->L(Landroid/content/Context;Lcom/facebook/a$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    move-object v1, p1

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    new-instance v0, Lcom/kubi/advert/exception/AdvertException;

    .line 45
    .line 46
    const/16 v5, 0x8

    .line 47
    const/4 v6, 0x0

    .line 48
    .line 49
    const-string v2, "GoogleFacebookSdkFlavorImpl"

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    .line 53
    .line 54
    invoke-direct/range {v0 .. v6}, Lcom/kubi/advert/exception/AdvertException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    const/4 p1, 0x2

    .line 56
    const/4 v1, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 60
    :cond_0
    return-void
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
.end method

.method public final d()Landroid/os/Bundle;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/user/config/UserInfo;->h()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    const-string v2, "fb_content_id"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    :cond_1
    sget-object v1, Lvk/s;->a:Lvk/s;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lvk/s;->P()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-string v2, "fb_description"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-object v0
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
.end method

.method public e(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "eventName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "params"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/advert/g;

    .line 13
    .line 14
    const-string v0, "GoogleFacebookSdkFlavorImpl"

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/kubi/advert/g;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v2, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 24
    .line 25
    new-instance v3, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v2}, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    new-instance v4, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$fbEvent$2;

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$fbEvent$2;-><init>(Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 45
    return-void
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
.end method
