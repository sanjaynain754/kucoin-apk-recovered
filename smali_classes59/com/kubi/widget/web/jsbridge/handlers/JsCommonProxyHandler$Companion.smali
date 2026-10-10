.class public final Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;
.super Ljava/lang/Object;
.source "JsCommonProxyHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;",
        "",
        "<init>",
        "()V",
        "PROXY_GET",
        "",
        "PROXY_POST",
        "api",
        "Lcom/kubi/widget/web/jsbridge/api/IWebApi;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/widget/web/jsbridge/api/IWebApi;",
        "api$delegate",
        "Lkotlin/Lazy;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getApi(Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;)Lcom/kubi/widget/web/jsbridge/api/IWebApi;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;->a()Lcom/kubi/widget/web/jsbridge/api/IWebApi;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a()Lcom/kubi/widget/web/jsbridge/api/IWebApi;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;->c()Lkotlin/Lazy;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/widget/web/jsbridge/api/IWebApi;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
