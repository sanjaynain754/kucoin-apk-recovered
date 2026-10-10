.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic p:[Lkotlin/reflect/KProperty;

.field public static final q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/sumsub/sns/internal/features/domain/ekyc/f;

.field public final e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public i:Z

.field public final j:Lkotlinx/coroutines/flow/w;

.field public final k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t0;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v0;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;

.field public final n:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;

.field public final o:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 3
    .line 4
    const-string v1, "legalInfo"

    .line 5
    .line 6
    const-string v2, "getLegalInfo()Ljava/lang/CharSequence;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "step"

    .line 15
    .line 16
    const-string v4, "getStep()Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainViewModel$Step;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x2

    .line 22
    .line 23
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    aput-object v1, v2, v3

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    aput-object v0, v2, v1

    .line 29
    .line 30
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    .line 31
    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    .line 33
    .line 34
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    .line 35
    return-void
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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/ekyc/f;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p6, p7}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->d:Lcom/sumsub/sns/internal/features/domain/ekyc/f;

    .line 12
    .line 13
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 14
    .line 15
    const-string p2, "KEY_LEGAL_INFO"

    .line 16
    const/4 p3, 0x0

    .line 17
    const/4 p4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p5, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 23
    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 25
    .line 26
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    .line 27
    .line 28
    const-string p6, "KEY_EID_STEP"

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p5, p6, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 32
    .line 33
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 34
    .line 35
    .line 36
    invoke-static {p3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 37
    move-result-object p4

    .line 38
    .line 39
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object p7

    .line 44
    .line 45
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->h:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5, p6, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    sget-object p5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    .line 52
    const/4 p6, 0x1

    .line 53
    .line 54
    aget-object p5, p5, p6

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;

    .line 61
    .line 62
    sget-object p5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result p5

    .line 67
    .line 68
    if-nez p5, :cond_0

    .line 69
    .line 70
    sget-object p5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result p5

    .line 75
    .line 76
    if-nez p5, :cond_0

    .line 77
    .line 78
    sget-object p5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result p1

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    :cond_0
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 89
    .line 90
    const-string p5, "SNSEidMain"

    .line 91
    .line 92
    const-string p6, "Init state is scanning, aborting scan"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p5, p6, p3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    sget-object p1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 101
    .line 102
    :cond_1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/L0;

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lkotlin/coroutines/Continuation;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2, p4, p7, p1}, Lkotlinx/coroutines/flow/g;->n(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/e;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 116
    const/4 v5, 0x3

    .line 117
    const/4 v6, 0x0

    .line 118
    .line 119
    const-wide/16 v1, 0x0

    .line 120
    .line 121
    const-wide/16 v3, 0x0

    .line 122
    .line 123
    .line 124
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 125
    move-result-object p3

    .line 126
    .line 127
    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P0;->b:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P0;

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2, p3, p4}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->j:Lkotlinx/coroutines/flow/w;

    .line 134
    .line 135
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t0;

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)V

    .line 139
    .line 140
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t0;

    .line 141
    .line 142
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v0;

    .line 143
    .line 144
    .line 145
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)V

    .line 146
    .line 147
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->l:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v0;

    .line 148
    .line 149
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)V

    .line 153
    .line 154
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->m:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;

    .line 155
    .line 156
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;

    .line 157
    .line 158
    .line 159
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)V

    .line 160
    .line 161
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->n:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;

    .line 162
    .line 163
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/u0;

    .line 164
    .line 165
    .line 166
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/u0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)V

    .line 167
    .line 168
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->o:Lkotlin/jvm/functions/Function1;

    .line 169
    return-void
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

.method public static a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 154
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidPinSelection:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 155
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidIdentInfo:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 156
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidNfcScan:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 157
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidPinChangeSuccess:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 158
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidNfcScan:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 159
    :cond_4
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;

    if-eqz v0, :cond_5

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidCanRequired:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 160
    :cond_5
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidNfcScan:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 161
    :cond_6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidUnlockSuccess:Lcom/sumsub/sns/internal/core/analytics/Screen;

    return-object p0

    .line 162
    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 8

    .line 43
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error starting auth. Restarting. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/o;->a(Ljava/lang/String;)V

    .line 45
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;

    .line 46
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;->a:Ljava/lang/String;

    .line 47
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;->b:Ljava/lang/String;

    .line 48
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    const/4 v2, 0x0

    .line 49
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F0;

    invoke-direct {v1, p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lde/authada/library/api/authentication/StartCallback;)V

    goto :goto_0

    .line 51
    :cond_0
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S;

    .line 52
    const-string/jumbo v5, "sns_eid_error_subtitle"

    const-string/jumbo v6, "sns_oops_action_goBack"

    const-string/jumbo v4, "sns_eid_error_title"

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 53
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;I)V
    .locals 8

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    .line 166
    const-string/jumbo v0, "sns_eid_error_title"

    :goto_0
    move-object v4, v0

    goto :goto_1

    .line 167
    :cond_0
    const-string/jumbo v0, "sns_eid_error_cardLost_title"

    goto :goto_0

    :goto_1
    and-int/lit8 v0, p5, 0x8

    if-eqz v0, :cond_1

    .line 168
    const-string/jumbo p3, "sns_eid_error_subtitle"

    :cond_1
    move-object v5, p3

    and-int/lit8 p3, p5, 0x10

    if-eqz p3, :cond_2

    .line 169
    const-string/jumbo p3, "sns_oops_action_goBack"

    :goto_2
    move-object v6, p3

    goto :goto_3

    .line 170
    :cond_2
    const-string/jumbo p3, "sns_oops_action_retry"

    goto :goto_2

    :goto_3
    and-int/lit8 p3, p5, 0x20

    if-eqz p3, :cond_3

    .line 171
    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S;

    :cond_3
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p4

    .line 172
    invoke-virtual/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    return-void
