.class public Lcom/bumptech/glide/load/engine/f;
.super Ljava/lang/Object;
.source "Engine.java"

# interfaces
.implements Lv1/d;
.implements Lx1/h$a;
.implements Lcom/bumptech/glide/load/engine/h$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/engine/f$b;,
        Lcom/bumptech/glide/load/engine/f$a;,
        Lcom/bumptech/glide/load/engine/f$c;,
        Lcom/bumptech/glide/load/engine/f$d;
    }
.end annotation


# static fields
.field public static final i:Z


# instance fields
.field public final a:Lv1/h;

.field public final b:Lv1/f;

.field public final c:Lx1/h;

.field public final d:Lcom/bumptech/glide/load/engine/f$b;

.field public final e:Lv1/l;

.field public final f:Lcom/bumptech/glide/load/engine/f$c;

.field public final g:Lcom/bumptech/glide/load/engine/f$a;

.field public final h:Lcom/bumptech/glide/load/engine/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "Engine"

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    sput-boolean v0, Lcom/bumptech/glide/load/engine/f;->i:Z

    .line 10
    return-void
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
.end method

.method public constructor <init>(Lx1/h;Lx1/a$a;Ly1/a;Ly1/a;Ly1/a;Ly1/a;Lv1/h;Lv1/f;Lcom/bumptech/glide/load/engine/a;Lcom/bumptech/glide/load/engine/f$b;Lcom/bumptech/glide/load/engine/f$a;Lv1/l;Z)V
    .locals 8
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/f;->c:Lx1/h;

    .line 4
    new-instance v0, Lcom/bumptech/glide/load/engine/f$c;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/load/engine/f$c;-><init>(Lx1/a$a;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/f;->f:Lcom/bumptech/glide/load/engine/f$c;

    if-nez p9, :cond_0

    .line 5
    new-instance p2, Lcom/bumptech/glide/load/engine/a;

    move/from16 v1, p13

    invoke-direct {p2, v1}, Lcom/bumptech/glide/load/engine/a;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 p2, p9

    .line 6
    :goto_0
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/f;->h:Lcom/bumptech/glide/load/engine/a;

    .line 7
    invoke-virtual {p2, p0}, Lcom/bumptech/glide/load/engine/a;->f(Lcom/bumptech/glide/load/engine/h$a;)V

    if-nez p8, :cond_1

    .line 8
    new-instance p2, Lv1/f;

    invoke-direct {p2}, Lv1/f;-><init>()V

    goto :goto_1

    :cond_1
    move-object/from16 p2, p8

    .line 9
    :goto_1
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/f;->b:Lv1/f;

    if-nez p7, :cond_2

    .line 10
    new-instance p7, Lv1/h;

    invoke-direct {p7}, Lv1/h;-><init>()V

    .line 11
    :cond_2
    iput-object p7, p0, Lcom/bumptech/glide/load/engine/f;->a:Lv1/h;

    if-nez p10, :cond_3

    .line 12
    new-instance v1, Lcom/bumptech/glide/load/engine/f$b;

    move-object v7, p0

    move-object v6, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v1 .. v7}, Lcom/bumptech/glide/load/engine/f$b;-><init>(Ly1/a;Ly1/a;Ly1/a;Ly1/a;Lv1/d;Lcom/bumptech/glide/load/engine/h$a;)V

    goto :goto_2

    :cond_3
    move-object/from16 v1, p10

    .line 13
    :goto_2
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/f;->d:Lcom/bumptech/glide/load/engine/f$b;

    if-nez p11, :cond_4

    .line 14
    new-instance p2, Lcom/bumptech/glide/load/engine/f$a;

    invoke-direct {p2, v0}, Lcom/bumptech/glide/load/engine/f$a;-><init>(Lcom/bumptech/glide/load/engine/DecodeJob$e;)V

    goto :goto_3

    :cond_4
    move-object/from16 p2, p11

    .line 15
    :goto_3
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/f;->g:Lcom/bumptech/glide/load/engine/f$a;

    if-nez p12, :cond_5

    .line 16
    new-instance p2, Lv1/l;

    invoke-direct {p2}, Lv1/l;-><init>()V

    goto :goto_4

    :cond_5
    move-object/from16 p2, p12

    .line 17
    :goto_4
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/f;->e:Lv1/l;

    .line 18
    invoke-interface {p1, p0}, Lx1/h;->e(Lx1/h$a;)V

    return-void
