.class public final Lcom/swmansion/gesturehandler/core/TapGestureHandler;
.super Lcom/swmansion/gesturehandler/core/GestureHandler;
.source "TapGestureHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/core/TapGestureHandler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/swmansion/gesturehandler/core/GestureHandler<",
        "Lcom/swmansion/gesturehandler/core/TapGestureHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 N2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u000cJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008&\u0010\u0003J\u000f\u0010\'\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0003R\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010-\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010*R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010*R\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00101R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00104R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00104R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u0010*R\u0016\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010*R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010*R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010*R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010*R\u0016\u0010C\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010*R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u00104R\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010L\u00a8\u0006P"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/TapGestureHandler;",
        "Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "<init>",
        "()V",
        "",
        "c1",
        "()Z",
        "",
        "o0",
        "",
        "numberOfTaps",
        "b1",
        "(I)Lcom/swmansion/gesturehandler/core/TapGestureHandler;",
        "",
        "maxDelayMs",
        "V0",
        "(J)Lcom/swmansion/gesturehandler/core/TapGestureHandler;",
        "maxDurationMs",
        "X0",
        "",
        "deltaX",
        "Y0",
        "(F)Lcom/swmansion/gesturehandler/core/TapGestureHandler;",
        "deltaY",
        "Z0",
        "maxDist",
        "W0",
        "minNumberOfPointers",
        "a1",
        "Landroid/view/MotionEvent;",
        "event",
        "sourceEvent",
        "h0",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V",
        "force",
        "j",
        "(Z)V",
        "g0",
        "k0",
        "d1",
        "T0",
        "N",
        "F",
        "maxDeltaX",
        "O",
        "maxDeltaY",
        "P",
        "maxDistSq",
        "Q",
        "J",
        "R",
        "S",
        "I",
        "T",
        "U",
        "currentMaxNumberOfPointers",
        "V",
        "startX",
        "W",
        "startY",
        "X",
        "offsetX",
        "Y",
        "offsetY",
        "Z",
        "lastX",
        "a0",
        "lastY",
        "Landroid/os/Handler;",
        "b0",
        "Landroid/os/Handler;",
        "handler",
        "c0",
        "tapsSoFar",
        "Ljava/lang/Runnable;",
        "d0",
        "Ljava/lang/Runnable;",
        "failDelayed",
        "e0",
        "Companion",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e0:Lcom/swmansion/gesturehandler/core/TapGestureHandler$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public N:F

.field public O:F

.field public P:F

.field public Q:J

.field public R:J

.field public S:I

.field public T:I

.field public U:I

.field public V:F

.field public W:F

.field public X:F

.field public Y:F

.field public Z:F

.field public a0:F

.field public b0:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c0:I

