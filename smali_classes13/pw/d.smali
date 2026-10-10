.class public Lpw/d;
.super Ljava/lang/Object;
.source "DepthTouchRender.java"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/content/Context;

.field public f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

.field public g:Z

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

.field public l:Landroid/graphics/Rect;

.field public m:F

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x40800000    # 4.0f

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 9
    move-result v0

    .line 10
    .line 11
    iput v0, p0, Lpw/d;->a:I

    .line 12
    .line 13
    const/high16 v0, 0x41100000    # 9.0f

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 17
    move-result v0

    .line 18
    .line 19
    iput v0, p0, Lpw/d;->b:I

    .line 20
    .line 21
    const/high16 v0, 0x41200000    # 10.0f

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 25
    move-result v1

    .line 26
    .line 27
    iput v1, p0, Lpw/d;->c:I

    .line 28
    .line 29
    const/high16 v1, 0x40a00000    # 5.0f

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 33
    move-result v1

    .line 34
    .line 35
    iput v1, p0, Lpw/d;->d:I

    .line 36
    .line 37
    const/high16 v1, -0x40800000    # -1.0f

    .line 38
    .line 39
    iput v1, p0, Lpw/d;->m:F

    .line 40
    .line 41
    iput-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    iput-object v1, p0, Lpw/d;->e:Landroid/content/Context;

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/Paint;

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lpw/d;->h:Landroid/graphics/Paint;

    .line 56
    .line 57
    new-instance v1, Landroid/graphics/Paint;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 61
    .line 62
    iput-object v1, p0, Lpw/d;->i:Landroid/graphics/Paint;

    .line 63
    .line 64
    new-instance v1, Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 68
    .line 69
    iput-object v1, p0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 70
    .line 71
    iget-object v1, p0, Lpw/d;->i:Landroid/graphics/Paint;

    .line 72
    .line 73
    iget v2, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->w:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    .line 78
    iget-object v1, p0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 79
    .line 80
    iget v2, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->v:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    iget-object v1, p0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 89
    move-result v0

    .line 90
    int-to-float v0, v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 94
    .line 95
    iget-object v0, p0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    sget v1, Lcom/kubi/sdk/res/R$font;->medium:I

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 109
    .line 110
    new-instance p1, Landroid/graphics/Rect;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 114
    .line 115
    iput-object p1, p0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 116
    return-void
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
.end method


