.class public final Lcom/swmansion/gesturehandler/core/a;
.super Ljava/lang/Object;
.source "RotationGestureDetector.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/core/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR$\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008\u001c\u0010!R$\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\t\u0010$\u001a\u0004\u0008\u0017\u0010%R$\u0010\'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010$\u001a\u0004\u0008\u001a\u0010%R\u0016\u0010)\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010+R\u0016\u0010.\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010(R\u0011\u00100\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010/\u00a8\u00061"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/a;",
        "",
        "Lcom/swmansion/gesturehandler/core/a$a;",
        "gestureListener",
        "<init>",
        "(Lcom/swmansion/gesturehandler/core/a$a;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "f",
        "(Landroid/view/MotionEvent;)Z",
        "",
        "i",
        "(Landroid/view/MotionEvent;)V",
        "g",
        "()V",
        "",
        "eventAngle",
        "h",
        "(D)V",
        "a",
        "Lcom/swmansion/gesturehandler/core/a$a;",
        "",
        "b",
        "J",
        "currentTime",
        "c",
        "previousTime",
        "d",
        "D",
        "previousAngle",
        "value",
        "e",
        "()D",
        "rotation",
        "",
        "F",
        "()F",
        "anchorX",
        "anchorY",
        "Z",
        "isInProgress",
        "",
        "[I",
        "pointerIds",
        "j",
        "isPaused",
        "()J",
        "timeDelta",
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


# instance fields
.field public final a:Lcom/swmansion/gesturehandler/core/a$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:J

.field public c:J

.field public d:D

.field public e:D

.field public f:F

.field public g:F

.field public h:Z

.field public final i:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z


# direct methods
.method public constructor <init>(Lcom/swmansion/gesturehandler/core/a$a;)V
    .locals 0
    .param p1    # Lcom/swmansion/gesturehandler/core/a$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/swmansion/gesturehandler/core/a;->a:Lcom/swmansion/gesturehandler/core/a$a;

    .line 6
    const/4 p1, 0x2

    .line 7
    .line 8
    new-array p1, p1, [I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

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
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/a;->a:Lcom/swmansion/gesturehandler/core/a$a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p0}, Lcom/swmansion/gesturehandler/core/a$a;->c(Lcom/swmansion/gesturehandler/core/a;)V

    .line 17
    :cond_0
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/a;->f:F

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

.method public final c()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/a;->g:F

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

.method public final d()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

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

.method public final e()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->b:J

    .line 3
    .line 4
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->c:J

    .line 5
    sub-long/2addr v0, v2

    .line 6
    return-wide v0
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

.method public final f(Landroid/view/MotionEvent;)Z
    .locals 5
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
    const/4 v1, -0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    if-eq v0, v3, :cond_6

    .line 17
    const/4 v4, 0x2

    .line 18
    .line 19
    if-eq v0, v4, :cond_5

    .line 20
    const/4 v4, 0x5

    .line 21
    .line 22
    if-eq v0, v4, :cond_2

    .line 23
    const/4 v4, 0x6

    .line 24
    .line 25
    if-eq v0, v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 30
    .line 31
    if-eqz v0, :cond_8

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 35
    move-result v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 39
    move-result p1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 42
    .line 43
    aget v4, v0, v2

    .line 44
    .line 45
    if-ne p1, v4, :cond_1

    .line 46
    .line 47
    aget p1, v0, v3

    .line 48
    .line 49
    aput p1, v0, v2

    .line 50
    .line 51
    aput v1, v0, v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/a;->g()V

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_1
    aget v2, v0, v3

    .line 58
    .line 59
    if-ne p1, v2, :cond_8

    .line 60
    .line 61
    aput v1, v0, v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/a;->g()V

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :cond_2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 79
    move-result v1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 83
    move-result v1

    .line 84
    .line 85
    aput v1, v0, v3

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/a;->i(Landroid/view/MotionEvent;)V

    .line 89
    .line 90
    :cond_4
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 91
    .line 92
    if-nez v0, :cond_8

    .line 93
    .line 94
    iput-boolean v3, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 98
    move-result-wide v0

    .line 99
    .line 100
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->c:J

    .line 101
    .line 102
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 103
    .line 104
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->d:D

    .line 105
    .line 106
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/a;->a:Lcom/swmansion/gesturehandler/core/a$a;

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, p0}, Lcom/swmansion/gesturehandler/core/a$a;->a(Lcom/swmansion/gesturehandler/core/a;)Z

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :cond_5
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/a;->i(Landroid/view/MotionEvent;)V

    .line 120
    .line 121
    iget-boolean p1, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

    .line 122
    .line 123
    if-nez p1, :cond_8

    .line 124
    .line 125
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/a;->a:Lcom/swmansion/gesturehandler/core/a$a;

    .line 126
    .line 127
    if-eqz p1, :cond_8

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, p0}, Lcom/swmansion/gesturehandler/core/a$a;->b(Lcom/swmansion/gesturehandler/core/a;)Z

    .line 131
    goto :goto_0

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/a;->a()V

    .line 135
    goto :goto_0

    .line 136
    .line 137
    :cond_7
    iput-boolean v2, p0, Lcom/swmansion/gesturehandler/core/a;->h:Z

    .line 138
    .line 139
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 143
    move-result v4

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 147
    move-result p1

    .line 148
    .line 149
    aput p1, v0, v2

    .line 150
    .line 151
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 152
    .line 153
    aput v1, p1, v3

    .line 154
    :cond_8
    :goto_0
    return v3
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
.end method

