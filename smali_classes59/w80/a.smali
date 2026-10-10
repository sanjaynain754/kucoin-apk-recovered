.class public Lw80/a;
.super Ljava/lang/Object;
.source "AndroidBug5497Workaround.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public b:Landroid/app/Activity;

.field public c:Landroid/view/View;

.field public d:Landroid/widget/FrameLayout$LayoutParams;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lw80/a;->g:Z

    .line 7
    .line 8
    .line 9
    const v1, 0x1020002

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Landroid/widget/FrameLayout;

    .line 16
    .line 17
    iput-object p1, p0, Lw80/a;->b:Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lw80/a;->c:Landroid/view/View;

    .line 24
    .line 25
    sget-object p1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->j()I

    .line 29
    move-result p1

    .line 30
    .line 31
    iput p1, p0, Lw80/a;->f:I

    .line 32
    .line 33
    iget-object p1, p0, Lw80/a;->c:Landroid/view/View;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 40
    .line 41
    iput-object p1, p0, Lw80/a;->d:Landroid/widget/FrameLayout$LayoutParams;

    .line 42
    .line 43
    :try_start_0
    iget-object p1, p0, Lw80/a;->c:Landroid/view/View;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :catch_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lw80/a;->e(Landroid/app/Activity;)Lw80/a;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lw80/a;->g(Ljava/lang/Boolean;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static e(Landroid/app/Activity;)Lw80/a;
    .locals 3

    .line 1
    .line 2
    .line 3
    const v0, 0x1020002

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Landroid/widget/FrameLayout;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    instance-of v2, v1, Lw80/a;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Lw80/a;

    .line 20
    return-object v1

    .line 21
    .line 22
    :cond_0
    new-instance v1, Lw80/a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0}, Lw80/a;-><init>(Landroid/app/Activity;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 29
    return-object v1
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public final b()I
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x23

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 9
    .line 10
    iget-object v1, p0, Lw80/a;->b:Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->m(Landroid/app/Activity;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->i()I

    .line 24
    move-result v0

    .line 25
    return v0
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

.method public final c()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lw80/a;->g:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lw80/a;->f:I

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
.end method

.method public final d()I
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lw80/a;->c:Landroid/view/View;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final f()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lw80/a;->d()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lw80/a;->e:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lw80/a;->c:Landroid/view/View;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 18
    move-result v1

    .line 19
    .line 20
    sub-int v2, v1, v0

    .line 21
    .line 22
    div-int/lit8 v3, v1, 0x4

    .line 23
    .line 24
    if-le v2, v3, :cond_0

    .line 25
    .line 26
    iget-object v3, p0, Lw80/a;->d:Landroid/widget/FrameLayout$LayoutParams;

    .line 27
    sub-int/2addr v1, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lw80/a;->c()I

    .line 31
    move-result v2

    .line 32
    sub-int/2addr v1, v2

    .line 33
    .line 34
    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    iget-object v2, p0, Lw80/a;->d:Landroid/widget/FrameLayout$LayoutParams;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lw80/a;->b()I

    .line 41
    move-result v3

    .line 42
    sub-int/2addr v1, v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lw80/a;->c()I

    .line 46
    move-result v3

    .line 47
    sub-int/2addr v1, v3

    .line 48
    .line 49
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 50
    .line 51
    :goto_0
    iget-object v1, p0, Lw80/a;->c:Landroid/view/View;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 55
    .line 56
    iput v0, p0, Lw80/a;->e:I

    .line 57
    :cond_1
    return-void
.end method

.method public final g(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lw80/a;->e:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    iget-boolean v1, p0, Lw80/a;->g:Z

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput v0, p0, Lw80/a;->e:I

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    move-result p1

    .line 20
    .line 21
    iput-boolean p1, p0, Lw80/a;->g:Z

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public onGlobalLayout()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lw80/a;->f()V

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
