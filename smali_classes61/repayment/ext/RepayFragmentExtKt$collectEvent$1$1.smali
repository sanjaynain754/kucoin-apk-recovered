.class public final Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;
.super Ljava/lang/Object;
.source "RepayFragmentExt.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrepayment/ext/RepayFragmentExtKt$collectEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# instance fields
.field public final synthetic b:Lrepayment/UnifiedRepayFragment;


# direct methods
.method public constructor <init>(Lrepayment/UnifiedRepayFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->b:Lrepayment/UnifiedRepayFragment;

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
.end method


# virtual methods
.method public final a(Lrepayment/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/c;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;

    .line 8
    .line 9
    iget v1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->label:I

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
    iput v1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;-><init>(Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->label:I

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
    iget-object p1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lrepayment/c;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    :cond_2
    iget-object p1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lrepayment/c;

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    instance-of p2, p1, Lrepayment/c$b;

    .line 70
    .line 71
    const-wide/16 v5, 0x1f4

    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    iget-object p2, p0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->b:Lrepayment/UnifiedRepayFragment;

    .line 78
    .line 79
    .line 80
    invoke-static {p2, v2, v4, v7}, Lcom/kubi/sdk/BaseFragment;->hideLoadingDialog$default(Lcom/kubi/sdk/BaseFragment;ZILjava/lang/Object;)V

    .line 81
    .line 82
    sget p2, Lcom/kubi/unify/R$string;->return_coin_success:I

    .line 83
    .line 84
    .line 85
    invoke-static {p2}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    iput-object p1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput v4, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->label:I

    .line 94
    .line 95
    .line 96
    invoke-static {v5, v6, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    if-ne p1, v1, :cond_4

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :cond_4
    :goto_1
    iget-object p1, p0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->b:Lrepayment/UnifiedRepayFragment;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

    .line 106
    goto :goto_4

    .line 107
    .line 108
    :cond_5
    instance-of p2, p1, Lrepayment/c$a;

    .line 109
    .line 110
    if-eqz p2, :cond_7

    .line 111
    .line 112
    iget-object p2, p0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->b:Lrepayment/UnifiedRepayFragment;

    .line 113
    .line 114
    .line 115
    invoke-static {p2, v2, v4, v7}, Lcom/kubi/sdk/BaseFragment;->hideLoadingDialog$default(Lcom/kubi/sdk/BaseFragment;ZILjava/lang/Object;)V

    .line 116
    move-object p2, p1

    .line 117
    .line 118
    check-cast p2, Lrepayment/c$a;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lrepayment/c$a;->a()Ljava/lang/Throwable;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v7, v3, v7}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Lrepayment/c$a;->b()Z

    .line 129
    move-result p2

    .line 130
    .line 131
    if-eqz p2, :cond_7

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    iput-object p1, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput v3, v0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1$emit$1;->label:I

    .line 140
    .line 141
    .line 142
    invoke-static {v5, v6, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    if-ne p1, v1, :cond_6

    .line 146
    :goto_2
    return-object v1

    .line 147
    .line 148
    :cond_6
    :goto_3
    iget-object p1, p0, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->b:Lrepayment/UnifiedRepayFragment;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

    .line 152
    .line 153
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 154
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lrepayment/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lrepayment/ext/RepayFragmentExtKt$collectEvent$1$1;->a(Lrepayment/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
