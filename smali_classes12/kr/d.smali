.class public interface abstract Lkr/d;
.super Ljava/lang/Object;
.source "IConverterFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0008\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkr/d;",
        "",
        "ResponseIn",
        "ResponseOut",
        "Lcom/kubi/network/restful/c;",
        "request",
        "Ljava/lang/reflect/Type;",
        "type",
        "Lkr/c;",
        "a",
        "(Lcom/kubi/network/restful/c;Ljava/lang/reflect/Type;)Lkr/c;",
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


# virtual methods
.method public abstract a(Lcom/kubi/network/restful/c;Ljava/lang/reflect/Type;)Lkr/c;
    .param p1    # Lcom/kubi/network/restful/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseIn:",
            "Ljava/lang/Object;",
            "ResponseOut:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/kubi/network/restful/c;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lkr/c<",
            "TResponseIn;TResponseOut;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
