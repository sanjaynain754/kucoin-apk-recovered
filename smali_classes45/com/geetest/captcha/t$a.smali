.class public final Lcom/geetest/captcha/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/geetest/captcha/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)Lcom/geetest/captcha/t;
    .locals 15
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "url"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    return-object v1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    const-string p0, "?"

    .line 25
    .line 26
    .line 27
    filled-new-array {p0}, [Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    const/4 v6, 0x6

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 36
    move-result-object p0

    .line 37
    const/4 v0, 0x0

    .line 38
    .line 39
    new-array v2, v0, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 43
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 46
    .line 47
    if-eqz p0, :cond_6

    .line 48
    .line 49
    :try_start_1
    check-cast p0, [Ljava/lang/String;

    .line 50
    .line 51
    new-instance v3, Ljava/util/HashMap;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 55
    array-length v4, p0

    .line 56
    const/4 v5, 0x1

    .line 57
    .line 58
    if-ne v4, v5, :cond_1

    .line 59
    .line 60
    new-instance v2, Lcom/geetest/captcha/t;

    .line 61
    .line 62
    aget-object p0, p0, v0

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, p0, v3}, Lcom/geetest/captcha/t;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 66
    return-object v2

    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    array-length v4, p0

    .line 71
    const/4 v6, 0x2

    .line 72
    .line 73
    if-ne v4, v6, :cond_7

    .line 74
    .line 75
    aget-object v7, p0, v5

    .line 76
    .line 77
    const-string v4, "&"

    .line 78
    .line 79
    .line 80
    filled-new-array {v4}, [Ljava/lang/String;

    .line 81
    move-result-object v8

    .line 82
    const/4 v11, 0x6

    .line 83
    const/4 v12, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    new-array v7, v0, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    invoke-interface {v4, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    check-cast v4, [Ljava/lang/String;

    .line 100
    array-length v7, v4

    .line 101
    move v8, v0

    .line 102
    .line 103
    :goto_0
    if-ge v8, v7, :cond_4

    .line 104
    .line 105
    aget-object v9, v4, v8

    .line 106
    .line 107
    const-string v10, "="

    .line 108
    .line 109
    .line 110
    filled-new-array {v10}, [Ljava/lang/String;

    .line 111
    move-result-object v10

    .line 112
    const/4 v13, 0x6

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 119
    move-result-object v9

    .line 120
    .line 121
    new-array v10, v0, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-interface {v9, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 125
    move-result-object v9

    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    check-cast v9, [Ljava/lang/String;

    .line 130
    array-length v10, v9

    .line 131
    .line 132
    if-ne v10, v6, :cond_2

    .line 133
    .line 134
    aget-object v10, v9, v0

    .line 135
    .line 136
    aget-object v9, v9, v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 148
    throw p0

    .line 149
    .line 150
    :cond_4
    new-instance v2, Lcom/geetest/captcha/t;

    .line 151
    .line 152
    aget-object p0, p0, v0

    .line 153
    .line 154
    .line 155
    invoke-direct {v2, p0, v3}, Lcom/geetest/captcha/t;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 156
    return-object v2

    .line 157
    .line 158
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 159
    .line 160
    .line 161
    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 162
    throw p0

    .line 163
    .line 164
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    .line 165
    .line 166
    .line 167
    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 168
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 169
    .line 170
    .line 171
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 172
    :cond_7
    return-object v1
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
.end method
