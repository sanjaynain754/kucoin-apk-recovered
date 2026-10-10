.class public Ld90/e;
.super Ljava/lang/Object;
.source "EmulatorCheckUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld90/e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld90/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld90/e;-><init>()V

    return-void
.end method

.method public static final k()Ld90/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld90/e$b;->a()Ld90/e;

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


# virtual methods
.method public final a()Ld90/a;
    .locals 3

    .line 1
    .line 2
    const-string v0, "gsm.version.baseband"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ld90/a;

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    const-string v1, "1.0.0.0"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    .line 29
    :goto_0
    new-instance v2, Ld90/a;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v1, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 33
    return-object v2
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

.method public final b()Ld90/a;
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.product.board"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ld90/a;

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "android"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    const-string v2, "goldfish"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v3, 0x2

    .line 42
    .line 43
    :goto_0
    new-instance v1, Ld90/a;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v3, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 47
    return-object v1
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

.method public final c()Ld90/a;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld90/b;->c()Ld90/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "cat /proc/self/cgroup"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ld90/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ld90/a;

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 20
    return-object v0

    .line 21
    .line 22
    :cond_0
    new-instance v1, Ld90/a;

    .line 23
    const/4 v2, 0x2

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 27
    return-object v1
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

.method public final d()Ld90/a;
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.build.flavor"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ld90/a;

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    const-string/jumbo v2, "vbox"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_1
    const-string/jumbo v2, "sdk_gphone"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v3, 0x2

    .line 44
    .line 45
    :goto_0
    new-instance v1, Ld90/a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, v3, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 49
    return-object v1
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

.method public final e()Ld90/a;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v3, "ro.hardware"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v3}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    new-instance v0, Ld90/a;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 19
    return-object v0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 23
    move-result-object v4

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    const/4 v5, -0x1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 31
    move-result v6

    .line 32
    .line 33
    .line 34
    sparse-switch v6, :sswitch_data_0

    .line 35
    :goto_0
    move v2, v5

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :sswitch_0
    const-string v2, "android_x86"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-nez v2, :cond_1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v2, 0x6

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :sswitch_1
    const-string v2, "intel"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 v2, 0x5

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :sswitch_2
    const-string/jumbo v2, "vbox"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result v2

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v2, 0x4

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :sswitch_3
    const-string/jumbo v2, "ttvm"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result v2

    .line 78
    .line 79
    if-nez v2, :cond_4

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    const/4 v2, 0x3

    .line 82
    goto :goto_1

    .line 83
    .line 84
    .line 85
    :sswitch_4
    const-string/jumbo v2, "nox"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-nez v2, :cond_5

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    move v2, v0

    .line 94
    goto :goto_1

    .line 95
    .line 96
    .line 97
    :sswitch_5
    const-string/jumbo v2, "vbox86"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result v2

    .line 102
    .line 103
    if-nez v2, :cond_6

    .line 104
    goto :goto_0

    .line 105
    :cond_6
    move v2, v1

    .line 106
    goto :goto_1

    .line 107
    .line 108
    :sswitch_6
    const-string v6, "cancro"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result v4

    .line 113
    .line 114
    if-nez v4, :cond_7

    .line 115
    goto :goto_0

    .line 116
    .line 117
    .line 118
    :cond_7
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 119
    goto :goto_2

    .line 120
    :pswitch_0
    move v0, v1

    .line 121
    .line 122
    :goto_2
    new-instance v1, Ld90/a;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v0, v3}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 126
    return-object v1

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
    :sswitch_data_0
    .sparse-switch
        -0x5185cff0 -> :sswitch_6
        -0x310ae8ad -> :sswitch_5
        0x1aad7 -> :sswitch_4
        0x367d37 -> :sswitch_3
        0x372195 -> :sswitch_2
        0x5fb64d6 -> :sswitch_1
        0x37e65fa6 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final f()Ld90/a;
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.product.manufacturer"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ld90/a;

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "genymotion"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    const-string/jumbo v2, "netease"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v3, 0x2

    .line 43
    .line 44
    :goto_0
    new-instance v1, Ld90/a;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v3, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 48
    return-object v1
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

.method public final g()Ld90/a;
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.product.model"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ld90/a;

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "google_sdk"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    const-string v2, "emulator"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    const-string v2, "android sdk built for x86"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    move-result v1

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v3, 0x2

    .line 51
    .line 52
    :goto_0
    new-instance v1, Ld90/a;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v3, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 56
    return-object v1
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

