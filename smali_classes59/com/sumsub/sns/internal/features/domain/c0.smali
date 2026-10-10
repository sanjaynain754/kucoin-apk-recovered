.class public final Lcom/sumsub/sns/internal/features/domain/c0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/c0;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/c0;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

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
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/b0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/b0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/b0;->e:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/b0;->e:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/b0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/b0;-><init>(Lcom/sumsub/sns/internal/features/domain/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/b0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/b0;->e:I

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
    .line 43
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_4

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_5

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p1

    .line 55
    .line 56
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/b0;->b:Lcom/sumsub/sns/internal/features/domain/c0;

    .line 57
    .line 58
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/b0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;

    .line 59
    .line 60
    .line 61
    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    goto :goto_1

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 68
    .line 69
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/c0;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 70
    .line 71
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/b0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;

    .line 72
    .line 73
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/b0;->b:Lcom/sumsub/sns/internal/features/domain/c0;

    .line 74
    .line 75
    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/b0;->e:I

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
    goto :goto_3

    .line 86
    :cond_4
    move-object v2, p1

    .line 87
    move-object p1, p0

    .line 88
    .line 89
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/c0;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    instance-of p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 97
    const/4 v4, 0x0

    .line 98
    .line 99
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/domain/b0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;

    .line 100
    .line 101
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/domain/b0;->b:Lcom/sumsub/sns/internal/features/domain/c0;

    .line 102
    .line 103
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/b0;->e:I

    .line 104
    .line 105
    if-eqz p2, :cond_5

    .line 106
    .line 107
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 108
    .line 109
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 110
    .line 111
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    goto :goto_2

    .line 117
    .line 118
    :cond_5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 119
    .line 120
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 121
    .line 122
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    :goto_2
    if-ne p1, v1, :cond_6

    .line 129
    :goto_3
    return-object v1

    .line 130
    .line 131
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    return-object p1

    .line 137
    .line 138
    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    move-result-object p1

    .line 147
    return-object p1
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
