.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/country/picker/e;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;

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
.method public final onDismiss()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/y;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 16
    return-void
    .line 17
.end method

.method public final onItemSelected(Lcom/sumsub/sns/internal/features/presentation/country/b;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 11
    .line 12
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/b;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
