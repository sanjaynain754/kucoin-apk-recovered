.class public final Lcom/kubi/network/api/subscribe/utils/a;
.super Ljava/lang/Object;
.source "ChannelUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/network/api/subscribe/utils/a;",
        "",
        "<init>",
        "()V",
        "Ler/a;",
        "client",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "request",
        "Lkotlinx/coroutines/flow/e;",
        "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "a",
        "(Ler/a;Lcom/kubi/network/api/model/NetworkRequest;)Lkotlinx/coroutines/flow/e;",
        "network-adapter-subscribe_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/network/api/subscribe/utils/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/api/subscribe/utils/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/network/api/subscribe/utils/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/network/api/subscribe/utils/a;->a:Lcom/kubi/network/api/subscribe/utils/a;

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
.method public final a(Ler/a;Lcom/kubi/network/api/model/NetworkRequest;)Lkotlinx/coroutines/flow/e;
    .locals 3
    .param p1    # Ler/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/network/api/model/NetworkRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ler/a;",
            "Lcom/kubi/network/api/model/NetworkRequest;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "client"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "request"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    instance-of v0, p2, Lcom/kubi/network/api/subscribe/model/SubscribeRequest;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p2, Lcom/kubi/network/api/subscribe/model/SubscribeRequest;

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/network/api/subscribe/utils/b;->a:Lcom/kubi/network/api/subscribe/utils/b;

    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p2, v2, v1, v2}, Lcom/kubi/network/api/subscribe/utils/b;->m(Lcom/kubi/network/api/subscribe/utils/b;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2, v0}, Lcom/kubi/network/api/subscribe/utils/ChannelUtilsKt;->c(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Lkotlinx/coroutines/flow/e;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string p2, "only support subscribe request"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1
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
.end method
