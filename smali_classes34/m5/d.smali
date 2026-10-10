.class public Lm5/d;
.super Ljava/lang/Object;
.source "AnimatedImageResult.java"


# instance fields
.field public final a:Lm5/b;

.field public final b:I

.field public c:Ljava/lang/String;

.field public d:La4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm5/b;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm5/b;

    iput-object p1, p0, Lm5/d;->a:Lm5/b;

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lm5/d;->b:I

    return-void
.end method

.method public constructor <init>(Lm5/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lm5/e;->e()Lm5/b;

    move-result-object v0

    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm5/b;

    iput-object v0, p0, Lm5/d;->a:Lm5/b;

    .line 3
    invoke-virtual {p1}, Lm5/e;->d()I

    move-result v0

    iput v0, p0, Lm5/d;->b:I

    .line 4
    invoke-virtual {p1}, Lm5/e;->f()La4/a;

    move-result-object v0

    iput-object v0, p0, Lm5/d;->d:La4/a;

    .line 5
    invoke-virtual {p1}, Lm5/e;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm5/d;->e:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Lm5/e;->b()Lf6/a;

    .line 7
    invoke-virtual {p1}, Lm5/e;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm5/d;->c:Ljava/lang/String;

    return-void
.end method

.method public static b(Lm5/b;)Lm5/d;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lm5/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lm5/d;-><init>(Lm5/b;)V

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

.method public static f(Lm5/b;)Lm5/e;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lm5/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lm5/e;-><init>(Lm5/b;)V

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


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lm5/d;->d:La4/a;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lm5/d;->d:La4/a;

    .line 10
    .line 11
    iget-object v1, p0, Lm5/d;->e:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, La4/a;->k(Ljava/lang/Iterable;)V

    .line 15
    .line 16
    iput-object v0, p0, Lm5/d;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public c()Lf6/a;
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

.method public d()Lm5/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm5/d;->a:Lm5/b;

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
    iget-object v0, p0, Lm5/d;->c:Ljava/lang/String;

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
