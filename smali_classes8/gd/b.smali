.class public final Lgd/b;
.super Ljava/lang/Object;
.source "SymbolFavorEx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "isFavorEx",
        "",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/data/entity/TradeItemBean;)Z
    .locals 2
    .param p0    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->isFavor()Z

    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->a:Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;->get()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string v1, "getSymbol(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->u(Ljava/lang/String;)Z

    .line 41
    move-result p0

    .line 42
    return p0
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
.end method
