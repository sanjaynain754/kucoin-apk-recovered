.class public interface abstract Lkr/a;
.super Ljava/lang/Object;
.source "ICallAdapterFactory.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseIn:",
        "Ljava/lang/Object;",
        "ResponseOut:",
        "Ljava/lang/Object;",
        "ResponseStream:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u0001*\u0008\u0008\u0002\u0010\u0004*\u00020\u00012\u00020\u0001J\u0017\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkr/a;",
        "",
        "ResponseIn",
        "ResponseOut",
        "ResponseStream",
        "Lcom/kubi/network/restful/c;",
        "request",
        "a",
        "(Lcom/kubi/network/restful/c;)Ljava/lang/Object;",
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
.method public abstract a(Lcom/kubi/network/restful/c;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/network/restful/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/restful/c;",
            ")TResponseStream;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
