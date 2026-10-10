.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/c2;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic x:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/X;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/prooface/i2;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/android/g;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public j:Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;

.field public final k:Lkotlinx/coroutines/flow/m;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public m:Lcom/sumsub/sns/internal/features/presentation/prooface/d;

.field public final n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

.field public final o:Lkotlinx/coroutines/flow/m;

.field public final p:Lkotlinx/coroutines/flow/m;

.field public final q:Lkotlinx/coroutines/flow/m;

.field public final r:Lkotlinx/coroutines/flow/w;

.field public final s:Lkotlinx/coroutines/flow/n;

.field public final t:Lkotlinx/coroutines/flow/n;

.field public final u:Lkotlinx/coroutines/x1;

.field public final v:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

.field public final w:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getLivenessShowSettings()Z"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 6
    .line 7
    const-string v3, "livenessShowSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->x:[Lkotlin/reflect/KProperty;

    .line 19
    return-void
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
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;Lcom/sumsub/sns/internal/features/presentation/prooface/i2;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/core/domain/facedetector/e;)V
    .locals 6

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
    invoke-direct {p0, p4, p5, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->b:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 14
    .line 15
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/i2;

    .line 20
    .line 21
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->f:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/core/presentation/android/g;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 27
    .line 28
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->g:Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 29
    .line 30
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 31
    .line 32
    sget-object p3, Lcom/sumsub/sns/internal/ff/a;->m:Lcom/sumsub/sns/internal/ff/core/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 36
    move-result p3

    .line 37
    .line 38
    .line 39
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    move-result-object p3

    .line 41
    .line 42
    const-string p4, "livenessShowSettings"

    .line 43
    const/4 p5, 0x1

    .line 44
    .line 45
    .line 46
    invoke-direct {p2, p1, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 47
    .line 48
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->h:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 49
    .line 50
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->i:Lkotlinx/coroutines/flow/n;

    .line 57
    const/4 p2, 0x0

    .line 58
    const/4 p3, 0x0

    .line 59
    const/4 p4, 0x7

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 63
    move-result-object p6

    .line 64
    .line 65
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->k:Lkotlinx/coroutines/flow/m;

    .line 66
    .line 67
    sget-object p7, Lcom/sumsub/sns/internal/features/presentation/prooface/f1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/f1;

    .line 68
    .line 69
    .line 70
    invoke-static {p7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 71
    move-result-object p7

    .line 72
    .line 73
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->l:Lkotlinx/coroutines/flow/n;

    .line 74
    .line 75
    new-instance p7, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    .line 76
    .line 77
    .line 78
    invoke-direct {p7, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;)V

    .line 79
    .line 80
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    .line 81
    .line 82
    .line 83
    invoke-static {p2, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 84
    move-result-object p7

    .line 85
    .line 86
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->o:Lkotlinx/coroutines/flow/m;

    .line 87
    .line 88
    .line 89
    invoke-static {p2, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 90
    move-result-object p8

    .line 91
    .line 92
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->p:Lkotlinx/coroutines/flow/m;

    .line 93
    .line 94
    .line 95
    invoke-static {p2, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 96
    move-result-object p4

    .line 97
    .line 98
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->q:Lkotlinx/coroutines/flow/m;

    .line 99
    .line 100
    new-instance p8, Lcom/sumsub/sns/internal/features/presentation/prooface/n1;

    .line 101
    .line 102
    .line 103
    invoke-direct {p8, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/n1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p7, p8}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 107
    move-result-object p7

    .line 108
    .line 109
    new-instance p8, Lcom/sumsub/sns/internal/features/presentation/prooface/q1;

    .line 110
    .line 111
    .line 112
    invoke-direct {p8, p4}, Lcom/sumsub/sns/internal/features/presentation/prooface/q1;-><init>(Lkotlinx/coroutines/flow/m;)V

    .line 113
    const/4 p4, 0x2

    .line 114
    .line 115
    new-array p4, p4, [Lkotlinx/coroutines/flow/e;

    .line 116
    .line 117
    aput-object p7, p4, p2

    .line 118
    .line 119
    aput-object p8, p4, p5

    .line 120
    .line 121
    .line 122
    invoke-static {p4}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/prooface/r1;

    .line 126
    .line 127
    .line 128
    invoke-direct {p4, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/r1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p2, p4}, Lkotlinx/coroutines/flow/g;->T(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 132
    move-result-object p2

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 136
    move-result-object p4

    .line 137
    .line 138
    sget-object p5, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p5}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    .line 142
    move-result-object p5

    .line 143
    .line 144
    sget-object p7, Lcom/sumsub/sns/internal/features/presentation/prooface/K0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/K0;

    .line 145
    .line 146
    .line 147
    invoke-static {p2, p4, p5, p7}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 148
    move-result-object p2

    .line 149
    .line 150
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->r:Lkotlinx/coroutines/flow/w;

    .line 151
    .line 152
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;

    .line 153
    .line 154
    .line 155
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->s:Lkotlinx/coroutines/flow/n;

    .line 159
    .line 160
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->t:Lkotlinx/coroutines/flow/n;

    .line 161
    .line 162
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 163
    .line 164
    .line 165
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;)V

    .line 166
    .line 167
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->v:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 168
    .line 169
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    .line 170
    .line 171
    .line 172
    invoke-direct {p4, p9, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/e;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;)V

    .line 173
    .line 174
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->w:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    .line 175
    .line 176
    .line 177
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/G0;

    .line 181
    .line 182
    .line 183
    invoke-direct {v3, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/G0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 184
    const/4 v4, 0x3

    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v1, 0x0

    .line 187
    const/4 v2, 0x0

    .line 188
    .line 189
    .line 190
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 191
    move-result-object p2

    .line 192
    .line 193
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->u:Lkotlinx/coroutines/x1;

    .line 194
    .line 195
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/prooface/F1;

    .line 196
    .line 197
    .line 198
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/F1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 199
    .line 200
    .line 201
    invoke-static {p6, p1, p2}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/prooface/J1;

    .line 205
    .line 206
    .line 207
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/J1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 208
    .line 209
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/M1;

    .line 210
    .line 211
    .line 212
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/M1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/J1;)V

    .line 213
    .line 214
    .line 215
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 216
    move-result-object p1

    .line 217
    .line 218
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/prooface/H0;

    .line 219
    .line 220
    .line 221
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/H0;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/g;->P(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    .line 228
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 229
    move-result-object p2

    .line 230
    .line 231
    .line 232
    invoke-static {p1, p2, p3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 233
    .line 234
    .line 235
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 236
    move-result-object p4

    .line 237
    .line 238
    new-instance p7, Lcom/sumsub/sns/internal/features/presentation/prooface/J0;

    .line 239
    .line 240
    .line 241
    invoke-direct {p7, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/J0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 242
    const/4 p8, 0x3

    .line 243
    const/4 p9, 0x0

    .line 244
    const/4 p5, 0x0

    .line 245
    const/4 p6, 0x0

    .line 246
    .line 247
    .line 248
    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 249
    return-void
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/z1;->c:I

    .line 4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 5
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez p1, :cond_4

    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Error getting config"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/F;-><init>(Ljava/lang/Exception;)V

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 9
    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;FLkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->j:Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;

    if-eqz p0, :cond_0

    .line 27
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/d0;

    invoke-interface {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/d0;->a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    .line 28
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 29
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->P:Lcom/sumsub/sns/internal/ff/core/a;

    .line 4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 5
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 8
    :cond_5
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O1;->c:I

    .line 9
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_6

    goto :goto_2

    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne p0, v1, :cond_7

    :goto_3
    return-object v1

    .line 10
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->c:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_3

    .line 45
    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p0

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->l:Lkotlinx/coroutines/flow/n;

    .line 62
    .line 63
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/f1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/f1;

    .line 64
    .line 65
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->c:I

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    goto :goto_2

    .line 73
    .line 74
    :cond_4
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->s:Lkotlinx/coroutines/flow/n;

    .line 75
    .line 76
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;

    .line 77
    .line 78
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P1;->c:I

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    move-result-object p0

    .line 83
    .line 84
    if-ne p0, v1, :cond_5

    .line 85
    :goto_2
    return-object v1

    .line 86
    .line 87
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 88
    return-object p0
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
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/d;

    .line 18
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/g1;

    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 20
    const-string/jumbo v4, "sns_facescan_hint_facePosition"

    invoke-virtual {p1, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;

    .line 22
    invoke-direct {v2, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/prooface/g1;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/prooface/session/y;)V

    .line 23
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->l:Lkotlinx/coroutines/flow/n;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G1;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 24
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->w:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/b3;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/b3;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)V

    invoke-virtual {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/prooface/Y0;)V
    .locals 8

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewModel: intent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 31
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/S0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/S0;

    .line 32
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/S0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/x;

    .line 33
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/C1;

    invoke-direct {v5, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/C1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 34
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/T0;

    if-eqz v0, :cond_1

    .line 35
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/D1;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/D1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 36
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/R0;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/R0;

    .line 37
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/R0;->a:Ljava/lang/Exception;

    .line 38
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/data/model/prooface/E;-><init>(Ljava/lang/Exception;)V

    .line 39
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    .line 40
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    return-void

    .line 41
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/W0;

    if-eqz v0, :cond_3

    .line 42
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 43
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/X0;

    if-eqz v0, :cond_4

    .line 44
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/a2;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/a2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 45
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/V0;

    if-eqz v0, :cond_5

    .line 46
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 47
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/Q0;

    if-eqz v0, :cond_6

    .line 48
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/B1;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/B1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 49
    :cond_6
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/U0;

    if-eqz p1, :cond_7

    .line 50
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/E1;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/E1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 51
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .line 10
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/w;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/presentation/base/w;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ViewModel: ERROR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v0, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v0}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v0

    .line 14
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    const-string v2, "Prooface"

    invoke-virtual {v0, v2, v1, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->m:Lcom/sumsub/sns/internal/features/presentation/prooface/d;

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->f:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->a:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b2;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    :goto_1
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/d;

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->m:Lcom/sumsub/sns/internal/features/presentation/prooface/d;

    :cond_4
    return-object p1
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->l:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object p1
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/Y0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/Y0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Lcom/sumsub/sns/internal/features/presentation/prooface/Y0;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v1, "ViewModel: Unknown intent: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 31
    return-void
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
.end method

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "onErrorCancelled "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 25
    .line 26
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/prooface/H;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/H;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    .line 32
    return-void
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

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "ViewModel: onHandleError "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 24
    const/4 p1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;

    .line 34
    const/4 p1, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/Y1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 38
    const/4 v4, 0x3

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 45
    return-void
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
