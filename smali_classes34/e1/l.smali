.class public Le1/l;
.super Ljava/lang/Object;
.source "MergePathsContent.java"

# interfaces
.implements Le1/m;
.implements Le1/j;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Path;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le1/m;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lcom/airbnb/lottie/model/content/MergePaths;


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/model/content/MergePaths;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Path;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Le1/l;->a:Landroid/graphics/Path;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Path;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Le1/l;->b:Landroid/graphics/Path;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Le1/l;->e:Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/content/MergePaths;->c()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Le1/l;->d:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p1, p0, Le1/l;->f:Lcom/airbnb/lottie/model/content/MergePaths;

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
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Le1/l;->e:Ljava/util/List;

    .line 4
    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v2, p0, Le1/l;->e:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Le1/m;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
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

.method public c(Ljava/util/ListIterator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "Le1/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eq v0, p0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Le1/c;

    .line 26
    .line 27
    instance-of v1, v0, Le1/m;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Le1/l;->e:Ljava/util/List;

    .line 32
    .line 33
    check-cast v0, Le1/m;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return-void
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

.method public final e(Landroid/graphics/Path$Op;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Le1/l;->b:Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    iget-object v0, p0, Le1/l;->a:Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    iget-object v0, p0, Le1/l;->e:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    sub-int/2addr v0, v1

    .line 19
    .line 20
    :goto_0
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, Le1/l;->e:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Le1/m;

    .line 29
    .line 30
    instance-of v3, v2, Le1/d;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    check-cast v2, Le1/d;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Le1/d;->k()Ljava/util/List;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    move-result v4

    .line 43
    sub-int/2addr v4, v1

    .line 44
    .line 45
    :goto_1
    if-ltz v4, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    check-cast v5, Le1/m;

    .line 52
    .line 53
    .line 54
    invoke-interface {v5}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Le1/d;->l()Landroid/graphics/Matrix;

    .line 59
    move-result-object v6

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v6}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 63
    .line 64
    iget-object v6, p0, Le1/l;->b:Landroid/graphics/Path;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v5}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 68
    .line 69
    add-int/lit8 v4, v4, -0x1

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_0
    iget-object v3, p0, Le1/l;->b:Landroid/graphics/Path;

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 80
    .line 81
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, Le1/l;->e:Ljava/util/List;

    .line 85
    const/4 v1, 0x0

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    check-cast v0, Le1/m;

    .line 92
    .line 93
    instance-of v2, v0, Le1/d;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    check-cast v0, Le1/d;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Le1/d;->k()Ljava/util/List;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 105
    move-result v3

    .line 106
    .line 107
    if-ge v1, v3, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    check-cast v3, Le1/m;

    .line 114
    .line 115
    .line 116
    invoke-interface {v3}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 117
    move-result-object v3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Le1/d;->l()Landroid/graphics/Matrix;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 125
    .line 126
    iget-object v4, p0, Le1/l;->a:Landroid/graphics/Path;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 130
    .line 131
    add-int/lit8 v1, v1, 0x1

    .line 132
    goto :goto_2

    .line 133
    .line 134
    :cond_3
    iget-object v1, p0, Le1/l;->a:Landroid/graphics/Path;

    .line 135
    .line 136
    .line 137
    invoke-interface {v0}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 142
    .line 143
    :cond_4
    iget-object v0, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 144
    .line 145
    iget-object v1, p0, Le1/l;->a:Landroid/graphics/Path;

    .line 146
    .line 147
    iget-object v2, p0, Le1/l;->b:Landroid/graphics/Path;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1, v2, p1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 151
    return-void
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

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le1/c;",
            ">;",
            "Ljava/util/List<",
            "Le1/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Le1/l;->e:Ljava/util/List;

    .line 4
    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Le1/l;->e:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Le1/m;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, p1, p2}, Le1/c;->f(Ljava/util/List;Ljava/util/List;)V

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
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

.method public getPath()Landroid/graphics/Path;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    iget-object v0, p0, Le1/l;->f:Lcom/airbnb/lottie/model/content/MergePaths;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/content/MergePaths;->d()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    sget-object v0, Le1/l$a;->a:[I

    .line 19
    .line 20
    iget-object v1, p0, Le1/l;->f:Lcom/airbnb/lottie/model/content/MergePaths;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/airbnb/lottie/model/content/MergePaths;->b()Lcom/airbnb/lottie/model/content/MergePaths$MergePathsMode;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    move-result v1

    .line 29
    .line 30
    aget v0, v0, v1

    .line 31
    const/4 v1, 0x1

    .line 32
    .line 33
    if-eq v0, v1, :cond_5

    .line 34
    const/4 v1, 0x2

    .line 35
    .line 36
    if-eq v0, v1, :cond_4

    .line 37
    const/4 v1, 0x3

    .line 38
    .line 39
    if-eq v0, v1, :cond_3

    .line 40
    const/4 v1, 0x4

    .line 41
    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    const/4 v1, 0x5

    .line 44
    .line 45
    if-eq v0, v1, :cond_1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    sget-object v0, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Le1/l;->e(Landroid/graphics/Path$Op;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    sget-object v0, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Le1/l;->e(Landroid/graphics/Path$Op;)V

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_3
    sget-object v0, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Le1/l;->e(Landroid/graphics/Path$Op;)V

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :cond_4
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Le1/l;->e(Landroid/graphics/Path$Op;)V

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, Le1/l;->a()V

    .line 74
    .line 75
    :goto_0
    iget-object v0, p0, Le1/l;->c:Landroid/graphics/Path;

    .line 76
    return-object v0
    .line 77
.end method
