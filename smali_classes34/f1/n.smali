.class public Lf1/n;
.super Lf1/a;
.source "SplitDimensionPathKeyframeAnimation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/a<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Landroid/graphics/PointF;

.field public final j:Landroid/graphics/PointF;

.field public final k:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lp1/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lp1/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf1/a;Lf1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lf1/a;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/PointF;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lf1/n;->i:Landroid/graphics/PointF;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 20
    .line 21
    iput-object p1, p0, Lf1/n;->k:Lf1/a;

    .line 22
    .line 23
    iput-object p2, p0, Lf1/n;->l:Lf1/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lf1/a;->f()F

    .line 27
    move-result p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lf1/n;->n(F)V

    .line 31
    return-void
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


# virtual methods
.method public bridge synthetic h()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf1/n;->q()Landroid/graphics/PointF;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public bridge synthetic i(Lp1/a;F)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf1/n;->r(Lp1/a;F)Landroid/graphics/PointF;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public n(F)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lf1/n;->k:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 6
    .line 7
    iget-object v0, p0, Lf1/n;->l:Lf1/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 11
    .line 12
    iget-object p1, p0, Lf1/n;->i:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget-object v0, p0, Lf1/n;->k:Lf1/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 24
    move-result v0

    .line 25
    .line 26
    iget-object v1, p0, Lf1/n;->l:Lf1/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 40
    const/4 p1, 0x0

    .line 41
    .line 42
    :goto_0
    iget-object v0, p0, Lf1/a;->a:Ljava/util/List;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    move-result v0

    .line 47
    .line 48
    if-ge p1, v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lf1/a;->a:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    check-cast v0, Lf1/a$b;

    .line 57
    .line 58
    .line 59
    invoke-interface {v0}, Lf1/a$b;->e()V

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
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

.method public q()Landroid/graphics/PointF;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lf1/n;->r(Lp1/a;F)Landroid/graphics/PointF;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public r(Lp1/a;F)Landroid/graphics/PointF;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/a<",
            "Landroid/graphics/PointF;",
            ">;F)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lf1/n;->m:Lp1/c;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lf1/n;->k:Lf1/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lf1/a;->b()Lp1/a;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lf1/n;->k:Lf1/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lf1/a;->d()F

    .line 19
    move-result v9

    .line 20
    .line 21
    iget-object v1, p1, Lp1/a;->h:Ljava/lang/Float;

    .line 22
    .line 23
    iget-object v2, p0, Lf1/n;->m:Lp1/c;

    .line 24
    .line 25
    iget v3, p1, Lp1/a;->g:F

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    move v4, v3

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 33
    move-result v1

    .line 34
    move v4, v1

    .line 35
    .line 36
    :goto_0
    iget-object v1, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 37
    move-object v5, v1

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Float;

    .line 40
    .line 41
    iget-object p1, p1, Lp1/a;->c:Ljava/lang/Object;

    .line 42
    move-object v6, p1

    .line 43
    .line 44
    check-cast v6, Ljava/lang/Float;

    .line 45
    move v8, p2

    .line 46
    move v7, p2

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {v2 .. v9}, Lp1/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    move v6, v7

    .line 52
    .line 53
    check-cast p1, Ljava/lang/Float;

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v6, p2

    .line 56
    move-object p1, v0

    .line 57
    .line 58
    :goto_1
    iget-object p2, p0, Lf1/n;->n:Lp1/c;

    .line 59
    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-object p2, p0, Lf1/n;->l:Lf1/a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lf1/a;->b()Lp1/a;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    iget-object v0, p0, Lf1/n;->l:Lf1/a;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lf1/a;->d()F

    .line 74
    move-result v8

    .line 75
    .line 76
    iget-object v0, p2, Lp1/a;->h:Ljava/lang/Float;

    .line 77
    .line 78
    iget-object v1, p0, Lf1/n;->n:Lp1/c;

    .line 79
    .line 80
    iget v2, p2, Lp1/a;->g:F

    .line 81
    .line 82
    if-nez v0, :cond_2

    .line 83
    move v3, v2

    .line 84
    goto :goto_2

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 88
    move-result v0

    .line 89
    move v3, v0

    .line 90
    .line 91
    :goto_2
    iget-object v0, p2, Lp1/a;->b:Ljava/lang/Object;

    .line 92
    move-object v4, v0

    .line 93
    .line 94
    check-cast v4, Ljava/lang/Float;

    .line 95
    .line 96
    iget-object p2, p2, Lp1/a;->c:Ljava/lang/Object;

    .line 97
    move-object v5, p2

    .line 98
    .line 99
    check-cast v5, Ljava/lang/Float;

    .line 100
    move v7, v6

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v1 .. v8}, Lp1/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 104
    move-result-object p2

    .line 105
    move-object v0, p2

    .line 106
    .line 107
    check-cast v0, Ljava/lang/Float;

    .line 108
    :cond_3
    const/4 p2, 0x0

    .line 109
    .line 110
    if-nez p1, :cond_4

    .line 111
    .line 112
    iget-object p1, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 113
    .line 114
    iget-object v1, p0, Lf1/n;->i:Landroid/graphics/PointF;

    .line 115
    .line 116
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 120
    goto :goto_3

    .line 121
    .line 122
    :cond_4
    iget-object v1, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 126
    move-result p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 130
    .line 131
    :goto_3
    if-nez v0, :cond_5

    .line 132
    .line 133
    iget-object p1, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 134
    .line 135
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 136
    .line 137
    iget-object v0, p0, Lf1/n;->i:Landroid/graphics/PointF;

    .line 138
    .line 139
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p2, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 143
    goto :goto_4

    .line 144
    .line 145
    :cond_5
    iget-object p1, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 146
    .line 147
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 151
    move-result v0

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 155
    .line 156
    :goto_4
    iget-object p1, p0, Lf1/n;->j:Landroid/graphics/PointF;

    .line 157
    return-object p1
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

.method public s(Lp1/c;)V
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
    iget-object v0, p0, Lf1/n;->m:Lp1/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lp1/c;->c(Lf1/a;)V

    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lf1/n;->m:Lp1/c;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lp1/c;->c(Lf1/a;)V

    .line 16
    :cond_1
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public t(Lp1/c;)V
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
    iget-object v0, p0, Lf1/n;->n:Lp1/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lp1/c;->c(Lf1/a;)V

    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lf1/n;->n:Lp1/c;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lp1/c;->c(Lf1/a;)V

    .line 16
    :cond_1
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
