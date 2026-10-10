.class public final Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/core/presentation/base/O;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->d:Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->d:Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->b:Ljava/lang/Object;

    .line 12
    return-object v0
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
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->a:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    goto :goto_4

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
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->b:Ljava/lang/Object;

    .line 41
    move-object v1, p1

    .line 42
    .line 43
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/i;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->d:Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;

    .line 52
    .line 53
    .line 54
    invoke-direct {v5, v6, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;Lkotlin/coroutines/Continuation;)V

    .line 55
    .line 56
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->b:Ljava/lang/Object;

    .line 57
    .line 58
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->a:I

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v5, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    if-ne p1, v0, :cond_3

    .line 65
    goto :goto_3

    .line 66
    .line 67
    :cond_3
    :goto_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 68
    .line 69
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 72
    .line 73
    iget-object v5, v5, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    .line 78
    const-string/jumbo v6, "sns_preview_general_action_confirm"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v5

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move-object v5, v4

    .line 85
    .line 86
    :goto_1
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 87
    .line 88
    iget-object v6, v6, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 89
    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    .line 93
    const-string/jumbo v7, "sns_preview_general_action_retake"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v7}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v6

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move-object v6, v4

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-direct {v3, p1, v5, v6}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/j;->a:I

    .line 107
    .line 108
    .line 109
    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-ne p1, v0, :cond_6

    .line 113
    :goto_3
    return-object v0

    .line 114
    .line 115
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    return-object p1
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
