.class public La6/e0;
.super Ljava/lang/Object;
.source "PoolConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La6/e0$a;
    }
.end annotation


# instance fields
.field public final a:La6/h0;

.field public final b:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

.field public final c:La6/h0;

.field public final d:Lz3/d;

.field public final e:La6/h0;

.field public final f:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

.field public final g:La6/h0;

.field public final h:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Z


# direct methods
.method public constructor <init>(La6/e0$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ld6/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    const-string v0, "PoolConfig()"

    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {p1}, La6/e0$a;->c(La6/e0$a;)La6/h0;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, La6/o;->a()La6/h0;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1}, La6/e0$a;->c(La6/e0$a;)La6/h0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, La6/e0;->a:La6/h0;

    .line 8
    invoke-static {p1}, La6/e0$a;->d(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    if-nez v0, :cond_2

    .line 9
    invoke-static {}, La6/b0;->h()La6/b0;

    move-result-object v0

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {p1}, La6/e0$a;->d(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    :goto_1
    iput-object v0, p0, La6/e0;->b:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 11
    invoke-static {p1}, La6/e0$a;->f(La6/e0$a;)La6/h0;

    move-result-object v0

    if-nez v0, :cond_3

    .line 12
    invoke-static {}, La6/q;->b()La6/h0;

    move-result-object v0

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {p1}, La6/e0$a;->f(La6/e0$a;)La6/h0;

    move-result-object v0

    :goto_2
    iput-object v0, p0, La6/e0;->c:La6/h0;

    .line 14
    invoke-static {p1}, La6/e0$a;->i(La6/e0$a;)Lz3/d;

    move-result-object v0

    if-nez v0, :cond_4

    .line 15
    invoke-static {}, Lz3/e;->b()Lz3/e;

    move-result-object v0

    goto :goto_3

    .line 16
    :cond_4
    invoke-static {p1}, La6/e0$a;->i(La6/e0$a;)Lz3/d;

    move-result-object v0

    :goto_3
    iput-object v0, p0, La6/e0;->d:Lz3/d;

    .line 17
    invoke-static {p1}, La6/e0$a;->g(La6/e0$a;)La6/h0;

    move-result-object v0

    if-nez v0, :cond_5

    .line 18
    invoke-static {}, La6/r;->a()La6/h0;

    move-result-object v0

    goto :goto_4

    .line 19
    :cond_5
    invoke-static {p1}, La6/e0$a;->g(La6/e0$a;)La6/h0;

    move-result-object v0

    :goto_4
    iput-object v0, p0, La6/e0;->e:La6/h0;

    .line 20
    invoke-static {p1}, La6/e0$a;->h(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    if-nez v0, :cond_6

    .line 21
    invoke-static {}, La6/b0;->h()La6/b0;

    move-result-object v0

    goto :goto_5

    .line 22
    :cond_6
    invoke-static {p1}, La6/e0$a;->h(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    :goto_5
    iput-object v0, p0, La6/e0;->f:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 23
    invoke-static {p1}, La6/e0$a;->k(La6/e0$a;)La6/h0;

    move-result-object v0

    if-nez v0, :cond_7

    .line 24
    invoke-static {}, La6/p;->a()La6/h0;

    move-result-object v0

    goto :goto_6

    .line 25
    :cond_7
    invoke-static {p1}, La6/e0$a;->k(La6/e0$a;)La6/h0;

    move-result-object v0

    :goto_6
    iput-object v0, p0, La6/e0;->g:La6/h0;

    .line 26
    invoke-static {p1}, La6/e0$a;->l(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    if-nez v0, :cond_8

    .line 27
    invoke-static {}, La6/b0;->h()La6/b0;

    move-result-object v0

    goto :goto_7

    .line 28
    :cond_8
    invoke-static {p1}, La6/e0$a;->l(La6/e0$a;)Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    move-result-object v0

    :goto_7
    iput-object v0, p0, La6/e0;->h:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 29
    invoke-static {p1}, La6/e0$a;->e(La6/e0$a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "legacy"

    goto :goto_8

    :cond_9
    invoke-static {p1}, La6/e0$a;->e(La6/e0$a;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    iput-object v0, p0, La6/e0;->i:Ljava/lang/String;

    .line 30
    invoke-static {p1}, La6/e0$a;->b(La6/e0$a;)I

    move-result v0

    iput v0, p0, La6/e0;->j:I

    .line 31
    invoke-static {p1}, La6/e0$a;->a(La6/e0$a;)I

    move-result v0

    if-lez v0, :cond_a

    .line 32
    invoke-static {p1}, La6/e0$a;->a(La6/e0$a;)I

    move-result v0

    goto :goto_9

    :cond_a
    const/high16 v0, 0x400000

    .line 33
    :goto_9
    iput v0, p0, La6/e0;->k:I

    .line 34
    invoke-static {p1}, La6/e0$a;->j(La6/e0$a;)Z

    move-result v0

    iput-boolean v0, p0, La6/e0;->l:Z

    .line 35
    invoke-static {}, Ld6/b;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 36
    invoke-static {}, Ld6/b;->b()V

    .line 37
    :cond_b
    iget-boolean p1, p1, La6/e0$a;->m:Z

    iput-boolean p1, p0, La6/e0;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(La6/e0$a;La6/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La6/e0;-><init>(La6/e0$a;)V

    return-void
.end method

.method public static n()La6/e0$a;
    .locals 2

    .line 1
    .line 2
    new-instance v0, La6/e0$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, La6/e0$a;-><init>(La6/f0;)V

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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, La6/e0;->k:I

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

.method public b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, La6/e0;->j:I

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

.method public c()La6/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->a:La6/h0;

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

.method public d()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->b:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

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

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->i:Ljava/lang/String;

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

.method public f()La6/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->c:La6/h0;

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

.method public g()La6/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->e:La6/h0;

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

.method public h()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->f:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

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

.method public i()Lz3/d;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->d:Lz3/d;

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

.method public j()La6/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->g:La6/h0;

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

.method public k()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/e0;->h:Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

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

.method public l()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, La6/e0;->m:Z

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

.method public m()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, La6/e0;->l:Z

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
