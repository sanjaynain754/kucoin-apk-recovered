.class public Lcom/tencent/thumbplayer/tcmedia/c/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/utils/f$a;
.implements Lcom/tencent/thumbplayer/tcmedia/utils/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/c/i$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/thumbplayer/tcmedia/c/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->a:I

    const-string v1, ""

    iput-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->b:Ljava/lang/String;

    iput v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->c:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_0
    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/utils/f;->a(Lcom/tencent/thumbplayer/tcmedia/utils/f$a;)V

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/i;->a()Lcom/tencent/thumbplayer/tcmedia/utils/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/utils/i;->a(Lcom/tencent/thumbplayer/tcmedia/utils/i$b;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/thumbplayer/tcmedia/c/i$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/thumbplayer/tcmedia/c/i;-><init>()V

    return-void
.end method

.method public static a()Lcom/tencent/thumbplayer/tcmedia/c/i;
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/c/i$a;->a()Lcom/tencent/thumbplayer/tcmedia/c/i;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;
    .locals 7

    .line 3
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getPlatform()I

    move-result v1

    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getGuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyCacheDir()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyDataDir()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyConfigDir()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Ljava/lang/String;I)V
    .locals 4

    .line 7
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->b:Ljava/lang/String;

    iput p2, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->c:I

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a()Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v2

    const-string v3, "carrier_pesudo_code"

    invoke-interface {v2, v3, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a()Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "carrier_pesudo_state"

    invoke-interface {v1, v3, v2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b(Z)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "EnableReport"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "TPProxyGlobalManager"

    invoke-static {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, ""

    return-object p1
.end method

.method private b(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    invoke-interface {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(J)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    const-string v1, "MaxUseMemoryLevel1MB"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 11
    .line 12
    const-string v1, "MaxUseMemoryLevel2MB"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 16
    .line 17
    const-string v1, "MaxUseMemoryMB"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p1

    .line 26
    :catch_0
    move-exception p1

    .line 27
    .line 28
    const-string p2, "TPProxyGlobalManager"

    .line 29
    .line 30
    .line 31
    invoke-static {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    const-string p1, ""

    .line 34
    return-object p1
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
.end method


# virtual methods
.method public a(I)Lcom/tencent/thumbplayer/tcmedia/c/b;
    .locals 8

    .line 1
    const-string v0, "proxy_config"

    const-string v1, "TPProxyGlobalManager"

    const/4 v2, 0x0

    if-gez p1, :cond_0

    return-object v2

    :cond_0
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    return-object p1

    :cond_1
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadProxyFactory;->getTPDownloadProxy(I)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v3

    if-eqz v3, :cond_8

    :try_start_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->getAppContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->getAppContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/c/i;->a(Landroid/content/Context;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->init(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;)I

    move-result v4

    if-gez v4, :cond_2

    const-string p1, "downloadProxy init failed with status:"

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_2
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/c/i$1;

    invoke-direct {v4, p0}, Lcom/tencent/thumbplayer/tcmedia/c/i$1;-><init>(Lcom/tencent/thumbplayer/tcmedia/c/i;)V

    invoke-interface {v3, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setLogListener(Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDLProxyLogListener;)V

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/utils/i;->c()I

    move-result v4

    const/16 v5, 0xa

    const/4 v6, 0x1

    if-ne v4, v6, :cond_3

    invoke-interface {v3, v6}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    :goto_0
    invoke-interface {v3, v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    goto :goto_1

    :cond_3
    const/4 v6, 0x2

    if-ne v4, v6, :cond_4

    invoke-interface {v3, v6}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    const/16 v4, 0x9

    invoke-interface {v3, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    goto :goto_1

    :cond_4
    const/4 v7, 0x3

    if-ne v4, v7, :cond_5

    invoke-interface {v3, v6}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    goto :goto_0

    :cond_5
    :goto_1
    iget v4, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->a:I

    invoke-interface {v3, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->pushEvent(I)V

    const-string v4, "carrier_pesudo_code"

    iget-object v5, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->b:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "carrier_pesudo_state"

    iget v5, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->isDataReportEnable()Z

    move-result v4

    invoke-direct {p0, v4}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(Z)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyMaxUseMemoryMB()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_6

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyMaxUseMemoryMB()J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/c/i;->c(J)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_6

    invoke-interface {v3, v0, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyMaxStorageSizeMB()J

    move-result-wide v4

    cmp-long v0, v4, v6

    if-lez v0, :cond_7

    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->getProxyMaxStorageSizeMB()J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setMaxStorageSizeMB(J)V

    :cond_7
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/c/j;

    invoke-direct {v0, v3}, Lcom/tencent/thumbplayer/tcmedia/c/j;-><init>(Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;)V

    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "getPlayerProxy, init proxy succeeded, serviceType:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :goto_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "init proxy failed:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    return-object v2
.end method

.method public a(IIII)V
    .locals 0

    .line 4
    const/16 p1, 0xa

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    :goto_0
    invoke-direct {p0, p3}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(I)V

    :goto_1
    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(I)V

    return-void

    :cond_0
    const/4 p3, 0x2

    if-ne p2, p3, :cond_1

    invoke-direct {p0, p3}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(I)V

    const/16 p1, 0x9

    goto :goto_1

    :cond_1
    const/4 p4, 0x3

    if-ne p2, p4, :cond_2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(IIILjava/lang/Object;)V
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onEvent eventId: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", arg1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", arg2: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", object"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "TPProxyGlobalManager"

    invoke-static {v0, p3}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p4, Ljava/lang/String;

    invoke-direct {p0, p4, p2}, Lcom/tencent/thumbplayer/tcmedia/c/i;->a(Ljava/lang/String;I)V

    return-void

    :pswitch_1
    const/16 p1, 0xe

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->a:I

    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(I)V

    return-void

    :pswitch_2
    const/16 p1, 0xd

    iput p1, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->a:I

    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x186a1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(J)V
    .locals 4

    .line 6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a()Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v1

    if-eqz v1, :cond_0

    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-lez v2, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setMaxStorageSizeMB(J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Z)V
    .locals 4

    .line 8
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a()Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v1

    const-string v2, "proxy_config"

    invoke-direct {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/c/i;->b(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/c/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/c/b;

    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/c/b;->a()Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    move-result-object v1

    const-string v2, "proxy_config"

    invoke-direct {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/c/i;->c(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setUserData(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
