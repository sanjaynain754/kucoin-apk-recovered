.class public Lff0/f;
.super Landroid/text/style/MetricAffectingSpan;
.source "HeadingSpan.java"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final b:Ldf0/a;

.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/Paint;

.field public final e:I


# direct methods
.method public constructor <init>(Ldf0/a;I)V
    .locals 1
    .param p1    # Ldf0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x6L
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lff0/g;->b()Landroid/graphics/Rect;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lff0/f;->c:Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lff0/g;->a()Landroid/graphics/Paint;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lff0/f;->d:Landroid/graphics/Paint;

    .line 16
    .line 17
    iput-object p1, p0, Lff0/f;->b:Ldf0/a;

    .line 18
    .line 19
    iput p2, p0, Lff0/f;->e:I

    .line 20
    return-void
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
.end method


# virtual methods
.method public final a(Landroid/text/TextPaint;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lff0/f;->b:Ldf0/a;

    .line 3
    .line 4
    iget v1, p0, Lff0/f;->e:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Ldf0/a;->e(Landroid/graphics/Paint;I)V

    .line 8
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

.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    .line 1
    .line 2
    iget p5, p0, Lff0/f;->e:I

    .line 3
    const/4 p6, 0x1

    .line 4
    .line 5
    if-eq p5, p6, :cond_0

    .line 6
    const/4 p6, 0x2

    .line 7
    .line 8
    if-ne p5, p6, :cond_2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p10, p8, p0}, Lqf0/c;->a(ILjava/lang/CharSequence;Ljava/lang/Object;)Z

    .line 12
    move-result p5

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    iget-object p5, p0, Lff0/f;->d:Landroid/graphics/Paint;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 20
    .line 21
    iget-object p2, p0, Lff0/f;->b:Ldf0/a;

    .line 22
    .line 23
    iget-object p5, p0, Lff0/f;->d:Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p5}, Ldf0/a;->d(Landroid/graphics/Paint;)V

    .line 27
    .line 28
    iget-object p2, p0, Lff0/f;->d:Landroid/graphics/Paint;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 32
    move-result p2

    .line 33
    const/4 p5, 0x0

    .line 34
    .line 35
    cmpl-float p5, p2, p5

    .line 36
    .line 37
    if-lez p5, :cond_2

    .line 38
    int-to-float p5, p7

    .line 39
    sub-float/2addr p5, p2

    .line 40
    .line 41
    const/high16 p2, 0x3f000000    # 0.5f

    .line 42
    add-float/2addr p5, p2

    .line 43
    float-to-int p2, p5

    .line 44
    .line 45
    if-lez p4, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 49
    move-result p4

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 54
    move-result p4

    .line 55
    .line 56
    sub-int p4, p3, p4

    .line 57
    move v0, p4

    .line 58
    move p4, p3

    .line 59
    move p3, v0

    .line 60
    .line 61
    :goto_0
    iget-object p5, p0, Lff0/f;->c:Landroid/graphics/Rect;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p5, p3, p2, p4, p7}, Landroid/graphics/Rect;->set(IIII)V

    .line 65
    .line 66
    iget-object p2, p0, Lff0/f;->c:Landroid/graphics/Rect;

    .line 67
    .line 68
    iget-object p3, p0, Lff0/f;->d:Landroid/graphics/Paint;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 72
    :cond_2
    return-void
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
.end method

.method public getLeadingMargin(Z)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lff0/f;->a(Landroid/text/TextPaint;)V

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
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lff0/f;->a(Landroid/text/TextPaint;)V

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
.end method
