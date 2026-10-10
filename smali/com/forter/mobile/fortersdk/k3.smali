.class public final Lcom/forter/mobile/fortersdk/k3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/u3;


# instance fields
.field public a:J

.field public final b:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/forter/mobile/fortersdk/k3;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/forter/mobile/fortersdk/k3;-><init>(JLorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(JLorg/json/JSONObject;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/forter/mobile/fortersdk/k3;->a:J

    iput-object p3, p0, Lcom/forter/mobile/fortersdk/k3;->b:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/k3;->b:Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object v0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "app/files"

    .line 20
    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    const-string v3, "Failed converting to JSON event %s"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const/4 v0, 0x0

    .line 38
    return-object v0
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
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "app/files"

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final c()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/forter/mobile/fortersdk/k3;->a:J

    .line 3
    return-wide v0
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
.end method

.method public final d()Lorg/json/JSONObject;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string/jumbo v1, "type"

    .line 9
    .line 10
    const-string v2, "app/files"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    .line 15
    const-string v1, "data"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/k3;->a()Lorg/json/JSONObject;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->a()V

    .line 27
    return-object v0
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
.end method

.method public final e()Lorg/json/JSONObject;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/k3;->d()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public final f()Z
    .locals 11

    .line 1
    .line 2
    const-string v0, "app/files"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/b0;->b(Ljava/lang/String;)[Lcom/forter/mobile/fortersdk/h;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    const/4 v3, 0x1

    .line 11
    :try_start_0
    array-length v4, v1

    .line 12
    move v5, v2

    .line 13
    .line 14
    :goto_0
    if-ge v5, v4, :cond_2

    .line 15
    .line 16
    aget-object v6, v1, v5

    .line 17
    .line 18
    iget-object v7, v6, Lcom/forter/mobile/fortersdk/h;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, v6, Lcom/forter/mobile/fortersdk/h;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    :try_start_1
    new-instance v8, Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    invoke-direct {v8, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 26
    move v6, v2

    .line 27
    .line 28
    .line 29
    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 30
    move-result v9

    .line 31
    .line 32
    if-ge v6, v9, :cond_1

    .line 33
    const/4 v9, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v8, v6, v9}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v9

    .line 38
    .line 39
    .line 40
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    move-result v10

    .line 42
    .line 43
    if-nez v10, :cond_0

    .line 44
    .line 45
    new-instance v10, Ljava/io/File;

    .line 46
    .line 47
    .line 48
    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 52
    move-result v9

    .line 53
    .line 54
    if-eqz v9, :cond_0

    .line 55
    move v6, v3

    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    goto :goto_3

    .line 59
    .line 60
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v6, v2

    .line 63
    .line 64
    :goto_2
    iget-object v8, p0, Lcom/forter/mobile/fortersdk/k3;->b:Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    :catch_0
    add-int/lit8 v5, v5, 0x1

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :goto_3
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    const-string v4, "Failed generating event %s"

    .line 77
    .line 78
    .line 79
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v0, v1}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_2
    return v3

    .line 93
    :cond_3
    return v2
    .line 94
    .line 95
.end method
