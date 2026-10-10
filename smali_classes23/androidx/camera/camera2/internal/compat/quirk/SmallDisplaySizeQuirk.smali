.class public Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;
.super Ljava/lang/Object;
.source "SmallDisplaySizeQuirk.java"

# interfaces
.implements Landroidx/camera/core/impl/Quirk;


# static fields
.field private static final MODEL_TO_DISPLAY_SIZE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SmallDisplaySizeQuirk"


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;->MODEL_TO_DISPLAY_SIZE_MAP:Ljava/util/Map;

    .line 8
    .line 9
    new-instance v1, Landroid/util/Size;

    .line 10
    .line 11
    const/16 v2, 0x438

    .line 12
    .line 13
    const/16 v3, 0x924

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 17
    .line 18
    const-string v4, "REDMI NOTE 8"

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Landroid/util/Size;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 27
    .line 28
    const-string v4, "REDMI NOTE 7"

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v1, Landroid/util/Size;

    .line 34
    .line 35
    const/16 v4, 0x618

    .line 36
    .line 37
    const/16 v5, 0x2d0

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 41
    .line 42
    const-string v4, "SM-A207M"

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v1, Landroid/util/Size;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 51
    .line 52
    const-string v4, "REDMI NOTE 7S"

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    new-instance v1, Landroid/util/Size;

    .line 58
    .line 59
    const/16 v4, 0x640

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 63
    .line 64
    const-string v6, "SM-A127F"

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    new-instance v1, Landroid/util/Size;

    .line 70
    .line 71
    const/16 v6, 0x960

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v2, v6}, Landroid/util/Size;-><init>(II)V

    .line 75
    .line 76
    const-string v7, "SM-A536E"

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    new-instance v1, Landroid/util/Size;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 85
    .line 86
    const-string v7, "220233L2I"

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    new-instance v1, Landroid/util/Size;

    .line 92
    .line 93
    .line 94
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 95
    .line 96
    const-string v7, "V2149"

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    new-instance v1, Landroid/util/Size;

    .line 102
    .line 103
    .line 104
    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 105
    .line 106
    const-string v3, "VIVO 1920"

    .line 107
    .line 108
    .line 109
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    new-instance v1, Landroid/util/Size;

    .line 112
    .line 113
    .line 114
    invoke-direct {v1, v2, v6}, Landroid/util/Size;-><init>(II)V

    .line 115
    .line 116
    const-string v3, "CPH2223"

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    new-instance v1, Landroid/util/Size;

    .line 122
    .line 123
    .line 124
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 125
    .line 126
    const-string v3, "V2029"

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    new-instance v1, Landroid/util/Size;

    .line 132
    .line 133
    const/16 v3, 0x5f0

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 137
    .line 138
    const-string v7, "CPH1901"

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    new-instance v1, Landroid/util/Size;

    .line 144
    .line 145
    .line 146
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 147
    .line 148
    const-string v7, "REDMI Y3"

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    new-instance v1, Landroid/util/Size;

    .line 154
    .line 155
    .line 156
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 157
    .line 158
    const-string v7, "SM-A045M"

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    new-instance v1, Landroid/util/Size;

    .line 164
    .line 165
    const/16 v7, 0x968

    .line 166
    .line 167
    .line 168
    invoke-direct {v1, v2, v7}, Landroid/util/Size;-><init>(II)V

    .line 169
    .line 170
    const-string v8, "SM-A146U"

    .line 171
    .line 172
    .line 173
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    new-instance v1, Landroid/util/Size;

    .line 176
    .line 177
    .line 178
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 179
    .line 180
    const-string v8, "CPH1909"

    .line 181
    .line 182
    .line 183
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    new-instance v1, Landroid/util/Size;

    .line 186
    .line 187
    .line 188
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 189
    .line 190
    const-string v8, "NOKIA 4.2"

    .line 191
    .line 192
    .line 193
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    new-instance v1, Landroid/util/Size;

    .line 196
    .line 197
    const/16 v8, 0x5a0

    .line 198
    .line 199
    const/16 v9, 0xb90

    .line 200
    .line 201
    .line 202
    invoke-direct {v1, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 203
    .line 204
    const-string v8, "SM-G960U1"

    .line 205
    .line 206
    .line 207
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    new-instance v1, Landroid/util/Size;

    .line 210
    .line 211
    .line 212
    invoke-direct {v1, v2, v7}, Landroid/util/Size;-><init>(II)V

    .line 213
    .line 214
    const-string v7, "SM-A137F"

    .line 215
    .line 216
    .line 217
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    new-instance v1, Landroid/util/Size;

    .line 220
    .line 221
    .line 222
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 223
    .line 224
    const-string v3, "VIVO 1816"

    .line 225
    .line 226
    .line 227
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    new-instance v1, Landroid/util/Size;

    .line 230
    .line 231
    const/16 v3, 0x64c

    .line 232
    .line 233
    .line 234
    invoke-direct {v1, v5, v3}, Landroid/util/Size;-><init>(II)V

    .line 235
    .line 236
    const-string v3, "INFINIX X6817"

    .line 237
    .line 238
    .line 239
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    new-instance v1, Landroid/util/Size;

    .line 242
    .line 243
    .line 244
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 245
    .line 246
    const-string v3, "SM-A037F"

    .line 247
    .line 248
    .line 249
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    new-instance v1, Landroid/util/Size;

    .line 252
    .line 253
    .line 254
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 255
    .line 256
    const-string v3, "NOKIA 2.4"

    .line 257
    .line 258
    .line 259
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    new-instance v1, Landroid/util/Size;

    .line 262
    .line 263
    .line 264
    invoke-direct {v1, v5, v4}, Landroid/util/Size;-><init>(II)V

    .line 265
    .line 266
    const-string v3, "SM-A125M"

    .line 267
    .line 268
    .line 269
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    new-instance v1, Landroid/util/Size;

    .line 272
    .line 273
    .line 274
    invoke-direct {v1, v2, v6}, Landroid/util/Size;-><init>(II)V

    .line 275
    .line 276
    const-string v2, "INFINIX X670"

    .line 277
    .line 278
    .line 279
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static load()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;->MODEL_TO_DISPLAY_SIZE_MAP:Ljava/util/Map;

    .line 3
    .line 4
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 5
    .line 6
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public getDisplaySize()Landroid/util/Size;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;->MODEL_TO_DISPLAY_SIZE_MAP:Ljava/util/Map;

    .line 3
    .line 4
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 5
    .line 6
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroid/util/Size;

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
.end method
