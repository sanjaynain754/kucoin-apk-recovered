.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$b;
.super Ljava/lang/Object;
.source "AnchorManagerDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->A0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

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
    .locals 10
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
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->U(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    if-eqz p2, :cond_17

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

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
    const-string v3, "videoContainer"

    .line 32
    .line 33
    const-string v4, "tvVideo"

    .line 34
    .line 35
    const-string v5, "ivVideo"

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
    if-eqz p2, :cond_17

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->X(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

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
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

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
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

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
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_disable_video:I

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_3
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_start_video:I

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

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
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_enable_video:I

    .line 106
    goto :goto_2

    .line 107
    .line 108
    :cond_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_disable_video:I

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 112
    .line 113
    goto/16 :goto_7

    .line 114
    .line 115
    :cond_6
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 116
    .line 117
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 121
    move-result-object v7

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 125
    move-result-object v7

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    .line 129
    move-result-object v7

    .line 130
    .line 131
    .line 132
    invoke-interface {v7}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 133
    move-result-object v7

    .line 134
    const/4 v8, 0x0

    .line 135
    .line 136
    if-ne p2, v7, :cond_7

    .line 137
    move p2, v2

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move p2, v8

    .line 140
    .line 141
    :goto_3
    const/16 v7, 0x8

    .line 142
    .line 143
    const-string v9, "flipCameraContainer"

    .line 144
    .line 145
    if-eqz p1, :cond_d

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->X(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-nez p1, :cond_8

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 155
    move-object p1, v6

    .line 156
    .line 157
    .line 158
    :cond_8
    invoke-virtual {p1, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    if-nez p1, :cond_9

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 168
    move-object p1, v6

    .line 169
    .line 170
    .line 171
    :cond_9
    const p2, 0x3e75c28f    # 0.24f

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    if-nez p1, :cond_a

    .line 181
    .line 182
    .line 183
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 184
    move-object p1, v6

    .line 185
    .line 186
    :cond_a
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_stop_video:I

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 193
    move-result-object p1

    .line 194
    .line 195
    if-nez p1, :cond_b

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 199
    move-object p1, v6

    .line 200
    .line 201
    :cond_b
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_start_video:I

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Q(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 208
    move-result-object p1

    .line 209
    .line 210
    if-nez p1, :cond_c

    .line 211
    .line 212
    .line 213
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 214
    goto :goto_4

    .line 215
    :cond_c
    move-object v6, p1

    .line 216
    .line 217
    .line 218
    :goto_4
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    goto/16 :goto_7

    .line 221
    .line 222
    .line 223
    :cond_d
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->X(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    if-nez p1, :cond_e

    .line 227
    .line 228
    .line 229
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 230
    move-object p1, v6

    .line 231
    .line 232
    .line 233
    :cond_e
    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    if-nez p1, :cond_f

    .line 240
    .line 241
    .line 242
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 243
    move-object p1, v6

    .line 244
    .line 245
    .line 246
    :cond_f
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 247
    .line 248
    if-eqz p2, :cond_13

    .line 249
    .line 250
    .line 251
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    if-nez p1, :cond_10

    .line 255
    .line 256
    .line 257
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 258
    move-object p1, v6

    .line 259
    .line 260
    :cond_10
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_start_video:I

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 267
    move-result-object p1

    .line 268
    .line 269
    if-nez p1, :cond_11

    .line 270
    .line 271
    .line 272
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 273
    move-object p1, v6

    .line 274
    .line 275
    :cond_11
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_stop_video:I

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 279
    .line 280
    .line 281
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Q(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 282
    move-result-object p1

    .line 283
    .line 284
    if-nez p1, :cond_12

    .line 285
    .line 286
    .line 287
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 288
    goto :goto_5

    .line 289
    :cond_12
    move-object v6, p1

    .line 290
    .line 291
    .line 292
    :goto_5
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 293
    goto :goto_7

    .line 294
    .line 295
    .line 296
    :cond_13
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 297
    move-result-object p1

    .line 298
    .line 299
    if-nez p1, :cond_14

    .line 300
    .line 301
    .line 302
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 303
    move-object p1, v6

    .line 304
    .line 305
    :cond_14
    sget p2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_stop_video:I

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 312
    move-result-object p1

    .line 313
    .line 314
    if-nez p1, :cond_15

    .line 315
    .line 316
    .line 317
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 318
    move-object p1, v6

    .line 319
    .line 320
    :cond_15
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_start_video:I

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Q(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 327
    move-result-object p1

    .line 328
    .line 329
    if-nez p1, :cond_16

    .line 330
    .line 331
    .line 332
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 333
    goto :goto_6

    .line 334
    :cond_16
    move-object v6, p1

    .line 335
    .line 336
    .line 337
    :goto_6
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 338
    .line 339
    :cond_17
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 340
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$b;->a(Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
