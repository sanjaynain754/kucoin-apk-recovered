.class public Ls/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/o0$c;,
        Ls/o0$b;
    }
.end annotation


# static fields
.field public static final v:Ljava/lang/String;


# instance fields
.field public a:Lu/b;

.field public b:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ls/c0;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ls/e1;",
            ">;"
        }
    .end annotation
.end field

.field public volatile d:Z

.field public e:Ls/o0$c;

.field public f:Ljava/util/concurrent/ExecutorService;

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Landroid/content/Context;

.field public k:Ls/g;

.field public l:Ls/i;

.field public m:Ls/b1;

.field public n:Lg/e;

.field public final o:Ljava/lang/String;

.field public p:Ls/e0;

.field public q:Landroid/os/Handler;

.field public volatile r:Ls/e1;

.field public s:F

.field public t:J

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/j;->c()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Ls/o0;->v:Ljava/lang/String;

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
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ls/g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Ls/o0;->j:Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3}, Ls/o0;->n(Ls/g;)V

    .line 13
    .line 14
    iput-object p2, p0, Ls/o0;->o:Ljava/lang/String;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    const/4 p2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 21
    .line 22
    iput-object p1, p0, Ls/o0;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 28
    .line 29
    iput-object p1, p0, Ls/o0;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 35
    .line 36
    iput-object p1, p0, Ls/o0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    new-instance p1, Ls/e0;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1}, Ls/e0;-><init>()V

    .line 42
    .line 43
    iput-object p1, p0, Ls/o0;->p:Ls/e0;

    .line 44
    .line 45
    new-instance p1, Landroid/os/Handler;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    .line 54
    iput-object p1, p0, Ls/o0;->q:Landroid/os/Handler;

    .line 55
    return-void
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
.end method

.method public static synthetic B(Ls/o0;)Ls/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->k:Ls/g;

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
    .line 24
.end method

