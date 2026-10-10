.class public final Lcom/sumsub/sns/core/presentation/base/r0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lkotlinx/coroutines/channels/f;

.field public b:Lkotlin/jvm/functions/Function2;

.field public c:I

.field public final synthetic d:Lcom/sumsub/sns/core/presentation/base/M0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

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
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/core/presentation/base/r0;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/core/presentation/base/r0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/core/presentation/base/r0;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/core/presentation/base/r0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/presentation/base/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->c:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    if-eq v1, v6, :cond_3

    .line 16
    .line 17
    if-eq v1, v5, :cond_2

    .line 18
    .line 19
    if-eq v1, v4, :cond_1

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1

    .line 36
    .line 37
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->b:Lkotlin/jvm/functions/Function2;

    .line 45
    .line 46
    iget-object v7, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    move-object v9, v7

    .line 51
    move-object v7, v1

    .line 52
    move-object v1, v9

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$getUpdateStateQueue$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/channels/d;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Lkotlinx/coroutines/channels/o;->iterator()Lkotlinx/coroutines/channels/f;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    :cond_5
    :goto_0
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 75
    .line 76
    iput-object v2, p0, Lcom/sumsub/sns/core/presentation/base/r0;->b:Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    iput v6, p0, Lcom/sumsub/sns/core/presentation/base/r0;->c:I

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, p0}, Lkotlinx/coroutines/channels/f;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-ne p1, v0, :cond_6

    .line 85
    goto :goto_4

    .line 86
    .line 87
    :cond_6
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    move-result p1

    .line 92
    .line 93
    if-eqz p1, :cond_a

    .line 94
    .line 95
    .line 96
    invoke-interface {v1}, Lkotlinx/coroutines/channels/f;->next()Ljava/lang/Object;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 100
    .line 101
    iget-object v7, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 102
    .line 103
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 104
    .line 105
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->b:Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    iput v5, p0, Lcom/sumsub/sns/core/presentation/base/r0;->c:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->awaitStringsReady(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    move-result-object v7

    .line 112
    .line 113
    if-ne v7, v0, :cond_7

    .line 114
    goto :goto_4

    .line 115
    :cond_7
    move-object v9, v7

    .line 116
    move-object v7, p1

    .line 117
    move-object p1, v9

    .line 118
    .line 119
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    move-result p1

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/m;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    .line 134
    invoke-interface {p1}, Lkotlinx/coroutines/flow/r;->a()Ljava/util/List;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/s;

    .line 142
    .line 143
    if-nez p1, :cond_8

    .line 144
    .line 145
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    :cond_8
    iget-object v8, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 152
    .line 153
    .line 154
    invoke-static {v8, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$assertStateNotNull(Lcom/sumsub/sns/core/presentation/base/M0;Lcom/sumsub/sns/core/presentation/base/s;)V

    .line 155
    .line 156
    if-eqz p1, :cond_5

    .line 157
    .line 158
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 159
    .line 160
    iput-object v2, p0, Lcom/sumsub/sns/core/presentation/base/r0;->b:Lkotlin/jvm/functions/Function2;

    .line 161
    .line 162
    iput v4, p0, Lcom/sumsub/sns/core/presentation/base/r0;->c:I

    .line 163
    .line 164
    .line 165
    invoke-interface {v7, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    if-ne p1, v0, :cond_9

    .line 169
    goto :goto_4

    .line 170
    .line 171
    :cond_9
    :goto_3
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/s;

    .line 172
    .line 173
    iget-object v7, p0, Lcom/sumsub/sns/core/presentation/base/r0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 174
    .line 175
    .line 176
    invoke-static {v7}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/m;

    .line 177
    move-result-object v7

    .line 178
    .line 179
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/r0;->a:Lkotlinx/coroutines/channels/f;

    .line 180
    .line 181
    iput v3, p0, Lcom/sumsub/sns/core/presentation/base/r0;->c:I

    .line 182
    .line 183
    .line 184
    invoke-interface {v7, p1, p0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    if-ne p1, v0, :cond_5

    .line 188
    :goto_4
    return-object v0

    .line 189
    .line 190
    :cond_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 191
    return-object p1
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
