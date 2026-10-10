.class public final Lcom/sumsub/sns/internal/features/domain/geo/x;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/common/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/geo/x;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/x;->b:Lcom/sumsub/sns/internal/features/data/repository/common/a;

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
.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/geo/w;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/geo/w;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/w;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/w;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/w;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/geo/w;-><init>(Lcom/sumsub/sns/internal/features/domain/geo/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/geo/w;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/geo/w;->c:I

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
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_4

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_5

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    :try_start_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/x;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    move-result v4

    .line 70
    .line 71
    if-eqz v4, :cond_8

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 78
    .line 79
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 80
    .line 81
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 82
    const/4 v6, 0x0

    .line 83
    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    if-nez v5, :cond_4

    .line 91
    goto :goto_3

    .line 92
    .line 93
    :cond_4
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->b:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    .line 98
    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 99
    move-result v7

    .line 100
    .line 101
    if-eqz v7, :cond_5

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move-object v6, v4

    .line 104
    .line 105
    :cond_6
    :goto_2
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/J0;

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/common/remote/J0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    move-object v6, v4

    .line 110
    .line 111
    :cond_7
    :goto_3
    if-eqz v6, :cond_3

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    goto :goto_1

    .line 116
    .line 117
    :cond_8
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/geo/w;->c:I

    .line 118
    .line 119
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 120
    .line 121
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 122
    .line 123
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 124
    .line 125
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/M0;

    .line 126
    .line 127
    .line 128
    invoke-direct {p2, v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/M0;-><init>(Ljava/util/ArrayList;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    if-ne p1, v1, :cond_9

    .line 135
    return-object v1

    .line 136
    .line 137
    :cond_9
    :goto_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 138
    .line 139
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 144
    return-object p1

    .line 145
    .line 146
    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 147
    .line 148
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/x;->b:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 149
    .line 150
    .line 151
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    .line 159
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    move-result-object p1

    .line 161
    return-object p1
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
