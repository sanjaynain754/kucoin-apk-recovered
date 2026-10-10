.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic k:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/model/common/A2;

.field public final c:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

.field public final d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

.field public final i:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

.field public final j:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 3
    .line 4
    const-string v1, "idDocType"

    .line 5
    .line 6
    const-string v2, "getIdDocType()Ljava/lang/String;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "idDocSetType"

    .line 14
    .line 15
    const-string v4, "getIdDocSetType()Ljava/lang/String;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "attemptsToSkip"

    .line 22
    .line 23
    const-string v5, "getAttemptsToSkip()I"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    const-string v5, "attemptsToFallback"

    .line 30
    .line 31
    const-string v6, "getAttemptsToFallback()I"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 35
    move-result-object v0

    .line 36
    const/4 v5, 0x4

    .line 37
    .line 38
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 39
    .line 40
    aput-object v1, v5, v3

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    aput-object v2, v5, v1

    .line 44
    const/4 v1, 0x2

    .line 45
    .line 46
    aput-object v4, v5, v1

    .line 47
    const/4 v1, 0x3

    .line 48
    .line 49
    aput-object v0, v5, v1

    .line 50
    .line 51
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->k:[Lkotlin/reflect/KProperty;

    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/data/model/common/A2;Lcom/sumsub/sns/internal/features/domain/mrtd/y;Lcom/sumsub/sns/internal/features/domain/mrtd/G;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
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
    invoke-direct {p0, p6, p7, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->b:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 14
    .line 15
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->c:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 16
    .line 17
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->f()Ljava/lang/String;

    .line 21
    move-result-object p5

    .line 22
    .line 23
    const-string p6, "STATE_IDDOCTYPE"

    .line 24
    const/4 p7, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {p2, p1, p6, p5, p7}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 28
    .line 29
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 30
    .line 31
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->d()Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 35
    move-result-object p5

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 39
    move-result-object p5

    .line 40
    .line 41
    iget-object p5, p5, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 42
    .line 43
    const-string p6, "STATE_IDDOCSETTYPE"

    .line 44
    .line 45
    .line 46
    invoke-direct {p2, p1, p6, p5, p7}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 47
    .line 48
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 49
    .line 50
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->k()Z

    .line 54
    move-result p5

    .line 55
    .line 56
    if-eqz p5, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->j()I

    .line 60
    move-result p5

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :cond_0
    const p5, 0x7fffffff

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    move-result-object p5

    .line 69
    .line 70
    const-string p6, "STATE_ATTEMPTS_TO_SKIP"

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, p1, p6, p5, p7}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 74
    .line 75
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 76
    .line 77
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->i()I

    .line 81
    move-result p5

    .line 82
    .line 83
    .line 84
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    move-result-object p5

    .line 86
    .line 87
    const-string p6, "STATE_ATTEMPTS_TO_FALLBACK"

    .line 88
    .line 89
    .line 90
    invoke-direct {p2, p1, p6, p5, p7}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 91
    .line 92
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->g:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 93
    .line 94
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p0;

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V

    .line 104
    move-object v2, p1

    .line 105
    move-object v3, p3

    .line 106
    move-object v4, p4

    .line 107
    .line 108
    .line 109
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/presentation/nfc/l;-><init>(Lkotlinx/coroutines/m0;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/A2;Lcom/sumsub/sns/internal/features/domain/mrtd/y;Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 112
    .line 113
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 114
    .line 115
    .line 116
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 117
    move-result-object p2

    .line 118
    .line 119
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q0;

    .line 120
    .line 121
    .line 122
    invoke-direct {p3, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V

    .line 123
    .line 124
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r0;

    .line 125
    .line 126
    .line 127
    invoke-direct {p4}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/r0;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-direct {p1, p2, v2, p3, p4}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;-><init>(Lkotlinx/coroutines/m0;Landroidx/lifecycle/SavedStateHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->i:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 133
    .line 134
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;

    .line 135
    .line 136
    .line 137
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V

    .line 138
    .line 139
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->j:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 143
    move-result-object p2

    .line 144
    .line 145
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/H;

    .line 146
    const/4 p1, 0x0

    .line 147
    .line 148
    .line 149
    invoke-direct {p5, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Lkotlin/coroutines/Continuation;)V

    .line 150
    const/4 p6, 0x3

    .line 151
    const/4 p7, 0x0

    .line 152
    const/4 p3, 0x0

    .line 153
    const/4 p4, 0x0

    .line 154
    .line 155
    .line 156
    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 157
    return-void
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

.method public static final a(Lkotlin/reflect/KFunction;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 4
    check-cast p0, Lkotlin/jvm/functions/Function1;

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->k:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)Lkotlin/Unit;
    .locals 7

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v2

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;

    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-direct {v4, p0, v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Z)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->k:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 3
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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


# virtual methods
.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 8

    .line 1
    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 7
    .line 8
    const-string v0, "SNSMRTDReadViewModel"

    .line 9
    .line 10
    const-string v1, "buildViewStateFlow: no strings or config"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->a(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string p1, "Empty strings"

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 23
    .line 24
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->k:[Lkotlin/reflect/KProperty;

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aget-object v0, v0, v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 31
    move-result-object p1

    .line 32
    move-object v4, p1

    .line 33
    .line 34
    check-cast v4, Ljava/lang/String;

    .line 35
    const/4 v6, 0x4

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v2, p0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lkotlinx/coroutines/flow/g;->C()Lkotlinx/coroutines/flow/e;

    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_0
    move-object v2, p0

    .line 48
    .line 49
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/W;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/W;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o0;

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/o0;-><init>(Lkotlin/reflect/KFunction;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V

    .line 58
    .line 59
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 60
    .line 61
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->k:Lkotlinx/coroutines/flow/w;

    .line 62
    .line 63
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/V;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v1, v0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/V;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/W;Lkotlin/jvm/functions/Function2;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V

    .line 67
    return-object v3
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

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "intent, "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const-string v2, "SNSMRTDReadViewModel"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/L;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/L;

    .line 31
    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/K;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/K;

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    const/4 p1, 0x1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;

    .line 53
    const/4 v2, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct {v3, p0, v2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Z)V

    .line 57
    const/4 v4, 0x2

    .line 58
    const/4 v5, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 62
    return-void

    .line 63
    .line 64
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/J;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/J;

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->c()V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/I;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/I;

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result p1

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->b()V

    .line 90
    return-void

    .line 91
    .line 92
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 96
    throw p1

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 100
    return-void
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
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->k:Lkotlinx/coroutines/flow/w;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    instance-of v0, v0, Lcom/sumsub/sns/internal/core/presentation/nfc/h;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->b:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->k()Z

    .line 26
    move-result p1

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->i:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 34
    .line 35
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->e:[Lkotlin/reflect/KProperty;

    .line 36
    .line 37
    aget-object v1, v1, v0

    .line 38
    .line 39
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;

    .line 62
    const/4 p1, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, p0, p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;Z)V

    .line 66
    const/4 v5, 0x2

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 72
    :goto_0
    return v0

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 76
    move-result p1

    .line 77
    return p1
    .line 78
    .line 79
    .line 80
    .line 81
.end method
