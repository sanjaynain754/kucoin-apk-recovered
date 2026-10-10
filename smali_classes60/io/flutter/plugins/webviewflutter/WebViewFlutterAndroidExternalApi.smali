.class public interface abstract Lio/flutter/plugins/webviewflutter/WebViewFlutterAndroidExternalApi;
.super Ljava/lang/Object;
.source "WebViewFlutterAndroidExternalApi.java"


# direct methods
.method public static getWebView(Lio/flutter/embedding/engine/FlutterEngine;J)Landroid/webkit/WebView;
    .locals 1
    .param p0    # Lio/flutter/embedding/engine/FlutterEngine;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-class v0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    check-cast p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->getInstanceManager()Lio/flutter/plugins/webviewflutter/InstanceManager;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->getInstanceManager()Lio/flutter/plugins/webviewflutter/InstanceManager;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/InstanceManager;->getInstance(J)Ljava/lang/Object;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    instance-of p1, p0, Landroid/webkit/WebView;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    check-cast p0, Landroid/webkit/WebView;

    .line 35
    return-object p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return-object p0
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
.end method
