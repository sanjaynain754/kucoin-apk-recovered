.class Lio/flutter/embedding/engine/FlutterEngine$1;
.super Ljava/lang/Object;
.source "FlutterEngine.java"

# interfaces
.implements Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/FlutterEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/engine/FlutterEngine;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngine$1;->this$0:Lio/flutter/embedding/engine/FlutterEngine;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public onEngineWillDestroy()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public onPreEngineRestart()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "FlutterEngine"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "onPreEngineRestart()"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lio/flutter/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngine$1;->this$0:Lio/flutter/embedding/engine/FlutterEngine;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lio/flutter/embedding/engine/FlutterEngine;->access$000(Lio/flutter/embedding/engine/FlutterEngine;)Ljava/util/Set;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;->onPreEngineRestart()V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngine$1;->this$0:Lio/flutter/embedding/engine/FlutterEngine;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lio/flutter/embedding/engine/FlutterEngine;->access$100(Lio/flutter/embedding/engine/FlutterEngine;)Lio/flutter/plugin/platform/PlatformViewsController;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lio/flutter/plugin/platform/PlatformViewsController;->onPreEngineRestart()V

    .line 44
    .line 45
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngine$1;->this$0:Lio/flutter/embedding/engine/FlutterEngine;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lio/flutter/embedding/engine/FlutterEngine;->access$200(Lio/flutter/embedding/engine/FlutterEngine;)Lio/flutter/plugin/platform/PlatformViewsController2;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lio/flutter/plugin/platform/PlatformViewsController2;->onPreEngineRestart()V

    .line 53
    .line 54
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngine$1;->this$0:Lio/flutter/embedding/engine/FlutterEngine;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lio/flutter/embedding/engine/FlutterEngine;->access$300(Lio/flutter/embedding/engine/FlutterEngine;)Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->clearData()V

    .line 62
    return-void
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
.end method
