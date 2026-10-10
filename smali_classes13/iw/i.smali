.class public Liw/i;
.super Liw/c;
.source "RotatePageTransformer.java"


# instance fields
.field public a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Liw/c;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x41700000    # 15.0f

    .line 6
    .line 7
    iput v0, p0, Liw/i;->a:F

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
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    move-result p2

    .line 5
    int-to-float p2, p2

    .line 6
    .line 7
    const/high16 v0, 0x3f000000    # 0.5f

    .line 8
    mul-float/2addr p2, v0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setPivotX(Landroid/view/View;F)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    move-result p2

    .line 16
    int-to-float p2, p2

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setPivotY(Landroid/view/View;F)V

    .line 20
    const/4 p2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setRotation(Landroid/view/View;F)V

    .line 24
    return-void
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
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Liw/i;->a:F

    .line 3
    mul-float/2addr v0, p2

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    move-result p2

    .line 8
    int-to-float p2, p2

    .line 9
    .line 10
    const/high16 v1, 0x3f000000    # 0.5f

    .line 11
    mul-float/2addr p2, v1

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setPivotX(Landroid/view/View;F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    move-result p2

    .line 19
    int-to-float p2, p2

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setPivotY(Landroid/view/View;F)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setRotation(Landroid/view/View;F)V

    .line 26
    return-void
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

.method public d(Landroid/view/View;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Liw/i;->c(Landroid/view/View;F)V

    .line 4
    return-void
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
