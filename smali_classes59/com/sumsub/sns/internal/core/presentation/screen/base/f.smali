.class public abstract Lcom/sumsub/sns/internal/core/presentation/screen/base/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/data/model/common/t2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->c:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p3, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->b:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->c:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-object p2, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p0

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    new-instance p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/g;

    .line 63
    .line 64
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 65
    .line 66
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 67
    .line 68
    new-instance p3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    const-string v1, "Strings unavailable for instructions: "

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    .line 89
    .line 90
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    const/4 p3, 0x6

    .line 92
    const/4 v1, 0x0

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, v0, v1, v1, p3}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 96
    .line 97
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    .line 98
    .line 99
    if-nez p2, :cond_3

    .line 100
    .line 101
    const-string p2, "TYPE_UNKNOWN"

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/g;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/e0;Ljava/lang/String;)V

    .line 105
    return-object p0

    .line 106
    .line 107
    :cond_4
    iput-object p2, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 108
    .line 109
    iput v2, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/e;->c:I

    .line 110
    const/4 v4, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    move-object v1, p0

    .line 113
    move-object v2, p1

    .line 114
    move-object v3, p2

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 118
    move-result-object p3

    .line 119
    .line 120
    if-ne p3, v0, :cond_5

    .line 121
    return-object v0

    .line 122
    :cond_5
    move-object p2, v3

    .line 123
    .line 124
    :goto_2
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/d;

    .line 125
    .line 126
    sget-object p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/c;->a:Lcom/sumsub/sns/internal/features/presentation/main/instructions/c;

    .line 127
    .line 128
    .line 129
    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    move-result p0

    .line 131
    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/h;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/h;

    .line 135
    return-object p0

    .line 136
    .line 137
    :cond_6
    instance-of p0, p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;

    .line 138
    .line 139
    if-eqz p0, :cond_7

    .line 140
    .line 141
    new-instance p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/g;

    .line 142
    .line 143
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;

    .line 144
    .line 145
    iget-object p1, p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 146
    .line 147
    iget-object p2, p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;->b:Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/g;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/e0;Ljava/lang/String;)V

    .line 151
    return-object p0

    .line 152
    .line 153
    :cond_7
    instance-of p0, p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/b;

    .line 154
    .line 155
    if-eqz p0, :cond_8

    .line 156
    .line 157
    new-instance p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/i;

    .line 158
    .line 159
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/f;

    .line 160
    .line 161
    iget-object p3, p2, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    .line 166
    .line 167
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/t2;->e:Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    invoke-direct {p1, p3, v0, v1, p2}, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/i;-><init>(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/f;)V

    .line 174
    return-object p0

    .line 175
    .line 176
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 177
    .line 178
    .line 179
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 180
    throw p0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method
