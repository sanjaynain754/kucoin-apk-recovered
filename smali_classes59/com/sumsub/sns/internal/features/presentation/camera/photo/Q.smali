.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->V:I

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "sns_step_%s_selector_ekyc_separator"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;-><init>(Ljava/lang/String;)V

    .line 15
    return-object v0
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

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Landroid/text/Spanned;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->d:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "sns_step_%s_selector_iddoc_listIsEmpty"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    :cond_0
    check-cast v0, Lcom/sumsub/sns/internal/core/domain/d;

    .line 16
    .line 17
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 23
    move-result-object p0

    .line 24
    return-object p0
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
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->b:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->a:I

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
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 35
    .line 36
    sget v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->V:I

    .line 37
    .line 38
    .line 39
    const-string/jumbo v4, "sns_step_%s_selector_iddoc_prompt"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v7

    .line 44
    .line 45
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 48
    .line 49
    .line 50
    const-string/jumbo v4, "sns_step_%s_selector_iddoc_prompt_short"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v8

    .line 55
    .line 56
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 59
    .line 60
    .line 61
    const-string/jumbo v4, "sns_step_%s_selector_ekyc_prompt"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v6

    .line 66
    .line 67
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 68
    .line 69
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 70
    .line 71
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x0;

    .line 72
    .line 73
    .line 74
    invoke-direct {v4, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 78
    move-result-object v10

    .line 79
    .line 80
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 81
    .line 82
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 83
    .line 84
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/y0;

    .line 85
    .line 86
    .line 87
    invoke-direct {v4, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 91
    move-result-object v9

    .line 92
    .line 93
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 94
    .line 95
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/o0;

    .line 96
    .line 97
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->n:Lcom/sumsub/sns/internal/features/presentation/camera/photo/r0;

    .line 98
    .line 99
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->p:Lkotlinx/coroutines/flow/w;

    .line 100
    .line 101
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/P;

    .line 102
    const/4 v11, 0x0

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/P;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/coroutines/Continuation;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v4, v1, v5}, Lkotlinx/coroutines/flow/g;->n(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/e;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;->a:I

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/g;->B(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    if-ne p1, v0, :cond_2

    .line 118
    return-object v0

    .line 119
    .line 120
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    return-object p1
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
