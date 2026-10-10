.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->b:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/v;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->a:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

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
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    goto :goto_4

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/v;

    .line 35
    .line 36
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/u;

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 42
    .line 43
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/u;

    .line 44
    .line 45
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/camera/u;->a:Landroidx/camera/core/ImageProxy;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/u;->b:Lcom/sumsub/sns/internal/core/presentation/camera/x;

    .line 48
    .line 49
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->a:I

    .line 50
    .line 51
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B;

    .line 58
    .line 59
    .line 60
    invoke-direct {v5, v1, v2, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/Continuation;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v5, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_1
    if-ne p1, v0, :cond_6

    .line 76
    goto :goto_3

    .line 77
    .line 78
    :cond_4
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/t;

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 83
    .line 84
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/t;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/t;->a:Landroid/graphics/Bitmap;

    .line 87
    .line 88
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;->a:I

    .line 89
    .line 90
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C;

    .line 97
    .line 98
    .line 99
    invoke-direct {v3, v1, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    if-ne p1, v1, :cond_5

    .line 110
    goto :goto_2

    .line 111
    .line 112
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_2
    if-ne p1, v0, :cond_6

    .line 115
    :goto_3
    return-object v0

    .line 116
    .line 117
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    return-object p1

    .line 119
    .line 120
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 121
    .line 122
    .line 123
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 124
    throw p1
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