.end method

.method public constructor <init>(Lx1/h;Lx1/a$a;Ly1/a;Ly1/a;Ly1/a;Ly1/a;Z)V
    .locals 14

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v13, p7

    .line 1
    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/load/engine/f;-><init>(Lx1/h;Lx1/a$a;Ly1/a;Ly1/a;Ly1/a;Ly1/a;Lv1/h;Lv1/f;Lcom/bumptech/glide/load/engine/a;Lcom/bumptech/glide/load/engine/f$b;Lcom/bumptech/glide/load/engine/f$a;Lv1/l;Z)V

    return-void
.end method

.method public static j(Ljava/lang/String;JLt1/b;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string p0, " in "

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lp2/f;->a(J)D

    .line 17
    move-result-wide p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string p0, "ms, key: "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string p1, "Engine"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    return-void
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
.end method


# virtual methods
.method public declared-synchronized a(Lcom/bumptech/glide/load/engine/g;Lt1/b;Lcom/bumptech/glide/load/engine/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/g<",
            "*>;",
            "Lt1/b;",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p3}, Lcom/bumptech/glide/load/engine/h;->d()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->h:Lcom/bumptech/glide/load/engine/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2, p3}, Lcom/bumptech/glide/load/engine/a;->a(Lt1/b;Lcom/bumptech/glide/load/engine/h;)V

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    iget-object p3, p0, Lcom/bumptech/glide/load/engine/f;->a:Lv1/h;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3, p2, p1}, Lv1/h;->d(Lt1/b;Lcom/bumptech/glide/load/engine/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
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
.end method

.method public declared-synchronized b(Lcom/bumptech/glide/load/engine/g;Lt1/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/g<",
            "*>;",
            "Lt1/b;",
            ")V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->a:Lv1/h;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2, p1}, Lv1/h;->d(Lt1/b;Lcom/bumptech/glide/load/engine/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
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
.end method

.method public c(Lt1/b;Lcom/bumptech/glide/load/engine/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/b;",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->h:Lcom/bumptech/glide/load/engine/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/engine/a;->d(Lt1/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/bumptech/glide/load/engine/h;->d()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->c:Lx1/h;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Lx1/h;->d(Lt1/b;Lv1/j;)Lv1/j;

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/f;->e:Lv1/l;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2, v0}, Lv1/l;->a(Lv1/j;Z)V

    .line 24
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
.end method

.method public d(Lv1/j;)V
    .locals 2
    .param p1    # Lv1/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/j<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->e:Lv1/l;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, v1}, Lv1/l;->a(Lv1/j;Z)V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final e(Lt1/b;)Lcom/bumptech/glide/load/engine/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/b;",
            ")",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->c:Lx1/h;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lx1/h;->b(Lt1/b;)Lv1/j;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    .line 12
    :cond_0
    instance-of v0, v2, Lcom/bumptech/glide/load/engine/h;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast v2, Lcom/bumptech/glide/load/engine/h;

    .line 17
    return-object v2

    .line 18
    .line 19
    :cond_1
    new-instance v1, Lcom/bumptech/glide/load/engine/h;

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x1

    .line 22
    move-object v6, p0

    .line 23
    move-object v5, p1

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/bumptech/glide/load/engine/h;-><init>(Lv1/j;ZZLt1/b;Lcom/bumptech/glide/load/engine/h$a;)V

    .line 27
    return-object v1
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public f(Lcom/bumptech/glide/e;Ljava/lang/Object;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZLt1/e;ZZZZLl2/g;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/load/engine/f$d;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/e;",
            "Ljava/lang/Object;",
            "Lt1/b;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/Priority;",
            "Lv1/c;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lt1/h<",
            "*>;>;ZZ",
            "Lt1/e;",
            "ZZZZ",
            "Ll2/g;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/bumptech/glide/load/engine/f$d;"
        }
    .end annotation

    move-object/from16 v2, p0

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/load/engine/f;->i:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lp2/f;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 2
    :goto_0
    iget-object v3, v2, Lcom/bumptech/glide/load/engine/f;->b:Lv1/f;

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v8, p10

    move-object/from16 v11, p13

    .line 3
    invoke-virtual/range {v3 .. v11}, Lv1/f;->a(Ljava/lang/Object;Lt1/b;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lt1/e;)Lv1/e;

    move-result-object v3

    .line 4
    monitor-enter p0

    move/from16 v4, p14

    .line 5
    :try_start_0
    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/bumptech/glide/load/engine/f;->i(Lv1/e;ZJ)Lcom/bumptech/glide/load/engine/h;

    move-result-object v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move/from16 v17, p15

    move/from16 v18, p16

    move/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    move-wide/from16 v23, v0

    move-object/from16 v22, v3

    move/from16 v16, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 6
    invoke-virtual/range {v2 .. v24}, Lcom/bumptech/glide/load/engine/f;->l(Lcom/bumptech/glide/e;Ljava/lang/Object;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZLt1/e;ZZZZLl2/g;Ljava/util/concurrent/Executor;Lv1/e;J)Lcom/bumptech/glide/load/engine/f$d;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    sget-object v1, Lcom/bumptech/glide/load/DataSource;->MEMORY_CACHE:Lcom/bumptech/glide/load/DataSource;

    const/4 v2, 0x0

    move-object/from16 v3, p18

    invoke-interface {v3, v0, v1, v2}, Ll2/g;->c(Lv1/j;Lcom/bumptech/glide/load/DataSource;Z)V

    const/4 v0, 0x0

    return-object v0

    .line 9
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g(Lt1/b;)Lcom/bumptech/glide/load/engine/h;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/b;",
            ")",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/f;->h:Lcom/bumptech/glide/load/engine/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/engine/a;->e(Lt1/b;)Lcom/bumptech/glide/load/engine/h;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/h;->b()V

    .line 12
    :cond_0
    return-object p1
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
.end method

.method public final h(Lt1/b;)Lcom/bumptech/glide/load/engine/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/b;",
            ")",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/f;->e(Lt1/b;)Lcom/bumptech/glide/load/engine/h;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h;->b()V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/f;->h:Lcom/bumptech/glide/load/engine/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Lcom/bumptech/glide/load/engine/a;->a(Lt1/b;Lcom/bumptech/glide/load/engine/h;)V

    .line 15
    :cond_0
    return-object v0
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
.end method

.method public final i(Lv1/e;ZJ)Lcom/bumptech/glide/load/engine/h;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/e;",
            "ZJ)",
            "Lcom/bumptech/glide/load/engine/h<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/f;->g(Lt1/b;)Lcom/bumptech/glide/load/engine/h;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    if-eqz p2, :cond_2

    .line 11
    .line 12
    sget-boolean v0, Lcom/bumptech/glide/load/engine/f;->i:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string v0, "Loaded resource from active resources"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p3, p4, p1}, Lcom/bumptech/glide/load/engine/f;->j(Ljava/lang/String;JLt1/b;)V

    .line 20
    :cond_1
    return-object p2

    .line 21
    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/f;->h(Lt1/b;)Lcom/bumptech/glide/load/engine/h;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    if-eqz p2, :cond_4

    .line 27
    .line 28
    sget-boolean v0, Lcom/bumptech/glide/load/engine/f;->i:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    const-string v0, "Loaded resource from cache"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p3, p4, p1}, Lcom/bumptech/glide/load/engine/f;->j(Ljava/lang/String;JLt1/b;)V

    .line 36
    :cond_3
    return-object p2

    .line 37
    :cond_4
    return-object v0
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
.end method

