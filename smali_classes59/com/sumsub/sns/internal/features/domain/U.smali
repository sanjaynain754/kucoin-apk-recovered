.class public final Lcom/sumsub/sns/internal/features/domain/U;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/domain/U;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/U;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 24
    return-void
    .line 25
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/T;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/T;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/T;->f:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/T;->f:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/T;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/T;-><init>(Lcom/sumsub/sns/internal/features/domain/U;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/T;->d:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/T;->f:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/T;->c:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/domain/T;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/T;->a:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_3

    .line 51
    :catch_0
    move-exception p1

    .line 52
    goto :goto_4

    .line 53
    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    throw p1

    .line 61
    .line 62
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/T;->a:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    .line 71
    :try_start_2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/U;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 72
    .line 73
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/T;->a:Ljava/lang/String;

    .line 74
    .line 75
    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/T;->f:I

    .line 76
    .line 77
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 78
    const/4 v2, 0x0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    if-ne p2, v1, :cond_4

    .line 85
    goto :goto_2

    .line 86
    .line 87
    :cond_4
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/domain/U;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 94
    .line 95
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/T;->a:Ljava/lang/String;

    .line 96
    .line 97
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/domain/T;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 98
    .line 99
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/domain/T;->c:Ljava/lang/String;

    .line 100
    .line 101
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/T;->f:I

    .line 102
    .line 103
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 104
    .line 105
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 106
    .line 107
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 108
    .line 109
    .line 110
    invoke-interface {v3, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    if-ne v0, v1, :cond_5

    .line 114
    :goto_2
    return-object v1

    .line 115
    :cond_5
    move-object v1, p2

    .line 116
    move-object p2, v0

    .line 117
    move-object v0, p1

    .line 118
    move-object p1, v2

    .line 119
    .line 120
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;

    .line 121
    .line 122
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 123
    .line 124
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/S;

    .line 125
    .line 126
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/i3;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->i()Ljava/util/List;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    .line 133
    invoke-direct {v3, p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v2, v0, p2, v3}, Lcom/sumsub/sns/internal/features/domain/S;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;Lcom/sumsub/sns/internal/features/data/model/common/i3;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 141
    return-object p1

    .line 142
    .line 143
    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 147
    move-result-object p1

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object p1

    .line 152
    return-object p1
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
