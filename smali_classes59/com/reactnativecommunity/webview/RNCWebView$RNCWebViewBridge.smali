.class public Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;
.super Ljava/lang/Object;
.source "RNCWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativecommunity/webview/RNCWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RNCWebViewBridge"
.end annotation


# instance fields
.field private TAG:Ljava/lang/String;

.field mWebView:Lcom/reactnativecommunity/webview/RNCWebView;

.field final synthetic this$0:Lcom/reactnativecommunity/webview/RNCWebView;


# direct methods
.method public constructor <init>(Lcom/reactnativecommunity/webview/RNCWebView;Lcom/reactnativecommunity/webview/RNCWebView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->this$0:Lcom/reactnativecommunity/webview/RNCWebView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    const-string p1, "RNCWebViewBridge"

    .line 8
    .line 9
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->TAG:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->mWebView:Lcom/reactnativecommunity/webview/RNCWebView;

    .line 12
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->mWebView:Lcom/reactnativecommunity/webview/RNCWebView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/RNCWebView;->getMessagingEnabled()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->mWebView:Lcom/reactnativecommunity/webview/RNCWebView;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lcom/reactnativecommunity/webview/RNCWebView;->onMessage(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebView$RNCWebViewBridge;->TAG:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView."

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
