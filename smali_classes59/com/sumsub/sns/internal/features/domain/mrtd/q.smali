.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/q;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/domain/mrtd/r;

.field public final synthetic d:Landroid/nfc/tech/IsoDep;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/mrtd/r;Landroid/nfc/tech/IsoDep;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->c:Lcom/sumsub/sns/internal/features/domain/mrtd/r;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->d:Landroid/nfc/tech/IsoDep;

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

.method public static final a()Lkotlin/Unit;
    .locals 1

    .line 5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final a(Lkotlinx/coroutines/channels/m;Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader$State;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Lkotlinx/coroutines/channels/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    instance-of p1, p1, Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader$Result;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 3
    invoke-static {p0, v0, p1, v0}, Lkotlinx/coroutines/channels/p$a;->a(Lkotlinx/coroutines/channels/p;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 4
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->c:Lcom/sumsub/sns/internal/features/domain/mrtd/r;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->d:Landroid/nfc/tech/IsoDep;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/domain/mrtd/q;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/r;Landroid/nfc/tech/IsoDep;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->b:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/channels/m;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/mrtd/q;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->a:I

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lkotlinx/coroutines/channels/m;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->c:Lcom/sumsub/sns/internal/features/domain/mrtd/r;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/mrtd/r;->d:Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    move-object v3, v1

    .line 40
    .line 41
    check-cast v3, Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->d:Landroid/nfc/tech/IsoDep;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->c:Lcom/sumsub/sns/internal/features/domain/mrtd/r;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/mrtd/r;->c:Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 48
    .line 49
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/E2;->o:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/data/model/common/E2;->p:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/data/model/common/E2;->q:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v8, v1, Lcom/sumsub/sns/internal/features/data/model/common/E2;->n:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/mrtd/f0;

    .line 58
    .line 59
    .line 60
    invoke-direct {v10, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/f0;-><init>(Lkotlinx/coroutines/channels/m;)V

    .line 61
    .line 62
    const/16 v11, 0x20

    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v3 .. v12}, Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader$DefaultImpls;->start$default(Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader;Landroid/nfc/tech/IsoDep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 68
    .line 69
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/g0;

    .line 70
    .line 71
    .line 72
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/g0;-><init>()V

    .line 73
    .line 74
    iput v2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/q;->a:I

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/channels/ProduceKt;->a(Lkotlinx/coroutines/channels/m;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    if-ne p1, v0, :cond_2

    .line 81
    return-object v0

    .line 82
    .line 83
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    return-object p1
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
