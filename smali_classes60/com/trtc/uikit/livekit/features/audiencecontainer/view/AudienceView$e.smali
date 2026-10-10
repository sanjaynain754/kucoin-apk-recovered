.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;
.super Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;
.source "AudienceView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;",
        "onGuestApplicationResponded",
        "",
        "isAccept",
        "",
        "hostUser",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "onGuestApplicationNoResponse",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;",
        "onKickedOffSeat",
        "seatIndex",
        "",
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
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->c:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;-><init>()V

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
.method public onGuestApplicationNoResponse(Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;)V
    .locals 12

    .line 1
    .line 2
    const-string v0, "reason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;->TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->c:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    sget v0, Lcom/trtc/uikit/livekit/R$string;->common_voiceroom_take_seat_timeout:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    const-string p1, "getString(...)"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 31
    .line 32
    const/16 v10, 0xf8

    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v11}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 42
    .line 43
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lee0/f;->v()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 51
    move-result-object p1

    .line 52
    const/4 v0, 0x0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->g(Z)V

    .line 56
    return-void
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

.method public onGuestApplicationResponded(ZLio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 11

    .line 1
    .line 2
    const-string v0, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lee0/f;->v()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 15
    move-result-object p2

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->g(Z)V

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getViewState()Lee0/j;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lee0/j;->b()Lkotlinx/coroutines/flow/n;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    move-result p1

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    check-cast v0, Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    move-result v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0, p2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->openLocalCamera(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 86
    .line 87
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->openLocalMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 99
    return-void

    .line 100
    .line 101
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 102
    .line 103
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->c:Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_voiceroom_take_seat_rejected:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    const-string p1, "getString(...)"

    .line 116
    .line 117
    .line 118
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    sget-object v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 121
    .line 122
    const/16 v9, 0xf8

    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    const/4 v8, 0x0

    .line 129
    .line 130
    .line 131
    invoke-static/range {v0 .. v10}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 132
    return-void
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

.method public onKickedOffSeat(ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 11

    .line 1
    .line 2
    const-string p1, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;->c:Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_voiceroom_kicked_out_of_seat:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string p1, "getString(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 27
    .line 28
    const/16 v9, 0xf8

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v0 .. v10}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 38
    return-void
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
