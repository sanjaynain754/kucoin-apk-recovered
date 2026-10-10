.class public Lcom/blankj/utilcode/util/g0;
.super Ljava/lang/Object;
.source "ShadowUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/g0$b;,
        Lcom/blankj/utilcode/util/g0$c;,
        Lcom/blankj/utilcode/util/g0$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/View;Lcom/blankj/utilcode/util/g0$a;)V
    .locals 4

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const/16 v1, -0x10

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    instance-of v3, v2, Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/g0$a;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 36
    :cond_2
    :goto_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static varargs b([Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    goto :goto_1

    .line 4
    :cond_0
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    new-instance v3, Lcom/blankj/utilcode/util/g0$a;

    .line 12
    .line 13
    .line 14
    invoke-direct {v3}, Lcom/blankj/utilcode/util/g0$a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/g0;->a(Landroid/view/View;Lcom/blankj/utilcode/util/g0$a;)V

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    :goto_1
    return-void
    .line 22
    .line 23
.end method
