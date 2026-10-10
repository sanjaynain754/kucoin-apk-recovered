.class public final Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;->b:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->b:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->b:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->b:I

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
    .line 43
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_4

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1

    .line 53
    .line 54
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->c:Lkotlinx/coroutines/flow/f;

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    check-cast p2, Lkotlin/Result;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 63
    move-result-object p2

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;->a:Lkotlinx/coroutines/flow/f;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/y;->b:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 74
    .line 75
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->c:Lcom/sumsub/sns/internal/features/domain/U;

    .line 76
    .line 77
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->c:Lkotlinx/coroutines/flow/f;

    .line 78
    .line 79
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->b:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p1, v0}, Lcom/sumsub/sns/internal/features/domain/U;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    if-ne p1, v1, :cond_4

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    move-object v6, p2

    .line 88
    move-object p2, p1

    .line 89
    move-object p1, v6

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 93
    move-result v2

    .line 94
    const/4 v4, 0x0

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    move-object v2, v4

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move-object v2, p2

    .line 100
    .line 101
    :goto_2
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/S;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->c:Lkotlinx/coroutines/flow/f;

    .line 106
    .line 107
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/x;->b:I

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    if-ne p1, v1, :cond_6

    .line 114
    :goto_3
    return-object v1

    .line 115
    .line 116
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 117
    return-object p1

    .line 118
    .line 119
    :cond_7
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 123
    move-result-object v3

    .line 124
    const/4 v4, 0x2

    .line 125
    const/4 v5, 0x0

    .line 126
    .line 127
    const-string v1, "Failed loading questionnaire."

    .line 128
    const/4 v2, 0x0

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 132
    throw v0
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
.end method
