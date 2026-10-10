.class public Lcom/facebook/drawee/generic/a;
.super Ljava/lang/Object;
.source "WrappingUtils.java"


# static fields
.field public static final a:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

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

.method public static a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    .line 2
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 7
    .line 8
    new-instance v0, Lcom/facebook/drawee/drawable/k;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->i()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p2, v1, p0, v2}, Lcom/facebook/drawee/drawable/k;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Landroid/graphics/Paint;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 27
    return-object v0

    .line 28
    .line 29
    :cond_0
    instance-of p2, p0, Landroid/graphics/drawable/NinePatchDrawable;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    check-cast p0, Landroid/graphics/drawable/NinePatchDrawable;

    .line 34
    .line 35
    new-instance p2, Lcom/facebook/drawee/drawable/n;

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, p0}, Lcom/facebook/drawee/drawable/n;-><init>(Landroid/graphics/drawable/NinePatchDrawable;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 42
    return-object p2

    .line 43
    .line 44
    :cond_1
    instance-of p2, p0, Landroid/graphics/drawable/ColorDrawable;

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lcom/facebook/drawee/drawable/l;->g(Landroid/graphics/drawable/ColorDrawable;)Lcom/facebook/drawee/drawable/l;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 56
    return-object p0

    .line 57
    .line 58
    :cond_2
    const-string p1, "Don\'t know how to round that drawable: %s"

    .line 59
    .line 60
    .line 61
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    const-string v0, "WrappingUtils"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p1, p2}, Lx3/a;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return-object p0
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

