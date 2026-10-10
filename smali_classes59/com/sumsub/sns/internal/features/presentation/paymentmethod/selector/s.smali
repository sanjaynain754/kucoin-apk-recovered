.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;)V
    .locals 7

    .line 1
    .line 2
    const-string v5, "fireOpenEventFor(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/PaymentMethodOption;)V"

    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;

    .line 7
    .line 8
    const-string v4, "fireOpenEventFor"

    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/a;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/l;

    .line 16
    .line 17
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/a;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/l;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p1

    .line 29
    .line 30
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 34
    throw p1
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
