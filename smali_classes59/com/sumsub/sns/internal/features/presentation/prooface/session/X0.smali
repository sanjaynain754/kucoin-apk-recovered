.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->b:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->b:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->b:I

    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v2, 0x1

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    if-ne v1, v7, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    goto :goto_6

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    :cond_2
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;

    .line 58
    .line 59
    iget-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->c:Lkotlinx/coroutines/flow/f;

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    goto :goto_4

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;->a:Lkotlinx/coroutines/flow/f;

    .line 69
    .line 70
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/X0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 73
    .line 74
    iget-boolean v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->k:Z

    .line 75
    .line 76
    if-eqz v3, :cond_4

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_4
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 80
    .line 81
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    iput-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->k:Z

    .line 86
    move-object v5, v3

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_2
    move-object v5, v8

    .line 89
    .line 90
    :goto_3
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;

    .line 91
    move v3, v2

    .line 92
    .line 93
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;->a:Landroid/graphics/Bitmap;

    .line 94
    move v4, v3

    .line 95
    .line 96
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;->b:Landroid/util/Size;

    .line 97
    move v9, v4

    .line 98
    .line 99
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;->c:Ljava/lang/String;

    .line 100
    .line 101
    iput-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->c:Lkotlinx/coroutines/flow/f;

    .line 102
    .line 103
    iput-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;

    .line 104
    .line 105
    iput v9, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->b:I

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->a(Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    if-ne v1, v0, :cond_6

    .line 112
    goto :goto_5

    .line 113
    :cond_6
    move-object v10, v1

    .line 114
    move-object v1, p2

    .line 115
    move-object p2, v10

    .line 116
    .line 117
    :goto_4
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/prooface/A;

    .line 118
    .line 119
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;->d:Z

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    iput-object v8, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->c:Lkotlinx/coroutines/flow/f;

    .line 130
    .line 131
    iput-object v8, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/I0;

    .line 132
    .line 133
    iput v7, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W0;->b:I

    .line 134
    .line 135
    .line 136
    invoke-interface {v1, p1, v6}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    if-ne p1, v0, :cond_7

    .line 140
    :goto_5
    return-object v0

    .line 141
    .line 142
    :cond_7
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 143
    return-object p1
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
.end method