.method public static b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->j()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->d()[F

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->h([F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->b()I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->c()F

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0, v1}, Lcom/facebook/drawee/drawable/j;->setBorder(IF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->g()F

    .line 29
    move-result v0

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->b(F)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->l()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->f(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->h()Z

    .line 43
    move-result v0

    .line 44
    .line 45
    .line 46
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->e(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->i()Z

    .line 50
    move-result p1

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/j;->d(Z)V

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
.end method

.method public static c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;
    .locals 2

    .line 1
    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eq v0, p0, :cond_1

    .line 7
    .line 8
    instance-of v1, v0, Lcom/facebook/drawee/drawable/c;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move-object p0, v0

    .line 13
    .line 14
    check-cast p0, Lcom/facebook/drawee/drawable/c;

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static d(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "WrappingUtils#maybeApplyLeafRounding"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    if-eqz p0, :cond_5

    .line 14
    .line 15
    if-eqz p1, :cond_5

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->k()Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget-object v1, Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;->BITMAP_ONLY:Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 22
    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    instance-of v0, p0, Lcom/facebook/drawee/drawable/g;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    move-object v0, p0

    .line 30
    .line 31
    check-cast v0, Lcom/facebook/drawee/drawable/g;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/facebook/drawee/generic/a;->c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    sget-object v1, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-static {v1, p1, p2}, Lcom/facebook/drawee/generic/a;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ld6/b;->d()Z

    .line 52
    move-result p1

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-static {}, Ld6/b;->b()V

    .line 58
    :cond_2
    return-object p0

    .line 59
    .line 60
    .line 61
    :cond_3
    :try_start_1
    invoke-static {p0, p1, p2}, Lcom/facebook/drawee/generic/a;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 62
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ld6/b;->d()Z

    .line 66
    move-result p1

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ld6/b;->b()V

    .line 72
    :cond_4
    return-object p0

    .line 73
    .line 74
    .line 75
    :cond_5
    :goto_0
    invoke-static {}, Ld6/b;->d()Z

    .line 76
    move-result p1

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ld6/b;->b()V

    .line 82
    :cond_6
    return-object p0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    .line 85
    .line 86
    invoke-static {}, Ld6/b;->d()Z

    .line 87
    move-result p1

    .line 88
    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ld6/b;->b()V

    .line 93
    :cond_7
    throw p0
.end method

.method public static e(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "WrappingUtils#maybeWrapWithRoundedOverlayColor"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    if-eqz p0, :cond_3

    .line 14
    .line 15
    if-eqz p1, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->k()Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget-object v1, Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;->OVERLAY_COLOR:Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 22
    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    new-instance v0, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->f()I

    .line 36
    move-result p0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;->j(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ld6/b;->d()Z

    .line 43
    move-result p0

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ld6/b;->b()V

    .line 49
    :cond_2
    return-object v0

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_0
    invoke-static {}, Ld6/b;->d()Z

    .line 53
    move-result p1

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-static {}, Ld6/b;->b()V

    .line 59
    :cond_4
    return-object p0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ld6/b;->d()Z

    .line 64
    move-result p1

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ld6/b;->b()V

    .line 70
    :cond_5
    throw p0
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

.method public static f(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lcom/facebook/drawee/generic/a;->g(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;Landroid/graphics/PointF;)Landroid/graphics/drawable/Drawable;

    .line 5
    move-result-object p0

    .line 6
    return-object p0
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

.method public static g(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;Landroid/graphics/PointF;)Landroid/graphics/drawable/Drawable;
    .locals 1

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
    const-string v0, "WrappingUtils#maybeWrapWithScaleType"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    if-eqz p0, :cond_4

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_1
    new-instance v0, Lcom/facebook/drawee/drawable/o;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Lcom/facebook/drawee/drawable/o;-><init>(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;)V

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Lcom/facebook/drawee/drawable/o;->m(Landroid/graphics/PointF;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-static {}, Ld6/b;->d()Z

    .line 30
    move-result p0

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ld6/b;->b()V

    .line 36
    :cond_3
    return-object v0

    .line 37
    .line 38
    .line 39
    :cond_4
    :goto_0
    invoke-static {}, Ld6/b;->d()Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ld6/b;->b()V

    .line 46
    :cond_5
    return-object p0
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

.method public static h(Lcom/facebook/drawee/drawable/j;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->a(Z)V

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/j;->c(F)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0, v1}, Lcom/facebook/drawee/drawable/j;->setBorder(IF)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/j;->b(F)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->f(Z)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->e(Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/drawee/drawable/k;->n()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/j;->d(Z)V

    .line 28
    return-void
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
.end method

.method public static i(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/drawee/generic/a;->c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->k()Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    sget-object v2, Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;->BITMAP_ONLY:Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    instance-of v1, v0, Lcom/facebook/drawee/drawable/j;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast v0, Lcom/facebook/drawee/drawable/j;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object v1, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1, p2}, Lcom/facebook/drawee/generic/a;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 43
    return-void

    .line 44
    .line 45
    :cond_1
    instance-of p0, v0, Lcom/facebook/drawee/drawable/j;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast v0, Lcom/facebook/drawee/drawable/j;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/facebook/drawee/generic/a;->h(Lcom/facebook/drawee/drawable/j;)V

    .line 53
    :cond_2
    return-void
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

.method public static j(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/generic/RoundingParams;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->k()Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    sget-object v2, Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;->OVERLAY_COLOR:Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 13
    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    instance-of v1, v0, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->b(Lcom/facebook/drawee/drawable/j;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/RoundingParams;->f()I

    .line 27
    move-result p0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;->j(I)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_0
    sget-object v0, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->e(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/RoundingParams;)Landroid/graphics/drawable/Drawable;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 45
    return-void

    .line 46
    .line 47
    :cond_1
    instance-of p1, v0, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    check-cast v0, Lcom/facebook/drawee/drawable/RoundedCornersDrawable;

    .line 52
    .line 53
    sget-object p1, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/g;->setCurrent(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 61
    const/4 p0, 0x0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 65
    :cond_2
    return-void
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

.method public static k(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/drawable/q;)Lcom/facebook/drawee/drawable/o;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/drawee/generic/a;->a:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/a;->f(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;)Landroid/graphics/drawable/Drawable;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    const-string p0, "Parent has no child drawable!"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p0}, Lw3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lcom/facebook/drawee/drawable/o;

    .line 21
    return-object p1
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
