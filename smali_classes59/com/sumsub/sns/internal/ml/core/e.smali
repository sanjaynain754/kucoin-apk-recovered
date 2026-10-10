.class public final Lcom/sumsub/sns/internal/ml/core/e;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/ml/core/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

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
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/e;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/ml/core/e;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/e;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/ml/core/e;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/ml/core/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 17
    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->MlModelExecution:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Completed:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ml/core/h;->d()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    const-string/jumbo v2, "name"

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget-object v2, p1, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 43
    .line 44
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->averageOfLong(Ljava/lang/Iterable;)D

    .line 48
    move-result-wide v2

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 56
    move-result v2

    .line 57
    const/4 v3, 0x0

    .line 58
    .line 59
    if-nez v2, :cond_0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v4, v3

    .line 62
    .line 63
    :goto_0
    if-nez v4, :cond_1

    .line 64
    const/4 v2, -0x1

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    :cond_1
    const-string v2, "average"

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    iget-object v4, p1, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 77
    .line 78
    const-wide/high16 v5, 0x4049000000000000L    # 50.0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5, v6}, Lcom/sumsub/sns/internal/core/common/a1;->a(D)J

    .line 82
    move-result-wide v4

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    const-string v5, "median"

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 92
    move-result-object v4

    .line 93
    .line 94
    iget-object v5, p1, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const-wide v6, 0x4058c00000000000L    # 99.0

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v6, v7}, Lcom/sumsub/sns/internal/core/common/a1;->a(D)J

    .line 103
    move-result-wide v5

    .line 104
    .line 105
    .line 106
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    move-result-object v5

    .line 108
    .line 109
    .line 110
    const-string/jumbo v6, "p99"

    .line 111
    .line 112
    .line 113
    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    iget-object v6, p1, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 117
    .line 118
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v7, v8}, Lcom/sumsub/sns/internal/core/common/a1;->a(D)J

    .line 122
    move-result-wide v6

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    move-result-object v6

    .line 127
    .line 128
    .line 129
    const-string/jumbo v7, "p100"

    .line 130
    .line 131
    .line 132
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    move-result-object v6

    .line 134
    .line 135
    .line 136
    filled-new-array {v1, v2, v4, v5, v6}, [Lkotlin/Pair;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    iput-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 148
    const/4 v1, 0x0

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 152
    .line 153
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 154
    .line 155
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 159
    const/4 v0, 0x1

    .line 160
    .line 161
    iput-boolean v0, p1, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 162
    .line 163
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

    .line 164
    .line 165
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    .line 166
    .line 167
    if-eqz p1, :cond_2

    .line 168
    .line 169
    .line 170
    invoke-interface {p1}, Lorg/tensorflow/lite/InterpreterApi;->close()V

    .line 171
    .line 172
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/e;->a:Lcom/sumsub/sns/internal/ml/core/h;

    .line 173
    .line 174
    iput-object v3, p1, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    .line 175
    .line 176
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->e:Lkotlin/Lazy;

    .line 177
    .line 178
    .line 179
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    check-cast p1, Lkotlinx/coroutines/m1;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lkotlinx/coroutines/m1;->close()V

    .line 186
    .line 187
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 188
    return-object p1
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
