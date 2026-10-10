.class public Lcom/tencent/rtmp/video/BaseBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;
    }
.end annotation


# static fields
.field public static final SCREEN_CAPTURE_SDK_VERSION:Ljava/lang/String; = "0.0.0.0"

.field public static mBaseBridgeCallback:Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;


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
.end method

.method public static getAppContext()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rtmp/video/BaseBridge;->mBaseBridgeCallback:Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;->getAppContext()Landroid/content/Context;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static getSystemOSVersion()I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rtmp/video/BaseBridge;->mBaseBridgeCallback:Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;->getSystemOSVersion()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static printLog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rtmp/video/BaseBridge;->mBaseBridgeCallback:Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p0, p1}, Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;->printLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_0
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
.end method

.method public static setBaseBridgeCallback(Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/tencent/rtmp/video/BaseBridge;->mBaseBridgeCallback:Lcom/tencent/rtmp/video/BaseBridge$BaseBridgeCallback;

    .line 3
    return-void
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method
