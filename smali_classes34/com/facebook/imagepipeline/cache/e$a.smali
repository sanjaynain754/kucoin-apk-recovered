.class public Lcom/facebook/imagepipeline/cache/e$a;
.super Ljava/lang/Object;
.source "LruCountingMemoryCache.java"

# interfaces
.implements Lq5/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/cache/e;->A(Lq5/u;)Lq5/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq5/u<",
        "Lcom/facebook/imagepipeline/cache/c$a<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lq5/u;

.field public final synthetic b:Lcom/facebook/imagepipeline/cache/e;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/cache/e;Lq5/u;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/cache/e$a;->b:Lcom/facebook/imagepipeline/cache/e;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/cache/e$a;->a:Lq5/u;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/facebook/imagepipeline/cache/c$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e$a;->b(Lcom/facebook/imagepipeline/cache/c$a;)I

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

.method public b(Lcom/facebook/imagepipeline/cache/c$a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)I"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e$a;->b:Lcom/facebook/imagepipeline/cache/e;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/imagepipeline/cache/e;->g(Lcom/facebook/imagepipeline/cache/e;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget p1, p1, Lcom/facebook/imagepipeline/cache/c$a;->g:I

    .line 11
    return p1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e$a;->a:Lq5/u;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/c$a;->b:La4/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, La4/a;->l()Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Lq5/u;->a(Ljava/lang/Object;)I

    .line 23
    move-result p1

    .line 24
    return p1
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
.end method
