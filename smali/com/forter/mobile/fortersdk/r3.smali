.class public final Lcom/forter/mobile/fortersdk/r3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/v3;


# instance fields
.field public a:J

.field public b:Lcom/forter/mobile/fortersdk/models/TrackType;

.field public c:Ljava/lang/String;

.field public d:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(JLcom/forter/mobile/fortersdk/models/TrackType;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/forter/mobile/fortersdk/r3;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/forter/mobile/fortersdk/r3;->d:Lorg/json/JSONObject;

    iput-wide p1, p0, Lcom/forter/mobile/fortersdk/r3;->a:J

    iput-object p3, p0, Lcom/forter/mobile/fortersdk/r3;->b:Lcom/forter/mobile/fortersdk/models/TrackType;

    return-void
.end method

.method public constructor <init>(JLcom/forter/mobile/fortersdk/models/TrackType;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/forter/mobile/fortersdk/r3;->a:J

    iput-object p3, p0, Lcom/forter/mobile/fortersdk/r3;->b:Lcom/forter/mobile/fortersdk/models/TrackType;

    iput-object p4, p0, Lcom/forter/mobile/fortersdk/r3;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/forter/mobile/fortersdk/r3;->d:Lorg/json/JSONObject;

    return-void
.end method

.method public constructor <init>(Lcom/forter/mobile/fortersdk/models/TrackType;)V
    .locals 2

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p1}, Lcom/forter/mobile/fortersdk/r3;-><init>(JLcom/forter/mobile/fortersdk/models/TrackType;)V

    return-void
.end method

.method public constructor <init>(Lcom/forter/mobile/fortersdk/models/TrackType;Ljava/lang/String;)V
    .locals 2

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/forter/mobile/fortersdk/r3;-><init>(JLcom/forter/mobile/fortersdk/models/TrackType;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "unique_ids"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "trackType"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "trackInfo"

    .line 10
    .line 11
    new-instance v3, Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    :try_start_0
    const-string v4, "app/track"

    .line 17
    .line 18
    .line 19
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    new-instance v5, Lcom/forter/mobile/fortersdk/f;

    .line 23
    .line 24
    .line 25
    invoke-direct {v5, v4}, Lcom/forter/mobile/fortersdk/f;-><init>(Lcom/forter/mobile/fortersdk/g;)V

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/forter/mobile/fortersdk/g;->a()Z

    .line 31
    move-result v4

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    goto :goto_2

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v5, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 38
    move-result v4

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    iget-object v4, p0, Lcom/forter/mobile/fortersdk/r3;->d:Lorg/json/JSONObject;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iget-object v6, p0, Lcom/forter/mobile/fortersdk/r3;->c:Ljava/lang/String;

    .line 47
    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_1
    if-nez v4, :cond_2

    .line 55
    .line 56
    iget-object v4, p0, Lcom/forter/mobile/fortersdk/r3;->c:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_1
    invoke-virtual {v5, v1}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/r3;->b:Lcom/forter/mobile/fortersdk/models/TrackType;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {v5, v0}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/r3;->b:Lcom/forter/mobile/fortersdk/models/TrackType;

    .line 79
    .line 80
    sget-object v2, Lcom/forter/mobile/fortersdk/models/TrackType;->ACCOUNT_ID_ADDED:Lcom/forter/mobile/fortersdk/models/TrackType;

    .line 81
    .line 82
    if-ne v1, v2, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lcom/forter/mobile/fortersdk/x3;->a()Lorg/json/JSONArray;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :catchall_0
    :cond_4
    :goto_2
    return-object v3
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
    const-string v0, "app/track"

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
    iget-wide v0, p0, Lcom/forter/mobile/fortersdk/r3;->a:J

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
    const-string v2, "app/track"

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
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/r3;->a()Lorg/json/JSONObject;

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
