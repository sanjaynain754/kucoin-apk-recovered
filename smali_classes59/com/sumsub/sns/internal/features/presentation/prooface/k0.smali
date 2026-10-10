.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/k0;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic M:[Lkotlin/reflect/KProperty;

.field public static final N:Ljava/text/SimpleDateFormat;


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public D:Ljava/lang/String;

.field public E:Landroid/graphics/Bitmap;

.field public F:Z

.field public final G:Lkotlinx/coroutines/flow/n;

.field public final H:Lkotlinx/coroutines/flow/n;

.field public final I:Lkotlinx/coroutines/flow/n;

.field public final J:Lkotlinx/coroutines/flow/n;

.field public final K:Lkotlinx/coroutines/x1;

.field public final L:Lcom/sumsub/sns/internal/core/common/a;

.field public final a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

.field public final b:Lcom/sumsub/sns/internal/features/data/model/common/X;

.field public final c:Lxg0/a;

.field public final d:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

.field public final e:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

.field public final f:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

.field public final g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final i:Lcom/sumsub/sns/internal/fingerprint/c;

.field public final j:Lcom/sumsub/sns/internal/util/camera/d;

.field public k:Ljava/util/Timer;

.field public l:Ljava/util/Timer;

.field public final m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public final o:Lkotlinx/coroutines/flow/m;

.field public final p:Lkotlinx/coroutines/m1;

.field public q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

.field public r:Z

.field public s:Lkotlinx/coroutines/x1;

.field public t:Landroidx/camera/core/ImageProxy;

.field public u:Z

.field public final v:Lkotlin/Lazy;

.field public final w:Lcom/sumsub/sns/internal/core/presentation/android/g;

.field public final x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final y:Lcom/sumsub/sns/internal/features/presentation/prooface/b0;

.field public z:I


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
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

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
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->M:[Lkotlin/reflect/KProperty;

    .line 19
    .line 20
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ss"

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 29
    .line 30
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->N:Ljava/text/SimpleDateFormat;

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
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lcom/sumsub/sns/internal/features/data/model/common/X;Lxg0/a;Lcom/sumsub/sns/internal/features/data/network/prooface/a;Lcom/sumsub/sns/internal/features/data/network/prooface/o;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/fingerprint/c;Lcom/sumsub/sns/internal/util/camera/d;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p8, p9}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->c:Lxg0/a;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->d:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

    .line 12
    .line 13
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->e:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 14
    .line 15
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 16
    .line 17
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 18
    .line 19
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 20
    .line 21
    move-object/from16 p2, p10

    .line 22
    .line 23
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->i:Lcom/sumsub/sns/internal/fingerprint/c;

    .line 24
    .line 25
    move-object/from16 p2, p11

    .line 26
    .line 27
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->j:Lcom/sumsub/sns/internal/util/camera/d;

    .line 28
    .line 29
    sget-object p2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 30
    .line 31
    sget-object p3, Lcom/sumsub/sns/internal/core/common/k0;->d:Ljava/lang/String;

    .line 32
    .line 33
    sget-object p4, Lcom/sumsub/sns/internal/core/common/k0;->b:Ljava/lang/String;

    .line 34
    .line 35
    sget p5, Lcom/sumsub/sns/internal/core/common/k0;->c:I

    .line 36
    .line 37
    new-instance p6, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string/jumbo p7, "msdk2 / 1.46.0 (Android "

    .line 44
    .line 45
    .line 46
    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string p2, ") - App "

    .line 52
    .line 53
    .line 54
    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string p2, " "

    .line 60
    .line 61
    .line 62
    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string p2, " / "

    .line 68
    .line 69
    .line 70
    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->m:Ljava/lang/String;

    .line 80
    .line 81
    const-string p2, ""

    .line 82
    .line 83
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->n:Ljava/lang/String;

    .line 84
    const/4 p3, 0x7

    .line 85
    const/4 p4, 0x0

    .line 86
    const/4 p5, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static {p4, p4, p5, p3, p5}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 90
    move-result-object p3

    .line 91
    .line 92
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->o:Lkotlinx/coroutines/flow/m;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 96
    move-result-object p3

    .line 97
    .line 98
    .line 99
    invoke-static {p3}, Lkotlinx/coroutines/o1;->c(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;

    .line 100
    move-result-object p7

    .line 101
    .line 102
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->p:Lkotlinx/coroutines/m1;

    .line 103
    .line 104
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/prooface/d3;

    .line 105
    .line 106
    .line 107
    invoke-direct {p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/d3;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 111
    move-result-object p3

    .line 112
    .line 113
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->v:Lkotlin/Lazy;

    .line 114
    .line 115
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 116
    .line 117
    .line 118
    invoke-direct {p3, p1}, Lcom/sumsub/sns/internal/core/presentation/android/g;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 119
    .line 120
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->w:Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 121
    .line 122
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 123
    .line 124
    sget-object p4, Lcom/sumsub/sns/internal/ff/a;->m:Lcom/sumsub/sns/internal/ff/core/a;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p4}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 128
    move-result p4

    .line 129
    .line 130
    .line 131
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    move-result-object p4

    .line 133
    .line 134
    const-string p6, "livenessShowSettings"

    .line 135
    const/4 v0, 0x1

    .line 136
    .line 137
    .line 138
    invoke-direct {p3, p1, p6, p4, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 139
    .line 140
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 141
    .line 142
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/b0;

    .line 143
    .line 144
    .line 145
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;)V

    .line 146
    .line 147
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->y:Lcom/sumsub/sns/internal/features/presentation/prooface/b0;

    .line 148
    .line 149
    .line 150
    const p1, 0x7fffffff

    .line 151
    .line 152
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    .line 153
    .line 154
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->D:Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    .line 161
    .line 162
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->H:Lkotlinx/coroutines/flow/n;

    .line 163
    .line 164
    .line 165
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->I:Lkotlinx/coroutines/flow/n;

    .line 169
    .line 170
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->J:Lkotlinx/coroutines/flow/n;

    .line 171
    .line 172
    new-instance p1, Lcom/sumsub/sns/internal/core/common/a;

    .line 173
    .line 174
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 175
    .line 176
    .line 177
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/core/common/a;-><init>(Landroid/graphics/Bitmap$Config;)V

    .line 178
    .line 179
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->L:Lcom/sumsub/sns/internal/core/common/a;

    .line 180
    .line 181
    .line 182
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 183
    move-result-object p6

    .line 184
    .line 185
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/t;

    .line 186
    .line 187
    .line 188
    invoke-direct {p1, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/prooface/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 189
    const/4 p2, 0x2

    .line 190
    const/4 p3, 0x0

    .line 191
    const/4 p4, 0x0

    .line 192
    move-object p9, p1

    .line 193
    .line 194
    move/from16 p10, p2

    .line 195
    .line 196
    move-object/from16 p11, p3

    .line 197
    move-object p8, p4

    .line 198
    .line 199
    .line 200
    invoke-static/range {p6 .. p11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 201
    .line 202
    .line 203
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/v;

    .line 207
    .line 208
    .line 209
    invoke-direct {v3, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/prooface/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 210
    const/4 v4, 0x3

    .line 211
    const/4 v5, 0x0

    .line 212
    const/4 v1, 0x0

    .line 213
    const/4 v2, 0x0

    .line 214
    .line 215
    .line 216
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 217
    move-result-object p1

    .line 218
    .line 219
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->K:Lkotlinx/coroutines/x1;

    .line 220
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;II)Landroid/graphics/Bitmap;
    .locals 0

    .line 205
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->L:Lcom/sumsub/sns/internal/core/common/a;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/core/common/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    .line 12
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->s:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->s:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;

    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->q:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 13
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->s:I

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-wide v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->p:J

    iget v6, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->o:I

    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->n:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->m:Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->l:Ljava/lang/Integer;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->k:Ljava/lang/Integer;

    iget-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->j:Ljava/lang/String;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->i:Ljava/lang/String;

    iget-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->h:Ljava/lang/Integer;

    iget-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->g:Ljava/lang/Integer;

    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->f:Ljava/lang/String;

    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->e:Ljava/lang/String;

    move-object/from16 v16, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->d:Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->c:Lxg0/a;

    move-object/from16 p2, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->b:Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->a:[B

    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v13

    move-object v13, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v12

    move-object v12, v9

    move-object/from16 v9, v18

    move-object/from16 v18, v11

    move-object v11, v10

    move-object/from16 v10, v18

    move-wide/from16 v18, v3

    move-object v4, v5

    move-object v5, v7

    move-object v7, v14

    move-object v14, v15

    move-object/from16 v3, p1

    move-object v15, v0

    move-object/from16 v0, p2

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 v4, 0x0

    .line 14
    :try_start_0
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->D:Ljava/lang/String;

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v7

    .line 15
    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a(J)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v5, v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    const-string v5, ""

    .line 17
    :cond_3
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    const-string v8, "Prooface"

    invoke-virtual {v7, v8, v5, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/Throwable;)V

    .line 21
    sget-object v0, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a(J)[B

    move-result-object v0

    goto :goto_1

    .line 22
    :goto_2
    aget-byte v7, v5, v4

    .line 23
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v8

    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 25
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    .line 26
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 27
    sget-object v11, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v12, 0x5c

    move-object/from16 v13, p1

    invoke-virtual {v13, v11, v12, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 28
    new-instance v11, Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    invoke-direct {v11, v12}, Lcom/sumsub/sns/internal/core/domain/facedetector/o;-><init>([B)V

    .line 29
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 30
    iget v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    iget v12, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->z:I

    if-ne v0, v12, :cond_4

    .line 31
    :try_start_1
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const v12, 0x3e4ccccd    # 0.2f

    .line 32
    invoke-virtual {v0, v12, v12}, Landroid/graphics/Matrix;->setScale(FF)V

    const/high16 v12, -0x40800000    # -1.0f

    const/high16 v14, 0x3f800000    # 1.0f

    .line 33
    invoke-virtual {v0, v12, v14}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 34
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v19

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v20

    const/16 v22, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v21, v0

    move-object/from16 v16, v13

    invoke-static/range {v16 .. v22}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/r;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->E:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    .line 36
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/Throwable;)V

    .line 37
    :cond_4
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 38
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->c:Lxg0/a;

    .line 39
    iget-object v12, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->m:Ljava/lang/String;

    .line 40
    iget-object v13, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->n:Ljava/lang/String;

    .line 41
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/h;->b()Ljava/lang/String;

    move-result-object v14

    .line 42
    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v15

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v15

    .line 43
    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v6

    move/from16 v16, v4

    .line 44
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->N:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v18

    move/from16 v19, v10

    invoke-virtual/range {v18 .. v18}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 45
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v16, v3

    .line 46
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    move-wide/from16 v18, v8

    .line 47
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    move-object/from16 v9, p3

    invoke-direct {v8, v9}, Lcom/sumsub/sns/internal/features/data/model/prooface/l;-><init>(Ljava/lang/String;)V

    .line 48
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    if-eqz v9, :cond_5

    .line 49
    iget-object v1, v9, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    .line 50
    :goto_4
    iput-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->a:[B

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->b:Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->c:Lxg0/a;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->d:Ljava/lang/String;

    iput-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->e:Ljava/lang/String;

    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->f:Ljava/lang/String;

    iput-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->g:Ljava/lang/Integer;

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->h:Ljava/lang/Integer;

    const-string/jumbo v1, "user"

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->i:Ljava/lang/String;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->j:Ljava/lang/String;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->k:Ljava/lang/Integer;

    iput-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->l:Ljava/lang/Integer;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->m:Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->n:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    iput v7, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->o:I

    move-object/from16 p2, v3

    move-object/from16 p1, v4

    move-wide/from16 v3, v18

    iput-wide v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->p:J

    move-object/from16 p3, v1

    const/4 v1, 0x1

    iput v1, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/Q;->s:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, v16

    if-ne v2, v3, :cond_6

    goto/16 :goto_6

    :cond_6
    move v3, v7

    move-object v7, v6

    move v6, v3

    move-object/from16 v16, v2

    move-object v2, v5

    move-object v3, v12

    move-object v4, v13

    move-object v5, v14

    move-object v14, v15

    move-object v12, v8

    move-object v13, v9

    move-object v15, v11

    move-object/from16 v9, p1

    move-object/from16 v11, p2

    move-object/from16 v8, p3

    .line 51
    :goto_5
    check-cast v16, Ljava/util/Map;

    move-object/from16 v17, v2

    .line 52
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/x;

    move-object/from16 v23, v15

    move v15, v6

    move-object v6, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v23

    move-object/from16 v25, v17

    move-wide/from16 v23, v18

    invoke-direct/range {v2 .. v14}, Lcom/sumsub/sns/internal/features/data/model/prooface/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sumsub/sns/internal/features/data/model/prooface/l;Lcom/sumsub/sns/internal/features/data/model/prooface/c;Ljava/util/Map;)V

    .line 53
    invoke-interface {v0}, Ltg0/n;->getSerializersModule()Lyg0/a;

    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/prooface/x;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/w;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/prooface/w;->serializer()Ltg0/d;

    move-result-object v3

    check-cast v3, Ltg0/p;

    invoke-interface {v0, v3, v2}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 54
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 55
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    if-eqz v2, :cond_7

    .line 56
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    .line 57
    iput-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 58
    :cond_7
    sget-object v2, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    array-length v2, v0

    int-to-byte v3, v15

    move-wide/from16 v4, v23

    invoke-static {v0, v2, v3, v4, v5}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a([BIBJ)[B

    move-result-object v0

    move-object/from16 v11, v16

    .line 59
    iget-object v2, v11, Lcom/sumsub/sns/internal/core/domain/facedetector/o;->a:[B

    .line 60
    array-length v6, v2

    invoke-static {v2, v6, v3, v4, v5}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a([BIBJ)[B

    move-result-object v2

    .line 61
    array-length v3, v0

    array-length v4, v2

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x8

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 62
    array-length v4, v0

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 63
    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 64
    array-length v0, v2

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 65
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 66
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 67
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->d:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

    move-object/from16 v2, v25

    invoke-virtual {v1, v0, v2}, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a([B[B)[B

    move-result-object v0

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/prooface/A;

    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->livenessFragment:Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->getType()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/u;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/u;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x1a

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4, v2, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/A;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/P;Lcom/sumsub/sns/internal/features/data/model/prooface/u;I)V

    :goto_6
    return-object v3
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lcom/sumsub/sns/internal/features/data/network/prooface/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/O;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/J;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    .line 4
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->g:Ljava/lang/String;

    goto :goto_1

    :cond_5
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_7

    .line 5
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->b(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    move-object v2, p2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/I;

    :cond_7
    if-eqz v2, :cond_8

    move-object p2, v2

    goto :goto_4

    .line 6
    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_5

    .line 7
    :cond_9
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/prooface/J;

    .line 8
    :goto_4
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 9
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/O;->e:I

    const-string/jumbo v2, "sns_facescan_action_retry"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    move-object v6, p2

    move-object p2, p0

    move-object p0, p1

    move-object p1, v6

    .line 10
    :goto_6
    check-cast p2, Ljava/lang/CharSequence;

    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/K;

    invoke-direct {v0, p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/K;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/prooface/J;)V

    return-object v0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 70
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    .line 71
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->e:Ljava/lang/Boolean;

    .line 72
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    .line 73
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    .line 74
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Yellow:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 75
    :cond_3
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p0, :cond_0

    .line 303
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0xa

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz p1, :cond_1

    .line 304
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 305
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 306
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(JJLkotlin/jvm/functions/Function0;Landroid/os/Handler;)Lkotlin/Unit;
    .locals 2

    .line 163
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p0

    cmp-long p0, v0, p2

    if-ltz p0, :cond_0

    .line 164
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 165
    :cond_0
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/prooface/i3;

    invoke-direct {p0, p4}, Lcom/sumsub/sns/internal/features/presentation/prooface/i3;-><init>(Lkotlin/jvm/functions/Function0;)V

    sub-long/2addr p2, v0

    invoke-virtual {p5, p0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 166
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Landroidx/camera/core/ImageProxy;)Lkotlin/Unit;
    .locals 0

    .line 204
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->close()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/core/domain/facedetector/n;)Lkotlin/Unit;
    .locals 11

    .line 206
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    :try_start_0
    iget-object v2, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 208
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->z:I

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v1, p0

    goto :goto_2

    .line 209
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->C:J

    sub-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-gez v0, :cond_2

    goto :goto_0

    .line 210
    :cond_2
    new-instance v3, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-direct {v3, p2, v0}, Landroid/util/Size;-><init>(II)V

    const-string v4, "NOT_ALIGNED"

    .line 211
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p2

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/S;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v5, 0x0

    move-object v1, p0

    :try_start_1
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    move-object v8, v0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 p0, 0x1f40

    int-to-long v4, p0

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->C:J

    goto :goto_4

    :catchall_0
    move-exception v0

    :goto_1
    move-object p0, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, p0

    goto :goto_1

    .line 213
    :goto_2
    invoke-virtual {v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/core/domain/facedetector/n;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    .line 214
    :goto_3
    invoke-virtual {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/Throwable;)V

    .line 215
    :goto_4
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 216
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(JLkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
    .locals 7

    .line 160
    new-instance v6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 161
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 162
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/h3;

    move-wide v3, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/prooface/h3;-><init>(JJLkotlin/jvm/functions/Function0;Landroid/os/Handler;)V

    return-object v0
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 167
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final e()Lcom/sumsub/sns/internal/core/domain/facedetector/e;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/domain/facedetector/e;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->f:Lcom/sumsub/sns/internal/ff/core/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    sget-object v2, Lcom/sumsub/sns/internal/ff/a;->g:Lcom/sumsub/sns/internal/ff/core/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 14
    move-result v2

    .line 15
    .line 16
    sget-object v3, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    .line 17
    .line 18
    const-wide/16 v4, -0x64

    .line 19
    .line 20
    const-wide/16 v6, 0x64

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v4, v5, v6, v7}, Lkotlin/random/Random$Default;->nextLong(JJ)J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    const-wide/16 v5, 0x1f4

    .line 27
    add-long/2addr v3, v5

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/internal/core/domain/facedetector/e;-><init>(ZZJ)V

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    const-string v2, "detector config: "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 51
    return-object v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/network/prooface/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/W;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/W;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 288
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 289
    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 290
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 291
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 292
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string/jumbo v2, "sns_facescan_result_%s_title"

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 293
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->d:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 294
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 295
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 296
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 297
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 298
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v2, "sns_facescan_result_%s_text"

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 299
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/W;->d:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    .line 300
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 301
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/H;

    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/H;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/P;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/P;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 82
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    const-string p2, "doStartSession"

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 84
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->a:Ljava/lang/String;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    .line 85
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto/16 :goto_5

    .line 86
    :cond_5
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez p2, :cond_6

    .line 87
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Error getting config"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/F;-><init>(Ljava/lang/Exception;)V

    .line 88
    invoke-virtual {p0, p1, v7}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V

    .line 89
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 90
    :cond_6
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    if-eqz v2, :cond_b

    .line 91
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/g;->a:Ljava/lang/String;

    .line 92
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "starting as action: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 93
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    .line 94
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_5

    :cond_7
    move-object v9, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, v9

    .line 95
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p2, :cond_a

    .line 96
    instance-of v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    if-nez v3, :cond_8

    goto :goto_3

    .line 97
    :cond_8
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 98
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    if-eqz p1, :cond_9

    .line 99
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/g;->b:Lcom/sumsub/sns/core/data/model/FlowActionType;

    if-eqz p1, :cond_9

    .line 100
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/FlowActionType;->getValue()Ljava/lang/String;

    :cond_9
    move-object p1, v2

    goto :goto_4

    .line 101
    :cond_a
    :goto_3
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Error getting action applicant"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/F;-><init>(Ljava/lang/Exception;)V

    .line 102
    invoke-virtual {p0, p1, v7}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V

    .line 103
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 104
    :cond_b
    :goto_4
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->n:Ljava/lang/String;

    .line 105
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->e:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->y:Lcom/sumsub/sns/internal/features/presentation/prooface/b0;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->a:Ljava/lang/String;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/P;->e:I

    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/b;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_5
    return-object v1

    .line 106
    :cond_c
    :goto_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->b()V

    .line 107
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Face Detector used: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "CompositeFaceDetector"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 110
    const-string/jumbo p1, "message"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 111
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object p1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {p1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object p1

    .line 112
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 113
    const-string v1, "Prooface"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    const/16 v0, 0x64

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->C:J

    .line 115
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/U;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/U;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 226
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 227
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->H:Lcom/sumsub/sns/internal/ff/core/a;

    .line 228
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 229
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "Fingerprinter"

    const-string v6, "Fingerprint is enabled, collecting..."

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 230
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->i:Lcom/sumsub/sns/internal/fingerprint/c;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/U;->c:I

    .line 231
    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v2, v4}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 232
    new-instance v4, Lcom/sumsub/sns/internal/fingerprint/f;

    invoke-direct {v4, v2}, Lcom/sumsub/sns/internal/fingerprint/f;-><init>(Lkotlin/coroutines/SafeContinuation;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    new-instance v5, Lcom/sumsub/sns/internal/fingerprint/b;

    invoke-direct {v5, p1, v4, v4}, Lcom/sumsub/sns/internal/fingerprint/b;-><init>(Lcom/sumsub/sns/internal/fingerprint/c;Lcom/sumsub/sns/internal/fingerprint/f;Lcom/sumsub/sns/internal/fingerprint/f;)V

    invoke-static {v5}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/a;->a(Lcom/sumsub/sns/internal/fingerprint/b;)Ljava/lang/Object;

    move-result-object p1

    .line 234
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 235
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    .line 236
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 237
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 238
    :cond_3
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_4

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_4
    if-ne p1, v1, :cond_5

    return-object v1

    .line 239
    :cond_5
    :goto_1
    check-cast p1, Ljava/util/Map;

    .line 240
    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 241
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 242
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->g:Lcom/sumsub/sentry/android/g;

    .line 243
    iget-object v0, v0, Lcom/sumsub/sentry/android/g;->f:Lkotlin/Lazy;

    .line 244
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sentry/android/i;

    .line 245
    iget-boolean v1, v0, Lcom/sumsub/sentry/android/i;->a:Z

    .line 246
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string/jumbo v2, "root_sentry_checkTestKeys"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 247
    iget-boolean v2, v0, Lcom/sumsub/sentry/android/i;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string/jumbo v4, "root_sentry_checkRootFiles"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 248
    iget-boolean v4, v0, Lcom/sumsub/sentry/android/i;->c:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string/jumbo v5, "root_sentry_checkSUExist"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 249
    iget-boolean v0, v0, Lcom/sumsub/sentry/android/i;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string/jumbo v5, "root_sentry_checkRootPackages"

    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    filled-new-array {v1, v2, v4, v0}, [Lkotlin/Pair;

    move-result-object v0

    .line 250
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 251
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 252
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 253
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->f:Lcom/sumsub/sns/internal/util/root/a;

    .line 254
    iget-object v0, v0, Lcom/sumsub/sns/internal/util/root/a;->a:Lkotlin/Lazy;

    .line 255
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/util/root/b;

    .line 256
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/util/root/b;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 257
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 258
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->h:Lcom/sumsub/sns/internal/util/root/c;

    .line 259
    iget-object v0, v0, Lcom/sumsub/sns/internal/util/root/c;->a:Lkotlin/Lazy;

    .line 260
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/util/root/d;

    .line 261
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/util/root/d;->a:Z

    .line 262
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string/jumbo v2, "sns_root_checkForBinary"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 263
    iget-boolean v2, v0, Lcom/sumsub/sns/internal/util/root/d;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string/jumbo v4, "sns_root_checkForMagiskBinary"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 264
    iget-boolean v4, v0, Lcom/sumsub/sns/internal/util/root/d;->a:Z

    if-nez v4, :cond_7

    iget-boolean v0, v0, Lcom/sumsub/sns/internal/util/root/d;->b:Z

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    .line 265
    :cond_7
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string/jumbo v3, "sns_root_isRooted"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    filled-new-array {v1, v2, v0}, [Lkotlin/Pair;

    move-result-object v0

    .line 266
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 267
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 268
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->j:Lcom/sumsub/sns/internal/util/camera/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    sget-object v1, Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;->INTERNAL:Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/util/camera/d;->a(Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;)Ljava/util/List;

    move-result-object v1

    .line 270
    sget-object v2, Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;->EXTERNAL:Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/util/camera/d;->a(Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;)Ljava/util/List;

    move-result-object v2

    .line 271
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v0, v0, Lcom/sumsub/sns/internal/util/camera/d;->b:Lcom/sumsub/sns/internal/util/camera/h;

    .line 272
    iget-object v2, v0, Lcom/sumsub/sns/internal/util/camera/h;->b:Ljava/util/Set;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    .line 273
    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "xposed_traces"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa

    .line 274
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 275
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 276
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 277
    check-cast v2, Lcom/sumsub/sns/internal/util/camera/b;

    .line 278
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/util/camera/b;->a()Lkotlin/Pair;

    move-result-object v2

    .line 279
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 280
    :cond_8
    invoke-static {v3, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 281
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 282
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 283
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->e:Lcom/sumsub/sentry/android/a;

    .line 284
    invoke-virtual {v0}, Lcom/sumsub/sentry/android/a;->a()Z

    move-result v0

    .line 285
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "is_emulator"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fingerprint size: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "Fingerprinter"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object p1

    .line 287
    :cond_9
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "Fingerprinter"

    const-string v10, "Fingerprint is disabled"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(FFF)V
    .locals 12

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start calibration, min="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ", max="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ", current="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 218
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->s:Lkotlinx/coroutines/x1;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    const/4 v6, 0x1

    invoke-static {v0, v5, v6, v5}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    cmpg-float v0, p2, p3

    if-nez v0, :cond_1

    .line 220
    const-string v0, "Calibration, exposure min=max"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 221
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->f:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 223
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 224
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v7

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/prooface/h0;

    invoke-direct {v9, p0, p1, v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;FLkotlin/coroutines/Continuation;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 225
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v7

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/i0;

    const/4 v5, 0x0

    move-object v1, p0

    move v4, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;FFFLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v2, 0x0

    move-object v3, v0

    move-object v0, v6

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->s:Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p3

    .line 168
    :try_start_0
    const-string v3, "Process image"

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 169
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->v:Lkotlin/Lazy;

    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/core/domain/facedetector/e;

    .line 170
    iget-wide v3, v3, Lcom/sumsub/sns/internal/core/domain/facedetector/e;->c:J

    .line 171
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/e3;

    invoke-direct {v5, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/e3;-><init>(Landroidx/camera/core/ImageProxy;)V

    invoke-static {v3, v4, v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(JLkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;

    move-result-object v3

    .line 172
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->e:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 173
    iget-boolean v4, v4, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->k:Z

    if-nez v4, :cond_0

    .line 174
    const-string v0, "Liveness session is not yet connected, skipping frame analyzing"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 175
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    .line 176
    :cond_0
    iput-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->t:Landroidx/camera/core/ImageProxy;

    .line 177
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/prooface/f3;

    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/f3;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;)V

    invoke-static {v2, v4}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object v4

    .line 178
    invoke-static {v4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_5

    move-object v8, v4

    check-cast v8, Landroid/graphics/Bitmap;

    .line 179
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    .line 180
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    if-eqz v4, :cond_1

    goto/16 :goto_0

    .line 181
    :cond_1
    iget-boolean v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->u:Z

    if-nez v4, :cond_2

    .line 182
    const-string/jumbo v4, "processImage(), Calibration is not completed"

    invoke-static {v4}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    :cond_2
    const/4 v4, 0x1

    .line 183
    iput-boolean v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->u:Z

    .line 184
    iget-boolean v6, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->r:Z

    if-eqz v6, :cond_3

    .line 185
    iput-boolean v5, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->r:Z

    .line 186
    invoke-static {v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/b;->a(Landroid/graphics/Bitmap;)Lkotlin/Pair;

    move-result-object v5

    .line 187
    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const-string v6, "#%06X"

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const v9, 0xffffff

    and-int/2addr v7, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 188
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Calibrate, color="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", brightness="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", expositionBias="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 189
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->q:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    if-eqz v6, :cond_3

    .line 190
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    if-eqz v6, :cond_3

    .line 191
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 192
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    .line 193
    invoke-direct {v7, v0, v5, v4}, Lcom/sumsub/sns/internal/features/data/model/prooface/f;-><init>(FFLjava/lang/String;)V

    .line 194
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    :cond_3
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 197
    :cond_4
    :goto_0
    iput-boolean v5, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->u:Z

    .line 198
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/prooface/g3;

    invoke-direct {v10, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/prooface/g3;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/jvm/functions/Function0;)V

    .line 199
    iget-object v0, v7, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->b:Lkotlinx/coroutines/m0;

    .line 200
    iget-object v12, v7, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->c:Lkotlinx/coroutines/j0;

    new-instance v14, Lcom/sumsub/sns/internal/core/domain/facedetector/a;

    const/4 v11, 0x0

    move-object/from16 v9, p2

    move-object v6, v14

    invoke-direct/range {v6 .. v11}, Lcom/sumsub/sns/internal/core/domain/facedetector/a;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/d;Landroid/graphics/Bitmap;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v11, v0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 201
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Failed to convert imageProxy to bitmap"

    invoke-direct {v0, v3, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :goto_1
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/Throwable;)V

    .line 203
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->close()V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/domain/facedetector/n;)V
    .locals 12

    .line 116
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/x;

    if-eqz v0, :cond_0

    .line 117
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    if-nez v0, :cond_1

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onResult "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 119
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/k;

    const-string/jumbo v1, "sns_facescan_hint_facePosition"

    if-eqz v0, :cond_2

    .line 120
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/y;

    .line 121
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/y;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void

    .line 123
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/m;

    if-eqz v0, :cond_3

    .line 124
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/A;

    .line 125
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/A;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void

    .line 127
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/l;

    if-eqz v0, :cond_4

    .line 128
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/z;

    .line 129
    check-cast p1, Lcom/sumsub/sns/internal/core/domain/facedetector/l;

    .line 130
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/l;->b:Landroid/graphics/RectF;

    .line 131
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 132
    invoke-direct {v2, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/z;-><init>(Landroid/graphics/RectF;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void

    .line 133
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    if-eqz v0, :cond_a

    .line 134
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->G:Lkotlinx/coroutines/flow/n;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/x;

    .line 135
    check-cast p1, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    .line 136
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/j;->c:Landroid/graphics/RectF;

    .line 137
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v3

    const-string/jumbo v4, "sns_facescan_hint_lookStraight"

    invoke-virtual {v3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 138
    invoke-direct {v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/prooface/x;-><init>(Landroid/graphics/RectF;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 139
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->F:Z

    const/16 v1, 0xc8

    if-nez v0, :cond_5

    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    int-to-long v0, v1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->B:J

    return-void

    .line 141
    :cond_5
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->z:I

    if-ne v0, v2, :cond_6

    if-lez v0, :cond_6

    .line 142
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->l:Ljava/util/Timer;

    if-nez v0, :cond_6

    .line 143
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 144
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/d0;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;)V

    .line 145
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    .line 146
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 147
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->l:Ljava/util/Timer;

    .line 148
    :cond_6
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->z:I

    const/4 v3, 0x1

    if-lt v0, v2, :cond_7

    .line 149
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->K:Lkotlinx/coroutines/x1;

    if-eqz p1, :cond_8

    const/4 v0, 0x0

    invoke-static {p1, v0, v3, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void

    .line 150
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->B:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-gez v0, :cond_9

    :cond_8
    return-void

    .line 151
    :cond_9
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    .line 152
    iget-object v4, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 153
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/domain/facedetector/j;->b:Landroid/util/Size;

    .line 154
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p1

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/S;

    const-string v6, "OK"

    const/4 v7, 0x0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/presentation/prooface/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    move-object v9, v2

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    int-to-long v0, v1

    add-long/2addr v4, v0

    iput-wide v4, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->B:J

    .line 156
    iget-object p1, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->I:Lkotlinx/coroutines/flow/n;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/G;

    .line 157
    iget v1, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->A:I

    int-to-float v1, v1

    iget v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->z:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 158
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/G;-><init>(F)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_a
    move-object v3, p0

    .line 159
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V
    .locals 6

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finishWithReason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 308
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/T;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/T;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lcom/sumsub/sns/internal/features/data/model/prooface/J;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .line 76
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v0, :cond_0

    .line 77
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

    .line 78
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v0, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v0}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v0

    .line 80
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v0

    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    const-string v2, "Prooface"

    invoke-virtual {v0, v2, v1, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/V;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 7
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->a:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/V;->d:I

    .line 9
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 10
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v0, 0x0

    if-eqz p2, :cond_32

    .line 11
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    if-nez p2, :cond_4

    goto/16 :goto_1e

    .line 12
    :cond_4
    const-string v1, "liveness"

    const-string/jumbo v2, "suggestions"

    filled-new-array {v1, v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 13
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 14
    invoke-static {p1, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object p2

    .line 15
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    move-object v2, p2

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 16
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_5

    check-cast v2, Ljava/util/Map;

    goto :goto_3

    :cond_5
    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_d

    .line 17
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 19
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_7

    move-object v7, v0

    :cond_7
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_8

    goto :goto_5

    .line 20
    :cond_8
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_9

    move-object v6, v0

    :cond_9
    if-nez v6, :cond_a

    :goto_5
    move-object v6, v0

    goto :goto_6

    .line 21
    :cond_a
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_6
    if-eqz v6, :cond_6

    .line 22
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 23
    :cond_b
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_7

    .line 24
    :cond_c
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_2

    :cond_d
    :goto_7
    move-object p1, v0

    goto :goto_8

    .line 25
    :cond_e
    iget-object p2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Map;

    if-nez p2, :cond_f

    move-object p1, v0

    :cond_f
    check-cast p1, Ljava/util/Map;

    :goto_8
    if-nez p1, :cond_10

    return-object v0

    .line 26
    :cond_10
    const-string/jumbo p2, "title"

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 27
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 28
    invoke-static {p2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v2

    .line 29
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    move-object v5, v2

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    .line 30
    iget-object v6, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/util/Map;

    if-eqz v6, :cond_11

    check-cast v5, Ljava/util/Map;

    goto :goto_a

    :cond_11
    move-object v5, v0

    :goto_a
    if-eqz v5, :cond_19

    .line 31
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_12
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 33
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_13

    move-object v8, v0

    :cond_13
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_14

    goto :goto_c

    .line 34
    :cond_14
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_15

    move-object v7, v0

    :cond_15
    if-nez v7, :cond_16

    :goto_c
    move-object v7, v0

    goto :goto_d

    .line 35
    :cond_16
    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    :goto_d
    if-eqz v7, :cond_12

    .line 36
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 37
    :cond_17
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_18

    goto :goto_e

    .line 38
    :cond_18
    iput-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_9

    :cond_19
    :goto_e
    move-object p2, v0

    goto :goto_f

    .line 39
    :cond_1a
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/lang/CharSequence;

    if-nez v1, :cond_1b

    move-object p2, v0

    :cond_1b
    check-cast p2, Ljava/lang/CharSequence;

    .line 40
    :goto_f
    const-string/jumbo v1, "tipsTitle"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 41
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 42
    invoke-static {v1, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v5

    .line 43
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_25

    move-object v6, v5

    check-cast v6, Lkotlin/collections/IntIterator;

    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v6

    .line 44
    iget-object v7, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/util/Map;

    if-eqz v7, :cond_1c

    check-cast v6, Ljava/util/Map;

    goto :goto_11

    :cond_1c
    move-object v6, v0

    :goto_11
    if-eqz v6, :cond_24

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1d
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 47
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_1e

    move-object v9, v0

    :cond_1e
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_1f

    goto :goto_13

    .line 48
    :cond_1f
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_20

    move-object v8, v0

    :cond_20
    if-nez v8, :cond_21

    :goto_13
    move-object v8, v0

    goto :goto_14

    .line 49
    :cond_21
    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    :goto_14
    if-eqz v8, :cond_1d

    .line 50
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 51
    :cond_22
    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_23

    goto :goto_15

    .line 52
    :cond_23
    iput-object v6, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_10

    :cond_24
    :goto_15
    move-object v1, v0

    goto :goto_16

    .line 53
    :cond_25
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/CharSequence;

    if-nez v2, :cond_26

    move-object v1, v0

    :cond_26
    check-cast v1, Ljava/lang/CharSequence;

    .line 54
    :goto_16
    const-string/jumbo v2, "tips"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 55
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 56
    invoke-static {v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object p1

    .line 57
    :goto_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2f

    move-object v3, p1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 58
    iget-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_27

    check-cast v3, Ljava/util/Map;

    goto :goto_18

    :cond_27
    move-object v3, v0

    :goto_18
    if-eqz v3, :cond_31

    .line 59
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 60
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_28
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 61
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_29

    move-object v7, v0

    :cond_29
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_2a

    goto :goto_1a

    .line 62
    :cond_2a
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2b

    move-object v6, v0

    :cond_2b
    if-nez v6, :cond_2c

    :goto_1a
    move-object v6, v0

    goto :goto_1b

    .line 63
    :cond_2c
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_1b
    if-eqz v6, :cond_28

    .line 64
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 65
    :cond_2d
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_2e

    goto :goto_1d

    .line 66
    :cond_2e
    iput-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_17

    .line 67
    :cond_2f
    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_30

    goto :goto_1c

    :cond_30
    move-object v0, p1

    :goto_1c
    check-cast v0, Ljava/util/List;

    .line 68
    :cond_31
    :goto_1d
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Ljava/lang/CharSequence;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 69
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/I;

    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/I;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    :cond_32
    :goto_1e
    return-object v0
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->I:Lkotlinx/coroutines/flow/n;

    .line 3
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->a:Lkotlinx/coroutines/flow/n;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/g0;->d:I

    const-string/jumbo v2, "sns_facescan_hint_facePosition"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    .line 4
    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    .line 5
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/L;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/L;-><init>(Ljava/lang/CharSequence;Z)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final f()V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "stopSession()"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->s:Lkotlinx/coroutines/x1;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->c()V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->e:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    const-string v2, "Liveness3dFaceRepository.disconnect"

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const/16 v3, 0x3e8

    .line 37
    .line 38
    const-string v4, "disconnect"

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v3, v4}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z

    .line 42
    .line 43
    :cond_1
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->L:Lcom/sumsub/sns/internal/core/common/a;

    .line 46
    monitor-enter v0

    .line 47
    .line 48
    :try_start_0
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_2
    :goto_0
    iput-object v1, v0, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    return-void

    .line 61
    :goto_1
    monitor-exit v0

    .line 62
    throw v1
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
.end method

.method public final bridge synthetic getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/N;

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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->t:Landroidx/camera/core/ImageProxy;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->p:Lkotlinx/coroutines/m1;

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    :catch_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->b:Lkotlinx/coroutines/m0;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0, v2, v0}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 20
    return-void

    .line 21
    :catch_1
    move-exception v0

    .line 22
    throw v0
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
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V

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

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
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
    const-string/jumbo v1, "onHandleError "

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
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 25
    .line 26
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/w;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/w;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 33
    return-void
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

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;

    .line 22
    .line 23
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->c:I

    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    goto :goto_4

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p1

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->c:I

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepare$suspendImpl(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    if-ne p1, v1, :cond_4

    .line 70
    goto :goto_3

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_1
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 74
    .line 75
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c0;->c:I

    .line 76
    .line 77
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->P:Lcom/sumsub/sns/internal/ff/core/a;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 81
    move-result p1

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    const/4 p1, 0x0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    if-ne p1, v0, :cond_5

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_2
    if-ne p1, v1, :cond_7

    .line 106
    :goto_3
    return-object v1

    .line 107
    .line 108
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 109
    return-object p1
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
