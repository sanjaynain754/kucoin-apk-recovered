.class public Lcom/facebook/imagepipeline/producers/m0$a;
.super Ljava/lang/Object;
.source "MultiplexProducer.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/m0$a$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroid/util/Pair<",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Ljava/io/Closeable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public d:F

.field public e:I

.field public f:Lcom/facebook/imagepipeline/producers/e;

.field public g:Lcom/facebook/imagepipeline/producers/m0$a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/m0<",
            "TK;TT;>.a.b;"
        }
    .end annotation
.end field

.field public final synthetic h:Lcom/facebook/imagepipeline/producers/m0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/m0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lw3/j;->a()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->a:Ljava/lang/Object;

    .line 14
    return-void
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

.method public static bridge synthetic a(Lcom/facebook/imagepipeline/producers/m0$a;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

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

.method public static bridge synthetic b(Lcom/facebook/imagepipeline/producers/m0$a;)Lcom/facebook/imagepipeline/producers/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

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

.method public static bridge synthetic c(Lcom/facebook/imagepipeline/producers/m0$a;Lcom/facebook/common/util/TriState;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/m0$a;->q(Lcom/facebook/common/util/TriState;)V

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

.method public static bridge synthetic d(Lcom/facebook/imagepipeline/producers/m0$a;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->r()Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static bridge synthetic e(Lcom/facebook/imagepipeline/producers/m0$a;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->s()Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static bridge synthetic f(Lcom/facebook/imagepipeline/producers/m0$a;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->t()Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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


# virtual methods
.method public final g(Landroid/util/Pair;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/m0$a$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/m0$a$a;-><init>(Lcom/facebook/imagepipeline/producers/m0$a;Landroid/util/Pair;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, v0}, Lcom/facebook/imagepipeline/producers/w0;->i(Lcom/facebook/imagepipeline/producers/x0;)V

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

.method public h(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 4
    move-result-object v0

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/facebook/imagepipeline/producers/m0;->i(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/m0$a;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eq v1, p0, :cond_0

    .line 16
    const/4 p1, 0x0

    .line 17
    monitor-exit p0

    .line 18
    return p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_4

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->s()Ljava/util/List;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->t()Ljava/util/List;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->r()Ljava/util/List;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 40
    .line 41
    iget v5, p0, Lcom/facebook/imagepipeline/producers/m0$a;->d:F

    .line 42
    .line 43
    iget v6, p0, Lcom/facebook/imagepipeline/producers/m0$a;->e:I

    .line 44
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/e;->e(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/e;->p(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Lcom/facebook/imagepipeline/producers/e;->d(Ljava/util/List;)V

    .line 54
    monitor-enter v0

    .line 55
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 56
    .line 57
    :try_start_2
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 58
    .line 59
    if-eq v4, v1, :cond_1

    .line 60
    const/4 v4, 0x0

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    if-eqz v4, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v4}, Lcom/facebook/imagepipeline/producers/m0;->g(Ljava/io/Closeable;)Ljava/io/Closeable;

    .line 69
    move-result-object v4

    .line 70
    goto :goto_0

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    const/4 v1, 0x0

    .line 77
    .line 78
    cmpl-float v1, v5, v1

    .line 79
    .line 80
    if-lez v1, :cond_3

    .line 81
    .line 82
    .line 83
    :try_start_3
    invoke-interface {p1, v5}, Lcom/facebook/imagepipeline/producers/m;->c(F)V

    .line 84
    goto :goto_1

    .line 85
    :catchall_2
    move-exception p1

    .line 86
    goto :goto_3

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    invoke-interface {p1, v4, v6}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v4}, Lcom/facebook/imagepipeline/producers/m0$a;->i(Ljava/io/Closeable;)V

    .line 93
    :cond_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0, p2}, Lcom/facebook/imagepipeline/producers/m0$a;->g(Landroid/util/Pair;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 97
    const/4 p1, 0x1

    .line 98
    return p1

    .line 99
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 100
    :try_start_5
    throw p1

    .line 101
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 102
    throw p1

    .line 103
    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 104
    throw p1
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

.method public final i(Ljava/io/Closeable;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    .line 9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 13
    throw v0

    .line 14
    :cond_0
    return-void
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

.method public final declared-synchronized j()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Landroid/util/Pair;

    .line 20
    .line 21
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/facebook/imagepipeline/producers/w0;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/w0;->m()Z

    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    monitor-exit p0

    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    monitor-exit p0

    .line 36
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
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

.method public final declared-synchronized k()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Landroid/util/Pair;

    .line 20
    .line 21
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/facebook/imagepipeline/producers/w0;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/w0;->n()Z

    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    monitor-exit p0

    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    monitor-exit p0

    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
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

.method public final declared-synchronized l()Lcom/facebook/imagepipeline/common/Priority;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lcom/facebook/imagepipeline/common/Priority;->LOW:Lcom/facebook/imagepipeline/common/Priority;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Landroid/util/Pair;

    .line 22
    .line 23
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lcom/facebook/imagepipeline/producers/w0;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/w0;->getPriority()Lcom/facebook/imagepipeline/common/Priority;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/facebook/imagepipeline/common/Priority;->getHigherPriority(Lcom/facebook/imagepipeline/common/Priority;Lcom/facebook/imagepipeline/common/Priority;)Lcom/facebook/imagepipeline/common/Priority;

    .line 33
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    monitor-exit p0

    .line 38
    return-object v0

    .line 39
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v0
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

.method public m(Lcom/facebook/imagepipeline/producers/m0$a$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m0<",
            "TK;TT;>.a.b;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/producers/m0$a;->i(Ljava/io/Closeable;)V

    .line 20
    .line 21
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 22
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    sget-object p1, Lcom/facebook/common/util/TriState;->UNSET:Lcom/facebook/common/util/TriState;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/m0$a;->q(Lcom/facebook/common/util/TriState;)V

    .line 28
    return-void

    .line 29
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
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

.method public n(Lcom/facebook/imagepipeline/producers/m0$a$b;Ljava/lang/Throwable;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m0<",
            "TK;TT;>.a.b;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->a:Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, p0}, Lcom/facebook/imagepipeline/producers/m0;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/m0$a;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/producers/m0$a;->i(Ljava/io/Closeable;)V

    .line 33
    const/4 v0, 0x0

    .line 34
    .line 35
    iput-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 36
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Landroid/util/Pair;

    .line 49
    monitor-enter v1

    .line 50
    .line 51
    :try_start_1
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lcom/facebook/imagepipeline/producers/w0;

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lcom/facebook/imagepipeline/producers/w0;

    .line 62
    .line 63
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Lcom/facebook/imagepipeline/producers/m0;->f(Lcom/facebook/imagepipeline/producers/m0;)Ljava/lang/String;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    .line 70
    invoke-interface {v2, v3, v4, p2, v0}, Lcom/facebook/imagepipeline/producers/y0;->k(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 71
    .line 72
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lcom/facebook/imagepipeline/producers/w0;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/producers/e;->getExtras()Ljava/util/Map;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-interface {v3, v2}, Lcom/facebook/fresco/middleware/HasExtraData;->putExtras(Ljava/util/Map;)V

    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    goto :goto_2

    .line 89
    .line 90
    :cond_1
    :goto_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lcom/facebook/imagepipeline/producers/m;

    .line 93
    .line 94
    .line 95
    invoke-interface {v2, p2}, Lcom/facebook/imagepipeline/producers/m;->onFailure(Ljava/lang/Throwable;)V

    .line 96
    monitor-exit v1

    .line 97
    goto :goto_0

    .line 98
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    throw p1

    .line 100
    :cond_2
    return-void

    .line 101
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    throw p1
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

.method public o(Lcom/facebook/imagepipeline/producers/m0$a$b;Ljava/io/Closeable;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m0<",
            "TK;TT;>.a.b;TT;I)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/m0$a;->i(Ljava/io/Closeable;)V

    .line 16
    const/4 p1, 0x0

    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    .line 30
    move-result v1

    .line 31
    .line 32
    .line 33
    invoke-static {p3}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p2}, Lcom/facebook/imagepipeline/producers/m0;->g(Ljava/io/Closeable;)Ljava/io/Closeable;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->c:Ljava/io/Closeable;

    .line 45
    .line 46
    iput p3, p0, Lcom/facebook/imagepipeline/producers/m0$a;->e:I

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_1
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 53
    .line 54
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/m0$a;->a:Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3, p0}, Lcom/facebook/imagepipeline/producers/m0;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/m0$a;)V

    .line 60
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    move-result v2

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    check-cast v2, Landroid/util/Pair;

    .line 73
    monitor-enter v2

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-static {p3}, Lcom/facebook/imagepipeline/producers/c;->d(I)Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lcom/facebook/imagepipeline/producers/w0;

    .line 84
    .line 85
    .line 86
    invoke-interface {v3}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    iget-object v4, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Lcom/facebook/imagepipeline/producers/w0;

    .line 92
    .line 93
    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 94
    .line 95
    .line 96
    invoke-static {v5}, Lcom/facebook/imagepipeline/producers/m0;->f(Lcom/facebook/imagepipeline/producers/m0;)Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-interface {v3, v4, v5, p1}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 101
    .line 102
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 103
    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    iget-object v4, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, Lcom/facebook/imagepipeline/producers/w0;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/facebook/imagepipeline/producers/e;->getExtras()Ljava/util/Map;

    .line 112
    move-result-object v3

    .line 113
    .line 114
    .line 115
    invoke-interface {v4, v3}, Lcom/facebook/fresco/middleware/HasExtraData;->putExtras(Ljava/util/Map;)V

    .line 116
    goto :goto_2

    .line 117
    :catchall_1
    move-exception p1

    .line 118
    goto :goto_3

    .line 119
    .line 120
    :cond_2
    :goto_2
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Lcom/facebook/imagepipeline/producers/w0;

    .line 123
    .line 124
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 125
    .line 126
    .line 127
    invoke-static {v4}, Lcom/facebook/imagepipeline/producers/m0;->c(Lcom/facebook/imagepipeline/producers/m0;)Ljava/lang/String;

    .line 128
    move-result-object v4

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    .line 135
    invoke-interface {v3, v4, v5}, Lcom/facebook/fresco/middleware/HasExtraData;->putExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    :cond_3
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Lcom/facebook/imagepipeline/producers/m;

    .line 140
    .line 141
    .line 142
    invoke-interface {v3, p2, p3}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 143
    monitor-exit v2

    .line 144
    goto :goto_1

    .line 145
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    throw p1

    .line 147
    :cond_4
    return-void

    .line 148
    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    throw p1
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
.end method

.method public p(Lcom/facebook/imagepipeline/producers/m0$a$b;F)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m0<",
            "TK;TT;>.a.b;F)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iput p2, p0, Lcom/facebook/imagepipeline/producers/m0$a;->d:F

    .line 12
    .line 13
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object p1

    .line 18
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Landroid/util/Pair;

    .line 31
    monitor-enter v0

    .line 32
    .line 33
    :try_start_1
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lcom/facebook/imagepipeline/producers/m;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, p2}, Lcom/facebook/imagepipeline/producers/m;->c(F)V

    .line 39
    monitor-exit v0

    .line 40
    goto :goto_0

    .line 41
    :catchall_1
    move-exception p1

    .line 42
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    throw p1

    .line 44
    :cond_1
    return-void

    .line 45
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    throw p1
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
.end method

.method public final q(Lcom/facebook/common/util/TriState;)V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    move v1, v2

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->a:Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0, p0}, Lcom/facebook/imagepipeline/producers/m0;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/m0$a;)V

    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    check-cast v0, Landroid/util/Pair;

    .line 62
    .line 63
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lcom/facebook/imagepipeline/producers/w0;

    .line 66
    .line 67
    new-instance v1, Lcom/facebook/imagepipeline/producers/e;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->getId()Ljava/lang/String;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->a()Ljava/lang/Object;

    .line 83
    move-result-object v5

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->o()Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->k()Z

    .line 91
    move-result v7

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->j()Z

    .line 95
    move-result v8

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->l()Lcom/facebook/imagepipeline/common/Priority;

    .line 99
    move-result-object v9

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->b()Ls5/r;

    .line 103
    move-result-object v10

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/e;-><init>(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/y0;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;ZZLcom/facebook/imagepipeline/common/Priority;Ls5/r;)V

    .line 107
    .line 108
    iput-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Lcom/facebook/fresco/middleware/HasExtraData;->getExtras()Ljava/util/Map;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v0}, Lcom/facebook/imagepipeline/producers/e;->putExtras(Ljava/util/Map;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/facebook/common/util/TriState;->isSet()Z

    .line 119
    move-result v0

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 124
    .line 125
    .line 126
    const-string/jumbo v1, "started_as_prefetch"

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/facebook/common/util/TriState;->asBoolean()Z

    .line 130
    move-result p1

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/e;->putExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 138
    .line 139
    :cond_3
    new-instance p1, Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 140
    const/4 v0, 0x0

    .line 141
    .line 142
    .line 143
    invoke-direct {p1, p0, v0}, Lcom/facebook/imagepipeline/producers/m0$a$b;-><init>(Lcom/facebook/imagepipeline/producers/m0$a;Lcom/facebook/imagepipeline/producers/n0;)V

    .line 144
    .line 145
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->g:Lcom/facebook/imagepipeline/producers/m0$a$b;

    .line 146
    .line 147
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 148
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m0$a;->h:Lcom/facebook/imagepipeline/producers/m0;

    .line 151
    .line 152
    .line 153
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/m0;->d(Lcom/facebook/imagepipeline/producers/m0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    .line 157
    invoke-interface {v1, p1, v0}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 158
    return-void

    .line 159
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    throw p1
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

.method public final declared-synchronized r()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/imagepipeline/producers/x0;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->j()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->s(Z)Ljava/util/List;

    .line 16
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
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

.method public final declared-synchronized s()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/imagepipeline/producers/x0;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->k()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->u(Z)Ljava/util/List;

    .line 16
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
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

.method public final declared-synchronized t()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/imagepipeline/producers/x0;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m0$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/m0$a;->l()Lcom/facebook/imagepipeline/common/Priority;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->v(Lcom/facebook/imagepipeline/common/Priority;)Ljava/util/List;

    .line 16
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
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
