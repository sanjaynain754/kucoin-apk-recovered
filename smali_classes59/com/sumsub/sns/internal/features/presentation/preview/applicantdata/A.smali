.class public final Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;
.super Lcom/sumsub/sns/internal/features/presentation/preview/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/k;


# static fields
.field public static final synthetic s:[Lkotlin/reflect/KProperty;


# instance fields
.field public final g:Lcom/sumsub/sns/internal/core/common/Z0;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public i:Lcom/sumsub/sns/internal/features/domain/appdata/b;

.field public final j:Z

.field public final k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/m;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public final p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 3
    .line 4
    const-string v1, "bestGuessCountry"

    .line 5
    .line 6
    const-string v2, "getBestGuessCountry()Ljava/lang/String;"

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
    const-string v2, "fieldValueCache"

    .line 14
    .line 15
    const-string v4, "getFieldValueCache()Ljava/util/Map;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "initialFieldValueCache"

    .line 22
    .line 23
    const-string v5, "getInitialFieldValueCache()Ljava/util/Map;"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 27
    move-result-object v0

    .line 28
    const/4 v4, 0x3

    .line 29
    .line 30
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 31
    .line 32
    aput-object v1, v4, v3

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    aput-object v2, v4, v1

    .line 36
    const/4 v1, 0x2

    .line 37
    .line 38
    aput-object v0, v4, v1

    .line 39
    .line 40
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    .line 41
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/core/common/Z0;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/sumsub/sns/internal/features/presentation/preview/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;)V

    .line 4
    move-object p1, p0

    .line 5
    .line 6
    iput-object p6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->g:Lcom/sumsub/sns/internal/core/common/Z0;

    .line 7
    .line 8
    iput-object p7, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->h:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 9
    .line 10
    sget-object p3, Lcom/sumsub/sns/internal/ff/a;->n:Lcom/sumsub/sns/internal/ff/core/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 14
    move-result p3

    .line 15
    .line 16
    iput-boolean p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->j:Z

    .line 17
    .line 18
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 19
    .line 20
    const-string p4, "KEY_COUNTRY"

    .line 21
    const/4 p5, 0x0

    .line 22
    const/4 p6, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct {p3, p2, p4, p5, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 26
    .line 27
    iput-object p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 31
    move-result-object p3

    .line 32
    .line 33
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 34
    .line 35
    .line 36
    invoke-direct {p4}, Lcom/sumsub/sns/internal/core/presentation/form/j;-><init>()V

    .line 37
    .line 38
    new-instance p7, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 39
    .line 40
    .line 41
    invoke-direct {p7, p6, p3, p5, p4}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 45
    move-result-object p3

    .line 46
    .line 47
    iput-object p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->l:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/m;

    .line 50
    .line 51
    .line 52
    invoke-direct {p3, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;)V

    .line 53
    .line 54
    iput-object p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->m:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/m;

    .line 55
    .line 56
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 60
    move-result-object p4

    .line 61
    .line 62
    const-string p7, "KEY_FIELD_CACHE"

    .line 63
    .line 64
    .line 65
    invoke-direct {p3, p2, p7, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 66
    .line 67
    iput-object p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 68
    .line 69
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 73
    move-result-object p4

    .line 74
    .line 75
    const-string p7, "KEY_INITIAL_FIELD_CACHE"

    .line 76
    .line 77
    .line 78
    invoke-direct {p3, p2, p7, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    iput-object p3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    .line 83
    .line 84
    .line 85
    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;-><init>()V

    .line 86
    .line 87
    iput-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewState()Lkotlinx/coroutines/flow/r;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 95
    move-result-object p3

    .line 96
    .line 97
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/i;

    .line 98
    .line 99
    .line 100
    invoke-direct {p4, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p2, p3, p4}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 104
    return-void
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
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;

    check-cast v1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 19
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->e:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v2

    move-object v8, v3

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->h:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    move-object/from16 v6, p2

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/o;->e:I

    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v7, v4

    move-object v8, v6

    .line 21
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_26

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/y;

    .line 22
    const-string v2, "ApplicantData form loaded"

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 23
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/y;->a:Ljava/util/List;

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x2

    const/4 v9, 0x0

    const/4 v13, 0x0

    if-eqz v4, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    .line 26
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 27
    const-string v11, "custom."

    invoke-static {v10, v11, v9, v6, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    .line 28
    new-instance v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 29
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    .line 30
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v15

    .line 32
    iget-boolean v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->c:Z

    .line 33
    iget-boolean v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->d:Z

    .line 34
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v18

    const/16 v17, 0x0

    const/16 v19, 0x17c

    move/from16 v16, v6

    .line 35
    invoke-direct/range {v14 .. v19}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLjava/lang/String;Ljava/lang/Boolean;I)V

    .line 36
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 39
    invoke-static {v6}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v6

    .line 40
    sget-object v11, Lcom/sumsub/sns/internal/features/data/model/common/W1;->b:Lcom/sumsub/sns/internal/features/data/model/common/W1;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    .line 41
    :cond_5
    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    .line 42
    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v6, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 44
    check-cast v11, Ljava/lang/String;

    .line 45
    invoke-static {v11}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v11

    .line 46
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 47
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v12, v9

    :cond_7
    :goto_4
    if-ge v12, v11, :cond_a

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v12, v12, 0x1

    .line 49
    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 50
    instance-of v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v15, :cond_8

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 51
    iget v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 52
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_5

    .line 53
    :cond_8
    instance-of v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v15, :cond_9

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 54
    iget v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;->b:I

    .line 55
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_5

    :cond_9
    move-object v14, v13

    :goto_5
    if-eqz v14, :cond_7

    .line 56
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 57
    :cond_a
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->sorted(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    .line 58
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    .line 59
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 60
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/p;

    .line 61
    instance-of v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    if-eqz v6, :cond_b

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    goto :goto_6

    :cond_b
    move-object v4, v13

    :goto_6
    if-eqz v4, :cond_c

    .line 62
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;->a:Ljava/util/List;

    if-eqz v4, :cond_c

    .line 63
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_7

    :cond_c
    move v4, v9

    .line 64
    :goto_7
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    :goto_8
    if-ge v9, v4, :cond_4

    .line 65
    invoke-static {v2, v9, v13}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;->a(Ljava/util/List;ILjava/lang/Integer;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    .line 66
    :cond_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 67
    invoke-static {v2, v6, v13}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;->a(Ljava/util/List;ILjava/lang/Integer;)V

    goto :goto_9

    .line 68
    :cond_e
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/u;

    .line 69
    iget-object v9, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 70
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->a:Ljava/lang/String;

    if-nez v10, :cond_f

    move-object v10, v9

    .line 71
    :cond_f
    iget-boolean v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->c:Z

    .line 72
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 73
    invoke-direct {v6, v9, v10, v4}, Lcom/sumsub/sns/internal/features/data/model/common/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 74
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 75
    :cond_10
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->n:Ljava/util/List;

    .line 76
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->o:Ljava/util/List;

    .line 77
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 78
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 79
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_11
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    .line 80
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/p;

    .line 81
    instance-of v10, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;

    if-eqz v10, :cond_12

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;

    .line 82
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;->a:Ljava/lang/String;

    goto :goto_c

    .line 83
    :cond_12
    instance-of v10, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    if-nez v10, :cond_14

    if-nez v5, :cond_13

    goto :goto_b

    .line 84
    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_14
    :goto_b
    move-object v5, v13

    :goto_c
    if-eqz v5, :cond_11

    .line 85
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 86
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 87
    :cond_15
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    .line 89
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    .line 90
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v4

    .line 92
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/W1;->b:Lcom/sumsub/sns/internal/features/data/model/common/W1;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    goto :goto_d

    :cond_17
    move-object v3, v13

    :goto_d
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    if-nez v3, :cond_18

    goto :goto_10

    .line 93
    :cond_18
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/p;

    .line 94
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    if-eqz v3, :cond_19

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    goto :goto_e

    :cond_19
    move-object v1, v13

    :goto_e
    if-eqz v1, :cond_1d

    .line 95
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;->a:Ljava/util/List;

    if-eqz v1, :cond_1d

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v9, 0x1

    if-gez v9, :cond_1a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1a
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;

    .line 97
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    invoke-direct {v5, v9}, Lcom/sumsub/sns/internal/features/data/model/common/U1;-><init>(I)V

    .line 98
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 99
    new-instance v10, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    invoke-direct {v10, v9}, Lcom/sumsub/sns/internal/features/data/model/common/Y1;-><init>(I)V

    .line 100
    iget-object v9, v10, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 101
    iget-object v10, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;->a:Ljava/lang/String;

    if-eqz v10, :cond_1b

    .line 102
    invoke-interface {v2, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    :cond_1b
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;->b:Ljava/lang/String;

    if-eqz v3, :cond_1c

    .line 104
    invoke-interface {v2, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    move v9, v4

    goto :goto_f

    .line 105
    :cond_1d
    :goto_10
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->a(Ljava/util/Map;)V

    .line 106
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    aget-object v3, v3, v6

    .line 107
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    if-eqz v8, :cond_1f

    .line 108
    iget-object v1, v8, Lcom/sumsub/sns/internal/features/data/model/common/h;->i:Ljava/util/Map;

    if-eqz v1, :cond_1f

    .line 109
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->g:Lcom/sumsub/sns/internal/core/common/Z0;

    invoke-virtual {v2, v1}, Lcom/sumsub/sns/internal/core/common/Z0;->a(Ljava/util/Map;)V

    .line 110
    :cond_1f
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->f:Ljava/util/Map;

    if-nez v1, :cond_20

    .line 111
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_20
    move-object v10, v1

    .line 112
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->e:Ljava/util/Map;

    if-nez v1, :cond_21

    .line 113
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_21
    move-object v11, v1

    if-eqz v8, :cond_23

    .line 114
    invoke-static {v8}, Lcom/sumsub/sns/internal/features/data/model/common/i;->g(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_22

    goto :goto_12

    :cond_22
    :goto_11
    move-object v9, v1

    goto :goto_13

    :cond_23
    :goto_12
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_11

    :goto_13
    if-eqz v8, :cond_25

    .line 115
    iget-object v1, v8, Lcom/sumsub/sns/internal/features/data/model/common/h;->j:Ljava/util/Map;

    if-nez v1, :cond_24

    goto :goto_15

    :cond_24
    :goto_14
    move-object v12, v1

    goto :goto_16

    .line 116
    :cond_25
    :goto_15
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_14

    .line 117
    :goto_16
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/appdata/b;

    invoke-direct/range {v6 .. v12}, Lcom/sumsub/sns/internal/features/domain/appdata/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->i:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    .line 118
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/p;

    invoke-direct {v10, v0, v13}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 119
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 120
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error loading ApplicantData form: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 121
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 122
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 123
    const-string v4, "AppData"

    invoke-virtual {v3, v4, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    .line 125
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 257
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->d:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->a:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_10

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 258
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    move-object/from16 v6, p1

    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 260
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    .line 261
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    .line 262
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 263
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v7

    .line 264
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v9

    .line 265
    instance-of v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/W1;

    if-eqz v7, :cond_15

    .line 266
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 268
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_3
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v14, :cond_3

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 269
    :cond_4
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v14, 0x0

    :cond_5
    :goto_3
    if-ge v14, v13, :cond_7

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v14, v14, 0x1

    move-object v8, v15

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 271
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 272
    instance-of v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-nez v10, :cond_6

    instance-of v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v8, :cond_5

    .line 273
    :cond_6
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 274
    :cond_7
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 275
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v8, :cond_b

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v10, v10, 0x1

    .line 276
    move-object v14, v13

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 277
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 278
    instance-of v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v15, :cond_8

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 279
    iget v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;->b:I

    .line 280
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_5

    .line 281
    :cond_8
    instance-of v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v15, :cond_9

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 282
    iget v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 283
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_5

    :cond_9
    const/4 v14, 0x0

    .line 284
    :goto_5
    invoke-virtual {v7, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_a

    .line 285
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 286
    invoke-interface {v7, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    :cond_a
    check-cast v15, Ljava/util/List;

    .line 288
    invoke-interface {v15, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 289
    :cond_b
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 291
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    .line 292
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 293
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 294
    instance-of v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v14, :cond_c

    goto :goto_7

    :cond_d
    const/4 v13, 0x0

    :goto_7
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v13, :cond_e

    .line 295
    iget-object v12, v13, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    goto :goto_8

    :cond_e
    const/4 v12, 0x0

    .line 296
    :goto_8
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 297
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 298
    instance-of v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v14, :cond_f

    goto :goto_9

    :cond_10
    const/4 v13, 0x0

    :goto_9
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v13, :cond_11

    .line 299
    iget-object v10, v13, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    goto :goto_a

    :cond_11
    const/4 v10, 0x0

    .line 300
    :goto_a
    new-instance v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;

    if-eqz v12, :cond_12

    .line 301
    invoke-virtual {v12}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v12

    goto :goto_b

    :cond_12
    const/4 v12, 0x0

    :goto_b
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v10, :cond_13

    .line 302
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v10

    goto :goto_c

    :cond_13
    const/4 v10, 0x0

    :goto_c
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 303
    invoke-direct {v13, v12, v10}, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 305
    :cond_14
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;

    .line 306
    new-instance v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    invoke-direct {v10, v8}, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;-><init>(Ljava/util/List;)V

    .line 307
    invoke-direct {v7, v9, v10}, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/p;)V

    goto :goto_e

    .line 308
    :cond_15
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 309
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;

    if-eqz v7, :cond_16

    .line 310
    new-instance v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;

    invoke-direct {v10, v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;-><init>(Ljava/lang/String;)V

    goto :goto_d

    :cond_16
    const/4 v10, 0x0

    .line 311
    :goto_d
    invoke-direct {v8, v9, v10}, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/p;)V

    move-object v7, v8

    .line 312
    :goto_e
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 313
    :cond_17
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v4, :cond_18

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v8, 0x1

    .line 315
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;

    .line 316
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;->a:Ljava/lang/String;

    .line 317
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 318
    :cond_18
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;

    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;-><init>(Ljava/util/ArrayList;)V

    .line 319
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->h:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->a:Ljava/util/ArrayList;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/z;->d:I

    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    invoke-virtual {v1, v4, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_19

    return-object v3

    :cond_19
    move-object v2, v6

    .line 320
    :goto_10
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_1b

    check-cast v1, Lkotlin/Unit;

    .line 321
    const-string v1, "Applicant data uploaded successfully"

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 322
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    move-result-object v1

    if-eqz v1, :cond_1a

    new-instance v3, Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;

    invoke-direct {v3, v2}, Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v3}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 323
    :cond_1a
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_11

    .line 324
    :cond_1b
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error uploading applicant data: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 325
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 326
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 327
    const-string v4, "AppData"

    invoke-virtual {v2, v4, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 328
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 329
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 330
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 331
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/k;->a:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/k;

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 332
    :goto_11
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 126
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->d:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    .line 127
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->a:Ljava/util/List;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/v;->d:I

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    return-object v3

    .line 128
    :cond_3
    :goto_1
    move-object v10, v2

    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 129
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 130
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    if-eqz v2, :cond_4

    .line 131
    const-string v4, "customFields"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    instance-of v4, v2, Ljava/util/Map;

    if-eqz v4, :cond_5

    check-cast v2, Ljava/util/Map;

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_7

    .line 132
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 133
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 134
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v7, v7, Ljava/lang/String;

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    instance-of v7, v7, Ljava/lang/String;

    if-eqz v7, :cond_6

    .line 135
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :cond_8
    if-eqz v4, :cond_9

    .line 136
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v5

    if-ne v2, v5, :cond_9

    goto :goto_5

    :cond_9
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_10

    .line 137
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 138
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 139
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_b

    const/4 v7, 0x0

    :cond_b
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_c

    goto :goto_7

    .line 140
    :cond_c
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Ljava/lang/String;

    if-nez v8, :cond_d

    const/4 v6, 0x0

    :cond_d
    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_e

    :goto_7
    const/4 v6, 0x0

    goto :goto_8

    .line 141
    :cond_e
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_8
    if-eqz v6, :cond_a

    .line 142
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 143
    :cond_f
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    .line 144
    :goto_9
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->o:Ljava/util/List;

    .line 145
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->i:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    if-eqz v4, :cond_3e

    if-nez v9, :cond_11

    goto/16 :goto_2a

    .line 146
    :cond_11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v6

    .line 147
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    const/4 v11, 0x0

    aget-object v8, v8, v11

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 148
    invoke-static {v4, v6, v7, v9}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/appdata/b;)Ljava/util/LinkedHashMap;

    move-result-object v6

    .line 149
    invoke-virtual {v0, v6}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->a(Ljava/util/Map;)V

    .line 150
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_12
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v12, v8, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v12, :cond_12

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 152
    :cond_13
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 153
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->r:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;

    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->n:Ljava/util/List;

    if-nez v12, :cond_14

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v12

    :cond_14
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 155
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_15
    :goto_b
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v15, :cond_15

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 156
    :cond_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v13

    move v14, v11

    :goto_c
    if-ge v14, v13, :cond_18

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v14, v14, 0x1

    move/from16 p1, v11

    move-object v11, v15

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 157
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 158
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/W1;->b:Lcom/sumsub/sns/internal/features/data/model/common/W1;

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_d

    :cond_17
    move/from16 v11, p1

    goto :goto_c

    :cond_18
    move/from16 p1, v11

    const/4 v15, 0x0

    :goto_d
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-nez v15, :cond_19

    const/4 v3, 0x0

    goto :goto_10

    .line 159
    :cond_19
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1a

    move/from16 v13, p1

    goto :goto_f

    .line 160
    :cond_1a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v11, p1

    move v13, v11

    :cond_1b
    :goto_e
    if-ge v11, v3, :cond_1c

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v11, v11, 0x1

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 161
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 162
    instance-of v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v14, :cond_1b

    add-int/lit8 v13, v13, 0x1

    if-gez v13, :cond_1b

    .line 163
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_e

    .line 164
    :cond_1c
    :goto_f
    invoke-static {v12}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;->a(Ljava/util/List;)Ljava/util/Set;

    move-result-object v3

    .line 165
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;

    invoke-direct {v8, v10, v15, v13, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/y;ILjava/util/Set;)V

    move-object v3, v8

    .line 166
    :goto_10
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    move/from16 v8, p1

    :goto_11
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3d

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v8, 0x1

    if-gez v8, :cond_1d

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1d
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 167
    invoke-static {v4, v12}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 168
    instance-of v13, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-eqz v13, :cond_31

    .line 169
    move-object v13, v11

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 170
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v15, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    aget-object v15, v15, p1

    invoke-virtual {v14}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    move-object v15, v8

    .line 171
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v8

    if-eqz v1, :cond_20

    .line 172
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_12
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1f

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v5, v18

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 173
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/domain/appdata/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 174
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_13

    :cond_1e
    const/4 v5, 0x1

    goto :goto_12

    :cond_1f
    const/16 v18, 0x0

    :goto_13
    move-object/from16 v5, v18

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    if-eqz v5, :cond_20

    .line 175
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/domain/appdata/a;->b:Ljava/lang/CharSequence;

    :goto_14
    move-object v11, v15

    goto :goto_15

    :cond_20
    const/4 v5, 0x0

    goto :goto_14

    .line 176
    :goto_15
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v15

    move-object/from16 v18, v1

    .line 177
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v16, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    const/16 v19, 0x2

    aget-object v16, v16, v19

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/util/Map;

    .line 178
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->j:Z

    if-nez v1, :cond_21

    move-object/from16 v19, v4

    goto/16 :goto_19

    .line 179
    :cond_21
    iget-object v1, v13, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-object/from16 v19, v4

    .line 180
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/K1;->b:Lcom/sumsub/sns/internal/features/data/model/common/K1;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    .line 181
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_19

    .line 182
    :cond_22
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v4, p1

    :goto_16
    if-ge v4, v1, :cond_27

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    add-int/lit8 v4, v4, 0x1

    move/from16 v21, v1

    move-object/from16 v1, v20

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 183
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move/from16 v20, v4

    .line 184
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/W0;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    goto :goto_18

    :cond_23
    move/from16 v4, v20

    move/from16 v1, v21

    goto :goto_16

    .line 185
    :cond_24
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/I1;->b:Lcom/sumsub/sns/internal/features/data/model/common/I1;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 186
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_25

    goto :goto_19

    .line 187
    :cond_25
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v4, p1

    :goto_17
    if-ge v4, v1, :cond_27

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    add-int/lit8 v4, v4, 0x1

    move/from16 v21, v1

    move-object/from16 v1, v20

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 188
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move/from16 v20, v4

    .line 189
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    :goto_18
    const/4 v1, 0x1

    goto :goto_1a

    :cond_26
    move/from16 v4, v20

    move/from16 v1, v21

    goto :goto_17

    :cond_27
    :goto_19
    move/from16 v1, p1

    :goto_1a
    if-eqz v3, :cond_29

    .line 190
    iget-object v4, v13, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move/from16 v20, v1

    .line 191
    instance-of v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v1, :cond_28

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 192
    iget v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/U1;->b:I

    goto :goto_1b

    .line 193
    :cond_28
    instance-of v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-eqz v1, :cond_2a

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 194
    iget v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 195
    :goto_1b
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->d:Ljava/util/Set;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_1c
    move-object v4, v11

    goto :goto_1d

    :cond_29
    move/from16 v20, v1

    :cond_2a
    const/4 v1, 0x0

    goto :goto_1c

    :goto_1d
    const/4 v11, 0x0

    move-object/from16 v38, v14

    move-object v14, v1

    move-object v1, v7

    move-object/from16 v7, v38

    move/from16 v38, v12

    move-object v12, v5

    move-object v5, v6

    move-object v6, v13

    move/from16 v13, v20

    move/from16 v20, v38

    .line 196
    invoke-static/range {v6 .. v16}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/appdata/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/jvm/functions/Function2;Ljava/lang/CharSequence;ZLjava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    move-result-object v7

    .line 197
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_3b

    .line 198
    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->b:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 199
    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 200
    iget-object v11, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 201
    instance-of v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    const-string v13, "appdata"

    if-eqz v12, :cond_2d

    .line 202
    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->d:Ljava/util/Set;

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 203
    iget v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 204
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    .line 205
    iget v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->c:I

    const/4 v14, 0x1

    if-gt v12, v14, :cond_2c

    .line 206
    iget-boolean v12, v7, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-nez v12, :cond_2b

    goto :goto_1e

    :cond_2b
    const/4 v12, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1e
    const/4 v12, 0x1

    :goto_1f
    if-nez v11, :cond_2d

    if-eqz v12, :cond_2d

    .line 207
    iget-object v11, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 208
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 209
    iget v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 210
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v8}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->a(ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lcom/sumsub/sns/internal/core/presentation/form/model/h;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    new-instance v11, Lcom/sumsub/sns/internal/core/presentation/form/model/y;

    invoke-direct {v11, v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/y;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    :cond_2d
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 213
    instance-of v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/W1;

    if-eqz v6, :cond_2e

    const/4 v14, 0x1

    .line 214
    iput-boolean v14, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->e:Z

    .line 215
    new-instance v21, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 216
    const-string/jumbo v6, "sns_data_tax_information_title"

    invoke-virtual {v8, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 217
    const-string/jumbo v6, "sns_data_tax_information_subtitle"

    invoke-virtual {v8, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const/16 v30, 0x0

    const/16 v31, 0x3f9

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 218
    invoke-direct/range {v21 .. v31}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    move-object/from16 v6, v21

    .line 219
    new-instance v11, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    invoke-direct {v11, v6, v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 220
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_2e
    iget-boolean v6, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->e:Z

    if-eqz v6, :cond_3b

    if-eqz v4, :cond_30

    .line 222
    instance-of v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-nez v6, :cond_2f

    goto :goto_20

    .line 223
    :cond_2f
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 224
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 225
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/W1;->b:Lcom/sumsub/sns/internal/features/data/model/common/W1;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3b

    .line 226
    instance-of v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    if-nez v6, :cond_3b

    .line 227
    instance-of v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v4, :cond_30

    goto/16 :goto_29

    .line 228
    :cond_30
    :goto_20
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/h;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    .line 229
    iput-boolean v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/D;->e:Z

    goto/16 :goto_29

    :cond_31
    move-object/from16 v18, v1

    move-object/from16 v19, v4

    move-object v5, v6

    move-object v1, v7

    move/from16 v20, v12

    .line 230
    instance-of v4, v11, Lcom/sumsub/sns/internal/features/data/model/common/u;

    if-eqz v4, :cond_3a

    .line 231
    move-object v4, v11

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/u;

    .line 232
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/u;->b:Ljava/lang/String;

    if-nez v6, :cond_32

    const-string v7, ""

    goto :goto_21

    :cond_32
    move-object v7, v6

    :goto_21
    if-eqz v2, :cond_35

    if-eqz v6, :cond_33

    const/16 v25, 0x4

    const/16 v26, 0x0

    .line 233
    const-string v22, "custom."

    const-string v23, ""

    const/16 v24, 0x0

    move-object/from16 v21, v6

    invoke-static/range {v21 .. v26}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_22

    :cond_33
    const/4 v6, 0x0

    .line 234
    :goto_22
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_34

    goto :goto_24

    :cond_34
    :goto_23
    move-object/from16 v23, v6

    goto :goto_25

    .line 235
    :cond_35
    :goto_24
    const-string/jumbo v6, "sns_data_custom_field_%s"

    invoke-static {v4, v6, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/C;->a(Lcom/sumsub/sns/internal/features/data/model/common/u;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_34

    .line 236
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/u;->c:Ljava/lang/String;

    goto :goto_23

    .line 237
    :goto_25
    const-string/jumbo v6, "sns_data_custom_hint_%s"

    invoke-static {v4, v6, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/C;->a(Lcom/sumsub/sns/internal/features/data/model/common/u;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v24

    .line 238
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/u;->d:Ljava/lang/Boolean;

    .line 239
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_36

    const-string/jumbo v6, "sns_data_placeholder_required"

    goto :goto_26

    :cond_36
    const-string/jumbo v6, "sns_data_placeholder_optional"

    .line 240
    :goto_26
    invoke-virtual {v10, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    .line 241
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/u;->d:Ljava/lang/Boolean;

    .line 242
    new-instance v30, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-object/from16 v21, v30

    const/16 v30, 0x0

    const/16 v31, 0x388

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v26, v4

    move-object/from16 v22, v7

    invoke-direct/range {v21 .. v31}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    if-eqz v18, :cond_39

    .line 243
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_37
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_38

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 244
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/domain/appdata/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 245
    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_37

    goto :goto_27

    :cond_38
    const/4 v6, 0x0

    :goto_27
    check-cast v6, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    if-eqz v6, :cond_39

    .line 246
    iget-object v4, v6, Lcom/sumsub/sns/internal/features/domain/appdata/a;->b:Ljava/lang/CharSequence;

    move-object/from16 v34, v4

    goto :goto_28

    :cond_39
    const/16 v34, 0x0

    .line 247
    :goto_28
    new-instance v29, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v36, 0x0

    const/16 v37, 0xe8

    const-string v31, "appdata"

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v30, v21

    invoke-direct/range {v29 .. v37}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    move-object/from16 v4, v29

    .line 248
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    goto :goto_29

    .line 249
    :cond_3a
    instance-of v4, v11, Lcom/sumsub/sns/internal/features/data/model/common/C;

    if-eqz v4, :cond_3c

    :cond_3b
    :goto_29
    move-object v7, v1

    move-object v6, v5

    move-object/from16 v1, v18

    move-object/from16 v4, v19

    move/from16 v8, v20

    const/16 p1, 0x0

    const/4 v5, 0x1

    goto/16 :goto_11

    .line 250
    :cond_3c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3d
    move-object v1, v7

    .line 251
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/w;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/w;-><init>(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x0

    const/4 v14, 0x1

    invoke-static {v0, v4, v2, v14, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 252
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 253
    :cond_3e
    :goto_2a
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 254
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 0

    .line 3
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V
    .locals 0

    .line 4
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V
    .locals 7

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onAction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 256
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/n;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/n;-><init>(Lcom/sumsub/sns/internal/core/presentation/form/model/j;Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/n;)V
    .locals 3

    .line 9
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/n;->a:Ljava/util/Map;

    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->e:Ljava/util/Map;

    .line 11
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->f:Ljava/util/Map;

    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/n;->f:Lcom/sumsub/sns/internal/features/domain/m;

    .line 14
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/m;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 15
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/m;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/m;->c:Ljava/lang/String;

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 17
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/util/Map;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 7
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 0

    .line 5
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->m:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/m;

    return-object v0
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 4

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->l:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 21
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 22
    iget v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/h;

    if-nez v0, :cond_0

    goto :goto_1

    .line 23
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 26
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v2

    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    .line 27
    :cond_3
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "resetting field error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/x;-><init>(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 8

    .line 2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "onFieldValueChanged: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v2

    .line 4
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 5
    const-string v2, ""

    :cond_1
    invoke-static {v0, v2, p2}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->a(Ljava/util/Map;)V

    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p2

    .line 7
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, v1

    .line 9
    :goto_1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/W0;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object p1

    .line 11
    const-string/jumbo p2, "stateOfBirth"

    invoke-static {p1, p2, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->a(Ljava/util/Map;)V

    goto :goto_2

    .line 12
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->e()Ljava/util/Map;

    move-result-object p1

    .line 14
    const-string/jumbo p2, "state"

    invoke-static {p1, p2, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->a(Ljava/util/Map;)V

    goto :goto_2

    .line 15
    :cond_4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 16
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/Q1;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 17
    instance-of p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz p2, :cond_5

    goto :goto_2

    .line 18
    :cond_5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    return-void

    .line 19
    :cond_6
    :goto_2
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/q;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/y;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/y;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 7
    const/4 p1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 12
    return-void
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

.method public final d()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->l:Lkotlinx/coroutines/flow/n;

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

.method public final e()Ljava/util/Map;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;->s:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/util/Map;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 10
    move-result-object v2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 18
    return-object v0
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
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 6

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/i0;->b:Landroid/os/Parcelable;

    .line 10
    .line 11
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/k;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    const-string/jumbo p1, "submitApplicantData"

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/a;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/u;

    .line 26
    const/4 p1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    .line 30
    const/4 v4, 0x3

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 41
    return-void
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
    .locals 3

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1, p1, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->onLoad()V

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
