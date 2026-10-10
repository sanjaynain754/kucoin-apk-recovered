.class public interface abstract Llw/c;
.super Ljava/lang/Object;
.source "ChartContract.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\u0007H&J\u0008\u0010\u000b\u001a\u00020\u0007H&J\u0008\u0010\u000c\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0007H&J\u0008\u0010\u0011\u001a\u00020\u0007H&J\u0016\u0010\u0012\u001a\u00020\u00072\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014H&J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014H&J#\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0002\u0010\u001a\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;",
        "",
        "preDraw",
        "",
        "configuration",
        "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;",
        "draw",
        "",
        "innerFrame",
        "Lcom/kubi/resources/widget/chart/data/Frame;",
        "hidePointTip",
        "postInvalidate",
        "showPointTip",
        "selectPoint",
        "dataPoint",
        "Lcom/kubi/resources/widget/chart/data/DataPoint;",
        "unSelectPoint",
        "stopAnimation",
        "render",
        "entries",
        "",
        "getDataPointList",
        "processTouch",
        "x",
        "",
        "y",
        "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/kubi/resources/widget/chart/data/DataPoint;",
        "LComponent_googleRelease"
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
.method public abstract a(Lcom/kubi/resources/widget/chart/data/DataPoint;)V
    .param p1    # Lcom/kubi/resources/widget/chart/data/DataPoint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract b()V
.end method

.method public abstract c(Low/a;)Z
    .param p1    # Low/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d()Lnw/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract e(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/Float;Ljava/lang/Float;)Lcom/kubi/resources/widget/chart/data/DataPoint;
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g()V
.end method

.method public abstract h()V
.end method

.method public abstract i()V
.end method

.method public abstract postInvalidate()V
.end method

.method public abstract stopAnimation()V
.end method
