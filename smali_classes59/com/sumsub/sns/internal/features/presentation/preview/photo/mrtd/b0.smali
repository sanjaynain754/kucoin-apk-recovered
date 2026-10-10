.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b0;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
    .line 7
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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;->b:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;->b:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b0;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;->b:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/b0;->a:Lkotlinx/coroutines/flow/f;

    .line 56
    .line 57
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/S;

    .line 58
    .line 59
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;

    .line 64
    .line 65
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;

    .line 66
    .line 67
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;->a:Ljava/lang/CharSequence;

    .line 68
    .line 69
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;->b:Ljava/lang/CharSequence;

    .line 70
    .line 71
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;->c:Ljava/lang/CharSequence;

    .line 72
    .line 73
    iget-object v8, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;->d:Ljava/lang/CharSequence;

    .line 74
    .line 75
    iget-object v9, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/O;->e:Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_3
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/P;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;

    .line 86
    .line 87
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/P;

    .line 88
    .line 89
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/P;->a:Ljava/lang/CharSequence;

    .line 90
    .line 91
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/P;->b:Ljava/lang/CharSequence;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/P;->c:Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    invoke-direct {v4, v2, v5, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :cond_4
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;

    .line 104
    .line 105
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;

    .line 106
    .line 107
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;->a:Ljava/lang/CharSequence;

    .line 108
    .line 109
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;->b:Ljava/lang/CharSequence;

    .line 110
    .line 111
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;->c:Ljava/lang/CharSequence;

    .line 112
    .line 113
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Q;->d:I

    .line 114
    .line 115
    .line 116
    invoke-direct {v4, v2, v5, v6, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)V

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :cond_5
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/M;

    .line 120
    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;

    .line 124
    .line 125
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/M;

    .line 126
    .line 127
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/M;->a:Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    invoke-direct {v4, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n;-><init>(Ljava/lang/CharSequence;)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_6
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;

    .line 134
    .line 135
    if-eqz v2, :cond_8

    .line 136
    .line 137
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;

    .line 138
    .line 139
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;

    .line 140
    .line 141
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;->a:Ljava/lang/CharSequence;

    .line 142
    .line 143
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;->b:Ljava/lang/CharSequence;

    .line 144
    .line 145
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;->c:Ljava/lang/CharSequence;

    .line 146
    .line 147
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/N;->d:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 148
    .line 149
    .line 150
    invoke-direct {v4, v2, v5, v6, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/data/model/common/A2;)V

    .line 151
    .line 152
    :goto_1
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a0;->b:I

    .line 153
    .line 154
    .line 155
    invoke-interface {p2, v4, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    if-ne p1, v1, :cond_7

    .line 159
    return-object v1

    .line 160
    .line 161
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    return-object p1

    .line 163
    .line 164
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 165
    .line 166
    .line 167
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 168
    throw p1
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
