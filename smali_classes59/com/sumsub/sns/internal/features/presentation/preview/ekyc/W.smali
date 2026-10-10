.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->b:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->a:I

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
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 22
    goto :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    goto :goto_1

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 44
    .line 45
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->a:I

    .line 46
    .line 47
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 48
    .line 49
    instance-of v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 p1, 0x0

    .line 56
    .line 57
    :goto_0
    if-nez p1, :cond_4

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    :cond_4
    if-ne p1, v0, :cond_5

    .line 64
    goto :goto_2

    .line 65
    .line 66
    :cond_5
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 69
    .line 70
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->a:I

    .line 73
    .line 74
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 75
    .line 76
    const-wide/16 v2, 0x3c

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2, v3, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    if-ne v1, v0, :cond_6

    .line 83
    :goto_2
    return-object v0

    .line 84
    :cond_6
    move-object v0, p1

    .line 85
    move-object p1, v1

    .line 86
    :goto_3
    move-object v1, p1

    .line 87
    .line 88
    check-cast v1, Ljava/lang/CharSequence;

    .line 89
    .line 90
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 91
    .line 92
    const-wide/16 v3, 0x0

    .line 93
    .line 94
    const/16 v6, 0x1b

    .line 95
    const/4 v2, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;Ljava/lang/CharSequence;Ljava/lang/String;JLcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;I)Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 99
    move-result-object p1

    .line 100
    return-object p1
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
