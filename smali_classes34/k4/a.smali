.class public Lk4/a;
.super Ljava/lang/Object;
.source "DefaultDrawableFactory.java"

# interfaces
.implements Lw5/a;


# instance fields
.field public final a:Landroid/content/res/Resources;

.field public final b:Lw5/a;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lw5/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lk4/a;->a:Landroid/content/res/Resources;

    .line 6
    .line 7
    iput-object p2, p0, Lk4/a;->b:Lw5/a;

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
    .line 40
    .line 41
    .line 42
.end method

.method public static a(Lx5/f;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lx5/f;->t()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lx5/f;->t()I

    .line 11
    move-result p0

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    return v1

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static b(Lx5/f;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lx5/f;->F()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lx5/f;->F()I

    .line 10
    move-result p0

    .line 11
    const/4 v0, -0x1

    .line 12
    .line 13
    if-eq p0, v0, :cond_0

    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public createDrawable(Lx5/e;)Landroid/graphics/drawable/Drawable;
    .locals 3

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
    const-string v0, "DefaultDrawableFactory#createDrawable"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    .line 16
    :cond_0
    :goto_0
    instance-of v0, p1, Lx5/f;

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    check-cast p1, Lx5/f;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 23
    .line 24
    iget-object v1, p0, Lk4/a;->a:Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lx5/d;->K()Landroid/graphics/Bitmap;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lk4/a;->b(Lx5/f;)Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lk4/a;->a(Lx5/f;)Z

    .line 41
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ld6/b;->d()Z

    .line 47
    move-result p1

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ld6/b;->b()V

    .line 53
    :cond_1
    return-object v0

    .line 54
    .line 55
    :cond_2
    :try_start_1
    new-instance v1, Lcom/facebook/drawee/drawable/i;

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lx5/f;->F()I

    .line 59
    move-result v2

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Lx5/f;->t()I

    .line 63
    move-result p1

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v0, v2, p1}, Lcom/facebook/drawee/drawable/i;-><init>(Landroid/graphics/drawable/Drawable;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ld6/b;->d()Z

    .line 70
    move-result p1

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ld6/b;->b()V

    .line 76
    :cond_3
    return-object v1

    .line 77
    .line 78
    :cond_4
    :try_start_2
    iget-object v0, p0, Lk4/a;->b:Lw5/a;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, p1}, Lw5/a;->supportsImageType(Lx5/e;)Z

    .line 84
    move-result v0

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    iget-object v0, p0, Lk4/a;->b:Lw5/a;

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, p1}, Lw5/a;->createDrawable(Lx5/e;)Landroid/graphics/drawable/Drawable;

    .line 92
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ld6/b;->d()Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ld6/b;->b()V

    .line 102
    :cond_5
    return-object p1

    .line 103
    .line 104
    .line 105
    :cond_6
    invoke-static {}, Ld6/b;->d()Z

    .line 106
    move-result p1

    .line 107
    const/4 v0, 0x0

    .line 108
    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ld6/b;->b()V

    .line 113
    :cond_7
    return-object v0

    .line 114
    .line 115
    .line 116
    :goto_1
    invoke-static {}, Ld6/b;->d()Z

    .line 117
    move-result v0

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ld6/b;->b()V

    .line 123
    :cond_8
    throw p1
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
.end method

.method public supportsImageType(Lx5/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

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
.end method
