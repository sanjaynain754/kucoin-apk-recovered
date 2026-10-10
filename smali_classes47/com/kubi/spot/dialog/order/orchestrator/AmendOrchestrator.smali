.class public final Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;
.super Ljava/lang/Object;
.source "AmendOrchestrator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J2\u0010\t\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;",
        "",
        "api",
        "Lcom/kubi/spot/dialog/order/AmendApi;",
        "spot",
        "Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;",
        "margin",
        "<init>",
        "(Lcom/kubi/spot/dialog/order/AmendApi;Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;)V",
        "amend",
        "Lkotlin/Result;",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/spot/dialog/order/model/AmendResult;",
        "ctx",
        "Lcom/kubi/spot/dialog/order/model/AmendContext;",
        "validationToken",
        "",
        "amend-0E7RQCE",
        "(Lcom/kubi/spot/dialog/order/model/AmendContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "SpotLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAmendOrchestrator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrchestrator.kt\ncom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/kubi/spot/dialog/order/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lv20/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lv20/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/spot/dialog/order/a;Lv20/a;Lv20/a;)V
    .locals 1
    .param p1    # Lcom/kubi/spot/dialog/order/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv20/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lv20/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spot"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "margin"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->a:Lcom/kubi/spot/dialog/order/a;

    .line 3
    iput-object p2, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->b:Lv20/a;

    .line 4
    iput-object p3, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->c:Lv20/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/spot/dialog/order/a;Lv20/a;Lv20/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lv20/c;

    invoke-direct {p2}, Lv20/c;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    new-instance p3, Lv20/b;

    invoke-direct {p3}, Lv20/b;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;-><init>(Lcom/kubi/spot/dialog/order/a;Lv20/a;Lv20/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kubi/spot/dialog/order/model/AmendContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lcom/kubi/spot/dialog/order/model/AmendContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/AmendContext;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/dialog/order/model/AmendResult;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->label:I

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
    iput v1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;-><init>(Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$7:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/kubi/spot/dialog/order/model/ValidationResult;

    .line 45
    .line 46
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$6:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 49
    .line 50
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$5:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;

    .line 53
    .line 54
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$4:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$3:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lu20/a;

    .line 61
    .line 62
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$2:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lv20/a;

    .line 65
    .line 66
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/kubi/spot/dialog/order/model/AmendContext;

    .line 73
    .line 74
    .line 75
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    throw p1

    .line 86
    .line 87
    :cond_2
    iget-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$6:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 90
    .line 91
    iget-object p2, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$5:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p2, Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;

    .line 94
    .line 95
    iget-object v2, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$4:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Ljava/util/List;

    .line 98
    .line 99
    iget-object v4, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, Lu20/a;

    .line 102
    .line 103
    iget-object v5, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$2:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Lv20/a;

    .line 106
    .line 107
    iget-object v6, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v6, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v7, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v7, Lcom/kubi/spot/dialog/order/model/AmendContext;

    .line 114
    .line 115
    .line 116
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 117
    move-object v10, v7

    .line 118
    move-object v7, p1

    .line 119
    move-object p1, v10

    .line 120
    move-object v10, v6

    .line 121
    move-object v6, p2

    .line 122
    move-object p2, v10

    .line 123
    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/kubi/spot/dialog/order/model/AmendContext;->getBizType()Lcom/kubi/tradebase/BizType;

    .line 131
    move-result-object p3

    .line 132
    .line 133
    sget-object v2, Lcom/kubi/tradebase/BizType;->MARGIN:Lcom/kubi/tradebase/BizType;

    .line 134
    .line 135
    if-ne p3, v2, :cond_4

    .line 136
    .line 137
    iget-object p3, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->c:Lv20/a;

    .line 138
    :goto_1
    move-object v5, p3

    .line 139
    goto :goto_2

    .line 140
    .line 141
    :cond_4
    iget-object p3, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->b:Lv20/a;

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :goto_2
    sget-object p3, Lu20/b;->a:Lu20/b;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/kubi/spot/dialog/order/model/AmendContext;->getOrderType()Lcom/kubi/tradebase/OrderType;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3, v2}, Lu20/b;->a(Lcom/kubi/tradebase/OrderType;)Lu20/a;

    .line 152
    move-result-object p3

    .line 153
    .line 154
    .line 155
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-interface {v5}, Lv20/a;->b()Ljava/util/List;

    .line 160
    move-result-object v6

    .line 161
    .line 162
    .line 163
    invoke-interface {v2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, p1}, Lu20/a;->a(Lcom/kubi/spot/dialog/order/model/AmendContext;)Ljava/util/List;

    .line 167
    move-result-object v6

    .line 168
    .line 169
    .line 170
    invoke-interface {v2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 171
    .line 172
    .line 173
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    .line 174
    move-result-object v2

    .line 175
    .line 176
    new-instance v6, Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;

    .line 177
    .line 178
    .line 179
    invoke-direct {v6, v2}, Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;-><init>(Ljava/util/List;)V

    .line 180
    .line 181
    sget-object v7, Lgf/n;->a:Lgf/n;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/kubi/spot/dialog/order/model/AmendContext;->getNewParams()Lcom/kubi/spot/dialog/order/model/AmendParams;

    .line 185
    move-result-object v8

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Lcom/kubi/spot/dialog/order/model/AmendParams;->getSymbol()Ljava/lang/String;

    .line 189
    move-result-object v8

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v8}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 193
    move-result-object v7

    .line 194
    .line 195
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object p2, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$1:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v5, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$2:Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    move-result-object v8

    .line 204
    .line 205
    iput-object v8, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$3:Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v8

    .line 210
    .line 211
    iput-object v8, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$4:Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    move-result-object v8

    .line 216
    .line 217
    iput-object v8, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$5:Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    move-result-object v8

    .line 222
    .line 223
    iput-object v8, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$6:Ljava/lang/Object;

    .line 224
    .line 225
    iput v4, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->label:I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, p1, v7, v0}, Lcom/kubi/spot/dialog/order/precheck/AmendValidatorChain;->a(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 229
    move-result-object v4

    .line 230
    .line 231
    if-ne v4, v1, :cond_5

    .line 232
    goto :goto_5

    .line 233
    :cond_5
    move-object v10, v4

    .line 234
    move-object v4, p3

    .line 235
    move-object p3, v10

    .line 236
    .line 237
    :goto_3
    check-cast p3, Lcom/kubi/spot/dialog/order/model/ValidationResult;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p3}, Lcom/kubi/spot/dialog/order/model/ValidationResult;->b()Z

    .line 241
    move-result v8

    .line 242
    const/4 v9, 0x0

    .line 243
    .line 244
    if-nez v8, :cond_6

    .line 245
    move-object v8, p3

    .line 246
    goto :goto_4

    .line 247
    :cond_6
    move-object v8, v9

    .line 248
    .line 249
    :goto_4
    if-eqz v8, :cond_8

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Lcom/kubi/spot/dialog/order/model/ValidationResult;->c()Z

    .line 253
    move-result p1

    .line 254
    .line 255
    if-eqz p1, :cond_7

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8}, Lcom/kubi/spot/dialog/order/model/ValidationResult;->a()Ljava/lang/String;

    .line 259
    move-result-object p1

    .line 260
    const/4 p2, 0x0

    .line 261
    .line 262
    new-array p2, p2, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_7
    invoke-static {v9}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    move-result-object p1

    .line 270
    return-object p1

    .line 271
    .line 272
    :cond_8
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 273
    .line 274
    iget-object v8, p0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;->a:Lcom/kubi/spot/dialog/order/a;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/kubi/spot/dialog/order/model/AmendContext;->getNewParams()Lcom/kubi/spot/dialog/order/model/AmendParams;

    .line 278
    move-result-object v9

    .line 279
    .line 280
    .line 281
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    move-result-object p1

    .line 283
    .line 284
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$0:Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    move-result-object p1

    .line 289
    .line 290
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$1:Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    move-result-object p1

    .line 295
    .line 296
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$2:Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    move-result-object p1

    .line 301
    .line 302
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$3:Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    move-result-object p1

    .line 307
    .line 308
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$4:Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    move-result-object p1

    .line 313
    .line 314
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$5:Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    move-result-object p1

    .line 319
    .line 320
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$6:Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    move-result-object p1

    .line 325
    .line 326
    iput-object p1, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->L$7:Ljava/lang/Object;

    .line 327
    .line 328
    iput v3, v0, Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator$amend$1;->label:I

    .line 329
    .line 330
    .line 331
    invoke-interface {v5, v8, v9, p2, v0}, Lv20/a;->a(Lcom/kubi/spot/dialog/order/a;Lcom/kubi/spot/dialog/order/model/AmendParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 332
    move-result-object p3

    .line 333
    .line 334
    if-ne p3, v1, :cond_9

    .line 335
    :goto_5
    return-object v1

    .line 336
    .line 337
    .line 338
    :cond_9
    :goto_6
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    move-result-object p1

    .line 340
    return-object p1
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method
