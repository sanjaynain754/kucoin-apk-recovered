.class public final Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;
.super Ljava/lang/Object;
.source "FloatingWindowTouchUtils.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006-"
    }
    d2 = {
        "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;",
        "",
        "context",
        "Landroid/content/Context;",
        "config",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;",
        "<init>",
        "(Landroid/content/Context;Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;)V",
        "getContext",
        "()Landroid/content/Context;",
        "getConfig",
        "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;",
        "ScaledTouchSlop",
        "",
        "getScaledTouchSlop",
        "()I",
        "ScaledTouchSlop$delegate",
        "Lkotlin/Lazy;",
        "lastX",
        "",
        "lastY",
        "nowX",
        "nowY",
        "transX",
        "transY",
        "finalMoveX",
        "animationEndListener",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;",
        "getAnimationEndListener",
        "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;",
        "setAnimationEndListener",
        "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;)V",
        "updateFloat",
        "",
        "rootView",
        "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;",
        "event",
        "Landroid/view/MotionEvent;",
        "windowManager",
        "Landroid/view/WindowManager;",
        "params",
        "Landroid/view/WindowManager$LayoutParams;",
        "updataFloatingView",
        "newConfig",
        "AnimationEndListener",
        "MarketMonitorLib_googleRelease"
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
.field private final ScaledTouchSlop$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private animationEndListener:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final config:Laq/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private finalMoveX:I

.field private lastX:F

.field private lastY:F

.field private nowX:F

.field private nowY:F

.field private transX:F

.field private transY:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Laq/j;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Laq/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "config"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->context:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 18
    .line 19
    new-instance p1, Laq/g;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p0}, Laq/g;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->ScaledTouchSlop$delegate:Lkotlin/Lazy;

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
.end method

.method private static final ScaledTouchSlop_delegate$lambda$0(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;)I
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->context:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 10
    move-result p0

    .line 11
    return p0
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
.end method

