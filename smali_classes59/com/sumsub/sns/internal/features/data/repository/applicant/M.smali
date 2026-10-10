.class public final Lcom/sumsub/sns/internal/features/data/repository/applicant/M;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

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
.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;->c:I

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
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 55
    .line 56
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/L;->c:I

    .line 57
    .line 58
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 59
    .line 60
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 61
    .line 62
    .line 63
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->d(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    return-object v1

    .line 68
    .line 69
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y;

    .line 70
    .line 71
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;

    .line 72
    const/4 v0, 0x0

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Z;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;)Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 78
    move-result-object p1

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move-object p1, v0

    .line 81
    .line 82
    :goto_2
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y;->b:Ljava/util/Map;

    .line 83
    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 90
    move-result v1

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 94
    move-result v1

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    move-result-object p2

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    move-result v1

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    .line 114
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    check-cast v1, Ljava/util/Map$Entry;

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;

    .line 128
    .line 129
    .line 130
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Z;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;)Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    goto :goto_3

    .line 136
    .line 137
    :cond_5
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/common/O2;

    .line 138
    .line 139
    .line 140
    invoke-direct {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/O2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Q2;Ljava/util/LinkedHashMap;)V

    .line 141
    return-object p2
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
