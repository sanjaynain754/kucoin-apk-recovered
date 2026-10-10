.class public final Lcom/forter/mobile/fortersdk/l3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/v3;


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/forter/mobile/fortersdk/l3;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/forter/mobile/fortersdk/l3;-><init>(JLorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(JLorg/json/JSONObject;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/forter/mobile/fortersdk/l3;->b:J

    iput-object p3, p0, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

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
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

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
    const-string v2, "app/location"

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
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 2
    const-string v0, "app/location"

    return-object v0
.end method

.method public final b(Lcom/forter/mobile/fortersdk/f;Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "isMockedLocationAllowed"

    const-string v1, "locationAccuracy"

    const-string v2, "mockLocationAppsCount"

    :try_start_0
    invoke-virtual {p1, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-static {p2}, Lcom/forter/mobile/fortersdk/o0;->c(Landroid/content/Context;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1, v1}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-static {p2}, Lcom/forter/mobile/fortersdk/o0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    invoke-virtual {p1, v0}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-static {p2}, Lcom/forter/mobile/fortersdk/o0;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-void

    :goto_1
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    move-result-object p2

    const-string v0, "app/location"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Failed generating event %s\'s general properties"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/forter/mobile/fortersdk/l3;->b:J

    return-wide v0
.end method

.method public final c(Landroid/content/Context;Landroid/location/Location;)Z
    .locals 20
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "additionalInfo"

    const-string/jumbo v3, "zipcode"

    const-string v4, "country"

    const-string v5, "city"

    const-string v6, "isMocked"

    const-string v7, "latitude"

    const-string v8, "longitude"

    const-string v9, "app/location"

    const/4 v10, 0x1

    :try_start_0
    invoke-static {v9}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    move-result-object v11

    new-instance v12, Lcom/forter/mobile/fortersdk/f;

    invoke-direct {v12, v11}, Lcom/forter/mobile/fortersdk/f;-><init>(Lcom/forter/mobile/fortersdk/g;)V

    const/4 v13, 0x0

    if-eqz v11, :cond_0

    iget-object v11, v11, Lcom/forter/mobile/fortersdk/g;->c:Ljava/lang/String;

    invoke-static {v11}, Lcom/forter/mobile/fortersdk/b3;->f(Ljava/lang/String;)Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v11, :cond_0

    return v13

    :catchall_0
    move-exception v0

    move/from16 v16, v10

    goto/16 :goto_9

    :cond_0
    if-nez p2, :cond_1

    return v10

    :cond_1
    :try_start_1
    invoke-virtual {v12, v8}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2

    iget-object v11, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v8, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catchall_1
    move-exception v0

    move/from16 v16, v10

    goto/16 :goto_8

    :cond_2
    :goto_0
    invoke-virtual {v12, v7}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v7, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v7, "geocodeing"

    invoke-virtual {v12, v7}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v8, 0x0

    if-eqz v7, :cond_4

    :try_start_2
    new-instance v14, Landroid/location/Geocoder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v14, v0, v7}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v15

    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v17

    const/16 v19, 0x1

    invoke-virtual/range {v14 .. v19}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/forter/mobile/fortersdk/f3;->q(Ljava/util/Collection;)Z

    move-result v11

    if-nez v11, :cond_4

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/location/Address;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Landroid/location/Address;->getLocality()Ljava/lang/String;

    move-result-object v11
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v7}, Landroid/location/Address;->getCountryName()Ljava/lang/String;

    move-result-object v13
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v7}, Landroid/location/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v14
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v7}, Landroid/location/Address;->getThoroughfare()Ljava/lang/String;

    move-result-object v15
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v7}, Landroid/location/Address;->getSubThoroughfare()Ljava/lang/String;

    move-result-object v8
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catch_0
    move-object v15, v8

    goto :goto_3

    :catch_1
    move-object v14, v8

    :goto_1
    move-object v15, v14

    goto :goto_3

    :catch_2
    move-object v13, v8

    :goto_2
    move-object v14, v13

    goto :goto_1

    :catch_3
    move-object v11, v8

    move-object v13, v11

    goto :goto_2

    :catch_4
    :goto_3
    move-object v7, v8

    move-object v8, v11

    goto :goto_4

    :cond_4
    move-object v7, v8

    move-object v13, v7

    move-object v14, v13

    move-object v15, v14

    :goto_4
    :try_start_7
    invoke-virtual {v12, v6}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v11, :cond_5

    :try_start_8
    invoke-virtual/range {p2 .. p2}, Landroid/location/Location;->isFromMockProvider()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_5
    move/from16 v16, v10

    goto :goto_6

    :catchall_2
    :try_start_9
    const-string v11, "FAILURE"
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_5

    :goto_6
    :try_start_a
    iget-object v10, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual {v10, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_8

    :cond_5
    move/from16 v16, v10

    :goto_7
    invoke-virtual {v12, v5}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual {v6, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    invoke-virtual {v12, v4}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual {v5, v4, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    invoke-virtual {v12, v3}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    invoke-virtual {v4, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    invoke-virtual {v12, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v3, v1, Lcom/forter/mobile/fortersdk/l3;->a:Lorg/json/JSONObject;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v5, "%s|%s"

    filled-new-array {v15, v7}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    invoke-virtual {v1, v12, v0}, Lcom/forter/mobile/fortersdk/l3;->b(Lcom/forter/mobile/fortersdk/f;Landroid/content/Context;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_a

    :goto_8
    :try_start_b
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    move-result-object v2

    const-string v3, "ForterClient::onLocationChanged() failed with exception: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/forter/mobile/fortersdk/b;->f(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception v0

    :goto_9
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    move-result-object v2

    const-string v3, "Failed generating event %s"

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_a
    return v16
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
    const-string v2, "app/location"

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
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/l3;->a()Lorg/json/JSONObject;

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
.end method
