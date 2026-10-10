.class public Lcom/tencent/qcloud/tim/push/components/TokenRequester;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;,
        Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;
    }
.end annotation


# static fields
.field public static final f:Ljava/lang/String; = "TokenRequester"


# instance fields
.field public a:Landroid/os/Handler;

.field public b:I

.field public c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

.field public d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

.field public e:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a:Landroid/os/Handler;

    .line 15
    .line 16
    iput p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/components/TokenRequester;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/components/TokenRequester;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c()V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/components/TokenRequester;)Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    return-object p0
.end method

.method public static synthetic c(Lcom/tencent/qcloud/tim/push/components/TokenRequester;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c()V

    .line 4
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;->onServiceCallback(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 6
    iput-object v1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;IILcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)V
    .locals 6

    .line 12
    const-string v0, "Xiaomi appId or appKey missing"

    const-string v1, "Meizu appId or appKey missing"

    const-string v2, "OPPO appKey or appSecret missing"

    iput p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    .line 13
    iput-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    .line 14
    sget-object p4, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->f:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestPushToken start, channel = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p4, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 15
    const-string p1, "requestPushToken context is null"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    .line 16
    const-string p2, "Context is null"

    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(ILjava/lang/String;)V

    return-void

    .line 17
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRegisterConfigBean()Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

    move-result-object v3

    if-nez v3, :cond_1

    .line 18
    const-string p1, "registerPushBean is null"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc350e

    .line 19
    const-string p2, "Push config missing"

    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(ILjava/lang/String;)V

    return-void

    .line 20
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 21
    const-string v5, "context"

    invoke-interface {v4, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance p1, Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-direct {p1, p0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenRequester;)V

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    .line 23
    iget v5, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    invoke-virtual {p1, v5}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;->a(I)V

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    const/16 p1, 0x7d2

    .line 24
    :try_start_0
    iput p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    .line 25
    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-virtual {p2, p1}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;->a(I)V

    .line 26
    const-string p1, "enableFCMPrivateRing"

    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getEnableFCMPrivateRing()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    const-string p1, "fcmChannelId"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getFcmPushChannelId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    const-string p1, "fcmChannelSoundName"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getFcmPushChannelSoundName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    const-string p1, "call FCM push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string p1, "TIMFCMPushPlugin"

    const-string p2, "registerTIMFCMPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto/16 :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    .line 31
    :pswitch_1
    const-string p1, "call Honor push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string p1, "TIMHonorPushPlugin"

    const-string p2, "registerTIMHonorPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 33
    :pswitch_2
    const-string p1, "call vivo push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string p1, "TIMVIVOPushPlugin"

    const-string p2, "registerTIMVIVOPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 35
    :pswitch_3
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getOppoPushAppKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 36
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getOppoPushAppSecret()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_1

    .line 37
    :cond_2
    const-string p1, "OPPOAppKey"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getOppoPushAppKey()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    const-string p1, "OPPOAppSecret"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getOppoPushAppSecret()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    const-string p1, "call OPPO push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string p1, "TIMOPPOPushPlugin"

    const-string p2, "registerTIMOPPOPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 41
    :pswitch_4
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getMeizuPushAppId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 42
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getMeizuPushAppKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 43
    :cond_3
    const-string p1, "meiZuAppId"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getMeizuPushAppId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    const-string p1, "meiZuAppKey"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getMeizuPushAppKey()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    const-string p1, "call Meizu push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string p1, "TIMMeiZuPushPlugin"

    const-string p2, "registerTIMMeiZuPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto :goto_0

    .line 47
    :pswitch_5
    const-string p1, "call Huawei push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string p1, "TIMHuaWeiPushPlugin"

    const-string p2, "registerTIMHuaWeiPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;

    goto :goto_0

    .line 49
    :pswitch_6
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getXiaomiPushAppId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 50
    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getXiaomiPushAppKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    .line 51
    :cond_4
    const-string p1, "xiaoMiAppId"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getXiaomiPushAppId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    const-string p1, "xiaomiAppKey"

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;->getXiaomiPushAppKey()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    const-string p1, "call Xiaomi push service"

    invoke-static {p4, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string p1, "TIMXiaoMiPushPlugin"

    const-string p2, "registerTIMXiaoMiPush"

    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-static {p1, p2, v4, p4}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :goto_0
    new-instance p1, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;

    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    invoke-direct {p1, p0, p3, p2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenRequester;ILcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;)V

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->e:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;

    .line 56
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_5
    :goto_1
    return-void

    .line 57
    :goto_2
    sget-object p2, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->f:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget p4, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    invoke-static {p4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " call push service exception = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    invoke-static {p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " service call failed"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const p2, 0xc3504

    invoke-virtual {p0, p2, p1}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(ILjava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x7d0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    sget-object p1, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->f:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "param missing before call push service, channel = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    .line 9
    invoke-static {v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc350e

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->a(ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->c:Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->b:I

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->d:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    .line 3
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester;->e:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->a()V

    :cond_0
    return-void
.end method
