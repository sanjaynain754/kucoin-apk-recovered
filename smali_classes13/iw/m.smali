.class public Liw/m;
.super Liw/c;
.source "ZoomPageTransformer.java"


# instance fields
.field public a:F

.field public b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Liw/c;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x3f59999a    # 0.85f

    .line 7
    .line 8
    iput v0, p0, Liw/m;->a:F

    .line 9
    .line 10
    .line 11
    const v0, 0x3f266666    # 0.65f

    .line 12
    .line 13
    iput v0, p0, Liw/m;->b:F

    .line 14
    return-void
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
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 5
    return-void
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
.end method

.method public c(Landroid/view/View;F)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Liw/m;->a:F

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    add-float/2addr p2, v1

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    .line 9
    move-result p2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 13
    move-result v0

    .line 14
    int-to-float v0, v0

    .line 15
    .line 16
    sub-float v2, v1, p2

    .line 17
    mul-float/2addr v0, v2

    .line 18
    .line 19
    const/high16 v3, 0x40000000    # 2.0f

    .line 20
    div-float/2addr v0, v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 24
    move-result v4

    .line 25
    int-to-float v4, v4

    .line 26
    mul-float/2addr v4, v2

    .line 27
    div-float/2addr v4, v3

    .line 28
    div-float/2addr v0, v3

    .line 29
    sub-float/2addr v4, v0

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v4}, Landroidx/core/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    .line 39
    .line 40
    iget v0, p0, Liw/m;->b:F

    .line 41
    .line 42
    iget v2, p0, Liw/m;->a:F

    .line 43
    sub-float/2addr p2, v2

    .line 44
    .line 45
    sub-float v2, v1, v2

    .line 46
    div-float/2addr p2, v2

    .line 47
    sub-float/2addr v1, v0

    .line 48
    mul-float/2addr p2, v1

    .line 49
    add-float/2addr v0, p2

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public d(Landroid/view/View;F)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Liw/m;->a:F

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    sub-float p2, v1, p2

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    .line 10
    move-result p2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 14
    move-result v0

    .line 15
    int-to-float v0, v0

    .line 16
    .line 17
    sub-float v2, v1, p2

    .line 18
    mul-float/2addr v0, v2

    .line 19
    .line 20
    const/high16 v3, 0x40000000    # 2.0f

    .line 21
    div-float/2addr v0, v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 25
    move-result v4

    .line 26
    int-to-float v4, v4

    .line 27
    mul-float/2addr v4, v2

    .line 28
    div-float/2addr v4, v3

    .line 29
    neg-float v2, v4

    .line 30
    div-float/2addr v0, v3

    .line 31
    add-float/2addr v2, v0

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v2}, Landroidx/core/view/ViewCompat;->setTranslationX(Landroid/view/View;F)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    .line 41
    .line 42
    iget v0, p0, Liw/m;->b:F

    .line 43
    .line 44
    iget v2, p0, Liw/m;->a:F

    .line 45
    sub-float/2addr p2, v2

    .line 46
    .line 47
    sub-float v2, v1, v2

    .line 48
    div-float/2addr p2, v2

    .line 49
    sub-float/2addr v1, v0

    .line 50
    mul-float/2addr p2, v1

    .line 51
    add-float/2addr v0, p2

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 55
    return-void
    .line 56
    .line 57
.end method
