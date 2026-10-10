.class public final Lad0/a;
.super Ljava/lang/Object;
.source "DefaultEmojiResource.kt"

# interfaces
.implements Led0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0008\u0010\u000f\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource;",
        "Lcom/trtc/uikit/livekit/component/barrage/viewmodel/IEmojiResource;",
        "<init>",
        "()V",
        "resource",
        "Ljava/util/LinkedHashMap;",
        "",
        "",
        "Lkotlin/collections/LinkedHashMap;",
        "getResId",
        "key",
        "getResIds",
        "",
        "getEncodeValue",
        "resId",
        "getEncodePattern",
        "getDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "context",
        "Landroid/content/Context;",
        "bounds",
        "Landroid/graphics/Rect;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDefaultEmojiResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEmojiResource.kt\ncom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,101:1\n216#2,2:102\n1#3:104\n28#4:105\n*S KotlinDebug\n*F\n+ 1 DefaultEmojiResource.kt\ncom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource\n*L\n81#1:102,2\n98#1:105\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 64

    .line 1
    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_0:I

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "[TUIEmoji_Smile]"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_1:I

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "[TUIEmoji_Expect]"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_2:I

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-string v1, "[TUIEmoji_Blink]"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_3:I

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v1, "[TUIEmoji_Guffaw]"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_4:I

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    const-string v1, "[TUIEmoji_KindSmile]"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_5:I

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const-string v1, "[TUIEmoji_Haha]"

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 75
    move-result-object v7

    .line 76
    .line 77
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_6:I

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    const-string v1, "[TUIEmoji_Cheerful]"

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 87
    move-result-object v8

    .line 88
    .line 89
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_7:I

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    const-string v1, "[TUIEmoji_Speechless]"

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 99
    move-result-object v9

    .line 100
    .line 101
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_8:I

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    const-string v1, "[TUIEmoji_Amazed]"

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    move-result-object v10

    .line 112
    .line 113
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_9:I

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    const-string v1, "[TUIEmoji_Sorrow]"

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    move-result-object v11

    .line 124
    .line 125
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_10:I

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    const-string v1, "[TUIEmoji_Complacent]"

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 135
    move-result-object v12

    .line 136
    .line 137
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_11:I

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    const-string v1, "[TUIEmoji_Silly]"

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    move-result-object v13

    .line 148
    .line 149
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_12:I

    .line 150
    .line 151
    .line 152
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    const-string v1, "[TUIEmoji_Lustful]"

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 159
    move-result-object v14

    .line 160
    .line 161
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_13:I

    .line 162
    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    const-string v1, "[TUIEmoji_Giggle]"

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 171
    move-result-object v15

    .line 172
    .line 173
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_14:I

    .line 174
    .line 175
    .line 176
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    const-string v1, "[TUIEmoji_Kiss]"

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 183
    move-result-object v16

    .line 184
    .line 185
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_15:I

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    const-string v1, "[TUIEmoji_Wail]"

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 195
    move-result-object v17

    .line 196
    .line 197
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_16:I

    .line 198
    .line 199
    .line 200
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    const-string v1, "[TUIEmoji_TearsLaugh]"

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 207
    move-result-object v18

    .line 208
    .line 209
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_17:I

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    const-string v1, "[TUIEmoji_Trapped]"

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 219
    move-result-object v19

    .line 220
    .line 221
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_18:I

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    move-result-object v0

    .line 226
    .line 227
    const-string v1, "[TUIEmoji_Mask]"

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 231
    move-result-object v20

    .line 232
    .line 233
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_19:I

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    const-string v1, "[TUIEmoji_Fear]"

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 243
    move-result-object v21

    .line 244
    .line 245
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_20:I

    .line 246
    .line 247
    .line 248
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    move-result-object v0

    .line 250
    .line 251
    const-string v1, "[TUIEmoji_BareTeeth]"

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 255
    move-result-object v22

    .line 256
    .line 257
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_21:I

    .line 258
    .line 259
    .line 260
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    move-result-object v0

    .line 262
    .line 263
    const-string v1, "[TUIEmoji_FlareUp]"

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 267
    move-result-object v23

    .line 268
    .line 269
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_22:I

    .line 270
    .line 271
    .line 272
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    move-result-object v0

    .line 274
    .line 275
    const-string v1, "[TUIEmoji_Yawn]"

    .line 276
    .line 277
    .line 278
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 279
    move-result-object v24

    .line 280
    .line 281
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_23:I

    .line 282
    .line 283
    .line 284
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    move-result-object v0

    .line 286
    .line 287
    const-string v1, "[TUIEmoji_Tact]"

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 291
    move-result-object v25

    .line 292
    .line 293
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_24:I

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    move-result-object v0

    .line 298
    .line 299
    const-string v1, "[TUIEmoji_Stareyes]"

    .line 300
    .line 301
    .line 302
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 303
    move-result-object v26

    .line 304
    .line 305
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_25:I

    .line 306
    .line 307
    .line 308
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    move-result-object v0

    .line 310
    .line 311
    const-string v1, "[TUIEmoji_ShutUp]"

    .line 312
    .line 313
    .line 314
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 315
    move-result-object v27

    .line 316
    .line 317
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_26:I

    .line 318
    .line 319
    .line 320
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    move-result-object v0

    .line 322
    .line 323
    const-string v1, "[TUIEmoji_Sigh]"

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 327
    move-result-object v28

    .line 328
    .line 329
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_27:I

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    const-string v1, "[TUIEmoji_Hehe]"

    .line 336
    .line 337
    .line 338
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 339
    move-result-object v29

    .line 340
    .line 341
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_28:I

    .line 342
    .line 343
    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    move-result-object v0

    .line 346
    .line 347
    const-string v1, "[TUIEmoji_Silent]"

    .line 348
    .line 349
    .line 350
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 351
    move-result-object v30

    .line 352
    .line 353
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_29:I

    .line 354
    .line 355
    .line 356
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    move-result-object v0

    .line 358
    .line 359
    const-string v1, "[TUIEmoji_Surprised]"

    .line 360
    .line 361
    .line 362
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 363
    move-result-object v31

    .line 364
    .line 365
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_30:I

    .line 366
    .line 367
    .line 368
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    move-result-object v0

    .line 370
    .line 371
    const-string v1, "[TUIEmoji_Askance]"

    .line 372
    .line 373
    .line 374
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 375
    move-result-object v32

    .line 376
    .line 377
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_31:I

    .line 378
    .line 379
    .line 380
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    move-result-object v0

    .line 382
    .line 383
    const-string v1, "[TUIEmoji_Ok]"

    .line 384
    .line 385
    .line 386
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 387
    move-result-object v33

    .line 388
    .line 389
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_32:I

    .line 390
    .line 391
    .line 392
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    move-result-object v0

    .line 394
    .line 395
    const-string v1, "[TUIEmoji_Shit]"

    .line 396
    .line 397
    .line 398
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 399
    move-result-object v34

    .line 400
    .line 401
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_33:I

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    move-result-object v0

    .line 406
    .line 407
    const-string v1, "[TUIEmoji_Monster]"

    .line 408
    .line 409
    .line 410
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 411
    move-result-object v35

    .line 412
    .line 413
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_34:I

    .line 414
    .line 415
    .line 416
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    move-result-object v0

    .line 418
    .line 419
    const-string v1, "[TUIEmoji_Daemon]"

    .line 420
    .line 421
    .line 422
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 423
    move-result-object v36

    .line 424
    .line 425
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_35:I

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    move-result-object v0

    .line 430
    .line 431
    const-string v1, "[TUIEmoji_Rage]"

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 435
    move-result-object v37

    .line 436
    .line 437
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_36:I

    .line 438
    .line 439
    .line 440
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    move-result-object v0

    .line 442
    .line 443
    const-string v1, "[TUIEmoji_Fool]"

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 447
    move-result-object v38

    .line 448
    .line 449
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_37:I

    .line 450
    .line 451
    .line 452
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    move-result-object v0

    .line 454
    .line 455
    const-string v1, "[TUIEmoji_Pig]"

    .line 456
    .line 457
    .line 458
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 459
    move-result-object v39

    .line 460
    .line 461
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_38:I

    .line 462
    .line 463
    .line 464
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    move-result-object v0

    .line 466
    .line 467
    const-string v1, "[TUIEmoji_Cow]"

    .line 468
    .line 469
    .line 470
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 471
    move-result-object v40

    .line 472
    .line 473
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_39:I

    .line 474
    .line 475
    .line 476
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    move-result-object v0

    .line 478
    .line 479
    const-string v1, "[TUIEmoji_Ai]"

    .line 480
    .line 481
    .line 482
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 483
    move-result-object v41

    .line 484
    .line 485
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_40:I

    .line 486
    .line 487
    .line 488
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    move-result-object v0

    .line 490
    .line 491
    const-string v1, "[TUIEmoji_Skull]"

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 495
    move-result-object v42

    .line 496
    .line 497
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_41:I

    .line 498
    .line 499
    .line 500
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    move-result-object v0

    .line 502
    .line 503
    const-string v1, "[TUIEmoji_Bombs]"

    .line 504
    .line 505
    .line 506
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 507
    move-result-object v43

    .line 508
    .line 509
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_42:I

    .line 510
    .line 511
    .line 512
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    move-result-object v0

    .line 514
    .line 515
    const-string v1, "[TUIEmoji_Coffee]"

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 519
    move-result-object v44

    .line 520
    .line 521
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_43:I

    .line 522
    .line 523
    .line 524
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    move-result-object v0

    .line 526
    .line 527
    const-string v1, "[TUIEmoji_Cake]"

    .line 528
    .line 529
    .line 530
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 531
    move-result-object v45

    .line 532
    .line 533
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_44:I

    .line 534
    .line 535
    .line 536
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    move-result-object v0

    .line 538
    .line 539
    const-string v1, "[TUIEmoji_Beer]"

    .line 540
    .line 541
    .line 542
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 543
    move-result-object v46

    .line 544
    .line 545
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_45:I

    .line 546
    .line 547
    .line 548
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    move-result-object v0

    .line 550
    .line 551
    const-string v1, "[TUIEmoji_Flower]"

    .line 552
    .line 553
    .line 554
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 555
    move-result-object v47

    .line 556
    .line 557
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_46:I

    .line 558
    .line 559
    .line 560
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    move-result-object v0

    .line 562
    .line 563
    const-string v1, "[TUIEmoji_Watermelon]"

    .line 564
    .line 565
    .line 566
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 567
    move-result-object v48

    .line 568
    .line 569
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_47:I

    .line 570
    .line 571
    .line 572
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 573
    move-result-object v0

    .line 574
    .line 575
    const-string v1, "[TUIEmoji_Rich]"

    .line 576
    .line 577
    .line 578
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 579
    move-result-object v49

    .line 580
    .line 581
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_48:I

    .line 582
    .line 583
    .line 584
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    move-result-object v0

    .line 586
    .line 587
    const-string v1, "[TUIEmoji_Heart]"

    .line 588
    .line 589
    .line 590
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 591
    move-result-object v50

    .line 592
    .line 593
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_49:I

    .line 594
    .line 595
    .line 596
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    move-result-object v0

    .line 598
    .line 599
    const-string v1, "[TUIEmoji_Moon]"

    .line 600
    .line 601
    .line 602
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 603
    move-result-object v51

    .line 604
    .line 605
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_50:I

    .line 606
    .line 607
    .line 608
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    move-result-object v0

    .line 610
    .line 611
    const-string v1, "[TUIEmoji_Sun]"

    .line 612
    .line 613
    .line 614
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 615
    move-result-object v52

    .line 616
    .line 617
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_51:I

    .line 618
    .line 619
    .line 620
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    move-result-object v0

    .line 622
    .line 623
    const-string v1, "[TUIEmoji_Star]"

    .line 624
    .line 625
    .line 626
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 627
    move-result-object v53

    .line 628
    .line 629
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_52:I

    .line 630
    .line 631
    .line 632
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    move-result-object v0

    .line 634
    .line 635
    const-string v1, "[TUIEmoji_RedPacket]"

    .line 636
    .line 637
    .line 638
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 639
    move-result-object v54

    .line 640
    .line 641
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_53:I

    .line 642
    .line 643
    .line 644
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 645
    move-result-object v0

    .line 646
    .line 647
    const-string v1, "[TUIEmoji_Celebrate]"

    .line 648
    .line 649
    .line 650
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 651
    move-result-object v55

    .line 652
    .line 653
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_54:I

    .line 654
    .line 655
    .line 656
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 657
    move-result-object v0

    .line 658
    .line 659
    const-string v1, "[TUIEmoji_Bless]"

    .line 660
    .line 661
    .line 662
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 663
    move-result-object v56

    .line 664
    .line 665
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_55:I

    .line 666
    .line 667
    .line 668
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 669
    move-result-object v0

    .line 670
    .line 671
    const-string v1, "[TUIEmoji_Fortune]"

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 675
    move-result-object v57

    .line 676
    .line 677
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_56:I

    .line 678
    .line 679
    .line 680
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 681
    move-result-object v0

    .line 682
    .line 683
    const-string v1, "[TUIEmoji_Convinced]"

    .line 684
    .line 685
    .line 686
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 687
    move-result-object v58

    .line 688
    .line 689
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_57:I

    .line 690
    .line 691
    .line 692
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 693
    move-result-object v0

    .line 694
    .line 695
    const-string v1, "[TUIEmoji_Prohibit]"

    .line 696
    .line 697
    .line 698
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 699
    move-result-object v59

    .line 700
    .line 701
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_58:I

    .line 702
    .line 703
    .line 704
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 705
    move-result-object v0

    .line 706
    .line 707
    const-string v1, "[TUIEmoji_666]"

    .line 708
    .line 709
    .line 710
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 711
    move-result-object v60

    .line 712
    .line 713
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_59:I

    .line 714
    .line 715
    .line 716
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    move-result-object v0

    .line 718
    .line 719
    const-string v1, "[TUIEmoji_857]"

    .line 720
    .line 721
    .line 722
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 723
    move-result-object v61

    .line 724
    .line 725
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_60:I

    .line 726
    .line 727
    .line 728
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    move-result-object v0

    .line 730
    .line 731
    const-string v1, "[TUIEmoji_Knife]"

    .line 732
    .line 733
    .line 734
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 735
    move-result-object v62

    .line 736
    .line 737
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->live_barrage_emoji_61:I

    .line 738
    .line 739
    .line 740
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 741
    move-result-object v0

    .line 742
    .line 743
    const-string v1, "[TUIEmoji_Like]"

    .line 744
    .line 745
    .line 746
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 747
    move-result-object v63

    .line 748
    .line 749
    .line 750
    filled-new-array/range {v2 .. v63}, [Lkotlin/Pair;

    .line 751
    move-result-object v0

    .line 752
    .line 753
    .line 754
    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 755
    move-result-object v0

    .line 756
    .line 757
    move-object/from16 v1, p0

    .line 758
    .line 759
    iput-object v0, v1, Lad0/a;->a:Ljava/util/LinkedHashMap;

    .line 760
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ILandroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, v0}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iget v0, p3, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget v1, p3, Landroid/graphics/Rect;->right:I

    .line 25
    .line 26
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2, v0, v1, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 30
    :cond_0
    return-object p1

    .line 31
    .line 32
    :cond_1
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 33
    const/4 p2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 37
    return-object p1
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
.end method

.method public b(I)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lad0/a;->a:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    :cond_0
    return-object p1
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
.end method

.method public c(Ljava/lang/String;)I
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lad0/a;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Ljava/lang/Number;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 37
    move-result v2

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    return v2

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    return p1
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
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lad0/a;->a:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "<get-keys>(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
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
.end method
