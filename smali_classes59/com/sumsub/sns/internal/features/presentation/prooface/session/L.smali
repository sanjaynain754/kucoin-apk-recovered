.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/prooface/session/L;
.super Lkotlin/jvm/internal/AdaptedFunctionReference;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;
.implements Lkotlin/coroutines/jvm/internal/SuspendFunction;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;)V
    .locals 7

    .line 1
    .line 2
    const-string v5, "handleLivenessRepositoryMessageInternal(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V"

    .line 3
    const/4 v6, 0x4

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;

    .line 7
    .line 8
    const-string v4, "handleLivenessRepositoryMessageInternal"

    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    return-void
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
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    check-cast v0, Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;

    .line 5
    .line 6
    move-object/from16 v1, p2

    .line 7
    .line 8
    check-cast v1, Lkotlin/coroutines/Continuation;

    .line 9
    .line 10
    move-object/from16 v1, p0

    .line 11
    .line 12
    iget-object v2, v1, Lkotlin/jvm/internal/AdaptedFunctionReference;->receiver:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;

    .line 15
    .line 16
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 17
    .line 18
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->a:Lkotlinx/coroutines/m0;

    .line 19
    .line 20
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O0;

    .line 21
    const/4 v10, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v3, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V

    .line 25
    const/4 v8, 0x3

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    .line 33
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/f;

    .line 34
    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    check-cast v0, Lcom/sumsub/sns/internal/features/data/network/prooface/f;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/f;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/f;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    .line 54
    move-result-object v3

    .line 55
    array-length v4, v3

    .line 56
    const/4 v5, 0x0

    .line 57
    .line 58
    :goto_0
    if-ge v5, v4, :cond_1

    .line 59
    .line 60
    aget-object v6, v3, v5

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    .line 67
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v7

    .line 69
    .line 70
    if-eqz v7, :cond_0

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v6, v10

    .line 76
    .line 77
    :goto_1
    if-nez v6, :cond_3

    .line 78
    .line 79
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Error:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move-object v6, v10

    .line 82
    .line 83
    :cond_3
    :goto_2
    if-eqz v6, :cond_7

    .line 84
    .line 85
    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a:Lkotlinx/coroutines/m0;

    .line 86
    .line 87
    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/prooface/session/H;

    .line 88
    .line 89
    .line 90
    invoke-direct {v14, v2, v6, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;Lkotlin/coroutines/Continuation;)V

    .line 91
    const/4 v15, 0x3

    .line 92
    .line 93
    const/16 v16, 0x0

    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 99
    goto :goto_3

    .line 100
    .line 101
    :cond_4
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/d;

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a:Lkotlinx/coroutines/m0;

    .line 106
    .line 107
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I;

    .line 108
    .line 109
    .line 110
    invoke-direct {v7, v2, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lkotlin/coroutines/Continuation;)V

    .line 111
    const/4 v8, 0x3

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 118
    goto :goto_3

    .line 119
    .line 120
    :cond_5
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/h;

    .line 121
    .line 122
    if-nez v2, :cond_7

    .line 123
    .line 124
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    .line 125
    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/j;

    .line 129
    .line 130
    if-nez v2, :cond_7

    .line 131
    .line 132
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/e;

    .line 133
    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    sget-object v2, Lcom/sumsub/sns/internal/features/data/network/prooface/c;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/c;

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    move-result v2

    .line 141
    .line 142
    if-nez v2, :cond_7

    .line 143
    .line 144
    sget-object v2, Lcom/sumsub/sns/internal/features/data/network/prooface/g;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/g;

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    move-result v0

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    goto :goto_3

    .line 152
    .line 153
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 154
    .line 155
    .line 156
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 157
    throw v0

    .line 158
    .line 159
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 160
    return-object v0
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
.end method
