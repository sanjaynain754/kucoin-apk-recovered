.class public interface abstract Lcom/kubi/restful/u;
.super Ljava/lang/Object;
.source "Restful.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Resp:",
        "Ljava/lang/Object;",
        "Return:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J)\u0010\u0008\u001a\u00028\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0006H&\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/restful/u;",
        "Resp",
        "Return",
        "",
        "Lcom/kubi/restful/b;",
        "any",
        "Ljava/lang/Class;",
        "resultType",
        "a",
        "(Lcom/kubi/restful/b;Ljava/lang/Class;)Ljava/lang/Object;",
        "Restful_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/restful/b;Ljava/lang/Class;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/restful/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/restful/b<",
            "TResp;>;",
            "Ljava/lang/Class<",
            "*>;)TReturn;"
        }
    .end annotation
.end method
