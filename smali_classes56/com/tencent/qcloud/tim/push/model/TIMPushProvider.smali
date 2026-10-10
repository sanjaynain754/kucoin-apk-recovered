.class public Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "TIMPushProvider"

.field public static final b:J = 0x0L

.field public static final c:J = 0xdL

.field public static final d:J = 0x13L

.field public static final e:J = 0x2710L

.field public static final f:I = 0x1f4

.field public static final g:I = 0x3e8

.field public static final h:I = 0xa

.field public static final i:I = 0xf

.field public static final j:I = 0x1b61

.field public static final k:J = 0x1f4L

.field public static final l:I = 0x1

.field public static final m:Ljava/lang/String; = "foregroundShow"

.field public static final n:Ljava/lang/String; = "show"

.field public static final o:Ljava/lang/String; = "hide"

.field public static final p:I = 0x0

.field public static final q:I = 0x1

.field public static final r:I = 0x2

.field public static final s:I = 0x5

.field public static final t:I = 0x6


# instance fields
.field public A:J

.field public B:J

.field public C:Landroid/os/Handler;

.field public D:Ljava/lang/Runnable;

.field public E:I

.field public final F:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

.field public u:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

.field public v:Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;

.field public w:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

.field public x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/qcloud/tim/push/TIMPushListener;",
            ">;"
        }
    .end annotation
.end field

.field public y:I

