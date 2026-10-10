.class public Lcom/facebook/drawee/drawable/b;
.super Lcom/facebook/drawee/drawable/g;
.source "AutoRotateDrawable.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:I

.field public c:Z

.field public d:F
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/drawee/drawable/b;-><init>(Landroid/graphics/drawable/Drawable;IZ)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;IZ)V
    .locals 0

    .line 2
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, p1}, Lcom/facebook/drawee/drawable/g;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/facebook/drawee/drawable/b;->d:F

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/b;->e:Z

    .line 5
    iput p2, p0, Lcom/facebook/drawee/drawable/b;->b:I

    .line 6
    iput-boolean p3, p0, Lcom/facebook/drawee/drawable/b;->c:Z

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 11
    .line 12
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 13
    sub-int/2addr v2, v3

    .line 14
    .line 15
    iget v4, v1, Landroid/graphics/Rect;->bottom:I

    .line 16
    .line 17
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 18
    sub-int/2addr v4, v1

    .line 19
    .line 20
    iget v5, p0, Lcom/facebook/drawee/drawable/b;->d:F

    .line 21
    .line 22
    iget-boolean v6, p0, Lcom/facebook/drawee/drawable/b;->c:Z

    .line 23
    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    const/high16 v6, 0x43b40000    # 360.0f

    .line 27
    .line 28
    sub-float v5, v6, v5

    .line 29
    .line 30
    :cond_0
    div-int/lit8 v2, v2, 0x2

    .line 31
    add-int/2addr v3, v2

    .line 32
    int-to-float v2, v3

    .line 33
    .line 34
    div-int/lit8 v4, v4, 0x2

    .line 35
    add-int/2addr v1, v4

    .line 36
    int-to-float v1, v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v5, v2, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/g;->draw(Landroid/graphics/Canvas;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/b;->j()V

    .line 49
    return-void
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

.method public final i()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/b;->b:I

    .line 3
    int-to-float v0, v0

    .line 4
    .line 5
    const/high16 v1, 0x41a00000    # 20.0f

    .line 6
    div-float/2addr v1, v0

    .line 7
    .line 8
    const/high16 v0, 0x43b40000    # 360.0f

    .line 9
    mul-float/2addr v1, v0

    .line 10
    float-to-int v0, v1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final j()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/b;->e:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/b;->e:Z

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    move-result-wide v0

    .line 12
    .line 13
    const-wide/16 v2, 0x14

    .line 14
    add-long/2addr v0, v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p0, v0, v1}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 18
    :cond_0
    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/b;->e:Z

    .line 4
    .line 5
    iget v0, p0, Lcom/facebook/drawee/drawable/b;->d:F

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/b;->i()I

    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    add-float/2addr v0, v1

    .line 12
    .line 13
    iput v0, p0, Lcom/facebook/drawee/drawable/b;->d:F

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 17
    return-void
    .line 18
.end method
