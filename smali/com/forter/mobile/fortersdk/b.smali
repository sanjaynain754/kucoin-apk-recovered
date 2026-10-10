.class public final Lcom/forter/mobile/fortersdk/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/forter/mobile/fortersdk/b$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/forter/mobile/fortersdk/b;


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public volatile b:Lcom/forter/mobile/fortersdk/b$a;

.field public final c:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/forter/mobile/fortersdk/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/forter/mobile/fortersdk/b;->d:Lcom/forter/mobile/fortersdk/b;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->y()Ljava/util/concurrent/ExecutorService;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    sget-object v0, Lcom/forter/mobile/fortersdk/b$a;->a:Lcom/forter/mobile/fortersdk/b$a;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/b;->b:Lcom/forter/mobile/fortersdk/b$a;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/b;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 21
    return-void
    .line 22
.end method

.method public static b()Lcom/forter/mobile/fortersdk/b;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/forter/mobile/fortersdk/b;->d:Lcom/forter/mobile/fortersdk/b;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic d(Lcom/forter/mobile/fortersdk/b;Lcom/forter/mobile/fortersdk/b$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/forter/mobile/fortersdk/b;->c(Lcom/forter/mobile/fortersdk/b$a;)V

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
.end method

.method public static synthetic h(Lcom/forter/mobile/fortersdk/b;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->j()Lcom/forter/mobile/fortersdk/b$a;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    sget-object v0, Lcom/forter/mobile/fortersdk/b$a;->b:Lcom/forter/mobile/fortersdk/b$a;

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
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

.method public static synthetic m()Lcom/forter/mobile/fortersdk/c;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    new-instance v1, Lcom/forter/mobile/fortersdk/b$k;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2}, Lcom/forter/mobile/fortersdk/b$k;-><init>(Lcom/forter/mobile/fortersdk/b;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 24
    :cond_1
    :goto_0
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

.method public final c(Lcom/forter/mobile/fortersdk/b$a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/b;->b:Lcom/forter/mobile/fortersdk/b$a;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/forter/mobile/fortersdk/b;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 13
    return-void
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

.method public final e(Lcom/forter/mobile/fortersdk/w;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/forter/mobile/fortersdk/b$l;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    goto :goto_1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/l0;->a()Lcom/forter/mobile/fortersdk/l0;

    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Lcom/forter/mobile/fortersdk/l0;->b(Z)V

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {}, Lcom/forter/mobile/fortersdk/l0;->a()Lcom/forter/mobile/fortersdk/l0;

    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    return-void

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    new-instance v1, Lcom/forter/mobile/fortersdk/b$b;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/forter/mobile/fortersdk/b$b;-><init>(Lcom/forter/mobile/fortersdk/b;Lcom/forter/mobile/fortersdk/w;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 47
    return-void
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

.method public final f(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    new-instance v1, Lcom/forter/mobile/fortersdk/b$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/b$e;-><init>(Lcom/forter/mobile/fortersdk/b;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    return-void
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

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    new-instance v1, Lcom/forter/mobile/fortersdk/b$f;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p1, p2}, Lcom/forter/mobile/fortersdk/b$f;-><init>(Lcom/forter/mobile/fortersdk/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    return-void
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

.method public final i(Lcom/forter/mobile/fortersdk/v3;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    new-instance v1, Lcom/forter/mobile/fortersdk/b$c;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/b$c;-><init>(Lcom/forter/mobile/fortersdk/b;Lcom/forter/mobile/fortersdk/v3;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
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

.method public final j()Lcom/forter/mobile/fortersdk/b$a;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->b:Lcom/forter/mobile/fortersdk/b$a;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/b;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 13
    return-object v0
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

.method public final k(Lcom/forter/mobile/fortersdk/v3;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    new-instance v1, Lcom/forter/mobile/fortersdk/b$d;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/b$d;-><init>(Lcom/forter/mobile/fortersdk/b;Lcom/forter/mobile/fortersdk/v3;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
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

.method public final l()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->j()Lcom/forter/mobile/fortersdk/b$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/forter/mobile/fortersdk/b$a;->e:Lcom/forter/mobile/fortersdk/b$a;

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->j()Lcom/forter/mobile/fortersdk/b$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lcom/forter/mobile/fortersdk/b$a;->d:Lcom/forter/mobile/fortersdk/b$a;

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/b;->j()Lcom/forter/mobile/fortersdk/b$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sget-object v1, Lcom/forter/mobile/fortersdk/b$a;->c:Lcom/forter/mobile/fortersdk/b$a;

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    return v0
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
.end method
