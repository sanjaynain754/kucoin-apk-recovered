.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->L1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

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
.method public final a(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 p2, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    const-string v0, "viewCoHost"

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->X(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lwd0/a;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    if-eqz p1, :cond_6

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lwd0/a;->b()Lkotlinx/coroutines/flow/w;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    if-eqz p1, :cond_6

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Ljava/util/List;

    .line 35
    .line 36
    if-eqz p1, :cond_6

    .line 37
    .line 38
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    move-result v2

    .line 47
    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    check-cast v2, Lwd0/l;

    .line 55
    .line 56
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    .line 67
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 71
    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 76
    move-result-object v3

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v3, v1

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {v2}, Lwd0/l;->d()Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-static {v3, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 86
    move-result v2

    .line 87
    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->m0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Landroid/view/View;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    if-nez p1, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move-object v1, p1

    .line 100
    :goto_1
    const/4 p1, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static {p2, v1, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Landroid/view/View;Z)V

    .line 104
    goto :goto_3

    .line 105
    .line 106
    :cond_3
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->m0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Landroid/view/View;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move-object v1, v2

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-static {p1, v1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->O(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Landroid/view/View;Z)V

    .line 121
    .line 122
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 132
    move-result p1

    .line 133
    .line 134
    if-ne p1, p2, :cond_5

    .line 135
    .line 136
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->R(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/AnchorEndBattleDialog;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 146
    .line 147
    :cond_5
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->j0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->v()Z

    .line 157
    move-result p1

    .line 158
    .line 159
    if-ne p1, p2, :cond_6

    .line 160
    .line 161
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->j0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 165
    move-result-object p1

    .line 166
    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->s()V

    .line 171
    .line 172
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 173
    return-object p1
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
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$q;->a(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
