.class public Lq5/o;
.super Ljava/lang/Object;
.source "InstrumentedMemoryCache.java"

# interfaces
.implements Lcom/facebook/imagepipeline/cache/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/cache/f<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Lq5/r;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/cache/f;Lq5/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/f<",
            "TK;TV;>;",
            "Lq5/r;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 6
    .line 7
    iput-object p2, p0, Lq5/o;->b:Lq5/r;

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


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->a(Ljava/lang/Object;)V

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
.end method

.method public c(Lw3/i;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/i<",
            "TK;>;)I"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->c(Lw3/i;)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public e(Ljava/lang/Object;La4/a;)La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "La4/a<",
            "TV;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq5/o;->b:Lq5/r;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lq5/r;->c(Ljava/lang/Object;)V

    .line 6
    .line 7
    iget-object v0, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/cache/f;->e(Ljava/lang/Object;La4/a;)La4/a;

    .line 11
    move-result-object p1

    .line 12
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

.method public f(Lw3/i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/i<",
            "TK;>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->f(Lw3/i;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public get(Ljava/lang/Object;)La4/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq5/o;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->get(Ljava/lang/Object;)La4/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lq5/o;->b:Lq5/r;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, p1}, Lq5/r;->b(Ljava/lang/Object;)V

    .line 14
    return-object v0

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lq5/o;->b:Lq5/r;

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1}, Lq5/r;->a(Ljava/lang/Object;)V

    .line 20
    return-object v0
    .line 21
    .line 22
    .line 23
.end method
