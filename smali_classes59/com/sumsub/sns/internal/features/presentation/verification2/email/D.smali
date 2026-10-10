.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic V:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    const/4 v1, 0x3

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
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->b:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 18
    move-result-object p3

    .line 19
    .line 20
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->c:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 24
    move-result-object p4

    .line 25
    .line 26
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->d:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 30
    move-result-object p4

    .line 31
    .line 32
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/i;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p3, p4, v0}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 39
    .line 40
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 41
    .line 42
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->h:Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->b:Lkotlinx/coroutines/flow/w;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/w;

    .line 51
    .line 52
    .line 53
    invoke-direct {p3, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/w;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;)V

    .line 54
    .line 55
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/z;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p3}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/w;)V

    .line 59
    .line 60
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/C;

    .line 61
    .line 62
    .line 63
    invoke-direct {p3, p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/z;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p3}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 71
    move-result-object p3

    .line 72
    .line 73
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/verification2/email/j;

    .line 74
    .line 75
    .line 76
    invoke-direct {p4, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p3, p4}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 80
    return-void
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
.end method


# virtual methods
.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 7

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/core/presentation/base/O;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->c:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/q;

    .line 33
    const/4 v3, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->c:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;

    .line 45
    .line 46
    .line 47
    invoke-direct {v4, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v4}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->c:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->d:Lkotlinx/coroutines/flow/n;

    .line 56
    .line 57
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/verification2/email/s;

    .line 58
    .line 59
    .line 60
    invoke-direct {v6, p0, v0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v1, v2, v5, v6}, Lkotlinx/coroutines/flow/g;->o(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;

    .line 64
    move-result-object p1

    .line 65
    return-object p1
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
