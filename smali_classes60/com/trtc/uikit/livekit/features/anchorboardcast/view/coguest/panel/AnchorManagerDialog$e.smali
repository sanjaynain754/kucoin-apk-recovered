.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$e;
.super Ljava/lang/Object;
.source "AnchorManagerDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->D0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$e;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

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
.method public final a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$e;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->U(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_14

    .line 9
    .line 10
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$e;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->N(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lwd0/i;->b()Lkotlinx/coroutines/flow/w;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v0, v1

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Z(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    const/high16 v3, 0x3f800000    # 1.0f

    .line 56
    .line 57
    const-string v4, "audioContainer"

    .line 58
    .line 59
    const-string v5, "tvAudio"

    .line 60
    const/4 v6, 0x1

    .line 61
    .line 62
    const-string v7, "ivAudio"

    .line 63
    .line 64
    if-nez v2, :cond_7

    .line 65
    .line 66
    .line 67
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->Y(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-eqz p1, :cond_14

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    move-object p1, v1

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-virtual {p1, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    if-nez p1, :cond_2

    .line 90
    .line 91
    .line 92
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 93
    move-object p1, v1

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 97
    .line 98
    .line 99
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    .line 105
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 106
    move-object p1, v1

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    move-result v2

    .line 115
    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_disable_audio:I

    .line 119
    goto :goto_1

    .line 120
    .line 121
    :cond_4
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    if-nez p1, :cond_5

    .line 131
    .line 132
    .line 133
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object v1, p1

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result p1

    .line 144
    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_enable_audio:I

    .line 148
    goto :goto_3

    .line 149
    .line 150
    :cond_6
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_disable_audio:I

    .line 151
    .line 152
    .line 153
    :goto_3
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 154
    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    move-result v0

    .line 164
    .line 165
    if-eqz v0, :cond_c

    .line 166
    .line 167
    .line 168
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    if-nez p1, :cond_8

    .line 172
    .line 173
    .line 174
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 175
    move-object p1, v1

    .line 176
    :cond_8
    const/4 v0, 0x0

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 180
    .line 181
    .line 182
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    if-nez p1, :cond_9

    .line 186
    .line 187
    .line 188
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 189
    move-object p1, v1

    .line 190
    .line 191
    .line 192
    :cond_9
    const v0, 0x3e75c28f    # 0.24f

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 196
    .line 197
    .line 198
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    if-nez p1, :cond_a

    .line 202
    .line 203
    .line 204
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 205
    move-object p1, v1

    .line 206
    .line 207
    :cond_a
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 211
    .line 212
    .line 213
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    if-nez p1, :cond_b

    .line 217
    .line 218
    .line 219
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 220
    goto :goto_4

    .line 221
    :cond_b
    move-object v1, p1

    .line 222
    .line 223
    :goto_4
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 227
    .line 228
    goto/16 :goto_7

    .line 229
    .line 230
    .line 231
    :cond_c
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/view/View;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    if-nez v0, :cond_d

    .line 235
    .line 236
    .line 237
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 238
    move-object v0, v1

    .line 239
    .line 240
    .line 241
    :cond_d
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 242
    .line 243
    .line 244
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 245
    move-result-object v0

    .line 246
    .line 247
    if-nez v0, :cond_e

    .line 248
    .line 249
    .line 250
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 251
    move-object v0, v1

    .line 252
    .line 253
    .line 254
    :cond_e
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 258
    move-result-object p1

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getMicrophoneStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 262
    move-result-object p1

    .line 263
    .line 264
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 265
    .line 266
    if-eq p1, v0, :cond_11

    .line 267
    .line 268
    .line 269
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 270
    move-result-object p1

    .line 271
    .line 272
    if-nez p1, :cond_f

    .line 273
    .line 274
    .line 275
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 276
    move-object p1, v1

    .line 277
    .line 278
    :cond_f
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 282
    .line 283
    .line 284
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 285
    move-result-object p1

    .line 286
    .line 287
    if-nez p1, :cond_10

    .line 288
    .line 289
    .line 290
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 291
    goto :goto_5

    .line 292
    :cond_10
    move-object v1, p1

    .line 293
    .line 294
    :goto_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 298
    goto :goto_7

    .line 299
    .line 300
    .line 301
    :cond_11
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/ImageView;

    .line 302
    move-result-object p1

    .line 303
    .line 304
    if-nez p1, :cond_12

    .line 305
    .line 306
    .line 307
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 308
    move-object p1, v1

    .line 309
    .line 310
    :cond_12
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 314
    .line 315
    .line 316
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;->V(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;)Landroid/widget/TextView;

    .line 317
    move-result-object p1

    .line 318
    .line 319
    if-nez p1, :cond_13

    .line 320
    .line 321
    .line 322
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 323
    goto :goto_6

    .line 324
    :cond_13
    move-object v1, p1

    .line 325
    .line 326
    :goto_6
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_mute_audio:I

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 330
    .line 331
    :cond_14
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 332
    return-object p1
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
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$e;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
