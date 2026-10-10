.class public final Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;
.super Lcom/trtc/tuikit/common/FullScreenActivity;
.source "VideoLiveAnchorActivity.kt"

# interfaces
.implements Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$b;
.implements Lcom/trtc/uikit/livekit/features/anchorprepare/c;
.implements Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;
.implements Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;
.implements Lcom/kubi/sdk/util/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0006\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001OB\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001c2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0008\u0010$\u001a\u00020\u001cH\u0014J\u0008\u0010%\u001a\u00020\u001cH\u0014J\u0008\u0010&\u001a\u00020\u001cH\u0014J\u0008\u0010\'\u001a\u00020\u001cH\u0014J\u0008\u0010(\u001a\u00020\u001cH\u0017J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0014H\u0016J\u0008\u0010+\u001a\u00020\u001cH\u0002J\u0008\u0010,\u001a\u00020\u001cH\u0002J\u0008\u0010-\u001a\u00020\u001cH\u0002J\u0008\u0010.\u001a\u00020\u001cH\u0002J\u0008\u0010/\u001a\u00020\u001cH\u0002J\u0012\u00100\u001a\u00020\u001c2\u0008\u00101\u001a\u0004\u0018\u000102H\u0002J\u0008\u00103\u001a\u00020\u001cH\u0002J\u0008\u00104\u001a\u00020\u001cH\u0002J\u0008\u00105\u001a\u00020\u001cH\u0016J\u0008\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0016J\u0008\u00108\u001a\u00020\u001cH\u0016J\u0008\u00109\u001a\u00020\u001cH\u0016J\u0008\u0010:\u001a\u00020\u001cH\u0016J2\u0010;\u001a\u00020\u001c2\u0008\u0010<\u001a\u0004\u0018\u00010\u00162\u0008\u0010=\u001a\u0004\u0018\u00010\u00162\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0016J\"\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\u0008\u0010D\u001a\u0004\u0018\u00010EH\u0014J+\u0010F\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\n2\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u00160H2\u0006\u0010I\u001a\u00020JH\u0016\u00a2\u0006\u0002\u0010KJ\u0008\u0010L\u001a\u00020\u001cH\u0002J\u0012\u0010M\u001a\u00020\u001c2\u0008\u0010N\u001a\u0004\u0018\u00010EH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;",
        "Lcom/trtc/tuikit/common/FullScreenActivity;",
        "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$CallingAPIListener;",
        "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;",
        "Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;",
        "Lcom/kubi/sdk/util/IDisableEdgeToEdge;",
        "<init>",
        "()V",
        "startActivityRequestCode",
        "",
        "layoutContainer",
        "Landroid/widget/FrameLayout;",
        "anchorPrepareView",
        "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;",
        "anchorView",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;",
        "anchorEndStatisticsView",
        "Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;",
        "needCreateRoom",
        "",
        "roomId",
        "",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "anchorEndStatisticsInfo",
        "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AnchorEndStatisticsInfo;",
        "attachBaseContext",
        "",
        "newBase",
        "Landroid/content/Context;",
        "getResources",
        "Landroid/content/res/Resources;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onResume",
        "onStop",
        "onUserLeaveHint",
        "onDestroy",
        "onBackPressed",
        "onPictureInPictureModeChanged",
        "isInPictureInPictureMode",
        "addPrepareView",
        "addAnchorView",
        "disableFunction",
        "removeAnchorPrepareView",
        "initLiveInfo",
        "initEndStatisticsInfo",
        "state",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorBoardcastState;",
        "removeAnchorView",
        "addAnchorEndStatisticsView",
        "onClickStartButton",
        "onClickBackButton",
        "onEndLiving",
        "onClickFloatWindow",
        "onLeaveLive",
        "onStopLive",
        "onNotifyEvent",
        "key",
        "subKey",
        "param",
        "",
        "",
        "onActivityResult",
        "requestCode",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "onRequestPermissionsResult",
        "permissions",
        "",
        "grantResults",
        "",
        "(I[Ljava/lang/String;[I)V",
        "destroyAnchorView",
        "onNewIntent",
        "intent",
        "Companion",
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


# static fields
.field public static final r:Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static synthetic s:Lorg/aspectj/lang/a$a;


