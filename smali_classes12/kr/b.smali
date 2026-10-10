.class public interface abstract Lkr/b;
.super Ljava/lang/Object;
.source "ICallAdapterFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001Jg\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0001\u0010\u0003*\u00020\u0001\"\u0008\u0008\u0002\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00080\u0007H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkr/b;",
        "",
        "ResponseIn",
        "ResponseOut",
        "ResponseStream",
        "Ljava/lang/reflect/Type;",
        "type",
        "Lkotlin/Function1;",
        "Lkr/c;",
        "convertBuilder",
        "Lkr/a;",
        "a",
        "(Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;)Lkr/a;",
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
.method public abstract a(Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;)Lkr/a;
    .param p1    # Ljava/lang/reflect/Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseIn:",
            "Ljava/lang/Object;",
            "ResponseOut:",
            "Ljava/lang/Object;",
            "ResponseStream:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/reflect/Type;",
            "+",
            "Lkr/c<",
            "TResponseIn;TResponseOut;>;>;)",
            "Lkr/a<",
            "TResponseIn;TResponseOut;TResponseStream;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
