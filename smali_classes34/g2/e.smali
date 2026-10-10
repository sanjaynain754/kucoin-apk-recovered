.class public Lg2/e;
.super Le2/b;
.source "GifDrawableResource.java"

# interfaces
.implements Lv1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le2/b<",
        "Lg2/c;",
        ">;",
        "Lv1/g;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lg2/c;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Le2/b;-><init>(Landroid/graphics/drawable/Drawable;)V

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
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lg2/c;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Lg2/c;

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

.method public getSize()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le2/b;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    check-cast v0, Lg2/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lg2/c;->i()I

    .line 8
    move-result v0

    .line 9
    return v0
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

.method public initialize()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le2/b;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    check-cast v0, Lg2/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lg2/c;->e()Landroid/graphics/Bitmap;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public recycle()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le2/b;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    check-cast v0, Lg2/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lg2/c;->stop()V

    .line 8
    .line 9
    iget-object v0, p0, Le2/b;->b:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    check-cast v0, Lg2/c;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lg2/c;->k()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method
