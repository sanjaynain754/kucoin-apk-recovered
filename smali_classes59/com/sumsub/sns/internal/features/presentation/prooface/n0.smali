.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/n0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/camera/s;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

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
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 5
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 6
    invoke-interface {p3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    move-result-object v1

    const/4 v2, 0x2

    .line 10
    new-array v3, v2, [I

    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 12
    new-array v2, v2, [I

    .line 13
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 14
    new-instance v4, Landroid/graphics/RectF;

    const/4 v5, 0x0

    .line 15
    aget v6, v2, v5

    aget v7, v3, v5

    sub-int/2addr v6, v7

    iget v7, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    const/4 v7, 0x1

    .line 16
    aget v8, v2, v7

    aget v9, v3, v7

    sub-int/2addr v8, v9

    iget v9, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    int-to-float v8, v8

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 17
    aget v9, v2, v5

    aget v5, v3, v5

    sub-int/2addr v9, v5

    iget v5, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v5

    int-to-float v5, v9

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v5, v9

    .line 18
    aget v2, v2, v7

    aget v3, v3, v7

    sub-int/2addr v2, v3

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v1

    int-to-float v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 19
    invoke-direct {v4, v6, v8, v5, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 20
    iget p2, p2, Lcom/sumsub/sns/internal/core/presentation/camera/x;->a:F

    .line 21
    invoke-virtual {p3, p1, v4, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)V

    .line 22
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
    const-string v0, "LivenessFragment: onPreviewReady"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;

    .line 6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->d()V

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 9
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/U0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/U0;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public final b(Ljava/io/File;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onError(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/n0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 11
    .line 12
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/R0;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/R0;-><init>(Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