# virtual methods
.method public final a(DDI)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance p1, Ljava/math/BigDecimal;

    .line 12
    .line 13
    .line 14
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    sget-object p2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p5, p2}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    sget-object p2, Lcom/kubi/data/regulations/FinancialRegulationsEx;->a:Lcom/kubi/data/regulations/FinancialRegulationsEx$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1, p5, p5}, Lcom/kubi/data/regulations/FinancialRegulationsEx$Companion;->formatNumber(Ljava/math/BigDecimal;II)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lpw/d;->m:F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    cmpl-float v1, v0, v1

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lpw/d;->d(F)V

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lpw/d;->g:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lpw/d;->c(Landroid/graphics/Canvas;)V

    .line 22
    :cond_1
    return-void
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
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lpw/d;->h:Landroid/graphics/Paint;

    .line 7
    .line 8
    iget-object v3, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->isSell()Z

    .line 12
    move-result v3

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v3, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 17
    .line 18
    iget v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->u:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object v3, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 22
    .line 23
    iget v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->s:I

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    iget-object v2, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 32
    move-result v2

    .line 33
    .line 34
    iget-object v3, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 38
    move-result v3

    .line 39
    .line 40
    iget v4, v0, Lpw/d;->b:I

    .line 41
    int-to-float v4, v4

    .line 42
    .line 43
    iget-object v5, v0, Lpw/d;->h:Landroid/graphics/Paint;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 47
    .line 48
    iget-object v2, v0, Lpw/d;->h:Landroid/graphics/Paint;

    .line 49
    .line 50
    iget-object v3, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->isSell()Z

    .line 54
    move-result v3

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iget-object v3, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 59
    .line 60
    iget v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->t:I

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_1
    iget-object v3, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 64
    .line 65
    iget v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->r:I

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    .line 70
    iget-object v2, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 74
    move-result v2

    .line 75
    .line 76
    iget-object v3, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 80
    move-result v3

    .line 81
    .line 82
    iget v4, v0, Lpw/d;->a:I

    .line 83
    int-to-float v4, v4

    .line 84
    .line 85
    iget-object v5, v0, Lpw/d;->h:Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    iget-object v2, v0, Lpw/d;->e:Landroid/content/Context;

    .line 91
    .line 92
    sget v3, Lcom/kubi/sdk/res/R$string;->price_stub:I

    .line 93
    .line 94
    sget-object v4, Lcom/kubi/data/regulations/FinancialRegulationsEx;->a:Lcom/kubi/data/regulations/FinancialRegulationsEx$Companion;

    .line 95
    .line 96
    new-instance v5, Ljava/math/BigDecimal;

    .line 97
    .line 98
    iget-object v6, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getPrice()D

    .line 102
    move-result-wide v6

    .line 103
    .line 104
    .line 105
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 106
    move-result-object v6

    .line 107
    .line 108
    .line 109
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    iget v6, v0, Lpw/d;->o:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v5, v6, v6}, Lcom/kubi/data/regulations/FinancialRegulationsEx$Companion;->formatNumber(Ljava/math/BigDecimal;II)Ljava/lang/String;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    .line 118
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    iget-object v3, v0, Lpw/d;->e:Landroid/content/Context;

    .line 126
    .line 127
    iget-object v4, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->isSell()Z

    .line 131
    move-result v4

    .line 132
    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    sget v4, Lcom/kubi/sdk/res/R$string;->depth_amount_sell_stub:I

    .line 136
    goto :goto_2

    .line 137
    .line 138
    :cond_2
    sget v4, Lcom/kubi/sdk/res/R$string;->depth_amount_buy_stub:I

    .line 139
    .line 140
    :goto_2
    iget-object v5, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getVolume()D

    .line 144
    move-result-wide v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v5, v6}, Lpw/d;->e(D)Ljava/lang/String;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    .line 151
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 152
    move-result-object v5

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    move-result-object v3

    .line 157
    .line 158
    iget-object v4, v0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 162
    move-result v5

    .line 163
    .line 164
    iget-object v6, v0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 165
    const/4 v7, 0x0

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v2, v7, v5, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 169
    .line 170
    iget-object v4, v0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 174
    move-result v4

    .line 175
    .line 176
    iget-object v5, v0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 180
    move-result v5

    .line 181
    .line 182
    iget-object v6, v0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 186
    move-result v8

    .line 187
    .line 188
    iget-object v9, v0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v3, v7, v8, v9}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 192
    .line 193
    iget-object v6, v0, Lpw/d;->l:Landroid/graphics/Rect;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 197
    move-result v6

    .line 198
    .line 199
    .line 200
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 201
    move-result v4

    .line 202
    .line 203
    iget v6, v0, Lpw/d;->c:I

    .line 204
    .line 205
    mul-int/lit8 v6, v6, 0x2

    .line 206
    add-int/2addr v6, v4

    .line 207
    .line 208
    iget-object v7, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 212
    move-result v7

    .line 213
    .line 214
    iget v8, v0, Lpw/d;->b:I

    .line 215
    add-int/2addr v8, v6

    .line 216
    int-to-float v8, v8

    .line 217
    .line 218
    cmpg-float v7, v7, v8

    .line 219
    .line 220
    if-gtz v7, :cond_3

    .line 221
    .line 222
    iget-object v4, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 226
    move-result v4

    .line 227
    .line 228
    iget v7, v0, Lpw/d;->b:I

    .line 229
    int-to-float v7, v7

    .line 230
    add-float/2addr v4, v7

    .line 231
    .line 232
    iget-object v7, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 236
    move-result v7

    .line 237
    int-to-float v6, v6

    .line 238
    add-float/2addr v7, v6

    .line 239
    .line 240
    iget v6, v0, Lpw/d;->b:I

    .line 241
    int-to-float v6, v6

    .line 242
    add-float/2addr v7, v6

    .line 243
    .line 244
    iget-object v6, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 248
    move-result v6

    .line 249
    .line 250
    iget v8, v0, Lpw/d;->b:I

    .line 251
    int-to-float v8, v8

    .line 252
    add-float/2addr v6, v8

    .line 253
    .line 254
    iget v8, v0, Lpw/d;->c:I

    .line 255
    int-to-float v8, v8

    .line 256
    add-float/2addr v6, v8

    .line 257
    goto :goto_3

    .line 258
    .line 259
    :cond_3
    iget-object v6, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 263
    move-result v6

    .line 264
    int-to-float v4, v4

    .line 265
    sub-float/2addr v6, v4

    .line 266
    .line 267
    iget v7, v0, Lpw/d;->b:I

    .line 268
    int-to-float v7, v7

    .line 269
    sub-float/2addr v6, v7

    .line 270
    .line 271
    iget v7, v0, Lpw/d;->c:I

    .line 272
    .line 273
    mul-int/lit8 v7, v7, 0x2

    .line 274
    int-to-float v7, v7

    .line 275
    sub-float/2addr v6, v7

    .line 276
    .line 277
    iget-object v7, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 281
    move-result v7

    .line 282
    .line 283
    iget v8, v0, Lpw/d;->b:I

    .line 284
    int-to-float v8, v8

    .line 285
    sub-float/2addr v7, v8

    .line 286
    .line 287
    iget-object v8, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 291
    move-result v8

    .line 292
    sub-float/2addr v8, v4

    .line 293
    .line 294
    iget v4, v0, Lpw/d;->b:I

    .line 295
    int-to-float v4, v4

    .line 296
    sub-float/2addr v8, v4

    .line 297
    .line 298
    iget v4, v0, Lpw/d;->c:I

    .line 299
    int-to-float v4, v4

    .line 300
    .line 301
    sub-float v4, v8, v4

    .line 302
    .line 303
    move/from16 v20, v6

    .line 304
    move v6, v4

    .line 305
    .line 306
    move/from16 v4, v20

    .line 307
    .line 308
    :goto_3
    mul-int/lit8 v8, v5, 0x2

    .line 309
    .line 310
    iget v9, v0, Lpw/d;->d:I

    .line 311
    .line 312
    mul-int/lit8 v9, v9, 0x2

    .line 313
    add-int/2addr v9, v8

    .line 314
    .line 315
    const/high16 v10, 0x40a00000    # 5.0f

    .line 316
    .line 317
    .line 318
    invoke-static {v10}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 319
    move-result v11

    .line 320
    add-int/2addr v9, v11

    .line 321
    .line 322
    iget-object v11, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v11}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 326
    move-result v11

    .line 327
    .line 328
    iget-object v12, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 329
    .line 330
    iget v12, v12, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 331
    int-to-float v13, v9

    .line 332
    .line 333
    add-float v14, v12, v13

    .line 334
    .line 335
    cmpg-float v11, v11, v14

    .line 336
    .line 337
    if-gez v11, :cond_4

    .line 338
    add-float/2addr v13, v12

    .line 339
    .line 340
    iget v9, v0, Lpw/d;->d:I

    .line 341
    int-to-float v11, v9

    .line 342
    add-float/2addr v11, v12

    .line 343
    int-to-float v5, v5

    .line 344
    add-float/2addr v11, v5

    .line 345
    int-to-float v5, v9

    .line 346
    add-float/2addr v5, v12

    .line 347
    .line 348
    .line 349
    invoke-static {v10}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 350
    move-result v9

    .line 351
    int-to-float v9, v9

    .line 352
    add-float/2addr v5, v9

    .line 353
    :goto_4
    int-to-float v8, v8

    .line 354
    add-float/2addr v5, v8

    .line 355
    goto :goto_5

    .line 356
    .line 357
    :cond_4
    iget-object v8, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 361
    move-result v8

    .line 362
    float-to-double v11, v8

    .line 363
    .line 364
    iget-object v8, v0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 365
    .line 366
    iget v14, v8, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 367
    move v15, v10

    .line 368
    .line 369
    move-wide/from16 v16, v11

    .line 370
    float-to-double v10, v14

    .line 371
    .line 372
    move-wide/from16 v18, v10

    .line 373
    .line 374
    iget-wide v10, v8, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 375
    .line 376
    add-double v18, v18, v10

    .line 377
    move v8, v13

    .line 378
    int-to-double v12, v9

    .line 379
    .line 380
    sub-double v18, v18, v12

    .line 381
    .line 382
    cmpl-double v12, v16, v18

    .line 383
    .line 384
    if-lez v12, :cond_5

    .line 385
    double-to-float v9, v10

    .line 386
    add-float/2addr v9, v14

    .line 387
    .line 388
    sub-float v12, v9, v8

    .line 389
    double-to-float v8, v10

    .line 390
    .line 391
    add-float v13, v14, v8

    .line 392
    .line 393
    iget v8, v0, Lpw/d;->d:I

    .line 394
    int-to-float v8, v8

    .line 395
    add-float/2addr v8, v12

    .line 396
    int-to-float v5, v5

    .line 397
    .line 398
    add-float v11, v8, v5

    .line 399
    .line 400
    .line 401
    invoke-static {v15}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 402
    move-result v8

    .line 403
    int-to-float v8, v8

    .line 404
    add-float/2addr v8, v11

    .line 405
    add-float/2addr v5, v8

    .line 406
    goto :goto_5

    .line 407
    .line 408
    :cond_5
    iget-object v8, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v8}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 412
    move-result v8

    .line 413
    .line 414
    shr-int/lit8 v9, v9, 0x1

    .line 415
    int-to-float v9, v9

    .line 416
    .line 417
    sub-float v12, v8, v9

    .line 418
    .line 419
    iget-object v8, v0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v8}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 423
    move-result v8

    .line 424
    .line 425
    add-float v13, v8, v9

    .line 426
    .line 427
    iget v8, v0, Lpw/d;->d:I

    .line 428
    int-to-float v8, v8

    .line 429
    add-float/2addr v8, v12

    .line 430
    int-to-float v5, v5

    .line 431
    .line 432
    add-float v11, v8, v5

    .line 433
    add-float/2addr v5, v11

    .line 434
    .line 435
    .line 436
    invoke-static {v15}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 437
    move-result v8

    .line 438
    goto :goto_4

    .line 439
    .line 440
    :goto_5
    new-instance v8, Landroid/graphics/RectF;

    .line 441
    .line 442
    .line 443
    invoke-direct {v8, v4, v12, v7, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 444
    .line 445
    iget-object v4, v0, Lpw/d;->i:Landroid/graphics/Paint;

    .line 446
    .line 447
    const/high16 v7, 0x40c00000    # 6.0f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v8, v7, v7, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 451
    .line 452
    iget-object v4, v0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v2, v6, v11, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 456
    .line 457
    iget-object v2, v0, Lpw/d;->j:Landroid/graphics/Paint;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v3, v6, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 461
    return-void
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public d(F)V
    .locals 4

    .line 1
    .line 2
    iput p1, p0, Lpw/d;->m:F

    .line 3
    .line 4
    iget-object v0, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-ge v1, v0, :cond_7

    .line 24
    .line 25
    add-int/lit8 v0, v1, 0x1

    .line 26
    .line 27
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 28
    .line 29
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 33
    move-result v2

    .line 34
    .line 35
    if-ge v0, v2, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 49
    move-result v2

    .line 50
    .line 51
    cmpl-float v2, p1, v2

    .line 52
    .line 53
    if-ltz v2, :cond_0

    .line 54
    .line 55
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 56
    .line 57
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 67
    move-result v2

    .line 68
    .line 69
    cmpg-float v2, p1, v2

    .line 70
    .line 71
    if-gez v2, :cond_0

    .line 72
    .line 73
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    check-cast p1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 82
    .line 83
    iput-object p1, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 84
    return-void

    .line 85
    .line 86
    :cond_0
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 87
    .line 88
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 89
    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 92
    move-result v2

    .line 93
    .line 94
    add-int/lit8 v2, v2, -0x1

    .line 95
    .line 96
    if-ne v1, v2, :cond_1

    .line 97
    .line 98
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 99
    .line 100
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 101
    .line 102
    .line 103
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 110
    move-result v2

    .line 111
    .line 112
    cmpl-float v2, p1, v2

    .line 113
    .line 114
    if-ltz v2, :cond_1

    .line 115
    .line 116
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    check-cast p1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 125
    .line 126
    iput-object p1, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 127
    return-void

    .line 128
    :cond_1
    move v1, v0

    .line 129
    goto :goto_0

    .line 130
    .line 131
    :cond_2
    iget-object v0, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    check-cast v0, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 143
    move-result v0

    .line 144
    .line 145
    cmpg-float v0, p1, v0

    .line 146
    .line 147
    if-gez v0, :cond_5

    .line 148
    move v0, v1

    .line 149
    .line 150
    :goto_1
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 151
    .line 152
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 153
    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 156
    move-result v2

    .line 157
    .line 158
    if-ge v0, v2, :cond_7

    .line 159
    .line 160
    add-int/lit8 v2, v0, 0x1

    .line 161
    .line 162
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 163
    .line 164
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 165
    .line 166
    .line 167
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 168
    move-result v3

    .line 169
    .line 170
    if-ge v2, v3, :cond_3

    .line 171
    .line 172
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 173
    .line 174
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 175
    .line 176
    .line 177
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 184
    move-result v3

    .line 185
    .line 186
    cmpl-float v3, p1, v3

    .line 187
    .line 188
    if-ltz v3, :cond_3

    .line 189
    .line 190
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 191
    .line 192
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 193
    .line 194
    .line 195
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    move-result-object v3

    .line 197
    .line 198
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 202
    move-result v3

    .line 203
    .line 204
    cmpg-float v3, p1, v3

    .line 205
    .line 206
    if-gez v3, :cond_3

    .line 207
    .line 208
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 209
    .line 210
    iget-object p1, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    check-cast p1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 217
    .line 218
    iput-object p1, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 219
    return-void

    .line 220
    .line 221
    :cond_3
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 222
    .line 223
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 224
    .line 225
    .line 226
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 227
    move-result v3

    .line 228
    .line 229
    add-int/lit8 v3, v3, -0x1

    .line 230
    .line 231
    if-ne v0, v3, :cond_4

    .line 232
    .line 233
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 234
    .line 235
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 236
    .line 237
    .line 238
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    move-result-object v3

    .line 240
    .line 241
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 245
    move-result v3

    .line 246
    .line 247
    cmpl-float v3, p1, v3

    .line 248
    .line 249
    if-ltz v3, :cond_4

    .line 250
    .line 251
    iget-object v3, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 252
    .line 253
    iget-object v3, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 254
    .line 255
    .line 256
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    move-result-object v3

    .line 258
    .line 259
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 263
    move-result v3

    .line 264
    .line 265
    cmpg-float v3, p1, v3

    .line 266
    .line 267
    if-gez v3, :cond_4

    .line 268
    .line 269
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 270
    .line 271
    iget-object p1, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->b:Ljava/util/List;

    .line 272
    .line 273
    .line 274
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    move-result-object p1

    .line 276
    .line 277
    check-cast p1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 278
    .line 279
    iput-object p1, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 280
    return-void

    .line 281
    :cond_4
    move v0, v2

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :cond_5
    :goto_2
    iget-object v0, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 286
    .line 287
    iget-object v0, v0, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 288
    .line 289
    .line 290
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 291
    move-result v0

    .line 292
    .line 293
    if-ge v1, v0, :cond_7

    .line 294
    .line 295
    add-int/lit8 v0, v1, 0x1

    .line 296
    .line 297
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 298
    .line 299
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 300
    .line 301
    .line 302
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 303
    move-result v2

    .line 304
    .line 305
    if-ge v0, v2, :cond_6

    .line 306
    .line 307
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 308
    .line 309
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 310
    .line 311
    .line 312
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    move-result-object v2

    .line 314
    .line 315
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 319
    move-result v2

    .line 320
    .line 321
    cmpl-float v2, p1, v2

    .line 322
    .line 323
    if-ltz v2, :cond_6

    .line 324
    .line 325
    iget-object v2, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 326
    .line 327
    iget-object v2, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 328
    .line 329
    .line 330
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    move-result-object v2

    .line 332
    .line 333
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 337
    move-result v2

    .line 338
    .line 339
    cmpg-float v2, p1, v2

    .line 340
    .line 341
    if-gez v2, :cond_6

    .line 342
    .line 343
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 344
    .line 345
    iget-object p1, p1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->c:Ljava/util/List;

    .line 346
    .line 347
    .line 348
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 349
    move-result-object p1

    .line 350
    .line 351
    check-cast p1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 352
    .line 353
    iput-object p1, p0, Lpw/d;->k:Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 354
    return-void

    .line 355
    :cond_6
    move v1, v0

    .line 356
    goto :goto_2

    .line 357
    :cond_7
    return-void
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public final e(D)Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 6
    .line 7
    cmpl-double v0, p1, v0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v1, 0x412e848000000000L    # 1000000.0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    cmpg-double v0, p1, v1

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 29
    const/4 v6, 0x2

    .line 30
    move-object v1, p0

    .line 31
    move-wide v2, p1

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {v1 .. v6}, Lpw/d;->a(DDI)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string p1, "K"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_0
    move-wide v7, v1

    .line 50
    move-wide v2, p1

    .line 51
    move-wide p1, v7

    .line 52
    .line 53
    cmpl-double p1, v2, p1

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    .line 59
    .line 60
    if-ltz p1, :cond_1

    .line 61
    .line 62
    cmpg-double p1, v2, v0

    .line 63
    .line 64
    if-gez p1, :cond_1

    .line 65
    .line 66
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 75
    const/4 v6, 0x2

    .line 76
    move-object v1, p0

    .line 77
    .line 78
    .line 79
    invoke-virtual/range {v1 .. v6}, Lpw/d;->a(DDI)Ljava/lang/String;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string p2, "M"

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_1
    cmpl-double p1, v2, v0

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    const-wide v0, 0x426d1a94a2000000L    # 1.0E12

    .line 101
    .line 102
    if-ltz p1, :cond_2

    .line 103
    .line 104
    cmpg-double p1, v2, v0

    .line 105
    .line 106
    if-gez p1, :cond_2

    .line 107
    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    const-wide v4, 0x41cdcd6500000000L    # 1.0E9

    .line 117
    const/4 v6, 0x3

    .line 118
    move-object v1, p0

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v1 .. v6}, Lpw/d;->a(DDI)Ljava/lang/String;

    .line 122
    move-result-object p2

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string p2, "B"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    .line 137
    :cond_2
    cmpl-double p1, v2, v0

    .line 138
    .line 139
    if-ltz p1, :cond_3

    .line 140
    .line 141
    new-instance p1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    const-wide v4, 0x426d1a94a2000000L    # 1.0E12

    .line 150
    const/4 v6, 0x3

    .line 151
    move-object v1, p0

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v1 .. v6}, Lpw/d;->a(DDI)Ljava/lang/String;

    .line 155
    move-result-object p2

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string p2, "T"

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :cond_3
    move-object v1, p0

    .line 170
    .line 171
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 172
    .line 173
    iget v6, v1, Lpw/d;->n:I

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v1 .. v6}, Lpw/d;->a(DDI)Ljava/lang/String;

    .line 177
    move-result-object p1

    .line 178
    return-object p1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lpw/d;->g:Z

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
.end method

.method public g(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lpw/d;->n:I

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
.end method

.method public h(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lpw/d;->g:Z

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lpw/d;->g:Z

    .line 8
    .line 9
    iget-object p1, p0, Lpw/d;->f:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 13
    return-void
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
.end method

.method public i(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lpw/d;->o:I

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
.end method