.field public final d0:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/gesturehandler/core/TapGestureHandler$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/core/TapGestureHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->e0:Lcom/swmansion/gesturehandler/core/TapGestureHandler$Companion;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->N:F

    .line 7
    .line 8
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->O:F

    .line 9
    .line 10
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->P:F

    .line 11
    .line 12
    const-wide/16 v0, 0x1f4

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Q:J

    .line 15
    .line 16
    const-wide/16 v0, 0xc8

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->R:J

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->S:I

    .line 22
    .line 23
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->T:I

    .line 24
    .line 25
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U:I

    .line 26
    .line 27
    new-instance v1, Lrb0/p;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, p0}, Lrb0/p;-><init>(Lcom/swmansion/gesturehandler/core/TapGestureHandler;)V

    .line 31
    .line 32
    iput-object v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->d0:Ljava/lang/Runnable;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->E0(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 36
    return-void
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

.method public static synthetic S0(Lcom/swmansion/gesturehandler/core/TapGestureHandler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U0(Lcom/swmansion/gesturehandler/core/TapGestureHandler;)V

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
.end method

.method public static final U0(Lcom/swmansion/gesturehandler/core/TapGestureHandler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->B()V

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
.end method

.method private final c1()Z
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Z:F

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->V:F

    .line 5
    sub-float/2addr v0, v1

    .line 6
    .line 7
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->X:F

    .line 8
    add-float/2addr v0, v1

    .line 9
    .line 10
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->N:F

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    cmpg-float v1, v1, v2

    .line 14
    const/4 v3, 0x1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 21
    move-result v1

    .line 22
    .line 23
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->N:F

    .line 24
    .line 25
    cmpl-float v1, v1, v4

    .line 26
    .line 27
    if-lez v1, :cond_1

    .line 28
    return v3

    .line 29
    .line 30
    :cond_1
    :goto_0
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->a0:F

    .line 31
    .line 32
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->W:F

    .line 33
    sub-float/2addr v1, v4

    .line 34
    .line 35
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Y:F

    .line 36
    add-float/2addr v1, v4

    .line 37
    .line 38
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->O:F

    .line 39
    .line 40
    cmpg-float v4, v4, v2

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    goto :goto_1

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 47
    move-result v4

    .line 48
    .line 49
    iget v5, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->O:F

    .line 50
    .line 51
    cmpl-float v4, v4, v5

    .line 52
    .line 53
    if-lez v4, :cond_3

    .line 54
    return v3

    .line 55
    :cond_3
    :goto_1
    mul-float/2addr v1, v1

    .line 56
    mul-float/2addr v0, v0

    .line 57
    add-float/2addr v1, v0

    .line 58
    .line 59
    iget v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->P:F

    .line 60
    .line 61
    cmpg-float v2, v0, v2

    .line 62
    .line 63
    if-nez v2, :cond_4

    .line 64
    goto :goto_2

    .line 65
    .line 66
    :cond_4
    cmpl-float v0, v1, v0

    .line 67
    .line 68
    if-lez v0, :cond_5

    .line 69
    return v3

    .line 70
    :cond_5
    :goto_2
    const/4 v0, 0x0

    .line 71
    return v0
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
.end method


# virtual methods
.method public final T0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 24
    .line 25
    :goto_0
    iget v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->c0:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->c0:I

    .line 30
    .line 31
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->S:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    iget v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U:I

    .line 36
    .line 37
    iget v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->T:I

    .line 38
    .line 39
    if-lt v0, v1, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->i()V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    .line 50
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->d0:Ljava/lang/Runnable;

    .line 51
    .line 52
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->R:J

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    return-void
    .line 57
.end method

.method public final V0(J)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->R:J

    .line 3
    return-object p0
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
.end method

.method public final W0(F)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    mul-float/2addr p1, p1

    .line 2
    .line 3
    iput p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->P:F

    .line 4
    return-object p0
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
.end method

.method public final X0(J)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Q:J

    .line 3
    return-object p0
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
.end method

.method public final Y0(F)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->N:F

    .line 3
    return-object p0
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
.end method

.method public final Z0(F)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->O:F

    .line 3
    return-object p0
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
.end method

.method public final a1(I)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->T:I

    .line 3
    return-object p0
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
.end method

.method public final b1(I)Lcom/swmansion/gesturehandler/core/TapGestureHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->S:I

    .line 3
    return-object p0
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
.end method

.method public final d1()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 24
    .line 25
    :goto_0
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->d0:Ljava/lang/Runnable;

    .line 31
    .line 32
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Q:J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    return-void
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

.method public g0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    :cond_0
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public h0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 5
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
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
    const-string/jumbo p1, "sourceEvent"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->H0(Landroid/view/MotionEvent;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Q()I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->X:F

    .line 34
    .line 35
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Y:F

    .line 36
    .line 37
    sget-object v2, Lrb0/h;->a:Lrb0/h;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p2, v1}, Lrb0/h;->b(Landroid/view/MotionEvent;Z)F

    .line 41
    move-result v3

    .line 42
    .line 43
    iput v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->V:F

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p2, v1}, Lrb0/h;->c(Landroid/view/MotionEvent;Z)F

    .line 47
    move-result v2

    .line 48
    .line 49
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->W:F

    .line 50
    :cond_1
    const/4 v2, 0x5

    .line 51
    .line 52
    if-eq v0, v2, :cond_2

    .line 53
    const/4 v2, 0x6

    .line 54
    .line 55
    if-eq v0, v2, :cond_2

    .line 56
    .line 57
    sget-object v2, Lrb0/h;->a:Lrb0/h;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p2, v1}, Lrb0/h;->b(Landroid/view/MotionEvent;Z)F

    .line 61
    move-result v3

    .line 62
    .line 63
    iput v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Z:F

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p2, v1}, Lrb0/h;->c(Landroid/view/MotionEvent;Z)F

    .line 67
    move-result v2

    .line 68
    .line 69
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->a0:F

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_2
    iget v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->X:F

    .line 73
    .line 74
    iget v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Z:F

    .line 75
    .line 76
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->V:F

    .line 77
    sub-float/2addr v3, v4

    .line 78
    add-float/2addr v2, v3

    .line 79
    .line 80
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->X:F

    .line 81
    .line 82
    iget v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Y:F

    .line 83
    .line 84
    iget v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->a0:F

    .line 85
    .line 86
    iget v4, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->W:F

    .line 87
    sub-float/2addr v3, v4

    .line 88
    add-float/2addr v2, v3

    .line 89
    .line 90
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Y:F

    .line 91
    .line 92
    sget-object v2, Lrb0/h;->a:Lrb0/h;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p2, v1}, Lrb0/h;->b(Landroid/view/MotionEvent;Z)F

    .line 96
    move-result v3

    .line 97
    .line 98
    iput v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Z:F

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, p2, v1}, Lrb0/h;->c(Landroid/view/MotionEvent;Z)F

    .line 102
    move-result v2

    .line 103
    .line 104
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->a0:F

    .line 105
    .line 106
    iget v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Z:F

    .line 107
    .line 108
    iput v3, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->V:F

    .line 109
    .line 110
    iput v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->W:F

    .line 111
    .line 112
    :goto_0
    iget v2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 116
    move-result v3

    .line 117
    .line 118
    if-ge v2, v3, :cond_3

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 122
    move-result p2

    .line 123
    .line 124
    iput p2, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U:I

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->c1()Z

    .line 128
    move-result p2

    .line 129
    .line 130
    if-eqz p2, :cond_4

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->B()V

    .line 134
    return-void

    .line 135
    .line 136
    :cond_4
    const/16 p2, 0xb

    .line 137
    .line 138
    if-nez p1, :cond_6

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    if-eq v0, p2, :cond_5

    .line 143
    goto :goto_1

    .line 144
    .line 145
    .line 146
    :cond_5
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->n()V

    .line 147
    .line 148
    .line 149
    :goto_1
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->d1()V

    .line 150
    return-void

    .line 151
    :cond_6
    const/4 v2, 0x2

    .line 152
    .line 153
    if-ne p1, v2, :cond_9

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    if-eq v0, v1, :cond_7

    .line 158
    .line 159
    if-eq v0, p2, :cond_8

    .line 160
    .line 161
    const/16 p1, 0xc

    .line 162
    .line 163
    if-eq v0, p1, :cond_7

    .line 164
    goto :goto_2

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->T0()V

    .line 168
    return-void

    .line 169
    .line 170
    .line 171
    :cond_8
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->d1()V

    .line 172
    :cond_9
    :goto_2
    return-void
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
.end method

.method public j(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->j(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->z()V

    .line 7
    return-void
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
.end method

.method public k0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->c0:I

    .line 4
    .line 5
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->U:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->b0:Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public o0()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->o0()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->N:F

    .line 7
    .line 8
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->O:F

    .line 9
    .line 10
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->P:F

    .line 11
    .line 12
    const-wide/16 v0, 0x1f4

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->Q:J

    .line 15
    .line 16
    const-wide/16 v0, 0xc8

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->R:J

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->S:I

    .line 22
    .line 23
    iput v0, p0, Lcom/swmansion/gesturehandler/core/TapGestureHandler;->T:I

    .line 24
    return-void
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
