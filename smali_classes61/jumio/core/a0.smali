.class public final Ljumio/core/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Lcom/jumio/commons/camera/CameraManagerInterface;

.field public e:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/a0;->e:Landroid/view/View;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-object v0, p0, Ljumio/core/a0;->e:Landroid/view/View;

    .line 17
    .line 18
    iput-object v0, p0, Ljumio/core/a0;->d:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public final onGlobalLayout()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/a0;->e:Landroid/view/View;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Landroidx/core/content/ContextCompat;->getDisplayOrDefault(Landroid/content/Context;)Landroid/view/Display;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    .line 16
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 22
    move-result v2

    .line 23
    .line 24
    iget v3, p0, Ljumio/core/a0;->b:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 30
    move-result v2

    .line 31
    .line 32
    iget v3, p0, Ljumio/core/a0;->a:I

    .line 33
    .line 34
    if-eq v2, v3, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_0
    iget v2, p0, Ljumio/core/a0;->c:I

    .line 41
    .line 42
    if-eq v1, v2, :cond_1

    .line 43
    .line 44
    iget-object v2, p0, Ljumio/core/a0;->d:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Lcom/jumio/commons/camera/CameraManagerInterface;->reinitCamera()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 53
    move-result v2

    .line 54
    .line 55
    iput v2, p0, Ljumio/core/a0;->a:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 59
    move-result v0

    .line 60
    .line 61
    iput v0, p0, Ljumio/core/a0;->b:I

    .line 62
    .line 63
    iput v1, p0, Ljumio/core/a0;->c:I

    .line 64
    :cond_2
    return-void
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