.method public static synthetic a(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->ScaledTouchSlop_delegate$lambda$0(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic b(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Landroid/view/WindowManager$LayoutParams;Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->updateFloat$lambda$4(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Landroid/view/WindowManager$LayoutParams;Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->updateFloat$lambda$4$lambda$3(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Landroid/animation/ValueAnimator;)V

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
    .line 285
    .line 286
.end method

.method private final getScaledTouchSlop()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->ScaledTouchSlop$delegate:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method private static final updateFloat$lambda$4(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Landroid/view/WindowManager$LayoutParams;Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->finalMoveX:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    .line 10
    :goto_0
    iget v3, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 11
    .line 12
    sub-int v4, v3, v0

    .line 13
    .line 14
    const/16 v5, 0x12c

    .line 15
    .line 16
    if-ge v4, v5, :cond_1

    .line 17
    move v4, v5

    .line 18
    .line 19
    .line 20
    :cond_1
    filled-new-array {v3, v0}, [I

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 25
    move-result-object v0

    .line 26
    int-to-long v3, v4

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    new-instance v3, Laq/f;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, p2, p1, p3}, Laq/f;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 39
    .line 40
    iget-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v1}, Laq/j;->A(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 47
    .line 48
    new-instance p2, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$b;

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, p0, p1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$b;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Landroid/view/WindowManager$LayoutParams;Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object p0
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
.end method

.method private static final updateFloat$lambda$4$lambda$3(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 15
    move-result-object p3

    .line 16
    .line 17
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 18
    .line 19
    .line 20
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 26
    move-result p3

    .line 27
    .line 28
    iput p3, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 29
    .line 30
    .line 31
    invoke-interface {p2, p0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    :cond_0
    return-void
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
.end method


# virtual methods
.method public final getAnimationEndListener()Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->animationEndListener:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;

    .line 3
    return-object v0
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
.end method

.method public final getConfig()Laq/j;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 3
    return-object v0
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
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->context:Landroid/content/Context;

    .line 3
    return-object v0
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
.end method

.method public final setAnimationEndListener(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;)V
    .locals 0
    .param p1    # Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->animationEndListener:Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$a;

    .line 3
    return-void
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
.end method

.method public final updataFloatingView(Laq/j;)I
    .locals 2
    .param p1    # Laq/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "newConfig"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Laq/j;->j()Landroid/view/View;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 p1, -0x1

    .line 13
    return p1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Laq/j;->j()Landroid/view/View;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Laq/j;->G(Landroid/view/View;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Laq/j;->t()Lkotlin/jvm/functions/Function3;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Laq/j;->R(Lkotlin/jvm/functions/Function3;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Laq/j;->k()Landroid/graphics/Point;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Laq/j;->H(Landroid/graphics/Point;)V

    .line 41
    const/4 p1, 0x1

    .line 42
    return p1
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
.end method

.method public final updateFloat(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/MotionEvent;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V
    .locals 4
    .param p1    # Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/WindowManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/WindowManager$LayoutParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "windowManager"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "params"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Laq/j;->i()Z

    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    if-eqz v0, :cond_a

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Laq/j;->u()Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 50
    move-result v0

    .line 51
    .line 52
    and-int/lit16 v0, v0, 0xff

    .line 53
    .line 54
    if-eqz v0, :cond_9

    .line 55
    const/4 v2, 0x1

    .line 56
    const/4 v3, 0x2

    .line 57
    .line 58
    if-eq v0, v2, :cond_6

    .line 59
    .line 60
    if-eq v0, v3, :cond_3

    .line 61
    const/4 p2, 0x3

    .line 62
    .line 63
    if-eq v0, p2, :cond_6

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 69
    move-result v0

    .line 70
    .line 71
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastX:F

    .line 72
    sub-float/2addr v0, v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 76
    move-result v1

    .line 77
    .line 78
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastY:F

    .line 79
    sub-float/2addr v1, v3

    .line 80
    .line 81
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Laq/j;->v()Z

    .line 85
    move-result v3

    .line 86
    .line 87
    if-nez v3, :cond_4

    .line 88
    mul-float/2addr v0, v0

    .line 89
    mul-float/2addr v1, v1

    .line 90
    add-float/2addr v0, v1

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->getScaledTouchSlop()I

    .line 94
    move-result v1

    .line 95
    int-to-float v1, v1

    .line 96
    .line 97
    cmpg-float v0, v0, v1

    .line 98
    .line 99
    if-gez v0, :cond_4

    .line 100
    goto :goto_0

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 104
    move-result v0

    .line 105
    .line 106
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->nowX:F

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 110
    move-result p2

    .line 111
    .line 112
    iput p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->nowY:F

    .line 113
    .line 114
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->nowX:F

    .line 115
    .line 116
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastX:F

    .line 117
    sub-float/2addr v0, v1

    .line 118
    .line 119
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->transX:F

    .line 120
    .line 121
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastY:F

    .line 122
    sub-float/2addr p2, v1

    .line 123
    .line 124
    iput p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->transY:F

    .line 125
    .line 126
    iget v1, p4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 127
    int-to-float v1, v1

    .line 128
    add-float/2addr v1, v0

    .line 129
    float-to-int v0, v1

    .line 130
    .line 131
    iput v0, p4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 132
    .line 133
    iget v0, p4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 134
    int-to-float v0, v0

    .line 135
    add-float/2addr v0, p2

    .line 136
    float-to-int p2, v0

    .line 137
    .line 138
    iput p2, p4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 139
    .line 140
    .line 141
    invoke-interface {p3, p1, p4}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 142
    .line 143
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Laq/j;->v()Z

    .line 147
    move-result p1

    .line 148
    .line 149
    if-nez p1, :cond_5

    .line 150
    .line 151
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Laq/j;->j()Landroid/view/View;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    iget-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 160
    .line 161
    if-eqz p2, :cond_5

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Laq/j;->t()Lkotlin/jvm/functions/Function3;

    .line 165
    move-result-object p2

    .line 166
    .line 167
    if-eqz p2, :cond_5

    .line 168
    .line 169
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    invoke-interface {p2, p3, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    :cond_5
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v2}, Laq/j;->F(Z)V

    .line 178
    .line 179
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->nowX:F

    .line 180
    .line 181
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastX:F

    .line 182
    .line 183
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->nowY:F

    .line 184
    .line 185
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastY:F

    .line 186
    return-void

    .line 187
    .line 188
    :cond_6
    iget-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Laq/j;->v()Z

    .line 192
    move-result p2

    .line 193
    .line 194
    if-nez p2, :cond_7

    .line 195
    :goto_0
    return-void

    .line 196
    .line 197
    :cond_7
    iget p2, p4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 201
    move-result v0

    .line 202
    div-int/2addr v0, v3

    .line 203
    add-int/2addr p2, v0

    .line 204
    .line 205
    .line 206
    invoke-interface {p3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 207
    move-result-object v0

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    .line 211
    move-result v0

    .line 212
    div-int/2addr v0, v3

    .line 213
    .line 214
    if-lt p2, v0, :cond_8

    .line 215
    .line 216
    .line 217
    invoke-interface {p3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 218
    move-result-object p2

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Landroid/view/Display;->getWidth()I

    .line 222
    move-result p2

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 226
    move-result v0

    .line 227
    .line 228
    sub-int v1, p2, v0

    .line 229
    .line 230
    :cond_8
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->finalMoveX:I

    .line 231
    .line 232
    new-instance p2, Laq/h;

    .line 233
    .line 234
    .line 235
    invoke-direct {p2, p0, p4, p1, p3}, Laq/h;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;Landroid/view/WindowManager$LayoutParams;Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;Landroid/view/WindowManager;)V

    .line 236
    .line 237
    .line 238
    invoke-static {p2}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 239
    return-void

    .line 240
    .line 241
    .line 242
    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 243
    move-result p1

    .line 244
    .line 245
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastX:F

    .line 246
    .line 247
    .line 248
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 249
    move-result p1

    .line 250
    .line 251
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->lastY:F

    .line 252
    .line 253
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1, v1}, Laq/j;->F(Z)V

    .line 257
    return-void

    .line 258
    .line 259
    :cond_a
    :goto_1
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;->config:Laq/j;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v1}, Laq/j;->F(Z)V

    .line 263
    return-void
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
.end method
