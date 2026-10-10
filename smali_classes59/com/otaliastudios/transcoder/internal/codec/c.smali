.class public final Lcom/otaliastudios/transcoder/internal/codec/c;
.super Ljava/lang/Object;
.source "DecoderDropper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/codec/c;",
        "",
        "",
        "continuous",
        "<init>",
        "(Z)V",
        "",
        "timeUs",
        "render",
        "",
        "c",
        "(JZ)V",
        "d",
        "(J)Ljava/lang/Long;",
        "",
        "message",
        "important",
        "a",
        "(Ljava/lang/String;Z)V",
        "Z",
        "Lw90/i;",
        "b",
        "Lw90/i;",
        "log",
        "",
        "Lkotlin/ranges/LongRange;",
        "Ljava/util/Map;",
        "closedDeltas",
        "",
        "Ljava/util/List;",
        "closedRanges",
        "e",
        "Lkotlin/ranges/LongRange;",
        "pendingRange",
        "f",
        "Ljava/lang/Long;",
        "firstInputUs",
        "g",
        "firstOutputUs",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Z

.field public final b:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/ranges/LongRange;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/ranges/LongRange;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lkotlin/ranges/LongRange;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->a:Z

    .line 6
    .line 7
    new-instance p1, Lw90/i;

    .line 8
    .line 9
    const-string v0, "DecoderDropper"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->b:Lw90/i;

    .line 15
    .line 16
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->c:Ljava/util/Map;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 29
    return-void
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
.end method

