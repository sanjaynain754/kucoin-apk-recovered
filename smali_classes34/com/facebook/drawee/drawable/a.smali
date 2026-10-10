.class public Lcom/facebook/drawee/drawable/a;
.super Landroid/graphics/drawable/Drawable;
.source "ArrayDrawable.java"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Lcom/facebook/drawee/drawable/e0;
.implements Lcom/facebook/drawee/drawable/d0;


# instance fields
.field public b:Lcom/facebook/drawee/drawable/e0;

.field public final c:Lcom/facebook/drawee/drawable/d;

.field public final d:[Landroid/graphics/drawable/Drawable;

.field public final e:[Lcom/facebook/drawee/drawable/c;

.field public final f:Landroid/graphics/Rect;

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/drawee/drawable/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/drawee/drawable/d;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/facebook/drawee/drawable/a;->f:Landroid/graphics/Rect;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->g:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->h:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->i:Z

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 32
    array-length v1, p1

    .line 33
    .line 34
    if-ge v0, v1, :cond_0

    .line 35
    .line 36
    aget-object p1, p1, v0

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p0, p0}, Lcom/facebook/drawee/drawable/e;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lcom/facebook/drawee/drawable/e0;)V

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    array-length p1, p1

    .line 44
    .line 45
    new-array p1, p1, [Lcom/facebook/drawee/drawable/c;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/facebook/drawee/drawable/a;->e:[Lcom/facebook/drawee/drawable/c;

    .line 48
    return-void
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
.method public final a(I)Lcom/facebook/drawee/drawable/c;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/drawee/drawable/a$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/drawee/drawable/a$a;-><init>(Lcom/facebook/drawee/drawable/a;I)V

    .line 6
    return-object v0
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

.method public b(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 17
    array-length v2, v2

    .line 18
    .line 19
    if-ge p1, v2, :cond_1

    .line 20
    move v0, v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    aget-object p1, v0, p1

    .line 32
    return-object p1
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

.method public c(I)Lcom/facebook/drawee/drawable/c;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->e:[Lcom/facebook/drawee/drawable/c;

    .line 17
    array-length v2, v2

    .line 18
    .line 19
    if-ge p1, v2, :cond_1

    .line 20
    move v0, v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->e:[Lcom/facebook/drawee/drawable/c;

    .line 30
    .line 31
    aget-object v1, v0, p1

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/drawable/a;->a(I)Lcom/facebook/drawee/drawable/c;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    aput-object v1, v0, p1

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->e:[Lcom/facebook/drawee/drawable/c;

    .line 42
    .line 43
    aget-object p1, v0, p1

    .line 44
    return-object p1
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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 3
    array-length v0, v0

    .line 4
    return v0
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 4
    array-length v2, v1

    .line 5
    .line 6
    if-ge v0, v2, :cond_1

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public e(ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 17
    array-length v2, v2

    .line 18
    .line 19
    if-ge p1, v2, :cond_1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v0, v1

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    aget-object v0, v0, p1

    .line 33
    .line 34
    if-eq p2, v0, :cond_3

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    iget-boolean v2, p0, Lcom/facebook/drawee/drawable/a;->i:Z

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    :cond_2
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    aget-object v2, v2, p1

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v3, v3}, Lcom/facebook/drawee/drawable/e;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lcom/facebook/drawee/drawable/e0;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v3, v3}, Lcom/facebook/drawee/drawable/e;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lcom/facebook/drawee/drawable/e0;)V

    .line 55
    .line 56
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 57
    .line 58
    .line 59
    invoke-static {p2, v2}, Lcom/facebook/drawee/drawable/e;->e(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/d;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p0}, Lcom/facebook/drawee/drawable/e;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p2, p0, p0}, Lcom/facebook/drawee/drawable/e;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lcom/facebook/drawee/drawable/e0;)V

    .line 66
    .line 67
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/a;->h:Z

    .line 68
    .line 69
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    aput-object p2, v1, p1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 75
    :cond_3
    return-object v0
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

.method public getIntrinsicHeight()I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    .line 5
    :goto_0
    iget-object v3, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 6
    array-length v4, v3

    .line 7
    .line 8
    if-ge v1, v4, :cond_1

    .line 9
    .line 10
    aget-object v3, v3, v1

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    move-result v2

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    if-lez v2, :cond_2

    .line 26
    return v2

    .line 27
    :cond_2
    return v0
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
.end method

.method public getIntrinsicWidth()I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    .line 5
    :goto_0
    iget-object v3, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 6
    array-length v4, v3

    .line 7
    .line 8
    if-ge v1, v4, :cond_1

    .line 9
    .line 10
    aget-object v3, v3, v1

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    move-result v2

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    if-lez v2, :cond_2

    .line 26
    return v2

    .line 27
    :cond_2
    return v0
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
.end method

.method public getOpacity()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    const/4 v0, -0x2

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    const/4 v1, -0x1

    .line 10
    .line 11
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 12
    array-length v3, v2

    .line 13
    .line 14
    if-ge v0, v3, :cond_2

    .line 15
    .line 16
    aget-object v2, v2, v0

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 22
    move-result v2

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 26
    move-result v1

    .line 27
    .line 28
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1
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
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 6
    .line 7
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 8
    .line 9
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->f:Landroid/graphics/Rect;

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 14
    array-length v3, v2

    .line 15
    .line 16
    if-ge v0, v3, :cond_1

    .line 17
    .line 18
    aget-object v2, v2, v0

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 24
    .line 25
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 31
    move-result v2

    .line 32
    .line 33
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 41
    move-result v2

    .line 42
    .line 43
    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 44
    .line 45
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 46
    .line 47
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 51
    move-result v2

    .line 52
    .line 53
    iput v2, p1, Landroid/graphics/Rect;->right:I

    .line 54
    .line 55
    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 56
    .line 57
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 61
    move-result v2

    .line 62
    .line 63
    iput v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 64
    .line 65
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p1, 0x1

    .line 68
    return p1
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method public getRootBounds(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->b:Lcom/facebook/drawee/drawable/e0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/e0;->getRootBounds(Landroid/graphics/RectF;)V

    .line 8
    return-void

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getTransform(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->b:Lcom/facebook/drawee/drawable/e0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/e0;->getTransform(Landroid/graphics/Matrix;)V

    .line 8
    return-void

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

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
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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
.end method

.method public isStateful()Z
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->h:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->g:Z

    .line 8
    move v1, v0

    .line 9
    .line 10
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 11
    array-length v3, v2

    .line 12
    const/4 v4, 0x1

    .line 13
    .line 14
    if-ge v1, v3, :cond_1

    .line 15
    .line 16
    aget-object v2, v2, v1

    .line 17
    .line 18
    iget-boolean v3, p0, Lcom/facebook/drawee/drawable/a;->g:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v4, v0

    .line 29
    .line 30
    :goto_1
    or-int v2, v3, v4

    .line 31
    .line 32
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/a;->g:Z

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    iput-boolean v4, p0, Lcom/facebook/drawee/drawable/a;->h:Z

    .line 38
    .line 39
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->g:Z

    .line 40
    return v0
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
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 4
    array-length v2, v1

    .line 5
    .line 6
    if-ge v0, v2, :cond_1

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x1

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/a;->i:Z

    .line 20
    return-object p0
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
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 4
    array-length v2, v1

    .line 5
    .line 6
    if-ge v0, v2, :cond_1

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onLevelChange(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 5
    array-length v3, v2

    .line 6
    .line 7
    if-ge v0, v3, :cond_1

    .line 8
    .line 9
    aget-object v2, v2, v0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
    .line 23
.end method

.method public onStateChange([I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 5
    array-length v3, v2

    .line 6
    .line 7
    if-ge v0, v3, :cond_1

    .line 8
    .line 9
    aget-object v2, v2, v0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
    .line 23
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

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

.method public setAlpha(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->b(I)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 9
    array-length v2, v1

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-object v1, v1, v0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
    .line 23
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->c(Landroid/graphics/ColorFilter;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 9
    array-length v2, v1

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-object v1, v1, v0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
    .line 23
.end method

.method public setDither(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->d(Z)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 9
    array-length v2, v1

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-object v1, v1, v0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
    .line 23
.end method

.method public setFilterBitmap(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/a;->c:Lcom/facebook/drawee/drawable/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/d;->e(Z)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 9
    array-length v2, v1

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-object v1, v1, v0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
    .line 23
.end method

.method public setHotspot(FF)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 4
    array-length v2, v1

    .line 5
    .line 6
    if-ge v0, v2, :cond_1

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
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

.method public setTransformCallback(Lcom/facebook/drawee/drawable/e0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/drawee/drawable/a;->b:Lcom/facebook/drawee/drawable/e0;

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

.method public setVisible(ZZ)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/a;->d:[Landroid/graphics/drawable/Drawable;

    .line 8
    array-length v3, v2

    .line 9
    .line 10
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v0
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

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

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
    .line 40
    .line 41
    .line 42
.end method
