.class public Lcom/datavisorobfus/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/datavisorobfus/x;


# instance fields
.field private a:Landroid/content/Context;

.field private b:J

.field private c:Lorg/json/JSONObject;


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
    .line 17
    .line 18
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/x;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 11
    .line 12
    iput-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lcom/datavisorobfus/x;->a:Landroid/content/Context;

    .line 17
    .line 18
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 19
    .line 20
    new-instance p1, Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string v0, "HookDetect initialization error: mContext is null."

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1
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
.end method

.method public static a(Landroid/content/Context;)Lcom/datavisorobfus/x;
    .locals 2

    .line 1
    sget-object v0, Lcom/datavisorobfus/x;->d:Lcom/datavisorobfus/x;

    if-nez v0, :cond_1

    const-class v0, Lcom/datavisorobfus/x;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/x;->d:Lcom/datavisorobfus/x;

    if-nez v1, :cond_0

    new-instance v1, Lcom/datavisorobfus/x;

    invoke-direct {v1, p0}, Lcom/datavisorobfus/x;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/datavisorobfus/x;->d:Lcom/datavisorobfus/x;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/datavisorobfus/x;->d:Lcom/datavisorobfus/x;

    return-object p0
.end method

.method private a()V
    .locals 10

    .line 3
    const-string v0, "P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regshtrfpa8="

    :try_start_0
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_5

    aget-object v5, v1, v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v7, "xposed"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v7, "."

    if-eqz v6, :cond_0

    :try_start_2
    iget-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v1, "M5GRwkvIpsMEaIRxA+oN"

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "OJGTh3nSo9IAWZAwGeEd8itezr6nHTwlROOgT/gLvd3Stg=="

    invoke-static {v8}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v8, "M5GRwkvIpsMEY4F8A/sb9i1V"

    if-eqz v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x2

    if-ne v4, v6, :cond_1

    :try_start_3
    iget-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    invoke-static {v8}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AYeZxmzZjs4GRNpzEeYHyDpRw77sFhB/afOkRQ=="

    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    const-string v9, "OJGTh2vdstIGW9ptBe0a4ytR27enPxwvLA=="

    invoke-static {v9}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    const-string v9, "invoked"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    invoke-static {v8}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "main"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v1, "M5GRwkvIpsMEaIRxA+oN1StZy7Xs"

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "M5+QzXTZj88AW5F6Peod/zZU"

    invoke-static {v8}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v0, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v1, "M5GRwkvIpsMEaIRxA+oN3zhey77s"

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-wide v0, p0, Lcom/datavisorobfus/x;->b:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/datavisorobfus/x;->b:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :catchall_1
    :cond_5
    :goto_4
    return-void
.end method

