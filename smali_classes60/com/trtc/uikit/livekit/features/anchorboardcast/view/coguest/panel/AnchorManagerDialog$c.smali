.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$c;
.super Ljava/lang/Object;
.source "AnchorManagerDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->B0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$onConnectUserListChanged$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,514:1\n827#2:515\n855#2,2:516\n1761#2,3:518\n*S KotlinDebug\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$onConnectUserListChanged$2\n*L\n482#1:515\n482#1:516,2\n484#1:518,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$c;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 38
    .line 39
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p2, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    move-object v1, v0

    .line 21
    .line 22
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$c;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->U(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$c;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 71
    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v1

    .line 110
    .line 111
    if-eqz v1, :cond_3

    .line 112
    goto :goto_2

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->P(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->s()V

    .line 125
    .line 126
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$c;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
