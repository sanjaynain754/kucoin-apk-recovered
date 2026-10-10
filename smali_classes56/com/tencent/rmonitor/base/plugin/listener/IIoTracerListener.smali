.class public interface abstract Lcom/tencent/rmonitor/base/plugin/listener/IIoTracerListener;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/plugin/listener/IIoTracerListener;",
        "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;",
        "onCloseableLeakPublish",
        "",
        "meta",
        "Lcom/tencent/rmonitor/base/meta/CloseableLeakMeta;",
        "onIOInfoPublish",
        "metas",
        "",
        "Lcom/tencent/rmonitor/base/meta/IOMeta;",
        "onIOStart",
        "fd",
        "",
        "path",
        "",
        "time",
        "",
        "onIOStop",
        "ioMeta",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onCloseableLeakPublish(Lcom/tencent/rmonitor/base/meta/CloseableLeakMeta;)V
    .param p1    # Lcom/tencent/rmonitor/base/meta/CloseableLeakMeta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onIOInfoPublish(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/base/meta/IOMeta;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onIOStart(ILjava/lang/String;J)V
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onIOStop(ILjava/lang/String;JLcom/tencent/rmonitor/base/meta/IOMeta;)V
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/tencent/rmonitor/base/meta/IOMeta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
