.class public Lcom/tencent/qcloud/tim/push/TIMPushEntry;
.super Lcom/tencent/qcloud/tuicore/ServiceInitializer;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;
.implements Lcom/tencent/qcloud/tuicore/interfaces/ITUIService;


# static fields
.field public static final TAG:Ljava/lang/String; = "TIMPushEntry"

.field public static mAppContext:Landroid/content/Context;

.field private static mInstance:Lcom/tencent/qcloud/tim/push/TIMPushEntry;


# instance fields
.field public mUserId:Ljava/lang/String;


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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/qcloud/tuicore/ServiceInitializer;-><init>()V

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

.method public static getInstance()Lcom/tencent/qcloud/tim/push/TIMPushEntry;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mInstance:Lcom/tencent/qcloud/tim/push/TIMPushEntry;

    .line 3
    return-object v0
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

.method private initListener()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "TIMPushService"

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerService(Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUIService;)V

    .line 6
    .line 7
    const-string v0, "eventSubKeyUserKickedOffline"

    .line 8
    .line 9
    const-string v1, "eventLoginStateChanged"

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 13
    .line 14
    const-string v0, "eventSubKeyUserSigExpired"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 18
    .line 19
    const-string v0, "eventSubKeyUserLoginSuccess"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 23
    .line 24
    const-string v0, "eventSubKeyUserLogoutSuccess"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 28
    return-void
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
    .line 82
    .line 83
    .line 84
.end method


# virtual methods
.method public getApplicationContext()Landroid/content/Context;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "appContext is null"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    sput-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 30
    return-object v0
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
    .line 82
    .line 83
    .line 84
.end method

