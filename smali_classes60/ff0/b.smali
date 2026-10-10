.class public Lff0/b;
.super Ljava/lang/Object;
.source "BulletListItemSpan.java"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# static fields
.field public static final g:Z


# instance fields
.field public b:Ldf0/a;

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/Rect;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x18

    .line 5
    .line 6
    if-eq v1, v0, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x19

    .line 9
    .line 10
    if-ne v1, v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    .line 16
    :goto_1
    sput-boolean v0, Lff0/b;->g:Z

    .line 17
    return-void
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

.method public constructor <init>(Ldf0/a;I)V
    .locals 1
    .param p1    # Ldf0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lff0/g;->a()Landroid/graphics/Paint;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lff0/g;->c()Landroid/graphics/RectF;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lff0/b;->d:Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lff0/g;->b()Landroid/graphics/Rect;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lff0/b;->e:Landroid/graphics/Rect;

    .line 22
    .line 23
    iput-object p1, p0, Lff0/b;->b:Ldf0/a;

    .line 24
    .line 25
    iput p2, p0, Lff0/b;->f:I

    .line 26
    return-void
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
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p11, :cond_7

    .line 3
    .line 4
    .line 5
    invoke-static {p9, p8, p0}, Lqf0/c;->b(ILjava/lang/CharSequence;Ljava/lang/Object;)Z

    .line 6
    move-result p5

    .line 7
    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_0
    iget-object p5, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 16
    .line 17
    iget-object p2, p0, Lff0/b;->b:Ldf0/a;

    .line 18
    .line 19
    iget-object p5, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p5}, Ldf0/a;->g(Landroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 26
    move-result p2

    .line 27
    .line 28
    :try_start_0
    iget-object p5, p0, Lff0/b;->b:Ldf0/a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5}, Ldf0/a;->j()I

    .line 32
    move-result p5

    .line 33
    .line 34
    iget-object p7, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p7}, Landroid/graphics/Paint;->descent()F

    .line 38
    move-result p7

    .line 39
    .line 40
    iget-object p8, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p8}, Landroid/graphics/Paint;->ascent()F

    .line 44
    move-result p8

    .line 45
    sub-float/2addr p7, p8

    .line 46
    .line 47
    const/high16 p8, 0x3f000000    # 0.5f

    .line 48
    add-float/2addr p7, p8

    .line 49
    float-to-int p7, p7

    .line 50
    .line 51
    iget-object p9, p0, Lff0/b;->b:Ldf0/a;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p9, p7}, Ldf0/a;->l(I)I

    .line 55
    move-result p7

    .line 56
    .line 57
    sub-int p9, p5, p7

    .line 58
    .line 59
    div-int/lit8 p9, p9, 0x2

    .line 60
    .line 61
    sget-boolean p10, Lff0/b;->g:Z

    .line 62
    .line 63
    if-eqz p10, :cond_2

    .line 64
    .line 65
    if-gez p4, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p12}, Landroid/text/Layout;->getWidth()I

    .line 69
    move-result p10

    .line 70
    .line 71
    iget p11, p0, Lff0/b;->f:I

    .line 72
    mul-int/2addr p5, p11

    .line 73
    sub-int/2addr p10, p5

    .line 74
    .line 75
    sub-int p5, p3, p10

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p3

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_1
    iget p10, p0, Lff0/b;->f:I

    .line 82
    mul-int/2addr p5, p10

    .line 83
    sub-int/2addr p5, p3

    .line 84
    :goto_0
    mul-int/2addr p9, p4

    .line 85
    add-int/2addr p3, p9

    .line 86
    .line 87
    mul-int p9, p4, p7

    .line 88
    add-int/2addr p9, p3

    .line 89
    .line 90
    .line 91
    invoke-static {p3, p9}, Ljava/lang/Math;->min(II)I

    .line 92
    move-result p10

    .line 93
    mul-int/2addr p4, p5

    .line 94
    add-int/2addr p10, p4

    .line 95
    .line 96
    .line 97
    invoke-static {p3, p9}, Ljava/lang/Math;->max(II)I

    .line 98
    move-result p3

    .line 99
    add-int/2addr p3, p4

    .line 100
    goto :goto_3

    .line 101
    .line 102
    :cond_2
    if-lez p4, :cond_3

    .line 103
    :goto_1
    add-int/2addr p3, p9

    .line 104
    move p10, p3

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    sub-int/2addr p3, p5

    .line 107
    goto :goto_1

    .line 108
    .line 109
    :goto_2
    add-int p3, p10, p7

    .line 110
    .line 111
    :goto_3
    iget-object p4, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4}, Landroid/graphics/Paint;->descent()F

    .line 115
    move-result p4

    .line 116
    .line 117
    iget-object p5, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p5}, Landroid/graphics/Paint;->ascent()F

    .line 121
    move-result p5

    .line 122
    add-float/2addr p4, p5

    .line 123
    .line 124
    const/high16 p5, 0x40000000    # 2.0f

    .line 125
    div-float/2addr p4, p5

    .line 126
    add-float/2addr p4, p8

    .line 127
    float-to-int p4, p4

    .line 128
    add-int/2addr p6, p4

    .line 129
    .line 130
    div-int/lit8 p4, p7, 0x2

    .line 131
    sub-int/2addr p6, p4

    .line 132
    add-int/2addr p7, p6

    .line 133
    .line 134
    iget p4, p0, Lff0/b;->f:I

    .line 135
    .line 136
    if-eqz p4, :cond_5

    .line 137
    const/4 p5, 0x1

    .line 138
    .line 139
    if-ne p4, p5, :cond_4

    .line 140
    goto :goto_4

    .line 141
    .line 142
    :cond_4
    iget-object p4, p0, Lff0/b;->e:Landroid/graphics/Rect;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p4, p10, p6, p3, p7}, Landroid/graphics/Rect;->set(IIII)V

    .line 146
    .line 147
    iget-object p3, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 148
    .line 149
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 153
    .line 154
    iget-object p3, p0, Lff0/b;->e:Landroid/graphics/Rect;

    .line 155
    .line 156
    iget-object p4, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 160
    goto :goto_6

    .line 161
    .line 162
    :cond_5
    :goto_4
    iget-object p4, p0, Lff0/b;->d:Landroid/graphics/RectF;

    .line 163
    int-to-float p5, p10

    .line 164
    int-to-float p6, p6

    .line 165
    int-to-float p3, p3

    .line 166
    int-to-float p7, p7

    .line 167
    .line 168
    .line 169
    invoke-virtual {p4, p5, p6, p3, p7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 170
    .line 171
    iget p3, p0, Lff0/b;->f:I

    .line 172
    .line 173
    if-nez p3, :cond_6

    .line 174
    .line 175
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 176
    goto :goto_5

    .line 177
    .line 178
    :cond_6
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 179
    .line 180
    :goto_5
    iget-object p4, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 184
    .line 185
    iget-object p3, p0, Lff0/b;->d:Landroid/graphics/RectF;

    .line 186
    .line 187
    iget-object p4, p0, Lff0/b;->c:Landroid/graphics/Paint;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    .line 193
    :goto_6
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 194
    return-void

    .line 195
    .line 196
    .line 197
    :goto_7
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 198
    throw p3

    .line 199
    :cond_7
    :goto_8
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lff0/b;->b:Ldf0/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ldf0/a;->j()I

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
.end method
