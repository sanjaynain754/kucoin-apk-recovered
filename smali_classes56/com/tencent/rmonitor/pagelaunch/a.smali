.class public Lcom/tencent/rmonitor/pagelaunch/a;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final i:Ljava/lang/String; = "PageLaunchInfo"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:Lcom/tencent/rmonitor/pagelaunch/PageLaunchMonitor$c;

.field public h:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/bugly/proguard/dh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rmonitor/pagelaunch/a;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    iput p1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->b:I

    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/rmonitor/pagelaunch/a;->a:Ljava/lang/String;

    .line 15
    return-void
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


# virtual methods
.method public final a()J
    .locals 6

    .line 9
    iget-object v0, p0, Lcom/tencent/rmonitor/pagelaunch/a;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/dh;

    .line 10
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/dh;->a()J

    move-result-wide v4

    cmp-long v4, v4, v1

    if-gez v4, :cond_0

    .line 11
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/dh;->a()J

    move-result-wide v1

    goto :goto_0

    :cond_1
    return-wide v1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/pagelaunch/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/dh;

    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p0, p2}, Lcom/tencent/rmonitor/pagelaunch/a;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/dh;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/dh;)V

    .line 4
    iget-object p1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 5

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "PageLaunchInfo"

    if-eqz v0, :cond_0

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "startSpan, spanName is empty."

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/pagelaunch/a;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "startSpan, span["

    const-string v4, "] has appended before."

    filled-new-array {v2, v3, p1, v4}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/dh;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/dh;

    .line 8
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/dh;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "PageLaunchInfo"

    if-eqz v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "endSpan, spanName is empty."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/pagelaunch/a;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "endSpan, span["

    const-string v3, "] not exist."

    filled-new-array {v1, v2, p1, v3}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/dh;->c()V

    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;
    .locals 4

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/pagelaunch/a;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/dh;

    if-eqz v2, :cond_1

    .line 4
    iget-object v3, v2, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/rmonitor/pagelaunch/a;->f:J

    return-void
.end method

.method public d()Lorg/json/JSONObject;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    :try_start_0
    const-string v1, "page_name"

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/rmonitor/pagelaunch/PageLaunchMonitor;->getInstance()Lcom/tencent/rmonitor/pagelaunch/PageLaunchMonitor;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    iget v3, p0, Lcom/tencent/rmonitor/pagelaunch/a;->b:I

    .line 14
    .line 15
    iget-object v4, p0, Lcom/tencent/rmonitor/pagelaunch/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3, v4}, Lcom/tencent/rmonitor/pagelaunch/PageLaunchMonitor;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    const-string v1, "render_state"

    .line 25
    .line 26
    iget-wide v2, p0, Lcom/tencent/rmonitor/pagelaunch/a;->e:J

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    cmp-long v2, v2, v4

    .line 31
    const/4 v3, 0x0

    .line 32
    .line 33
    if-lez v2, :cond_0

    .line 34
    const/4 v2, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v3

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 40
    .line 41
    iget-wide v1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->e:J

    .line 42
    .line 43
    iget-wide v4, p0, Lcom/tencent/rmonitor/pagelaunch/a;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    cmp-long v6, v1, v4

    .line 46
    .line 47
    const-string v7, "page_render_time"

    .line 48
    .line 49
    if-lez v6, :cond_1

    .line 50
    sub-long/2addr v1, v4

    .line 51
    .line 52
    .line 53
    :try_start_1
    invoke-virtual {v0, v7, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_4

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    .line 61
    :goto_1
    iget-wide v1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->f:J

    .line 62
    .line 63
    iget-wide v4, p0, Lcom/tencent/rmonitor/pagelaunch/a;->c:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    cmp-long v6, v1, v4

    .line 66
    .line 67
    const-string v7, "page_load_time"

    .line 68
    .line 69
    if-lez v6, :cond_2

    .line 70
    sub-long/2addr v1, v4

    .line 71
    .line 72
    .line 73
    :try_start_2
    invoke-virtual {v0, v7, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 74
    goto :goto_2

    .line 75
    .line 76
    :cond_2
    iget-wide v1, p0, Lcom/tencent/rmonitor/pagelaunch/a;->e:J

    .line 77
    .line 78
    cmp-long v6, v1, v4

    .line 79
    .line 80
    if-lez v6, :cond_3

    .line 81
    sub-long/2addr v1, v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v7, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 89
    .line 90
    :goto_2
    new-instance v1, Lorg/json/JSONArray;

    .line 91
    .line 92
    .line 93
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/tencent/rmonitor/pagelaunch/a;->a()J

    .line 97
    move-result-wide v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/tencent/rmonitor/pagelaunch/a;->b()Ljava/util/ArrayList;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    move-result v5

    .line 110
    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    move-result-object v5

    .line 116
    .line 117
    check-cast v5, Lcom/tencent/bugly/proguard/dh;

    .line 118
    .line 119
    iget-wide v6, p0, Lcom/tencent/rmonitor/pagelaunch/a;->d:J

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v2, v3, v6, v7}, Lcom/tencent/bugly/proguard/dh;->a(JJ)Lorg/json/JSONObject;

    .line 123
    move-result-object v5

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 127
    goto :goto_3

    .line 128
    .line 129
    :cond_4
    const-string v2, "spans"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    return-object v0

    .line 134
    .line 135
    :goto_4
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 136
    .line 137
    const-string v3, "PageLaunchInfo"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    return-object v0
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
.end method
