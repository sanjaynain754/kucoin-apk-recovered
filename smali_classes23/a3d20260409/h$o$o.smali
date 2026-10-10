.class public La3d20260409/h$o$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h$o;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/a<",
        "Lg/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La3d20260409/h$o;


# direct methods
.method public constructor <init>(La3d20260409/h$o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 23
    .line 24
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$o$o;->b()Lg/b;

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

.method public b()Lg/b;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lg/b$b;

    .line 3
    .line 4
    sget-object v1, Lintl/OoooOOOoooooo;->o0O0O:Lintl/OoooOOOoooooo;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/b$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, La3d20260409/h$o;->b(La3d20260409/h$o;)Ljava/util/Map;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v4

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    check-cast v4, Laai/liveness/Detector$WarnCode;

    .line 36
    .line 37
    iget-object v5, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, La3d20260409/h$o;->b(La3d20260409/h$o;)Ljava/util/Map;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    .line 44
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    check-cast v5, Ljava/lang/Integer;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 53
    move-result v6

    .line 54
    .line 55
    if-le v6, v2, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 59
    move-result v2

    .line 60
    move-object v3, v4

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    iget-object v1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, La3d20260409/h$o;->b(La3d20260409/h$o;)Ljava/util/Map;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 71
    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    const-string v1, "No"

    .line 75
    goto :goto_1

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    :goto_1
    const-string/jumbo v2, "max_frequency_code"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2, v1}, Lg/b$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lg/b$b;

    .line 86
    .line 87
    iget-object v1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, La3d20260409/h$o;->h(La3d20260409/h$o;)I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    const-string v2, "face_captured_change_times"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2, v1}, Lg/b$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lg/b$b;

    .line 101
    .line 102
    iget-object v1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, La3d20260409/h$o;->t(La3d20260409/h$o;)I

    .line 106
    move-result v1

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    const-string v2, "face_cleared_times"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Lg/b$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lg/b$b;

    .line 116
    .line 117
    iget-object v1, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, La3d20260409/h$o;->f(La3d20260409/h$o;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 125
    move-result v1

    .line 126
    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    const-string v2, "hold_still_show_times"

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2, v1}, Lg/b$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lg/b$b;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    sget-object v2, Lintl/o0oOOOOOooooo;->OOOOooooo:Lintl/o0oOOOOOooooo;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    iget-object v3, p0, La3d20260409/h$o$o;->a:La3d20260409/h$o;

    .line 147
    .line 148
    iget-object v3, v3, La3d20260409/h$o;->w:La3d20260409/h;

    .line 149
    .line 150
    .line 151
    invoke-static {v3}, La3d20260409/h;->l0(La3d20260409/h;)Lg/e;

    .line 152
    move-result-object v3

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v2, v3}, Lf/h;->B(Ljava/lang/String;Lg/e;)Ljava/lang/Long;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    if-eqz v1, :cond_3

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    move-result-wide v2

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 166
    move-result-wide v4

    .line 167
    sub-long/2addr v2, v4

    .line 168
    long-to-int v1, v2

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lg/b$b;->a(I)Lg/b$b;

    .line 172
    .line 173
    .line 174
    :cond_3
    invoke-virtual {v0}, Lg/b$b;->f()Lg/b;

    .line 175
    move-result-object v0

    .line 176
    return-object v0
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
.end method
