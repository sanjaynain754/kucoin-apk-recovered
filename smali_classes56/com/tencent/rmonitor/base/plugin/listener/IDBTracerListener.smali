.class public interface abstract Lcom/tencent/rmonitor/base/plugin/listener/IDBTracerListener;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/plugin/listener/IDBTracerListener;",
        "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;",
        "onDBInfoPublish",
        "",
        "metas",
        "",
        "Lcom/tencent/rmonitor/base/meta/DBMeta;",
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
.method public abstract onDBInfoPublish(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/base/meta/DBMeta;",
            ">;)V"
        }
    .end annotation
.end method
