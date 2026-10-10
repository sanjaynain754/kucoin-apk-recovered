.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

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
    .locals 9

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->b:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->b:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->b:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_4

    .line 46
    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->c:Lkotlinx/coroutines/flow/f;

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;->a:Lkotlinx/coroutines/flow/f;

    .line 65
    .line 66
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 71
    .line 72
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->f:Lcom/sumsub/sns/internal/features/domain/x;

    .line 73
    .line 74
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/u;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-direct {v7, p1, v2}, Lcom/sumsub/sns/internal/features/domain/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->c:Lkotlinx/coroutines/flow/f;

    .line 84
    .line 85
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->b:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v7, v0}, Lcom/sumsub/sns/internal/features/domain/x;->a(Lcom/sumsub/sns/internal/features/domain/u;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-ne p1, v1, :cond_4

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move-object v8, p2

    .line 94
    move-object p2, p1

    .line 95
    move-object p1, v8

    .line 96
    .line 97
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/domain/v;

    .line 98
    move-object v8, p2

    .line 99
    move-object p2, p1

    .line 100
    move-object p1, v8

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move-object p1, v3

    .line 103
    .line 104
    :goto_2
    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->c:Lkotlinx/coroutines/flow/f;

    .line 105
    .line 106
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j0;->b:I

    .line 107
    .line 108
    .line 109
    invoke-interface {p2, p1, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-ne p1, v1, :cond_6

    .line 113
    :goto_3
    return-object v1

    .line 114
    .line 115
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    return-object p1
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
.end method
