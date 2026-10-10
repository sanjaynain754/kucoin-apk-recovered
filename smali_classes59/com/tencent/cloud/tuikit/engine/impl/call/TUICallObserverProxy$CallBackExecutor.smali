.class interface abstract Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;
.super Ljava/lang/Object;
.source "TUICallObserverProxy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CallBackExecutor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Ljava/lang/FunctionalInterface;
.end annotation


# virtual methods
.method public abstract execute(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;",
            "TR;)V"
        }
    .end annotation
.end method
