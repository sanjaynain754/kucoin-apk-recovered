.class public Lm5/e;
.super Ljava/lang/Object;
.source "AnimatedImageResultBuilder.java"


# instance fields
.field public final a:Lm5/b;

.field public b:La4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lm5/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lm5/e;->a:Lm5/b;

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


# virtual methods
.method public a()Lm5/d;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lm5/d;

    .line 4
    .line 5
    .line 6
    invoke-direct {v1, p0}, Lm5/d;-><init>(Lm5/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    iget-object v2, p0, Lm5/e;->b:La4/a;

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, La4/a;->j(La4/a;)V

    .line 12
    .line 13
    iput-object v0, p0, Lm5/e;->b:La4/a;

    .line 14
    .line 15
    iget-object v2, p0, Lm5/e;->c:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, La4/a;->k(Ljava/lang/Iterable;)V

    .line 19
    .line 20
    iput-object v0, p0, Lm5/e;->c:Ljava/util/List;

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    .line 24
    iget-object v2, p0, Lm5/e;->b:La4/a;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, La4/a;->j(La4/a;)V

    .line 28
    .line 29
    iput-object v0, p0, Lm5/e;->b:La4/a;

    .line 30
    .line 31
    iget-object v2, p0, Lm5/e;->c:Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, La4/a;->k(Ljava/lang/Iterable;)V

    .line 35
    .line 36
    iput-object v0, p0, Lm5/e;->c:Ljava/util/List;

    .line 37
    throw v1
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

.method public b()Lf6/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lm5/e;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La4/a;->i(Ljava/util/Collection;)Ljava/util/List;

    .line 6
    move-result-object v0

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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lm5/e;->d:I

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

.method public e()Lm5/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm5/e;->a:Lm5/b;

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

.method public f()La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lm5/e;->b:La4/a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La4/a;->h(La4/a;)La4/a;

    .line 6
    move-result-object v0

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

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm5/e;->e:Ljava/lang/String;

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

.method public h(Lf6/a;)Lm5/e;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public i(Ljava/util/List;)Lm5/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Lm5/e;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, La4/a;->i(Ljava/util/Collection;)Ljava/util/List;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lm5/e;->c:Ljava/util/List;

    .line 7
    return-object p0
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

.method public j(I)Lm5/e;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lm5/e;->d:I

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

.method public k(La4/a;)Lm5/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lm5/e;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, La4/a;->h(La4/a;)La4/a;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lm5/e;->b:La4/a;

    .line 7
    return-object p0
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

.method public l(Ljava/lang/String;)Lm5/e;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lm5/e;->e:Ljava/lang/String;

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
