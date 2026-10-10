.class public final Ljumio/core/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroidx/appcompat/widget/AppCompatImageView;

.field public final b:I


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatImageView;I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    iput-object p1, p0, Ljumio/core/i0;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    iput p2, p0, Ljumio/core/i0;->b:I

    .line 14
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/i0;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    .line 4
    sget v1, Lcom/jumio/core/R$id;->liveness_overlay_main:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->access$layerDrawable(Landroid/widget/ImageView;I)Landroid/graphics/drawable/Drawable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Ljumio/core/i0;->b:I

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->setColor(Landroid/graphics/drawable/Drawable;I)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
