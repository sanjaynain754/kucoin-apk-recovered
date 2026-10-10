.class public Lr4/b;
.super Ljava/lang/Object;
.source "GenericDraweeHierarchyBuilder.java"


# static fields
.field public static final t:Lcom/facebook/drawee/drawable/q;

.field public static final u:Lcom/facebook/drawee/drawable/q;


# instance fields
.field public a:Landroid/content/res/Resources;

.field public b:I

.field public c:F

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Lcom/facebook/drawee/drawable/q;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Lcom/facebook/drawee/drawable/q;

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:Lcom/facebook/drawee/drawable/q;

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Lcom/facebook/drawee/drawable/q;

.field public l:Lcom/facebook/drawee/drawable/q;

.field public m:Landroid/graphics/Matrix;

.field public n:Landroid/graphics/PointF;

.field public o:Landroid/graphics/ColorFilter;

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/graphics/drawable/Drawable;

.field public s:Lcom/facebook/drawee/generic/RoundingParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/drawee/drawable/q;->h:Lcom/facebook/drawee/drawable/q;

    .line 3
    .line 4
    sput-object v0, Lr4/b;->t:Lcom/facebook/drawee/drawable/q;

    .line 5
    .line 6
    sget-object v0, Lcom/facebook/drawee/drawable/q;->i:Lcom/facebook/drawee/drawable/q;

    .line 7
    .line 8
    sput-object v0, Lr4/b;->u:Lcom/facebook/drawee/drawable/q;

    .line 9
    return-void
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

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lr4/b;->a:Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lr4/b;->t()V

    .line 9
    return-void
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

.method public static u(Landroid/content/res/Resources;)Lr4/b;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lr4/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lr4/b;-><init>(Landroid/content/res/Resources;)V

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
.method public A(Lcom/facebook/drawee/drawable/q;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->i:Lcom/facebook/drawee/drawable/q;

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

.method public B(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lr4/b;->q:Ljava/util/List;

    .line 6
    return-object p0

    .line 7
    .line 8
    .line 9
    :cond_0
    filled-new-array {p1}, [Landroid/graphics/drawable/Drawable;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lr4/b;->q:Ljava/util/List;

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public C(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->d:Landroid/graphics/drawable/Drawable;

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

.method public D(Lcom/facebook/drawee/drawable/q;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->e:Lcom/facebook/drawee/drawable/q;

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

.method public E(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lr4/b;->r:Landroid/graphics/drawable/Drawable;

    .line 6
    return-object p0

    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 12
    .line 13
    .line 14
    const v1, 0x10100a7

    .line 15
    .line 16
    .line 17
    filled-new-array {v1}, [I

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    iput-object v0, p0, Lr4/b;->r:Landroid/graphics/drawable/Drawable;

    .line 24
    return-object p0
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

.method public F(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->j:Landroid/graphics/drawable/Drawable;

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

.method public G(Lcom/facebook/drawee/drawable/q;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->k:Lcom/facebook/drawee/drawable/q;

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

.method public H(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->f:Landroid/graphics/drawable/Drawable;

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

.method public I(Lcom/facebook/drawee/drawable/q;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->g:Lcom/facebook/drawee/drawable/q;

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

.method public J(Lcom/facebook/drawee/generic/RoundingParams;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->s:Lcom/facebook/drawee/generic/RoundingParams;

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

.method public final K()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->q:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
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

.method public a()Lr4/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/b;->K()V

    .line 4
    .line 5
    new-instance v0, Lr4/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lr4/a;-><init>(Lr4/b;)V

    .line 9
    return-object v0
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

.method public b()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->o:Landroid/graphics/ColorFilter;

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

.method public c()Landroid/graphics/PointF;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->n:Landroid/graphics/PointF;

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

.method public d()Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->l:Lcom/facebook/drawee/drawable/q;

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

.method public e()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->p:Landroid/graphics/drawable/Drawable;

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

.method public f()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lr4/b;->c:F

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

.method public g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lr4/b;->b:I

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

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->h:Landroid/graphics/drawable/Drawable;

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

.method public i()Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->i:Lcom/facebook/drawee/drawable/q;

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

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->q:Ljava/util/List;

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

.method public k()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->d:Landroid/graphics/drawable/Drawable;

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

.method public l()Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->e:Lcom/facebook/drawee/drawable/q;

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

.method public m()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->r:Landroid/graphics/drawable/Drawable;

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

.method public n()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->j:Landroid/graphics/drawable/Drawable;

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

.method public o()Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->k:Lcom/facebook/drawee/drawable/q;

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

.method public p()Landroid/content/res/Resources;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->a:Landroid/content/res/Resources;

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

.method public q()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->f:Landroid/graphics/drawable/Drawable;

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

.method public r()Lcom/facebook/drawee/drawable/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->g:Lcom/facebook/drawee/drawable/q;

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

.method public s()Lcom/facebook/drawee/generic/RoundingParams;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lr4/b;->s:Lcom/facebook/drawee/generic/RoundingParams;

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

.method public final t()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x12c

    .line 3
    .line 4
    iput v0, p0, Lr4/b;->b:I

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput v0, p0, Lr4/b;->c:F

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lr4/b;->d:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    sget-object v1, Lr4/b;->t:Lcom/facebook/drawee/drawable/q;

    .line 13
    .line 14
    iput-object v1, p0, Lr4/b;->e:Lcom/facebook/drawee/drawable/q;

    .line 15
    .line 16
    iput-object v0, p0, Lr4/b;->f:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    iput-object v1, p0, Lr4/b;->g:Lcom/facebook/drawee/drawable/q;

    .line 19
    .line 20
    iput-object v0, p0, Lr4/b;->h:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    iput-object v1, p0, Lr4/b;->i:Lcom/facebook/drawee/drawable/q;

    .line 23
    .line 24
    iput-object v0, p0, Lr4/b;->j:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iput-object v1, p0, Lr4/b;->k:Lcom/facebook/drawee/drawable/q;

    .line 27
    .line 28
    sget-object v1, Lr4/b;->u:Lcom/facebook/drawee/drawable/q;

    .line 29
    .line 30
    iput-object v1, p0, Lr4/b;->l:Lcom/facebook/drawee/drawable/q;

    .line 31
    .line 32
    iput-object v0, p0, Lr4/b;->m:Landroid/graphics/Matrix;

    .line 33
    .line 34
    iput-object v0, p0, Lr4/b;->n:Landroid/graphics/PointF;

    .line 35
    .line 36
    iput-object v0, p0, Lr4/b;->o:Landroid/graphics/ColorFilter;

    .line 37
    .line 38
    iput-object v0, p0, Lr4/b;->p:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    iput-object v0, p0, Lr4/b;->q:Ljava/util/List;

    .line 41
    .line 42
    iput-object v0, p0, Lr4/b;->r:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    iput-object v0, p0, Lr4/b;->s:Lcom/facebook/drawee/generic/RoundingParams;

    .line 45
    return-void
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

.method public v(Lcom/facebook/drawee/drawable/q;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->l:Lcom/facebook/drawee/drawable/q;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lr4/b;->m:Landroid/graphics/Matrix;

    .line 6
    return-object p0
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

.method public w(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->p:Landroid/graphics/drawable/Drawable;

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

.method public x(F)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lr4/b;->c:F

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

.method public y(I)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lr4/b;->b:I

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

.method public z(Landroid/graphics/drawable/Drawable;)Lr4/b;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lr4/b;->h:Landroid/graphics/drawable/Drawable;

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
