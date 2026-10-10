.class public final Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/navigation/v;

.field public b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

.field public final c:Lkotlinx/coroutines/flow/m;

.field public final d:Lkotlinx/coroutines/flow/r;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/navigation/v;Lcom/sumsub/sns/internal/features/presentation/main/navigation/u;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/v;

    .line 6
    .line 7
    sget-object p1, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 8
    const/4 p2, 0x1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, p1, p2, v0}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->b(Lkotlinx/coroutines/flow/m;)Lkotlinx/coroutines/flow/r;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->d:Lkotlinx/coroutines/flow/r;

    .line 25
    return-void
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/domain/navigation/model/C;Lcom/sumsub/sns/internal/features/domain/navigation/model/C;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;

    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 77
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/t;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->b:Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->a:Ljava/lang/Object;

    check-cast p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    iget-object p4, p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    .line 79
    iget-object v2, p4, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 80
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    if-eqz v8, :cond_13

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    .line 81
    new-instance p4, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-interface {v2}, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;->a()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v8

    invoke-direct {p4, v8, v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 82
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/e;

    if-eqz v8, :cond_6

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/o;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/o;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 83
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 84
    :cond_6
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/h;

    if-eqz v8, :cond_7

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/u;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/u;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 85
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 86
    :cond_7
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/j;

    if-eqz v8, :cond_8

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/w;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/w;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 87
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 88
    :cond_8
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/i;

    if-eqz v8, :cond_9

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/I;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/I;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 89
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 90
    :cond_9
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/m;

    if-eqz v8, :cond_c

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/m;

    .line 91
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/m;->b:Ljava/lang/String;

    .line 92
    const-string v8, "enabled"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/O;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/O;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 93
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 94
    :cond_a
    const-string/jumbo v8, "photoRequired"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/K;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/K;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 95
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 96
    :cond_b
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/E;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 97
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 98
    :cond_c
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/k;

    if-eqz v8, :cond_e

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/k;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/domain/navigation/model/k;->b()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 99
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/C;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/C;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 100
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 101
    :cond_d
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/Q;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 102
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 103
    :cond_e
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/g;

    if-eqz v8, :cond_f

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/A;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/A;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 104
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 105
    :cond_f
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/f;

    if-eqz v8, :cond_10

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/y;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 106
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 107
    :cond_10
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/l;

    if-eqz v8, :cond_11

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/main/T;

    .line 108
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/l;

    .line 109
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/l;->b:Ljava/lang/String;

    .line 110
    invoke-direct {v8, p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/T;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;)V

    .line 111
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v8}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 112
    :cond_11
    instance-of p4, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/n;

    if-eqz p4, :cond_12

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    goto/16 :goto_2

    .line 113
    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 114
    :cond_13
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/w;

    if-eqz v8, :cond_15

    .line 115
    const-string v2, "com.sumsub.sns.videoident.BuildConfig"

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_14

    .line 116
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/p;

    .line 117
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 118
    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/p;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    :goto_1
    move-object p4, v2

    goto/16 :goto_2

    .line 119
    :cond_14
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/X;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/X;-><init>(Ljava/util/List;)V

    .line 120
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_1

    .line 121
    :cond_15
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/r;

    if-eqz v8, :cond_16

    .line 122
    new-instance p4, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/X;

    const-string v8, "SELFIE"

    invoke-direct {v2, v8}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    invoke-direct {p4, v2, v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 123
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/E;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 124
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto/16 :goto_2

    .line 125
    :cond_16
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/d;

    if-eqz v8, :cond_17

    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/main/m;->c:Lcom/sumsub/sns/internal/features/presentation/main/m;

    .line 126
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_1

    .line 127
    :cond_17
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/y;

    if-eqz v8, :cond_18

    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    .line 128
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_1

    .line 129
    :cond_18
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/s;

    if-eqz v8, :cond_19

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    goto :goto_2

    .line 130
    :cond_19
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/v;

    if-eqz v8, :cond_1a

    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    .line 131
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_1

    .line 132
    :cond_1a
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/u;

    if-eqz v8, :cond_1b

    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    .line 133
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_1

    .line 134
    :cond_1b
    instance-of v8, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/p;

    if-eqz v8, :cond_1d

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/V;

    .line 135
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/B;

    .line 136
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/domain/navigation/model/B;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    if-nez p4, :cond_1c

    .line 137
    new-instance p4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    invoke-direct {p4}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;-><init>()V

    .line 138
    :cond_1c
    invoke-direct {v2, p4}, Lcom/sumsub/sns/internal/features/presentation/main/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;)V

    .line 139
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    goto :goto_2

    .line 140
    :cond_1d
    instance-of p4, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/x;

    if-eqz p4, :cond_1e

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    goto :goto_2

    .line 141
    :cond_1e
    instance-of p4, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/q;

    if-eqz p4, :cond_1f

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    goto :goto_2

    .line 142
    :cond_1f
    instance-of p4, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/t;

    if-eqz p4, :cond_29

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;

    invoke-direct {p4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/q;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)V

    .line 143
    :goto_2
    instance-of v2, p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    if-eqz v2, :cond_25

    if-eqz p1, :cond_20

    .line 144
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    goto :goto_3

    :cond_20
    move-object v2, v7

    :goto_3
    if-eqz p1, :cond_21

    .line 145
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->e:Lcom/sumsub/sns/internal/features/domain/navigation/model/a;

    if-eqz p1, :cond_21

    .line 146
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/navigation/model/a;->a:Ljava/lang/String;

    goto :goto_4

    :cond_21
    move-object p1, v7

    .line 147
    :goto_4
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->a:Ljava/lang/Object;

    move-object v3, p4

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->b:Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    invoke-virtual {p0, v2, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/c;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/main/navigation/g;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_22

    goto :goto_9

    :cond_22
    move-object p1, p4

    .line 148
    :goto_5
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    .line 149
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->b:Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/c;Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_23

    goto :goto_9

    .line 150
    :cond_23
    :goto_6
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/navigation/b;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;

    .line 151
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/s;->a:Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 152
    invoke-direct {p3, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    invoke-interface {p2, p3, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_24

    goto :goto_9

    .line 153
    :cond_24
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 154
    :cond_25
    instance-of p1, p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/r;

    if-eqz p1, :cond_28

    .line 155
    check-cast p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/r;

    invoke-interface {p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/r;->a()Ljava/lang/Exception;

    move-result-object p1

    .line 156
    invoke-interface {p4}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/r;->getType()Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    move-result-object p2

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/domain/navigation/model/D;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p2

    .line 157
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 158
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;->e:I

    .line 159
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;

    invoke-direct {p4, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3, p4, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_26

    goto :goto_8

    :cond_26
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_8
    if-ne p1, v1, :cond_27

    :goto_9
    return-object v1

    .line 160
    :cond_27
    :goto_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 161
    :cond_28
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 162
    :cond_29
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/navigation/model/c;Lcom/sumsub/sns/internal/features/presentation/main/navigation/g;)Ljava/lang/Object;
    .locals 4

    .line 12
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->c:Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    if-nez p1, :cond_0

    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step initiated: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 16
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 17
    const-string v2, "ServerNavigationRouter"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/e;

    invoke-interface {p1}, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/navigation/model/c;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/main/navigation/g;)Ljava/lang/Object;
    .locals 4

    if-eqz p1, :cond_2

    .line 1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->c:Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step completed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", levelName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isCancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    const-string v2, "ServerNavigationRouter"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;

    .line 8
    invoke-interface {p1}, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;->getType()Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-direct {v1, p1, p3, p2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 10
    invoke-interface {v0, v1, p4}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 11
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/main/L1;)Ljava/lang/Object;
    .locals 4

    .line 73
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 74
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 75
    const-string v1, "ServerNavigationRouter"

    const-string/jumbo v2, "navigateBack"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/j;

    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/main/navigation/ServerNavigationRouter$ReinitReason;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reinitializing navigation state due to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 41
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 42
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 43
    const-string v1, "ServerNavigationRouter"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/m;

    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "ServerNavigationRouter"

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string v2, "init: requesting full state"

    invoke-virtual {p1, v5, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/v;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->d:I

    invoke-virtual {p1, v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/navigation/v;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    .line 24
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    .line 25
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    .line 26
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 27
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->c:Ljava/lang/String;

    .line 28
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "init: success, step="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", version="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 29
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 30
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 31
    invoke-virtual {v7, v5, v6, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    .line 33
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->d:Lcom/sumsub/sns/internal/features/domain/navigation/model/A;

    .line 34
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/h;->d:I

    if-nez v2, :cond_5

    .line 35
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    .line 36
    :cond_5
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/navigation/c;

    invoke-direct {v4, v2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/c;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/A;)V

    invoke-interface {v3, v4, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_6

    goto :goto_2

    :cond_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v0, p1

    .line 37
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 38
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to init server navigation: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    :cond_8
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 45
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->a:Z

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    check-cast p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_4
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->a:Z

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    check-cast p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    if-eqz p3, :cond_6

    .line 47
    iget-object v2, p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    goto :goto_1

    :cond_6
    move-object v2, v7

    :goto_1
    if-eqz p3, :cond_7

    .line 48
    iget-object v8, p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->c:Ljava/lang/String;

    goto :goto_2

    :cond_7
    move-object v8, v7

    .line 49
    :goto_2
    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->a:Z

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    invoke-interface {p2, v8, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto/16 :goto_9

    :cond_8
    move-object v11, p3

    move-object p3, p2

    move-object p2, v2

    move-object v2, v11

    :goto_3
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    const-string v8, "ServerNavigationRouter"

    if-nez v6, :cond_e

    check-cast p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    if-eqz p2, :cond_9

    .line 50
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    goto :goto_4

    :cond_9
    move-object p2, v7

    .line 51
    :goto_4
    iget-object v5, p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/c;

    .line 52
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 53
    iget-object v6, p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->c:Ljava/lang/String;

    .line 54
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v10, "navigate: success, from="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to="

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", version="

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 55
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 56
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    invoke-virtual {v5, v8, p2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    .line 59
    iget-object p2, p3, Lcom/sumsub/sns/internal/features/domain/navigation/model/C;->d:Lcom/sumsub/sns/internal/features/domain/navigation/model/A;

    .line 60
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->a:Z

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    if-nez p2, :cond_a

    .line 61
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_5

    .line 62
    :cond_a
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/main/navigation/c;

    invoke-direct {v5, p2}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/c;-><init>(Lcom/sumsub/sns/internal/features/domain/navigation/model/A;)V

    invoke-interface {v4, v5, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne p2, v4, :cond_b

    goto :goto_5

    :cond_b
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_5
    if-ne p2, v1, :cond_c

    goto :goto_9

    :cond_c
    move-object p2, p3

    .line 63
    :goto_6
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    invoke-virtual {p0, v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/C;Lcom/sumsub/sns/internal/features/domain/navigation/model/C;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_9

    .line 64
    :cond_d
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 65
    :cond_e
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Navigation error: "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v8, p1, v6}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_f

    .line 66
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/domain/navigation/model/c;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/z;

    .line 67
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/domain/navigation/model/D;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    .line 68
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-nez p1, :cond_10

    .line 69
    :cond_f
    const-string p1, "TYPE_UNKNOWN"

    .line 70
    :cond_10
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->c:Ljava/lang/Object;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/i;->f:I

    .line 71
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->c:Lkotlinx/coroutines/flow/m;

    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;

    invoke-direct {p3, p1, v6}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p2, p3, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_11

    goto :goto_8

    :cond_11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_8
    if-ne p1, v1, :cond_12

    :goto_9
    return-object v1

    .line 72
    :cond_12
    :goto_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;->c:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    .line 58
    .line 59
    const-string/jumbo v2, "postInit: applying navigation state"

    .line 60
    .line 61
    const-string v4, "ServerNavigationRouter"

    .line 62
    const/4 v5, 0x0

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v4, v2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->b:Lcom/sumsub/sns/internal/features/domain/navigation/model/C;

    .line 68
    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    new-instance p1, Ljava/lang/Exception;

    .line 72
    .line 73
    const-string v0, "Failed to apply navigation state, navigation not initialized"

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    const-string v2, "Post init error: "

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-static {v4, v0, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_3
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/navigation/l;->c:I

    .line 114
    const/4 v2, 0x0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v5, p1, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->a(Lcom/sumsub/sns/internal/features/domain/navigation/model/C;Lcom/sumsub/sns/internal/features/domain/navigation/model/C;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    if-ne p1, v1, :cond_4

    .line 121
    return-object v1

    .line 122
    .line 123
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 124
    .line 125
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    move-result-object p1

    .line 130
    return-object p1
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
