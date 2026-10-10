.class Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;
.super Landroid/view/View;
.source "BubbleSeekBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BubbleView"
.end annotation


# instance fields
.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Path;

.field public d:Landroid/graphics/RectF;

.field public e:Landroid/graphics/Rect;

.field public f:Ljava/lang/String;

.field public final synthetic g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 4
    invoke-direct {p0, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, ""

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->f:Ljava/lang/String;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 9
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 11
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->e:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$2300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$2300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->f:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->f:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 34
    :cond_1
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    .line 17
    const/high16 v2, 0x40000000    # 2.0f

    .line 18
    div-float/2addr v1, v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    move-result v3

    .line 23
    int-to-float v3, v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 32
    move-result v1

    .line 33
    int-to-float v1, v1

    .line 34
    div-float/2addr v1, v2

    .line 35
    const/4 v3, 0x4

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    div-float/2addr v4, v2

    .line 42
    sub-float/2addr v1, v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 46
    move-result v4

    .line 47
    const/4 v5, 0x3

    .line 48
    .line 49
    .line 50
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 51
    move-result v6

    .line 52
    sub-int/2addr v4, v6

    .line 53
    int-to-float v4, v4

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    .line 58
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 59
    const/4 v1, 0x2

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 63
    move-result v4

    .line 64
    int-to-float v4, v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 68
    move-result v6

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 72
    move-result v7

    .line 73
    sub-int/2addr v6, v7

    .line 74
    int-to-float v6, v6

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 78
    .line 79
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 83
    move-result v4

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 87
    move-result v6

    .line 88
    sub-int/2addr v4, v6

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 92
    move-result v6

    .line 93
    mul-int/2addr v6, v1

    .line 94
    sub-int/2addr v4, v6

    .line 95
    int-to-float v4, v4

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 99
    move-result v6

    .line 100
    mul-int/2addr v6, v1

    .line 101
    int-to-float v6, v6

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 105
    move-result v7

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 109
    move-result v8

    .line 110
    sub-int/2addr v7, v8

    .line 111
    int-to-float v7, v7

    .line 112
    const/4 v8, 0x0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v8, v4, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 116
    .line 117
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 118
    .line 119
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 120
    .line 121
    const/high16 v6, 0x42b40000    # 90.0f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v4, v6, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 125
    .line 126
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 130
    move-result v4

    .line 131
    int-to-float v4, v4

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v8, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 135
    .line 136
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 140
    move-result v4

    .line 141
    mul-int/2addr v4, v1

    .line 142
    int-to-float v4, v4

    .line 143
    .line 144
    .line 145
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 146
    move-result v7

    .line 147
    mul-int/2addr v7, v1

    .line 148
    int-to-float v7, v7

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v8, v8, v4, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 152
    .line 153
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 154
    .line 155
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 156
    .line 157
    const/high16 v7, 0x43340000    # 180.0f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v4, v7, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 161
    .line 162
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 166
    move-result v4

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 170
    move-result v7

    .line 171
    sub-int/2addr v4, v7

    .line 172
    int-to-float v4, v4

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v4, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 176
    .line 177
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 181
    move-result v4

    .line 182
    .line 183
    .line 184
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 185
    move-result v7

    .line 186
    mul-int/2addr v7, v1

    .line 187
    sub-int/2addr v4, v7

    .line 188
    int-to-float v4, v4

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 192
    move-result v7

    .line 193
    int-to-float v7, v7

    .line 194
    .line 195
    .line 196
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 197
    move-result v9

    .line 198
    mul-int/2addr v9, v1

    .line 199
    int-to-float v9, v9

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v4, v8, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 203
    .line 204
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 205
    .line 206
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 207
    .line 208
    const/high16 v7, 0x43870000    # 270.0f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v4, v7, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 212
    .line 213
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 217
    move-result v4

    .line 218
    int-to-float v4, v4

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 222
    move-result v7

    .line 223
    .line 224
    .line 225
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 226
    move-result v9

    .line 227
    sub-int/2addr v7, v9

    .line 228
    .line 229
    .line 230
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 231
    move-result v9

    .line 232
    sub-int/2addr v7, v9

    .line 233
    int-to-float v7, v7

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 237
    .line 238
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 242
    move-result v4

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 246
    move-result v7

    .line 247
    mul-int/2addr v7, v1

    .line 248
    sub-int/2addr v4, v7

    .line 249
    int-to-float v4, v4

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 253
    move-result v7

    .line 254
    .line 255
    .line 256
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 257
    move-result v9

    .line 258
    sub-int/2addr v7, v9

    .line 259
    .line 260
    .line 261
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 262
    move-result v9

    .line 263
    mul-int/2addr v9, v1

    .line 264
    sub-int/2addr v7, v9

    .line 265
    int-to-float v1, v7

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 269
    move-result v7

    .line 270
    int-to-float v7, v7

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 274
    move-result v9

    .line 275
    .line 276
    .line 277
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 278
    move-result v10

    .line 279
    sub-int/2addr v9, v10

    .line 280
    int-to-float v9, v9

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v4, v1, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 284
    .line 285
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 286
    .line 287
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->d:Landroid/graphics/RectF;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1, v8, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 291
    .line 292
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 296
    move-result v1

    .line 297
    int-to-float v1, v1

    .line 298
    div-float/2addr v1, v2

    .line 299
    .line 300
    .line 301
    invoke-static {v3}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 302
    move-result v3

    .line 303
    int-to-float v3, v3

    .line 304
    div-float/2addr v3, v2

    .line 305
    add-float/2addr v1, v3

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 309
    move-result v3

    .line 310
    .line 311
    .line 312
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 313
    move-result v4

    .line 314
    sub-int/2addr v3, v4

    .line 315
    int-to-float v3, v3

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 319
    .line 320
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 324
    move-result v1

    .line 325
    int-to-float v1, v1

    .line 326
    div-float/2addr v1, v2

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 330
    move-result v3

    .line 331
    int-to-float v3, v3

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 335
    .line 336
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 337
    .line 338
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 339
    .line 340
    .line 341
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$2000(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I

    .line 342
    move-result v1

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 346
    .line 347
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 348
    .line 349
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 353
    .line 354
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->c:Landroid/graphics/Path;

    .line 355
    .line 356
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 360
    .line 361
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 362
    .line 363
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 364
    .line 365
    .line 366
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$2100(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I

    .line 367
    move-result v1

    .line 368
    int-to-float v1, v1

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 372
    .line 373
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 374
    .line 375
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->g:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 376
    .line 377
    .line 378
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$2200(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I

    .line 379
    move-result v1

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 383
    .line 384
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 385
    .line 386
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->f:Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 390
    move-result v3

    .line 391
    .line 392
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->e:Landroid/graphics/Rect;

    .line 393
    const/4 v6, 0x0

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1, v6, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 397
    .line 398
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 402
    move-result-object v0

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 406
    move-result v1

    .line 407
    .line 408
    .line 409
    invoke-static {v5}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 410
    move-result v3

    .line 411
    sub-int/2addr v1, v3

    .line 412
    int-to-float v1, v1

    .line 413
    div-float/2addr v1, v2

    .line 414
    .line 415
    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 416
    .line 417
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 418
    .line 419
    sub-float v0, v3, v0

    .line 420
    div-float/2addr v0, v2

    .line 421
    add-float/2addr v1, v0

    .line 422
    sub-float/2addr v1, v3

    .line 423
    .line 424
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->f:Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 428
    move-result v3

    .line 429
    int-to-float v3, v3

    .line 430
    div-float/2addr v3, v2

    .line 431
    .line 432
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->b:Landroid/graphics/Paint;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 436
    return-void
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

.method public onMeasure(II)V
    .locals 0

    .line 1
    .line 2
    const/16 p1, 0x20

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 6
    move-result p1

    .line 7
    .line 8
    const/16 p2, 0x13

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 12
    move-result p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 16
    return-void
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
.end method
