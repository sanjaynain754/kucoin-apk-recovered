.class public final Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor;
.super Ljava/lang/Object;
.source "RouteProtocolInterceptor.kt"

# interfaces
.implements Lzx/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor;",
        "Lcom/kubi/router/interceptor/IInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "Companion",
        "LAppRouter_googleRelease"
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
        "SMAP\nRouteProtocolInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteProtocolInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,31:1\n29#2:32\n49#3:33\n70#3:36\n15#4,2:34\n*S KotlinDebug\n*F\n+ 1 RouteProtocolInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolInterceptor\n*L\n24#1:32\n27#1:33\n27#1:36\n27#1:34,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor;->a:Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;

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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 3
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    :try_start_0
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lay/a;->h()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lf00/a;->Y3(Landroid/net/Uri;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, Lzx/a;->a(Lay/a;)Z

    .line 26
    move-result p1
    :try_end_0
    .catch Lcom/kubi/sdk/protocol/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    .line 30
    new-instance v0, Lal/a;

    .line 31
    .line 32
    const-string v1, "RouteProtocolInterceptor"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, Lal/a;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lo00/g;->c()Ljava/util/concurrent/Executor;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    const/4 p1, 0x0

    .line 44
    return p1
    .line 45
.end method
