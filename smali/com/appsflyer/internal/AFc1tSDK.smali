.class public interface abstract Lcom/appsflyer/internal/AFc1tSDK;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public abstract AFAdRevenueData(Lcom/appsflyer/internal/AFc1rSDK;)Ljava/lang/String;
    .param p1    # Lcom/appsflyer/internal/AFc1rSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract AFAdRevenueData()V
.end method

.method public abstract getMediationNetwork()Ljava/util/List;
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFc1rSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMonetizationNetwork()V
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract getMonetizationNetwork(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation
.end method
