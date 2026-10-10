.class public final Lcom/sumsub/sns/internal/features/domain/o;
.super Lcom/sumsub/sns/internal/core/domain/base/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/cache/b;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->p:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/cache/b;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/sumsub/sns/internal/core/domain/base/a;-><init>()V

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/o;->a:Lcom/sumsub/sns/internal/features/data/repository/cache/b;

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
.end method
