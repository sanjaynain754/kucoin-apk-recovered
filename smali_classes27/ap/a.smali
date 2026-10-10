.class public final Lap/a;
.super Ljava/lang/Object;
.source "BizMarkActionHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\u0008\u001a)\u0010\t\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0007\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000c\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\n\u001a1\u0010\r\u001a\u00020\u000e\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u000e\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000c\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u000e\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000c\u001a\u0002H\u0002H\u0000\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "hasMarkBizMMKV",
        "",
        "T",
        "biz",
        "Lcom/kubi/margin/bizstore/BizScene;",
        "model",
        "Lcom/kubi/margin/bizstore/BizMarkMMKVModel;",
        "matcher",
        "(Lcom/kubi/margin/bizstore/BizScene;Lcom/kubi/margin/bizstore/BizMarkMMKVModel;Ljava/lang/Object;)Z",
        "hasMarkBizMMKVAppendModel",
        "(Lcom/kubi/margin/bizstore/BizScene;Ljava/lang/Object;)Z",
        "hasMarkBizMMKVReplaceModel",
        "value",
        "markBizMMKV",
        "",
        "(Lcom/kubi/margin/bizstore/BizScene;Lcom/kubi/margin/bizstore/BizMarkMMKVModel;Ljava/lang/Object;)V",
        "markBizMMKVReplaceModel",
        "(Lcom/kubi/margin/bizstore/BizScene;Ljava/lang/Object;)V",
        "markBizMMKVAppendModel",
        "MarginLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBizMarkActionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizMarkActionHelper.kt\ncom/kubi/margin/bizstore/BizMarkActionHelperKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n172#2:144\n50#2:145\n154#2:146\n32#2:148\n144#2,2:149\n23#2,2:151\n171#2,2:153\n162#2,2:155\n49#2,2:157\n40#2,2:160\n178#3:147\n1#4:159\n*S KotlinDebug\n*F\n+ 1 BizMarkActionHelper.kt\ncom/kubi/margin/bizstore/BizMarkActionHelperKt\n*L\n46#1:144\n51#1:145\n68#1:146\n73#1:148\n107#1:149,2\n111#1:151,2\n128#1:153,2\n129#1:155,2\n134#1:157,2\n136#1:160,2\n68#1:147\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lap/c;Lap/b;Ljava/lang/Object;)Z
    .locals 1
    .param p0    # Lap/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lap/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lap/c<",
            "TT;>;",
            "Lap/b;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "biz"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "model"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    instance-of p1, p1, Lap/b$a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p2}, Lap/a;->b(Lap/c;Ljava/lang/Object;)Z

    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    .line 21
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 25
    throw p0
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
.end method

.method public static final b(Lap/c;Ljava/lang/Object;)Z
    .locals 10
    .param p0    # Lap/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lap/c<",
            "TT;>;TT;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "biz"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lap/c;->getDefaultValue()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    instance-of v1, v0, Landroid/os/Parcelable;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    new-instance v3, Ly70/g;

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Lap/c;->a()Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Lap/c;->getKey()Ljava/lang/String;

    .line 24
    move-result-object v5

    .line 25
    .line 26
    const/16 v8, 0xc

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v3 .. v9}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    .line 39
    invoke-static {v3, p0}, Ly70/a;->g(Ly70/g;Ljava/util/List;)Ljava/util/List;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    instance-of v0, p1, Landroid/os/Parcelable;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    move-object v2, p1

    .line 46
    .line 47
    check-cast v2, Landroid/os/Parcelable;

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    .line 54
    :cond_1
    instance-of v1, v0, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v3, Ly70/g;

    .line 59
    .line 60
    .line 61
    invoke-interface {p0}, Lap/c;->a()Ljava/lang/String;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    .line 65
    invoke-interface {p0}, Lap/c;->getKey()Ljava/lang/String;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    const/16 v8, 0xc

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    .line 73
    .line 74
    invoke-direct/range {v3 .. v9}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    .line 81
    invoke-static {v3, p0}, Ly70/a;->i(Ly70/g;Ljava/util/Set;)Ljava/util/Set;

    .line 82
    move-result-object p0

    .line 83
    .line 84
    instance-of v0, p1, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    move-object v2, p1

    .line 88
    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    .line 96
    :cond_3
    const-string p0, "hasMarkBizMMKVAppendModel, mark fail, T type unsupported."

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Lro/b;->d(Ljava/lang/String;)V

    .line 100
    const/4 p0, 0x0

    .line 101
    return p0
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
.end method