.method public init(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "init"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object p0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mInstance:Lcom/tencent/qcloud/tim/push/TIMPushEntry;

    .line 10
    .line 11
    sput-object p1, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mUserId:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->initListener()V

    .line 34
    return-void
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public onCall(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 28
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCall method = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v1, "xiaomiClickIntent"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-nez p2, :cond_0

    .line 30
    const-string p1, "METHOD_XIAOMI_CLICK_INTENT param is null"

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 31
    :cond_0
    const-string p1, "xiaomiClickIntentKey"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    .line 32
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object p2

    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Landroid/content/Intent;Landroid/content/Context;)V

    goto/16 :goto_1

    .line 33
    :cond_1
    const-string v1, "setPushMessageData"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez p2, :cond_2

    .line 34
    const-string p1, "METHOD_SET_PUSH_MESSAGE_DATA param is null"

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 35
    :cond_2
    const-string p1, "pushMessageDataKey"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 36
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/util/Map;)V

    goto :goto_1

    .line 37
    :cond_3
    const-string v1, "reportNotificationClicked"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-nez p2, :cond_4

    .line 38
    const-string p1, "METHOD_CALL_NOTIFICATION_CLICKED param is null"

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 39
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    new-instance v0, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;

    invoke-direct {v0}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;-><init>()V

    .line 41
    :try_start_0
    const-string v1, "clickExt"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setPushId(Ljava/lang/String;)V

    .line 42
    const-string v1, "pushEventTime"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setEventTime(J)V

    .line 43
    const-string v1, "pushEventType"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setEventType(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 44
    sget-object v1, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "METHOD_CALL_NOTIFICATION_CLICKED e = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Ljava/util/List;)V

    :cond_5
    :goto_1
    return-object v2
.end method

.method public onCall(Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCall method callback = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    const-string v1, "registerTIMPush"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-nez p2, :cond_0

    .line 3
    const-string p1, "METHOD_REGISTER_PUSH param is null"

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v4

    goto :goto_0

    .line 4
    :cond_0
    const-string p1, "context"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    .line 5
    :goto_0
    invoke-static {}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->getInstance()Lcom/tencent/qcloud/tim/push/TIMPushManager;

    move-result-object p2

    new-instance v0, Lcom/tencent/qcloud/tim/push/TIMPushEntry$3;

    invoke-direct {v0, p0, p3}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$3;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)V

    invoke-virtual {p2, p1, v3, v2, v0}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->registerPush(Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto/16 :goto_1

    .line 6
    :cond_1
    const-string v1, "doBackground"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    .line 7
    const-string p1, "appUnreadCountKey"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 8
    :cond_2
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object p1

    new-instance p2, Lcom/tencent/qcloud/tim/push/TIMPushEntry$4;

    invoke-direct {p2, p0, p3}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$4;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)V

    invoke-virtual {p1, v3, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto/16 :goto_1

    .line 9
    :cond_3
    const-string v1, "doForeground"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 10
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object p1

    new-instance p2, Lcom/tencent/qcloud/tim/push/TIMPushEntry$5;

    invoke-direct {p2, p0, p3}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$5;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)V

    invoke-virtual {p1, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto/16 :goto_1

    .line 11
    :cond_4
    const-string v1, "reportPushMessageData"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const v5, 0xc3500

    const-string v6, "param is null"

    if-eqz v1, :cond_7

    if-nez p2, :cond_6

    .line 12
    invoke-static {v0, v6}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_5

    .line 13
    invoke-virtual {p3, v5, v6, v4}, Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;->onServiceCallback(ILjava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    return-object v4

    .line 14
    :cond_6
    const-string p1, "url"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    .line 15
    const-string p1, "pushId"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    .line 16
    const-string p1, "time"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 17
    const-string p1, "type"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "url:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", pushID:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", type:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", time:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object v5

    new-instance v11, Lcom/tencent/qcloud/tim/push/TIMPushEntry$6;

    invoke-direct {v11, p0, p3}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$6;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;)V

    invoke-virtual/range {v5 .. v11}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/lang/String;Ljava/lang/String;IJLcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto :goto_1

    .line 20
    :cond_7
    const-string v1, "callPushMethod"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_a

    if-nez p2, :cond_9

    .line 21
    invoke-static {v0, v6}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_8

    .line 22
    invoke-virtual {p3, v5, v6, v4}, Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;->onServiceCallback(ILjava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    return-object v4

    .line 23
    :cond_9
    const-string p1, "callPushSubMethod"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 24
    const-string v0, "disableRequestPostNotificationPermission"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 25
    const-string p1, "disable"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 26
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p2

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->enableRequestPostNotificationPermission(Z)V

    if-eqz p3, :cond_a

    .line 27
    invoke-virtual {p3, v3, v2, v4}, Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;->onServiceCallback(ILjava/lang/String;Landroid/os/Bundle;)V

    :cond_a
    :goto_1
    return-object v4
.end method

.method public onNotifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object p3, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v1, "onNotifyEvent key = "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "subKey = "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {p3, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    const-string p3, "eventLoginStateChanged"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getAutoRegisterPush()Z

    .line 46
    move-result p1

    .line 47
    .line 48
    if-nez p1, :cond_0

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_0
    const-string p1, "eventSubKeyUserKickedOffline"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result p1

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    const-string p1, "eventSubKeyUserSigExpired"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    move-result p1

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    const-string p1, "eventSubKeyUserLogoutSuccess"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_1
    const-string p1, "eventSubKeyUserLoginSuccess"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    sget-object p1, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 85
    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    sput-object p1, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-static {}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->getInstance()Lcom/tencent/qcloud/tim/push/TIMPushManager;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    sget-object p2, Lcom/tencent/qcloud/tim/push/TIMPushEntry;->mAppContext:Landroid/content/Context;

    .line 103
    .line 104
    new-instance p3, Lcom/tencent/qcloud/tim/push/TIMPushEntry$2;

    .line 105
    .line 106
    .line 107
    invoke-direct {p3, p0}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$2;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;)V

    .line 108
    const/4 v0, 0x0

    .line 109
    .line 110
    const-string v1, ""

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2, v0, v1, p3}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->registerPush(Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 114
    return-void

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_0
    invoke-static {}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->getInstance()Lcom/tencent/qcloud/tim/push/TIMPushManager;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    new-instance p2, Lcom/tencent/qcloud/tim/push/TIMPushEntry$1;

    .line 121
    .line 122
    .line 123
    invoke-direct {p2, p0}, Lcom/tencent/qcloud/tim/push/TIMPushEntry$1;-><init>(Lcom/tencent/qcloud/tim/push/TIMPushEntry;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Lcom/tencent/qcloud/tim/push/TIMPushManager;->unRegisterPush(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 127
    :cond_4
    :goto_1
    return-void
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method
