.class public Lk4/g;
.super Ljava/lang/Object;
.source "PipelineDraweeControllerBuilderSupplier.java"

# interfaces
.implements Lw3/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw3/k<",
        "Lk4/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/facebook/imagepipeline/core/ImagePipeline;

.field public final c:Lk4/h;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lo4/c;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/fresco/ui/common/ControllerListener2;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lg5/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/a;Ljava/util/Set;Ljava/util/Set;Lk4/b;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/imagepipeline/core/a;",
            "Ljava/util/Set<",
            "Lo4/c;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/facebook/fresco/ui/common/ControllerListener2;",
            ">;",
            "Lk4/b;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lk4/g;->a:Landroid/content/Context;

    .line 5
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/core/a;->j()Lcom/facebook/imagepipeline/core/ImagePipeline;

    move-result-object v0

    iput-object v0, p0, Lk4/g;->b:Lcom/facebook/imagepipeline/core/ImagePipeline;

    if-eqz p5, :cond_0

    .line 6
    invoke-virtual {p5}, Lk4/b;->d()Lk4/h;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p5}, Lk4/b;->d()Lk4/h;

    move-result-object v1

    iput-object v1, p0, Lk4/g;->c:Lk4/h;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Lk4/h;

    invoke-direct {v1}, Lk4/h;-><init>()V

    iput-object v1, p0, Lk4/g;->c:Lk4/h;

    .line 9
    :goto_0
    iget-object v2, p0, Lk4/g;->c:Lk4/h;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 11
    invoke-static {}, Ln4/a;->b()Ln4/a;

    move-result-object v4

    .line 12
    invoke-virtual {p2, p1}, Lcom/facebook/imagepipeline/core/a;->b(Landroid/content/Context;)Lw5/a;

    move-result-object v5

    .line 13
    invoke-static {}, Lu3/i;->g()Lu3/i;

    move-result-object v6

    .line 14
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipeline;->q()Lcom/facebook/imagepipeline/cache/f;

    move-result-object v7

    const/4 p1, 0x0

    if-eqz p5, :cond_1

    .line 15
    invoke-virtual {p5}, Lk4/b;->a()Lcom/facebook/common/internal/ImmutableList;

    move-result-object p2

    move-object v8, p2

    goto :goto_1

    :cond_1
    move-object v8, p1

    :goto_1
    if-eqz p5, :cond_2

    .line 16
    invoke-virtual {p5}, Lk4/b;->b()Lw3/k;

    move-result-object p2

    move-object v9, p2

    goto :goto_2

    :cond_2
    move-object v9, p1

    .line 17
    :goto_2
    invoke-virtual/range {v2 .. v9}, Lk4/h;->a(Landroid/content/res/Resources;Ln4/a;Lw5/a;Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/common/internal/ImmutableList;Lw3/k;)V

    .line 18
    iput-object p3, p0, Lk4/g;->d:Ljava/util/Set;

    .line 19
    iput-object p4, p0, Lk4/g;->e:Ljava/util/Set;

    if-eqz p5, :cond_3

    .line 20
    invoke-virtual {p5}, Lk4/b;->c()Lg5/b;

    move-result-object p1

    :cond_3
    iput-object p1, p0, Lk4/g;->f:Lg5/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/a;Lk4/b;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lk4/g;-><init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/a;Ljava/util/Set;Ljava/util/Set;Lk4/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk4/b;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/imagepipeline/core/a;->l()Lcom/facebook/imagepipeline/core/a;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lk4/g;-><init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/a;Lk4/b;)V

    return-void
.end method


# virtual methods
.method public a()Lk4/f;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lk4/f;

    .line 3
    .line 4
    iget-object v1, p0, Lk4/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, p0, Lk4/g;->c:Lk4/h;

    .line 7
    .line 8
    iget-object v3, p0, Lk4/g;->b:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 9
    .line 10
    iget-object v4, p0, Lk4/g;->d:Ljava/util/Set;

    .line 11
    .line 12
    iget-object v5, p0, Lk4/g;->e:Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lk4/f;-><init>(Landroid/content/Context;Lk4/h;Lcom/facebook/imagepipeline/core/ImagePipeline;Ljava/util/Set;Ljava/util/Set;)V

    .line 16
    .line 17
    iget-object v1, p0, Lk4/g;->f:Lg5/b;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lk4/f;->M(Lg5/b;)Lk4/f;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
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

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lk4/g;->a()Lk4/f;

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
.end method
