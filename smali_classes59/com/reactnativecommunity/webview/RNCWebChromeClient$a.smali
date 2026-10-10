.class public Lcom/reactnativecommunity/webview/RNCWebChromeClient$a;
.super Landroid/webkit/WebViewClient;
.source "RNCWebChromeClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/RNCWebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/webkit/WebView;

.field public final synthetic b:Lcom/reactnativecommunity/webview/RNCWebChromeClient;


# direct methods
.method public constructor <init>(Lcom/reactnativecommunity/webview/RNCWebChromeClient;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebChromeClient$a;->b:Lcom/reactnativecommunity/webview/RNCWebChromeClient;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebChromeClient$a;->a:Landroid/webkit/WebView;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 8
    return-void
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
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "targetUrl"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebChromeClient$a;->a:Landroid/webkit/WebView;

    .line 13
    move-object v0, p2

    .line 14
    .line 15
    check-cast v0, Lcom/reactnativecommunity/webview/RNCWebView;

    .line 16
    .line 17
    new-instance v1, Lcom/reactnativecommunity/webview/events/TopOpenWindowEvent;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/reactnativecommunity/webview/RNCWebChromeClient$a;->a:Landroid/webkit/WebView;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/reactnativecommunity/webview/RNCWebViewWrapper;->getReactTagFromWebView(Landroid/webkit/WebView;)I

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, p1}, Lcom/reactnativecommunity/webview/events/TopOpenWindowEvent;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2, v1}, Lcom/reactnativecommunity/webview/RNCWebView;->dispatchEvent(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/Event;)V

    .line 30
    const/4 p1, 0x1

    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
