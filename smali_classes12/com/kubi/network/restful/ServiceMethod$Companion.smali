.class public final Lcom/kubi/network/restful/ServiceMethod$Companion;
.super Ljava/lang/Object;
.source "KCNetwork.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/network/restful/ServiceMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/network/restful/ServiceMethod$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/kubi/network/restful/b;",
        "restful",
        "Ljava/lang/reflect/Method;",
        "method",
        "Lcom/kubi/network/restful/ServiceMethod;",
        "create",
        "(Lcom/kubi/network/restful/b;Ljava/lang/reflect/Method;)Lcom/kubi/network/restful/ServiceMethod;",
        "network-adapter-restful_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/network/restful/ServiceMethod$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/kubi/network/restful/b;Ljava/lang/reflect/Method;)Lcom/kubi/network/restful/ServiceMethod;
    .locals 2
    .param p1    # Lcom/kubi/network/restful/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Method;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/restful/b;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/kubi/network/restful/ServiceMethod<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "restful"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "method"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/network/restful/ServiceMethod;

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/network/restful/RequestFactory;->e:Lcom/kubi/network/restful/RequestFactory$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p2}, Lcom/kubi/network/restful/RequestFactory$Companion;->create(Ljava/lang/reflect/Method;)Lcom/kubi/network/restful/RequestFactory;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/network/restful/b;->d()Lkr/b;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/network/restful/b;->e()Lkr/d;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p2, v1, p1}, Lcom/kubi/network/restful/ServiceMethod;-><init>(Lcom/kubi/network/restful/RequestFactory;Lkr/b;Lkr/d;)V

    .line 30
    return-object v0
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
.end method
