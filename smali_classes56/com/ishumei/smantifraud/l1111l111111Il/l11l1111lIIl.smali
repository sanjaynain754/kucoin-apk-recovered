.class final Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111lIIl;
.super Lcom/ishumei/smantifraud/AbsDetector;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/ishumei/smantifraud/AbsDetector;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final getEventId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "devicefieldcheck"

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
.end method

.method public final l1111l111111Il()Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/AbsDetector;->getAndIncrementSerial()I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111l1Il()Ljava/util/Map;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Ljava/util/Map;)V

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l11111lIl()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111lIl(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l111l11111Il()Landroid/os/StatFs;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 55
    move-result-wide v2

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Ljava/lang/Long;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/os/StatFs;->getTotalBytes()J

    .line 66
    move-result-wide v1

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111Il(Ljava/lang/Long;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111I1l(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il$1;->l1111l111111Il()Ljava/util/Map;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111lIl(Ljava/util/Map;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111lI1l()Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111Il(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l111l11111lIl()J

    .line 98
    move-result-wide v1

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111lIl(Ljava/lang/Long;)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111lIl()I

    .line 109
    move-result v1

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Ljava/lang/Integer;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    .line 120
    move-result v1

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111lIl(Ljava/lang/Integer;)V

    .line 128
    .line 129
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l1111l1Il(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111Il()J

    .line 144
    move-result-wide v1

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l11111I1l(Ljava/lang/Long;)V

    .line 152
    .line 153
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l1111llIl(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l1111l111111Il()Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l1111lI1l(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l1111l111111Il()Ljava/lang/String;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l111l1111lIl(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l()Ljava/lang/String;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Ljava/lang/String;)V

    .line 182
    .line 183
    const-string v1, "3.7.3"

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l11l1111lIIl(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111lIl;->l1111l111111Il()Lorg/json/JSONObject;

    .line 190
    move-result-object v0

    .line 191
    return-object v0
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
