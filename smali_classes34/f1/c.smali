.class public Lf1/c;
.super Ljava/lang/Object;
.source "DropShadowKeyframeAnimation.java"

# interfaces
.implements Lf1/a$b;


# instance fields
.field public final a:Lf1/a$b;

.field public final b:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z


# direct methods
.method public constructor <init>(Lf1/a$b;Lcom/airbnb/lottie/model/layer/a;Lm1/j;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lf1/c;->g:Z

    .line 7
    .line 8
    iput-object p1, p0, Lf1/c;->a:Lf1/a$b;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lm1/j;->a()Li1/a;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Li1/a;->a()Lf1/a;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, p0, Lf1/c;->b:Lf1/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Lm1/j;->d()Li1/b;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lf1/c;->c:Lf1/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Lm1/j;->b()Li1/b;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lf1/c;->d:Lf1/a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lm1/j;->c()Li1/b;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    iput-object p1, p0, Lf1/c;->e:Lf1/a;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Lm1/j;->e()Li1/b;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    iput-object p1, p0, Lf1/c;->f:Lf1/a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
.end method


# virtual methods
.method public a(Landroid/graphics/Paint;)V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lf1/c;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lf1/c;->g:Z

    .line 9
    .line 10
    iget-object v0, p0, Lf1/c;->d:Lf1/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 20
    move-result v0

    .line 21
    float-to-double v0, v0

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 27
    mul-double/2addr v0, v2

    .line 28
    .line 29
    iget-object v2, p0, Lf1/c;->e:Lf1/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 43
    move-result-wide v3

    .line 44
    double-to-float v3, v3

    .line 45
    mul-float/2addr v3, v2

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const-wide v4, 0x400921fb54442d18L    # Math.PI

    .line 51
    add-double/2addr v0, v4

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 55
    move-result-wide v0

    .line 56
    double-to-float v0, v0

    .line 57
    mul-float/2addr v0, v2

    .line 58
    .line 59
    iget-object v1, p0, Lf1/c;->b:Lf1/a;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    move-result v1

    .line 70
    .line 71
    iget-object v2, p0, Lf1/c;->c:Lf1/a;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    check-cast v2, Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 81
    move-result v2

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 85
    move-result v2

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 89
    move-result v4

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 93
    move-result v5

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 97
    move-result v1

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v4, v5, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 101
    move-result v1

    .line 102
    .line 103
    iget-object v2, p0, Lf1/c;->f:Lf1/a;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Float;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 113
    move-result v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 117
    return-void
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
.end method

.method public b(Lp1/c;)V
    .locals 1
    .param p1    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/c;->b:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf1/a;->o(Lp1/c;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public c(Lp1/c;)V
    .locals 1
    .param p1    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/c;->d:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf1/a;->o(Lp1/c;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public d(Lp1/c;)V
    .locals 1
    .param p1    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/c;->e:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf1/a;->o(Lp1/c;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lf1/c;->g:Z

    .line 4
    .line 5
    iget-object v0, p0, Lf1/c;->a:Lf1/a$b;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lf1/a$b;->e()V

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
.end method

.method public f(Lp1/c;)V
    .locals 2
    .param p1    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lf1/c;->c:Lf1/a;

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lf1/a;->o(Lp1/c;)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lf1/c;->c:Lf1/a;

    .line 12
    .line 13
    new-instance v1, Lf1/c$a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lf1/c$a;-><init>(Lf1/c;Lp1/c;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lf1/a;->o(Lp1/c;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public g(Lp1/c;)V
    .locals 1
    .param p1    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/c;->f:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf1/a;->o(Lp1/c;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
