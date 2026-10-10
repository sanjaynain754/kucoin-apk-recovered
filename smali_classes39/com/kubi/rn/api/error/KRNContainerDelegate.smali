.class public interface abstract Lcom/kubi/rn/api/error/KRNContainerDelegate;
.super Ljava/lang/Object;
.source "KRNContainerDelegate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/rn/api/error/KRNContainerDelegate;",
        "",
        "didSuccess",
        "",
        "didFail",
        "",
        "error",
        "Lcom/kubi/rn/api/error/KRNError;",
        "BReactNativeApi_googleRelease"
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
.method public abstract didFail(Lcom/kubi/rn/api/error/KRNError;)Z
    .param p1    # Lcom/kubi/rn/api/error/KRNError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract didSuccess()V
.end method
