.class public interface abstract Lcom/jumio/liveness/DaClient2$EventHandler;
.super Ljava/lang/Object;
.source "DaClient2.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/liveness/DaClient2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "EventHandler"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/jumio/liveness/DaClient2$EventHandler;",
        "",
        "onResponse",
        "",
        "eventView",
        "Lcom/jumio/liveness/DaClient2$EventView;",
        "onEventForForwarding",
        "nativeEventPtr",
        "",
        "dasdk_withoutAssetsRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onEventForForwarding(J)V
.end method

.method public abstract onResponse(Lcom/jumio/liveness/DaClient2$EventView;)V
    .param p1    # Lcom/jumio/liveness/DaClient2$EventView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
