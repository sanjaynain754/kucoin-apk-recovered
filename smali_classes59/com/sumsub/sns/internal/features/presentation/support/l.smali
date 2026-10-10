.class public final Lcom/sumsub/sns/internal/features/presentation/support/l;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/support/l;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;
    .locals 4

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/support/k;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/support/l;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/h;->e:Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/support/l;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 17
    .line 18
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/support/l;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 27
    .line 28
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 29
    .line 30
    .line 31
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v1, v0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/support/k;-><init>(Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 38
    return-object p1
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
