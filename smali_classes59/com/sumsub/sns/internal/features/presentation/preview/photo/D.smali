.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->a:I

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
    .line 17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    .line 19
    goto/16 :goto_4

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
    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    new-instance v1, Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;

    .line 45
    .line 46
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 47
    .line 48
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->l:[Lkotlin/reflect/KProperty;

    .line 49
    .line 50
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v4}, Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v1}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 65
    .line 66
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->l:[Lkotlin/reflect/KProperty;

    .line 67
    .line 68
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/h;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 69
    .line 70
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->a:I

    .line 71
    .line 72
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 73
    const/4 v1, 0x0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    if-ne p1, v0, :cond_4

    .line 80
    goto :goto_3

    .line 81
    .line 82
    :cond_4
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 93
    .line 94
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->l:[Lkotlin/reflect/KProperty;

    .line 95
    .line 96
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 104
    move-result-object p1

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    const/4 p1, 0x0

    .line 107
    .line 108
    :goto_1
    if-eqz p1, :cond_6

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/m;->f()Z

    .line 112
    move-result v1

    .line 113
    .line 114
    if-ne v1, v3, :cond_6

    .line 115
    goto :goto_2

    .line 116
    .line 117
    :cond_6
    if-eqz p1, :cond_7

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/m;->e()Z

    .line 121
    move-result p1

    .line 122
    .line 123
    if-ne p1, v3, :cond_7

    .line 124
    .line 125
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->f()V

    .line 129
    goto :goto_4

    .line 130
    .line 131
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 132
    .line 133
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 136
    .line 137
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 138
    .line 139
    aget-object v1, v1, v2

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/J;->b:Z

    .line 150
    .line 151
    if-ne p1, v3, :cond_8

    .line 152
    .line 153
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->f()V

    .line 157
    goto :goto_4

    .line 158
    .line 159
    :cond_8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 160
    .line 161
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 170
    .line 171
    if-ne p1, v1, :cond_9

    .line 172
    .line 173
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 174
    .line 175
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->a:I

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->g()Lkotlin/Unit;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    if-ne p1, v0, :cond_a

    .line 182
    :goto_3
    return-object v0

    .line 183
    .line 184
    :cond_9
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 185
    .line 186
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 187
    .line 188
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 192
    move-result-object p1

    .line 193
    .line 194
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 195
    .line 196
    if-ne p1, v0, :cond_a

    .line 197
    .line 198
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/D;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->f()V

    .line 202
    .line 203
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 204
    return-object p1
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
