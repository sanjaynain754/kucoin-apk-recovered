.class public final Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;",
        "onStateChanged",
        "",
        "bottomSheet",
        "Landroid/view/View;",
        "newState",
        "",
        "onSlide",
        "slideOffset",
        "",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSErrorBottomSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSErrorBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,129:1\n298#2,2:130\n*S KotlinDebug\n*F\n+ 1 SNSErrorBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1\n*L\n75#1:130,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1;->this$0:Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

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
.method public onSlide(Landroid/view/View;F)V
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1;->this$0:Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;->access$getBackgroundDrawable$p(Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;)Landroid/graphics/drawable/ColorDrawable;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const/16 v0, 0x80

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    add-float/2addr p2, v1

    .line 13
    mul-float/2addr p2, v0

    .line 14
    float-to-int p2, p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/ColorDrawable;->setAlpha(I)V

    .line 18
    return-void
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

.method public onStateChanged(Landroid/view/View;I)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView$3$1;->this$0:Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;

    .line 3
    const/4 v0, 0x5

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    const/16 p2, 0x8

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p2, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    return-void
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