.method public static synthetic C(Ls/o0;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->g:Ljava/util/concurrent/atomic/AtomicInteger;

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
    .line 24
.end method

.method public static synthetic E()Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "platform_not_supported"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    sget-object v1, Ls/b;->d:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
.end method

.method public static synthetic F(Ls/o0;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/o0;->x()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic H(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->c:Ljava/util/concurrent/LinkedBlockingQueue;

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
    .line 24
.end method

.method public static synthetic I(Ls/o0;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Ls/o0;->t:J

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic a(Ls/o0;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/o0;->A()Lg/d;

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
    .line 24
.end method

.method public static synthetic b(Lai/advance/common/entity/BaseResultEntity;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ls/o0;->h(Lai/advance/common/entity/BaseResultEntity;)Lg/d;

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
    .line 24
.end method

.method public static synthetic c()Lg/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/o0;->E()Lg/d;

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
.end method

.method public static synthetic d(Ls/o0;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/o0;->G()Lg/d;

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
    .line 24
.end method

.method public static synthetic e(Ls/o0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/o0;->D()V

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
.end method

.method public static synthetic f()Lg/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/o0;->y()Lg/d;

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
.end method

.method public static synthetic g(Ls/o0;J)J
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Ls/o0;->t:J

    .line 3
    return-wide p1
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
.end method

.method public static synthetic h(Lai/advance/common/entity/BaseResultEntity;)Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "upload_image_data_finished"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    iget-object p0, p0, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ls/a;->h()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lg/d$b;->e(Ljava/lang/Object;)Lg/d$b;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lg/d$b;->m()Lg/d;

    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method

.method public static synthetic i(Ls/o0;)Lu/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->a:Lu/b;

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
    .line 24
.end method

.method public static synthetic p(Ls/o0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls/o0;->k(Ljava/lang/Runnable;)V

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
.end method

.method public static synthetic r(Ls/o0;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Ls/o0;->d:Z

    .line 3
    return p1
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
.end method

.method public static synthetic t(Ls/o0;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

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
    .line 24
.end method

.method public static synthetic v(Ls/o0;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Ls/o0;->d:Z

    .line 3
    return p0
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
    .line 24
.end method

.method public static synthetic w(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

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
    .line 24
.end method

.method public static synthetic y()Lg/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    const-string v1, "iqa_frontend_flow_finished"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ls/a;->n()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "SUCCESS"

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Ls/a;->f()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Lg/d$b;->b(Ljava/lang/Object;)Lg/d$b;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
.end method

.method public static synthetic z(Ls/o0;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ls/o0;->h:Ljava/util/concurrent/atomic/AtomicInteger;

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
    .line 24
.end method


# virtual methods
.method public final synthetic A()Lg/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    const-string v1, "detection_thread_started"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v1, p0, Ls/o0;->e:Ls/o0$c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    const-string/jumbo v2, "mUICallbackThread_empty_status"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-boolean v1, p0, Ls/o0;->d:Z

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    const-string/jumbo v2, "working"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 42
    move-result-object v0

    .line 43
    return-object v0
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
.end method

.method public final synthetic D()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->a:Lu/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lu/b;->d()V

    .line 8
    :cond_0
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
.end method

.method public final synthetic G()Lg/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    const-string v1, "app_configs"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 10
    .line 11
    iget-object v1, v1, Ls/g;->a:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "region"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 21
    .line 22
    iget-object v1, v1, Ls/g;->b:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    const-string v2, "cardSide"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 35
    .line 36
    iget-object v1, v1, Ls/g;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "cardType"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 49
    .line 50
    iget-boolean v1, v1, Ls/g;->d:Z

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    const-string/jumbo v2, "scanMode"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 64
    .line 65
    iget-object v1, v1, Ls/g;->e:Ljava/lang/String;

    .line 66
    .line 67
    const-string v2, "eventId"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 74
    .line 75
    iget-object v1, v1, Ls/g;->f:Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    const-string/jumbo v2, "pageId"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 85
    .line 86
    iget v1, v1, Ls/g;->g:I

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    const-string/jumbo v2, "scanTimeoutLimitSeconds"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 100
    .line 101
    iget v1, v1, Ls/g;->h:I

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    const-string/jumbo v2, "screenOrient"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 115
    .line 116
    iget-boolean v1, v1, Ls/g;->i:Z

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    const-string v2, "isPortrait"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 129
    .line 130
    iget-boolean v1, v1, Ls/g;->j:Z

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    const-string v2, "isFrontCamera"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    iget-object v1, p0, Ls/o0;->k:Ls/g;

    .line 143
    .line 144
    iget v1, v1, Ls/g;->k:I

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    const-string/jumbo v2, "pictureMaxSize"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 159
    move-result-object v0

    .line 160
    return-object v0
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
.end method

.method public J()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Ls/o0;->u:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ls/o0;->p:Ls/e0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ls/e0;->g()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Ls/h0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ls/h0;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ls/c1;->o()V

    .line 30
    const/4 v0, 0x0

    .line 31
    .line 32
    iput-object v0, p0, Ls/o0;->r:Ls/e1;

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    iput-boolean v1, p0, Ls/o0;->u:Z

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->release()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ls/o0;->K()V

    .line 42
    .line 43
    :try_start_0
    iput-object v0, p0, Ls/o0;->a:Lu/b;

    .line 44
    const/4 v0, 0x0

    .line 45
    .line 46
    iput-boolean v0, p0, Ls/o0;->d:Z

    .line 47
    .line 48
    iget-object v0, p0, Ls/o0;->e:Ls/o0$c;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ls/v0;->g(Ljava/lang/Throwable;)V

    .line 59
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final K()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Ls/o0;->f:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ls/v0;->g(Ljava/lang/Throwable;)V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public L()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "iqa_frontend_flow_started"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lf/f;->M(Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v0, Ls/b1;

    .line 12
    .line 13
    iget-object v1, p0, Ls/o0;->j:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v2, p0, Ls/o0;->o:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, p0, Ls/o0;->n:Lg/e;

    .line 18
    .line 19
    new-instance v4, Ls/o0$a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v4, p0}, Ls/o0$a;-><init>(Ls/o0;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Ls/b1;-><init>(Landroid/content/Context;Ljava/lang/String;Lg/e;Ls/d1;)V

    .line 26
    .line 27
    iput-object v0, p0, Ls/o0;->m:Ls/b1;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->isAuthenticated()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Ls/o0;->m:Ls/b1;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ls/b1;->l()V

    .line 39
    :cond_0
    return-void
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
.end method

.method public M()V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "startDetectionWorker"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ls/o0;->l(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Ls/o0;->e:Ls/o0$c;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Ls/o0;->d:Z

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    new-instance v1, Ls/f0;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0}, Ls/f0;-><init>(Ls/o0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 27
    const/4 v0, 0x1

    .line 28
    .line 29
    iput-boolean v0, p0, Ls/o0;->d:Z

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getYuvQueueMaxSize()I

    .line 35
    move-result v1

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 39
    .line 40
    iput-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getPreProcessQueueMaxSize()I

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 50
    .line 51
    iput-object v0, p0, Ls/o0;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 52
    .line 53
    new-instance v0, Ls/o0$c;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, p0}, Ls/o0$c;-><init>(Ls/o0;)V

    .line 57
    .line 58
    iput-object v0, p0, Ls/o0;->e:Ls/o0$c;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getPreProcessThreadCount()I

    .line 65
    move-result v0

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    iput-object v0, p0, Ls/o0;->f:Ljava/util/concurrent/ExecutorService;

    .line 72
    const/4 v0, 0x0

    .line 73
    .line 74
    .line 75
    :goto_0
    :try_start_0
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getPreProcessThreadCount()I

    .line 76
    move-result v1

    .line 77
    .line 78
    if-ge v0, v1, :cond_1

    .line 79
    .line 80
    iget-object v1, p0, Ls/o0;->f:Ljava/util/concurrent/ExecutorService;

    .line 81
    .line 82
    new-instance v2, Ls/o0$b;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, p0}, Ls/o0$b;-><init>(Ls/o0;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ls/v0;->g(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    :cond_1
    new-instance v0, Ls/g0;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p0}, Ls/g0;-><init>(Ls/o0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Ls/o0;->k(Ljava/lang/Runnable;)V

    .line 104
    :cond_2
    return-void
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
.end method

.method public N()V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    const-string/jumbo v0, "stopDetection"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ls/o0;->l(Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ls/o0;->q(Lu/b;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ls/o0;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Ls/o0;->d:Z

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public j()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ls/o0;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 15
    :cond_1
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final k(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->q:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 8
    :cond_0
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
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Ls/o0;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    return-void
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
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "ImageQualityDetector"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0, p2}, Ls/v0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    return-void
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
.end method

.method public final n(Ls/g;)V
    .locals 3

    .line 1
    .line 2
    iput-object p1, p0, Ls/o0;->k:Ls/g;

    .line 3
    .line 4
    sget-object p1, Laai/telemetry/enums/PluginPlatform;->Standard:Laai/telemetry/enums/PluginPlatform;

    .line 5
    .line 6
    :try_start_0
    sget-object v0, Ls/b;->d:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Laai/telemetry/enums/PluginPlatform;->valueOf(Ljava/lang/String;)Laai/telemetry/enums/PluginPlatform;

    .line 10
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :catch_0
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    new-instance v1, Ls/i0;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Ls/i0;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    new-instance v1, Lf/i$a;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Lf/i$a;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->isProdEnv()Z

    .line 36
    move-result v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lf/i$a;->k(Z)Lf/i$a;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    sget-object v2, Lai/advance/sdk/global/iqa/lib/w;->MIXED_EVENT:Lai/advance/sdk/global/iqa/lib/w;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lai/advance/sdk/global/iqa/lib/JNI;->getUrlByType(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lf/i$a;->i(Ljava/lang/String;)Lf/i$a;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    iget-object v2, p0, Ls/o0;->k:Ls/g;

    .line 57
    .line 58
    iget-object v2, v2, Ls/g;->e:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lf/i$a;->m(Ljava/lang/String;)Lf/i$a;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    const-string v2, "-"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lf/i$a;->e(Ljava/lang/String;)Lf/i$a;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lf/i$a;->g(Ljava/lang/String;)Lf/i$a;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lf/i$a;->h(Ljava/lang/String;)Lf/i$a;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1}, Lf/i$a;->j(Laai/telemetry/enums/PluginPlatform;)Lf/i$a;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    iget-object v1, p0, Ls/o0;->j:Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lm/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lf/i$a;->b(Ljava/lang/String;)Lf/i$a;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    const-string v1, "GLOBAL_IQA"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lf/i$a;->c(Ljava/lang/String;)Lf/i$a;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-static {}, Ls/b;->g()Ljava/lang/String;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, Lf/i$a;->d(Ljava/lang/String;)Lf/i$a;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    sget-object v1, Ls/o0;->v:Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lf/i$a;->f(Ljava/lang/String;)Lf/i$a;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lr/a;->c()Ljava/lang/String;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v1}, Lf/i$a;->l(Ljava/lang/String;)Lf/i$a;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Lf/i$a;->a()Lf/i;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p1}, Lf/f;->p(Lf/i;)Lg/e;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    iput-object p1, p0, Ls/o0;->n:Lg/e;

    .line 129
    .line 130
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 131
    .line 132
    iget-object v0, v0, Ls/g;->a:Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    const-string/jumbo v1, "region"

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1, v0}, Lg/e;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    iget-object p1, p0, Ls/o0;->n:Lg/e;

    .line 141
    .line 142
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 143
    .line 144
    iget-object v0, v0, Ls/g;->b:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 145
    .line 146
    const-string v1, "card_side"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v1, v0}, Lg/e;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    iget-object p1, p0, Ls/o0;->n:Lg/e;

    .line 152
    .line 153
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 154
    .line 155
    iget-object v0, v0, Ls/g;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 156
    .line 157
    const-string v1, "card_type"

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v1, v0}, Lg/e;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    iget-object p1, p0, Ls/o0;->n:Lg/e;

    .line 163
    .line 164
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 165
    .line 166
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 167
    .line 168
    if-eqz v0, :cond_0

    .line 169
    .line 170
    const-string v0, "SCAN"

    .line 171
    goto :goto_1

    .line 172
    .line 173
    :cond_0
    const-string v0, "TAKE_PHOTO"

    .line 174
    .line 175
    .line 176
    :goto_1
    const-string/jumbo v1, "mode"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v1, v0}, Lg/e;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 180
    .line 181
    iget-object p1, p0, Ls/o0;->n:Lg/e;

    .line 182
    .line 183
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 184
    .line 185
    iget-object v0, v0, Ls/g;->f:Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    const-string/jumbo v1, "process_id"

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v1, v0}, Lg/e;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    iget-object p1, p0, Ls/o0;->k:Ls/g;

    .line 194
    .line 195
    iget-object p1, p1, Ls/g;->e:Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Ls/a;->r(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    new-instance v0, Ls/j0;

    .line 205
    .line 206
    .line 207
    invoke-direct {v0, p0}, Ls/j0;-><init>(Ls/o0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v0}, Lf/f;->L(Lg/a;)V

    .line 211
    return-void
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
.end method

.method public o(Ls/c0;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Ls/o0;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ls/o0;->p:Ls/e0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ls/e0;->c()V

    .line 14
    .line 15
    iget-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getYuvQueueMaxSize()I

    .line 23
    move-result v1

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v0, p0, Ls/o0;->p:Ls/e0;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ls/e0;->d()V

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Ls/o0;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public q(Lu/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ls/o0;->a:Lu/b;

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
    .line 24
.end method

.method public s(Ljava/lang/String;)Lai/advance/common/entity/BaseResultEntity;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "upload_image_data_started"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lf/f;->M(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lf/f;->k()Lg/e;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget-object v1, Lai/advance/sdk/global/iqa/lib/w;->DETECTION:Lai/advance/sdk/global/iqa/lib/w;

    .line 21
    .line 22
    iget-object v2, p0, Ls/o0;->k:Ls/g;

    .line 23
    .line 24
    iget-object v5, v2, Ls/g;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, v2, Ls/g;->b:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 30
    move-result-object v6

    .line 31
    .line 32
    iget-object v2, p0, Ls/o0;->k:Ls/g;

    .line 33
    .line 34
    iget-object v2, v2, Ls/g;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 38
    move-result-object v7

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lk/j;->b()Ljava/lang/String;

    .line 42
    move-result-object v8

    .line 43
    .line 44
    iget-object v2, p0, Ls/o0;->k:Ls/g;

    .line 45
    .line 46
    iget-boolean v2, v2, Ls/g;->d:Z

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    const-string v2, "SCAN"

    .line 51
    :goto_0
    move-object v9, v2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_0
    const-string v2, "TAKE_PHOTO"

    .line 55
    goto :goto_0

    .line 56
    :goto_1
    const/4 v4, 0x0

    .line 57
    move-object v3, p1

    .line 58
    .line 59
    .line 60
    invoke-static/range {v3 .. v9}, Lai/advance/sdk/global/iqa/lib/JNI;->buildUploadPictureData(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-static {v1, p1, v0}, Ls/m;->i(Lai/advance/sdk/global/iqa/lib/w;Ljava/lang/String;Lg/e;)Landroid/util/Pair;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ln/h;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ln/h;->a()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    const-class v0, Lai/advance/common/entity/BaseResultEntity;

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Ls/a;->a(Lai/advance/common/entity/BaseResultEntity;)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    new-instance v1, Ls/k0;

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, p1}, Ls/k0;-><init>(Lai/advance/common/entity/BaseResultEntity;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 95
    .line 96
    iget-boolean v0, p1, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 101
    .line 102
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    .line 107
    const-string/jumbo v0, "scan"

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :cond_1
    const-string/jumbo v0, "takePhoto"

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-static {v0, v3}, Ls/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-object p1

    .line 116
    .line 117
    :cond_2
    iget-object v0, p1, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Ls/a;->p(Ljava/lang/String;)V

    .line 121
    .line 122
    iget-object v0, p1, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Ls/a;->q(Ljava/lang/String;)V

    .line 126
    return-object p1
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
.end method

.method public u()Ls/g;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->k:Ls/g;

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
.end method

.method public final x()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/o0;->k:Ls/g;

    .line 3
    .line 4
    iget-boolean v0, v0, Ls/g;->d:Z

    .line 5
    return v0
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
.end method
