.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;
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
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

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
    .locals 8

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->b:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->b:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->b:I

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
    goto :goto_3

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
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->c:Lkotlinx/coroutines/flow/f;

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
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;->a:Lkotlinx/coroutines/flow/f;

    .line 65
    .line 66
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/v;

    .line 67
    .line 68
    if-nez p1, :cond_4

    .line 69
    move-object p1, p2

    .line 70
    move-object p2, v3

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_4
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/domain/v;->a:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 79
    move-result-object p1

    .line 80
    :cond_5
    move-object v7, p2

    .line 81
    move-object p2, p1

    .line 82
    move-object p1, v7

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_6
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/n0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 86
    .line 87
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->c:Lkotlinx/coroutines/flow/f;

    .line 88
    .line 89
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->b:I

    .line 90
    .line 91
    sget v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->V:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, p1, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/domain/v;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    if-ne p1, v1, :cond_5

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :goto_1
    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->c:Lkotlinx/coroutines/flow/f;

    .line 101
    .line 102
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m0;->b:I

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-ne p1, v1, :cond_7

    .line 109
    :goto_2
    return-object v1

    .line 110
    .line 111
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 112
    return-object p1
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
.end method
