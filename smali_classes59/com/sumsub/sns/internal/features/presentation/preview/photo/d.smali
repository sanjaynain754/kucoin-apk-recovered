.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/d;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

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
    .line 24
    .line 25
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/d;ILcom/sumsub/sns/internal/features/presentation/preview/photo/b;Landroid/view/View;)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/d;->a:Lkotlin/jvm/functions/Function2;

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(ILcom/sumsub/sns/internal/features/presentation/preview/photo/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/sumsub/sns/R$id;->sns_photo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/b;->a:Landroid/graphics/Bitmap;

    .line 3
    iget v3, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/b;->c:I

    .line 4
    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->setImageBitmapWithRotation(Landroid/graphics/Bitmap;I)V

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    if-eqz v0, :cond_1

    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/d0;

    invoke-direct {v1, p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/d;ILcom/sumsub/sns/internal/features/presentation/preview/photo/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method
