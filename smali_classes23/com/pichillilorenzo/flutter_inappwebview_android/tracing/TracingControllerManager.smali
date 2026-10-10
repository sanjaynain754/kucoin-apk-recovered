.class public Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview_android/types/Disposable;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "TracingControllerMan"

.field public static final METHOD_CHANNEL_NAME:Ljava/lang/String; = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller"

.field public static tracingController:Landroidx/webkit/TracingController;


# instance fields
.field public channelDelegate:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;

    .line 6
    .line 7
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    .line 10
    .line 11
    const-string v1, "com.pichillilorenzo/flutter_inappwebview_tracingcontroller"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0, v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;-><init>(Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;Lio/flutter/plugin/common/MethodChannel;)V

    .line 20
    .line 21
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->channelDelegate:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;

    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public static buildTracingConfig(Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;)Landroidx/webkit/TracingConfig;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroidx/webkit/TracingConfig$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/webkit/TracingConfig$Builder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;->categories:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    instance-of v3, v2, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    move-object v3, v2

    .line 27
    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    filled-new-array {v3}, [Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroidx/webkit/TracingConfig$Builder;->addCategories([Ljava/lang/String;)Landroidx/webkit/TracingConfig$Builder;

    .line 36
    .line 37
    :cond_1
    instance-of v3, v2, Ljava/lang/Integer;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    check-cast v2, Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 45
    move-result v2

    .line 46
    .line 47
    .line 48
    filled-new-array {v2}, [I

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroidx/webkit/TracingConfig$Builder;->addCategories([I)Landroidx/webkit/TracingConfig$Builder;

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_2
    iget-object p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingSettings;->tracingMode:Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 61
    move-result p0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p0}, Landroidx/webkit/TracingConfig$Builder;->setTracingMode(I)Landroidx/webkit/TracingConfig$Builder;

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0}, Landroidx/webkit/TracingConfig$Builder;->build()Landroidx/webkit/TracingConfig;

    .line 68
    move-result-object p0

    .line 69
    return-object p0
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

.method public static init()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->tracingController:Landroidx/webkit/TracingController;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "TRACING_CONTROLLER_BASIC_USAGE"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/webkit/WebViewFeature;->isFeatureSupported(Ljava/lang/String;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroidx/webkit/TracingController;->getInstance()Landroidx/webkit/TracingController;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->tracingController:Landroidx/webkit/TracingController;

    .line 19
    :cond_0
    return-void
    .line 20
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->channelDelegate:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;->dispose()V

    .line 9
    .line 10
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->channelDelegate:Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerChannelDelegate;

    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/tracing/TracingControllerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
