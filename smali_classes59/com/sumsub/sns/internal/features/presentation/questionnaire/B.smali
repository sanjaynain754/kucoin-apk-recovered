.class public final Lcom/sumsub/sns/internal/features/presentation/questionnaire/B;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/B;->a:Lkotlinx/coroutines/flow/f;

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;->b:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;->b:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/B;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;->b:I

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
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/B;->a:Lkotlinx/coroutines/flow/f;

    .line 56
    .line 57
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 58
    .line 59
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 60
    .line 61
    iget p1, p1, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    .line 62
    .line 63
    .line 64
    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 68
    .line 69
    if-eqz p1, :cond_8

    .line 70
    .line 71
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    move-result v2

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 88
    .line 89
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 94
    .line 95
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->k:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 96
    .line 97
    sget-object v4, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 98
    .line 99
    if-eq v2, v4, :cond_3

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_4
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 103
    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 107
    .line 108
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->l:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 109
    .line 110
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 111
    .line 112
    if-eq v4, v5, :cond_5

    .line 113
    goto :goto_1

    .line 114
    .line 115
    :cond_5
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->j:Ljava/util/List;

    .line 116
    .line 117
    .line 118
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    move-result-object v2

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    move-result v4

    .line 124
    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 132
    .line 133
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 134
    .line 135
    if-eq v4, v5, :cond_6

    .line 136
    goto :goto_1

    .line 137
    :cond_7
    move p1, v3

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    :goto_1
    const/4 p1, 0x0

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/A;->b:I

    .line 146
    .line 147
    .line 148
    invoke-interface {p2, p1, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-ne p1, v1, :cond_9

    .line 152
    return-object v1

    .line 153
    .line 154
    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 155
    return-object p1
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
