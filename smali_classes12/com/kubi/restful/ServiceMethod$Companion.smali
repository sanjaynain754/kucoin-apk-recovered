.class public final Lcom/kubi/restful/ServiceMethod$Companion;
.super Ljava/lang/Object;
.source "Restful.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/restful/ServiceMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\u0004\u0008\u0002\u0010\u0004\"\u0004\u0008\u0003\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/restful/ServiceMethod$Companion;",
        "",
        "<init>",
        "()V",
        "Resp",
        "Return",
        "Lcom/kubi/restful/n;",
        "restful",
        "Ljava/lang/reflect/Method;",
        "method",
        "Lcom/kubi/restful/ServiceMethod;",
        "create",
        "(Lcom/kubi/restful/n;Ljava/lang/reflect/Method;)Lcom/kubi/restful/ServiceMethod;",
        "Restful_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/kubi/restful/ServiceMethod$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/kubi/restful/n;Ljava/lang/reflect/Method;)Lcom/kubi/restful/ServiceMethod;
    .locals 2
    .param p1    # Lcom/kubi/restful/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Method;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Resp:",
            "Ljava/lang/Object;",
            "Return:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/kubi/restful/n;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/kubi/restful/ServiceMethod<",
            "TResp;TReturn;>;"
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
    new-instance v0, Lcom/kubi/restful/ServiceMethod;

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/restful/RequestFactory;->d:Lcom/kubi/restful/RequestFactory$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p2}, Lcom/kubi/restful/RequestFactory$Companion;->create(Ljava/lang/reflect/Method;)Lcom/kubi/restful/RequestFactory;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/restful/n;->c()Lcom/kubi/restful/d;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Lcom/kubi/restful/d;->create()Lcom/kubi/restful/c;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/restful/n;->d()Lcom/kubi/restful/v;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lcom/kubi/restful/v;->create()Lcom/kubi/restful/u;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p2, v1, p1}, Lcom/kubi/restful/ServiceMethod;-><init>(Lcom/kubi/restful/RequestFactory;Lcom/kubi/restful/c;Lcom/kubi/restful/u;)V

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
.end method
