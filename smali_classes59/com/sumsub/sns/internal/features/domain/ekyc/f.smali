.class public final Lcom/sumsub/sns/internal/features/domain/ekyc/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 10
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/ekyc/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->d:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/ekyc/e;-><init>(Lcom/sumsub/sns/internal/features/domain/ekyc/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->d:I

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
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_3

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_4

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
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->a:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    goto :goto_1

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    :try_start_2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->a:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 70
    .line 71
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->a:Ljava/lang/String;

    .line 72
    .line 73
    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->d:I

    .line 74
    .line 75
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 76
    const/4 v2, 0x0

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    if-ne p2, v1, :cond_4

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_4
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/m;

    .line 92
    .line 93
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/S;

    .line 94
    const/4 v6, 0x0

    .line 95
    .line 96
    .line 97
    invoke-direct {v5, v6, p1, v4}, Lcom/sumsub/sns/internal/features/data/model/common/remote/S;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 98
    const/4 p1, 0x3

    .line 99
    .line 100
    .line 101
    invoke-direct {v2, v6, v6, v5, p1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/D0;Lcom/sumsub/sns/internal/features/data/model/common/remote/z0;Lcom/sumsub/sns/internal/features/data/model/common/remote/S;I)V

    .line 102
    .line 103
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 104
    .line 105
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/f;->a:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->a:Ljava/lang/String;

    .line 108
    .line 109
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/e;->d:I

    .line 110
    .line 111
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 112
    .line 113
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 114
    .line 115
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, p2, v4, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    if-ne p2, v1, :cond_5

    .line 122
    :goto_2
    return-object v1

    .line 123
    .line 124
    :cond_5
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    .line 131
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string p2, "Cannot report eid error as confirmation id is null"

    .line 134
    .line 135
    .line 136
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 137
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 138
    .line 139
    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    move-result-object p1

    .line 148
    return-object p1
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
