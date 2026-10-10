.class public final Lcom/kubi/advert/u;
.super Ljava/lang/Object;
.source "FacebookSdkUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/advert/FacebookSdkUtil;",
        "",
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
        "SMAP\nFacebookSdkUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookSdkUtil.kt\ncom/kubi/advert/FacebookSdkUtil\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 AdvertEx.kt\ncom/kubi/advert/AdvertExKt\n*L\n1#1,28:1\n25#2,2:29\n27#2:34\n25#2,2:35\n27#2:40\n40#3,3:31\n40#3,3:37\n*S KotlinDebug\n*F\n+ 1 FacebookSdkUtil.kt\ncom/kubi/advert/FacebookSdkUtil\n*L\n16#1:29,2\n16#1:34\n24#1:35,2\n24#1:40\n17#1:31,3\n25#1:37,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/advert/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/advert/u;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/advert/u;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/advert/u;->a:Lcom/kubi/advert/u;

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


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
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
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-class v2, Lcom/kubi/advert/flavor/b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/advert/flavor/b;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, p2}, Lcom/kubi/advert/flavor/b;->e(Ljava/lang/String;Ljava/util/Map;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    const-string p1, "fbEvent, nothing flavor get"

    .line 35
    .line 36
    const-string p2, "FacebookSdkUtil"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    return-void
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
.end method

.method public final b(Landroid/app/Application;)V
    .locals 3
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
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-class v2, Lcom/kubi/advert/flavor/b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/advert/flavor/b;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1}, Lcom/kubi/advert/flavor/b;->a(Landroid/app/Application;)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    const-string p1, "initialize, nothing flavor get"

    .line 30
    .line 31
    const-string v0, "FacebookSdkUtil"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-void
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
