.class public final Lretrofit2/converter/scalars/ScalarsConverterFactory;
.super Lretrofit2/Converter$Factory;
.source "ScalarsConverterFactory.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lretrofit2/Converter$Factory;-><init>()V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static create()Lretrofit2/converter/scalars/ScalarsConverterFactory;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lretrofit2/converter/scalars/ScalarsConverterFactory;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lretrofit2/converter/scalars/ScalarsConverterFactory;-><init>()V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-class p2, Ljava/lang/String;

    .line 3
    .line 4
    if-eq p1, p2, :cond_1

    .line 5
    .line 6
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    if-eq p1, p2, :cond_1

    .line 9
    .line 10
    const-class p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eq p1, p2, :cond_1

    .line 13
    .line 14
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    if-eq p1, p2, :cond_1

    .line 17
    .line 18
    const-class p2, Ljava/lang/Byte;

    .line 19
    .line 20
    if-eq p1, p2, :cond_1

    .line 21
    .line 22
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-eq p1, p2, :cond_1

    .line 25
    .line 26
    const-class p2, Ljava/lang/Character;

    .line 27
    .line 28
    if-eq p1, p2, :cond_1

    .line 29
    .line 30
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    if-eq p1, p2, :cond_1

    .line 33
    .line 34
    const-class p2, Ljava/lang/Double;

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    if-eq p1, p2, :cond_1

    .line 41
    .line 42
    const-class p2, Ljava/lang/Float;

    .line 43
    .line 44
    if-eq p1, p2, :cond_1

    .line 45
    .line 46
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    if-eq p1, p2, :cond_1

    .line 49
    .line 50
    const-class p2, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eq p1, p2, :cond_1

    .line 53
    .line 54
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    if-eq p1, p2, :cond_1

    .line 57
    .line 58
    const-class p2, Ljava/lang/Long;

    .line 59
    .line 60
    if-eq p1, p2, :cond_1

    .line 61
    .line 62
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    if-eq p1, p2, :cond_1

    .line 65
    .line 66
    const-class p2, Ljava/lang/Short;

    .line 67
    .line 68
    if-ne p1, p2, :cond_0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 p1, 0x0

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_1
    :goto_0
    sget-object p1, Lretrofit2/converter/scalars/ScalarRequestBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarRequestBodyConverter;

    .line 74
    return-object p1
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
.end method

.method public responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    const-class p2, Ljava/lang/String;

    .line 3
    .line 4
    if-ne p1, p2, :cond_0

    .line 5
    .line 6
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$StringResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$StringResponseBodyConverter;

    .line 7
    return-object p1

    .line 8
    .line 9
    :cond_0
    const-class p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eq p1, p2, :cond_10

    .line 12
    .line 13
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    if-ne p1, p2, :cond_1

    .line 16
    goto :goto_7

    .line 17
    .line 18
    :cond_1
    const-class p2, Ljava/lang/Byte;

    .line 19
    .line 20
    if-eq p1, p2, :cond_f

    .line 21
    .line 22
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p1, p2, :cond_2

    .line 25
    goto :goto_6

    .line 26
    .line 27
    :cond_2
    const-class p2, Ljava/lang/Character;

    .line 28
    .line 29
    if-eq p1, p2, :cond_e

    .line 30
    .line 31
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-ne p1, p2, :cond_3

    .line 34
    goto :goto_5

    .line 35
    .line 36
    :cond_3
    const-class p2, Ljava/lang/Double;

    .line 37
    .line 38
    if-eq p1, p2, :cond_d

    .line 39
    .line 40
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    if-ne p1, p2, :cond_4

    .line 43
    goto :goto_4

    .line 44
    .line 45
    :cond_4
    const-class p2, Ljava/lang/Float;

    .line 46
    .line 47
    if-eq p1, p2, :cond_c

    .line 48
    .line 49
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p1, p2, :cond_5

    .line 52
    goto :goto_3

    .line 53
    .line 54
    :cond_5
    const-class p2, Ljava/lang/Integer;

    .line 55
    .line 56
    if-eq p1, p2, :cond_b

    .line 57
    .line 58
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne p1, p2, :cond_6

    .line 61
    goto :goto_2

    .line 62
    .line 63
    :cond_6
    const-class p2, Ljava/lang/Long;

    .line 64
    .line 65
    if-eq p1, p2, :cond_a

    .line 66
    .line 67
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p1, p2, :cond_7

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_7
    const-class p2, Ljava/lang/Short;

    .line 73
    .line 74
    if-eq p1, p2, :cond_9

    .line 75
    .line 76
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne p1, p2, :cond_8

    .line 79
    goto :goto_0

    .line 80
    :cond_8
    const/4 p1, 0x0

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_9
    :goto_0
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$ShortResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$ShortResponseBodyConverter;

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_a
    :goto_1
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$LongResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$LongResponseBodyConverter;

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_b
    :goto_2
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$IntegerResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$IntegerResponseBodyConverter;

    .line 90
    return-object p1

    .line 91
    .line 92
    :cond_c
    :goto_3
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$FloatResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$FloatResponseBodyConverter;

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_d
    :goto_4
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$DoubleResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$DoubleResponseBodyConverter;

    .line 96
    return-object p1

    .line 97
    .line 98
    :cond_e
    :goto_5
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$CharacterResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$CharacterResponseBodyConverter;

    .line 99
    return-object p1

    .line 100
    .line 101
    :cond_f
    :goto_6
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$ByteResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$ByteResponseBodyConverter;

    .line 102
    return-object p1

    .line 103
    .line 104
    :cond_10
    :goto_7
    sget-object p1, Lretrofit2/converter/scalars/ScalarResponseBodyConverters$BooleanResponseBodyConverter;->INSTANCE:Lretrofit2/converter/scalars/ScalarResponseBodyConverters$BooleanResponseBodyConverter;

    .line 105
    return-object p1
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
.end method
