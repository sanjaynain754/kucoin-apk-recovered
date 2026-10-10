.class public interface abstract Lqe/d;
.super Ljava/lang/Object;
.source "TaskDispatcher.kt"


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
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003J)\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0008\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ)\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u000c\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;",
        "T",
        "E",
        "",
        "handleInterception",
        "",
        "rule",
        "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;",
        "exception",
        "(Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;Ljava/lang/Object;)V",
        "resumeNextExecution",
        "preRule",
        "data",
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
.method public abstract a(Lqe/b;Ljava/lang/Object;)V
    .param p1    # Lqe/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqe/b<",
            "TT;TE;>;TT;)V"
        }
    .end annotation
.end method

.method public abstract b(Lqe/b;Ljava/lang/Object;)V
    .param p1    # Lqe/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqe/b<",
            "TT;TE;>;TE;)V"
        }
    .end annotation
.end method
