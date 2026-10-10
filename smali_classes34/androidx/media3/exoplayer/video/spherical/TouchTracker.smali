.class final Landroidx/media3/exoplayer/video/spherical/TouchTracker;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "TouchTracker.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroidx/media3/exoplayer/video/spherical/OrientationListener$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;
    }
.end annotation


# static fields
.field static final MAX_PITCH_DEGREES:F = 45.0f


# instance fields
.field private final accumulatedTouchOffsetDegrees:Landroid/graphics/PointF;

.field private final gestureDetector:Landroid/view/GestureDetector;

.field private final listener:Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;

.field private final previousTouchPointPx:Landroid/graphics/PointF;

.field private final pxPerDegrees:F

.field private volatile roll:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;F)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/PointF;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->previousTouchPointPx:Landroid/graphics/PointF;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/PointF;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->accumulatedTouchOffsetDegrees:Landroid/graphics/PointF;

    .line 18
    .line 19
    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->listener:Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;

    .line 20
    .line 21
    iput p3, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->pxPerDegrees:F

    .line 22
    .line 23
    new-instance p2, Landroid/view/GestureDetector;

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 27
    .line 28
    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->gestureDetector:Landroid/view/GestureDetector;

    .line 29
    .line 30
    .line 31
    const p1, 0x40490fdb    # (float)Math.PI

    .line 32
    .line 33
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->roll:F

    .line 34
    return-void
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
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->previousTouchPointPx:Landroid/graphics/PointF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onOrientationChange([FF)V
    .locals 0
    .annotation build Landroidx/annotation/BinderThread;
    .end annotation

    .line 1
    neg-float p1, p2

    .line 2
    .line 3
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->roll:F

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

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 4
    move-result p1

    .line 5
    .line 6
    iget-object p3, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->previousTouchPointPx:Landroid/graphics/PointF;

    .line 7
    .line 8
    iget p3, p3, Landroid/graphics/PointF;->x:F

    .line 9
    sub-float/2addr p1, p3

    .line 10
    .line 11
    iget p3, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->pxPerDegrees:F

    .line 12
    div-float/2addr p1, p3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 16
    move-result p3

    .line 17
    .line 18
    iget-object p4, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->previousTouchPointPx:Landroid/graphics/PointF;

    .line 19
    .line 20
    iget v0, p4, Landroid/graphics/PointF;->y:F

    .line 21
    sub-float/2addr p3, v0

    .line 22
    .line 23
    iget v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->pxPerDegrees:F

    .line 24
    div-float/2addr p3, v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 28
    move-result v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 32
    move-result p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p4, v0, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 36
    .line 37
    iget p2, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->roll:F

    .line 38
    float-to-double v0, p2

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 42
    move-result-wide v2

    .line 43
    double-to-float p2, v2

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 47
    move-result-wide v0

    .line 48
    double-to-float p4, v0

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->accumulatedTouchOffsetDegrees:Landroid/graphics/PointF;

    .line 51
    .line 52
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 53
    .line 54
    mul-float v2, p2, p1

    .line 55
    .line 56
    mul-float v3, p4, p3

    .line 57
    sub-float/2addr v2, v3

    .line 58
    sub-float/2addr v1, v2

    .line 59
    .line 60
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 63
    mul-float/2addr p4, p1

    .line 64
    mul-float/2addr p2, p3

    .line 65
    add-float/2addr p4, p2

    .line 66
    add-float/2addr v1, p4

    .line 67
    .line 68
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 69
    .line 70
    const/high16 p1, 0x42340000    # 45.0f

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 74
    move-result p1

    .line 75
    .line 76
    const/high16 p2, -0x3dcc0000    # -45.0f

    .line 77
    .line 78
    .line 79
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 80
    move-result p1

    .line 81
    .line 82
    iput p1, v0, Landroid/graphics/PointF;->y:F

    .line 83
    .line 84
    iget-object p1, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->listener:Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;

    .line 85
    .line 86
    iget-object p2, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->accumulatedTouchOffsetDegrees:Landroid/graphics/PointF;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;->onScrollChange(Landroid/graphics/PointF;)V

    .line 90
    const/4 p1, 0x1

    .line 91
    return p1
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
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->listener:Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/spherical/TouchTracker$Listener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/media3/exoplayer/video/spherical/TouchTracker;->gestureDetector:Landroid/view/GestureDetector;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
