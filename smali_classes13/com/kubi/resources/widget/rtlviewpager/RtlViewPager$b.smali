.class public Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;
.super Ldx/a;
.source "RtlViewPager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 0
    .param p1    # Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Ldx/a;-><init>(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    return-void
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


# virtual methods
.method public destroyItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 7
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ldx/a;->destroyItem(Landroid/view/View;ILjava/lang/Object;)V

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 3
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ldx/a;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 4
    const-string p2, "RtlViewPager"

    invoke-static {p1, p2}, Lcw/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Ldx/a;->getItemPosition(Ljava/lang/Object;)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    const/4 v0, -0x1

    .line 14
    const/4 v1, -0x2

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Ldx/a;->getCount()I

    .line 23
    move-result v0

    .line 24
    sub-int/2addr v0, p1

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    return v0

    .line 28
    :cond_1
    :goto_0
    return v1

    .line 29
    :cond_2
    return p1
    .line 30
    .line 31
    .line 32
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ldx/a;->getCount()I

    .line 12
    move-result v0

    .line 13
    sub-int/2addr v0, p1

    .line 14
    .line 15
    add-int/lit8 p1, v0, -0x1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Ldx/a;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public getPageWidth(I)F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ldx/a;->getCount()I

    .line 12
    move-result v0

    .line 13
    sub-int/2addr v0, p1

    .line 14
    .line 15
    add-int/lit8 p1, v0, -0x1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Ldx/a;->getPageWidth(I)F

    .line 19
    move-result p1

    .line 20
    return p1
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
.end method

.method public instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 6
    :cond_0
    invoke-super {p0, p1, p2}, Ldx/a;->instantiateItem(Landroid/view/View;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Ldx/a;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 6
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ldx/a;->setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V

    return-void
.end method

.method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager$b;->b:Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;

    invoke-static {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->b(Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Ldx/a;->getCount()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 p2, v0, -0x1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ldx/a;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method
