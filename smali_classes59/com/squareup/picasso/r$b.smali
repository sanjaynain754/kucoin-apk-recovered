.class public final Lcom/squareup/picasso/r$b;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/picasso/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:Z

.field public i:Z

.field public j:F

.field public k:F

.field public l:F

.field public m:Z

.field public n:Z

.field public o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/squareup/picasso/x;",
            ">;"
        }
    .end annotation
.end field

.field public p:Landroid/graphics/Bitmap$Config;

.field public q:Lcom/squareup/picasso/Picasso$Priority;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/squareup/picasso/r$b;->e(Landroid/net/Uri;)Lcom/squareup/picasso/r$b;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/squareup/picasso/r$b;->a:Landroid/net/Uri;

    .line 5
    iput p2, p0, Lcom/squareup/picasso/r$b;->b:I

    .line 6
    iput-object p3, p0, Lcom/squareup/picasso/r$b;->p:Landroid/graphics/Bitmap$Config;

    return-void
.end method


# virtual methods
.method public a()Lcom/squareup/picasso/r;
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/squareup/picasso/r$b;->h:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-boolean v2, v0, Lcom/squareup/picasso/r$b;->f:Z

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v2, "Center crop and center inside can not be used together."

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    throw v1

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget-boolean v2, v0, Lcom/squareup/picasso/r$b;->f:Z

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    iget v2, v0, Lcom/squareup/picasso/r$b;->d:I

    .line 26
    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    iget v2, v0, Lcom/squareup/picasso/r$b;->e:I

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v2, "Center crop requires calling resize with positive width and height."

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    throw v1

    .line 41
    .line 42
    :cond_3
    :goto_1
    if-eqz v1, :cond_5

    .line 43
    .line 44
    iget v1, v0, Lcom/squareup/picasso/r$b;->d:I

    .line 45
    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    iget v1, v0, Lcom/squareup/picasso/r$b;->e:I

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    goto :goto_2

    .line 52
    .line 53
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "Center inside requires calling resize with positive width and height."

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw v1

    .line 60
    .line 61
    :cond_5
    :goto_2
    iget-object v1, v0, Lcom/squareup/picasso/r$b;->q:Lcom/squareup/picasso/Picasso$Priority;

    .line 62
    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    sget-object v1, Lcom/squareup/picasso/Picasso$Priority;->NORMAL:Lcom/squareup/picasso/Picasso$Priority;

    .line 66
    .line 67
    iput-object v1, v0, Lcom/squareup/picasso/r$b;->q:Lcom/squareup/picasso/Picasso$Priority;

    .line 68
    .line 69
    :cond_6
    new-instance v2, Lcom/squareup/picasso/r;

    .line 70
    .line 71
    iget-object v3, v0, Lcom/squareup/picasso/r$b;->a:Landroid/net/Uri;

    .line 72
    .line 73
    iget v4, v0, Lcom/squareup/picasso/r$b;->b:I

    .line 74
    .line 75
    iget-object v5, v0, Lcom/squareup/picasso/r$b;->c:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v6, v0, Lcom/squareup/picasso/r$b;->o:Ljava/util/List;

    .line 78
    .line 79
    iget v7, v0, Lcom/squareup/picasso/r$b;->d:I

    .line 80
    .line 81
    iget v8, v0, Lcom/squareup/picasso/r$b;->e:I

    .line 82
    .line 83
    iget-boolean v9, v0, Lcom/squareup/picasso/r$b;->f:Z

    .line 84
    .line 85
    iget-boolean v10, v0, Lcom/squareup/picasso/r$b;->h:Z

    .line 86
    .line 87
    iget v11, v0, Lcom/squareup/picasso/r$b;->g:I

    .line 88
    .line 89
    iget-boolean v12, v0, Lcom/squareup/picasso/r$b;->i:Z

    .line 90
    .line 91
    iget v13, v0, Lcom/squareup/picasso/r$b;->j:F

    .line 92
    .line 93
    iget v14, v0, Lcom/squareup/picasso/r$b;->k:F

    .line 94
    .line 95
    iget v15, v0, Lcom/squareup/picasso/r$b;->l:F

    .line 96
    .line 97
    iget-boolean v1, v0, Lcom/squareup/picasso/r$b;->m:Z

    .line 98
    .line 99
    move/from16 v16, v1

    .line 100
    .line 101
    iget-boolean v1, v0, Lcom/squareup/picasso/r$b;->n:Z

    .line 102
    .line 103
    move/from16 v17, v1

    .line 104
    .line 105
    iget-object v1, v0, Lcom/squareup/picasso/r$b;->p:Landroid/graphics/Bitmap$Config;

    .line 106
    .line 107
    move-object/from16 v18, v1

    .line 108
    .line 109
    iget-object v1, v0, Lcom/squareup/picasso/r$b;->q:Lcom/squareup/picasso/Picasso$Priority;

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    move-object/from16 v19, v1

    .line 114
    .line 115
    .line 116
    invoke-direct/range {v2 .. v20}, Lcom/squareup/picasso/r;-><init>(Landroid/net/Uri;ILjava/lang/String;Ljava/util/List;IIZZIZFFFZZLandroid/graphics/Bitmap$Config;Lcom/squareup/picasso/Picasso$Priority;Lcom/squareup/picasso/r$a;)V

    .line 117
    return-object v2
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
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/r$b;->a:Landroid/net/Uri;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/squareup/picasso/r$b;->b:I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/r$b;->d:I

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/squareup/picasso/r$b;->e:I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public d(II)Lcom/squareup/picasso/r$b;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param

    .line 1
    .line 2
    if-ltz p1, :cond_3

    .line 3
    .line 4
    if-ltz p2, :cond_2

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "At least one dimension has to be positive number."

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    throw p1

    .line 18
    .line 19
    :cond_1
    :goto_0
    iput p1, p0, Lcom/squareup/picasso/r$b;->d:I

    .line 20
    .line 21
    iput p2, p0, Lcom/squareup/picasso/r$b;->e:I

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p2, "Height must be positive number or 0."

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1

    .line 31
    .line 32
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p2, "Width must be positive number or 0."

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1
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
.end method

.method public e(Landroid/net/Uri;)Lcom/squareup/picasso/r$b;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/squareup/picasso/r$b;->a:Landroid/net/Uri;

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput p1, p0, Lcom/squareup/picasso/r$b;->b:I

    .line 8
    return-object p0

    .line 9
    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "Image URI may not be null."

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