.method public final h()Ld90/a;
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.board.platform"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld90/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ld90/a;

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "android"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x2

    .line 33
    .line 34
    :goto_0
    new-instance v2, Ld90/a;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v1, v0}, Ld90/a;-><init>(ILjava/lang/String;)V

    .line 38
    return-object v2
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

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld90/b;->c()Ld90/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ld90/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final j(Landroid/content/Context;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sensor"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Landroid/hardware/SensorManager;

    .line 10
    const/4 v0, -0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final l(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string/jumbo v0, "package:"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    array-length p1, p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final m()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld90/b;->c()Ld90/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "pm list package -3"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ld90/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ld90/e;->l(Ljava/lang/String;)I

    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final n(Landroid/content/Context;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sensor"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Landroid/hardware/SensorManager;

    .line 10
    const/4 v0, 0x5

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public o(Landroid/content/Context;Ld90/d;)Z
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    if-eqz p1, :cond_1e

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Ld90/e;->e()Ld90/a;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget v2, v1, Ld90/a;->a:I

    .line 11
    .line 12
    const-string v3, "hardware = "

    .line 13
    const/4 v5, 0x1

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    if-eq v2, v5, :cond_0

    .line 18
    const/4 v2, 0x0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    iget-object v1, v1, Ld90/a;->b:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 42
    :cond_1
    return v5

    .line 43
    :cond_2
    move v2, v5

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ld90/e;->d()Ld90/a;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    iget v7, v6, Ld90/a;->a:I

    .line 50
    .line 51
    const-string v8, "flavor = "

    .line 52
    .line 53
    if-eqz v7, :cond_5

    .line 54
    .line 55
    if-eq v7, v5, :cond_3

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    iget-object v2, v6, Ld90/a;->b:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 79
    :cond_4
    return v5

    .line 80
    .line 81
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ld90/e;->g()Ld90/a;

    .line 85
    move-result-object v7

    .line 86
    .line 87
    iget v9, v7, Ld90/a;->a:I

    .line 88
    .line 89
    .line 90
    const-string/jumbo v10, "model = "

    .line 91
    .line 92
    if-eqz v9, :cond_8

    .line 93
    .line 94
    if-eq v9, v5, :cond_6

    .line 95
    goto :goto_2

    .line 96
    .line 97
    :cond_6
    if-eqz v0, :cond_7

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    iget-object v2, v7, Ld90/a;->b:Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 118
    :cond_7
    return v5

    .line 119
    .line 120
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ld90/e;->f()Ld90/a;

    .line 124
    move-result-object v9

    .line 125
    .line 126
    iget v11, v9, Ld90/a;->a:I

    .line 127
    .line 128
    .line 129
    const-string/jumbo v12, "manufacturer = "

    .line 130
    .line 131
    if-eqz v11, :cond_b

    .line 132
    .line 133
    if-eq v11, v5, :cond_9

    .line 134
    goto :goto_3

    .line 135
    .line 136
    :cond_9
    if-eqz v0, :cond_a

    .line 137
    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    iget-object v2, v9, Ld90/a;->b:Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 157
    :cond_a
    return v5

    .line 158
    .line 159
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 160
    .line 161
    .line 162
    :goto_3
    invoke-virtual/range {p0 .. p0}, Ld90/e;->b()Ld90/a;

    .line 163
    move-result-object v11

    .line 164
    .line 165
    iget v13, v11, Ld90/a;->a:I

    .line 166
    .line 167
    const-string v14, "board = "

    .line 168
    .line 169
    if-eqz v13, :cond_e

    .line 170
    .line 171
    if-eq v13, v5, :cond_c

    .line 172
    goto :goto_4

    .line 173
    .line 174
    :cond_c
    if-eqz v0, :cond_d

    .line 175
    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    iget-object v2, v11, Ld90/a;->b:Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object v1

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 195
    :cond_d
    return v5

    .line 196
    .line 197
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    .line 200
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ld90/e;->h()Ld90/a;

    .line 201
    move-result-object v13

    .line 202
    .line 203
    iget v15, v13, Ld90/a;->a:I

    .line 204
    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    .line 208
    const-string/jumbo v4, "platform = "

    .line 209
    .line 210
    if-eqz v15, :cond_11

    .line 211
    .line 212
    if-eq v15, v5, :cond_f

    .line 213
    goto :goto_5

    .line 214
    .line 215
    :cond_f
    if-eqz v0, :cond_10

    .line 216
    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    iget-object v2, v13, Ld90/a;->b:Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    move-result-object v1

    .line 233
    .line 234
    .line 235
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 236
    :cond_10
    return v5

    .line 237
    .line 238
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 239
    .line 240
    .line 241
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ld90/e;->a()Ld90/a;

    .line 242
    move-result-object v15

    .line 243
    .line 244
    iget v5, v15, Ld90/a;->a:I

    .line 245
    .line 246
    move/from16 v18, v2

    .line 247
    .line 248
    const-string v2, "baseBand = "

    .line 249
    .line 250
    if-eqz v5, :cond_14

    .line 251
    .line 252
    move-object/from16 v19, v13

    .line 253
    const/4 v13, 0x1

    .line 254
    .line 255
    if-eq v5, v13, :cond_12

    .line 256
    goto :goto_6

    .line 257
    .line 258
    :cond_12
    if-eqz v0, :cond_13

    .line 259
    .line 260
    new-instance v1, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    iget-object v2, v15, Ld90/a;->b:Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    move-result-object v1

    .line 276
    .line 277
    .line 278
    invoke-interface {v0, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 279
    .line 280
    :cond_13
    const/16 v17, 0x1

    .line 281
    return v17

    .line 282
    .line 283
    :cond_14
    move-object/from16 v19, v13

    .line 284
    .line 285
    add-int/lit8 v5, v18, 0x2

    .line 286
    .line 287
    move/from16 v18, v5

    .line 288
    .line 289
    .line 290
    :goto_6
    invoke-virtual/range {p0 .. p1}, Ld90/e;->j(Landroid/content/Context;)I

    .line 291
    move-result v5

    .line 292
    const/4 v13, 0x7

    .line 293
    .line 294
    if-gt v5, v13, :cond_15

    .line 295
    .line 296
    add-int/lit8 v18, v18, 0x1

    .line 297
    .line 298
    .line 299
    :cond_15
    invoke-virtual/range {p0 .. p0}, Ld90/e;->m()I

    .line 300
    move-result v13

    .line 301
    const/4 v0, 0x5

    .line 302
    .line 303
    if-gt v13, v0, :cond_16

    .line 304
    .line 305
    add-int/lit8 v18, v18, 0x1

    .line 306
    .line 307
    .line 308
    :cond_16
    invoke-virtual/range {p0 .. p1}, Ld90/e;->r(Landroid/content/Context;)Z

    .line 309
    move-result v0

    .line 310
    .line 311
    if-nez v0, :cond_17

    .line 312
    .line 313
    add-int/lit8 v18, v18, 0x1

    .line 314
    .line 315
    :cond_17
    move/from16 v20, v0

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {p0 .. p1}, Ld90/e;->q(Landroid/content/Context;)Z

    .line 319
    move-result v0

    .line 320
    .line 321
    if-nez v0, :cond_18

    .line 322
    .line 323
    add-int/lit8 v18, v18, 0x1

    .line 324
    .line 325
    :cond_18
    move/from16 v21, v0

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {p0 .. p1}, Ld90/e;->p(Landroid/content/Context;)Z

    .line 329
    move-result v0

    .line 330
    .line 331
    if-nez v0, :cond_19

    .line 332
    .line 333
    add-int/lit8 v18, v18, 0x1

    .line 334
    .line 335
    :cond_19
    move/from16 v22, v0

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {p0 .. p1}, Ld90/e;->n(Landroid/content/Context;)Z

    .line 339
    move-result v0

    .line 340
    .line 341
    if-nez v0, :cond_1a

    .line 342
    .line 343
    add-int/lit8 v18, v18, 0x1

    .line 344
    .line 345
    :cond_1a
    move/from16 p1, v0

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {p0 .. p0}, Ld90/e;->c()Ld90/a;

    .line 349
    move-result-object v0

    .line 350
    .line 351
    move/from16 v23, v13

    .line 352
    .line 353
    iget v13, v0, Ld90/a;->a:I

    .line 354
    .line 355
    if-nez v13, :cond_1b

    .line 356
    .line 357
    add-int/lit8 v18, v18, 0x1

    .line 358
    .line 359
    :cond_1b
    move/from16 v13, v18

    .line 360
    .line 361
    if-eqz p2, :cond_1c

    .line 362
    .line 363
    move/from16 v18, v13

    .line 364
    .line 365
    new-instance v13, Ljava/lang/StringBuffer;

    .line 366
    .line 367
    move-object/from16 v24, v0

    .line 368
    .line 369
    const-string v0, "Test start"

    .line 370
    .line 371
    .line 372
    invoke-direct {v13, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    const-string v0, "\r\n"

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v13, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 381
    .line 382
    iget-object v1, v1, Ld90/a;->b:Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v13, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 392
    .line 393
    iget-object v1, v6, Ld90/a;->b:Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v13, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 403
    .line 404
    iget-object v1, v7, Ld90/a;->b:Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v13, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 414
    .line 415
    iget-object v1, v9, Ld90/a;->b:Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v13, v14}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 425
    .line 426
    iget-object v1, v11, Ld90/a;->b:Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v13, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 436
    .line 437
    move-object/from16 v1, v19

    .line 438
    .line 439
    iget-object v1, v1, Ld90/a;->b:Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v13, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 449
    .line 450
    iget-object v1, v15, Ld90/a;->b:Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 457
    .line 458
    .line 459
    const-string/jumbo v1, "sensorNumber = "

    .line 460
    .line 461
    .line 462
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v13, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 469
    .line 470
    .line 471
    const-string/jumbo v1, "userAppNumber = "

    .line 472
    .line 473
    .line 474
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 475
    .line 476
    move/from16 v1, v23

    .line 477
    .line 478
    .line 479
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 483
    .line 484
    .line 485
    const-string/jumbo v1, "supportCamera = "

    .line 486
    .line 487
    .line 488
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 489
    .line 490
    move/from16 v1, v21

    .line 491
    .line 492
    .line 493
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 497
    .line 498
    .line 499
    const-string/jumbo v1, "supportCameraFlash = "

    .line 500
    .line 501
    .line 502
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 503
    .line 504
    move/from16 v1, v20

    .line 505
    .line 506
    .line 507
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 511
    .line 512
    .line 513
    const-string/jumbo v1, "supportBluetooth = "

    .line 514
    .line 515
    .line 516
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 517
    .line 518
    move/from16 v1, v22

    .line 519
    .line 520
    .line 521
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 525
    .line 526
    const-string v1, "hasLightSensor = "

    .line 527
    .line 528
    .line 529
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 530
    .line 531
    move/from16 v1, p1

    .line 532
    .line 533
    .line 534
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 538
    .line 539
    const-string v1, "cgroupResult = "

    .line 540
    .line 541
    .line 542
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 543
    .line 544
    move-object/from16 v1, v24

    .line 545
    .line 546
    iget-object v1, v1, Ld90/a;->b:Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v13, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 553
    .line 554
    .line 555
    const-string/jumbo v0, "suspectCount = "

    .line 556
    .line 557
    .line 558
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 559
    .line 560
    move/from16 v0, v18

    .line 561
    .line 562
    .line 563
    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v13}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 567
    move-result-object v1

    .line 568
    .line 569
    move-object/from16 v2, p2

    .line 570
    .line 571
    .line 572
    invoke-interface {v2, v1}, Ld90/d;->a(Ljava/lang/String;)V

    .line 573
    goto :goto_7

    .line 574
    :cond_1c
    move v0, v13

    .line 575
    :goto_7
    const/4 v1, 0x3

    .line 576
    .line 577
    if-le v0, v1, :cond_1d

    .line 578
    .line 579
    const/16 v17, 0x1

    .line 580
    return v17

    .line 581
    :cond_1d
    return v16

    .line 582
    .line 583
    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 584
    .line 585
    const-string v1, "context must not be null"

    .line 586
    .line 587
    .line 588
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 589
    throw v0
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public final p(Landroid/content/Context;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "android.hardware.bluetooth"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 10
    move-result p1

    .line 11
    return p1
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

.method public final q(Landroid/content/Context;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "android.hardware.camera"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 10
    move-result p1

    .line 11
    return p1
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

.method public final r(Landroid/content/Context;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "android.hardware.camera.flash"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 10
    move-result p1

    .line 11
    return p1
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
