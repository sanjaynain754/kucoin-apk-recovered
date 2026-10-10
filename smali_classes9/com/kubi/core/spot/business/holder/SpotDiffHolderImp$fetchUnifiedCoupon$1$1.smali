.class final Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SpotDiffHolderImp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlinx/coroutines/flow/f<",
        "-",
        "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;",
        ">;",
        "Ljava/lang/Throwable;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;",
        "it",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1$1"
    f = "SpotDiffHolderImp.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $baseOrderHolder:Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

.field final synthetic $prizeType:I

.field final synthetic $requestKey:Ljava/lang/String;

.field final synthetic $symbol:Ljava/lang/String;

.field final synthetic $userId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;


# direct methods
.method public constructor <init>(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/kubi/core/spot/business/holder/BaseOrderHolder;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$requestKey:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$prizeType:I

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$symbol:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$userId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$baseOrderHolder:Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 13
    const/4 p1, 0x3

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 17
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/f;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->invoke(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/f<",
            "-",
            "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;",
            ">;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;

    iget-object v1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;

    iget-object v2, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$requestKey:Ljava/lang/String;

    iget v3, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$prizeType:I

    iget-object v4, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$symbol:Ljava/lang/String;

    iget-object v5, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$userId:Ljava/lang/String;

    iget-object v6, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$baseOrderHolder:Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;-><init>(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/kubi/core/spot/business/holder/BaseOrderHolder;Lkotlin/coroutines/Continuation;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->label:I

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;->F(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$requestKey:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;->H(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;Ljava/lang/String;)V

    .line 31
    .line 32
    :cond_0
    sget-object p1, Lcom/kubi/core/biz/coupon/UnifiedCouponRepository;->a:Lcom/kubi/core/biz/coupon/UnifiedCouponRepository;

    .line 33
    .line 34
    iget v0, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$prizeType:I

    .line 35
    .line 36
    iget-object v1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$symbol:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$userId:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1, v2}, Lcom/kubi/core/biz/coupon/UnifiedCouponRepository;->f(ILjava/lang/String;Ljava/lang/String;)Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->this$0:Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;->E(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;)Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp$fetchUnifiedCoupon$1$1;->$baseOrderHolder:Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-static {p1, v0}, Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;->G(Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;Lcom/kubi/core/spot/business/holder/BaseOrderHolder;)V

    .line 58
    .line 59
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 60
    return-object p1

    .line 61
    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1
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
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
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
.end method
