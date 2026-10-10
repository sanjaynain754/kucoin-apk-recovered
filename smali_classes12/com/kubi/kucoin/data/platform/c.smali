.class public final Lcom/kubi/kucoin/data/platform/c;
.super Ljava/lang/Object;
.source "IPAddressHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/kucoin/data/platform/IPAddressHelper;",
        "",
        "<init>",
        "()V",
        "platformMemory",
        "Lcom/kubi/kucoin/data/platform/IPAddressMemory;",
        "getIpAddress",
        "",
        "fetchIpAddress",
        "fetchIp",
        "Lokhttp3/ResponseBody;",
        "url",
        "LAppNet_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/kucoin/data/platform/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/kucoin/data/platform/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/data/platform/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kucoin/data/platform/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kucoin/data/platform/c;->a:Lcom/kubi/kucoin/data/platform/c;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/restful/n$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/restful/n$a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/restful/n$a;->a()Lcom/kubi/restful/n;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-class v1, Lcom/kubi/kucoin/data/platform/d;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/restful/n;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Lcom/kubi/kucoin/data/platform/d;

    .line 25
    .line 26
    sput-object v0, Lcom/kubi/kucoin/data/platform/c;->b:Lcom/kubi/kucoin/data/platform/d;

    .line 27
    return-void
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
.method public final a(Ljava/lang/String;)Lokhttp3/ResponseBody;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lmr/a;->g()Lretrofit2/Retrofit;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-class v1, Lcom/kubi/kucoin/data/platform/b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/kubi/kucoin/data/platform/b;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/kubi/kucoin/data/platform/b;->a(Ljava/lang/String;)Lokhttp3/ResponseBody;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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

.method public final b()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/host/HostManager;->v()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/data/platform/c;->a(Ljava/lang/String;)Lokhttp3/ResponseBody;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/kucoin/data/platform/a;->a(Lokhttp3/ResponseBody;)Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    sget-object v1, Lcom/kubi/kucoin/data/platform/c;->b:Lcom/kubi/kucoin/data/platform/d;

    .line 17
    const/4 v5, 0x6

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v1 .. v6}, Lcom/kubi/kucoin/data/platform/d;->d(Lcom/kubi/kucoin/data/platform/d;Ljava/lang/String;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 24
    return-object v2
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final c()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kucoin/data/platform/c;->b:Lcom/kubi/kucoin/data/platform/d;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lcom/kubi/kucoin/data/platform/d;->b(Lcom/kubi/kucoin/data/platform/d;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    :cond_0
    return-object v0
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