.method public final g()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

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

.method public final h(D)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iput-wide p1, p0, Lcom/swmansion/gesturehandler/core/a;->d:D

    .line 8
    const/4 p1, 0x0

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/a;->j:Z

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
.end method

.method public final i(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->b:J

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->c:J

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->b:J

    .line 11
    .line 12
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    aget v0, v0, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 19
    move-result v0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/a;->i:[I

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    aget v1, v1, v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 28
    move-result v1

    .line 29
    const/4 v2, -0x1

    .line 30
    .line 31
    if-eq v0, v2, :cond_5

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    goto :goto_2

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 46
    move-result v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 50
    move-result p1

    .line 51
    .line 52
    sub-float v1, v3, v2

    .line 53
    .line 54
    sub-float v4, p1, v0

    .line 55
    add-float/2addr v2, v3

    .line 56
    .line 57
    const/high16 v3, 0x3f000000    # 0.5f

    .line 58
    mul-float/2addr v2, v3

    .line 59
    .line 60
    iput v2, p0, Lcom/swmansion/gesturehandler/core/a;->f:F

    .line 61
    add-float/2addr v0, p1

    .line 62
    mul-float/2addr v0, v3

    .line 63
    .line 64
    iput v0, p0, Lcom/swmansion/gesturehandler/core/a;->g:F

    .line 65
    float-to-double v2, v4

    .line 66
    float-to-double v0, v1

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 70
    move-result-wide v0

    .line 71
    neg-double v0, v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0, v1}, Lcom/swmansion/gesturehandler/core/a;->h(D)V

    .line 75
    .line 76
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->d:D

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    const-wide/16 v2, 0x0

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_1
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->d:D

    .line 88
    sub-double/2addr v2, v0

    .line 89
    .line 90
    :goto_0
    iput-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 91
    .line 92
    iput-wide v0, p0, Lcom/swmansion/gesturehandler/core/a;->d:D

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 98
    .line 99
    cmpl-double p1, v2, v0

    .line 100
    .line 101
    if-lez p1, :cond_2

    .line 102
    sub-double/2addr v2, v0

    .line 103
    .line 104
    iput-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 105
    goto :goto_1

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    :cond_2
    const-wide v4, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    .line 111
    .line 112
    cmpg-double p1, v2, v4

    .line 113
    .line 114
    if-gez p1, :cond_3

    .line 115
    add-double/2addr v2, v0

    .line 116
    .line 117
    iput-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 118
    .line 119
    :cond_3
    :goto_1
    iget-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    const-wide v4, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 125
    .line 126
    cmpl-double p1, v2, v4

    .line 127
    .line 128
    if-lez p1, :cond_4

    .line 129
    sub-double/2addr v2, v0

    .line 130
    .line 131
    iput-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 132
    return-void

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :cond_4
    const-wide v4, -0x4006de04abbbd2e8L    # -1.5707963267948966

    .line 138
    .line 139
    cmpg-double p1, v2, v4

    .line 140
    .line 141
    if-gez p1, :cond_5

    .line 142
    add-double/2addr v2, v0

    .line 143
    .line 144
    iput-wide v2, p0, Lcom/swmansion/gesturehandler/core/a;->e:D

    .line 145
    :cond_5
    :goto_2
    return-void
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
.end method
