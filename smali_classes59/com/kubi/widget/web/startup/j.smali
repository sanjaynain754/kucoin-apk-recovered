.class public interface abstract Lcom/kubi/widget/web/startup/j;
.super Ljava/lang/Object;
.source "KWebStartupDependencies.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008`\u0018\u00002\u00020\u0001J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\tH&J\u0008\u0010\u000b\u001a\u00020\tH&J\u0008\u0010\u000c\u001a\u00020\tH&J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000eH&J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000eH&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000eH&J\u0016\u0010\u0014\u001a\u00020\t2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000eH&J\u0008\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u0017\u001a\u00020\t2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000eH&J\u001c\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000eH&J\u0008\u0010\u0019\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001a\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/widget/web/startup/KWebStartupDependencies;",
        "",
        "prepareDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "getPrepareDispatcher",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "isParallelEnabled",
        "",
        "loadExperimentLegacy",
        "",
        "loadSiteAndBaseLegacy",
        "loadWhitePageLegacy",
        "loadSsgLegacy",
        "prepareExperiment",
        "Lcom/kubi/widget/web/startup/PreparedConfig;",
        "prepareWhitePage",
        "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;",
        "prepareSsg",
        "",
        "Lcom/kubi/sdk/web/config/WebSsgInfo;",
        "applyExperiment",
        "prepared",
        "applySiteAndBase",
        "applyWhitePage",
        "applySsg",
        "registerSsgObserver",
        "LWebWidget_googleRelease"
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
.method public abstract a()Lcom/kubi/widget/web/startup/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/util/List<",
            "Lx00/d;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lcom/kubi/widget/web/startup/t;)V
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract d(Lcom/kubi/widget/web/startup/t;)V
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "+",
            "Ljava/util/List<",
            "Lx00/d;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()Lcom/kubi/widget/web/startup/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract h()V
.end method

.method public abstract i()Lkotlinx/coroutines/j0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract j()V
.end method

.method public abstract k()V
.end method

.method public abstract l()Lcom/kubi/widget/web/startup/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract m(Lcom/kubi/widget/web/startup/t;)V
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract n()V
.end method
