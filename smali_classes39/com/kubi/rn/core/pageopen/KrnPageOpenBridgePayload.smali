.class public interface abstract Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;
.super Ljava/lang/Object;
.source "KrnPageOpenBridgePayload.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0012\u0010\u000c\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;",
        "",
        "rootTag",
        "",
        "getRootTag",
        "()I",
        "routeKey",
        "",
        "getRouteKey",
        "()Ljava/lang/String;",
        "pageId",
        "getPageId",
        "openMode",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;",
        "getOpenMode",
        "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;",
        "BReactNativeLib_googleRelease"
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
.method public abstract getOpenMode()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getPageId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRootTag()I
.end method

.method public abstract getRouteKey()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
