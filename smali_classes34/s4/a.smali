.class public Ls4/a;
.super Ljava/lang/Object;
.source "GestureDetector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls4/a$a;
    }
.end annotation


# instance fields
.field public a:Ls4/a$a;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final b:F
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public c:Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public d:Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public e:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public f:F
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public g:F
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 11
    move-result p1

    .line 12
    int-to-float p1, p1

    .line 13
    .line 14
    iput p1, p0, Ls4/a;->b:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ls4/a;->a()V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static c(Landroid/content/Context;)Ls4/a;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ls4/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Ls4/a;-><init>(Landroid/content/Context;)V

    .line 6
    return-object v0
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


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Ls4/a;->a:Ls4/a$a;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls4/a;->e()V

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
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ls4/a;->c:Z

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

.method public d(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    const/4 v3, 0x2

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    const/4 p1, 0x3

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    iput-boolean v2, p0, Ls4/a;->c:Z

    .line 21
    .line 22
    iput-boolean v2, p0, Ls4/a;->d:Z

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 28
    move-result v0

    .line 29
    .line 30
    iget v3, p0, Ls4/a;->f:F

    .line 31
    sub-float/2addr v0, v3

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 35
    move-result v0

    .line 36
    .line 37
    iget v3, p0, Ls4/a;->b:F

    .line 38
    .line 39
    cmpl-float v0, v0, v3

    .line 40
    .line 41
    if-gtz v0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 45
    move-result p1

    .line 46
    .line 47
    iget v0, p0, Ls4/a;->g:F

    .line 48
    sub-float/2addr p1, v0

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 52
    move-result p1

    .line 53
    .line 54
    iget v0, p0, Ls4/a;->b:F

    .line 55
    .line 56
    cmpl-float p1, p1, v0

    .line 57
    .line 58
    if-lez p1, :cond_8

    .line 59
    .line 60
    :cond_2
    iput-boolean v2, p0, Ls4/a;->d:Z

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_3
    iput-boolean v2, p0, Ls4/a;->c:Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 67
    move-result v0

    .line 68
    .line 69
    iget v3, p0, Ls4/a;->f:F

    .line 70
    sub-float/2addr v0, v3

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 74
    move-result v0

    .line 75
    .line 76
    iget v3, p0, Ls4/a;->b:F

    .line 77
    .line 78
    cmpl-float v0, v0, v3

    .line 79
    .line 80
    if-gtz v0, :cond_4

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 84
    move-result v0

    .line 85
    .line 86
    iget v3, p0, Ls4/a;->g:F

    .line 87
    sub-float/2addr v0, v3

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 91
    move-result v0

    .line 92
    .line 93
    iget v3, p0, Ls4/a;->b:F

    .line 94
    .line 95
    cmpl-float v0, v0, v3

    .line 96
    .line 97
    if-lez v0, :cond_5

    .line 98
    .line 99
    :cond_4
    iput-boolean v2, p0, Ls4/a;->d:Z

    .line 100
    .line 101
    :cond_5
    iget-boolean v0, p0, Ls4/a;->d:Z

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 107
    move-result-wide v3

    .line 108
    .line 109
    iget-wide v5, p0, Ls4/a;->e:J

    .line 110
    sub-long/2addr v3, v5

    .line 111
    .line 112
    .line 113
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 114
    move-result p1

    .line 115
    int-to-long v5, p1

    .line 116
    .line 117
    cmp-long p1, v3, v5

    .line 118
    .line 119
    if-gtz p1, :cond_6

    .line 120
    .line 121
    iget-object p1, p0, Ls4/a;->a:Ls4/a$a;

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Ls4/a$a;->a()Z

    .line 127
    .line 128
    :cond_6
    iput-boolean v2, p0, Ls4/a;->d:Z

    .line 129
    goto :goto_0

    .line 130
    .line 131
    :cond_7
    iput-boolean v1, p0, Ls4/a;->c:Z

    .line 132
    .line 133
    iput-boolean v1, p0, Ls4/a;->d:Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 137
    move-result-wide v2

    .line 138
    .line 139
    iput-wide v2, p0, Ls4/a;->e:J

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 143
    move-result v0

    .line 144
    .line 145
    iput v0, p0, Ls4/a;->f:F

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 149
    move-result p1

    .line 150
    .line 151
    iput p1, p0, Ls4/a;->g:F

    .line 152
    :cond_8
    :goto_0
    return v1
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

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Ls4/a;->c:Z

    .line 4
    .line 5
    iput-boolean v0, p0, Ls4/a;->d:Z

    .line 6
    return-void
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

.method public f(Ls4/a$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ls4/a;->a:Ls4/a$a;

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
.end method
