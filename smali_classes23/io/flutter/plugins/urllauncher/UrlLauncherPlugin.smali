.class public final Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;
.super Ljava/lang/Object;
.source "UrlLauncherPlugin.java"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# static fields
.field private static final TAG:Ljava/lang/String; = "UrlLauncherPlugin"


# instance fields
.field private urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1
    .param p1    # Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p1, "UrlLauncherPlugin"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "urlLauncher was never set."

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lio/flutter/plugins/urllauncher/UrlLauncher;->setActivity(Landroid/app/Activity;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lio/flutter/plugins/urllauncher/UrlLauncher;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    iput-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public onDetachedFromActivity()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "UrlLauncherPlugin"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "urlLauncher was never set."

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lio/flutter/plugins/urllauncher/UrlLauncher;->setActivity(Landroid/app/Activity;)V

    .line 18
    return-void
    .line 19
    .line 20
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->onDetachedFromActivity()V

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
    .line 18
    .line 19
    .line 20
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p1, "UrlLauncherPlugin"

    .line 7
    .line 8
    const-string v0, "Already detached from the engine."

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;)V

    .line 21
    .line 22
    iput-object v0, p0, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->urlLauncher:Lio/flutter/plugins/urllauncher/UrlLauncher;

    .line 23
    return-void
    .line 24
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0
    .param p1    # Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/flutter/plugins/urllauncher/UrlLauncherPlugin;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
