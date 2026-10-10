.class public interface abstract Lcom/kubi/sdk/web/jsapi/d;
.super Ljava/lang/Object;
.source "JsEventListener.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/sdk/web/jsapi/d;",
        "",
        "",
        "isClosed",
        "()Z",
        "Lcom/kubi/sdk/web/jsapi/JsEventObj;",
        "eventObj",
        "",
        "a",
        "(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V",
        "KWebView_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V
    .param p1    # Lcom/kubi/sdk/web/jsapi/JsEventObj;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isClosed()Z
.end method
