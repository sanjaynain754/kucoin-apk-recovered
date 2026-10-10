.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->y1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initGiftPlayView$1",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;",
        "onReceiveGift",
        "",
        "view",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;",
        "gift",
        "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;",
        "giftCount",
        "",
        "sender",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "onPlayGiftAnimation",
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


# instance fields
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

.field public final synthetic b:Lrd0/b;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Lrd0/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;->b:Lrd0/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public a(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "gift"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;->b:Lrd0/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getResourceURL()Ljava/lang/String;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l$a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l$a;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2, v1}, Lrd0/b;->d(Ljava/lang/String;Lrd0/b$a;)V

    .line 20
    return-void
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
.end method

.method public b(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "gift"

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v3, "sender"

    .line 12
    .line 13
    move-object/from16 v4, p4

    .line 14
    .line 15
    .line 16
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 19
    .line 20
    const/16 v17, 0x1ff

    .line 21
    .line 22
    const/16 v18, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    const-wide/16 v10, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v5 .. v18}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    iget-object v3, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->setTextContent(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->getSender()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserID(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->getSender()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 61
    move-result-object v6

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    move-result v6

    .line 66
    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 71
    move-result-object v6

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {v1, v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserName(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->getSender()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setAvatarURL(Ljava/lang/String;)V

    .line 91
    .line 92
    const-string v1, "gift_view_type"

    .line 93
    .line 94
    const-string v4, "1"

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getName()Ljava/lang/String;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    const-string v6, "gift_name"

    .line 105
    .line 106
    .line 107
    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    const-string v6, "gift_count"

    .line 111
    .line 112
    .line 113
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 114
    move-result-object v7

    .line 115
    .line 116
    .line 117
    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    const-string v7, "gift_icon_url"

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getIconURL()Ljava/lang/String;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    .line 127
    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    sget v7, Lcom/trtc/uikit/livekit/R$string;->common_gift_me:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    const-string v7, "gift_receiver_username"

    .line 141
    .line 142
    .line 143
    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 144
    move-result-object v3

    .line 145
    .line 146
    .line 147
    filled-new-array {v1, v4, v6, v2, v3}, [Lkotlin/Pair;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->setExtensionInfo(Ljava/util/Map;)V

    .line 156
    .line 157
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$l;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    if-nez v1, :cond_1

    .line 164
    .line 165
    const-string v1, "barrageStreamView"

    .line 166
    .line 167
    .line 168
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 169
    const/4 v1, 0x0

    .line 170
    .line 171
    .line 172
    :cond_1
    filled-new-array {v5}, [Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->k([Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

    .line 177
    return-void
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
.end method
