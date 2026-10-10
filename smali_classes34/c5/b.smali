.class public Lc5/b;
.super Landroid/graphics/drawable/Drawable;
.source "AnimatedDrawable2.java"

# interfaces
.implements Landroid/graphics/drawable/Animatable;
.implements Lj4/a;


# static fields
.field public static final s:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final t:Lc5/d;


# instance fields
.field public b:Lv4/a;

.field public c:Le5/a;

.field public volatile d:Z

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:J

.field public j:J

.field public k:I

.field public l:J

.field public m:J

.field public n:I

.field public volatile o:Lc5/d;

.field public final p:Lv4/a$a;

.field public q:Lcom/facebook/drawee/drawable/d;

.field public final r:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lc5/b;

    .line 3
    .line 4
    sput-object v0, Lc5/b;->s:Ljava/lang/Class;

    .line 5
    .line 6
    new-instance v0, Lc5/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lc5/e;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lc5/b;->t:Lc5/d;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc5/b;-><init>(Lv4/a;)V

    return-void
.end method

.method public constructor <init>(Lv4/a;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const-wide/16 v0, 0x8

    .line 3
    iput-wide v0, p0, Lc5/b;->l:J

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lc5/b;->m:J

    .line 5
    sget-object v0, Lc5/b;->t:Lc5/d;

    iput-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 6
    new-instance v0, Lc5/a;

    invoke-direct {v0, p0}, Lc5/a;-><init>(Lc5/b;)V

    iput-object v0, p0, Lc5/b;->p:Lv4/a$a;

    .line 7
    new-instance v1, Lc5/b$a;

    invoke-direct {v1, p0}, Lc5/b$a;-><init>(Lc5/b;)V

    iput-object v1, p0, Lc5/b;->r:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Lc5/b;->b:Lv4/a;

    .line 9
    invoke-static {p1}, Lc5/b;->c(Lv4/a;)Le5/a;

    move-result-object v1

    iput-object v1, p0, Lc5/b;->c:Le5/a;

    if-eqz p1, :cond_0

    .line 10
    invoke-interface {p1, v0}, Lv4/a;->l(Lv4/a$a;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic b(Lc5/b;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lc5/b;->r:Ljava/lang/Runnable;

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
.end method

.method public static c(Lv4/a;)Le5/a;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    new-instance v0, Lcom/facebook/fresco/animation/frame/DropFramesFrameScheduler;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/facebook/fresco/animation/frame/DropFramesFrameScheduler;-><init>(Lv4/d;)V

    .line 10
    return-object v0
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


# virtual methods
.method public a()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lv4/a;->clear()V

    .line 8
    :cond_0
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
.end method

.method public final d()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 3
    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iget-object v0, p0, Lc5/b;->c:Le5/a;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lc5/b;->d()J

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    iget-boolean v2, p0, Lc5/b;->d:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-wide v2, p0, Lc5/b;->e:J

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    iget-wide v4, p0, Lc5/b;->m:J

    .line 25
    add-long/2addr v2, v4

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iget-wide v2, p0, Lc5/b;->f:J

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    :goto_0
    iget-object v4, p0, Lc5/b;->c:Le5/a;

    .line 37
    .line 38
    iget-wide v5, p0, Lc5/b;->f:J

    .line 39
    .line 40
    .line 41
    invoke-interface {v4, v2, v3, v5, v6}, Le5/a;->b(JJ)I

    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, -0x1

    .line 45
    .line 46
    if-ne v4, v6, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Lv4/d;->a()I

    .line 52
    move-result v0

    .line 53
    .line 54
    add-int/lit8 v4, v0, -0x1

    .line 55
    .line 56
    iget-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, p0}, Lc5/d;->d(Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    iput-boolean v5, p0, Lc5/b;->d:Z

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_2
    if-nez v4, :cond_3

    .line 65
    .line 66
    iget v7, p0, Lc5/b;->h:I

    .line 67
    .line 68
    if-eq v7, v6, :cond_3

    .line 69
    .line 70
    iget-wide v6, p0, Lc5/b;->g:J

    .line 71
    .line 72
    cmp-long v0, v0, v6

    .line 73
    .line 74
    if-ltz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p0}, Lc5/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 80
    .line 81
    :cond_3
    :goto_1
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p0, p1, v4}, Lv4/a;->m(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z

    .line 85
    move-result p1

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    iget-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, p0, v4}, Lc5/d;->b(Landroid/graphics/drawable/Drawable;I)V

    .line 93
    .line 94
    iput v4, p0, Lc5/b;->h:I

    .line 95
    .line 96
    :cond_4
    if-nez p1, :cond_5

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lc5/b;->e()V

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-virtual {p0}, Lc5/b;->d()J

    .line 103
    move-result-wide v0

    .line 104
    .line 105
    iget-boolean p1, p0, Lc5/b;->d:Z

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    iget-object p1, p0, Lc5/b;->c:Le5/a;

    .line 110
    .line 111
    iget-wide v6, p0, Lc5/b;->e:J

    .line 112
    sub-long/2addr v0, v6

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v0, v1}, Le5/a;->a(J)J

    .line 116
    move-result-wide v0

    .line 117
    .line 118
    const-wide/16 v6, -0x1

    .line 119
    .line 120
    cmp-long p1, v0, v6

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    iget-wide v4, p0, Lc5/b;->l:J

    .line 125
    add-long/2addr v0, v4

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0, v1}, Lc5/b;->f(J)V

    .line 129
    goto :goto_2

    .line 130
    .line 131
    :cond_6
    iget-object p1, p0, Lc5/b;->o:Lc5/d;

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, p0}, Lc5/d;->d(Landroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    iput-boolean v5, p0, Lc5/b;->d:Z

    .line 137
    .line 138
    :cond_7
    :goto_2
    iput-wide v2, p0, Lc5/b;->f:J

    .line 139
    :cond_8
    :goto_3
    return-void
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
.end method

.method public final e()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lc5/b;->n:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lc5/b;->n:I

    .line 7
    const/4 v0, 0x2

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lc5/b;->s:Ljava/lang/Class;

    .line 16
    .line 17
    iget v1, p0, Lc5/b;->n:I

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "Dropped a frame. Count: %s"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    :cond_0
    return-void
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
.end method

.method public final f(J)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lc5/b;->e:J

    .line 3
    add-long/2addr v0, p1

    .line 4
    .line 5
    iput-wide v0, p0, Lc5/b;->g:J

    .line 6
    .line 7
    iget-object p1, p0, Lc5/b;->r:Ljava/lang/Runnable;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0, v1}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

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
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Lv4/a;->d()I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Lv4/a;->c()I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
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
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lc5/b;->d:Z

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
    .line 18
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lv4/a;->e(Landroid/graphics/Rect;)V

    .line 11
    :cond_0
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
.end method

