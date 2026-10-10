.class public Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$NotificationBuilderHolder;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "NotificationBuilder"

.field public static final h:I = 0x1

.field public static final i:I = 0x2

.field public static final j:I = 0x3

.field public static final k:Ljava/lang/String; = "default push channel"


# instance fields
.field public a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

.field public b:Landroid/content/Context;

.field public c:I

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/qcloud/tim/push/bean/NotificationBean;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:I


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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->f:I

    .line 21
    return-void
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

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;)Landroid/content/Context;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static c()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$NotificationBuilderHolder;->a()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;
    .locals 4

    .line 63
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 64
    :cond_0
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 65
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOfflinePushExtInfo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method

.method public final a(ILjava/lang/String;)V
    .locals 2

    .line 66
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$2;-><init>(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Landroid/content/Context;Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V
    .locals 2

    .line 4
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    .line 5
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b()I

    move-result p1

    iput p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c:I

    .line 6
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 7
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    div-long/2addr p1, v0

    long-to-int p1, p1

    iput p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->f:I

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 3

    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-lt v0, v1, :cond_5

    .line 42
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 43
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 44
    const-string p3, "customChannelId"

    .line 45
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 46
    const-string p2, "customChannel"

    :cond_1
    const/4 v1, 0x4

    .line 47
    invoke-static {p3, p2, v1}, Landroidx/browser/trusted/f;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object p2

    const/4 p3, 0x1

    .line 48
    invoke-static {p2, p3}, Lr0/c;->a(Landroid/app/NotificationChannel;Z)V

    .line 49
    invoke-static {p2, p3}, Lr0/d;->a(Landroid/app/NotificationChannel;Z)V

    .line 50
    invoke-static {p2, p3}, Lcom/tencent/qcloud/tim/push/notification/b;->a(Landroid/app/NotificationChannel;Z)V

    .line 51
    invoke-static {p2, p3}, Lr0/a;->a(Landroid/app/NotificationChannel;I)V

    .line 52
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_2

    .line 53
    invoke-static {p2, p4}, Landroidx/media3/common/util/h;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 54
    :cond_2
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_4

    .line 55
    const-string p3, "android.resource://"

    invoke-virtual {p5, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_3

    .line 56
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/raw/"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 57
    :cond_3
    invoke-static {p5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p2, p1, v2}, Lr0/b;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    goto :goto_0

    .line 58
    :cond_4
    sget-object p1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string p3, "soundName is null"

    invoke-static {p1, p3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :goto_0
    invoke-static {v0, p2}, Landroidx/browser/trusted/d;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 60
    invoke-static {p6, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void

    .line 61
    :cond_5
    sget-object p1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string p2, "os version < 8"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 62
    invoke-static {p6, p1, p2, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "notificationUIId"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 37
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;

    .line 39
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->i()I

    move-result v1

    if-ne v1, p1, :cond_3

    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :cond_4
    :goto_0
    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V
    .locals 4

    .line 29
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->h()I

    move-result v0

    .line 30
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildNotification action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 31
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 9
    new-instance v0, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;

    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;-><init>()V

    .line 10
    invoke-virtual {v0, p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a(Ljava/util/Map;)V

    .line 11
    const-string v1, "IMTitle"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->j(Ljava/lang/String;)V

    .line 12
    const-string v1, "IMDesc"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->d(Ljava/lang/String;)V

    .line 13
    const-string v1, "IMChannelID"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->b(Ljava/lang/String;)V

    .line 14
    const-string v1, "IMSmallIcon"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->h(Ljava/lang/String;)V

    .line 15
    const-string v1, "IMSound"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->i(Ljava/lang/String;)V

    .line 16
    const-string v1, "IMBigPicture"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a(Ljava/lang/String;)V

    .line 17
    const-string v1, "ext"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->e(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->e()Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 20
    invoke-virtual {p0, v1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a(I)V

    .line 21
    :cond_0
    const-string v1, "online_message"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 22
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a(Z)V

    .line 23
    const-string v1, "clickExt"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->g(Ljava/lang/String;)V

    .line 24
    iget p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->f:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->f:I

    invoke-virtual {v0, p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->b(I)V

    .line 25
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 27
    invoke-virtual {p0, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void
.end method

.method public final b()I
    .locals 4

    .line 14
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 17
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 18
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getApplicationIcon e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    sget v0, Lcom/tencent/qcloud/tim/push/R$drawable;->fcm_private_icon:I

    return v0
.end method

.method public final b(Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Ljava/lang/String;)Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 10
    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->getConfigInfo()Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;->getFCMNotificationType()I

    move-result v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, -0x1

    .line 11
    :goto_0
    sget-object v2, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parseExt action = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    return v0

    :cond_1
    if-ne v1, v0, :cond_2

    const/4 p1, 0x2

    return p1

    .line 12
    :cond_2
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 13
    :goto_1
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseExt e= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public b(ILjava/lang/String;)V
    .locals 3

    if-gtz p1, :cond_0

    .line 1
    sget-object p1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string p2, "Notification id invalid"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 3
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;

    .line 5
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->i()I

    move-result v2

    if-ne v2, p1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    .line 6
    sget-object p1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string p2, "notificationInfo not exits"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_3
    invoke-virtual {v1, p2}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, v1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V

    return-void
.end method

.method public final b(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V
    .locals 4

    .line 20
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->i()I

    move-result p1

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 23
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string v1, "imageUriInput is null"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(ILjava/lang/String;)V

    return-void

    .line 25
    :cond_0
    const-string v1, "file://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 26
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(ILjava/lang/String;)V

    return-void

    .line 27
    :cond_1
    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 28
    :cond_2
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(ILjava/lang/String;)V

    return-void

    .line 30
    :cond_3
    :goto_0
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder$1;-><init>(Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 31
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final c(Ljava/lang/String;)I
    .locals 6

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    const-string p1, "entity"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "parseLegacyExt ext action = "

    const-string v3, "action"

    if-nez v1, :cond_0

    .line 5
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 7
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "parseLegacyExt entity action = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-gtz p1, :cond_1

    .line 8
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 11
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    if-gtz p1, :cond_2

    .line 12
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string v1, "parseLegacyExt failed"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    return p1

    .line 13
    :goto_1
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLegacyExt e= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final c(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V
    .locals 3

    .line 14
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->g()Ljava/util/Map;

    move-result-object p1

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    const-string v1, "eventIMloginAfterAppWakeUpPushMessageKey"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    const-string v1, "eventIMloginAfterAppWakeUpKey"

    const-string v2, "eventIMloginAfterAppWakeUpSubKey"

    invoke-static {v1, v2, v0}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 19
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 20
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 21
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 22
    :cond_1
    new-instance p1, Landroid/content/Intent;

    const-string v1, "com.tencent.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 24
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-static {v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

.method public final d(Ljava/lang/String;)I
    .locals 3

    .line 65
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "drawable"

    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_1

    .line 67
    sget-object v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smallIcon id is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 68
    :cond_0
    sget-object p1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string v0, "smallIcon not set"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    :cond_1
    iget p1, p0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c:I

    return p1
.end method

.method public final d(Lcom/tencent/qcloud/tim/push/bean/NotificationBean;)V
    .locals 18

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->m()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->d()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->b()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->c()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->l()Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->k()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->a()Ljava/lang/String;

    move-result-object v7

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->e()Ljava/lang/String;

    move-result-object v8

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->j()Ljava/lang/String;

    move-result-object v9

    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->i()I

    move-result v10

    .line 11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 12
    sget-object v1, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string v2, "notification title&content is null"

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 14
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "android.resource://"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "/raw/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 15
    invoke-virtual {v0, v5}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 16
    :cond_1
    sget-object v5, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    const-string v11, "sound is not set"

    invoke-static {v5, v11}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, ""

    move-object v5, v11

    .line 17
    :goto_0
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1a

    if-lt v12, v14, :cond_8

    .line 18
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    const-string v14, "default push channel"

    if-eqz v16, :cond_3

    .line 19
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v3, v14

    goto :goto_1

    :cond_2
    move-object v3, v5

    .line 20
    :cond_3
    :goto_1
    invoke-static {v14, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 21
    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_4
    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    const-class v14, Landroid/app/NotificationManager;

    invoke-virtual {v5, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/NotificationManager;

    .line 23
    iget-object v14, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x3

    if-le v14, v15, :cond_5

    .line 24
    iget-object v14, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    const/4 v15, 0x0

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 25
    sget-object v15, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v4

    const-string v4, "recycleChannelID = "

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-static {v5, v14}, Lcom/tencent/qcloud/tim/push/notification/a;->a(Landroid/app/NotificationManager;Ljava/lang/String;)V

    .line 27
    iget-object v4, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->e:Ljava/util/List;

    invoke-interface {v4, v14}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    move-object/from16 v17, v4

    .line 28
    :goto_2
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v4, v3

    :goto_3
    const/4 v13, 0x4

    goto :goto_4

    :cond_6
    move-object/from16 v4, v17

    goto :goto_3

    .line 29
    :goto_4
    invoke-static {v3, v4, v13}, Landroidx/browser/trusted/f;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v14

    .line 30
    invoke-static {v14, v4}, Landroidx/media3/common/util/h;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 31
    invoke-static {v14, v4}, Lr0/c;->a(Landroid/app/NotificationChannel;Z)V

    .line 32
    invoke-static {v14, v4}, Lr0/d;->a(Landroid/app/NotificationChannel;Z)V

    .line 33
    invoke-static {v14, v4}, Lcom/tencent/qcloud/tim/push/notification/b;->a(Landroid/app/NotificationChannel;Z)V

    .line 34
    invoke-static {v14, v4}, Lr0/a;->a(Landroid/app/NotificationChannel;I)V

    .line 35
    invoke-static {v14, v4}, Lcom/tencent/qcloud/tim/push/notification/c;->a(Landroid/app/NotificationChannel;Z)V

    .line 36
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 37
    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v14, v4, v13}, Lr0/b;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 38
    :cond_7
    invoke-static {v5, v14}, Landroidx/browser/trusted/d;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 39
    :cond_8
    new-instance v4, Landroid/content/Intent;

    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    const-class v13, Lcom/tencent/qcloud/tim/push/TIMPushOpenActivity;

    invoke-direct {v4, v5, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v5, 0x10000000

    .line 40
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 41
    const-string v5, "ext"

    invoke-virtual {v4, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    const-string v5, "notificationCreatedByIMKey"

    const/4 v8, 0x1

    invoke-virtual {v4, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 43
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/qcloud/tim/push/bean/NotificationBean;->n()Z

    move-result v5

    const-string v8, "online_message"

    invoke-virtual {v4, v8, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 44
    const-string v5, "notificationUIId"

    invoke-virtual {v4, v5, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 45
    const-string v5, "clickExt"

    invoke-virtual {v4, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    const/high16 v8, 0x4000000

    invoke-static {v5, v10, v4, v8}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 47
    new-instance v5, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v8, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-direct {v5, v8, v3}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v5, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 49
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v8, 0x1

    .line 50
    invoke-virtual {v1, v8}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 51
    invoke-virtual {v1, v8}, Landroidx/core/app/NotificationCompat$Builder;->setVisibility(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 52
    const-string v2, "msg"

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v13, 0x4

    .line 53
    invoke-virtual {v1, v13}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 54
    invoke-virtual {v0, v6}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->d(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 55
    invoke-virtual {v1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 56
    invoke-virtual {v1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 57
    invoke-virtual {v1, v8}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    .line 58
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 59
    sget-object v2, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bigPicture ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    new-instance v2, Landroidx/core/app/NotificationCompat$BigPictureStyle;

    invoke-direct {v2}, Landroidx/core/app/NotificationCompat$BigPictureStyle;-><init>()V

    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$BigPictureStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_9
    const/16 v2, 0x1a

    if-ge v12, v2, :cond_a

    .line 61
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 62
    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    .line 63
    :cond_a
    iget-object v2, v0, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->b:Landroid/content/Context;

    invoke-static {v2}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v2

    .line 64
    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v2, v10, v1}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x2e

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    :cond_1
    :goto_0
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
