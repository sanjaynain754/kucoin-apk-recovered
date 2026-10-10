.class public interface abstract Lcom/jumio/core/interfaces/UsabilityInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/interfaces/UsabilityInterface;",
        "",
        "shouldEnableUsability",
        "",
        "getShouldEnableUsability",
        "()Z",
        "getMultipartItemsForResultKeys",
        "",
        "Lcom/jumio/core/interfaces/UsabilityInterface$MultipartItem;",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "MultipartItem",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getMultipartItemsForResultKeys(Lcom/jumio/core/models/ApiCallDataModel;)Ljava/util/List;
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;)",
            "Ljava/util/List<",
            "Ljumio/core/a4;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getShouldEnableUsability()Z
.end method
