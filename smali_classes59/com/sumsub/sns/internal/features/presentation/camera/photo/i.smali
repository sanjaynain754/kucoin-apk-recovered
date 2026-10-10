.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->b:Ljava/lang/Object;

    .line 10
    return-object v0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->a:I

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
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    throw p1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ljava/util/List;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->b:Ljava/lang/String;

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    move-result v5

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v5

    .line 53
    move-object v6, v5

    .line 54
    .line 55
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 56
    .line 57
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    move-result v6

    .line 62
    .line 63
    if-eqz v6, :cond_2

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move-object v5, v3

    .line 66
    .line 67
    :goto_0
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    move-object v5, v3

    .line 70
    .line 71
    :goto_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    move-result v6

    .line 80
    .line 81
    if-eqz v6, :cond_7

    .line 82
    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    move-result-object v6

    .line 86
    move-object v7, v6

    .line 87
    .line 88
    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 89
    .line 90
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v8, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->i:Lkotlinx/coroutines/flow/w;

    .line 93
    .line 94
    .line 95
    invoke-interface {v8}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 96
    move-result-object v8

    .line 97
    .line 98
    check-cast v8, Lcom/sumsub/sns/internal/features/domain/n;

    .line 99
    .line 100
    if-eqz v8, :cond_6

    .line 101
    .line 102
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    .line 103
    goto :goto_2

    .line 104
    :cond_6
    move-object v8, v3

    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    move-result v7

    .line 109
    .line 110
    if-eqz v7, :cond_5

    .line 111
    goto :goto_3

    .line 112
    :cond_7
    move-object v6, v3

    .line 113
    .line 114
    :goto_3
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 121
    .line 122
    if-nez v5, :cond_9

    .line 123
    .line 124
    if-nez v6, :cond_8

    .line 125
    move-object v5, p1

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    move-object v5, v6

    .line 128
    .line 129
    :cond_9
    :goto_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 130
    .line 131
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->l:Lkotlinx/coroutines/flow/n;

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, v5}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    if-eqz v5, :cond_a

    .line 137
    .line 138
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-interface {p1}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/h;

    .line 149
    .line 150
    .line 151
    invoke-direct {v1, v5, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/b;Lkotlin/coroutines/Continuation;)V

    .line 152
    .line 153
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;->a:I

    .line 154
    .line 155
    .line 156
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 157
    move-result-object p1

    .line 158
    .line 159
    if-ne p1, v0, :cond_a

    .line 160
    return-object v0

    .line 161
    .line 162
    :cond_a
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 163
    return-object p1
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
