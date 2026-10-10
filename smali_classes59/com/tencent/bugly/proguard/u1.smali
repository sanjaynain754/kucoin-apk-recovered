.class public Lcom/tencent/bugly/proguard/u1;
.super Lcom/tencent/bugly/proguard/c;
.source "BUGLY"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/c;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)Lcom/tencent/bugly/proguard/s4;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/u1;->a(Landroid/graphics/drawable/Drawable;I)Lcom/tencent/bugly/proguard/s4;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/graphics/drawable/Drawable;I)Lcom/tencent/bugly/proguard/s4;
    .locals 7
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/s4;

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 6
    invoke-static {p1}, Lcom/tencent/bugly/proguard/t1;->a(Landroid/graphics/Bitmap;)I

    move-result p1

    int-to-long v4, p1

    .line 7
    const-string v6, ""

    move v1, p2

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/s4;-><init>(IIIJLjava/lang/String;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/graphics/drawable/Drawable;)Lcom/tencent/bugly/proguard/s4;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/u1;->a(Landroid/graphics/drawable/Drawable;I)Lcom/tencent/bugly/proguard/s4;

    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
.end method
