.class public Lcom/kubi/resources/widget/OrderBookItemView;
.super Landroid/view/View;
.source "OrderBookItemView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/OrderBookItemView$a;
    }
.end annotation


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:[Ljava/lang/String;

.field public g:[F

.field public h:F

.field public i:I

.field public j:I

.field public k:I

.field public l:F

.field public m:I

.field public final n:Landroid/graphics/Paint;

.field public o:Z

.field public p:Z

.field public q:F

.field public r:Z

.field public s:I

.field public t:Lcom/kubi/resources/widget/OrderBookItemView$a;

.field public final u:Landroid/graphics/Paint;

.field public final v:Landroid/graphics/RectF;

.field public final w:Landroid/graphics/Bitmap;

.field public final x:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/resources/widget/OrderBookItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x41600000    # 14.0f

    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->h:F

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    const/high16 v2, -0x40800000    # -1.0f

    .line 5
    iput v2, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 6
    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 7
    iput-boolean v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->o:Z

    .line 8
    iput-boolean v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->p:Z

    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lcom/kubi/resources/widget/OrderBookItemView;->q:F

    .line 10
    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 11
    new-instance v1, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 12
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v1, v2, v2, v2, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 13
    sget v1, Lcom/kubi/sdk/res/R$mipmap;->icon_position_flag:I

    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->w:Landroid/graphics/Bitmap;

    .line 14
    sget v1, Lcom/kubi/sdk/res/R$mipmap;->icon_position_flag_right:I

    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->x:Landroid/graphics/Bitmap;

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView:[I

    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 16
    sget v1, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView_buyProgressColor:I

    const-string v2, "#1401AA78"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->b:I

    .line 17
    sget v1, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView_sellProgressColor:I

    const-string v2, "#14FF5454"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->c:I

    .line 18
    sget v1, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView_sellColor:I

    const-string v2, "#DC5656"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->d:I

    .line 19
    sget v1, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView_buyColor:I

    const-string v2, "#2dbd96"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->e:I

    .line 20
    sget v1, Lcom/kubi/sdk/res/R$styleable;->OrderBookItemView_order_text_size:I

    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->f(F)I

    move-result v0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 21
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 22
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    int-to-float v0, v0

    .line 23
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    sget v0, Lcom/kubi/sdk/res/R$font;->regular:I

    invoke-static {p1, v0}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 26
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/OrderBookItemView;->setOrderBookType(I)V

    .line 27
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getBitmapLeft()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->x:Landroid/graphics/Bitmap;

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->w:Landroid/graphics/Bitmap;

    .line 12
    return-object v0
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

.method private getBitmapRight()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->w:Landroid/graphics/Bitmap;

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->x:Landroid/graphics/Bitmap;

    .line 12
    return-object v0
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


# virtual methods
.method public final a()V
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    const/high16 v0, 0x40a00000    # 5.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    .line 18
    const/high16 v1, 0x40800000    # 4.0f

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    aget-object v4, v2, v3

    .line 29
    const/4 v5, 0x1

    .line 30
    .line 31
    aget-object v2, v2, v5

    .line 32
    .line 33
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 34
    .line 35
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->h:F

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 39
    .line 40
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    .line 44
    move-result v6

    .line 45
    .line 46
    :goto_0
    cmpl-float v7, v6, v0

    .line 47
    .line 48
    if-lez v7, :cond_2

    .line 49
    .line 50
    iget-object v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 54
    .line 55
    iget-object v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 59
    move-result v7

    .line 60
    .line 61
    iget-object v8, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 65
    move-result v8

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 69
    move-result v9

    .line 70
    int-to-float v9, v9

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 74
    move-result v10

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 78
    move-result v11

    .line 79
    sub-int/2addr v10, v11

    .line 80
    int-to-float v10, v10

    .line 81
    sub-float/2addr v10, v8

    .line 82
    add-float/2addr v7, v9

    .line 83
    add-float/2addr v7, v1

    .line 84
    .line 85
    cmpg-float v7, v7, v10

    .line 86
    .line 87
    if-gtz v7, :cond_1

    .line 88
    .line 89
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 90
    .line 91
    aput v9, v0, v3

    .line 92
    .line 93
    aput v10, v0, v5

    .line 94
    return-void

    .line 95
    .line 96
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 97
    sub-float/2addr v6, v7

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    :goto_1
    return-void
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
    .line 233
    .line 234
    .line 235
.end method

.method public final varargs b([Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/OrderBookItemView;->setColumnCount(I)V

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    .line 15
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_3

    .line 18
    array-length v1, p1

    .line 19
    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, "--"

    .line 25
    .line 26
    aput-object v2, v1, v0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_2
    iget-object v1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 30
    .line 31
    aget-object v2, p1, v0

    .line 32
    .line 33
    aput-object v2, v1, v0

    .line 34
    .line 35
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 40
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/OrderBookItemView;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    iget v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 9
    .line 10
    const/high16 v1, -0x40800000    # -1.0f

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    if-eqz v0, :cond_8

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 24
    .line 25
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->p:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 35
    .line 36
    iget v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    iget v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->c:I

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_0
    iget v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->b:I

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    move-result v0

    .line 57
    int-to-float v0, v0

    .line 58
    .line 59
    iget-boolean v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->r:Z

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 64
    float-to-double v4, v0

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide v6, 0x3fa999999999999aL    # 0.05

    .line 70
    mul-double/2addr v6, v4

    .line 71
    double-to-float v0, v6

    .line 72
    .line 73
    iput v0, v3, Landroid/graphics/RectF;->top:F

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const-wide v6, 0x3fee666666666666L    # 0.95

    .line 79
    mul-double/2addr v4, v6

    .line 80
    double-to-float v0, v4

    .line 81
    .line 82
    iput v0, v3, Landroid/graphics/RectF;->bottom:F

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_2
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 86
    .line 87
    iput v0, v3, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 91
    move-result v0

    .line 92
    .line 93
    iget v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    .line 94
    const/4 v4, 0x0

    .line 95
    .line 96
    const/high16 v5, 0x42c80000    # 100.0f

    .line 97
    .line 98
    if-nez v3, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 102
    move-result v3

    .line 103
    .line 104
    if-ne v3, v2, :cond_3

    .line 105
    .line 106
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 107
    .line 108
    iput v4, v0, Landroid/graphics/RectF;->right:F

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 112
    move-result v3

    .line 113
    int-to-float v3, v3

    .line 114
    .line 115
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 116
    mul-float/2addr v3, v4

    .line 117
    div-float/2addr v3, v5

    .line 118
    .line 119
    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 120
    goto :goto_3

    .line 121
    .line 122
    :cond_3
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 123
    int-to-float v0, v0

    .line 124
    .line 125
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 126
    .line 127
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 128
    div-float/2addr v4, v5

    .line 129
    mul-float/2addr v4, v0

    .line 130
    sub-float/2addr v0, v4

    .line 131
    .line 132
    iput v0, v3, Landroid/graphics/RectF;->left:F

    .line 133
    goto :goto_3

    .line 134
    .line 135
    :cond_4
    iget v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 141
    move-result v3

    .line 142
    .line 143
    if-ne v3, v2, :cond_5

    .line 144
    .line 145
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 146
    .line 147
    iput v4, v0, Landroid/graphics/RectF;->right:F

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 151
    move-result v3

    .line 152
    int-to-float v3, v3

    .line 153
    .line 154
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 155
    mul-float/2addr v3, v4

    .line 156
    div-float/2addr v3, v5

    .line 157
    .line 158
    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 159
    goto :goto_3

    .line 160
    .line 161
    :cond_5
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 162
    int-to-float v0, v0

    .line 163
    .line 164
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 165
    .line 166
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 167
    div-float/2addr v4, v5

    .line 168
    mul-float/2addr v4, v0

    .line 169
    sub-float/2addr v0, v4

    .line 170
    .line 171
    iput v0, v3, Landroid/graphics/RectF;->left:F

    .line 172
    goto :goto_3

    .line 173
    .line 174
    .line 175
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 176
    move-result v3

    .line 177
    .line 178
    if-ne v3, v2, :cond_7

    .line 179
    .line 180
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 181
    int-to-float v0, v0

    .line 182
    .line 183
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 184
    .line 185
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 186
    div-float/2addr v4, v5

    .line 187
    mul-float/2addr v4, v0

    .line 188
    sub-float/2addr v0, v4

    .line 189
    .line 190
    iput v0, v3, Landroid/graphics/RectF;->left:F

    .line 191
    goto :goto_3

    .line 192
    .line 193
    :cond_7
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 194
    .line 195
    iput v4, v0, Landroid/graphics/RectF;->right:F

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 199
    move-result v3

    .line 200
    int-to-float v3, v3

    .line 201
    .line 202
    iget v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

    .line 203
    mul-float/2addr v3, v4

    .line 204
    div-float/2addr v3, v5

    .line 205
    .line 206
    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 207
    .line 208
    :goto_3
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->v:Landroid/graphics/RectF;

    .line 209
    .line 210
    iget-object v3, p0, Lcom/kubi/resources/widget/OrderBookItemView;->u:Landroid/graphics/Paint;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 214
    .line 215
    :cond_8
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 216
    const/4 v3, 0x2

    .line 217
    .line 218
    if-eqz v0, :cond_9

    .line 219
    .line 220
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 221
    .line 222
    if-nez v0, :cond_a

    .line 223
    .line 224
    .line 225
    :cond_9
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/OrderBookItemView;->setColumnCount(I)V

    .line 226
    .line 227
    :cond_a
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    iget v4, v0, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 234
    .line 235
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 239
    move-result v5

    .line 240
    div-int/2addr v5, v3

    .line 241
    int-to-float v6, v5

    .line 242
    .line 243
    const/high16 v7, 0x40000000    # 2.0f

    .line 244
    div-float/2addr v4, v7

    .line 245
    sub-float/2addr v6, v4

    .line 246
    div-float/2addr v0, v7

    .line 247
    sub-float/2addr v6, v0

    .line 248
    float-to-int v0, v6

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 252
    move-result v4

    .line 253
    int-to-float v4, v4

    .line 254
    .line 255
    iget v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 256
    int-to-float v7, v6

    .line 257
    .line 258
    iget v8, p0, Lcom/kubi/resources/widget/OrderBookItemView;->q:F

    .line 259
    mul-float/2addr v7, v8

    .line 260
    sub-float/2addr v4, v7

    .line 261
    int-to-float v6, v6

    .line 262
    div-float/2addr v4, v6

    .line 263
    .line 264
    :goto_4
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 265
    array-length v6, v6

    .line 266
    .line 267
    if-ge v1, v6, :cond_19

    .line 268
    .line 269
    iget v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    .line 270
    .line 271
    if-nez v6, :cond_e

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 275
    move-result v6

    .line 276
    .line 277
    if-ne v6, v2, :cond_c

    .line 278
    .line 279
    if-nez v1, :cond_b

    .line 280
    .line 281
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 282
    .line 283
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 287
    .line 288
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 289
    .line 290
    add-int/lit8 v7, v1, 0x1

    .line 291
    .line 292
    aget-object v6, v6, v7

    .line 293
    .line 294
    goto/16 :goto_8

    .line 295
    .line 296
    :cond_b
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 297
    .line 298
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 302
    .line 303
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 304
    .line 305
    add-int/lit8 v7, v1, -0x1

    .line 306
    .line 307
    aget-object v6, v6, v7

    .line 308
    .line 309
    goto/16 :goto_8

    .line 310
    .line 311
    :cond_c
    if-nez v1, :cond_d

    .line 312
    .line 313
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 314
    .line 315
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 319
    goto :goto_5

    .line 320
    .line 321
    :cond_d
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 322
    .line 323
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 327
    .line 328
    :goto_5
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 329
    .line 330
    aget-object v6, v6, v1

    .line 331
    .line 332
    goto/16 :goto_8

    .line 333
    .line 334
    .line 335
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 336
    move-result v6

    .line 337
    .line 338
    if-ne v6, v2, :cond_12

    .line 339
    .line 340
    iget v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 341
    .line 342
    if-nez v6, :cond_10

    .line 343
    .line 344
    if-nez v1, :cond_f

    .line 345
    .line 346
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 347
    .line 348
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 352
    .line 353
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 354
    .line 355
    add-int/lit8 v7, v1, 0x1

    .line 356
    .line 357
    aget-object v6, v6, v7

    .line 358
    goto :goto_8

    .line 359
    .line 360
    :cond_f
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 361
    .line 362
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 363
    .line 364
    .line 365
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 366
    .line 367
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 368
    .line 369
    add-int/lit8 v7, v1, -0x1

    .line 370
    .line 371
    aget-object v6, v6, v7

    .line 372
    goto :goto_8

    .line 373
    .line 374
    :cond_10
    if-nez v1, :cond_11

    .line 375
    .line 376
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 377
    .line 378
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 382
    goto :goto_6

    .line 383
    .line 384
    :cond_11
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 385
    .line 386
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 387
    .line 388
    .line 389
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 390
    .line 391
    :goto_6
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 392
    .line 393
    aget-object v6, v6, v1

    .line 394
    goto :goto_8

    .line 395
    .line 396
    :cond_12
    iget v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 397
    .line 398
    if-nez v6, :cond_14

    .line 399
    .line 400
    if-nez v1, :cond_13

    .line 401
    .line 402
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 403
    .line 404
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 408
    goto :goto_7

    .line 409
    .line 410
    :cond_13
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 411
    .line 412
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 416
    .line 417
    :goto_7
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 418
    .line 419
    aget-object v6, v6, v1

    .line 420
    goto :goto_8

    .line 421
    .line 422
    :cond_14
    if-nez v1, :cond_15

    .line 423
    .line 424
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 425
    .line 426
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

    .line 427
    .line 428
    .line 429
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 430
    .line 431
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 432
    .line 433
    add-int/lit8 v7, v1, 0x1

    .line 434
    .line 435
    aget-object v6, v6, v7

    .line 436
    goto :goto_8

    .line 437
    .line 438
    :cond_15
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 439
    .line 440
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 444
    .line 445
    iget-object v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 446
    .line 447
    add-int/lit8 v7, v1, -0x1

    .line 448
    .line 449
    aget-object v6, v6, v7

    .line 450
    .line 451
    .line 452
    :goto_8
    invoke-direct {p0}, Lcom/kubi/resources/widget/OrderBookItemView;->getBitmapRight()Landroid/graphics/Bitmap;

    .line 453
    move-result-object v7

    .line 454
    .line 455
    .line 456
    invoke-direct {p0}, Lcom/kubi/resources/widget/OrderBookItemView;->getBitmapLeft()Landroid/graphics/Bitmap;

    .line 457
    move-result-object v9

    .line 458
    .line 459
    iget v10, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 460
    const/4 v11, 0x0

    .line 461
    .line 462
    const/high16 v12, 0x40400000    # 3.0f

    .line 463
    .line 464
    if-ne v10, v3, :cond_16

    .line 465
    .line 466
    iget-object v10, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 467
    array-length v10, v10

    .line 468
    sub-int/2addr v10, v2

    .line 469
    .line 470
    if-ne v1, v10, :cond_16

    .line 471
    .line 472
    iget-object v9, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 476
    move-result v9

    .line 477
    .line 478
    .line 479
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 480
    move-result v10

    .line 481
    int-to-float v10, v10

    .line 482
    sub-float/2addr v10, v9

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 486
    move-result v9

    .line 487
    int-to-float v9, v9

    .line 488
    sub-float/2addr v10, v9

    .line 489
    .line 490
    iget-boolean v9, p0, Lcom/kubi/resources/widget/OrderBookItemView;->o:Z

    .line 491
    .line 492
    if-eqz v9, :cond_18

    .line 493
    .line 494
    iget v9, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 495
    .line 496
    if-eqz v9, :cond_18

    .line 497
    .line 498
    iget v9, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    .line 499
    .line 500
    if-eqz v9, :cond_18

    .line 501
    .line 502
    const/high16 v9, 0x41000000    # 8.0f

    .line 503
    .line 504
    .line 505
    invoke-static {v9}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 506
    move-result v9

    .line 507
    int-to-float v9, v9

    .line 508
    .line 509
    sub-float v9, v10, v9

    .line 510
    .line 511
    .line 512
    invoke-static {v12}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 513
    move-result v12

    .line 514
    .line 515
    sub-int v12, v5, v12

    .line 516
    int-to-float v12, v12

    .line 517
    .line 518
    .line 519
    invoke-virtual {p1, v7, v9, v12, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 520
    goto :goto_9

    .line 521
    .line 522
    .line 523
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 524
    move-result v7

    .line 525
    int-to-float v7, v7

    .line 526
    .line 527
    add-float v10, v8, v7

    .line 528
    .line 529
    iget-boolean v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->o:Z

    .line 530
    .line 531
    if-eqz v7, :cond_18

    .line 532
    .line 533
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 534
    .line 535
    if-eqz v7, :cond_17

    .line 536
    .line 537
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    .line 538
    .line 539
    if-nez v7, :cond_18

    .line 540
    .line 541
    :cond_17
    iget-object v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 545
    move-result v7

    .line 546
    add-float/2addr v7, v10

    .line 547
    .line 548
    const/high16 v13, 0x40800000    # 4.0f

    .line 549
    .line 550
    .line 551
    invoke-static {v13}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 552
    move-result v13

    .line 553
    int-to-float v13, v13

    .line 554
    add-float/2addr v7, v13

    .line 555
    .line 556
    .line 557
    invoke-static {v12}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 558
    move-result v12

    .line 559
    .line 560
    sub-int v12, v5, v12

    .line 561
    int-to-float v12, v12

    .line 562
    .line 563
    .line 564
    invoke-virtual {p1, v9, v7, v12, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 565
    .line 566
    :cond_18
    :goto_9
    iget-object v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 567
    .line 568
    aput v10, v7, v1

    .line 569
    int-to-float v7, v0

    .line 570
    .line 571
    iget-object v9, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1, v6, v10, v7, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 575
    .line 576
    iget v6, p0, Lcom/kubi/resources/widget/OrderBookItemView;->q:F

    .line 577
    add-float/2addr v6, v4

    .line 578
    add-float/2addr v8, v6

    .line 579
    .line 580
    add-int/lit8 v1, v1, 0x1

    .line 581
    .line 582
    goto/16 :goto_4

    .line 583
    :cond_19
    return-void
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

.method public onMeasure(II)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->e()I

    .line 8
    move-result v1

    .line 9
    .line 10
    const/high16 v2, 0x40000000    # 2.0f

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    move-result v1

    .line 17
    .line 18
    :cond_0
    const/high16 p1, 0x41b00000    # 22.0f

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 22
    move-result p1

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 26
    move-result v0

    .line 27
    .line 28
    if-ne v0, v2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 32
    move-result p1

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 36
    return-void
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->t:Lcom/kubi/resources/widget/OrderBookItemView$a;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    goto :goto_3

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 30
    move-result v0

    .line 31
    .line 32
    :try_start_0
    iget v2, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 33
    .line 34
    new-array v2, v2, [Ljava/lang/String;

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    :goto_0
    iget-object v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 38
    array-length v5, v4

    .line 39
    .line 40
    if-ge v3, v5, :cond_7

    .line 41
    .line 42
    iget-object v5, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 43
    .line 44
    aget-object v6, v5, v3

    .line 45
    .line 46
    aget v4, v4, v3

    .line 47
    .line 48
    cmpg-float v4, v0, v4

    .line 49
    .line 50
    if-gez v4, :cond_3

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    goto :goto_3

    .line 54
    .line 55
    :cond_3
    iget-object v4, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 56
    .line 57
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

    .line 58
    .line 59
    if-nez v7, :cond_4

    .line 60
    move-object v5, v6

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_4
    iget v7, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 64
    sub-int/2addr v7, v3

    .line 65
    sub-int/2addr v7, v1

    .line 66
    .line 67
    aget-object v5, v5, v7

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 71
    move-result v4

    .line 72
    .line 73
    iget-object v5, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

    .line 74
    .line 75
    aget v5, v5, v3

    .line 76
    .line 77
    cmpg-float v7, v0, v5

    .line 78
    .line 79
    if-gez v7, :cond_5

    .line 80
    .line 81
    aput-object v6, v2, v3

    .line 82
    .line 83
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->t:Lcom/kubi/resources/widget/OrderBookItemView$a;

    .line 84
    neg-int v1, v3

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v1, v2}, Lcom/kubi/resources/widget/OrderBookItemView$a;->a(I[Ljava/lang/String;)V

    .line 88
    goto :goto_3

    .line 89
    :catch_0
    move-exception v0

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    add-float/2addr v5, v4

    .line 92
    .line 93
    cmpg-float v4, v0, v5

    .line 94
    .line 95
    if-gez v4, :cond_6

    .line 96
    .line 97
    aput-object v6, v2, v3

    .line 98
    .line 99
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->t:Lcom/kubi/resources/widget/OrderBookItemView$a;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v3, v2}, Lcom/kubi/resources/widget/OrderBookItemView$a;->a(I[Ljava/lang/String;)V

    .line 103
    goto :goto_3

    .line 104
    .line 105
    :cond_6
    aput-object v6, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    goto :goto_0

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-static {v0}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :cond_7
    :goto_3
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 115
    move-result p1

    .line 116
    return p1
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

.method public setAmountColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->j:I

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

.method public setBuyColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->e:I

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

.method public setBuyProgressColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->b:I

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

.method public setColumnCount(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->m:I

    .line 3
    .line 4
    new-array v0, p1, [Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->f:[Ljava/lang/String;

    .line 7
    .line 8
    new-array p1, p1, [F

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->g:[F

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setColumnPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->q:F

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
.end method

.method public setDirection(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->k:I

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

.method public setNeedDash(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->r:Z

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

.method public setNeedShowPosition(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->o:Z

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

.method public setOnSelectListener(Lcom/kubi/resources/widget/OrderBookItemView$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->t:Lcom/kubi/resources/widget/OrderBookItemView$a;

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

.method public setOrderBookType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->s:I

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->d:I

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->e:I

    .line 10
    .line 11
    :goto_0
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->i:I

    .line 12
    return-void
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

.method public setProgress(F)V
    .locals 1

    .line 1
    .line 2
    const/high16 v0, 0x42c80000    # 100.0f

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 6
    move-result p1

    .line 7
    .line 8
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->l:F

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

.method public setSellColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->d:I

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

.method public setSellProgressColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->c:I

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

.method public varargs setText([Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->p:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/OrderBookItemView;->b([Ljava/lang/String;)V

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

.method public setTextFont(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

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

.method public setTextSize(F)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/OrderBookItemView;->h:F

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/OrderBookItemView;->n:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
