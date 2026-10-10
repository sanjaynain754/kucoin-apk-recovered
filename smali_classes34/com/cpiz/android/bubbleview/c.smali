.class public Lcom/cpiz/android/bubbleview/c;
.super Landroid/widget/PopupWindow;
.source "BubblePopupWindow.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RtlHardcoded"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/cpiz/android/bubbleview/c$d;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Lcom/cpiz/android/bubbleview/BubbleStyle;

.field public d:J

.field public e:Landroid/os/Handler;

.field public f:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle;)V
    .locals 2

    .line 1
    const/4 v0, -0x2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lx2/b;->b(I)I

    .line 9
    move-result p1

    .line 10
    .line 11
    iput p1, p0, Lcom/cpiz/android/bubbleview/c;->a:I

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput p1, p0, Lcom/cpiz/android/bubbleview/c;->b:I

    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/cpiz/android/bubbleview/c;->d:J

    .line 19
    .line 20
    new-instance v0, Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/c;->e:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v0, Lcom/cpiz/android/bubbleview/c$a;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/cpiz/android/bubbleview/c$a;-><init>(Lcom/cpiz/android/bubbleview/c;)V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/c;->f:Ljava/lang/Runnable;

    .line 37
    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    iput-object p2, p0, Lcom/cpiz/android/bubbleview/c;->c:Lcom/cpiz/android/bubbleview/BubbleStyle;

    .line 41
    .line 42
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    const/4 p1, 0x1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/cpiz/android/bubbleview/c;->k(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lcom/cpiz/android/bubbleview/c;->j(Z)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    const-string p2, "Bubble can not be null"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1
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
.end method

.method public static a(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/c$c;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p0

    .line 7
    .line 8
    aget p0, v0, p0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    sget p0, Lcom/cpiz/android/bubbleview/R$style;->AnimationArrowNone:I

    .line 23
    return p0

    .line 24
    .line 25
    :cond_0
    sget p0, Lcom/cpiz/android/bubbleview/R$style;->AnimationArrowRight:I

    .line 26
    return p0

    .line 27
    .line 28
    :cond_1
    sget p0, Lcom/cpiz/android/bubbleview/R$style;->AnimationArrowLeft:I

    .line 29
    return p0

    .line 30
    .line 31
    :cond_2
    sget p0, Lcom/cpiz/android/bubbleview/R$style;->AnimationArrowDown:I

    .line 32
    return p0

    .line 33
    .line 34
    :cond_3
    sget p0, Lcom/cpiz/android/bubbleview/R$style;->AnimationArrowUp:I

    .line 35
    return p0
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

.method public static b(Landroid/view/View;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lx2/b;->d(Landroid/view/View;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static c(IIILandroid/graphics/Rect;IILcom/cpiz/android/bubbleview/d;IIILcom/cpiz/android/bubbleview/c$d;)V
    .locals 7

    .line 1
    .line 2
    move-object/from16 v5, p10

    .line 3
    .line 4
    .line 5
    invoke-virtual {p6}, Lcom/cpiz/android/bubbleview/d;->a()Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 6
    move-result-object p5

    .line 7
    .line 8
    iput-object p5, v5, Lcom/cpiz/android/bubbleview/c$d;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 9
    .line 10
    .line 11
    invoke-static {p5}, Lcom/cpiz/android/bubbleview/c;->a(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)I

    .line 12
    move-result p5

    .line 13
    .line 14
    iput p5, v5, Lcom/cpiz/android/bubbleview/c$d;->c:I

    .line 15
    const/4 p5, 0x0

    .line 16
    .line 17
    iput p5, v5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 18
    move v0, p0

    .line 19
    move-object v1, p3

    .line 20
    move v2, p4

    .line 21
    move-object v3, p6

    .line 22
    move v4, p7

    .line 23
    move-object v6, v5

    .line 24
    .line 25
    move/from16 v5, p9

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v6}, Lcom/cpiz/android/bubbleview/c;->e(ILandroid/graphics/Rect;ILcom/cpiz/android/bubbleview/d;IILcom/cpiz/android/bubbleview/c$d;)V

    .line 29
    move-object v2, v3

    .line 30
    move v3, v4

    .line 31
    move v4, v5

    .line 32
    move-object v5, v6

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v5}, Lcom/cpiz/android/bubbleview/c;->d(ILandroid/graphics/Rect;Lcom/cpiz/android/bubbleview/d;IILcom/cpiz/android/bubbleview/c$d;)V

    .line 36
    move v0, p1

    .line 37
    move v4, p8

    .line 38
    move-object v3, v2

    .line 39
    move-object v2, v1

    .line 40
    move v1, p2

    .line 41
    .line 42
    .line 43
    invoke-static/range {v0 .. v5}, Lcom/cpiz/android/bubbleview/c;->f(IILandroid/graphics/Rect;Lcom/cpiz/android/bubbleview/d;ILcom/cpiz/android/bubbleview/c$d;)V

    .line 44
    .line 45
    sget-object p0, Lcom/cpiz/android/bubbleview/c$c;->a:[I

    .line 46
    .line 47
    iget-object p1, v5, Lcom/cpiz/android/bubbleview/c$d;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 51
    move-result p1

    .line 52
    .line 53
    aget p0, p0, p1

    .line 54
    const/4 p1, 0x1

    .line 55
    const/4 p2, 0x4

    .line 56
    const/4 p3, 0x3

    .line 57
    .line 58
    if-eq p0, p1, :cond_4

    .line 59
    const/4 p1, 0x2

    .line 60
    .line 61
    if-eq p0, p1, :cond_4

    .line 62
    .line 63
    if-eq p0, p3, :cond_0

    .line 64
    .line 65
    if-eq p0, p2, :cond_0

    .line 66
    .line 67
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 68
    .line 69
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-virtual {p6}, Lcom/cpiz/android/bubbleview/d;->c()I

    .line 74
    move-result p0

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    if-eq p0, p3, :cond_2

    .line 79
    .line 80
    if-eq p0, p2, :cond_1

    .line 81
    .line 82
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 83
    .line 84
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 85
    return-void

    .line 86
    .line 87
    :cond_1
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfEnd:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 88
    .line 89
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 90
    return-void

    .line 91
    .line 92
    :cond_2
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfBegin:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 93
    .line 94
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 95
    return-void

    .line 96
    .line 97
    :cond_3
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 98
    .line 99
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 100
    return-void

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p6}, Lcom/cpiz/android/bubbleview/d;->b()I

    .line 104
    move-result p0

    .line 105
    .line 106
    if-eqz p0, :cond_7

    .line 107
    .line 108
    if-eq p0, p3, :cond_6

    .line 109
    .line 110
    if-eq p0, p2, :cond_5

    .line 111
    .line 112
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 113
    .line 114
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 115
    return-void

    .line 116
    .line 117
    :cond_5
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfEnd:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 118
    .line 119
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 120
    return-void

    .line 121
    .line 122
    :cond_6
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->SelfBegin:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 123
    .line 124
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 125
    return-void

    .line 126
    .line 127
    :cond_7
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 128
    .line 129
    iput-object p0, v5, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 130
    return-void
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
.end method

.method public static d(ILandroid/graphics/Rect;Lcom/cpiz/android/bubbleview/d;IILcom/cpiz/android/bubbleview/c$d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/cpiz/android/bubbleview/d;->b()I

    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x2

    .line 6
    .line 7
    if-eqz p2, :cond_4

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    if-eq p2, v1, :cond_3

    .line 11
    .line 12
    if-eq p2, v0, :cond_2

    .line 13
    const/4 v0, 0x3

    .line 14
    .line 15
    if-eq p2, v0, :cond_1

    .line 16
    const/4 p0, 0x4

    .line 17
    .line 18
    if-eq p2, p0, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    iget p0, p1, Landroid/graphics/Rect;->right:I

    .line 22
    sub-int/2addr p0, p3

    .line 23
    sub-int/2addr p0, p4

    .line 24
    .line 25
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 29
    sub-int/2addr p0, p1

    .line 30
    sub-int/2addr p0, p3

    .line 31
    sub-int/2addr p0, p4

    .line 32
    .line 33
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 34
    return-void

    .line 35
    .line 36
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 37
    sub-int/2addr p0, p1

    .line 38
    sub-int/2addr p0, p3

    .line 39
    sub-int/2addr p0, p4

    .line 40
    .line 41
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 42
    return-void

    .line 43
    .line 44
    :cond_3
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 45
    sub-int/2addr p0, p3

    .line 46
    sub-int/2addr p0, p4

    .line 47
    .line 48
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 49
    return-void

    .line 50
    :cond_4
    mul-int/2addr p4, v0

    .line 51
    sub-int/2addr p0, p4

    .line 52
    .line 53
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 54
    return-void
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
.end method

.method public static e(ILandroid/graphics/Rect;ILcom/cpiz/android/bubbleview/d;IILcom/cpiz/android/bubbleview/c$d;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/cpiz/android/bubbleview/d;->b()I

    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x3

    .line 8
    .line 9
    if-eqz p3, :cond_4

    .line 10
    .line 11
    if-eq p3, v0, :cond_3

    .line 12
    .line 13
    if-eq p3, v1, :cond_2

    .line 14
    .line 15
    if-eq p3, v2, :cond_1

    .line 16
    const/4 p2, 0x4

    .line 17
    .line 18
    if-eq p3, p2, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    iget p2, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 22
    .line 23
    or-int/lit8 p2, p2, 0x5

    .line 24
    .line 25
    iput p2, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 26
    .line 27
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 28
    sub-int/2addr p0, p1

    .line 29
    add-int/2addr p0, p4

    .line 30
    .line 31
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 32
    return-void

    .line 33
    .line 34
    :cond_1
    iget p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 35
    or-int/2addr p0, v2

    .line 36
    .line 37
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 38
    .line 39
    iget p0, p1, Landroid/graphics/Rect;->left:I

    .line 40
    add-int/2addr p0, p4

    .line 41
    .line 42
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 43
    return-void

    .line 44
    .line 45
    :cond_2
    iget p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 46
    or-int/2addr p0, v2

    .line 47
    .line 48
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 49
    .line 50
    iget p0, p1, Landroid/graphics/Rect;->right:I

    .line 51
    add-int/2addr p0, p4

    .line 52
    .line 53
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 54
    return-void

    .line 55
    .line 56
    :cond_3
    iget p2, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 57
    .line 58
    or-int/lit8 p2, p2, 0x5

    .line 59
    .line 60
    iput p2, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 61
    .line 62
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 63
    sub-int/2addr p0, p1

    .line 64
    add-int/2addr p0, p4

    .line 65
    .line 66
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 67
    return-void

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 71
    move-result p3

    .line 72
    div-int/2addr p2, v1

    .line 73
    add-int/2addr p2, p5

    .line 74
    .line 75
    if-ge p3, p2, :cond_5

    .line 76
    .line 77
    iget p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 78
    or-int/2addr p0, v2

    .line 79
    .line 80
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 81
    .line 82
    iput p5, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 83
    return-void

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 87
    move-result p3

    .line 88
    .line 89
    sub-int p3, p0, p3

    .line 90
    .line 91
    if-ge p3, p2, :cond_6

    .line 92
    .line 93
    iget p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 94
    .line 95
    or-int/lit8 p0, p0, 0x5

    .line 96
    .line 97
    iput p0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 98
    .line 99
    iput p5, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 100
    return-void

    .line 101
    .line 102
    :cond_6
    iput v0, p6, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 106
    move-result p1

    .line 107
    div-int/2addr p0, v1

    .line 108
    sub-int/2addr p1, p0

    .line 109
    .line 110
    iput p1, p6, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 111
    return-void
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
.end method

.method public static f(IILandroid/graphics/Rect;Lcom/cpiz/android/bubbleview/d;ILcom/cpiz/android/bubbleview/c$d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/cpiz/android/bubbleview/d;->c()I

    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x2

    .line 6
    .line 7
    if-eqz p3, :cond_4

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    if-eq p3, v1, :cond_3

    .line 11
    .line 12
    if-eq p3, v0, :cond_2

    .line 13
    const/4 v0, 0x3

    .line 14
    .line 15
    if-eq p3, v0, :cond_1

    .line 16
    const/4 v0, 0x4

    .line 17
    .line 18
    if-eq p3, v0, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    iget p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 22
    .line 23
    or-int/lit8 p3, p3, 0x50

    .line 24
    .line 25
    iput p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 26
    add-int/2addr p0, p1

    .line 27
    .line 28
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 29
    sub-int/2addr p0, p1

    .line 30
    add-int/2addr p0, p4

    .line 31
    .line 32
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 33
    return-void

    .line 34
    .line 35
    :cond_1
    iget p0, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 36
    .line 37
    or-int/lit8 p0, p0, 0x30

    .line 38
    .line 39
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 40
    .line 41
    iget p0, p2, Landroid/graphics/Rect;->top:I

    .line 42
    add-int/2addr p0, p4

    .line 43
    .line 44
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 45
    return-void

    .line 46
    .line 47
    :cond_2
    iget p0, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 48
    .line 49
    or-int/lit8 p0, p0, 0x30

    .line 50
    .line 51
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 52
    .line 53
    iget p0, p2, Landroid/graphics/Rect;->bottom:I

    .line 54
    add-int/2addr p0, p4

    .line 55
    .line 56
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 57
    return-void

    .line 58
    .line 59
    :cond_3
    iget p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 60
    .line 61
    or-int/lit8 p3, p3, 0x50

    .line 62
    .line 63
    iput p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 64
    add-int/2addr p0, p1

    .line 65
    .line 66
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 67
    sub-int/2addr p0, p1

    .line 68
    add-int/2addr p0, p4

    .line 69
    .line 70
    iput p0, p5, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 71
    return-void

    .line 72
    .line 73
    :cond_4
    iget p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 74
    .line 75
    or-int/lit8 p3, p3, 0x10

    .line 76
    .line 77
    iput p3, p5, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    .line 81
    move-result p2

    .line 82
    div-int/2addr p1, v0

    .line 83
    sub-int/2addr p2, p1

    .line 84
    div-int/2addr p0, v0

    .line 85
    sub-int/2addr p2, p0

    .line 86
    .line 87
    iput p2, p5, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 88
    return-void
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
.end method

.method public static g(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 7
    .line 8
    new-instance v1, Landroid/graphics/Rect;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    aget v2, v0, v2

    .line 12
    const/4 v3, 0x1

    .line 13
    .line 14
    aget v4, v0, v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    move-result v5

    .line 19
    add-int/2addr v5, v2

    .line 20
    .line 21
    aget v0, v0, v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    move-result p0

    .line 26
    add-int/2addr v0, p0

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    return-object v1
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


# virtual methods
.method public dismiss()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/c;->e:Landroid/os/Handler;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/c;->f:Ljava/lang/Runnable;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public h(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/c;->b:I

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

.method public i(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/c;->e:Landroid/os/Handler;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/c;->f:Ljava/lang/Runnable;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    iput-wide p1, p0, Lcom/cpiz/android/bubbleview/c;->d:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/c;->e:Landroid/os/Handler;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/c;->f:Ljava/lang/Runnable;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 23
    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/cpiz/android/bubbleview/c$b;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/cpiz/android/bubbleview/c$b;-><init>(Lcom/cpiz/android/bubbleview/c;)V

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public k(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

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
.end method

.method public l(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/c;->a:I

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

.method public m(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, v0}, Lcom/cpiz/android/bubbleview/c;->n(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;I)V

    .line 5
    return-void
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

.method public n(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;I)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/c$c;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p2

    .line 7
    .line 8
    aget p2, v0, p2

    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eq p2, v1, :cond_3

    .line 14
    .line 15
    if-eq p2, v0, :cond_2

    .line 16
    const/4 v3, 0x3

    .line 17
    .line 18
    if-eq p2, v3, :cond_1

    .line 19
    const/4 v0, 0x4

    .line 20
    .line 21
    if-eq p2, v0, :cond_0

    .line 22
    .line 23
    new-instance p2, Lcom/cpiz/android/bubbleview/d;

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, v2, v2}, Lcom/cpiz/android/bubbleview/d;-><init>(II)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    new-instance p2, Lcom/cpiz/android/bubbleview/d;

    .line 30
    .line 31
    .line 32
    invoke-direct {p2, v1, v2}, Lcom/cpiz/android/bubbleview/d;-><init>(II)V

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    new-instance p2, Lcom/cpiz/android/bubbleview/d;

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, v0, v2}, Lcom/cpiz/android/bubbleview/d;-><init>(II)V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_2
    new-instance p2, Lcom/cpiz/android/bubbleview/d;

    .line 42
    .line 43
    .line 44
    invoke-direct {p2, v2, v1}, Lcom/cpiz/android/bubbleview/d;-><init>(II)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_3
    new-instance p2, Lcom/cpiz/android/bubbleview/d;

    .line 48
    .line 49
    .line 50
    invoke-direct {p2, v2, v0}, Lcom/cpiz/android/bubbleview/d;-><init>(II)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p3}, Lcom/cpiz/android/bubbleview/c;->o(Landroid/view/View;Lcom/cpiz/android/bubbleview/d;II)V

    .line 54
    return-void
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
.end method

.method public o(Landroid/view/View;Lcom/cpiz/android/bubbleview/d;II)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/c;->dismiss()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lcom/cpiz/android/bubbleview/c;->b(Landroid/view/View;)I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/cpiz/android/bubbleview/c;->g(Landroid/view/View;)Landroid/graphics/Rect;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iget v5, p0, Lcom/cpiz/android/bubbleview/c;->a:I

    .line 38
    .line 39
    mul-int/lit8 v5, v5, 0x2

    .line 40
    .line 41
    sub-int v5, v1, v5

    .line 42
    .line 43
    const/high16 v6, -0x80000000

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 47
    move-result v5

    .line 48
    .line 49
    iget v7, p0, Lcom/cpiz/android/bubbleview/c;->a:I

    .line 50
    .line 51
    mul-int/lit8 v7, v7, 0x2

    .line 52
    .line 53
    sub-int v7, v2, v7

    .line 54
    .line 55
    .line 56
    invoke-static {v7, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 57
    move-result v6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v5, v6}, Landroid/view/View;->measure(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    move-result v5

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 76
    move-result v6

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    .line 87
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    const-string/jumbo v7, "w:%d, h:%d"

    .line 92
    .line 93
    .line 94
    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    const-string v7, "BubblePopupWindow"

    .line 98
    .line 99
    .line 100
    invoke-static {v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    new-instance v11, Lcom/cpiz/android/bubbleview/c$d;

    .line 103
    const/4 v0, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v11, p0, v0}, Lcom/cpiz/android/bubbleview/c$d;-><init>(Lcom/cpiz/android/bubbleview/c;Lcom/cpiz/android/bubbleview/c$a;)V

    .line 107
    .line 108
    iget v10, p0, Lcom/cpiz/android/bubbleview/c;->a:I

    .line 109
    move-object v7, p2

    .line 110
    move v8, p3

    .line 111
    .line 112
    move/from16 v9, p4

    .line 113
    .line 114
    .line 115
    invoke-static/range {v1 .. v11}, Lcom/cpiz/android/bubbleview/c;->c(IIILandroid/graphics/Rect;IILcom/cpiz/android/bubbleview/d;IIILcom/cpiz/android/bubbleview/c$d;)V

    .line 116
    const/4 p2, -0x2

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 123
    .line 124
    iget p2, v11, Lcom/cpiz/android/bubbleview/c$d;->c:I

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 128
    .line 129
    iget p2, v11, Lcom/cpiz/android/bubbleview/c$d;->d:I

    .line 130
    .line 131
    if-le v5, p2, :cond_0

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 135
    .line 136
    :cond_0
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/c;->c:Lcom/cpiz/android/bubbleview/BubbleStyle;

    .line 137
    .line 138
    iget-object v0, v11, Lcom/cpiz/android/bubbleview/c$d;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 139
    .line 140
    .line 141
    invoke-interface {p2, v0}, Lcom/cpiz/android/bubbleview/BubbleStyle;->setArrowDirection(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V

    .line 142
    .line 143
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/c;->c:Lcom/cpiz/android/bubbleview/BubbleStyle;

    .line 144
    .line 145
    iget-object v0, v11, Lcom/cpiz/android/bubbleview/c$d;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 146
    .line 147
    .line 148
    invoke-interface {p2, v0}, Lcom/cpiz/android/bubbleview/BubbleStyle;->setArrowPosPolicy(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;)V

    .line 149
    .line 150
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/c;->c:Lcom/cpiz/android/bubbleview/BubbleStyle;

    .line 151
    .line 152
    .line 153
    invoke-interface {p2, p1}, Lcom/cpiz/android/bubbleview/BubbleStyle;->setArrowTo(Landroid/view/View;)V

    .line 154
    .line 155
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/c;->c:Lcom/cpiz/android/bubbleview/BubbleStyle;

    .line 156
    .line 157
    iget v0, p0, Lcom/cpiz/android/bubbleview/c;->b:I

    .line 158
    int-to-float v0, v0

    .line 159
    .line 160
    .line 161
    invoke-interface {p2, v0}, Lcom/cpiz/android/bubbleview/BubbleStyle;->setArrowPosDelta(F)V

    .line 162
    .line 163
    iget p2, v11, Lcom/cpiz/android/bubbleview/c$d;->e:I

    .line 164
    .line 165
    iget v0, v11, Lcom/cpiz/android/bubbleview/c$d;->f:I

    .line 166
    .line 167
    iget v1, v11, Lcom/cpiz/android/bubbleview/c$d;->g:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 171
    .line 172
    iget-wide p1, p0, Lcom/cpiz/android/bubbleview/c;->d:J

    .line 173
    .line 174
    const-wide/16 v0, 0x0

    .line 175
    .line 176
    cmp-long v0, p1, v0

    .line 177
    .line 178
    if-lez v0, :cond_1

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/c;->i(J)V

    .line 182
    :cond_1
    return-void
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
.end method