.field public z:Ljava/lang/String;


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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->y:I

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    iput-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->z:Ljava/lang/String;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    iput-wide v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->A:J

    .line 21
    .line 22
    iput-wide v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->B:J

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->E:I

    .line 25
    .line 26
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$20;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$20;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->F:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 32
    return-void
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

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;I)I
    .locals 0

    .line 8
    iput p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->y:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;J)J
    .locals 0

    .line 9
    iput-wide p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->B:J

    return-wide p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->z:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)Ljava/util/List;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;I)V
    .locals 0

    .line 6
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;I)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)Z
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)I
    .locals 0

    .line 2
    iget p0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->E:I

    return p0
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;J)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(J)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->c(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 75
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getVendorParams()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 76
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getVendorParams()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p1

    .line 78
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, ""

    if-eqz v2, :cond_2

    .line 79
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 80
    const-string v4, "foregroundShow"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 81
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    const-string p1, "show"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 83
    :cond_3
    const-string p1, "hide"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    return p1

    .line 84
    :goto_1
    sget-object v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse foregroundShow failed, e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_2
    return v0
.end method

.method public a(ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 16
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v1, "doBackground"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getOfflinePushManager()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$4;

    invoke-direct {v1, p0, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$4;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;->doBackground(ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    return-void
.end method

.method public final a(J)V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->E:I

    .line 68
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 69
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->e()V

    .line 70
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->D:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 39
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 40
    const-string v1, "event_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 41
    const-string p1, "event_code"

    invoke-virtual {v0, p1, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 42
    const-string p1, "event_result"

    invoke-virtual {v0, p1, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 43
    const-string p1, "event_message"

    invoke-virtual {v0, p1, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    const-string p1, "more_message"

    invoke-virtual {v0, p1, p8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    const-string p1, "extension_message"

    invoke-virtual {v0, p1, p9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p1

    const-string p2, "reportPushSDKEvent"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance p4, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$9;

    invoke-direct {p4, p0, p10}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$9;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 47
    sget-object p2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "reportPushSDKEvent exception = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 2

    .line 73
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$17;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;Ljava/lang/String;)V
    .locals 3

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 86
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    const-string v2, "IMTitle"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getDesc()Ljava/lang/String;

    move-result-object v1

    const-string v2, "IMDesc"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    const-string v1, "clickExt"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    const-string p2, "online_message"

    invoke-interface {v0, p2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getExt()[B

    move-result-object p2

    if-eqz p2, :cond_0

    .line 91
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>([B)V

    .line 92
    const-string p2, "ext"

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getAndroidSound()Ljava/lang/String;

    move-result-object p1

    .line 94
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 95
    const-string p2, "IMSound"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Ljava/util/Map;)V

    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 18
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v1, "doForeground"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getOfflinePushManager()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$5;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$5;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;->doForeground(Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/TIMPushListener;)V
    .locals 1

    if-nez p1, :cond_0

    .line 63
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "addPushMessageListener is null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;)V
    .locals 1

    .line 61
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;

    invoke-direct {v0, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;)V

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->u:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 62
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->u:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 31
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 32
    const-string v1, "notification_bar_state"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    const-string p2, "tim_push_plugin_version"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    const-string p1, "system_language"

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    const-string p1, "token_error_code"

    invoke-virtual {v0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 36
    const-string p1, "token_error_msg"

    invoke-virtual {v0, p1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p1

    const-string p2, "setOfflinePushInfo"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance p4, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$8;

    invoke-direct {p4, p0, p6}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$8;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 38
    sget-object p2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "reportTIMPushInfo exception = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 8

    .line 11
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setOfflinePushConfig businessID = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " pushTokenState = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "empty_token"

    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "valid"

    goto :goto_1

    :cond_1
    :goto_0
    const-string v2, "empty"

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-gtz v1, :cond_2

    .line 14
    const-string v1, "setOfflinePushConfig invalid businessID!"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 15
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;I)V

    return-void
.end method

.method public final a(Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;I)V
    .locals 9

    .line 97
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;

    invoke-direct {v0, p2, p3, p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;-><init>(JLjava/lang/String;)V

    .line 98
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getOfflinePushManager()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;

    move-result-object v1

    new-instance v2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$21;

    move-object v3, p0

    move-object v5, p1

    move-wide v6, p2

    move-object v8, p4

    move v4, p5

    invoke-direct/range {v2 .. v8}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$21;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;ILjava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v1, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;->setOfflinePushConfig(Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 74
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$18;

    invoke-direct {v1, p0, p2, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$18;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 3

    .line 53
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string p2, "already login"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-static {p3, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void

    .line 56
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 57
    const-string v2, "userID"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    const-string p1, "appKey"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p1

    const-string p2, "pushLogin"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$10;

    invoke-direct {v2, p0, p3}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$10;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {p1, p2, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "connect failed: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const p2, 0xc3504

    invoke-static {p3, p2, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;",
            ">;",
            "Lcom/tencent/qcloud/tim/push/TIMPushCallback;",
            ")V"
        }
    .end annotation

    .line 20
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;

    .line 22
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 23
    const-string v3, "type"

    invoke-virtual {v1}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getEventType()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 24
    const-string v3, "time"

    invoke-virtual {v1}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getEventTime()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 25
    const-string v3, "pushId"

    invoke-virtual {v1}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getPushId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 27
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 28
    const-string v1, "eventList"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    const-string v1, "reportOfflinePushEvent"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$6;

    invoke-direct {v2, p0, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$6;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 30
    :goto_1
    sget-object p2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportOfflinePushEvent exception = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/content/Context;I)Z
    .locals 2

    .line 48
    iget v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->y:I

    if-eqz v0, :cond_0

    if-eq p2, v0, :cond_0

    .line 49
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->unInitSDK()V

    .line 50
    :cond_0
    iput p2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->y:I

    .line 51
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->F:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->addIMSDKListener(Lcom/tencent/imsdk/v2/V2TIMSDKListener;)V

    .line 52
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->initSDK(Landroid/content/Context;ILcom/tencent/imsdk/v2/V2TIMSDKConfig;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 4

    .line 71
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    .line 72
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    move-result-wide v0

    if-eqz p1, :cond_1

    const-wide/16 v2, 0x2

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x5

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x3

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 5
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 3

    .line 13
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getOfflinePushInfo()Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 14
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "v2TIMOfflinePushInfo is null or disable"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v1

    new-instance v2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$19;

    invoke-direct {v2, p0, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$19;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)V

    const-string v0, "getPushMessageID"

    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void
.end method

.method public b(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/qcloud/tim/push/TIMPushCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$12;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$12;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    const-string p1, "getBuiltInPushUserID"

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void
.end method

.method public b(Lcom/tencent/qcloud/tim/push/TIMPushListener;)V
    .locals 1

    if-nez p1, :cond_0

    .line 7
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "removePushMessageListener is null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 9
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$14;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$14;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)Z
    .locals 1

    .line 10
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getDesc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getExt()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->getExt()[B

    move-result-object p1

    array-length p1, p1

    if-nez p1, :cond_1

    .line 12
    :cond_0
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "invalid offlinePushInfo"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public c()V
    .locals 2

    .line 2
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$1;

    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$1;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->w:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->w:Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->addIMSDKListener(Lcom/tencent/imsdk/v2/V2TIMSDKListener;)V

    .line 4
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$2;

    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$2;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->v:Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;

    .line 5
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->v:Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->addAdvancedMsgListener(Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;)V

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->A:J

    return-void
.end method

.method public final c(Lcom/tencent/imsdk/v2/V2TIMMessage;)V
    .locals 3

    .line 8
    sget-boolean v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->i:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getOfflinePushInfo()Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void

    :cond_1
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    .line 11
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "foregroundShow hide"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_2
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->canPostNotificationInForeground()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    if-ne v0, v1, :cond_4

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void

    :cond_4
    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    .line 14
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningScene()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 15
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-void

    :cond_5
    const/4 p1, 0x6

    if-ne v0, p1, :cond_6

    .line 16
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "RUNNING_SCENE_IN_MIXED_APP"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_0
    return-void

    .line 17
    :cond_7
    sget-object p1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v0, "invalid mShowNotificationInForeground"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 7
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$16;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$16;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getTotalUnreadMessageCount(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void
.end method

.method public d(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$11;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$11;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->logout(Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    return-void
.end method

.method public d()Z
    .locals 2

    .line 2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()V
    .locals 3

    .line 6
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyNotificationClicked = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->z:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/qcloud/tim/push/TIMPushListener;

    .line 9
    invoke-virtual {v2, v0}, Lcom/tencent/qcloud/tim/push/TIMPushListener;->onNotificationClicked(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->z:Ljava/lang/String;

    return-void
.end method

.method public e(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    const-string v1, "UIComponentType"

    const-wide/16 v2, 0xd

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 3
    const-string v1, "UIStyleType"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 4
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v1

    const-string v2, "reportTUIComponentUsage"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$7;

    invoke-direct {v3, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$7;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 5
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportTIMPushComponentUsage exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f()V
    .locals 2

    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->u:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->removeConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    return-void
.end method

.method public f(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    const-string v1, "unRegisterPush"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getOfflinePushManager()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$3;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$3;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;->setOfflinePushConfig(Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    return-void
.end method

.method public g()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->E:I

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->B:J

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->A:J

    .line 8
    sub-long/2addr v0, v2

    .line 9
    .line 10
    sget-object v2, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v4, "notifyNotificationClicked launchingTime:"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->D:Ljava/lang/Runnable;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    :cond_0
    const-wide/16 v2, 0x2710

    .line 44
    .line 45
    cmp-long v0, v0, v2

    .line 46
    .line 47
    if-gtz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Landroid/os/Handler;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    .line 59
    .line 60
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$15;-><init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    .line 64
    .line 65
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->D:Ljava/lang/Runnable;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->C:Landroid/os/Handler;

    .line 68
    .line 69
    const-wide/16 v2, 0x0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 73
    return-void

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->e()V

    .line 77
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
