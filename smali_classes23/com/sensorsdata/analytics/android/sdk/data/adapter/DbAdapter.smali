.class public Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;
.super Ljava/lang/Object;
.source "DbAdapter.java"


# static fields
.field private static instance:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;


# instance fields
.field private final mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

.field private mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

.field private mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/sensorsdata/analytics/android/sdk/encrypt/SensorsDataEncrypt;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getInstance(Ljava/lang/String;)Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 7
    move-result-object p2

    .line 8
    .line 9
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Lcom/sensorsdata/analytics/android/sdk/data/adapter/EncryptDataOperation;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, v0, p3}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/EncryptDataOperation;-><init>(Landroid/content/Context;Lcom/sensorsdata/analytics/android/sdk/encrypt/SensorsDataEncrypt;)V

    .line 21
    .line 22
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance p2, Lcom/sensorsdata/analytics/android/sdk/data/adapter/EventDataOperation;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    move-result-object p3

    .line 30
    .line 31
    .line 32
    invoke-direct {p2, p3}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/EventDataOperation;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 35
    .line 36
    :goto_0
    new-instance p2, Lcom/sensorsdata/analytics/android/sdk/data/adapter/PersistentDataOperation;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/PersistentDataOperation;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 46
    return-void
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
.end method

.method public static getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;
    .locals 2

    .line 4
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->instance:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    if-eqz v0, :cond_0

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The static method getInstance(Context context, String packageName) should be called before calling getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;Lcom/sensorsdata/analytics/android/sdk/encrypt/SensorsDataEncrypt;)Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;
    .locals 1

    .line 1
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->instance:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    invoke-direct {v0, p0, p1, p2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/sensorsdata/analytics/android/sdk/encrypt/SensorsDataEncrypt;)V

    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->instance:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 3
    :cond_0
    sget-object p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->instance:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    return-object p0
.end method


# virtual methods
.method public addChannelEvent(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 6
    .line 7
    const-string v1, "event_name"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo p1, "result"

    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getChannelPersistentUri()Landroid/net/Uri;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1, v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Landroid/content/ContentValues;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 35
    return-void
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
.end method

.method public addJSON(Lorg/json/JSONObject;)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I

    .line 12
    move-result p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryDataCount(Landroid/net/Uri;)I

    .line 26
    move-result p1

    .line 27
    :cond_0
    return p1
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
.end method

.method public cleanupEvents(Ljava/lang/String;)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->deleteData(Landroid/net/Uri;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryDataCount(Landroid/net/Uri;)I

    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public commitActivityCount(I)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getActivityStartCountUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitAppEndData(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppEndDataUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitAppEndTime(J)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppPausedUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitAppStartTime(J)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppStartTimeUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitFirstProcessState(Z)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getFirstProcessUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitLoginId(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getLoginIdUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitRemoteConfig(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getRemoteConfigUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitSessionIntervalTime(I)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getSessionTimeUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public commitSubProcessFlushState(Z)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getSubProcessUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "value"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->insertData(Landroid/net/Uri;Lorg/json/JSONObject;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 29
    return-void
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
.end method

.method public deleteAllEvents()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "DB_DELETE_ALL"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->deleteData(Landroid/net/Uri;Ljava/lang/String;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public generateDataString(Ljava/lang/String;I)[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getEventUri()Landroid/net/Uri;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0, p2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 12
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
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
.end method

.method public getActivityCount()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getActivityStartCountUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    array-length v2, v0

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_0
    return v1
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
.end method

.method public getAppEndData()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppEndDataUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    array-length v1, v0

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object v0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 27
    .line 28
    :cond_0
    const-string v0, ""

    .line 29
    return-object v0
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
.end method

.method public getAppEndTime()J
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppPausedUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    array-length v1, v0

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-wide v0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 31
    .line 32
    :cond_0
    const-wide/16 v0, 0x0

    .line 33
    return-wide v0
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
.end method

.method public getAppStartTime()J
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getAppStartTimeUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    array-length v1, v0

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-wide v0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 31
    .line 32
    :cond_0
    const-wide/16 v0, 0x0

    .line 33
    return-wide v0
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
.end method

.method public getLoginId()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getLoginIdUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    array-length v1, v0

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object v0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 27
    .line 28
    :cond_0
    const-string v0, ""

    .line 29
    return-object v0
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
.end method

.method public getRemoteConfig()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getRemoteConfigUri()Landroid/net/Uri;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    array-length v1, v0

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object v0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 27
    .line 28
    :cond_0
    const-string v0, ""

    .line 29
    return-object v0
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
.end method

.method public getSessionIntervalTime()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getSessionTimeUri()Landroid/net/Uri;

    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    array-length v2, v1

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    aget-object v1, v1, v0

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return v0

    .line 27
    :catch_0
    move-exception v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 31
    :cond_0
    return v0
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
.end method

.method public isFirstChannelEvent(Ljava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v1, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mTrackEventOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getChannelPersistentUri()Landroid/net/Uri;

    .line 9
    move-result-object v3

    .line 10
    .line 11
    const-string v5, "event_name = ? "

    .line 12
    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/String;

    .line 15
    move-result-object v6

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {v2 .. v7}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryDataCount(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    if-gtz p1, :cond_0

    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    return v1

    .line 27
    :catch_0
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 32
    return v1
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
.end method

.method public isFirstProcess()Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getFirstProcessUri()Landroid/net/Uri;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    array-length v2, v1

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    aget-object v1, v1, v2

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    if-ne v1, v0, :cond_0

    .line 28
    return v0

    .line 29
    :cond_0
    return v2

    .line 30
    :catch_0
    move-exception v1

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 34
    :cond_1
    return v0
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
.end method

.method public isSubProcessFlushing()Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mPersistentOperation:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->mDbParams:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbParams;->getSubProcessUri()Landroid/net/Uri;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DataOperation;->queryData(Landroid/net/Uri;I)[Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    array-length v2, v1

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    aget-object v1, v1, v2

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    if-ne v1, v0, :cond_0

    .line 28
    return v0

    .line 29
    :cond_0
    return v2

    .line 30
    :catch_0
    move-exception v1

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 34
    :cond_1
    return v0
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
.end method
