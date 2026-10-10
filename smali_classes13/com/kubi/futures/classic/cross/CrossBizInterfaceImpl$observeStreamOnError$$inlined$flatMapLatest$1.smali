.class public final Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Merge.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl;->X(Z)Lkotlinx/coroutines/flow/e;
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
        "Lci/e;",
        ">;",
        "Ljava/lang/Boolean;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n\u00a8\u0006\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "R",
        "T",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "it",
        "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"
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
    c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1"
    f = "CrossBizInterfaceImpl.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "$this$transformLatest",
        "it"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,189:1\n155#2,2:190\n168#2,2:197\n49#3:192\n51#3:196\n46#4:193\n51#4:195\n105#5:194\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n*L\n156#1:192\n156#1:196\n156#1:193\n156#1:195\n156#1:194\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $manager$inlined:Lih/v;

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lih/v;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->$manager$inlined:Lih/v;

    .line 3
    const/4 p2, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/f;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->invoke(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/f<",
            "-",
            "Lci/e;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->$manager$inlined:Lih/v;

    invoke-direct {v0, p3, v1}, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lih/v;)V

    iput-object p1, v0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lkotlinx/coroutines/flow/f;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    iget-object p1, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    .line 37
    move-object v3, v1

    .line 38
    .line 39
    check-cast v3, Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    move-result v3

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    iget-object v3, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->$manager$inlined:Lih/v;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lih/v;->D()Lkotlinx/coroutines/flow/w;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    new-instance v4, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$lambda$22$$inlined$map$1;

    .line 58
    .line 59
    .line 60
    invoke-direct {v4, v3}, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$lambda$22$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v3, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    iput-object v3, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    iput-object v1, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput v2, p0, Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl$observeStreamOnError$$inlined$flatMapLatest$1;->label:I

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v4, p0}, Lkotlinx/coroutines/flow/g;->B(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-ne p1, v0, :cond_3

    .line 87
    return-object v0

    .line 88
    .line 89
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    return-object p1
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
.end method
