.class public final Lcom/kubi/rn/kline/KlineChartScrollView;
.super Lcom/facebook/react/views/scroll/ReactScrollView;
.source "KlineChartScrollView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/rn/kline/KlineChartScrollView$Companion;,
        Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;,
        Lcom/kubi/rn/kline/KlineChartScrollView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0008\u0010\u0019\u001a\u00020\u0016H\u0002J\u0008\u0010\u001a\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/rn/kline/KlineChartScrollView;",
        "Lcom/facebook/react/views/scroll/ReactScrollView;",
        "context",
        "Lcom/facebook/react/bridge/ReactContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "touchSlop",
        "",
        "longPressTimeout",
        "",
        "downX",
        "",
        "downY",
        "downTime",
        "gestureActive",
        "",
        "gestureDirection",
        "Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;",
        "onInterceptTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "requestDisallowInterceptTouchEvent",
        "",
        "disallowIntercept",
        "interceptMove",
        "lockToChart",
        "resetGesture",
        "GestureDirection",
        "Companion",
        "BReactNativeLib_googleRelease"
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
.field public static final Companion:Lcom/kubi/rn/kline/KlineChartScrollView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DIRECTION_DOMINANCE_RATIO:F = 1.0f


# instance fields
.field private downTime:J

.field private downX:F

.field private downY:F

.field private gestureActive:Z

.field private gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final longPressTimeout:J

.field private final touchSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/kline/KlineChartScrollView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/rn/kline/KlineChartScrollView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/rn/kline/KlineChartScrollView;->Companion:Lcom/kubi/rn/kline/KlineChartScrollView$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2
    .param p1    # Lcom/facebook/react/bridge/ReactContext;
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
    .line 8
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 16
    move-result p1

    .line 17
    .line 18
    iput p1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->touchSlop:I

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 22
    move-result p1

    .line 23
    int-to-long v0, p1

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->longPressTimeout:J

    .line 26
    .line 27
    sget-object p1, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->UNDECIDED:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 30
    return-void
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
.end method

.method private final interceptMove(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/rn/kline/KlineChartScrollView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    const/4 v1, 0x2

    .line 16
    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    const/4 v1, 0x3

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 24
    move-result v0

    .line 25
    .line 26
    iget v1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downX:F

    .line 27
    sub-float/2addr v0, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 35
    move-result v1

    .line 36
    .line 37
    iget v3, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downY:F

    .line 38
    sub-float/2addr v1, v3

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 42
    move-result v1

    .line 43
    float-to-double v3, v0

    .line 44
    float-to-double v5, v1

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    .line 48
    move-result-wide v3

    .line 49
    double-to-float v3, v3

    .line 50
    .line 51
    iget v4, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->touchSlop:I

    .line 52
    int-to-float v4, v4

    .line 53
    .line 54
    cmpg-float v3, v3, v4

    .line 55
    .line 56
    if-gtz v3, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    .line 63
    :cond_0
    const/high16 v3, 0x3f800000    # 1.0f

    .line 64
    mul-float/2addr v0, v3

    .line 65
    .line 66
    cmpl-float v0, v1, v0

    .line 67
    .line 68
    if-lez v0, :cond_1

    .line 69
    .line 70
    sget-object v0, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->PAGE:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 71
    .line 72
    iput-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 73
    .line 74
    .line 75
    invoke-super {p0, v2}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 76
    .line 77
    .line 78
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->lockToChart()V

    .line 84
    return v2

    .line 85
    .line 86
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 90
    throw p1

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 94
    move-result p1

    .line 95
    return p1

    .line 96
    :cond_4
    return v2
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
.end method

.method private final lockToChart()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->CHART:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    .line 8
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 9
    return-void
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
.end method

.method private final resetGesture()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureActive:Z

    .line 4
    .line 5
    sget-object v1, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->UNDECIDED:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 6
    .line 7
    iput-object v1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downTime:J

    .line 12
    .line 13
    .line 14
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 15
    return-void
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
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eq v0, v1, :cond_3

    .line 16
    const/4 v3, 0x2

    .line 17
    .line 18
    if-eq v0, v3, :cond_2

    .line 19
    const/4 v3, 0x3

    .line 20
    .line 21
    if-eq v0, v3, :cond_3

    .line 22
    const/4 v3, 0x5

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 27
    .line 28
    sget-object v3, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->PAGE:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 29
    .line 30
    if-ne v0, v3, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    return v1

    .line 38
    :cond_0
    return v2

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->lockToChart()V

    .line 42
    return v2

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-direct {p0, p1}, Lcom/kubi/rn/kline/KlineChartScrollView;->interceptMove(Landroid/view/MotionEvent;)Z

    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    .line 49
    :cond_3
    iget-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 50
    .line 51
    sget-object v3, Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;->PAGE:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 52
    .line 53
    if-ne v0, v3, :cond_4

    .line 54
    .line 55
    .line 56
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    move v1, v2

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->resetGesture()V

    .line 65
    return v1

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->resetGesture()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 72
    move-result v0

    .line 73
    .line 74
    iput v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downX:F

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 78
    move-result v0

    .line 79
    .line 80
    iput v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downY:F

    .line 81
    .line 82
    .line 83
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 84
    move-result-wide v2

    .line 85
    .line 86
    iput-wide v2, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downTime:J

    .line 87
    .line 88
    iput-boolean v1, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureActive:Z

    .line 89
    .line 90
    .line 91
    invoke-super {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 92
    move-result p1

    .line 93
    return p1
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
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureActive:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->gestureDirection:Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/rn/kline/KlineChartScrollView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    move-result v0

    .line 17
    .line 18
    aget v0, v1, v0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    const/4 v1, 0x2

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    const/4 v1, 0x3

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-wide v0, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downTime:J

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    cmp-long p1, v0, v2

    .line 36
    .line 37
    if-lez p1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 41
    move-result-wide v0

    .line 42
    .line 43
    iget-wide v2, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->downTime:J

    .line 44
    sub-long/2addr v0, v2

    .line 45
    .line 46
    iget-wide v2, p0, Lcom/kubi/rn/kline/KlineChartScrollView;->longPressTimeout:J

    .line 47
    .line 48
    cmp-long p1, v0, v2

    .line 49
    .line 50
    if-ltz p1, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->lockToChart()V

    .line 54
    :cond_1
    return-void

    .line 55
    .line 56
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 57
    .line 58
    .line 59
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 60
    throw p1

    .line 61
    :cond_3
    const/4 p1, 0x0

    .line 62
    .line 63
    .line 64
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 65
    return-void

    .line 66
    .line 67
    :cond_4
    if-eqz p1, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-super {p0, v1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 71
    return-void

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-direct {p0}, Lcom/kubi/rn/kline/KlineChartScrollView;->resetGesture()V

    .line 75
    return-void
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
.end method
