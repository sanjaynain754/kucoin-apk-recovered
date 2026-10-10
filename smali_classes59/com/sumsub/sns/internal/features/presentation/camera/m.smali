.class public final Lcom/sumsub/sns/internal/features/presentation/camera/m;
.super Lcom/sumsub/sns/core/presentation/base/L;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/C;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v4

    .line 5
    .line 6
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/i;

    .line 7
    const/4 v7, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v5, p1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/i;-><init>(Lcom/sumsub/sns/core/presentation/base/C;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/u0;

    .line 13
    .line 14
    .line 15
    invoke-direct {v6, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/u0;-><init>(Lcom/sumsub/sns/core/presentation/base/C;)V

    .line 16
    move-object v0, p0

    .line 17
    move-object v1, p2

    .line 18
    move-object v2, p3

    .line 19
    move-object v3, p5

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/L;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 23
    move-object p1, v4

    .line 24
    .line 25
    iput-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/m;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 26
    .line 27
    iput-object p6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/m;->k:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/m;->l:Ljava/lang/String;

    .line 30
    .line 31
    const-string p2, "CameraHelper"

    .line 32
    .line 33
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/m;->m:Ljava/lang/String;

    .line 34
    .line 35
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/camera/j;

    .line 36
    .line 37
    .line 38
    invoke-direct {p4, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/m;Lkotlin/coroutines/Continuation;)V

    .line 39
    const/4 p5, 0x3

    .line 40
    const/4 p6, 0x0

    .line 41
    const/4 p2, 0x0

    .line 42
    const/4 p3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public static final a(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 8
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/m;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/L;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    const-string v1, "CONTROLLER_CURRENT_SIDE"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/core/presentation/base/L;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 4
    invoke-virtual {v2, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "setting current side to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/L;->a(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/L;->c:Lkotlinx/coroutines/m0;

    .line 7
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/k;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/m;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_1
    return-void
.end method
