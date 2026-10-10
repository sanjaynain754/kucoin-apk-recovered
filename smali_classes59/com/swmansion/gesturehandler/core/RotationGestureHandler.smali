.class public final Lcom/swmansion/gesturehandler/core/RotationGestureHandler;
.super Lcom/swmansion/gesturehandler/core/GestureHandler;
.source "RotationGestureHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/core/RotationGestureHandler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/swmansion/gesturehandler/core/GestureHandler<",
        "Lcom/swmansion/gesturehandler/core/RotationGestureHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 +2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R$\u0010&\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008$\u0010 \u001a\u0004\u0008%\u0010\"R\u0014\u0010*\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006-"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/RotationGestureHandler;",
        "Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "<init>",
        "()V",
        "Landroid/view/MotionEvent;",
        "event",
        "sourceEvent",
        "",
        "h0",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V",
        "",
        "force",
        "j",
        "(Z)V",
        "k0",
        "p0",
        "Lcom/swmansion/gesturehandler/core/a;",
        "N",
        "Lcom/swmansion/gesturehandler/core/a;",
        "rotationGestureDetector",
        "",
        "value",
        "O",
        "D",
        "W0",
        "()D",
        "rotation",
        "P",
        "X0",
        "velocity",
        "",
        "Q",
        "F",
        "U0",
        "()F",
        "anchorX",
        "R",
        "V0",
        "anchorY",
        "Lcom/swmansion/gesturehandler/core/a$a;",
        "S",
        "Lcom/swmansion/gesturehandler/core/a$a;",
        "gestureListener",
        "T",
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
.field public static final T:Lcom/swmansion/gesturehandler/core/RotationGestureHandler$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public N:Lcom/swmansion/gesturehandler/core/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public O:D

.field public P:D

.field public Q:F

.field public R:F

.field public final S:Lcom/swmansion/gesturehandler/core/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/core/RotationGestureHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->T:Lcom/swmansion/gesturehandler/core/RotationGestureHandler$Companion;

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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->Q:F

    .line 8
    .line 9
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->R:F

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->E0(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 14
    .line 15
    new-instance v0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler$a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/swmansion/gesturehandler/core/RotationGestureHandler$a;-><init>(Lcom/swmansion/gesturehandler/core/RotationGestureHandler;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->S:Lcom/swmansion/gesturehandler/core/a$a;

    .line 21
    return-void
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

.method public static final synthetic S0(Lcom/swmansion/gesturehandler/core/RotationGestureHandler;D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->O:D

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
.end method

.method public static final synthetic T0(Lcom/swmansion/gesturehandler/core/RotationGestureHandler;D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->P:D

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
.end method


# virtual methods
.method public final U0()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->Q:F

    .line 3
    return v0
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
.end method

.method public final V0()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->R:F

    .line 3
    return v0
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
.end method

.method public final W0()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->O:D

    .line 3
    return-wide v0
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
.end method

.method public final X0()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->P:D

    .line 3
    return-wide v0
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
.end method

.method public h0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 2
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
    const-string/jumbo v0, "sourceEvent"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Q()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->p0()V

    .line 21
    .line 22
    new-instance v0, Lcom/swmansion/gesturehandler/core/a;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->S:Lcom/swmansion/gesturehandler/core/a$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/core/a;-><init>(Lcom/swmansion/gesturehandler/core/a$a;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->N:Lcom/swmansion/gesturehandler/core/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 33
    move-result v0

    .line 34
    .line 35
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->Q:F

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    move-result p1

    .line 40
    .line 41
    iput p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->R:F

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->n()V

    .line 45
    .line 46
    :cond_0
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->N:Lcom/swmansion/gesturehandler/core/a;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/swmansion/gesturehandler/core/a;->f(Landroid/view/MotionEvent;)Z

    .line 52
    .line 53
    :cond_1
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->N:Lcom/swmansion/gesturehandler/core/a;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v0, Landroid/graphics/PointF;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/a;->b()F

    .line 61
    move-result v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/a;->c()F

    .line 65
    move-result p1

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->O0(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->Q:F

    .line 77
    .line 78
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 79
    .line 80
    iput p1, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->R:F

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 84
    move-result p1

    .line 85
    const/4 p2, 0x1

    .line 86
    .line 87
    if-ne p1, p2, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Q()I

    .line 91
    move-result p1

    .line 92
    const/4 p2, 0x4

    .line 93
    .line 94
    if-ne p1, p2, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->z()V

    .line 98
    return-void

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->B()V

    .line 102
    :cond_4
    return-void
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
.end method

.method public j(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Q()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->p0()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-super {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->j(Z)V

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
.end method

.method public k0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->N:Lcom/swmansion/gesturehandler/core/a;

    .line 4
    .line 5
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 6
    .line 7
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->Q:F

    .line 8
    .line 9
    iput v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->R:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->p0()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public p0()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->P:D

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/RotationGestureHandler;->O:D

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
.end method
