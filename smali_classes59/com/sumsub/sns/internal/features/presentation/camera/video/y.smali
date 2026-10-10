.class public final Lcom/sumsub/sns/internal/features/presentation/camera/video/y;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

.field public b:Ljava/lang/CharSequence;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->c:I

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->b:Ljava/lang/CharSequence;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;

    .line 52
    .line 53
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 54
    .line 55
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 56
    .line 57
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 60
    .line 61
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->c:I

    .line 62
    .line 63
    .line 64
    const-string/jumbo v2, "sns_step_SELFIE_recording_header"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    if-ne v2, v0, :cond_3

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v6, v2

    .line 73
    move-object v2, p1

    .line 74
    move-object p1, v6

    .line 75
    .line 76
    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 77
    .line 78
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->e:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 79
    .line 80
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->d:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 83
    .line 84
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->b:Ljava/lang/CharSequence;

    .line 85
    .line 86
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/y;->c:I

    .line 87
    .line 88
    .line 89
    const-string/jumbo v5, "sns_step_SELFIE_recording_instructions"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    if-ne v4, v0, :cond_4

    .line 96
    :goto_1
    return-object v0

    .line 97
    :cond_4
    move-object v0, p1

    .line 98
    move-object p1, v4

    .line 99
    .line 100
    :goto_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 101
    .line 102
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/s;->a:Ljava/lang/CharSequence;

    .line 103
    .line 104
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/video/s;

    .line 105
    .line 106
    .line 107
    invoke-direct {v4, v1, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/video/s;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 108
    const/4 p1, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v4, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/video/r;->a(Lcom/sumsub/sns/internal/features/presentation/camera/video/r;Lcom/sumsub/sns/internal/features/presentation/camera/video/s;Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;I)Lcom/sumsub/sns/internal/features/presentation/camera/video/r;

    .line 112
    move-result-object p1

    .line 113
    return-object p1
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
