.class public Lr4/c;
.super Ljava/lang/Object;
.source "GenericDraweeHierarchyInflater.java"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 5
    move-result p1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/b;->s()Lcom/facebook/drawee/generic/RoundingParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/facebook/drawee/generic/RoundingParams;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lcom/facebook/drawee/generic/RoundingParams;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lr4/b;->J(Lcom/facebook/drawee/generic/RoundingParams;)Lr4/b;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lr4/b;->s()Lcom/facebook/drawee/generic/RoundingParams;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 5
    move-result p0

    .line 6
    .line 7
    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    new-instance p0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    const-string p1, "XML attribute not specified!"

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 16
    throw p0

    .line 17
    .line 18
    :pswitch_0
    sget-object p0, Lcom/facebook/drawee/drawable/q;->k:Lcom/facebook/drawee/drawable/q;

    .line 19
    return-object p0

    .line 20
    .line 21
    :pswitch_1
    sget-object p0, Lcom/facebook/drawee/drawable/q;->j:Lcom/facebook/drawee/drawable/q;

    .line 22
    return-object p0

    .line 23
    .line 24
    :pswitch_2
    sget-object p0, Lcom/facebook/drawee/drawable/q;->i:Lcom/facebook/drawee/drawable/q;

    .line 25
    return-object p0

    .line 26
    .line 27
    :pswitch_3
    sget-object p0, Lcom/facebook/drawee/drawable/q;->h:Lcom/facebook/drawee/drawable/q;

    .line 28
    return-object p0

    .line 29
    .line 30
    :pswitch_4
    sget-object p0, Lcom/facebook/drawee/drawable/q;->g:Lcom/facebook/drawee/drawable/q;

    .line 31
    return-object p0

    .line 32
    .line 33
    :pswitch_5
    sget-object p0, Lcom/facebook/drawee/drawable/q;->f:Lcom/facebook/drawee/drawable/q;

    .line 34
    return-object p0

    .line 35
    .line 36
    :pswitch_6
    sget-object p0, Lcom/facebook/drawee/drawable/q;->e:Lcom/facebook/drawee/drawable/q;

    .line 37
    return-object p0

    .line 38
    .line 39
    :pswitch_7
    sget-object p0, Lcom/facebook/drawee/drawable/q;->d:Lcom/facebook/drawee/drawable/q;

    .line 40
    return-object p0

    .line 41
    .line 42
    :pswitch_8
    sget-object p0, Lcom/facebook/drawee/drawable/q;->a:Lcom/facebook/drawee/drawable/q;

    .line 43
    return-object p0

    .line 44
    :pswitch_9
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    nop

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
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static d(Landroid/content/Context;Landroid/util/AttributeSet;)Lr4/b;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "GenericDraweeHierarchyBuilder#inflateBuilder"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    new-instance v1, Lr4/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v0}, Lr4/b;-><init>(Landroid/content/res/Resources;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p0, p1}, Lr4/c;->e(Lr4/b;Landroid/content/Context;Landroid/util/AttributeSet;)Lr4/b;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ld6/b;->d()Z

    .line 28
    move-result p1

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ld6/b;->b()V

    .line 34
    :cond_1
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static e(Lr4/b;Landroid/content/Context;Landroid/util/AttributeSet;)Lr4/b;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    if-eqz v2, :cond_26

    .line 9
    .line 10
    sget-object v6, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy:[I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 18
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x1

    .line 22
    const/4 v9, 0x1

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v11, 0x1

    .line 25
    const/4 v12, 0x1

    .line 26
    const/4 v13, 0x1

    .line 27
    const/4 v14, 0x1

    .line 28
    const/4 v15, 0x1

    .line 29
    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    :goto_0
    if-ge v7, v6, :cond_1d

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 36
    move-result v3

    .line 37
    .line 38
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_actualImageScaleType:I

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, Lr4/c;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Lr4/b;->v(Lcom/facebook/drawee/drawable/q;)Lr4/b;

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    .line 52
    goto/16 :goto_b

    .line 53
    .line 54
    :cond_0
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_placeholderImage:I

    .line 55
    .line 56
    if-ne v3, v4, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Lr4/b;->C(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_1
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_pressedStateOverlayImage:I

    .line 68
    .line 69
    if-ne v3, v4, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3}, Lr4/b;->E(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 77
    .line 78
    goto/16 :goto_1

    .line 79
    .line 80
    :cond_2
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_progressBarImage:I

    .line 81
    .line 82
    if-ne v3, v4, :cond_3

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lr4/b;->F(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 90
    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_3
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_fadeDuration:I

    .line 94
    .line 95
    if-ne v3, v4, :cond_4

    .line 96
    const/4 v4, 0x0

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 100
    move-result v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lr4/b;->y(I)Lr4/b;

    .line 104
    goto :goto_1

    .line 105
    .line 106
    :cond_4
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_viewAspectRatio:I

    .line 107
    .line 108
    if-ne v3, v4, :cond_5

    .line 109
    const/4 v4, 0x0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 113
    move-result v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Lr4/b;->x(F)Lr4/b;

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :cond_5
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_placeholderImageScaleType:I

    .line 120
    .line 121
    if-ne v3, v4, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-static {v2, v3}, Lr4/c;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3}, Lr4/b;->D(Lcom/facebook/drawee/drawable/q;)Lr4/b;

    .line 129
    goto :goto_1

    .line 130
    .line 131
    :cond_6
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_retryImage:I

    .line 132
    .line 133
    if-ne v3, v4, :cond_7

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v3}, Lr4/b;->H(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 141
    goto :goto_1

    .line 142
    .line 143
    :cond_7
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_retryImageScaleType:I

    .line 144
    .line 145
    if-ne v3, v4, :cond_8

    .line 146
    .line 147
    .line 148
    invoke-static {v2, v3}, Lr4/c;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, Lr4/b;->I(Lcom/facebook/drawee/drawable/q;)Lr4/b;

    .line 153
    goto :goto_1

    .line 154
    .line 155
    :cond_8
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_failureImage:I

    .line 156
    .line 157
    if-ne v3, v4, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v3}, Lr4/b;->z(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 165
    goto :goto_1

    .line 166
    .line 167
    :cond_9
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_failureImageScaleType:I

    .line 168
    .line 169
    if-ne v3, v4, :cond_a

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v3}, Lr4/c;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v3}, Lr4/b;->A(Lcom/facebook/drawee/drawable/q;)Lr4/b;

    .line 177
    goto :goto_1

    .line 178
    .line 179
    :cond_a
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_progressBarImageScaleType:I

    .line 180
    .line 181
    if-ne v3, v4, :cond_b

    .line 182
    .line 183
    .line 184
    invoke-static {v2, v3}, Lr4/c;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/q;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v3}, Lr4/b;->G(Lcom/facebook/drawee/drawable/q;)Lr4/b;

    .line 189
    goto :goto_1

    .line 190
    .line 191
    :cond_b
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_progressBarAutoRotateInterval:I

    .line 192
    .line 193
    if-ne v3, v4, :cond_d

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 197
    move-result v5

    .line 198
    :cond_c
    :goto_1
    const/4 v4, 0x0

    .line 199
    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :cond_d
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_backgroundImage:I

    .line 203
    .line 204
    if-ne v3, v4, :cond_e

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 208
    move-result-object v3

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v3}, Lr4/b;->w(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 212
    goto :goto_1

    .line 213
    .line 214
    :cond_e
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_overlayImage:I

    .line 215
    .line 216
    if-ne v3, v4, :cond_f

    .line 217
    .line 218
    .line 219
    invoke-static {v1, v2, v3}, Lr4/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 220
    move-result-object v3

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v3}, Lr4/b;->B(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 224
    goto :goto_1

    .line 225
    .line 226
    :cond_f
    sget v4, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundAsCircle:I

    .line 227
    .line 228
    if-ne v3, v4, :cond_10

    .line 229
    .line 230
    .line 231
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 232
    move-result-object v4

    .line 233
    const/4 v1, 0x0

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 237
    move-result v3

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v3}, Lcom/facebook/drawee/generic/RoundingParams;->t(Z)Lcom/facebook/drawee/generic/RoundingParams;

    .line 241
    goto :goto_1

    .line 242
    .line 243
    :cond_10
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundedCornerRadius:I

    .line 244
    .line 245
    if-ne v3, v1, :cond_11

    .line 246
    .line 247
    move/from16 v4, v16

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 251
    move-result v16

    .line 252
    goto :goto_1

    .line 253
    .line 254
    :cond_11
    move/from16 v4, v16

    .line 255
    .line 256
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundTopLeft:I

    .line 257
    .line 258
    if-ne v3, v1, :cond_12

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v3, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 262
    move-result v8

    .line 263
    .line 264
    :goto_2
    move/from16 v16, v4

    .line 265
    goto :goto_1

    .line 266
    .line 267
    :cond_12
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundTopRight:I

    .line 268
    .line 269
    if-ne v3, v1, :cond_13

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 273
    move-result v10

    .line 274
    goto :goto_2

    .line 275
    .line 276
    :cond_13
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundBottomLeft:I

    .line 277
    .line 278
    if-ne v3, v1, :cond_14

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v3, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 282
    move-result v14

    .line 283
    goto :goto_2

    .line 284
    .line 285
    :cond_14
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundBottomRight:I

    .line 286
    .line 287
    if-ne v3, v1, :cond_15

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v3, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 291
    move-result v12

    .line 292
    goto :goto_2

    .line 293
    .line 294
    :cond_15
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundTopStart:I

    .line 295
    .line 296
    if-ne v3, v1, :cond_16

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 300
    move-result v9

    .line 301
    goto :goto_2

    .line 302
    .line 303
    :cond_16
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundTopEnd:I

    .line 304
    .line 305
    if-ne v3, v1, :cond_17

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 309
    move-result v11

    .line 310
    goto :goto_2

    .line 311
    .line 312
    :cond_17
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundBottomStart:I

    .line 313
    .line 314
    if-ne v3, v1, :cond_18

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v3, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 318
    move-result v15

    .line 319
    goto :goto_2

    .line 320
    .line 321
    :cond_18
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundBottomEnd:I

    .line 322
    .line 323
    if-ne v3, v1, :cond_19

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v3, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 327
    move-result v13

    .line 328
    goto :goto_2

    .line 329
    .line 330
    :cond_19
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundWithOverlayColor:I

    .line 331
    .line 332
    if-ne v3, v1, :cond_1a

    .line 333
    .line 334
    .line 335
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 336
    move-result-object v1

    .line 337
    .line 338
    move/from16 v16, v4

    .line 339
    const/4 v4, 0x0

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 343
    move-result v3

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/RoundingParams;->q(I)Lcom/facebook/drawee/generic/RoundingParams;

    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_1a
    move/from16 v16, v4

    .line 351
    .line 352
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundingBorderWidth:I

    .line 353
    .line 354
    if-ne v3, v1, :cond_1b

    .line 355
    .line 356
    .line 357
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 358
    move-result-object v1

    .line 359
    const/4 v4, 0x0

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 363
    move-result v3

    .line 364
    int-to-float v3, v3

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/RoundingParams;->n(F)Lcom/facebook/drawee/generic/RoundingParams;

    .line 368
    .line 369
    goto/16 :goto_1

    .line 370
    .line 371
    :cond_1b
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundingBorderColor:I

    .line 372
    .line 373
    if-ne v3, v1, :cond_1c

    .line 374
    .line 375
    .line 376
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 377
    move-result-object v1

    .line 378
    const/4 v4, 0x0

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 382
    move-result v3

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/RoundingParams;->m(I)Lcom/facebook/drawee/generic/RoundingParams;

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :cond_1c
    sget v1, Lcom/facebook/drawee/R$styleable;->GenericDraweeHierarchy_roundingBorderPadding:I

    .line 390
    .line 391
    if-ne v3, v1, :cond_c

    .line 392
    .line 393
    .line 394
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 395
    move-result-object v1

    .line 396
    const/4 v4, 0x0

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 400
    move-result v3

    .line 401
    int-to-float v3, v3

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/RoundingParams;->r(F)Lcom/facebook/drawee/generic/RoundingParams;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 405
    .line 406
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 407
    .line 408
    move-object/from16 v1, p1

    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    :cond_1d
    const/4 v4, 0x0

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 418
    move-result-object v1

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 422
    move-result-object v1

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 426
    move-result v1

    .line 427
    const/4 v2, 0x1

    .line 428
    .line 429
    if-ne v1, v2, :cond_22

    .line 430
    .line 431
    if-eqz v8, :cond_1e

    .line 432
    .line 433
    if-eqz v11, :cond_1e

    .line 434
    const/4 v1, 0x1

    .line 435
    goto :goto_4

    .line 436
    :cond_1e
    move v1, v4

    .line 437
    .line 438
    :goto_4
    if-eqz v10, :cond_1f

    .line 439
    .line 440
    if-eqz v9, :cond_1f

    .line 441
    const/4 v2, 0x1

    .line 442
    goto :goto_5

    .line 443
    :cond_1f
    move v2, v4

    .line 444
    .line 445
    :goto_5
    if-eqz v12, :cond_20

    .line 446
    .line 447
    if-eqz v15, :cond_20

    .line 448
    const/4 v3, 0x1

    .line 449
    goto :goto_6

    .line 450
    :cond_20
    move v3, v4

    .line 451
    .line 452
    :goto_6
    if-eqz v14, :cond_21

    .line 453
    .line 454
    if-eqz v13, :cond_21

    .line 455
    :goto_7
    const/4 v4, 0x1

    .line 456
    :cond_21
    move v6, v4

    .line 457
    move v4, v5

    .line 458
    move v5, v1

    .line 459
    .line 460
    move/from16 v1, v16

    .line 461
    goto :goto_c

    .line 462
    .line 463
    :cond_22
    if-eqz v8, :cond_23

    .line 464
    .line 465
    if-eqz v9, :cond_23

    .line 466
    const/4 v1, 0x1

    .line 467
    goto :goto_8

    .line 468
    :cond_23
    move v1, v4

    .line 469
    .line 470
    :goto_8
    if-eqz v10, :cond_24

    .line 471
    .line 472
    if-eqz v11, :cond_24

    .line 473
    const/4 v2, 0x1

    .line 474
    goto :goto_9

    .line 475
    :cond_24
    move v2, v4

    .line 476
    .line 477
    :goto_9
    if-eqz v12, :cond_25

    .line 478
    .line 479
    if-eqz v13, :cond_25

    .line 480
    const/4 v3, 0x1

    .line 481
    goto :goto_a

    .line 482
    :cond_25
    move v3, v4

    .line 483
    .line 484
    :goto_a
    if-eqz v14, :cond_21

    .line 485
    .line 486
    if-eqz v15, :cond_21

    .line 487
    goto :goto_7

    .line 488
    :catchall_1
    move-exception v0

    .line 489
    const/4 v8, 0x1

    .line 490
    const/4 v9, 0x1

    .line 491
    const/4 v10, 0x1

    .line 492
    const/4 v11, 0x1

    .line 493
    const/4 v12, 0x1

    .line 494
    const/4 v13, 0x1

    .line 495
    const/4 v14, 0x1

    .line 496
    const/4 v15, 0x1

    .line 497
    .line 498
    .line 499
    :goto_b
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 503
    move-result-object v1

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 507
    move-result-object v1

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 511
    move-result v1

    .line 512
    const/4 v2, 0x1

    .line 513
    throw v0

    .line 514
    :cond_26
    const/4 v2, 0x1

    .line 515
    const/4 v4, 0x0

    .line 516
    move v3, v2

    .line 517
    move v5, v3

    .line 518
    move v6, v5

    .line 519
    move v1, v4

    .line 520
    .line 521
    .line 522
    :goto_c
    invoke-virtual {v0}, Lr4/b;->n()Landroid/graphics/drawable/Drawable;

    .line 523
    move-result-object v7

    .line 524
    .line 525
    if-eqz v7, :cond_27

    .line 526
    .line 527
    if-lez v4, :cond_27

    .line 528
    .line 529
    new-instance v7, Lcom/facebook/drawee/drawable/b;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0}, Lr4/b;->n()Landroid/graphics/drawable/Drawable;

    .line 533
    move-result-object v8

    .line 534
    .line 535
    .line 536
    invoke-direct {v7, v8, v4}, Lcom/facebook/drawee/drawable/b;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v7}, Lr4/b;->F(Landroid/graphics/drawable/Drawable;)Lr4/b;

    .line 540
    .line 541
    :cond_27
    if-lez v1, :cond_2c

    .line 542
    .line 543
    .line 544
    invoke-static {v0}, Lr4/c;->b(Lr4/b;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 545
    move-result-object v4

    .line 546
    .line 547
    if-eqz v5, :cond_28

    .line 548
    int-to-float v5, v1

    .line 549
    goto :goto_d

    .line 550
    :cond_28
    const/4 v5, 0x0

    .line 551
    .line 552
    :goto_d
    if-eqz v2, :cond_29

    .line 553
    int-to-float v2, v1

    .line 554
    goto :goto_e

    .line 555
    :cond_29
    const/4 v2, 0x0

    .line 556
    .line 557
    :goto_e
    if-eqz v3, :cond_2a

    .line 558
    int-to-float v3, v1

    .line 559
    goto :goto_f

    .line 560
    :cond_2a
    const/4 v3, 0x0

    .line 561
    .line 562
    :goto_f
    if-eqz v6, :cond_2b

    .line 563
    int-to-float v1, v1

    .line 564
    goto :goto_10

    .line 565
    :cond_2b
    const/4 v1, 0x0

    .line 566
    .line 567
    .line 568
    :goto_10
    invoke-virtual {v4, v5, v2, v3, v1}, Lcom/facebook/drawee/generic/RoundingParams;->o(FFFF)Lcom/facebook/drawee/generic/RoundingParams;

    .line 569
    :cond_2c
    return-object v0
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
.end method
