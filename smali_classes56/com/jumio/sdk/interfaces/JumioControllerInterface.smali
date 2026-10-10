.class public interface abstract Lcom/jumio/sdk/interfaces/JumioControllerInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/sdk/interfaces/JumioControllerInterface;",
        "",
        "onInitialized",
        "",
        "credentials",
        "",
        "Lcom/jumio/sdk/credentials/JumioCredentialInfo;",
        "consentItems",
        "Lcom/jumio/sdk/consent/JumioConsentItem;",
        "termsOfUse",
        "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;",
        "onError",
        "error",
        "Lcom/jumio/sdk/error/JumioError;",
        "onFinished",
        "result",
        "Lcom/jumio/sdk/result/JumioResult;",
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
.method public abstract onError(Lcom/jumio/sdk/error/JumioError;)V
    .param p1    # Lcom/jumio/sdk/error/JumioError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onFinished(Lcom/jumio/sdk/result/JumioResult;)V
    .param p1    # Lcom/jumio/sdk/result/JumioResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onInitialized(Ljava/util/List;Ljava/util/List;Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/credentials/JumioCredentialInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/consent/JumioConsentItem;",
            ">;",
            "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;",
            ")V"
        }
    .end annotation
.end method
