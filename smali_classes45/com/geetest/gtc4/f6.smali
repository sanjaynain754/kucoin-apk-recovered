.class public abstract Lcom/geetest/gtc4/f6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/geetest/gtc4/x4;


# direct methods
.method public static a(Landroid/content/Context;)Lcom/geetest/gtc4/x4;
    .locals 4

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    instance-of v0, p0, Landroid/app/Application;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/geetest/gtc4/f6;->a:Lcom/geetest/gtc4/x4;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    return-object v0

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {}, Lcom/geetest/gtc4/g6;->d()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_f

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/geetest/gtc4/g6;->f()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-static {}, Lcom/geetest/gtc4/g6;->e()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    new-instance v0, Lcom/geetest/gtc4/s5;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/s5;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-static {}, Lcom/geetest/gtc4/g6;->g()Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    new-instance v0, Lcom/geetest/gtc4/c6;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/c6;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-static {}, Lcom/geetest/gtc4/g6;->l()Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-nez v0, :cond_e

    .line 62
    .line 63
    .line 64
    const-string/jumbo v0, "ro.miui.ui.version.name"

    .line 65
    .line 66
    const-string v1, ""

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/geetest/gtc4/g6;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    move-result v0

    .line 75
    .line 76
    if-eqz v0, :cond_e

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lcom/geetest/gtc4/g6;->b()Z

    .line 80
    move-result v0

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-static {}, Lcom/geetest/gtc4/g6;->j()Z

    .line 88
    move-result v0

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    new-instance v0, Lcom/geetest/gtc4/t6;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/t6;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    .line 100
    :cond_6
    invoke-static {}, Lcom/geetest/gtc4/g6;->k()Z

    .line 101
    move-result v0

    .line 102
    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    new-instance v0, Lcom/geetest/gtc4/w7;

    .line 106
    .line 107
    .line 108
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/w7;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-static {}, Lcom/geetest/gtc4/g6;->a()Z

    .line 114
    move-result v0

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    new-instance v0, Lcom/geetest/gtc4/s0;

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/s0;-><init>(Landroid/content/Context;)V

    .line 122
    goto :goto_3

    .line 123
    .line 124
    .line 125
    :cond_8
    invoke-static {}, Lcom/geetest/gtc4/g6;->i()Z

    .line 126
    move-result v0

    .line 127
    .line 128
    if-nez v0, :cond_c

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/geetest/gtc4/g6;->h()Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-eqz v0, :cond_9

    .line 135
    goto :goto_0

    .line 136
    .line 137
    .line 138
    :cond_9
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    const-string v2, "com.coolpad.deviceidsupport"

    .line 142
    const/4 v3, 0x0

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    new-instance v0, Lcom/geetest/gtc4/w1;

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/w1;-><init>(Landroid/content/Context;)V

    .line 151
    goto :goto_3

    .line 152
    .line 153
    .line 154
    :catch_0
    const-string/jumbo v0, "ro.odm.manufacturer"

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v1}, Lcom/geetest/gtc4/g6;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    const-string v2, "PRIZE"

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 164
    move-result v0

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    new-instance v0, Lcom/geetest/gtc4/x1;

    .line 169
    .line 170
    .line 171
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/x1;-><init>(Landroid/content/Context;)V

    .line 172
    goto :goto_3

    .line 173
    .line 174
    .line 175
    :cond_a
    const-string/jumbo v0, "ro.build.freeme.label"

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, Lcom/geetest/gtc4/g6;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 183
    move-result v0

    .line 184
    .line 185
    if-nez v0, :cond_b

    .line 186
    .line 187
    new-instance v0, Lcom/geetest/gtc4/o3;

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/o3;-><init>(Landroid/content/Context;)V

    .line 191
    goto :goto_3

    .line 192
    :cond_b
    const/4 v0, 0x0

    .line 193
    goto :goto_3

    .line 194
    .line 195
    :cond_c
    :goto_0
    new-instance v0, Lcom/geetest/gtc4/m6;

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/m6;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/geetest/gtc4/m6;->a()Z

    .line 202
    move-result v1

    .line 203
    .line 204
    if-eqz v1, :cond_d

    .line 205
    goto :goto_3

    .line 206
    .line 207
    :cond_d
    new-instance v0, Lcom/geetest/gtc4/k6;

    .line 208
    .line 209
    .line 210
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/k6;-><init>(Landroid/content/Context;)V

    .line 211
    goto :goto_3

    .line 212
    .line 213
    :cond_e
    :goto_1
    new-instance v0, Lcom/geetest/gtc4/x7;

    .line 214
    .line 215
    .line 216
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/x7;-><init>(Landroid/content/Context;)V

    .line 217
    goto :goto_3

    .line 218
    .line 219
    :cond_f
    :goto_2
    new-instance v0, Lcom/geetest/gtc4/n5;

    .line 220
    .line 221
    .line 222
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/n5;-><init>(Landroid/content/Context;)V

    .line 223
    .line 224
    :goto_3
    sput-object v0, Lcom/geetest/gtc4/f6;->a:Lcom/geetest/gtc4/x4;

    .line 225
    .line 226
    if-eqz v0, :cond_10

    .line 227
    .line 228
    .line 229
    invoke-interface {v0}, Lcom/geetest/gtc4/x4;->a()Z

    .line 230
    move-result v0

    .line 231
    .line 232
    if-eqz v0, :cond_10

    .line 233
    .line 234
    sget-object p0, Lcom/geetest/gtc4/f6;->a:Lcom/geetest/gtc4/x4;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    sget-object p0, Lcom/geetest/gtc4/f6;->a:Lcom/geetest/gtc4/x4;

    .line 240
    return-object p0

    .line 241
    .line 242
    :cond_10
    new-instance v0, Lcom/geetest/gtc4/x5;

    .line 243
    .line 244
    .line 245
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/x5;-><init>(Landroid/content/Context;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lcom/geetest/gtc4/x5;->a()Z

    .line 249
    move-result v1

    .line 250
    .line 251
    if-eqz v1, :cond_11

    .line 252
    goto :goto_4

    .line 253
    .line 254
    :cond_11
    new-instance v0, Lcom/geetest/gtc4/y3;

    .line 255
    .line 256
    .line 257
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/y3;-><init>(Landroid/content/Context;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lcom/geetest/gtc4/y3;->a()Z

    .line 261
    move-result p0

    .line 262
    .line 263
    if-eqz p0, :cond_12

    .line 264
    goto :goto_4

    .line 265
    .line 266
    :cond_12
    new-instance v0, Lcom/geetest/gtc4/g3;

    .line 267
    .line 268
    .line 269
    invoke-direct {v0}, Lcom/geetest/gtc4/g3;-><init>()V

    .line 270
    .line 271
    :goto_4
    sput-object v0, Lcom/geetest/gtc4/f6;->a:Lcom/geetest/gtc4/x4;

    .line 272
    return-object v0
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
.end method
