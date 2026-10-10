.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;
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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;",
        "onKickedOutOfLive",
        "",
        "liveID",
        "",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;",
        "message",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;->b:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;-><init>()V

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
.method public onKickedOutOfLive(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;Ljava/lang/String;)V
    .locals 12

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "reason"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p1, "message"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveListState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    sget-object p3, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 45
    move-result-object p3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 49
    move-result-object p3

    .line 50
    .line 51
    .line 52
    invoke-interface {p3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 53
    move-result-object p3

    .line 54
    .line 55
    check-cast p3, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 56
    const/4 v0, 0x0

    .line 57
    .line 58
    if-eqz p3, :cond_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 62
    move-result-object p3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object p3, v0

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_1
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;->BY_LOGGED_ON_OTHER_DEVICE:Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;

    .line 74
    .line 75
    if-eq p1, p2, :cond_2

    .line 76
    .line 77
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 78
    .line 79
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;->b:Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    sget p2, Lcom/trtc/uikit/livekit/R$string;->common_kicked_out_of_room_by_owner:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    const-string p1, "getString(...)"

    .line 92
    .line 93
    .line 94
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 97
    .line 98
    const/16 v10, 0xf8

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    const/4 v9, 0x0

    .line 105
    .line 106
    .line 107
    invoke-static/range {v1 .. v11}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 108
    .line 109
    const-string p1, "EVENT_KEY_LIVE_KIT"

    .line 110
    .line 111
    const-string p2, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW"

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2, v0}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 115
    :cond_2
    :goto_1
    return-void
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
