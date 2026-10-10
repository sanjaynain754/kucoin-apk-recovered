.class public Lr3/b;
.super Ljava/lang/Object;
.source "DiskCacheConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr3/b$b;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lr3/d;

.field public final h:Lcom/facebook/cache/common/CacheErrorLogger;

.field public final i:Lcom/facebook/cache/common/CacheEventListener;

.field public final j:Lt3/b;

.field public final k:Landroid/content/Context;

.field public final l:Z


# direct methods
.method public constructor <init>(Lr3/b$b;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lr3/b$b;->e(Lr3/b$b;)Landroid/content/Context;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lr3/b;->k:Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lr3/b$b;->b(Lr3/b$b;)Lw3/k;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 22
    .line 23
    :goto_1
    const-string v2, "Either a non-null context or a base directory path or supplier must be provided."

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lw3/h;->j(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lr3/b$b;->b(Lr3/b$b;)Lw3/k;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lr3/b$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p0}, Lr3/b$a;-><init>(Lr3/b;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lr3/b$b;->m(Lr3/b$b;Lw3/k;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-static {p1}, Lr3/b$b;->l(Lr3/b$b;)I

    .line 46
    move-result v0

    .line 47
    .line 48
    iput v0, p0, Lr3/b;->a:I

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lr3/b$b;->a(Lr3/b$b;)Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    iput-object v0, p0, Lr3/b;->b:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lr3/b$b;->b(Lr3/b$b;)Lw3/k;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, Lw3/k;

    .line 71
    .line 72
    iput-object v0, p0, Lr3/b;->c:Lw3/k;

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lr3/b$b;->i(Lr3/b$b;)J

    .line 76
    move-result-wide v0

    .line 77
    .line 78
    iput-wide v0, p0, Lr3/b;->d:J

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lr3/b$b;->j(Lr3/b$b;)J

    .line 82
    move-result-wide v0

    .line 83
    .line 84
    iput-wide v0, p0, Lr3/b;->e:J

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lr3/b$b;->k(Lr3/b$b;)J

    .line 88
    move-result-wide v0

    .line 89
    .line 90
    iput-wide v0, p0, Lr3/b;->f:J

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lr3/b$b;->g(Lr3/b$b;)Lr3/d;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    check-cast v0, Lr3/d;

    .line 101
    .line 102
    iput-object v0, p0, Lr3/b;->g:Lr3/d;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lr3/b$b;->c(Lr3/b$b;)Lcom/facebook/cache/common/CacheErrorLogger;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lcom/facebook/cache/common/b;->b()Lcom/facebook/cache/common/b;

    .line 112
    move-result-object v0

    .line 113
    goto :goto_2

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-static {p1}, Lr3/b$b;->c(Lr3/b$b;)Lcom/facebook/cache/common/CacheErrorLogger;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    :goto_2
    iput-object v0, p0, Lr3/b;->h:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lr3/b$b;->d(Lr3/b$b;)Lcom/facebook/cache/common/CacheEventListener;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    if-nez v0, :cond_4

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lq3/d;->i()Lq3/d;

    .line 129
    move-result-object v0

    .line 130
    goto :goto_3

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-static {p1}, Lr3/b$b;->d(Lr3/b$b;)Lcom/facebook/cache/common/CacheEventListener;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    :goto_3
    iput-object v0, p0, Lr3/b;->i:Lcom/facebook/cache/common/CacheEventListener;

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lr3/b$b;->f(Lr3/b$b;)Lt3/b;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lt3/c;->b()Lt3/c;

    .line 146
    move-result-object v0

    .line 147
    goto :goto_4

    .line 148
    .line 149
    .line 150
    :cond_5
    invoke-static {p1}, Lr3/b$b;->f(Lr3/b$b;)Lt3/b;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    :goto_4
    iput-object v0, p0, Lr3/b;->j:Lt3/b;

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, Lr3/b$b;->h(Lr3/b$b;)Z

    .line 157
    move-result p1

    .line 158
    .line 159
    iput-boolean p1, p0, Lr3/b;->l:Z

    .line 160
    return-void
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

.method public static bridge synthetic a(Lr3/b;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lr3/b;->k:Landroid/content/Context;

    .line 3
    return-object p0
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

.method public static m(Landroid/content/Context;)Lr3/b$b;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lr3/b$b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Lr3/b$b;-><init>(Landroid/content/Context;Lr3/c;)V

    .line 7
    return-object v0
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


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->b:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public c()Lw3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->c:Lw3/k;

    .line 3
    return-object v0
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
.end method

.method public d()Lcom/facebook/cache/common/CacheErrorLogger;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->h:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 3
    return-object v0
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
.end method

.method public e()Lcom/facebook/cache/common/CacheEventListener;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->i:Lcom/facebook/cache/common/CacheEventListener;

    .line 3
    return-object v0
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
.end method

.method public f()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lr3/b;->d:J

    .line 3
    return-wide v0
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
.end method

.method public g()Lt3/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->j:Lt3/b;

    .line 3
    return-object v0
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
.end method

.method public h()Lr3/d;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr3/b;->g:Lr3/d;

    .line 3
    return-object v0
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
.end method

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lr3/b;->l:Z

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
.end method

.method public j()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lr3/b;->e:J

    .line 3
    return-wide v0
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
.end method

.method public k()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lr3/b;->f:J

    .line 3
    return-wide v0
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
.end method

.method public l()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lr3/b;->a:I

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
.end method
