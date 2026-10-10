.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$d;
.super Ljava/lang/Object;
.source "AnchorManagerDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->C0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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


# instance fields
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

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
.method public final a(Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
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
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->U(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    if-eqz p2, :cond_13

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Z(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Z

    .line 26
    move-result p2

    .line 27
    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    const/4 v2, 0x1

    .line 30
    .line 31
    const-string v3, "audioContainer"

    .line 32
    .line 33
    const-string v4, "tvAudio"

    .line 34
    .line 35
    const-string v5, "ivAudio"

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    if-nez p2, :cond_6

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Y(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Z

    .line 42
    move-result p2

    .line 43
    .line 44
    if-eqz p2, :cond_13

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    if-nez p2, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 54
    move-object p2, v6

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p2, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    if-nez p2, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 67
    move-object p2, v6

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 74
    move-result-object p2

    .line 75
    .line 76
    if-nez p2, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    move-object p2, v6

    .line 81
    .line 82
    :cond_2
    if-eqz p1, :cond_3

    .line 83
    .line 84
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_disable_audio:I

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_3
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 94
    move-result-object p2

    .line 95
    .line 96
    if-nez p2, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move-object v6, p2

    .line 102
    .line 103
    :goto_1
    if-eqz p1, :cond_5

    .line 104
    .line 105
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_enable_audio:I

    .line 106
    goto :goto_2

    .line 107
    .line 108
    :cond_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_disable_audio:I

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :cond_6
    if-eqz p1, :cond_b

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 125
    move-object p1, v6

    .line 126
    :cond_7
    const/4 p2, 0x0

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    if-nez p1, :cond_8

    .line 136
    .line 137
    .line 138
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 139
    move-object p1, v6

    .line 140
    .line 141
    .line 142
    :cond_8
    const p2, 0x3e75c28f    # 0.24f

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-nez p1, :cond_9

    .line 152
    .line 153
    .line 154
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 155
    move-object p1, v6

    .line 156
    .line 157
    :cond_9
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-nez p1, :cond_a

    .line 167
    .line 168
    .line 169
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 170
    goto :goto_3

    .line 171
    :cond_a
    move-object v6, p1

    .line 172
    .line 173
    :goto_3
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 177
    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    .line 181
    :cond_b
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    if-nez p1, :cond_c

    .line 185
    .line 186
    .line 187
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 188
    move-object p1, v6

    .line 189
    .line 190
    .line 191
    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 195
    move-result-object p1

    .line 196
    .line 197
    if-nez p1, :cond_d

    .line 198
    .line 199
    .line 200
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 201
    move-object p1, v6

    .line 202
    .line 203
    .line 204
    :cond_d
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 205
    .line 206
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 210
    move-result-object p1

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getMicrophoneStatus()Lkotlinx/coroutines/flow/w;

    .line 218
    move-result-object p1

    .line 219
    .line 220
    .line 221
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 222
    move-result-object p1

    .line 223
    .line 224
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 225
    .line 226
    if-ne p1, p2, :cond_10

    .line 227
    .line 228
    .line 229
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 230
    move-result-object p1

    .line 231
    .line 232
    if-nez p1, :cond_e

    .line 233
    .line 234
    .line 235
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 236
    move-object p1, v6

    .line 237
    .line 238
    :cond_e
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 245
    move-result-object p1

    .line 246
    .line 247
    if-nez p1, :cond_f

    .line 248
    .line 249
    .line 250
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 251
    goto :goto_4

    .line 252
    :cond_f
    move-object v6, p1

    .line 253
    .line 254
    :goto_4
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 258
    goto :goto_6

    .line 259
    .line 260
    .line 261
    :cond_10
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 262
    move-result-object p1

    .line 263
    .line 264
    if-nez p1, :cond_11

    .line 265
    .line 266
    .line 267
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 268
    move-object p1, v6

    .line 269
    .line 270
    :cond_11
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 277
    move-result-object p1

    .line 278
    .line 279
    if-nez p1, :cond_12

    .line 280
    .line 281
    .line 282
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 283
    goto :goto_5

    .line 284
    :cond_12
    move-object v6, p1

    .line 285
    .line 286
    :goto_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_mute_audio:I

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 290
    .line 291
    :cond_13
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 292
    return-object p1
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
    check-cast p1, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$d;->a(Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