# instance fields
.field public i:I

.field public j:Landroid/widget/FrameLayout;

.field public k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:Z

.field public o:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lcom/trtc/uikit/livekit/features/endstatistics/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->ajc$preClinit()V

    .line 4
    .line 5
    new-instance v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    sput-object v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->r:Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$Companion;

    .line 12
    return-void
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
.end method

.method public constructor <init>()V
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/trtc/tuikit/common/FullScreenActivity;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    iput-boolean v1, v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->n:Z

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    iput-object v1, v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->o:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 15
    .line 16
    .line 17
    const v23, 0x7ffff

    .line 18
    .line 19
    const/16 v24, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

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
    const/16 v17, 0x0

    .line 37
    .line 38
    const-wide/16 v18, 0x0

    .line 39
    .line 40
    const/16 v20, 0x0

    .line 41
    .line 42
    const/16 v21, 0x0

    .line 43
    .line 44
    const/16 v22, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v2 .. v24}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    iput-object v2, v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 50
    .line 51
    new-instance v3, Lcom/trtc/uikit/livekit/features/endstatistics/c;

    .line 52
    .line 53
    const/16 v17, 0x7f

    .line 54
    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    const-wide/16 v7, 0x0

    .line 60
    .line 61
    const-wide/16 v9, 0x0

    .line 62
    .line 63
    const-wide/16 v11, 0x0

    .line 64
    .line 65
    const-wide/16 v13, 0x0

    .line 66
    .line 67
    const-wide/16 v15, 0x0

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v3 .. v18}, Lcom/trtc/uikit/livekit/features/endstatistics/c;-><init>(Ljava/lang/String;JJJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    iput-object v3, v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->q:Lcom/trtc/uikit/livekit/features/endstatistics/c;

    .line 73
    return-void
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
.end method

.method public static synthetic H(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->P(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final P(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 4

    .line 1
    .line 2
    const-string v0, "v"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "insets"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->navigationBars()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 32
    move-result v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    return-object p1
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

.method private static synthetic ajc$preClinit()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ldh0/b;

    .line 3
    .line 4
    const-string v1, "VideoLiveAnchorActivity.kt"

    .line 5
    .line 6
    const-class v2, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ldh0/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 10
    .line 11
    const-string v6, ""

    .line 12
    .line 13
    const-string v7, "void"

    .line 14
    .line 15
    const-string v1, "1"

    .line 16
    .line 17
    const-string v2, "onRequestPermissionsResult"

    .line 18
    .line 19
    const-string v3, "com.trtc.uikit.livekit.livestream.VideoLiveAnchorActivity"

    .line 20
    .line 21
    const-string v4, "int:[Ljava.lang.String;:[I"

    .line 22
    .line 23
    const-string v5, "requestCode:permissions:grantResults"

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v0 .. v7}, Ldh0/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lch0/a;

    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    const-string v3, "method-execution"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3, v1, v2}, Ldh0/b;->h(Ljava/lang/String;Lorg/aspectj/lang/c;I)Lorg/aspectj/lang/a$a;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->s:Lorg/aspectj/lang/a$a;

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public final I()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0, v2, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->q:Lcom/trtc/uikit/livekit/features/endstatistics/c;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;->j(Lcom/trtc/uikit/livekit/features/endstatistics/c;)V

    .line 13
    .line 14
    new-instance v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$a;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity$a;-><init>(Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;->setListener(Lcom/trtc/uikit/livekit/features/endstatistics/d;)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->m:Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;

    .line 23
    .line 24
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 25
    const/4 v1, -0x1

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const-string v1, "layoutContainer"

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v2, v1

    .line 40
    .line 41
    :goto_0
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->m:Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    return-void
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
.end method

.method public final J()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->M()V

    .line 4
    .line 5
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 6
    const/4 v4, 0x6

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    iget-object v3, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->getState()Lcom/trtc/uikit/livekit/features/anchorprepare/d;

    .line 27
    move-result-object v5

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    iget-object v5, v5, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->e:Lkotlinx/coroutines/flow/w;

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v5}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Number;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 43
    move-result v5

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object v5

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    const-string v5, ""

    .line 51
    .line 52
    :goto_0
    const-string v6, "coHostTemplateId"

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v5, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->getCoreView()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    iget-boolean v6, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->n:Z

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    sget-object v6, Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;->CREATE_ROOM:Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;

    .line 68
    goto :goto_1

    .line 69
    .line 70
    :cond_1
    sget-object v6, Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;->ENTER_ROOM:Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;

    .line 71
    .line 72
    .line 73
    :goto_1
    invoke-virtual {v0, v5, v3, v6, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->g1(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;Ljava/util/Map;)V

    .line 74
    goto :goto_3

    .line 75
    .line 76
    :cond_2
    iget-object v3, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 77
    .line 78
    iget-boolean v5, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->n:Z

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    sget-object v5, Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;->CREATE_ROOM:Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_3
    sget-object v5, Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;->ENTER_ROOM:Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v0, v3, v4, v5, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->g1(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/RoomBehavior;Ljava/util/Map;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->R0(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V

    .line 92
    .line 93
    iput-object v0, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 94
    .line 95
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 96
    const/4 v2, -0x1

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 100
    .line 101
    iget-object v2, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 102
    .line 103
    if-nez v2, :cond_4

    .line 104
    .line 105
    const-string v2, "layoutContainer"

    .line 106
    .line 107
    .line 108
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object v4, v2

    .line 111
    .line 112
    :goto_4
    iget-object v2, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    return-void
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
.end method

.method public final K()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v1, p0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    iget-object v2, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->f(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->d(Lcom/trtc/uikit/livekit/features/anchorprepare/c;)V

    .line 24
    .line 25
    iput-object v0, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 26
    .line 27
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 28
    const/4 v2, -0x1

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 32
    .line 33
    iget-object v2, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    const-string v2, "layoutContainer"

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v3, v2

    .line 43
    .line 44
    :goto_0
    iget-object v2, v1, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    return-void
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
.end method

.method public final L()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 17
    :cond_1
    :goto_0
    return-void
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

.method public final M()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;->disableHeaderVisitorCnt(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;->disableFooterCoGuest(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;->disableFooterCoHost(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;->disableFooterBattle(Z)V

    .line 16
    return-void
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

.method public final N(Lcom/trtc/uikit/livekit/features/anchorboardcast/a;)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->q:Lcom/trtc/uikit/livekit/features/endstatistics/c;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->n(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->a()J

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->k(J)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->f()J

    .line 24
    move-result-wide v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->l(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->e()J

    .line 31
    move-result-wide v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->m(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->b()J

    .line 38
    move-result-wide v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->h(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->c()J

    .line 45
    move-result-wide v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->i(J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->d()J

    .line 52
    move-result-wide v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/endstatistics/c;->j(J)V

    .line 56
    :cond_0
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

.method public final O()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->getState()Lcom/trtc/uikit/livekit/features/anchorprepare/d;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 13
    .line 14
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->c:Lkotlinx/coroutines/flow/w;

    .line 15
    .line 16
    .line 17
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setLiveName(Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 26
    .line 27
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->b:Lkotlinx/coroutines/flow/w;

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    sget-object v3, Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;->PUBLIC:Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;

    .line 34
    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setPublicVisible(Z)V

    .line 42
    .line 43
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 44
    .line 45
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->a:Lkotlinx/coroutines/flow/w;

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setCoverURL(Ljava/lang/String;)V

    .line 55
    .line 56
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 57
    .line 58
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->a:Lkotlinx/coroutines/flow/w;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setBackgroundURL(Ljava/lang/String;)V

    .line 68
    .line 69
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/trtc/uikit/livekit/features/anchorprepare/d;->d:Lkotlinx/coroutines/flow/w;

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    check-cast v0, Ljava/lang/Number;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 81
    move-result v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setSeatLayoutTemplateID(I)V

    .line 85
    :cond_1
    return-void
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
.end method

.method public final Q()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutContainer"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 14
    return-void
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
.end method

.method public final R()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutContainer"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 14
    return-void
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
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "newBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/AppCompatDelegate;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/AppCompatDelegate;->attachBaseContext2(Landroid/content/Context;)Landroid/content/Context;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/kubi/sdk/function/language/a;->a:Lcom/kubi/sdk/function/language/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/function/language/a;->p(Landroid/content/Context;)Landroid/content/Context;

    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

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
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/function/language/dynamic/a;->a:Lcom/kubi/sdk/function/language/dynamic/a;

    .line 3
    .line 4
    .line 5
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getResources(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/language/dynamic/a;->f(Landroid/content/res/Resources;)Landroid/content/res/Resources;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    iput v2, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 31
    return-object v0
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

.method public l()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public n()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    const-string v0, "requestCode"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    const-string v0, "resultCode"

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    const-string v0, "data"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object p3

    .line 30
    .line 31
    .line 32
    filled-new-array {p1, p2, p3}, [Lkotlin/Pair;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string p2, "TEBeautyExtension"

    .line 40
    .line 41
    const-string p3, "onActivityResult"

    .line 42
    .line 43
    .line 44
    invoke-static {p2, p3, p1}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    .line 45
    return-void
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

.method public onBackPressed()V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/trtc/tuikit/common/FullScreenActivity;->onCreate(Landroid/os/Bundle;)V

    .line 5
    .line 6
    const-string v0, "Live"

    .line 7
    .line 8
    const-string v1, "VideoLiveAnchorActivity onNewIntent"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    const/16 v6, 0xc

    .line 14
    const/4 v7, 0x0

    .line 15
    .line 16
    const-string v2, "B1FeedStreamerLive"

    .line 17
    .line 18
    const-string v3, "page"

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v2 .. v7}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const/16 v1, 0x80

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    const/16 v1, 0x400

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 46
    .line 47
    sget v0, Lcom/trtc/uikit/livekit/R$layout;->livekit_activity_video_live_anchor:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    const-string v1, "intent_key_room_id"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    const-string v0, ""

    .line 65
    .line 66
    :cond_0
    iput-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->o:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v2, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->setLiveID(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    const-string v2, "intent_key_need_create"

    .line 78
    const/4 v3, 0x0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 82
    move-result v0

    .line 83
    .line 84
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->n:Z

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 98
    move-result v1

    .line 99
    .line 100
    if-nez v1, :cond_1

    .line 101
    .line 102
    sget-object v1, Lpe0/a;->a:Lpe0/a;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0}, Lpe0/a;->a(Landroid/os/Bundle;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    iput-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 109
    .line 110
    :cond_1
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_container:I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    const-string v1, "findViewById(...)"

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    check-cast v0, Landroid/widget/FrameLayout;

    .line 122
    .line 123
    iput-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->j:Landroid/widget/FrameLayout;

    .line 124
    .line 125
    if-nez v0, :cond_2

    .line 126
    .line 127
    const-string v0, "layoutContainer"

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 131
    goto :goto_0

    .line 132
    :cond_2
    move-object p1, v0

    .line 133
    .line 134
    :goto_0
    new-instance v0, Loe0/a;

    .line 135
    .line 136
    .line 137
    invoke-direct {v0}, Loe0/a;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 141
    .line 142
    iget-boolean p1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->n:Z

    .line 143
    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->K()V

    .line 148
    goto :goto_1

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->J()V

    .line 152
    .line 153
    :goto_1
    const-string p1, "TEBeautyExtension"

    .line 154
    .line 155
    const-string v0, "onStartActivityNotifyEvent"

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 159
    .line 160
    const-string p1, "EVENT_KEY_LIVE_KIT"

    .line 161
    .line 162
    const-string v0, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW"

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0, p0}, Lcom/tencent/qcloud/tuicore/TUICore;->registerEvent(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 166
    .line 167
    sget-object p1, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->j:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    const-string v1, "getApplicationContext(...)"

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;->createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->g(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$b;)V

    .line 184
    return-void
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 4
    .line 5
    sget-object v0, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->d()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/tencent/qcloud/tuicore/TUICore;->unRegisterEvent(Lcom/tencent/qcloud/tuicore/interfaces/ITUINotification;)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->q(Lcom/trtc/uikit/livekit/features/anchorprepare/c;)V

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e2(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->e(Ljava/lang/String;)V

    .line 39
    .line 40
    sget-object v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->c:Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;->getShared()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;

    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->e(Z)V

    .line 49
    return-void
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
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 4
    .line 5
    const-string p1, "Live"

    .line 6
    .line 7
    const-string v0, "VideoLiveAnchorActivity onNewIntent"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    return-void
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

.method public onNotifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "TEBeautyExtension"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "onStartActivityNotifyEvent"

    .line 11
    .line 12
    .line 13
    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    const-string p1, "requestCode"

    .line 21
    .line 22
    .line 23
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 32
    move-result p1

    .line 33
    .line 34
    iput p1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->i:I

    .line 35
    .line 36
    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 40
    move-result p2

    .line 41
    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    new-instance p1, Landroid/content/Intent;

    .line 45
    .line 46
    const-string p2, "android.intent.action.PICK"

    .line 47
    .line 48
    sget-object p3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 52
    .line 53
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 54
    .line 55
    const-string p3, "image/*|video/*"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    iget p2, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->i:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, p2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 64
    return-void

    .line 65
    .line 66
    .line 67
    :cond_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    const/16 p2, 0x3e9

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p1, p2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_1
    const-string p3, "EVENT_KEY_LIVE_KIT"

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    const-string p1, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW"

    .line 85
    .line 86
    .line 87
    invoke-static {p2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->L()V

    .line 94
    :cond_2
    return-void
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

.method public onPictureInPictureModeChanged(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onPictureInPictureModeChanged(Z)V

    .line 4
    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->c:Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;->getShared()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->e(Z)V

    .line 13
    .line 14
    sget-object v0, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ltd0/a;->f(Z)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Z0(Z)V

    .line 33
    .line 34
    :cond_0
    if-nez p1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 45
    .line 46
    if-ne p1, v0, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 50
    .line 51
    iget-object p1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->I2()V

    .line 57
    :cond_1
    return-void
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

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2
    .param p2    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->s:Lorg/aspectj/lang/a$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lorg/aspectj/runtime/internal/b;->c(I)Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    filled-new-array {v1, p2, p3}, [Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p0, p0, v1}, Ldh0/b;->e(Lorg/aspectj/lang/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lorg/aspectj/lang/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/kubi/sdk/util/PermissionAspect;->c()Lcom/kubi/sdk/util/PermissionAspect;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/kubi/sdk/util/PermissionAspect;->d(Lorg/aspectj/lang/a;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lou/a;->b()Lou/a;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lou/a;->d(Lorg/aspectj/lang/a;)V

    .line 29
    .line 30
    const-string v0, "permissions"

    .line 31
    .line 32
    .line 33
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    const-string v0, "grantResults"

    .line 36
    .line 37
    .line 38
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    const/16 v0, 0x3e9

    .line 41
    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    new-instance p1, Landroid/content/Intent;

    .line 45
    .line 46
    const-string p2, "android.intent.action.PICK"

    .line 47
    .line 48
    sget-object p3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 52
    .line 53
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 54
    .line 55
    const-string p3, "image/*|video/*"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    iget p2, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->i:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, p2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 64
    return-void

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 68
    return-void
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

.method public onResume()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 4
    .line 5
    sget-object v0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->j:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const-string v2, "getApplicationContext(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;->createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->r()V

    .line 22
    return-void
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

.method public onStop()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->j:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "getApplicationContext(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;->createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->u()V

    .line 28
    :cond_0
    return-void
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

.method public onUserLeaveHint()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V

    .line 4
    .line 5
    sget-object v0, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ltd0/a;->a()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ltd0/a;->e()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ltd0/a;->c()Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->u()V

    .line 52
    :cond_1
    :goto_0
    return-void
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
.end method

.method public p()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->k:Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;->q(Lcom/trtc/uikit/livekit/features/anchorprepare/c;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->O()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->Q()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->J()V

    .line 17
    return-void
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

.method public u()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->j:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getApplicationContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;->createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->h(Landroid/app/Activity;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->p:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->e(Ljava/lang/String;)V

    .line 37
    :cond_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public w(Lcom/trtc/uikit/livekit/features/anchorboardcast/a;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "state"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e2(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->N(Lcom/trtc/uikit/livekit/features/anchorboardcast/a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->R()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/livestream/VideoLiveAnchorActivity;->I()V

    .line 22
    return-void
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