.method public k(Lv1/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/j<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/bumptech/glide/load/engine/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/bumptech/glide/load/engine/h;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/h;->e()V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Cannot release anything but an EngineResource"

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    throw p1
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
.end method

.method public final l(Lcom/bumptech/glide/e;Ljava/lang/Object;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZLt1/e;ZZZZLl2/g;Ljava/util/concurrent/Executor;Lv1/e;J)Lcom/bumptech/glide/load/engine/f$d;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/e;",
            "Ljava/lang/Object;",
            "Lt1/b;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/Priority;",
            "Lv1/c;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lt1/h<",
            "*>;>;ZZ",
            "Lt1/e;",
            "ZZZZ",
            "Ll2/g;",
            "Ljava/util/concurrent/Executor;",
            "Lv1/e;",
            "J)",
            "Lcom/bumptech/glide/load/engine/f$d;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    move-object/from16 v4, p20

    move-wide/from16 v9, p21

    .line 1
    iget-object v3, v0, Lcom/bumptech/glide/load/engine/f;->a:Lv1/h;

    move/from16 v8, p17

    invoke-virtual {v3, v4, v8}, Lv1/h;->a(Lt1/b;Z)Lcom/bumptech/glide/load/engine/g;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 2
    invoke-virtual {v3, v1, v2}, Lcom/bumptech/glide/load/engine/g;->a(Ll2/g;Ljava/util/concurrent/Executor;)V

    .line 3
    sget-boolean v2, Lcom/bumptech/glide/load/engine/f;->i:Z

    if-eqz v2, :cond_0

    .line 4
    const-string v2, "Added to existing load"

    invoke-static {v2, v9, v10, v4}, Lcom/bumptech/glide/load/engine/f;->j(Ljava/lang/String;JLt1/b;)V

    .line 5
    :cond_0
    new-instance v2, Lcom/bumptech/glide/load/engine/f$d;

    invoke-direct {v2, v0, v1, v3}, Lcom/bumptech/glide/load/engine/f$d;-><init>(Lcom/bumptech/glide/load/engine/f;Ll2/g;Lcom/bumptech/glide/load/engine/g;)V

    return-object v2

    .line 6
    :cond_1
    iget-object v3, v0, Lcom/bumptech/glide/load/engine/f;->d:Lcom/bumptech/glide/load/engine/f$b;

    move/from16 v5, p14

    move/from16 v6, p15

    move/from16 v7, p16

    .line 7
    invoke-virtual/range {v3 .. v8}, Lcom/bumptech/glide/load/engine/f$b;->a(Lt1/b;ZZZZ)Lcom/bumptech/glide/load/engine/g;

    move-result-object v19

    .line 8
    iget-object v3, v0, Lcom/bumptech/glide/load/engine/f;->g:Lcom/bumptech/glide/load/engine/f$a;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move-object/from16 v18, p13

    move/from16 v17, p17

    move-object/from16 v6, p20

    .line 9
    invoke-virtual/range {v3 .. v19}, Lcom/bumptech/glide/load/engine/f$a;->a(Lcom/bumptech/glide/e;Ljava/lang/Object;Lv1/e;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZZLt1/e;Lcom/bumptech/glide/load/engine/DecodeJob$b;)Lcom/bumptech/glide/load/engine/DecodeJob;

    move-result-object v3

    move-object v4, v6

    move-object/from16 v5, v19

    .line 10
    iget-object v6, v0, Lcom/bumptech/glide/load/engine/f;->a:Lv1/h;

    invoke-virtual {v6, v4, v5}, Lv1/h;->c(Lt1/b;Lcom/bumptech/glide/load/engine/g;)V

    .line 11
    invoke-virtual {v5, v1, v2}, Lcom/bumptech/glide/load/engine/g;->a(Ll2/g;Ljava/util/concurrent/Executor;)V

    .line 12
    invoke-virtual {v5, v3}, Lcom/bumptech/glide/load/engine/g;->s(Lcom/bumptech/glide/load/engine/DecodeJob;)V

    .line 13
    sget-boolean v2, Lcom/bumptech/glide/load/engine/f;->i:Z

    if-eqz v2, :cond_2

    .line 14
    const-string v2, "Started new load"

    move-wide/from16 v9, p21

    invoke-static {v2, v9, v10, v4}, Lcom/bumptech/glide/load/engine/f;->j(Ljava/lang/String;JLt1/b;)V

    .line 15
    :cond_2
    new-instance v2, Lcom/bumptech/glide/load/engine/f$d;

    invoke-direct {v2, v0, v1, v5}, Lcom/bumptech/glide/load/engine/f$d;-><init>(Lcom/bumptech/glide/load/engine/f;Ll2/g;Lcom/bumptech/glide/load/engine/g;)V

    return-object v2
.end method
