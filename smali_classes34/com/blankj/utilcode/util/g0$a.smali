.class public Lcom/blankj/utilcode/util/g0$a;
.super Ljava/lang/Object;
.source "ShadowUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final i:I


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/high16 v0, 0x41000000    # 8.0f

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/blankj/utilcode/util/u0;->g(F)I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lcom/blankj/utilcode/util/g0$a;->i:I

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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, -0x40800000    # -1.0f

    .line 6
    .line 7
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->a:F

    .line 8
    .line 9
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->b:F

    .line 10
    .line 11
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->c:F

    .line 12
    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->d:F

    .line 14
    .line 15
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->e:F

    .line 16
    .line 17
    const/high16 v0, 0x44000000    # 512.0f

    .line 18
    .line 19
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->f:I

    .line 20
    .line 21
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->g:I

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/g0$a;->h:Z

    .line 25
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


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 9
    :cond_0
    move-object v2, p1

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/drawable/StateListDrawable;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 15
    .line 16
    .line 17
    const v0, 0x10100a7

    .line 18
    .line 19
    .line 20
    filled-new-array {v0}, [I

    .line 21
    move-result-object v0

    .line 22
    .line 23
    new-instance v1, Lcom/blankj/utilcode/util/g0$c;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->d()F

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->e()F

    .line 31
    move-result v4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->b()F

    .line 35
    move-result v5

    .line 36
    .line 37
    iget v6, p0, Lcom/blankj/utilcode/util/g0$a;->g:I

    .line 38
    .line 39
    iget-boolean v7, p0, Lcom/blankj/utilcode/util/g0$a;->h:Z

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v1 .. v7}, Lcom/blankj/utilcode/util/g0$c;-><init>(Landroid/graphics/drawable/Drawable;FFFIZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    .line 48
    .line 49
    new-instance v1, Lcom/blankj/utilcode/util/g0$c;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->d()F

    .line 53
    move-result v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->f()F

    .line 57
    move-result v4

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->c()F

    .line 61
    move-result v5

    .line 62
    .line 63
    iget v6, p0, Lcom/blankj/utilcode/util/g0$a;->f:I

    .line 64
    .line 65
    iget-boolean v7, p0, Lcom/blankj/utilcode/util/g0$a;->h:Z

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v1 .. v7}, Lcom/blankj/utilcode/util/g0$c;-><init>(Landroid/graphics/drawable/Drawable;FFFIZ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 72
    return-object p1
.end method

.method public final b()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->d:F

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->e()F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->d:F

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->d:F

    .line 17
    return v0
    .line 18
.end method

.method public final c()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->e:F

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->f()F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->e:F

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->e:F

    .line 17
    return v0
    .line 18
.end method

.method public final d()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->a:F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    cmpg-float v0, v0, v1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lcom/blankj/utilcode/util/g0$a;->a:F

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->a:F

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final e()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->b:F

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget v0, Lcom/blankj/utilcode/util/g0$a;->i:I

    .line 11
    int-to-float v0, v0

    .line 12
    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->b:F

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->b:F

    .line 16
    return v0
    .line 17
    .line 18
.end method

.method public final f()F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->c:F

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$a;->e()F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/blankj/utilcode/util/g0$a;->c:F

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$a;->c:F

    .line 17
    return v0
    .line 18
.end method

.method public g(I)Lcom/blankj/utilcode/util/g0$a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p1}, Lcom/blankj/utilcode/util/g0$a;->h(II)Lcom/blankj/utilcode/util/g0$a;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public h(II)Lcom/blankj/utilcode/util/g0$a;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/g0$a;->f:I

    .line 3
    .line 4
    iput p2, p0, Lcom/blankj/utilcode/util/g0$a;->g:I

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

.method public i(I)Lcom/blankj/utilcode/util/g0$a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p1}, Lcom/blankj/utilcode/util/g0$a;->j(II)Lcom/blankj/utilcode/util/g0$a;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public j(II)Lcom/blankj/utilcode/util/g0$a;
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/g0$a;->b:F

    .line 4
    int-to-float p1, p2

    .line 5
    .line 6
    iput p1, p0, Lcom/blankj/utilcode/util/g0$a;->c:F

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
