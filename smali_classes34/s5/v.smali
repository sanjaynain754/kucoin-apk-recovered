.class public Ls5/v;
.super Ljava/lang/Object;
.source "ProducerFactory.java"


# instance fields
.field public a:Landroid/content/ContentResolver;

.field public b:Landroid/content/res/Resources;

.field public c:Landroid/content/res/AssetManager;

.field public final d:Lz3/a;

.field public final e:Lv5/b;

.field public final f:Lv5/e;

.field public final g:Lcom/facebook/imagepipeline/core/DownsampleMode;

.field public final h:Z

.field public final i:Z

.field public final j:Ls5/n;

.field public final k:Lz3/h;

.field public final l:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lq5/h;

.field public final p:Lq5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/b<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lq5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/b<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lp5/c;

.field public final s:I

.field public final t:I

.field public u:Z

.field public final v:Ls5/a;

.field public final w:I

.field public final x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lz3/a;",
            "Lv5/b;",
            "Lv5/e;",
            "Lcom/facebook/imagepipeline/core/DownsampleMode;",
            "ZZ",
            "Ls5/n;",
            "Lz3/h;",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;",
            "Lw3/k<",
            "Ls5/b;",
            ">;",
            "Lq5/h;",
            "Lp5/c;",
            "IIZI",
            "Ls5/a;",
            "ZI)V"
        }
    .end annotation

    move/from16 v0, p21

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iput-object v1, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iput-object v1, p0, Ls5/v;->b:Landroid/content/res/Resources;

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Ls5/v;->c:Landroid/content/res/AssetManager;

    .line 5
    iput-object p2, p0, Ls5/v;->d:Lz3/a;

    .line 6
    iput-object p3, p0, Ls5/v;->e:Lv5/b;

    .line 7
    iput-object p4, p0, Ls5/v;->f:Lv5/e;

    .line 8
    iput-object p5, p0, Ls5/v;->g:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 9
    iput-boolean p6, p0, Ls5/v;->h:Z

    .line 10
    iput-boolean p7, p0, Ls5/v;->i:Z

    .line 11
    iput-object p8, p0, Ls5/v;->j:Ls5/n;

    .line 12
    iput-object p9, p0, Ls5/v;->k:Lz3/h;

    .line 13
    iput-object p10, p0, Ls5/v;->n:Lcom/facebook/imagepipeline/cache/f;

    .line 14
    iput-object p11, p0, Ls5/v;->m:Lcom/facebook/imagepipeline/cache/f;

    .line 15
    iput-object p12, p0, Ls5/v;->l:Lw3/k;

    .line 16
    iput-object p13, p0, Ls5/v;->o:Lq5/h;

    move-object/from16 p1, p14

    .line 17
    iput-object p1, p0, Ls5/v;->r:Lp5/c;

    .line 18
    new-instance p1, Lq5/b;

    invoke-direct {p1, v0}, Lq5/b;-><init>(I)V

    iput-object p1, p0, Ls5/v;->p:Lq5/b;

    .line 19
    new-instance p1, Lq5/b;

    invoke-direct {p1, v0}, Lq5/b;-><init>(I)V

    iput-object p1, p0, Ls5/v;->q:Lq5/b;

    move/from16 p1, p15

    .line 20
    iput p1, p0, Ls5/v;->s:I

    move/from16 p1, p16

    .line 21
    iput p1, p0, Ls5/v;->t:I

    move/from16 p1, p17

    .line 22
    iput-boolean p1, p0, Ls5/v;->u:Z

    move/from16 p1, p18

    .line 23
    iput p1, p0, Ls5/v;->w:I

    move-object/from16 p1, p19

    .line 24
    iput-object p1, p0, Ls5/v;->v:Ls5/a;

    move/from16 p1, p20

    .line 25
    iput-boolean p1, p0, Ls5/v;->x:Z

    return-void
.end method

