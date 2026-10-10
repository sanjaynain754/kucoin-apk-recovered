.class public final Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->d:I

    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v5, :cond_3

    .line 15
    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->c:Ljava/lang/CharSequence;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->b:Ljava/lang/CharSequence;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    move-object v4, v0

    .line 35
    move-object v0, v3

    .line 36
    :goto_0
    move-object v3, v1

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1

    .line 47
    .line 48
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 62
    .line 63
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    goto :goto_2

    .line 70
    .line 71
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    .line 82
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 87
    .line 88
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 89
    .line 90
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->d:I

    .line 91
    .line 92
    .line 93
    const-string/jumbo v5, "sns_preview_video_title"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    if-ne v1, v0, :cond_5

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    move-object v8, v1

    .line 102
    move-object v1, p1

    .line 103
    move-object p1, v8

    .line 104
    .line 105
    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    .line 106
    .line 107
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 108
    .line 109
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 112
    .line 113
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->d:I

    .line 114
    .line 115
    .line 116
    const-string/jumbo v4, "sns_preview_video_subtitle"

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v4, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 120
    move-result-object v4

    .line 121
    .line 122
    if-ne v4, v0, :cond_6

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    move-object v8, v1

    .line 125
    move-object v1, p1

    .line 126
    move-object p1, v4

    .line 127
    move-object v4, v8

    .line 128
    .line 129
    :goto_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 130
    .line 131
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 132
    .line 133
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 136
    .line 137
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->b:Ljava/lang/CharSequence;

    .line 138
    .line 139
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->d:I

    .line 140
    .line 141
    .line 142
    const-string/jumbo v3, "sns_preview_video_action_accept"

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v3, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    if-ne v3, v0, :cond_7

    .line 149
    goto :goto_4

    .line 150
    :cond_7
    move-object v8, v1

    .line 151
    move-object v1, p1

    .line 152
    move-object p1, v3

    .line 153
    move-object v3, v8

    .line 154
    .line 155
    :goto_3
    check-cast p1, Ljava/lang/CharSequence;

    .line 156
    .line 157
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->f:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 158
    .line 159
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->e:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->a:Ljava/lang/CharSequence;

    .line 162
    .line 163
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->b:Ljava/lang/CharSequence;

    .line 164
    .line 165
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->c:Ljava/lang/CharSequence;

    .line 166
    .line 167
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;->d:I

    .line 168
    .line 169
    .line 170
    const-string/jumbo v2, "sns_preview_video_action_retake"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 174
    move-result-object v2

    .line 175
    .line 176
    if-ne v2, v0, :cond_8

    .line 177
    :goto_4
    return-object v0

    .line 178
    :cond_8
    move-object v0, v4

    .line 179
    move-object v4, p1

    .line 180
    move-object p1, v2

    .line 181
    move-object v2, v3

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    :goto_5
    move-object v5, p1

    .line 185
    .line 186
    check-cast v5, Ljava/lang/CharSequence;

    .line 187
    const/4 v6, 0x0

    .line 188
    .line 189
    const/16 v7, 0x21

    .line 190
    const/4 v1, 0x0

    .line 191
    .line 192
    .line 193
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;Ljava/io/File;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZI)Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 194
    move-result-object p1

    .line 195
    return-object p1
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
