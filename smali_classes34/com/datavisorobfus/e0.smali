.class public Lcom/datavisorobfus/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/util/Map;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "empty"

    .line 5
    .line 6
    const-string v2, "no_permission"

    .line 7
    .line 8
    const-string v3, "exception"

    .line 9
    .line 10
    const-string v4, "dv_longitude"

    .line 11
    .line 12
    const-string v5, "dv_latitude"

    .line 13
    .line 14
    new-instance v6, Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    .line 20
    const/4 v8, 0x1

    .line 21
    .line 22
    .line 23
    invoke-direct {v7, v8}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 24
    .line 25
    new-instance v9, Landroid/os/HandlerThread;

    .line 26
    .line 27
    const-string v10, "dv-location-thread"

    .line 28
    .line 29
    .line 30
    invoke-direct {v9, v10}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Thread;->start()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v9}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    move-result-object v9

    .line 38
    .line 39
    :try_start_0
    const-string v10, "android.permission.ACCESS_COARSE_LOCATION"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v10}, Lcom/datavisorobfus/r;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 43
    move-result v10

    .line 44
    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    const-string v10, "android.permission.ACCESS_FINE_LOCATION"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v10}, Lcom/datavisorobfus/r;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 51
    move-result v10

    .line 52
    .line 53
    if-eqz v10, :cond_0

    .line 54
    .line 55
    const-string v0, "no location permission"

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v6, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-interface {v6, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v9}, Landroid/os/Looper;->quitSafely()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 71
    return-object v6

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    .line 74
    move-object/from16 v17, v9

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_0
    const-string v2, "location"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    move-result-object v0

    .line 82
    move-object v11, v0

    .line 83
    .line 84
    check-cast v11, Landroid/location/LocationManager;

    .line 85
    .line 86
    new-instance v0, Landroid/location/Criteria;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0}, Landroid/location/Criteria;-><init>()V

    .line 90
    const/4 v2, 0x2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v8}, Landroid/location/Criteria;->setPowerRequirement(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v11, v0, v8}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    .line 100
    move-result-object v12

    .line 101
    .line 102
    new-instance v2, Lcom/datavisorobfus/e0$a;

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, v6, v11, v7, v9}, Lcom/datavisorobfus/e0$a;-><init>(Ljava/util/Map;Landroid/location/LocationManager;Ljava/util/concurrent/CountDownLatch;Landroid/os/Looper;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    const-wide/16 v13, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    .line 110
    move-object/from16 v16, v2

    .line 111
    .line 112
    move-object/from16 v17, v9

    .line 113
    .line 114
    .line 115
    :try_start_1
    invoke-virtual/range {v11 .. v17}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    goto :goto_0

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    goto :goto_1

    .line 119
    :catch_0
    move-exception v0

    .line 120
    .line 121
    move-object/from16 v2, v16

    .line 122
    .line 123
    .line 124
    :try_start_2
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v6, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v17 .. v17}, Landroid/os/Looper;->quitSafely()V

    .line 137
    .line 138
    :goto_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 139
    .line 140
    const-wide/16 v8, 0xbb8

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7, v8, v9, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 144
    move-result v0

    .line 145
    .line 146
    if-nez v0, :cond_1

    .line 147
    .line 148
    const-string v0, "get location overtime"

    .line 149
    .line 150
    .line 151
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-interface {v6, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    .line 159
    .line 160
    :try_start_3
    invoke-virtual {v11, v2}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 161
    .line 162
    .line 163
    :catchall_2
    :try_start_4
    invoke-virtual/range {v17 .. v17}, Landroid/os/Looper;->quitSafely()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 164
    :cond_1
    return-object v6

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v6, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v17 .. v17}, Landroid/os/Looper;->quitSafely()V

    .line 177
    return-object v6
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
.end method
