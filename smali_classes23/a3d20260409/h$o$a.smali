.class public La3d20260409/h$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h$o;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/a<",
        "Lg/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lorg/json/JSONObject;

.field public final synthetic b:La3d20260409/h$o;


# direct methods
.method public constructor <init>(La3d20260409/h$o;Lorg/json/JSONObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 3
    .line 4
    iput-object p2, p0, La3d20260409/h$o$a;->a:Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$o$a;->b()Lg/c;

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
.end method

.method public b()Lg/c;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "runtime_metrics"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 11
    .line 12
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La3d20260409/h;->l(La3d20260409/h;)Lwe0/g;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lwe0/g;->e()Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    check-cast v4, Lk/e;

    .line 47
    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    new-instance v5, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v3, "_stage_avg_cost"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lk/e;->b()F

    .line 75
    move-result v4

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 79
    move-result v4

    .line 80
    .line 81
    .line 82
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3, v4}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :cond_1
    iget-object v1, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 90
    .line 91
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, La3d20260409/h;->l(La3d20260409/h;)Lwe0/g;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lwe0/g;->a()Lk/e;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lk/e;->b()F

    .line 103
    move-result v1

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 107
    move-result v1

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    const-string v2, "compress_avg_cost"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 117
    .line 118
    iget-object v1, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 119
    .line 120
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, La3d20260409/h;->l(La3d20260409/h;)Lwe0/g;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lwe0/g;->b()Lk/e;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Lk/e;->b()F

    .line 132
    move-result v1

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 136
    move-result v1

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    const-string v2, "camera_callback_avg_interval"

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 146
    .line 147
    iget-object v1, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 148
    .line 149
    iget-object v1, v1, La3d20260409/h$o;->w:La3d20260409/h;

    .line 150
    .line 151
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, La3d20260409/f;->b0()I

    .line 155
    move-result v1

    .line 156
    .line 157
    iget-object v2, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 158
    .line 159
    iget-object v2, v2, La3d20260409/h$o;->w:La3d20260409/h;

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, La3d20260409/h;->o0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 167
    move-result v2

    .line 168
    .line 169
    iget-object v3, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 170
    .line 171
    iget-object v3, v3, La3d20260409/h$o;->w:La3d20260409/h;

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, La3d20260409/h;->g0(La3d20260409/h;)Ljava/util/concurrent/BlockingQueue;

    .line 175
    move-result-object v3

    .line 176
    .line 177
    .line 178
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 179
    move-result v3

    .line 180
    add-int/2addr v2, v3

    .line 181
    .line 182
    iget-object v3, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 183
    .line 184
    iget-object v3, v3, La3d20260409/h$o;->w:La3d20260409/h;

    .line 185
    .line 186
    .line 187
    invoke-static {v3}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 188
    move-result-object v3

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 192
    move-result v3

    .line 193
    add-int/2addr v2, v3

    .line 194
    .line 195
    sub-int v2, v1, v2

    .line 196
    int-to-float v2, v2

    .line 197
    int-to-float v1, v1

    .line 198
    div-float/2addr v2, v1

    .line 199
    .line 200
    .line 201
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    const-string v2, "frame_lost_rate"

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 208
    .line 209
    :try_start_0
    new-instance v1, Ll/b;

    .line 210
    .line 211
    iget-object v2, p0, La3d20260409/h$o$a;->b:La3d20260409/h$o;

    .line 212
    .line 213
    iget-object v2, v2, La3d20260409/h$o;->w:La3d20260409/h;

    .line 214
    .line 215
    .line 216
    invoke-static {v2}, La3d20260409/h;->o(La3d20260409/h;)Landroid/content/Context;

    .line 217
    move-result-object v2

    .line 218
    .line 219
    .line 220
    invoke-direct {v1, v2}, Ll/b;-><init>(Landroid/content/Context;)V

    .line 221
    .line 222
    const-string v2, "cpu_core_number"

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ll/b;->i()I

    .line 226
    move-result v3

    .line 227
    .line 228
    .line 229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2, v3}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 234
    .line 235
    .line 236
    const-string/jumbo v2, "memory_total_size"

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ll/b;->o()J

    .line 240
    move-result-wide v3

    .line 241
    .line 242
    .line 243
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 244
    move-result-object v3

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v2, v3}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 248
    .line 249
    .line 250
    const-string/jumbo v2, "os_version"

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ll/b;->n()I

    .line 254
    move-result v1

    .line 255
    .line 256
    .line 257
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 262
    .line 263
    const-string v1, "brandAndCpu"

    .line 264
    .line 265
    new-instance v2, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v3, "-"

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    move-result-object v2

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1, v2}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 291
    .line 292
    const-string v1, "abi"

    .line 293
    .line 294
    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1, v2}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 298
    .line 299
    sget-object v1, Lintl/oOooooooo0000000000;->OOOOooooo:Lintl/oOooooooo0000000000;

    .line 300
    .line 301
    .line 302
    invoke-static {v1}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 303
    move-result v1

    .line 304
    .line 305
    if-eqz v1, :cond_3

    .line 306
    .line 307
    iget-object v1, p0, La3d20260409/h$o$a;->a:Lorg/json/JSONObject;

    .line 308
    .line 309
    if-eqz v1, :cond_2

    .line 310
    .line 311
    .line 312
    const-string/jumbo v2, "rpt_array"

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 316
    .line 317
    :cond_2
    iget-object v1, p0, La3d20260409/h$o$a;->a:Lorg/json/JSONObject;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Lg/c$b;->b(Lorg/json/JSONObject;)Lg/c$b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    :catch_0
    :cond_3
    const/4 v1, 0x1

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, Lg/c$b;->e(Z)Lg/c$b;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Lg/c$b;->d()Lg/c;

    .line 328
    move-result-object v0

    .line 329
    return-object v0
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
.end method
