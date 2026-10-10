.class public Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$JsPromptCallback;
.super Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "JsPromptCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl<",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/types/JsPromptResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl;-><init>()V

    .line 4
    return-void
    .line 5
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
.end method


# virtual methods
.method public decodeResult(Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/JsPromptResponse;
    .locals 0

    .line 2
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/JsPromptResponse;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/JsPromptResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decodeResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$JsPromptCallback;->decodeResult(Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/JsPromptResponse;

    move-result-object p1

    return-object p1
.end method
