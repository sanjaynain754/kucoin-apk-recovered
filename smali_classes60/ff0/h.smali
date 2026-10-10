.class public Lff0/h;
.super Ljava/lang/Object;
.source "OrderedListItemSpan.java"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final b:Ldf0/a;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/graphics/Paint;

.field public e:I


# direct methods
.method public constructor <init>(Ldf0/a;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ldf0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
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
    iput-object v0, p0, Lff0/h;->d:Landroid/graphics/Paint;

    .line 10
    .line 11
    iput-object p1, p0, Lff0/h;->b:Ldf0/a;

    .line 12
    .line 13
    iput-object p2, p0, Lff0/h;->c:Ljava/lang/String;

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
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p11, :cond_3

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
    goto :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object p5, p0, Lff0/h;->d:Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 15
    .line 16
    iget-object p2, p0, Lff0/h;->b:Ldf0/a;

    .line 17
    .line 18
    iget-object p5, p0, Lff0/h;->d:Landroid/graphics/Paint;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p5}, Ldf0/a;->g(Landroid/graphics/Paint;)V

    .line 22
    .line 23
    iget-object p2, p0, Lff0/h;->d:Landroid/graphics/Paint;

    .line 24
    .line 25
    iget-object p5, p0, Lff0/h;->c:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 29
    move-result p2

    .line 30
    .line 31
    const/high16 p5, 0x3f000000    # 0.5f

    .line 32
    add-float/2addr p2, p5

    .line 33
    float-to-int p2, p2

    .line 34
    .line 35
    iget-object p5, p0, Lff0/h;->b:Ldf0/a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5}, Ldf0/a;->j()I

    .line 39
    move-result p5

    .line 40
    .line 41
    if-le p2, p5, :cond_1

    .line 42
    .line 43
    iput p2, p0, Lff0/h;->e:I

    .line 44
    move p5, p2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p7, 0x0

    .line 47
    .line 48
    iput p7, p0, Lff0/h;->e:I

    .line 49
    .line 50
    :goto_0
    if-lez p4, :cond_2

    .line 51
    mul-int/2addr p5, p4

    .line 52
    add-int/2addr p3, p5

    .line 53
    sub-int/2addr p3, p2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    mul-int/2addr p4, p5

    .line 56
    add-int/2addr p3, p4

    .line 57
    sub-int/2addr p5, p2

    .line 58
    add-int/2addr p3, p5

    .line 59
    .line 60
    :goto_1
    iget-object p2, p0, Lff0/h;->c:Ljava/lang/String;

    .line 61
    int-to-float p3, p3

    .line 62
    int-to-float p4, p6

    .line 63
    .line 64
    iget-object p5, p0, Lff0/h;->d:Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 68
    :cond_3
    :goto_2
    return-void
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
    .locals 1

    .line 1
    .line 2
    iget p1, p0, Lff0/h;->e:I

    .line 3
    .line 4
    iget-object v0, p0, Lff0/h;->b:Ldf0/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ldf0/a;->j()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 12
    move-result p1

    .line 13
    return p1
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
