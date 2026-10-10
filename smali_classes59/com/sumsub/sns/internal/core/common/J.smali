.class public abstract Lcom/sumsub/sns/internal/core/common/J;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(ZLxg0/d;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lxg0/d;->e(Z)V

    .line 3
    invoke-virtual {p1, v0}, Lxg0/d;->d(Z)V

    .line 4
    invoke-virtual {p1, p0}, Lxg0/d;->f(Z)V

    .line 5
    new-instance p0, Lkotlinx/serialization/modules/c;

    invoke-direct {p0}, Lkotlinx/serialization/modules/c;-><init>()V

    .line 6
    const-class v1, Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/sumsub/sns/internal/core/data/serializer/c;->a:Lcom/sumsub/sns/internal/core/data/serializer/c;

    invoke-virtual {p0, v1, v2}, Lkotlinx/serialization/modules/c;->b(Lkotlin/reflect/KClass;Ltg0/d;)V

    .line 7
    const-class v1, Ljava/util/Date;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    sget-object v2, Lcom/sumsub/sns/internal/core/data/serializer/a;->a:Lcom/sumsub/sns/internal/core/data/serializer/a;

    invoke-virtual {p0, v1, v2}, Lkotlinx/serialization/modules/c;->b(Lkotlin/reflect/KClass;Ltg0/d;)V

    .line 8
    invoke-virtual {p0}, Lkotlinx/serialization/modules/c;->f()Lyg0/a;

    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Lxg0/d;->g(Lyg0/a;)V

    .line 10
    invoke-virtual {p1, v0}, Lxg0/d;->c(Z)V

    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Z)Lxg0/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/core/common/g1;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/common/g1;-><init>(Z)V

    const/4 p0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p0}, Lxg0/t;->b(Lxg0/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lxg0/a;

    move-result-object p0

    return-object p0
.end method