.end method

.method public static b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;

    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V
    .locals 12

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "On action "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 62
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 63
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 64
    const-string v3, "SNSEidMain"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_0

    return-void

    .line 65
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P;

    if-eqz v0, :cond_1

    .line 66
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/I0;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/I0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 67
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N;

    if-eqz v0, :cond_2

    .line 68
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H0;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 69
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S;

    if-eqz v0, :cond_3

    .line 70
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 71
    const-string v0, "Reset"

    invoke-virtual {p1, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return-void

    .line 73
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D;

    if-eqz v0, :cond_4

    .line 74
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lde/authada/library/api/authentication/StartCallback;)V

    return-void

    .line 75
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/x;

    if-eqz v0, :cond_5

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 76
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/r;

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    .line 77
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    .line 78
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 79
    const-string v0, "Cancel pin change"

    invoke-virtual {p1, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/a;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/a;

    .line 81
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 82
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return-void

    .line 83
    :cond_6
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v;

    if-eqz v0, :cond_7

    .line 84
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    .line 85
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 86
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 87
    const-string v0, "Cancel reading"

    invoke-virtual {p1, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 89
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/c;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/c;

    .line 90
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 91
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/L;

    if-eqz v0, :cond_8

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 92
    :cond_8
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/t;

    if-eqz v0, :cond_9

    .line 93
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 94
    const-string v0, "Cancel pin unlocking"

    invoke-virtual {p1, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/b;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/b;

    .line 96
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 97
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return-void

    .line 98
    :cond_9
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J;

    if-eqz v0, :cond_a

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J;

    .line 99
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J;->a:Lde/authada/library/api/SecretWrong;

    .line 100
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lde/authada/library/api/SecretWrong;)V

    return-void

    .line 101
    :cond_a
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F;

    if-eqz v0, :cond_b

    .line 102
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/m;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F;

    .line 103
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F;->a:Ljava/lang/String;

    .line 104
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/m;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 106
    :cond_b
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H;

    if-eqz v0, :cond_c

    .line 107
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H;

    .line 108
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H;->a:Ljava/lang/String;

    .line 109
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H;->b:Ljava/lang/String;

    .line 110
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/H;->c:Ljava/lang/String;

    .line 111
    invoke-direct {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 113
    :cond_c
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/z;

    const/4 v1, 0x1

    if-eqz v0, :cond_d

    .line 114
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->i:Z

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    .line 115
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    :cond_d
    move-object v5, p0

    .line 116
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B;

    if-eqz p1, :cond_e

    .line 117
    iput-boolean v1, v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->i:Z

    const/4 p1, 0x2

    .line 118
    invoke-static {p0, v1, v4, p1, v4}, Lcom/sumsub/sns/core/presentation/base/C;->finishWithResult$default(Lcom/sumsub/sns/core/presentation/base/C;ILandroid/os/Bundle;ILjava/lang/Object;)V

    return-void

    .line 119
    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lde/authada/library/api/authentication/StartCallback;)V
    .locals 8

    .line 1
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 2
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 3
    const-string v2, "Start"

    const/4 v3, 0x0

    const-string v4, "SNSEidMain"

    invoke-virtual {v1, v4, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 5
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a:Ljava/lang/String;

    if-nez v3, :cond_0

    .line 6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No mobile token"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "E_KYC"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No certificate"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "E_KYC"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 10
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No url"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "E_KYC"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 11
    :cond_2
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;

    .line 12
    new-instance v4, Ljava/net/URL;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b:Ljava/lang/String;

    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 13
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c:Ljava/lang/String;

    .line 14
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->o:Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    .line 15
    invoke-direct/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;-><init>(Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Lde/authada/library/api/authentication/StartCallback;Lkotlin/jvm/functions/Function1;)V

    .line 16
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V
    .locals 6

    .line 173
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/n;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    .line 174
    invoke-virtual/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 175
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p1

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/K0;

    const/4 p3, 0x0

    invoke-direct {p4, p0, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;Lkotlin/coroutines/Continuation;)V

    const/4 p5, 0x3

    const/4 p6, 0x0

    const/4 p2, 0x0

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "SNSEidMain"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 17
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    const-string p2, "Start reading, card pin is null. Aborting."

    invoke-virtual {p1, v0, p2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {v2, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    if-eqz p2, :cond_2

    .line 22
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start reading, canIsNull="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 23
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 25
    invoke-virtual {v4, v0, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 27
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v3, v2

    .line 28
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 29
    invoke-static {v4}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 30
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v2, p1

    goto :goto_4

    .line 31
    :cond_3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    new-instance v0, Lde/authada/library/api/authentication/Pin;

    invoke-direct {v0, p1}, Lde/authada/library/api/authentication/Pin;-><init>([I)V

    if-eqz p2, :cond_5

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    :goto_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_4

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 34
    invoke-static {v1}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 35
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 36
    :cond_4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    new-instance v1, Lde/authada/library/api/Can;

    invoke-direct {v1, p1}, Lde/authada/library/api/Can;-><init>([I)V

    .line 37
    :cond_5
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;

    .line 38
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->l:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/v0;

    .line 39
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->o:Lkotlin/jvm/functions/Function1;

    .line 40
    invoke-direct {p1, v0, v1, p2, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;-><init>(Lde/authada/library/api/authentication/Pin;Lde/authada/library/api/Can;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/i;Lkotlin/jvm/functions/Function1;)V

    .line 41
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_4
    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 42
    const-string v3, "E_KYC"

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 4

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "On pin entered, need can: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 56
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    const-string v2, "SNSEidMain"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 58
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/F;-><init>(Ljava/lang/String;)V

    .line 59
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return-void

    .line 60
    :cond_1
    invoke-virtual {p0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V
    .locals 10

    .line 163
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/o;->a(Ljava/lang/String;)V

    .line 165
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J0;

    const/4 v9, 0x0

    move-object v3, p0

    move-object v7, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v8, p5

    invoke-direct/range {v2 .. v9}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 7

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Try finish, reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 121
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 122
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 123
    const-string v3, "SNSEidMain"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/u;

    const/4 v0, 0x1

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->i:Z

    if-eqz p1, :cond_0

    goto/16 :goto_1

    .line 125
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;

    .line 126
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v0

    .line 127
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_6

    .line 128
    instance-of v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;

    if-nez v5, :cond_6

    .line 129
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d0;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 130
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j0;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 131
    :cond_2
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n0;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 132
    invoke-virtual {p0, v6}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    .line 133
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 134
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 135
    const-string v1, "Cancel reading"

    invoke-virtual {p1, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 137
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/c;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/c;

    .line 138
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return v6

    .line 139
    :cond_3
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 140
    invoke-virtual {p0, v6}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    .line 141
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 142
    const-string v0, "Cancel pin change"

    invoke-virtual {p1, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/a;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/a;

    .line 144
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 145
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return v6

    .line 146
    :cond_4
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 147
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 148
    const-string v1, "Cancel pin unlocking"

    invoke-virtual {p1, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/b;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/b;

    .line 150
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 151
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return v6

    .line 152
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 153
    :cond_6
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    return v6

    :cond_7
    :goto_1
    return v0
.end method

.method public final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 5
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lde/authada/library/api/SecretWrong;)V
    .locals 4

    .line 7
    sget-object v0, Lde/authada/library/api/SecretWrong;->CAN_WRONG_CAN_PIN_REQUIRED:Lde/authada/library/api/SecretWrong;

    if-eq p1, v0, :cond_1

    .line 8
    sget-object v0, Lde/authada/library/api/SecretWrong;->PIN_WRONG_ONE_PIN_TRY_LEFT_CAN_PIN_REQUIRED:Lde/authada/library/api/SecretWrong;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 9
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Request pin enter, triesLeft="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", needCan="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 11
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 12
    const-string v2, "SNSEidMain"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o;

    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o;-><init>(Z)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final c(Z)V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Set scanning state: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    .line 23
    const-string v2, "SNSEidMain"

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/G0;

    .line 34
    .line 35
    .line 36
    invoke-direct {v7, p1, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/G0;-><init>(ZLcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lkotlin/coroutines/Continuation;)V

    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 44
    return-void
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

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "E_KYC"

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

.method public final getViewState()Lkotlinx/coroutines/flow/r;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->j:Lkotlinx/coroutines/flow/w;

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

.method public final onCleared()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    .line 9
    const-string v1, "ViewModel cleared"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    const-string v3, "SNSEidMain"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    return-void
    .line 17
.end method

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/n;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    .line 14
    const-string v0, "Reset"

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    const-string v2, "SNSEidMain"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 30
    return-void
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
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
