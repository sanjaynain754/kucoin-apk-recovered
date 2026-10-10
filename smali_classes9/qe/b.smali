.class public interface abstract Lqe/b;
.super Ljava/lang/Object;
.source "ITask.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&\u00a2\u0006\u0002\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;",
        "T",
        "E",
        "",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "onPassed",
        "",
        "data",
        "(Ljava/lang/Object;)V",
        "onIntercept",
        "exception",
        "run",
        "dispatcher",
        "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;",
        "(Ljava/lang/Object;Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;)V",
        "TradeCoreBizLib_googleRelease"
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
.method public abstract a(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/Object;Lqe/d;)V
    .param p2    # Lqe/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lqe/d<",
            "TT;TE;>;)V"
        }
    .end annotation
.end method
