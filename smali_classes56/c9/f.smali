.class public Lc9/f;
.super Ljava/lang/Object;
.source "DisplayConfiguration.java"


# instance fields
.field public a:Lb9/m;

.field public b:I

.field public c:Z

.field public d:Lc9/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
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
.end method

.method public constructor <init>(ILb9/m;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lc9/f;->c:Z

    .line 7
    .line 8
    new-instance v0, Lc9/g;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lc9/g;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lc9/f;->d:Lc9/j;

    .line 14
    .line 15
    iput p1, p0, Lc9/f;->b:I

    .line 16
    .line 17
    iput-object p2, p0, Lc9/f;->a:Lb9/m;

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
.end method


# virtual methods
.method public a(Ljava/util/List;Z)Lb9/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb9/m;",
            ">;Z)",
            "Lb9/m;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lc9/f;->b(Z)Lb9/m;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    iget-object v0, p0, Lc9/f;->d:Lc9/j;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lc9/j;->b(Ljava/util/List;Lb9/m;)Lb9/m;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method public b(Z)Lb9/m;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lc9/f;->a:Lb9/m;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lb9/m;->b()Lb9/m;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_1
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
    .line 24
.end method

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lc9/f;->b:I

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
.end method

.method public d(Lb9/m;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lc9/f;->d:Lc9/j;

    .line 3
    .line 4
    iget-object v1, p0, Lc9/f;->a:Lb9/m;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Lc9/j;->d(Lb9/m;Lb9/m;)Landroid/graphics/Rect;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public e(Lc9/j;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/f;->d:Lc9/j;

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