.method public static a(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/a;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V

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

.method public static h(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/k;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/k;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/k;-><init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/v0;)V

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


# virtual methods
.method public A(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/s0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/s0;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/s0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->n:Lcom/facebook/imagepipeline/cache/f;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/s0;-><init>(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public B(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/t0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/t0;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/t0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->r:Lp5/c;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->j:Ls5/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {v2}, Ls5/n;->b()Ljava/util/concurrent/Executor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/imagepipeline/producers/t0;-><init>(Lcom/facebook/imagepipeline/producers/v0;Lp5/c;Ljava/util/concurrent/Executor;)V

    .line 14
    return-object v0
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

.method public C()Lcom/facebook/imagepipeline/producers/QualifiedResourceFetchProducer;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/QualifiedResourceFetchProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/QualifiedResourceFetchProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;Z",
            "Le6/d;",
            ")",
            "Lcom/facebook/imagepipeline/producers/b1;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/b1;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->b()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    move-object v3, p1

    .line 12
    move v4, p2

    .line 13
    move-object v5, p3

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/b1;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)V

    .line 17
    return-object v0
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

.method public E(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/e1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;)",
            "Lcom/facebook/imagepipeline/producers/e1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/e1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/e1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V

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

.method public F(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/h1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;)",
            "Lcom/facebook/imagepipeline/producers/h1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/h1;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->a()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x5

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v2, v1, p1}, Lcom/facebook/imagepipeline/producers/h1;-><init>(ILjava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/v0;)V

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
    .line 23
.end method

.method public G([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/j1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/facebook/imagepipeline/producers/k1<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/j1;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/j1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/j1;-><init>([Lcom/facebook/imagepipeline/producers/k1;)V

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

.method public b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/f1;",
            ")",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;-><init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)V

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

.method public c(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->n:Lcom/facebook/imagepipeline/cache/f;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;-><init>(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public d(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/g;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/g;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->o:Lq5/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/g;-><init>(Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 8
    return-object v0
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

.method public e(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/h;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/h;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->n:Lcom/facebook/imagepipeline/cache/f;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/h;-><init>(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public f(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/i;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/i;

    .line 3
    .line 4
    iget v1, p0, Ls5/v;->s:I

    .line 5
    .line 6
    iget v2, p0, Ls5/v;->t:I

    .line 7
    .line 8
    iget-boolean v3, p0, Ls5/v;->u:Z

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/i;-><init>(Lcom/facebook/imagepipeline/producers/v0;IIZ)V

    .line 12
    return-object v0
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

.method public g(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/j;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/j;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/j;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->m:Lcom/facebook/imagepipeline/cache/f;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->l:Lw3/k;

    .line 7
    .line 8
    iget-object v3, p0, Ls5/v;->o:Lq5/h;

    .line 9
    .line 10
    iget-object v4, p0, Ls5/v;->p:Lq5/b;

    .line 11
    .line 12
    iget-object v5, p0, Ls5/v;->q:Lq5/b;

    .line 13
    move-object v6, p1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/facebook/imagepipeline/producers/j;-><init>(Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lq5/b;Lq5/b;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public i()Lcom/facebook/imagepipeline/producers/o;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/o;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->k:Lz3/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/o;-><init>(Lz3/h;)V

    .line 8
    return-object v0
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

.method public j(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/DecodeProducer;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/DecodeProducer;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/DecodeProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->d:Lz3/a;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->j:Ls5/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {v2}, Ls5/n;->g()Ljava/util/concurrent/Executor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->e:Lv5/b;

    .line 13
    .line 14
    iget-object v4, p0, Ls5/v;->f:Lv5/e;

    .line 15
    .line 16
    iget-object v5, p0, Ls5/v;->g:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 17
    .line 18
    iget-boolean v6, p0, Ls5/v;->h:Z

    .line 19
    .line 20
    iget-boolean v7, p0, Ls5/v;->i:Z

    .line 21
    .line 22
    iget v9, p0, Ls5/v;->w:I

    .line 23
    .line 24
    iget-object v10, p0, Ls5/v;->v:Ls5/a;

    .line 25
    const/4 v11, 0x0

    .line 26
    .line 27
    sget-object v12, Lw3/l;->b:Lw3/k;

    .line 28
    move-object v8, p1

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v0 .. v12}, Lcom/facebook/imagepipeline/producers/DecodeProducer;-><init>(Lz3/a;Ljava/util/concurrent/Executor;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLcom/facebook/imagepipeline/producers/v0;ILs5/a;Ljava/lang/Runnable;Lw3/k;)V

    .line 32
    return-object v0
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

.method public k(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/r;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/r;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->f()Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lcom/facebook/imagepipeline/producers/r;-><init>(Lcom/facebook/imagepipeline/producers/v0;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 12
    return-object v0
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

.method public l(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/t;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/t;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/t;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->l:Lw3/k;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lw3/k;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public m(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/u;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/u;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->l:Lw3/k;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/u;-><init>(Lw3/k;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public n(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/w;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/w;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->o:Lq5/h;

    .line 5
    .line 6
    iget-boolean v2, p0, Ls5/v;->x:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/w;-><init>(Lq5/h;ZLcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public o(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/x;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->m:Lcom/facebook/imagepipeline/cache/f;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/x;-><init>(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 10
    return-object v0
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

.method public p(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/y;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/y;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/y;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->l:Lw3/k;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    iget-object v3, p0, Ls5/v;->p:Lq5/b;

    .line 9
    .line 10
    iget-object v4, p0, Ls5/v;->q:Lq5/b;

    .line 11
    move-object v5, p1

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/y;-><init>(Lw3/k;Lq5/h;Lq5/b;Lq5/b;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public q()Lcom/facebook/imagepipeline/producers/LocalAssetFetchProducer;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalAssetFetchProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->c:Landroid/content/res/AssetManager;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalAssetFetchProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/res/AssetManager;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public r()Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public s()Lcom/facebook/imagepipeline/producers/e0;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/e0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/e0;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->d()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public u()Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public v()Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->k:Lz3/h;

    .line 11
    .line 12
    iget-object v3, p0, Ls5/v;->b:Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer;-><init>(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/res/Resources;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public w()Lcom/facebook/imagepipeline/producers/k0;
    .locals 3
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/k0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->b()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/k0;-><init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public x()Lcom/facebook/imagepipeline/producers/l0;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/l0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->j:Ls5/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/n;->c()Ljava/util/concurrent/Executor;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Ls5/v;->a:Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/l0;-><init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public y(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/p0;",
            ")",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/o0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->k:Lz3/h;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->d:Lz3/a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/o0;-><init>(Lz3/h;Lz3/a;Lcom/facebook/imagepipeline/producers/p0;)V

    .line 10
    return-object v0
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

.method public z(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/q0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/q0;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/q0;

    .line 3
    .line 4
    iget-object v1, p0, Ls5/v;->l:Lw3/k;

    .line 5
    .line 6
    iget-object v2, p0, Ls5/v;->o:Lq5/h;

    .line 7
    .line 8
    iget-object v3, p0, Ls5/v;->k:Lz3/h;

    .line 9
    .line 10
    iget-object v4, p0, Ls5/v;->d:Lz3/a;

    .line 11
    move-object v5, p1

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/q0;-><init>(Lw3/k;Lq5/h;Lz3/h;Lz3/a;Lcom/facebook/imagepipeline/producers/v0;)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
