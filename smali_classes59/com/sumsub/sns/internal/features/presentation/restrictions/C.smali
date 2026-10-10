.class public final Lcom/sumsub/sns/internal/features/presentation/restrictions/C;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic V:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/restrictions/f;

.field public final c:Lcom/sumsub/sns/internal/core/common/s0;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/restrictions/g;

.field public final e:Lkotlinx/coroutines/flow/n;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/restrictions/f;Lcom/sumsub/sns/internal/features/presentation/main/i2;Lcom/sumsub/sns/internal/features/presentation/restrictions/g;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/presentation/base/P;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p3, p4, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->b:Lcom/sumsub/sns/internal/features/presentation/restrictions/f;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->c:Lcom/sumsub/sns/internal/core/common/s0;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/g;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->e:Lkotlinx/coroutines/flow/n;

    .line 24
    .line 25
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/restrictions/z;

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/z;-><init>(Lkotlinx/coroutines/flow/n;Lcom/sumsub/sns/internal/features/presentation/restrictions/C;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/restrictions/A;

    .line 39
    const/4 p4, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {p3, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/restrictions/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/C;Lkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2, p3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 46
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 3
    .line 4
    .line 5
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 26
    .line 27
    sget-object v0, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    .line 28
    .line 29
    .line 30
    filled-new-array {v0}, [Lcom/sumsub/sns/internal/log/LoggerType;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    const-string v2, "String resource "

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string p2, " for restrictionCode "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string p2, " is not found"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    const/4 v5, 0x4

    .line 71
    const/4 v6, 0x0

    .line 72
    .line 73
    const-string v2, "SNSRestrictionsViewModel"

    .line 74
    const/4 v4, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 78
    .line 79
    :cond_0
    if-eqz p1, :cond_1

    .line 80
    .line 81
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 82
    .line 83
    check-cast p2, Lcom/sumsub/sns/internal/core/domain/d;

    .line 84
    .line 85
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 86
    .line 87
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    return-object p1

    .line 95
    .line 96
    :cond_1
    const-string p1, ""

    .line 97
    return-object p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->e:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/restrictions/w;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, v0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/w;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/restrictions/C;)V

    .line 8
    return-object v1
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

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Status"

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 10

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/r;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/r;

    .line 7
    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/q;->a:Lcom/sumsub/sns/internal/features/presentation/restrictions/q;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "restrictionCode"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "unknown"

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    const/4 p1, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;

    .line 35
    const/4 p1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v6, p0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/C;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/restrictions/C;)V

    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 45
    .line 46
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/g;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->e:Lkotlinx/coroutines/flow/n;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;->a:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v0, :cond_0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v2, v0

    .line 63
    .line 64
    :cond_1
    :goto_0
    sget-object v6, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    new-instance v3, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 70
    .line 71
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Screen;->RestrictionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 72
    .line 73
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/g;->a:Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, v4, v0}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)V

    .line 77
    .line 78
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/g;->a:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 86
    move-result-object v7

    .line 87
    .line 88
    const/16 v8, 0x10

    .line 89
    .line 90
    .line 91
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 92
    return-void

    .line 93
    .line 94
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/p;->a:Lcom/sumsub/sns/internal/features/presentation/restrictions/p;

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    move-result p1

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    new-instance v4, Lcom/sumsub/sns/internal/core/common/v;

    .line 103
    .line 104
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 105
    .line 106
    .line 107
    invoke-direct {v4, p1}, Lcom/sumsub/sns/internal/core/common/v;-><init>(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;)V

    .line 108
    .line 109
    const/16 v8, 0xe

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    move-object v3, p0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v3 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 118
    .line 119
    iget-object p1, v3, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/g;

    .line 120
    .line 121
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->e:Lkotlinx/coroutines/flow/n;

    .line 122
    .line 123
    .line 124
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;->a:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v0, :cond_3

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move-object v2, v0

    .line 136
    .line 137
    :cond_4
    :goto_1
    sget-object v7, Lcom/sumsub/sns/internal/core/analytics/Control;->CloseButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    new-instance v4, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 143
    .line 144
    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/Screen;->RestrictionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 145
    .line 146
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/g;->a:Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-direct {v4, v5, v0}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)V

    .line 150
    .line 151
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/g;->a:Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    .line 158
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 159
    move-result-object v8

    .line 160
    .line 161
    const/16 v9, 0x10

    .line 162
    .line 163
    .line 164
    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 165
    return-void

    .line 166
    :cond_5
    move-object v3, p0

    .line 167
    .line 168
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 169
    .line 170
    .line 171
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 172
    throw p1

    .line 173
    :cond_6
    move-object v3, p0

    .line 174
    .line 175
    .line 176
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 177
    return-void
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
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v2, Lcom/sumsub/sns/internal/core/common/v;

    .line 11
    .line 12
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/core/common/v;-><init>(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;)V

    .line 16
    .line 17
    const/16 v6, 0xe

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v1, p0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 31
    move-result p1

    .line 32
    return p1
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
.end method
