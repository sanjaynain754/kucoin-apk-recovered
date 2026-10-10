.class public final Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RankTopicDescriptors.kt\ncom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor\n*L\n1#1,49:1\n50#2:50\n168#3:51\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;-><init>(Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

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
    iget-object p2, p0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 63
    move-object v2, p1

    .line 64
    .line 65
    check-cast v2, Lcom/kucoin/discover/rankings/AlphaRankingItemsApp;

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lcom/kubi/quotefacade/rank/ws/e;->f(Lcom/kucoin/discover/rankings/AlphaRankingItemsApp;)Ljava/util/List;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    iput-object v4, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    iput-object v4, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    iput-object p1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iput-object p1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 94
    const/4 p1, 0x0

    .line 95
    .line 96
    iput p1, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->I$0:I

    .line 97
    .line 98
    iput v3, v0, Lcom/kubi/quotefacade/rank/ws/RankAlphaTopicDescriptor$createFlow$$inlined$map$1$2$1;->label:I

    .line 99
    .line 100
    .line 101
    invoke-interface {p2, v2, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    if-ne p1, v1, :cond_3

    .line 105
    return-object v1

    .line 106
    .line 107
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 108
    return-object p1
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
.end method
