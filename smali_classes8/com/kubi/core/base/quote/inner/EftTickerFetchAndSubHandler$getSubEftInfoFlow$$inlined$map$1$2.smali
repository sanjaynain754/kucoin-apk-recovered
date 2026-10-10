.class public final Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EftTickerFetchAndSubHandler.kt\ncom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler\n*L\n1#1,49:1\n50#2:50\n111#3,7:51\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->label:I

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
    iput v1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;-><init>(Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    iget-object p2, p0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 63
    move-object v2, p1

    .line 64
    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    const-string v2, "netAssetValue"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    const-string v4, "optString(...)"

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    new-instance v4, Ljava/math/BigDecimal;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_1

    .line 88
    :catch_0
    move-exception v2

    .line 89
    .line 90
    const-string v4, "getSubEftInfoFlow"

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v2}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 96
    .line 97
    const-string v4, "ONE"

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    const-string v2, "negate(...)"

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    iput-object v2, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    move-result-object v2

    .line 120
    .line 121
    iput-object v2, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    iput-object p1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    iput-object p1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 134
    const/4 p1, 0x0

    .line 135
    .line 136
    iput p1, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->I$0:I

    .line 137
    .line 138
    iput v3, v0, Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1;->label:I

    .line 139
    .line 140
    .line 141
    invoke-interface {p2, v4, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    if-ne p1, v1, :cond_3

    .line 145
    return-object v1

    .line 146
    .line 147
    :cond_3
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 148
    return-object p1
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
.end method
