.class public final Lcom/sumsub/sns/internal/core/analytics/d;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/d;->a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/core/analytics/d;->b:Z

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
    .locals 2

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/d;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/d;->a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/core/analytics/d;->b:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/sumsub/sns/internal/core/analytics/d;-><init>(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;ZLkotlin/coroutines/Continuation;)V

    .line 10
    return-object p1
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
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/d;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/d;->a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 9
    .line 10
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/core/analytics/d;->b:Z

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, v1, p2}, Lcom/sumsub/sns/internal/core/analytics/d;-><init>(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;ZLkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/analytics/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    :try_start_0
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->g:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/d;->a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    :catchall_0
    :cond_0
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/d;->a:Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    move-result p1

    .line 27
    int-to-long v0, p1

    .line 28
    .line 29
    const-wide/16 v2, 0x32

    .line 30
    .line 31
    cmp-long p1, v0, v2

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/core/analytics/d;->b:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    :cond_1
    move-object p1, v0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->f:Lkotlinx/coroutines/x1;

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lkotlinx/coroutines/x1;->isActive()Z

    .line 48
    move-result p1

    .line 49
    const/4 v1, 0x1

    .line 50
    .line 51
    if-ne p1, v1, :cond_3

    .line 52
    .line 53
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->f:Lkotlinx/coroutines/x1;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 59
    .line 60
    :cond_3
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/e;->d:Lkotlinx/coroutines/m0;

    .line 61
    .line 62
    new-instance v5, Lcom/sumsub/sns/internal/core/analytics/c;

    .line 63
    .line 64
    .line 65
    invoke-direct {v5, v0}, Lcom/sumsub/sns/internal/core/analytics/c;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 66
    const/4 v6, 0x3

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    sput-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->f:Lkotlinx/coroutines/x1;

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->d:Lkotlinx/coroutines/m0;

    .line 79
    .line 80
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/e;->e:Lkotlinx/coroutines/j0;

    .line 81
    .line 82
    new-instance v3, Lcom/sumsub/sns/internal/core/analytics/a;

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/core/analytics/a;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 86
    const/4 v4, 0x2

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    .line 90
    .line 91
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 92
    .line 93
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 94
    return-object p1
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