.method public static synthetic b(Lcom/otaliastudios/transcoder/internal/codec/c;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/transcoder/internal/codec/c;->a(Ljava/lang/String;Z)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public final c(JZ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->f:Ljava/lang/Long;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->f:Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x2

    .line 19
    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    move-result-object p3

    .line 25
    .line 26
    const-string v5, "INPUT: inputUs="

    .line 27
    .line 28
    .line 29
    invoke-static {v5, p3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    move-result-object p3

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p3, v2, v4, v3}, Lcom/otaliastudios/transcoder/internal/codec/c;->b(Lcom/otaliastudios/transcoder/internal/codec/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 34
    .line 35
    iget-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 36
    .line 37
    if-nez p3, :cond_1

    .line 38
    .line 39
    new-instance p3, Lkotlin/ranges/LongRange;

    .line 40
    .line 41
    .line 42
    invoke-direct {p3, p1, p2, v0, v1}, Lkotlin/ranges/LongRange;-><init>(JJ)V

    .line 43
    .line 44
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 45
    return-void

    .line 46
    .line 47
    :cond_1
    new-instance p3, Lkotlin/ranges/LongRange;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lkotlin/ranges/LongProgression;->getFirst()J

    .line 56
    move-result-wide v0

    .line 57
    .line 58
    .line 59
    invoke-direct {p3, v0, v1, p1, p2}, Lkotlin/ranges/LongRange;-><init>(JJ)V

    .line 60
    .line 61
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 62
    return-void

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    const-string p2, "INPUT: Got SKIPPING input! inputUs="

    .line 69
    .line 70
    .line 71
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-static {p0, p1, v2, v4, v3}, Lcom/otaliastudios/transcoder/internal/codec/c;->b(Lcom/otaliastudios/transcoder/internal/codec/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 76
    .line 77
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lkotlin/ranges/LongProgression;->getLast()J

    .line 86
    move-result-wide p1

    .line 87
    .line 88
    cmp-long p1, p1, v0

    .line 89
    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 93
    .line 94
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->c:Ljava/util/Map;

    .line 103
    .line 104
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 105
    .line 106
    .line 107
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 108
    .line 109
    iget-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 110
    .line 111
    .line 112
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 113
    move-result p3

    .line 114
    .line 115
    if-lt p3, v4, :cond_3

    .line 116
    .line 117
    iget-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 118
    .line 119
    .line 120
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3}, Lkotlin/ranges/LongProgression;->getFirst()J

    .line 124
    move-result-wide v0

    .line 125
    .line 126
    iget-object p3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 127
    .line 128
    .line 129
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 130
    move-result v2

    .line 131
    .line 132
    add-int/lit8 v2, v2, -0x1

    .line 133
    .line 134
    .line 135
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    move-result-object p3

    .line 137
    .line 138
    check-cast p3, Lkotlin/ranges/LongRange;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Lkotlin/ranges/LongProgression;->getLast()J

    .line 142
    move-result-wide v4

    .line 143
    sub-long/2addr v0, v4

    .line 144
    goto :goto_0

    .line 145
    .line 146
    :cond_3
    const-wide/16 v0, 0x0

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 150
    move-result-object p3

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    :cond_4
    iput-object v3, p0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 156
    return-void
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
.end method

.method public final d(J)Ljava/lang/Long;
    .locals 17
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-wide/from16 v1, p1

    .line 5
    .line 6
    iget-object v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->g:Ljava/lang/Long;

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    iput-object v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->g:Ljava/lang/Long;

    .line 15
    .line 16
    :cond_0
    iget-object v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->f:Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 23
    move-result-wide v3

    .line 24
    .line 25
    iget-object v5, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->g:Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 32
    move-result-wide v5

    .line 33
    .line 34
    sub-long v5, v1, v5

    .line 35
    add-long/2addr v3, v5

    .line 36
    .line 37
    iget-object v5, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x2

    .line 49
    const/4 v10, 0x0

    .line 50
    .line 51
    const-string v11, " deltaUs="

    .line 52
    .line 53
    const-string v12, " newOutputTimeUs="

    .line 54
    .line 55
    const-string v13, "OUTPUT: Rendering! outputTimeUs="

    .line 56
    const/4 v14, 0x0

    .line 57
    .line 58
    if-eqz v8, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v8

    .line 63
    .line 64
    check-cast v8, Lkotlin/ranges/LongRange;

    .line 65
    .line 66
    iget-object v15, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->c:Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    invoke-interface {v15, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    move-result-object v15

    .line 71
    .line 72
    .line 73
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    .line 75
    check-cast v15, Ljava/lang/Number;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    .line 79
    move-result-wide v15

    .line 80
    add-long/2addr v6, v15

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v3, v4}, Lkotlin/ranges/LongRange;->contains(J)Z

    .line 84
    move-result v8

    .line 85
    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    sub-long v4, v1, v6

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v3, v10, v9, v14}, Lcom/otaliastudios/transcoder/internal/codec/c;->b(Lcom/otaliastudios/transcoder/internal/codec/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 119
    .line 120
    iget-boolean v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->a:Z

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    move-result-object v1

    .line 127
    return-object v1

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    move-result-object v1

    .line 132
    return-object v1

    .line 133
    .line 134
    :cond_3
    iget-object v5, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 135
    .line 136
    if-eqz v5, :cond_6

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v3, v4}, Lkotlin/ranges/LongRange;->contains(J)Z

    .line 143
    move-result v3

    .line 144
    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    iget-object v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 148
    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    move-result v3

    .line 152
    .line 153
    if-nez v3, :cond_4

    .line 154
    .line 155
    iget-object v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->e:Lkotlin/ranges/LongRange;

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lkotlin/ranges/LongProgression;->getFirst()J

    .line 162
    move-result-wide v3

    .line 163
    .line 164
    iget-object v5, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->d:Ljava/util/List;

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    move-result-object v5

    .line 169
    .line 170
    check-cast v5, Lkotlin/ranges/LongRange;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Lkotlin/ranges/LongProgression;->getLast()J

    .line 174
    move-result-wide v15

    .line 175
    sub-long/2addr v3, v15

    .line 176
    add-long/2addr v6, v3

    .line 177
    .line 178
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    sub-long v4, v1, v6

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    move-result-object v3

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v3, v10, v9, v14}, Lcom/otaliastudios/transcoder/internal/codec/c;->b(Lcom/otaliastudios/transcoder/internal/codec/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 209
    .line 210
    iget-boolean v3, v0, Lcom/otaliastudios/transcoder/internal/codec/c;->a:Z

    .line 211
    .line 212
    if-eqz v3, :cond_5

    .line 213
    .line 214
    .line 215
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    move-result-object v1

    .line 217
    return-object v1

    .line 218
    .line 219
    .line 220
    :cond_5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 221
    move-result-object v1

    .line 222
    return-object v1

    .line 223
    .line 224
    .line 225
    :cond_6
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 226
    move-result-object v1

    .line 227
    .line 228
    const-string v2, "OUTPUT: SKIPPING! outputTimeUs="

    .line 229
    .line 230
    .line 231
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    move-result-object v1

    .line 233
    const/4 v2, 0x1

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1, v2}, Lcom/otaliastudios/transcoder/internal/codec/c;->a(Ljava/lang/String;Z)V

    .line 237
    return-object v14
    .line 238
    .line 239
.end method
