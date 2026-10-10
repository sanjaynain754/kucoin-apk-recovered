.class public Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;
.super Lcom/tencent/qcloud/tim/push/TIMPushManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;,
        Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TIMPushManagerImplHolder;
    }
.end annotation


# static fields
.field public static final p:Ljava/lang/String; = "TIMPushManagerImpl"

.field public static final q:I = 0x80


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/content/Intent;

.field public c:Landroid/content/Context;

.field public d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

.field public e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

.field public f:Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;

.field public g:Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

.field public h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Ljava/lang/String;

.field public n:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

.field public o:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;


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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/qcloud/tim/push/TIMPushManager;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    .line 18
    .line 19
    new-instance v0, Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->f:Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;

    .line 25
    .line 26
    new-instance v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->j:Ljava/lang/String;

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->k:Z

    .line 41
    .line 42
    iput-boolean v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z

    .line 43
    .line 44
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V

    .line 50
    .line 51
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->n:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    .line 52
    .line 53
    new-instance v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V

    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->o:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    .line 59
    return-void
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

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->j:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;ILjava/lang/String;JLjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 0

    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(ILjava/lang/String;JLjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 0

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->k:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b()V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TIMPushManagerImplHolder;->a()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e()V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z

    return p0
.end method

.method public static synthetic f(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->o:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    return-object p0
.end method

.method public static synthetic g(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->g:Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

    return-object p0
.end method

.method public static synthetic h(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->k:Z

    return p0
.end method

.method public static synthetic i(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    return-object p0
.end method

.method public static synthetic j(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/components/TokenLogic;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    .line 3
    return-object p0
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


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 159
    :try_start_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 160
    const-string v1, "com.tencent.qcloud.tim.tuikit"

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    const-string v0, "com.tencent.qcloud.tim.demo"

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 162
    :cond_0
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".BuildConfig"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 163
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v0, 0x0

    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 165
    :goto_1
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBuildConfigValue e = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string p1, ""

    return-object p1
.end method

.method public final a(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    .line 167
    const-string p1, "Token request success"

    return-object p1

    .line 168
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const-string v0, "Token request failed"

    if-eqz p1, :cond_1

    return-object v0

    .line 169
    :cond_1
    invoke-virtual {p0, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Ljava/lang/String;)I

    move-result p1

    const/16 v1, 0x80

    if-gt p1, v1, :cond_2

    return-object p2

    :cond_2
    return-object v0
.end method

.method public a(ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 10
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$10;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$10;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(ILjava/lang/String;JLjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 8

    const-string v0, "empty_token"

    if-nez p1, :cond_3

    .line 49
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 50
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p5, "token is empty"

    invoke-static {p1, p5}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const p5, 0xc3509

    if-eqz p1, :cond_0

    .line 52
    const-string p2, "Push token empty"

    :cond_0
    move p1, p5

    :goto_0
    move-object v4, v0

    goto :goto_1

    .line 53
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 54
    const-string p2, "Token request success"

    :cond_2
    move-object v4, p5

    move p1, v0

    goto :goto_1

    .line 55
    :cond_3
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    move-object v4, p5

    :goto_1
    const-wide/16 v0, 0x0

    cmp-long p5, p3, v0

    if-gtz p5, :cond_5

    .line 56
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->f()J

    move-result-wide v2

    move-wide v6, v2

    goto :goto_2

    :cond_5
    move-wide v6, p3

    :goto_2
    cmp-long p5, v6, v0

    if-gtz p5, :cond_6

    .line 57
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p5

    invoke-virtual {p5}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    move-result p5

    invoke-static {p5}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object p5

    .line 58
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid businessID, channel = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", inputBusinessId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ", resolvedBusinessId = "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_6

    .line 59
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "BusinessID invalid for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const p1, 0xc350e

    :cond_6
    move v2, p1

    .line 60
    invoke-virtual {p0, v2, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v2, :cond_8

    .line 61
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a()Z

    move-result p1

    if-nez p1, :cond_7

    .line 62
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance p2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$16;

    invoke-direct {p2, p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$16;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V

    invoke-virtual {p1, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->c(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto :goto_3

    .line 63
    :cond_7
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getCustomBadgeNumber()I

    move-result p2

    int-to-long p2, p2

    invoke-virtual {p1, p2, p3}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a(J)V

    .line 64
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->b()V

    .line 65
    :cond_8
    :goto_3
    invoke-virtual {p0, v2, v5}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(ILjava/lang/String;)V

    .line 66
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;

    move-object v1, p0

    move-object v3, p6

    invoke-direct/range {v0 .. v5}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$17;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;ILcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v6, v7, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;JLcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 11

    .line 67
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v10, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$18;

    move-object/from16 v1, p10

    invoke-direct {v10, p0, v1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$18;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    move-wide v1, p1

    move-wide v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public final a(Landroid/content/Context;ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 7

    if-lez p2, :cond_0

    .line 68
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initSDK:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v0

    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->initSDK(Landroid/content/Context;ILcom/tencent/imsdk/v2/V2TIMSDKConfig;)Z

    .line 70
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginStatus()I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_1

    .line 71
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p2, "errcode:800001errMsg:not logined"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3501

    .line 72
    const-string p2, "not logined"

    invoke-static {p3, p1, p2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 73
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 74
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p2, "invalid context"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    .line 75
    invoke-static {p3, p1, p2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 76
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d()V

    .line 77
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setRunningScene(ILjava/lang/String;)V

    .line 78
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    .line 79
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "registerPush mDeviceInfo = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "push sdk version:9.0.7667, type:1, platform:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", scene:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 82
    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e()V

    .line 84
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->n:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    invoke-virtual {p1, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 85
    iget-boolean p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z

    if-eqz p1, :cond_3

    .line 86
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->n:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    invoke-virtual {p1, p2}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;)V

    return-void

    .line 87
    :cond_3
    iget-object v6, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->n:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    const-wide/16 v3, 0x0

    const-string v5, ""

    const v1, 0xc350e

    const-string v2, "timpush-configs.json parse failed"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(ILjava/lang/String;JLjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public final a(Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 5

    .line 88
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p0, p1, p2, p4}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Landroid/content/Context;ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    if-gtz p2, :cond_1

    .line 90
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "errcode:800002errMsg:invalid sdkAppId:"

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3502

    .line 91
    const-string p2, "invalid sdkAppId"

    invoke-static {p4, p1, p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 92
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 93
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p2, "invalid context"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    .line 94
    invoke-static {p4, p1, p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 95
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d()V

    .line 96
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    move-result-wide v1

    const-wide/16 v3, 0x3

    cmp-long p1, v1, v3

    const/4 v1, 0x1

    if-nez p1, :cond_3

    .line 97
    sput-boolean v1, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->i:Z

    .line 98
    :cond_3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    .line 99
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "register push mDeviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "push sdk version:9.0.7667, type:1, platform:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", scene:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 102
    invoke-static {p1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->o:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    invoke-virtual {v2, p4}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 104
    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {p4, v2, p2}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Landroid/content/Context;I)Z

    move-result p2

    if-nez p2, :cond_4

    .line 105
    const-string p2, "initSDK failed"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->o:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;

    const p2, 0xc3503

    const-string p3, "init failed"

    invoke-virtual {p1, p2, p3, v0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$TokenResultCallback;->onError(ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 107
    :cond_4
    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->j:Ljava/lang/String;

    .line 108
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_5

    .line 109
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p4

    invoke-virtual {p4}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object p4

    .line 110
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 111
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "register with loginUserID: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, p4

    goto :goto_0

    .line 112
    :cond_5
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "register registrationID: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->j:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    .line 114
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    .line 115
    iget-object p4, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$19;

    invoke-direct {v0, p0, v1, p2, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$19;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;ZLjava/lang/String;Z)V

    invoke-virtual {p4, p2, p3, v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 2

    .line 12
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "clickNotification"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b:Landroid/content/Intent;

    .line 14
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Landroid/content/Intent;)V

    .line 15
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->f:Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b:Landroid/content/Intent;

    invoke-virtual {p1, v0, p2}, Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;->a(Landroid/content/Intent;Landroid/content/Context;)V

    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 11
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$11;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$11;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 10

    const/4 v1, 0x0

    const v2, 0xc350d

    if-eqz p1, :cond_0

    .line 141
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    move-object v9, p2

    goto :goto_2

    .line 142
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 143
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    invoke-static {p2, v2, v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 146
    :cond_2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 147
    const-string p1, "channelName"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 148
    const-string p1, "channelID"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 149
    const-string p1, "channelDesc"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 150
    const-string p1, "channelSound"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 151
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v9, p2

    :try_start_1
    invoke-virtual/range {v3 .. v9}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v9, p2

    goto :goto_0

    .line 152
    :goto_1
    sget-object p2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createNotificationChannel e = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "exception: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, v2, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 154
    :goto_2
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p2, "param is not string"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-static {v9, v2, p2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 3

    .line 116
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const v2, 0xc350f

    if-eqz v0, :cond_0

    .line 117
    const-string p1, "invalid api"

    invoke-static {p3, v2, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 118
    :cond_0
    const-string v0, "getNotificationExtInfo"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    invoke-virtual {p0, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 120
    :cond_1
    const-string v0, "setPushToken"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 122
    :cond_2
    const-string v0, "getPushToken"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 123
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 124
    :cond_3
    const-string v0, "disableAutoRegisterPush"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 126
    :cond_4
    const-string v0, "disableRequestPostNotificationPermission"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 127
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 128
    :cond_5
    const-string v0, "createNotificationChannel"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 129
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 130
    :cond_6
    const-string v0, "setPushConfig"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 131
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 132
    :cond_7
    const-string v0, "getPushChannelId"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 133
    invoke-virtual {p0, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 134
    :cond_8
    const-string v0, "setCustomBadgeNumber"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 135
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->g(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 136
    :cond_9
    const-string v0, "setAppLanguage"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 137
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->f(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 138
    :cond_a
    const-string v0, "reportFCMPushArrived"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 139
    invoke-virtual {p0, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 140
    :cond_b
    const-string p1, "unsupported api"

    invoke-static {p3, v2, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;IJLcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 5

    .line 17
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 18
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p2, "pushID is null"

    invoke-static {p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    .line 19
    invoke-static {p6, p1, p2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 20
    :cond_0
    new-instance v0, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;

    invoke-direct {v0}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;-><init>()V

    .line 21
    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setPushId(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0, p4, p5}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setEventTime(J)V

    .line 23
    invoke-virtual {v0, p3}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setEventType(I)V

    const/4 p2, 0x0

    .line 24
    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->setStatus(I)V

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    const-string p4, "http"

    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    const-string p4, "https"

    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_2

    .line 28
    :cond_1
    :try_start_0
    new-instance p3, Lorg/json/JSONArray;

    invoke-direct {p3}, Lorg/json/JSONArray;-><init>()V

    .line 29
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;

    .line 30
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 31
    const-string v2, "type"

    invoke-virtual {p5}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getEventType()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 32
    const-string v2, "time"

    invoke-virtual {p5}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getEventTime()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 33
    const-string v2, "pushId"

    invoke-virtual {p5}, Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;->getPushId()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {v0, v2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    invoke-virtual {p3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 35
    :cond_2
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    .line 36
    const-string p5, "eventList"

    invoke-virtual {p4, p5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    invoke-static {}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a()Lcom/tencent/qcloud/tim/push/components/HttpClient;

    move-result-object p3

    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance p5, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$13;

    invoke-direct {p5, p0, p6, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$13;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/util/List;)V

    invoke-virtual {p3, p1, v1, p4, p5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 38
    :goto_1
    sget-object p3, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "post exception = "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", try report by IMChannel."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0, p2, p6}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 40
    :cond_3
    :goto_2
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string p3, "url is invalid, try report by IMChannel."

    invoke-static {p1, p3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0, p2, p6}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;",
            ">;)V"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->g:Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, p1, v1}, Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2
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

    .line 42
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "IMChannel not available, insert to database."

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/util/List;)V

    .line 45
    const-string p1, "not logined, insert to database"

    const/4 v0, 0x0

    const v1, 0xc3501

    invoke-static {p2, v1, p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$14;

    invoke-direct {v1, p0, p2, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$14;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/util/List;)V

    invoke-virtual {v0, p1, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$12;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$12;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Landroid/content/Context;)Z
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 157
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(Landroid/content/Context;)V

    .line 158
    :cond_0
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public addPushListener(Lcom/tencent/qcloud/tim/push/TIMPushListener;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$5;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$5;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final b(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 34
    :cond_0
    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length p1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 35
    :catch_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public final b()V
    .locals 4

    .line 39
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->canRequestPostNotificationPermission()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_3

    .line 41
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 42
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setNotificationPermissionDenied(Z)V

    return-void

    .line 43
    :cond_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getNotificationPermissionDenied()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "requestNotificationPermission denied"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 45
    :cond_2
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.tencent.qcloud.tim.push.permission.PermissionRequestActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 47
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 48
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 49
    sget-object v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestNotificationPermission exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final b(ILjava/lang/String;)V
    .locals 7

    .line 36
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->k()Ljava/lang/String;

    move-result-object v3

    .line 37
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "systemLanguage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", tokenErrorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",tokenErrorMsg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Landroid/content/Context;)I

    move-result v2

    const-string v1, "9.0.7667"

    const/4 v6, 0x0

    move v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    .line 3
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    invoke-virtual {v0, p1, v1}, Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;->a(Landroid/content/Context;Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    .line 4
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->f:Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/notification/NotificationClickProcessor;->a(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    .line 5
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Landroid/content/Context;)V

    .line 6
    invoke-static {}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->c()Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    invoke-virtual {p1, v0, v1}, Lcom/tencent/qcloud/tim/push/notification/NotificationBuilder;->a(Landroid/content/Context;Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;)V

    .line 7
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->c()V

    .line 8
    new-instance p1, Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->g:Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

    .line 9
    const-string p1, ""

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i:Ljava/lang/String;

    .line 10
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e:Lcom/tencent/qcloud/tim/push/components/ActivityLifecycleHandler;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 11
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setContext(Landroid/content/Context;)V

    .line 12
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->i()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setPushChannelId(I)V

    .line 13
    const-string p1, "custom_timpush_configs"

    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    return-void
.end method

.method public final b(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 4

    .line 17
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 18
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v2, "getNotificationExtInfo is null"

    invoke-static {v0, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void

    .line 20
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNotificationExtInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 22
    iput-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    .line 23
    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 24
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "disableAutoRegisterPush"

    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setAutoRegisterPush(Z)V

    .line 26
    invoke-static {p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void

    .line 27
    :cond_0
    instance-of v1, p1, Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 28
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "param is not Boolean"

    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc350b

    .line 29
    invoke-static {p2, p1, v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 30
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 31
    sget-object v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "disableAutoRegisterPush "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setAutoRegisterPush(Z)V

    .line 33
    invoke-static {p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/offlinepush/OfflinePushEventItem;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$15;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$15;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/util/List;)V

    invoke-virtual {v0, p1, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Ljava/util/List;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 16
    :cond_1
    :goto_0
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "eventItemList null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 1

    .line 14
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 4
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "disableRequestPostNotificationPermission"

    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->enableRequestPostNotificationPermission(Z)V

    .line 6
    invoke-static {p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_0
    instance-of v1, p1, Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 8
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "param is not Boolean"

    invoke-static {p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc350c

    .line 9
    invoke-static {p2, p1, v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 11
    sget-object v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "disableRequestPostNotificationPermission "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->enableRequestPostNotificationPermission(Z)V

    .line 13
    invoke-static {p2, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->m:Ljava/lang/String;

    return-void
.end method

.method public callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$9;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$9;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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

.method public final d()V
    .locals 5

    .line 13
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 14
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    const-string v1, ".json"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    goto :goto_0

    .line 17
    :cond_1
    const-string v0, "timpush-configs.json"

    .line 18
    :goto_0
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 19
    :try_start_0
    new-instance v2, Ljava/io/InputStreamReader;

    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v3, "UTF-8"

    invoke-direct {v2, v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 20
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    :goto_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    .line 24
    :cond_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 25
    invoke-virtual {v2}, Ljava/io/InputStreamReader;->close()V

    .line 26
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    .line 28
    const-string v2, "version"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 29
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setReadJsonVersion(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 31
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 32
    sget-object v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "read json exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 33
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_4

    .line 34
    :try_start_1
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/qcloud/tim/push/bean/ConfigBean;

    if-eqz v0, :cond_3

    .line 35
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setRegisterConfigBean(Lcom/tencent/qcloud/tim/push/bean/ConfigBean;)V

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_5

    .line 36
    :cond_3
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "timPushConfigsBean is null"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    .line 38
    :goto_5
    iput-boolean v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z

    .line 39
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    sget-object v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse json exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 41
    :cond_4
    iput-boolean v2, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->l:Z

    .line 42
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "jsonConfig is null"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    return-void
.end method

.method public final d(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v1, "unRegisterPush"

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b()V

    .line 4
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$20;

    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$20;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->f(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 5
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    if-nez p1, :cond_0

    .line 8
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "invalid context"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    const/4 v1, 0x0

    .line 9
    invoke-static {p2, p1, v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d()V

    .line 11
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    new-instance v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$23;

    invoke-direct {v0, p0, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$23;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {p1, v0}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;)V

    return-void

    .line 12
    :cond_1
    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public disablePostNotificationInForeground(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$8;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$8;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final e()V
    .locals 12

    .line 6
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->e(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 7
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningPlatform()J

    move-result-wide v6

    .line 8
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningScene()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const-string v0, "3"

    :goto_0
    move-object v8, v0

    goto :goto_1

    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getRunningScene()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 10
    const-string v0, "2"

    goto :goto_0

    :cond_1
    const-string v0, "1"

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->c()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->h()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x1

    move-object v1, p0

    .line 11
    invoke-virtual/range {v1 .. v11}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 12
    iget-object v0, v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->g:Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;

    if-nez v0, :cond_2

    return-void

    .line 13
    :cond_2
    new-instance v2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$24;

    invoke-direct {v2, p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$24;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)V

    invoke-virtual {v0, v2}, Lcom/tencent/qcloud/tim/push/components/StatisticDataStorage;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 2
    instance-of v0, p1, Landroid/content/Intent;

    if-nez v0, :cond_0

    .line 3
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is not Intent"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    const-string p1, "param must be Intent"

    const/4 v0, 0x0

    const v1, 0xc3500

    invoke-static {p2, v1, p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v0

    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$21;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$21;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 5

    const v0, 0xc3510

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 2
    instance-of v2, p1, Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v2, "param is null"

    invoke-static {p1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p2, v0, v2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_1
    :try_start_0
    sget-object v2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setAppLanguage :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Ljava/lang/String;)V

    .line 9
    invoke-static {p2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 10
    sget-object v2, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setAppLanguage e = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_2
    :goto_0
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v2, "param is not string"

    invoke-static {p1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {p2, v0, v2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public forceUseFCMPushChannel(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$7;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$7;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final g(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 2
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 4
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setCustomBadgeNumber :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setCustomBadgeNumber(I)V

    .line 6
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Landroid/content/Context;ILcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void

    .line 7
    :cond_1
    :goto_0
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is not int"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xc3500

    const/4 v1, 0x0

    .line 8
    invoke-static {p2, p1, v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public getRegistrationID(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final h(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 8

    const-string v0, "customConfigFile"

    const-string v1, "enableBackupChannels"

    const-string v2, "runningPlatform"

    const v3, 0xc350e

    const/4 v4, 0x0

    if-eqz p1, :cond_5

    .line 2
    instance-of v5, p1, Ljava/lang/String;

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 5
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p2, v3, v0, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_1
    :try_start_0
    sget-object v5, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "setPushConfig :"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 11
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object p1

    invoke-virtual {p1, v6, v7}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setRunningPlatform(J)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 12
    :cond_2
    :goto_0
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 13
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 14
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->enableBackupChannels(Z)V

    .line 15
    :cond_3
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 16
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a:Ljava/lang/String;

    .line 17
    :cond_4
    invoke-static {p2, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 18
    :goto_1
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setPushConfig e = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v3, p1, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 20
    :cond_5
    :goto_2
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is not string"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-static {p2, v3, v0, v4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 11

    const/4 v1, 0x0

    const v2, 0xc350a

    if-eqz p1, :cond_4

    .line 2
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is null"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p2, v2, v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->d()V

    .line 8
    invoke-virtual {p0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->e()V

    .line 9
    const-string v0, "set token"

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->b(ILjava/lang/String;)V

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    const-string p1, "businessID"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 12
    const-string p1, "token"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 13
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setPushToken businessId = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", tokenLength = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v9, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    cmp-long v0, v7, v3

    if-gtz v0, :cond_3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid businessId "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    .line 15
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->h:Lcom/tencent/qcloud/tim/push/components/TokenLogic;

    invoke-virtual {p1, v9}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b(Ljava/lang/String;)V

    .line 16
    const-string v6, ""

    new-instance v10, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$22;

    invoke-direct {v10, p0, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$22;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    const/4 v5, 0x0

    move-object v4, p0

    invoke-virtual/range {v4 .. v10}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(ILjava/lang/String;JLjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 17
    :goto_2
    sget-object v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setPushToken e = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v2, p1, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 19
    :cond_4
    :goto_3
    sget-object p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->p:Ljava/lang/String;

    const-string v0, "param is not string"

    invoke-static {p1, v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {p2, v2, v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public registerPush(Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$1;

    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move v4, p2

    .line 10
    move-object v5, p3

    .line 11
    move-object v6, p4

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$1;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Landroid/content/Context;ILjava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 18
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public removePushListener(Lcom/tencent/qcloud/tim/push/TIMPushListener;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$6;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$6;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public setRegistrationID(Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$4;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$4;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public unRegisterPush(Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$2;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$2;-><init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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
