.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/camera/s;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lcom/sumsub/sns/internal/core/presentation/camera/j;)Ljava/lang/Object;
    .locals 0

    .line 3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 4
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->p:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;

    .line 5
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object p3

    if-nez p3, :cond_1

    :goto_0
    move-object v0, v1

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    move-result-object v2

    const/4 v3, 0x2

    .line 8
    new-array v4, v3, [I

    .line 9
    invoke-virtual {v0, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 10
    new-array v3, v3, [I

    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    const/4 v5, 0x0

    .line 13
    aget v6, v3, v5

    aget v7, v4, v5

    sub-int/2addr v6, v7

    iget v7, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    const/4 v7, 0x1

    .line 14
    aget v8, v3, v7

    aget v9, v4, v7

    sub-int/2addr v8, v9

    iget v9, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    int-to-float v8, v8

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 15
    aget v9, v3, v5

    aget v5, v4, v5

    sub-int/2addr v9, v5

    iget v5, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v5

    int-to-float v5, v9

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v5, v9

    .line 16
    aget v3, v3, v7

    aget v4, v4, v7

    sub-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    int-to-float v2, v3

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr v2, p3

    .line 17
    invoke-direct {v0, v6, v8, v5, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_1
    if-nez v0, :cond_2

    .line 18
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 19
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isResumed()Z

    move-result p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Capturing box is not available. Fragment added: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", resumed: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 20
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string p3, "Prooface"

    invoke-virtual {p2, p3, p1, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 24
    :cond_2
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 25
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 26
    invoke-interface {p3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 27
    iget p2, p2, Lcom/sumsub/sns/internal/core/presentation/camera/x;->a:F

    .line 28
    invoke-virtual {p3, p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)V

    .line 29
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final b()V
    .locals 2

    .line 2
    const-string/jumbo v0, "onPreviewReady()"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->p:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;

    .line 4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l()V

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 9
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k()V

    return-void
.end method

.method public final b(Ljava/io/File;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onError(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/data/model/prooface/E;-><init>(Ljava/lang/Exception;)V

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/Throwable;)V

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
