.class public final Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;
.super Landroidx/dynamicanimation/animation/FloatPropertyCompat;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/dynamicanimation/animation/FloatPropertyCompat<",
        "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0004H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1",
        "Landroidx/dynamicanimation/animation/FloatPropertyCompat;",
        "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;",
        "getValue",
        "",
        "view",
        "setValue",
        "",
        "value",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->this$0:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "selectedItem"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V

    .line 9
    return-void
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
.method public getValue(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)F
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->this$0:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->access$getSelected$p(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)F

    move-result p1

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;)F
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->getValue(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)F

    move-result p1

    return p1
.end method

.method public setValue(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;F)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->this$0:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr p2, v0

    invoke-static {p1, p2}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->access$setSelected$p(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;F)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->this$0:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;->setValue(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;F)V

    return-void
.end method
