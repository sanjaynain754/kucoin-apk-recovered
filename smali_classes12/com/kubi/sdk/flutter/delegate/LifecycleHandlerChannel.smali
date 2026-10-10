.class public final Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;
.super Ljava/lang/Object;
.source "LifecycleHandlerChannel.kt"

# interfaces
.implements Lcom/kubi/sdk/flutter/delegate/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0008\u0010\u000c\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;",
        "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;",
        "<init>",
        "()V",
        "channel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "registerWith",
        "",
        "context",
        "Landroid/content/Context;",
        "flutterEngine",
        "Lio/flutter/embedding/engine/FlutterEngine;",
        "unregister",
        "onShow",
        "onHide",
        "Companion",
        "LFlutter_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->b:Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel$Companion;

    .line 9
    return-void
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
.end method

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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "LifecycleHandlerChannel.onHide"

    .line 3
    .line 4
    const-string v1, "LifecycleHandlerChannel"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lro/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "pageDisappear"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "LifecycleHandlerChannel be called before register!"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lro/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public final b()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "LifecycleHandlerChannel.onShow"

    .line 3
    .line 4
    const-string v1, "LifecycleHandlerChannel"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lro/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "pageAppear"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "LifecycleHandlerChannel be called before register!"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lro/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public registerWith(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/flutter/embedding/engine/FlutterEngine;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "flutterEngine"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lio/flutter/embedding/engine/dart/DartExecutor;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    const-string v0, "com.kc/native_lifecycle"

    .line 23
    .line 24
    sget-object v1, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2, v0, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    .line 28
    .line 29
    iput-object p1, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 30
    return-void
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
.end method

.method public unregister()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 11
    return-void
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
.end method