.method private a(Lorg/json/JSONArray;)V
    .locals 6

    const/4 v0, 0x0

    .line 4
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/datavisorobfus/v;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/datavisorobfus/x;->b:J

    const-wide/16 v4, 0x20

    or-long/2addr v2, v4

    iput-wide v2, p0, Lcom/datavisorobfus/x;->b:J

    iget-object p1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v0, "M5GRwl7Vq8U="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private a(Lorg/json/JSONArray;Z)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 5
    const-string p2, "H6ik7UfoqtAwYIZxE9A68jVW8J/oAjw="

    :goto_0
    invoke-static {p2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalGet(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_0
    const-string p2, "H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"

    goto :goto_0

    :goto_1
    invoke-static {p2}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_4

    :cond_1
    :goto_2
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide p1, p0, Lcom/datavisorobfus/x;->b:J

    const-wide/16 v2, 0x2

    or-long/2addr p1, v2

    iput-wide p1, p0, Lcom/datavisorobfus/x;->b:J

    iget-object p1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string p2, "M5GRwkjOqMMKQ4c="

    invoke-static {p2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :goto_3
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    return-void
.end method

.method private b()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/x;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MAIN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    const-string v4, "I46R2n3YqskBRpFsA+YG+Q=="

    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    const-wide/16 v5, 0x40

    or-long/2addr v3, v5

    iput-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v3, "I46R2n3Yis8LRZh7"

    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method private b(Lorg/json/JSONArray;)V
    .locals 6

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/x;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    :try_start_2
    iget-wide v0, p0, Lcom/datavisorobfus/x;->b:J

    const-wide/16 v4, 0x1

    or-long/2addr v0, v4

    iput-wide v0, p0, Lcom/datavisorobfus/x;->b:J

    iget-object p1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    const-string v0, "M5GRwkjdpMsOV5E="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :goto_2
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_1
    :goto_3
    return-void
.end method

.method private c()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "I46R2n3YhdIGVJN7NOod8jpExr3n"

    .line 3
    .line 4
    const-wide/16 v1, 0x10

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 8
    move-result-object v3

    .line 9
    .line 10
    const-string v4, "P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regshtrfpa8="

    .line 11
    .line 12
    .line 13
    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 24
    or-long/2addr v1, v3

    .line 25
    .line 26
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 27
    .line 28
    :try_start_1
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-string v2, "instantiated_successfully"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    return-void

    .line 39
    .line 40
    :catch_0
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 41
    or-long/2addr v1, v3

    .line 42
    .line 43
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 44
    .line 45
    :try_start_2
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v2, "IllegalAccessException_found"

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :catch_1
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 58
    or-long/2addr v1, v3

    .line 59
    .line 60
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 61
    .line 62
    :try_start_3
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    const-string v2, "InstantiationException_found"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    goto :goto_0

    .line 70
    :catch_2
    :catchall_0
    :goto_1
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private d()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "I46R2n3Yj8UDQJFsNOod8jpExr3n"

    .line 3
    .line 4
    const-wide/16 v1, 0x8

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 8
    move-result-object v3

    .line 9
    .line 10
    const-string v4, "P5vQ23fesY4OXpBsH+YNuSFAwKHsFmFTbvW0Regmkd/Lp7j9"

    .line 11
    .line 12
    .line 13
    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 24
    or-long/2addr v1, v3

    .line 25
    .line 26
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 27
    .line 28
    :try_start_1
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-string v2, "instantiated_successfully"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    return-void

    .line 39
    .line 40
    :catch_0
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 41
    or-long/2addr v1, v3

    .line 42
    .line 43
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 44
    .line 45
    :try_start_2
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v2, "IllegalAccessException_found"

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :catch_1
    iget-wide v3, p0, Lcom/datavisorobfus/x;->b:J

    .line 58
    or-long/2addr v1, v3

    .line 59
    .line 60
    iput-wide v1, p0, Lcom/datavisorobfus/x;->b:J

    .line 61
    .line 62
    :try_start_3
    iget-object v1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    const-string v2, "InstantiationException_found"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    goto :goto_0

    .line 70
    :catch_2
    :catchall_0
    :goto_1
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public a(Z)Lorg/json/JSONObject;
    .locals 8

    .line 2
    const-string v0, "0"

    const-string v1, "detailedInfo"

    const-string/jumbo v2, "result"

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    iget-object v4, p0, Lcom/datavisorobfus/x;->a:Landroid/content/Context;

    invoke-static {v4}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    move-result-object v4

    const-string v5, "M5GRwg=="

    invoke-static {v5}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "empty"

    if-nez v4, :cond_0

    :try_start_1
    invoke-virtual {v3, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v3

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-wide/16 v6, 0x0

    iput-wide v6, p0, Lcom/datavisorobfus/x;->b:J

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    iput-object v6, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v6, "K5WZ"

    invoke-static {v6}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lez v7, :cond_1

    invoke-direct {p0, v6}, Lcom/datavisorobfus/x;->b(Lorg/json/JSONArray;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_1
    :try_start_3
    const-string v6, "K4yRyg=="

    invoke-static {v6}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lez v7, :cond_2

    invoke-direct {p0, v6, p1}, Lcom/datavisorobfus/x;->a(Lorg/json/JSONArray;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_2
    :try_start_4
    const-string p1, "PZeSzH3ErtMb"

    invoke-static {p1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lez v4, :cond_3

    invoke-direct {p0, p1}, Lcom/datavisorobfus/x;->a(Lorg/json/JSONArray;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    :cond_3
    :try_start_5
    invoke-direct {p0}, Lcom/datavisorobfus/x;->a()V

    invoke-direct {p0}, Lcom/datavisorobfus/x;->d()V

    invoke-direct {p0}, Lcom/datavisorobfus/x;->c()V

    invoke-direct {p0}, Lcom/datavisorobfus/x;->b()V

    iget-wide v6, p0, Lcom/datavisorobfus/x;->b:J

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/datavisorobfus/x;->c:Lorg/json/JSONObject;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_4
    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :goto_0
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :try_start_6
    invoke-virtual {v3, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "exception"

    invoke-virtual {v3, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :goto_1
    return-object v3
.end method
