.class public Lcom/facebook/drawee/drawable/d;
.super Ljava/lang/Object;
.source "DrawableProperties.java"


# instance fields
.field public a:I

.field public b:Z

.field public c:Landroid/graphics/ColorFilter;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/drawee/drawable/d;->a:I

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/d;->b:Z

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    iput-object v1, p0, Lcom/facebook/drawee/drawable/d;->c:Landroid/graphics/ColorFilter;

    .line 13
    .line 14
    iput v0, p0, Lcom/facebook/drawee/drawable/d;->d:I

    .line 15
    .line 16
    iput v0, p0, Lcom/facebook/drawee/drawable/d;->e:I

    .line 17
    return-void
    .line 18
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_1

    .line 4
    .line 5
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/d;->a:I

    .line 6
    const/4 v1, -0x1

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 12
    .line 13
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/d;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/drawee/drawable/d;->c:Landroid/graphics/ColorFilter;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 21
    .line 22
    :cond_2
    iget v0, p0, Lcom/facebook/drawee/drawable/d;->d:I

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    move v0, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_3
    move v0, v2

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 35
    .line 36
    :cond_4
    iget v0, p0, Lcom/facebook/drawee/drawable/d;->e:I

    .line 37
    .line 38
    if-eq v0, v1, :cond_6

    .line 39
    .line 40
    if-eqz v0, :cond_5

    .line 41
    move v2, v3

    .line 42
    .line 43
    .line 44
    :cond_5
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 45
    :cond_6
    :goto_1
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
.end method

.method public b(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/drawee/drawable/d;->a:I

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
.end method

.method public c(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/drawee/drawable/d;->c:Landroid/graphics/ColorFilter;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    .line 9
    :goto_0
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/d;->b:Z

    .line 10
    return-void
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

.method public d(Z)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/drawee/drawable/d;->d:I

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
.end method

.method public e(Z)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/drawee/drawable/d;->e:I

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
.end method