.method public onLevelChange(I)Z
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lc5/b;->d:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    iget-wide v2, p0, Lc5/b;->f:J

    .line 9
    int-to-long v4, p1

    .line 10
    .line 11
    cmp-long p1, v2, v4

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iput-wide v4, p0, Lc5/b;->f:J

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v1
    .line 22
    .line 23
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/drawee/drawable/d;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/facebook/drawee/drawable/d;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->b(I)V

    .line 17
    .line 18
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Lv4/a;->j(I)V

    .line 24
    :cond_1
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
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/drawee/drawable/d;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/facebook/drawee/drawable/d;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lc5/b;->q:Lcom/facebook/drawee/drawable/d;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->c(Landroid/graphics/ColorFilter;)V

    .line 17
    .line 18
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Lv4/a;->f(Landroid/graphics/ColorFilter;)V

    .line 24
    :cond_1
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
.end method

.method public start()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lc5/b;->d:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lc5/b;->b:Lv4/a;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lv4/d;->a()I

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-gt v0, v1, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iput-boolean v1, p0, Lc5/b;->d:Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lc5/b;->d()J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    iget-wide v2, p0, Lc5/b;->i:J

    .line 25
    .line 26
    sub-long v2, v0, v2

    .line 27
    .line 28
    iput-wide v2, p0, Lc5/b;->e:J

    .line 29
    .line 30
    iput-wide v2, p0, Lc5/b;->g:J

    .line 31
    .line 32
    iget-wide v2, p0, Lc5/b;->j:J

    .line 33
    sub-long/2addr v0, v2

    .line 34
    .line 35
    iput-wide v0, p0, Lc5/b;->f:J

    .line 36
    .line 37
    iget v0, p0, Lc5/b;->k:I

    .line 38
    .line 39
    iput v0, p0, Lc5/b;->h:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 43
    .line 44
    iget-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p0}, Lc5/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 48
    :cond_1
    :goto_0
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
.end method

.method public stop()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lc5/b;->d:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lc5/b;->d()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iget-wide v2, p0, Lc5/b;->e:J

    .line 12
    .line 13
    sub-long v2, v0, v2

    .line 14
    .line 15
    iput-wide v2, p0, Lc5/b;->i:J

    .line 16
    .line 17
    iget-wide v2, p0, Lc5/b;->f:J

    .line 18
    sub-long/2addr v0, v2

    .line 19
    .line 20
    iput-wide v0, p0, Lc5/b;->j:J

    .line 21
    .line 22
    iget v0, p0, Lc5/b;->h:I

    .line 23
    .line 24
    iput v0, p0, Lc5/b;->k:I

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    iput-boolean v0, p0, Lc5/b;->d:Z

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    iput-wide v0, p0, Lc5/b;->e:J

    .line 32
    .line 33
    iput-wide v0, p0, Lc5/b;->g:J

    .line 34
    .line 35
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    iput-wide v0, p0, Lc5/b;->f:J

    .line 38
    const/4 v0, -0x1

    .line 39
    .line 40
    iput v0, p0, Lc5/b;->h:I

    .line 41
    .line 42
    iget-object v0, p0, Lc5/b;->r:Ljava/lang/Runnable;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    iget-object v0, p0, Lc5/b;->o:Lc5/d;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, p0}, Lc5/d;->d(Landroid/graphics/drawable/Drawable;)V

    .line 51
    return-void
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
.end method
