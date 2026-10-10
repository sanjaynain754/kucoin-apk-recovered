.class public Lcom/tencent/qcloud/tim/push/components/TokenLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;,
        Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String; = "TokenLogic"

.field public static final i:I = 0x2710

.field public static final j:I = 0xbb8


# instance fields
.field public a:Landroid/content/Context;

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;",
            ">;"
        }
    .end annotation
.end field


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
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    .line 27
    return-void
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

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/components/TokenLogic;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/qcloud/tim/push/components/TokenLogic;IIILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(IIILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final a(IIILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 65
    invoke-static {p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object p1

    const p2, 0xc3508

    if-ne p3, p2, :cond_0

    .line 66
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " token timeout"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 67
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v0, 0x78

    if-gt p2, v0, :cond_1

    return-object p4

    .line 68
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " token failed code="

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public final a(IIILjava/lang/String;Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    .line 71
    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    if-eqz v5, :cond_0

    .line 72
    invoke-virtual {v5}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->b()V

    .line 73
    iget-object v5, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 v5, 0x2

    if-nez v3, :cond_3

    .line 74
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 75
    sget-object v3, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "request success, channel = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", tokenState = valid"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->setPushChannelId(I)V

    if-eq v1, v5, :cond_1

    .line 77
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object v6

    int-to-long v9, v2

    iget-object v13, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 78
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->c()Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->h()Ljava/lang/String;

    move-result-object v15

    const-wide/16 v11, 0xd

    const/16 v16, 0x0

    const-wide/16 v7, 0x2

    .line 79
    invoke-virtual/range {v6 .. v16}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto :goto_0

    :cond_1
    const-string v3, ""

    if-ne v1, v5, :cond_2

    .line 80
    iput-object v3, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 81
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object v6

    int-to-long v9, v2

    iget-object v13, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 82
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->c()Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->h()Ljava/lang/String;

    move-result-object v15

    const-wide/16 v11, 0xc

    const/16 v16, 0x0

    const-wide/16 v7, 0x2

    .line 83
    invoke-virtual/range {v6 .. v16}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    goto :goto_0

    .line 84
    :cond_2
    iput-object v3, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 85
    :goto_0
    invoke-virtual {v0, v2, v4}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(ILjava/lang/String;)V

    return-void

    .line 86
    :cond_3
    invoke-virtual/range {p0 .. p4}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b(IIILjava/lang/String;)V

    const/4 v6, 0x1

    const/16 v7, 0x2710

    if-ne v1, v6, :cond_4

    .line 87
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    const-string v2, "request built after specified failed"

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->i()I

    move-result v1

    .line 89
    new-instance v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    invoke-direct {v2, v0, v1, v7, v5}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenLogic;III)V

    .line 90
    iget-object v3, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    invoke-virtual {v2}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->a()V

    return-void

    :cond_4
    const/4 v6, 0x4

    const/4 v8, 0x0

    if-ne v1, v5, :cond_7

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "orginChannel:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "|errorCode:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "|errorMsg:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 93
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->c()Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    move-result-object v9

    iget-object v1, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 94
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->c()Ljava/lang/String;

    move-result-object v17

    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->h()Ljava/lang/String;

    move-result-object v18

    const-wide/16 v14, 0xb

    const/16 v19, 0x0

    const-wide/16 v10, 0x2

    const-wide/16 v12, 0x0

    move-object/from16 v16, v1

    .line 95
    invoke-virtual/range {v9 .. v19}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 96
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->isBackupChannelsEnabled()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 97
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 98
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    sget-object v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    const-string v3, "built-in channel failed, backup channels enabled, start detecting other channels"

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Ljava/util/Set;)V

    return-void

    :cond_5
    const/16 v1, 0x7d2

    if-eq v1, v2, :cond_6

    .line 102
    sget-object v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    const-string v3, "request fcm after built failed"

    invoke-static {v2, v3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    new-instance v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    invoke-direct {v2, v0, v1, v7, v6}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenLogic;III)V

    .line 104
    iget-object v3, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    invoke-virtual {v2}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->a()V

    return-void

    .line 106
    :cond_6
    const-string v1, "Built-in channel token failed"

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc3505

    .line 107
    invoke-virtual {v0, v2, v1, v8}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    if-ne v1, v6, :cond_8

    .line 108
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    const-string v2, "request fcm failed"

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v1, "FCM token failed"

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc3506

    .line 110
    invoke-virtual {v0, v2, v1, v8}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 111
    :cond_8
    iget-object v1, v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 112
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    const-string v2, "detectChannels all failed"

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v1, "All backup channels failed"

    invoke-virtual {v0, v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc3507

    .line 114
    invoke-virtual {v0, v2, v1, v8}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 115
    :cond_9
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notifyRequestTokenFailed channelId = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 6

    .line 21
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->c:Ljava/lang/String;

    .line 22
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 23
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    if-eqz v1, :cond_0

    .line 24
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->b()V

    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 26
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, ""

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;

    .line 27
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 28
    const-string v5, "pushTokenKey"

    invoke-virtual {v4, v5, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v5, "TIMPushBrandIdKey"

    invoke-virtual {v4, v5, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    invoke-interface {v1, v2, v3, v4}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;->a(ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 32
    iput-boolean v2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    .line 33
    iput-object v3, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 34
    iput-object v3, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    return-void
.end method

.method public final a(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 35
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ", errMsg = "

    const-string v2, "requestPushToken final failed, errCode = "

    if-nez v0, :cond_0

    .line 36
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", builtInChannelDetail = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_0
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    :goto_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 39
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    if-eqz v1, :cond_1

    .line 40
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->b()V

    goto :goto_1

    .line 41
    :cond_2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 42
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;

    .line 43
    invoke-interface {v1, p1, p2, p3}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;->a(ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 44
    :cond_3
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    .line 46
    const-string p1, ""

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a:Landroid/content/Context;

    return-void
.end method

.method public a(Lcom/tencent/qcloud/tim/push/components/TokenLogic$OnRequestTokenComplete;)V
    .locals 5

    .line 5
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    if-eqz p1, :cond_1

    :goto_0
    return-void

    .line 8
    :cond_1
    const-string p1, ""

    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 9
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    .line 11
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    move-result v0

    .line 12
    invoke-static {}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->i()I

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x2

    .line 13
    :goto_1
    sget-object v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestPushToken start, configuredChannel = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", deviceChannel = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-static {v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelType = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-static {p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", backupChannelsEnabled = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->isBackupChannelsEnabled()Z

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-static {v2, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    new-instance v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    const/16 v2, 0x2710

    invoke-direct {v1, p0, v0, v2, p1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenLogic;III)V

    .line 19
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->a()V

    return-void
.end method

.method public final a(Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 48
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "detectChannels start, excludeChannelIDs = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/16 v1, 0x7d2

    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d0

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d1

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d6

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d3

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d4

    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x7d5

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 57
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 60
    new-instance v2, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xbb8

    const/4 v5, 0x3

    invoke-direct {v2, p0, v3, v4, v5}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;-><init>(Lcom/tencent/qcloud/tim/push/components/TokenLogic;III)V

    .line 61
    iget-object v3, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 63
    iget-object v1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    if-eqz v0, :cond_2

    .line 64
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->a()V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->c:Ljava/lang/String;

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->b:Z

    .line 3
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 6
    iget-object v2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic$RequestTask;->b()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final b(IIILjava/lang/String;)V
    .locals 2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failedChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|channelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "|errorMessage="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(IIILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    iget-object p2, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "request channel failed, "

    if-eqz p2, :cond_1

    .line 18
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    .line 19
    sget-object p2, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", recordedAsRootCause = "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 20
    :cond_1
    sget-object p2, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->h:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", currentChannelMsg = "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", keepingRootCause = "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->d:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->e:Ljava/lang/String;

    .line 12
    invoke-static {}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getInstance()Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/config/TIMPushConfig;->getPushChannelId()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/tencent/qcloud/tim/push/components/TokenLogic;->a(ILjava/lang/String;)V

    return-void
.end method
