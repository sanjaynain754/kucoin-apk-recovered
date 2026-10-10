.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;
.super Lcom/sumsub/sns/internal/features/presentation/preview/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/k;


# static fields
.field public static final synthetic D:[Lkotlin/reflect/KProperty;


# instance fields
.field public final A:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/S;

.field public final B:Lkotlinx/coroutines/flow/n;

.field public final C:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final g:Z

.field public final h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;

.field public final i:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final j:Lcom/sumsub/sns/internal/features/domain/ekyc/a;

.field public final k:Lcom/sumsub/sns/internal/features/domain/ekyc/d;

.field public final l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

.field public final m:Lcom/sumsub/sns/internal/core/common/Z0;

.field public n:Lcom/sumsub/sns/internal/features/data/model/common/p;

.field public o:Z

.field public p:Lkotlinx/coroutines/x1;

.field public q:Lkotlinx/coroutines/x1;

.field public final r:Lkotlinx/coroutines/m1;

.field public final s:Lkotlinx/coroutines/m0;

.field public t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

.field public final u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final z:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 3
    .line 4
    const-string v1, "currentSourceId"

    .line 5
    .line 6
    const-string v2, "getCurrentSourceId()Ljava/lang/String;"

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
    const-string v2, "currentConfirmationId"

    .line 14
    .line 15
    const-string v4, "getCurrentConfirmationId()Ljava/lang/String;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    const-string/jumbo v4, "submitResponse"

    .line 23
    .line 24
    const-string v5, "getSubmitResponse()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/SubmitApplicantDataResponse;"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    .line 31
    const-string/jumbo v5, "oAuthPostRedirectParams"

    .line 32
    .line 33
    const-string v6, "getOAuthPostRedirectParams()Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycViewModel$OAuthPostRedirectParams;"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    const-string v6, "country"

    .line 40
    .line 41
    const-string v7, "getCountry()Ljava/lang/String;"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    const-string v7, "countrySelectAutoSubmitted"

    .line 48
    .line 49
    const-string v8, "getCountrySelectAutoSubmitted()Z"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 53
    move-result-object v7

    .line 54
    .line 55
    const-string v8, "fieldValueCache"

    .line 56
    .line 57
    const-string v9, "getFieldValueCache()Ljava/util/Map;"

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 61
    move-result-object v0

    .line 62
    const/4 v8, 0x7

    .line 63
    .line 64
    new-array v8, v8, [Lkotlin/reflect/KProperty;

    .line 65
    .line 66
    aput-object v1, v8, v3

    .line 67
    const/4 v1, 0x1

    .line 68
    .line 69
    aput-object v2, v8, v1

    .line 70
    const/4 v1, 0x2

    .line 71
    .line 72
    aput-object v4, v8, v1

    .line 73
    const/4 v1, 0x3

    .line 74
    .line 75
    aput-object v5, v8, v1

    .line 76
    const/4 v1, 0x4

    .line 77
    .line 78
    aput-object v6, v8, v1

    .line 79
    const/4 v1, 0x5

    .line 80
    .line 81
    aput-object v7, v8, v1

    .line 82
    const/4 v1, 0x6

    .line 83
    .line 84
    aput-object v0, v8, v1

    .line 85
    .line 86
    sput-object v8, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 87
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;ZLcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/domain/ekyc/a;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/ekyc/d;Lcom/sumsub/sns/internal/features/domain/ekyc/b;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p6

    .line 4
    move-object v3, p7

    .line 5
    move-object v4, p8

    .line 6
    move-object v5, p9

    .line 7
    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;)V

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g:Z

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->j:Lcom/sumsub/sns/internal/features/domain/ekyc/a;

    .line 18
    .line 19
    move-object/from16 p1, p10

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->k:Lcom/sumsub/sns/internal/features/domain/ekyc/d;

    .line 22
    .line 23
    move-object/from16 p1, p11

    .line 24
    .line 25
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 26
    .line 27
    new-instance p1, Lcom/sumsub/sns/internal/core/common/Z0;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/common/Z0;-><init>()V

    .line 31
    .line 32
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->m:Lcom/sumsub/sns/internal/core/common/Z0;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlinx/coroutines/o1;->c(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->r:Lkotlinx/coroutines/m1;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->s:Lkotlinx/coroutines/m0;

    .line 49
    .line 50
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 51
    .line 52
    const-string p2, "currentSourceId"

    .line 53
    const/4 p3, 0x0

    .line 54
    const/4 p4, 0x0

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p6, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 58
    .line 59
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 60
    .line 61
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 62
    .line 63
    const-string p2, "currentConfirmationId"

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p6, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 67
    .line 68
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 69
    .line 70
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 71
    .line 72
    .line 73
    const-string/jumbo p2, "submitResponse"

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, p6, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 77
    .line 78
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 79
    .line 80
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    .line 83
    const-string/jumbo p2, "oAuthPostRedirect"

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, p6, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 87
    .line 88
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 89
    .line 90
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 91
    .line 92
    const-string p2, "KEY_COUNTRY"

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p6, p2, p3, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 96
    .line 97
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 98
    .line 99
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 100
    .line 101
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    const-string p5, "KEY_COUNTRY_SELECT_AUTO_SUBMITTED"

    .line 104
    .line 105
    .line 106
    invoke-direct {p1, p6, p5, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 107
    .line 108
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->z:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 109
    .line 110
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/S;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;)V

    .line 114
    .line 115
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->A:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/S;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 122
    .line 123
    .line 124
    invoke-direct {p2}, Lcom/sumsub/sns/internal/core/presentation/form/j;-><init>()V

    .line 125
    .line 126
    new-instance p5, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 127
    .line 128
    .line 129
    invoke-direct {p5, p4, p1, p3, p2}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->B:Lkotlinx/coroutines/flow/n;

    .line 136
    .line 137
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 141
    move-result-object p2

    .line 142
    .line 143
    const-string p5, "KEY_FIELD_CACHE"

    .line 144
    .line 145
    .line 146
    invoke-direct {p1, p6, p5, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 147
    .line 148
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->C:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewState()Lkotlinx/coroutines/flow/r;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/o;

    .line 159
    .line 160
    .line 161
    invoke-direct {p4, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, p2, p4}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 165
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    instance-of v0, p4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;

    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 103
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    :try_start_1
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const-string v5, "EKyc"

    const-string v6, "confirmOAuthData ..."

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 105
    iget-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/H;->c:I

    .line 106
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 107
    check-cast p4, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 108
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 109
    invoke-interface {p4, p1, p2, p3, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    .line 110
    :cond_3
    :goto_1
    check-cast p4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 111
    invoke-virtual {p0, p4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    .line 112
    :goto_2
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 113
    :goto_3
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string p3, "EKyc"

    const-string p4, "confirmOAuthData error"

    invoke-virtual {p2, p3, p4, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Z)V

    const/4 p2, 0x0

    .line 115
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 116
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/I;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p1, p4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, p2, p3, v3, p4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 117
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 219
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x1

    .line 184
    new-array v2, v0, [C

    const/16 v0, 0x2e

    const/4 v1, 0x0

    aput-char v0, v2, v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/T0;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    .line 185
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->o:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 188
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/s3;

    if-eqz p0, :cond_0

    .line 189
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/s3;->b:Ljava/util/Map;

    if-eqz p0, :cond_0

    .line 190
    invoke-interface {p0, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p0, v1

    .line 191
    :goto_0
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    const-string v0, "field"

    if-eqz p1, :cond_1

    .line 192
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_1

    .line 193
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->n:Ljava/util/Map;

    if-eqz p1, :cond_1

    .line 194
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_1

    invoke-interface {p1, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 195
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v1

    .line 196
    :goto_1
    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    filled-new-array {p4, p5}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x2

    .line 197
    const-string/jumbo v3, "sns_data_%s_%s"

    invoke-static {p2, v2, v3, p3}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object p2

    if-eqz p0, :cond_4

    .line 198
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-nez p0, :cond_3

    goto :goto_3

    :cond_3
    return-object p0

    :cond_4
    :goto_3
    if-eqz p1, :cond_5

    .line 199
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_4

    :cond_5
    move-object p1, v1

    :goto_4
    if-nez p1, :cond_8

    if-nez p2, :cond_7

    if-eqz p5, :cond_6

    .line 200
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    return-object p5

    :cond_6
    return-object v1

    :cond_7
    return-object p2

    :cond_8
    return-object p1
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lcom/sumsub/sns/internal/features/data/model/common/remote/B;
    .locals 5

    .line 201
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g()Lcom/sumsub/sns/internal/features/data/model/common/F;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 202
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/j0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;)V

    .line 203
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 204
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/F;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 205
    const-string v3, "idDocType"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 207
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 208
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-ne v3, v4, :cond_2

    .line 209
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 210
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 211
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 212
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :cond_1
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 214
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    goto :goto_1

    :cond_2
    move-object v3, v2

    .line 215
    :goto_1
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v4, :cond_3

    .line 216
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    const-string v4, ""

    :cond_4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 217
    :cond_5
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/B;

    invoke-direct {p1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/B;-><init>(Ljava/util/HashMap;)V

    return-object p1

    .line 218
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ApplicantDataSource is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 240
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->a:J

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->b:Lcom/sumsub/sns/internal/features/presentation/otp/b;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 241
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/otp/b;->a:Lcom/sumsub/sns/internal/features/presentation/otp/b;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->b:Lcom/sumsub/sns/internal/features/presentation/otp/b;

    iput-wide p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->a:J

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/O;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, v0

    move-object v0, p3

    move-object p3, v7

    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/k;->a(J)Ljava/lang/String;

    move-result-object v3

    if-eqz p3, :cond_4

    .line 243
    const-string/jumbo p1, "sns_confirmation_code_resendCountdown"

    invoke-virtual {p3, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 244
    const-string/jumbo v2, "{time}"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12

    if-eqz p2, :cond_0

    .line 28
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->i:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 29
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->m:Lcom/sumsub/sns/internal/core/common/Z0;

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/core/common/Z0;->a(Ljava/util/Map;)V

    .line 30
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v0

    .line 31
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->c:Lcom/sumsub/sns/internal/features/data/model/common/D3;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 32
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/D3;->a:Ljava/lang/Boolean;

    .line 33
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    .line 34
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 35
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 36
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/m;->l:Ljava/lang/Boolean;

    .line 37
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 38
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g:Z

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    .line 39
    :goto_2
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->o:Z

    .line 40
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->j:Lcom/sumsub/sns/internal/features/domain/ekyc/a;

    .line 41
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->f:Ljava/util/Map;

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p2, :cond_4

    .line 43
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "E-KYC init failed: no AppConfig"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto/16 :goto_6

    .line 44
    :cond_4
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    if-nez v4, :cond_5

    .line 45
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "E-KYC init failed: no eKycConfig"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto/16 :goto_6

    :cond_5
    if-eqz v3, :cond_b

    .line 46
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    move-object v3, v0

    :goto_3
    if-nez v3, :cond_7

    goto :goto_5

    .line 47
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 49
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 50
    invoke-static {v3, v7, v6}, Lcom/sumsub/sns/internal/features/domain/ekyc/a;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lkotlin/Pair;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 51
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 52
    :cond_9
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 54
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "E-KYC init failed: no sources configured"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_6

    .line 55
    :cond_a
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_6

    .line 56
    :cond_b
    :goto_5
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "E-KYC init failed: no countries"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 57
    :goto_6
    invoke-static {v3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_1d

    move-object v10, v3

    check-cast v10, Ljava/util/Map;

    .line 58
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->n:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p2, :cond_d

    .line 59
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->g(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_c

    goto :goto_8

    :cond_c
    :goto_7
    move-object v9, v3

    goto :goto_9

    :cond_d
    :goto_8
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    goto :goto_7

    .line 60
    :goto_9
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/appdata/b;

    const/16 v11, 0x30

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v6 .. v11}, Lcom/sumsub/sns/internal/features/domain/appdata/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/Map;Ljava/util/Map;I)V

    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    .line 61
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 62
    iget-object p2, v6, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p2, :cond_e

    .line 63
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    goto :goto_a

    :cond_e
    move-object p2, v0

    .line 64
    :goto_a
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 65
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v3

    .line 66
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p2}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 68
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p2

    if-ne p2, v2, :cond_f

    move p2, v2

    goto :goto_b

    :cond_f
    move p2, v1

    :goto_b
    if-eqz p2, :cond_10

    .line 69
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 70
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    .line 71
    iget-object v3, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 72
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    :cond_10
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x3

    aget-object v3, p2, v3

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    if-eqz p1, :cond_11

    .line 74
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Y;

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, p0

    invoke-direct/range {v3 .. v8}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Y;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    move-object v4, v7

    invoke-static {p0, v1, v3, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    goto/16 :goto_11

    :cond_11
    move-object v4, p0

    .line 75
    iget-object p1, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->z:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v3, 0x5

    aget-object p2, p2, v3

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_10

    .line 76
    :cond_12
    iget-object p1, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    if-eqz p1, :cond_13

    .line 77
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_13

    .line 78
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->l:Ljava/lang/Boolean;

    .line 79
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_c

    :cond_13
    move p1, v1

    :goto_c
    if-nez p1, :cond_14

    goto :goto_10

    .line 80
    :cond_14
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_15

    goto :goto_10

    .line 81
    :cond_15
    iget-object p2, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;

    if-nez p2, :cond_16

    move p2, v2

    goto :goto_d

    :cond_16
    move p2, v1

    :goto_d
    if-eqz p2, :cond_1a

    .line 82
    iget-object p2, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    iget-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    if-eqz v3, :cond_17

    .line 83
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v3, :cond_17

    .line 84
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    goto :goto_e

    :cond_17
    move-object v3, v0

    .line 85
    :goto_e
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 86
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v5

    .line 87
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v3}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    if-eqz p2, :cond_18

    .line 89
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    :cond_18
    if-eqz v0, :cond_19

    .line 90
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_f

    :cond_19
    move p1, v1

    :goto_f
    if-le p1, v2, :cond_1a

    move v1, v2

    :cond_1a
    xor-int/2addr v1, v2

    :goto_10
    if-eqz v1, :cond_1c

    .line 91
    check-cast p3, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-virtual {p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1b

    return-object p1

    :cond_1b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 92
    :cond_1c
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object p1

    .line 93
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 94
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 95
    :goto_11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_1d
    move-object v4, p0

    .line 96
    iget-object p1, v4, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 97
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    .line 98
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 99
    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 100
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 137
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;->c:I

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

    .line 138
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Auto-submitting country select, country="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "EKyc"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 139
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->z:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x5

    aget-object v2, v2, v4

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 140
    iget-object v4, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 141
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, p1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 143
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object p1

    .line 144
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 145
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    move-result-object p1

    .line 146
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/D;->c:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/x1;->E(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 147
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->e()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 148
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    .line 149
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 150
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, ""

    .line 151
    :cond_6
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v1, :cond_5

    .line 152
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_7
    :goto_2
    move v3, v0

    .line 153
    :goto_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g()Lcom/sumsub/sns/internal/features/data/model/common/F;

    move-result-object p1

    if-eqz p1, :cond_9

    if-eqz v3, :cond_8

    goto :goto_4

    .line 154
    :cond_8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    .line 155
    sget-object v5, Lcom/sumsub/sns/internal/core/common/C0;->a:Lkotlinx/coroutines/j0;

    .line 156
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/E;

    const/4 p1, 0x0

    invoke-direct {v7, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 157
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 158
    :cond_9
    :goto_4
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "EKyc"

    const-string v3, "Auto-submit cancelled: no source or empty required fields"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 159
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 160
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 183
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/i0;

    invoke-direct {v0, p3, p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/i0;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;
    .locals 8

    .line 161
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 162
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v1

    .line 163
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Update country, oldCountry="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", newCountry="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", errors="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 164
    const-string v1, "EKyc"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 165
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 166
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x4

    aget-object v3, v2, v3

    .line 167
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 168
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 169
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    if-eqz v4, :cond_0

    .line 170
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v4, :cond_0

    .line 171
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 172
    :goto_0
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 173
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v5

    .line 174
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 175
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v4}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 176
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 177
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v4, v2, v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 178
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 179
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v0, v2, v3

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_3

    :cond_3
    :goto_2
    if-eqz p1, :cond_4

    .line 180
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/F;

    if-eqz p1, :cond_4

    .line 181
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/F;->a:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object p1, v1

    .line 182
    :goto_3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g0;

    invoke-direct {v5, p0, p1, p2, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    return-object p1
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
    .locals 0

    .line 5
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;)V
    .locals 11

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;->CONFIRMATION_REQUIRED:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    if-ne v0, v1, :cond_8

    .line 9
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    .line 10
    :cond_1
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/C;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v3, :cond_5

    const/4 v5, 0x2

    const/4 v6, 0x3

    if-eq v0, v5, :cond_2

    if-eq v0, v6, :cond_2

    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 12
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V

    return-void

    .line 13
    :cond_2
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    if-ne v0, v1, :cond_4

    .line 14
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;

    .line 15
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;->RETRY:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;

    if-ne p1, v1, :cond_4

    .line 16
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    aget-object v0, v0, v6

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    if-eqz p1, :cond_3

    .line 17
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "EKyc"

    const-string v7, "Continue polling for oAuth post redirect"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 18
    :cond_3
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 19
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/P;

    invoke-direct {p1, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/P;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v2, p1, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void

    .line 20
    :cond_4
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V

    return-void

    .line 21
    :cond_5
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;

    .line 22
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;->RETRY:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;

    if-ne v0, v1, :cond_6

    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Q;

    invoke-direct {v0, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v2, v0, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void

    .line 24
    :cond_6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;

    invoke-direct {v0, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v2, v0, v3, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 25
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->p:Lkotlinx/coroutines/x1;

    if-eqz p1, :cond_7

    invoke-static {p1, v4, v3, v4}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 26
    :cond_7
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->s:Lkotlinx/coroutines/m0;

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d0;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->p:Lkotlinx/coroutines/x1;

    return-void

    .line 27
    :cond_8
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V
    .locals 7

    const/4 v1, 0x1

    .line 233
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Z)V

    if-nez p1, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    .line 234
    :cond_0
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/C;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    :goto_0
    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v2, v1, :cond_2

    const/4 v1, 0x2

    if-eq v2, v1, :cond_2

    if-eq v2, v3, :cond_1

    .line 235
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1, v4}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    .line 236
    :cond_1
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1, v4}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    .line 237
    :cond_2
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 238
    invoke-static {p0, v4, v1, v3, v1}, Lcom/sumsub/sns/core/presentation/base/C;->finishWithResult$default(Lcom/sumsub/sns/core/presentation/base/C;ILandroid/os/Bundle;ILjava/lang/Object;)V

    return-void

    .line 239
    :cond_3
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/n;)V
    .locals 5

    .line 118
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;->a:Ljava/lang/String;

    .line 120
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    aget-object v4, v3, v1

    .line 121
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 122
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;

    .line 124
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t;->b:Ljava/lang/String;

    .line 125
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 126
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 127
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 129
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/n;->f:Lcom/sumsub/sns/internal/features/domain/m;

    .line 130
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/m;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 131
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/m;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/m;->c:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v0, v2

    .line 132
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    aget-object v1, v3, v1

    .line 133
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 134
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 136
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->f:Ljava/util/Map;

    return-void
.end method

.method public final a(Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 245
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    .line 246
    sget-object v1, Lcom/sumsub/sns/internal/core/common/C0;->a:Lkotlinx/coroutines/j0;

    .line 247
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/T;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/T;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 0

    .line 6
    const/4 p1, 0x0

    return p1
.end method

.method public final a(Ljava/lang/String;Landroid/net/Uri;)Z
    .locals 14

    .line 220
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "onCallbackUrl: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, p2

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "EKyc"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    .line 221
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 222
    :cond_0
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, p1, v2, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    .line 223
    invoke-virtual {p0, v6}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 224
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->c(Z)V

    .line 225
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->n:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    aget-object v3, v3, v6

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_3

    return v6

    .line 227
    :cond_3
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/m;

    .line 228
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/z0;

    .line 229
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    .line 230
    invoke-direct {v0, v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/z0;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x5

    .line 231
    invoke-direct {v4, v5, v0, v5, v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/D0;Lcom/sumsub/sns/internal/features/data/model/common/remote/z0;Lcom/sumsub/sns/internal/features/data/model/common/remote/S;I)V

    .line 232
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/U;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/U;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/m;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_4
    :goto_0
    return v6

    :cond_5
    :goto_1
    return v2
.end method

.method public final b()Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->A:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/S;

    return-object v0
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 64
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->d:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->c:Ljava/lang/String;

    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->b:Ljava/lang/String;

    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v6

    move-object v6, v4

    move-object/from16 v4, v18

    goto :goto_2

    :cond_3
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v4

    .line 66
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    iput v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    const-string/jumbo v1, "sns_ekyc_form_title"

    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto :goto_3

    .line 67
    :cond_5
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 68
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->b:Ljava/lang/String;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    const-string/jumbo v6, "sns_ekyc_form_subtitle"

    invoke-virtual {v0, v6, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_6

    goto :goto_3

    :cond_6
    move-object/from16 v18, v6

    move-object v6, v1

    move-object/from16 v1, v18

    .line 69
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 70
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    if-nez v7, :cond_7

    new-instance v8, Lcom/sumsub/sns/internal/features/domain/appdata/b;

    const/4 v12, 0x0

    const/16 v13, 0x3f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/domain/appdata/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/Map;Ljava/util/Map;I)V

    move-object v7, v8

    .line 71
    :cond_7
    iget-boolean v8, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->o:Z

    if-eqz v8, :cond_9

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->a:Ljava/lang/String;

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->b:Ljava/lang/String;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->c:Ljava/lang/String;

    iput-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->d:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/L;->g:I

    const-string/jumbo v5, "sns_ekyc_action_skip"

    invoke-virtual {v0, v5, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    :goto_3
    return-object v3

    :cond_8
    move-object v3, v4

    move-object v4, v1

    move-object v1, v2

    move-object v2, v3

    move-object v5, v6

    move-object v3, v7

    :goto_4
    check-cast v1, Ljava/lang/String;

    move-object v12, v1

    move-object v14, v2

    move-object v13, v3

    move-object v10, v4

    move-object v9, v5

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    move-object v10, v1

    move-object v12, v2

    move-object v14, v4

    move-object v9, v6

    move-object v13, v7

    .line 72
    :goto_5
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    .line 73
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v16

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    .line 74
    invoke-direct/range {v8 .. v17}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/appdata/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;)V

    return-object v8
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 6

    .line 50
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onFieldValueChanged: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "EKyc"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 51
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v1

    .line 52
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 53
    const-string v1, ""

    :cond_0
    invoke-static {v0, v1, p2}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->C:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    .line 55
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    if-eqz v0, :cond_1

    .line 57
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 58
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    return-void

    .line 59
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p1

    .line 60
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 61
    const-string/jumbo v0, "source_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 62
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 63
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g0;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p2, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_2
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;)V
    .locals 12

    if-nez p1, :cond_0

    goto/16 :goto_5

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->w:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v3, v7, v2

    .line 2
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 3
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 5
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;->CONFIRMATION_REQUIRED:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    if-ne v1, v3, :cond_13

    .line 6
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->c:Ljava/lang/String;

    .line 7
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v8, 0x1

    aget-object v4, v7, v8

    .line 8
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 9
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v3, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;

    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    .line 11
    :cond_1
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/C;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    :goto_0
    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eq v1, v8, :cond_11

    const/4 v11, 0x3

    if-eq v1, v2, :cond_8

    if-eq v1, v11, :cond_2

    .line 12
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 13
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V

    return-void

    .line 14
    :cond_2
    const-string v1, "com.sumsub.sns.eid.BuildConfig"

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 15
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->g:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;

    if-eqz v1, :cond_6

    .line 16
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;->a:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 17
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;->c:Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 18
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;->b:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 19
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->c:Ljava/lang/String;

    if-nez v4, :cond_3

    .line 20
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v5, v7, v8

    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 21
    :cond_3
    invoke-virtual {p0, v9}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 22
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;

    invoke-direct {v5, v2, v1, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 23
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No url"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 24
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No certificate"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 25
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No mobile token"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 26
    :cond_7
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Eid not available"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "E_KYC"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 27
    :cond_8
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;

    if-eqz v0, :cond_9

    .line 28
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;->b:Ljava/lang/String;

    move-object v2, v1

    goto :goto_1

    :cond_9
    move-object v2, v10

    :goto_1
    if-eqz v0, :cond_a

    .line 29
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;->a:Ljava/lang/String;

    goto :goto_2

    :cond_a
    move-object v1, v10

    :goto_2
    if-eqz v0, :cond_b

    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_3
    move v3, v0

    goto :goto_4

    .line 32
    :cond_b
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->U:Lcom/sumsub/sns/internal/ff/core/a;

    .line 33
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    goto :goto_3

    :goto_4
    if-eqz v1, :cond_10

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_c

    goto :goto_6

    :cond_c
    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_d

    goto :goto_6

    .line 35
    :cond_d
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Y;

    const/4 v5, 0x0

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Y;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    move-object v2, v0

    invoke-static {p0, v9, v2, v8, v10}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    if-eqz v3, :cond_f

    .line 36
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    .line 37
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->n:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object v10

    .line 38
    :cond_e
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->c:Ljava/lang/String;

    .line 39
    invoke-direct {v2, v10, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v4, v7, v11

    .line 41
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 42
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v3, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    invoke-virtual {p0, v1, v9}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked(Ljava/lang/String;Z)V

    :cond_f
    :goto_5
    return-void

    .line 44
    :cond_10
    :goto_6
    new-instance v1, Ljava/lang/Exception;

    const-string/jumbo v2, "url or redirect url is empty"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    return-void

    .line 45
    :cond_11
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;

    invoke-direct {v1, p0, p1, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/W;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v9, v1, v8, v10}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 46
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->p:Lkotlinx/coroutines/x1;

    if-eqz v1, :cond_12

    invoke-static {v1, v10, v8, v10}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 47
    :cond_12
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->s:Lkotlinx/coroutines/m0;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d0;

    invoke-direct {v5, p0, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object v1

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->p:Lkotlinx/coroutines/x1;

    return-void

    .line 48
    :cond_13
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V

    return-void
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    const-wide/16 v5, 0x3c

    invoke-virtual {p0, v5, v6, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    .line 4
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    .line 5
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->a:Ljava/lang/CharSequence;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    const-string/jumbo v2, "sns_confirmation_code_ekyc_title"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v2

    move-object v2, p1

    move-object p1, v8

    .line 6
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 7
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->a:Ljava/lang/CharSequence;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->b:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/M;->e:I

    const-string/jumbo v3, "sns_confirmation_code_ekyc_subtitle"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v1, p1

    move-object p1, v0

    move-object v3, v2

    .line 8
    :goto_4
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    const-wide/16 v5, 0x3c

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;JLcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;)V

    return-object v0
.end method

.method public final c(Z)V
    .locals 3

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/X;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/X;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, p1, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;->c:I

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

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->n:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p1, :cond_4

    .line 4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 5
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/N;->c:I

    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 7
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    :cond_4
    return-object p1
.end method

.method public final d()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->B:Lkotlinx/coroutines/flow/n;

    return-object v0
.end method

.method public final d(Z)V
    .locals 6

    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pause oAuthPolling, abort="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "EKyc"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    .line 10
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->q:Lkotlinx/coroutines/x1;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final e(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;

    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_4
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_5
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "EKyc"

    const-string/jumbo v12, "onSubmit"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 3
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    aget-object v4, v4, v9

    .line 4
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v8}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 7
    :cond_6
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->e()Ljava/util/List;

    move-result-object v11

    .line 8
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v12

    .line 9
    iget-object v13, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->m:Lcom/sumsub/sns/internal/core/common/Z0;

    .line 10
    iget-object v14, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    .line 11
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->h()Ljava/util/Map;

    move-result-object v17

    .line 12
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v18

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 13
    invoke-static/range {v11 .. v18}, Lcom/sumsub/sns/internal/features/presentation/utils/g;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/core/common/Z0;Lcom/sumsub/sns/internal/features/domain/appdata/b;ZLjava/lang/Boolean;Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 14
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onSubmit: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " field errors encountered"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "EKyc"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 15
    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 16
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 17
    :cond_7
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    iput v9, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_8

    goto/16 :goto_9

    :cond_8
    move-object v9, v0

    move-object v0, v4

    move-object v4, v11

    :goto_1
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    goto/16 :goto_c

    .line 18
    :cond_9
    :try_start_1
    invoke-virtual {v1, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/util/List;)Lcom/sumsub/sns/internal/features/data/model/common/remote/B;

    move-result-object v4

    .line 19
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 20
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 21
    invoke-virtual {v11}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v11

    .line 22
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 23
    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    iput v7, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    .line 24
    iget-object v7, v10, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 25
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 26
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 27
    invoke-interface {v7, v0, v11, v4, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v3, :cond_a

    goto/16 :goto_9

    :cond_a
    move-object v4, v9

    .line 28
    :goto_2
    :try_start_2
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 29
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Submit response: "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 30
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->b(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;)V
    :try_end_2
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_b

    :goto_3
    move-object v9, v4

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    .line 31
    :goto_4
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    goto :goto_b

    .line 32
    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 33
    invoke-virtual {v1, v9, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 34
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    .line 35
    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getErrorCode()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_6

    .line 36
    :cond_b
    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 37
    :cond_c
    :goto_6
    const-string/jumbo v0, "sns_ekyc_error_common"

    invoke-virtual {v1, v0, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    if-ne v0, v3, :cond_d

    goto :goto_9

    :cond_d
    move-object v4, v1

    .line 38
    :goto_8
    check-cast v0, Ljava/lang/CharSequence;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->a:Ljava/lang/Object;

    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->b:Ljava/lang/Object;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e0;->e:I

    const-string/jumbo v5, "sns_alert_action_dismiss"

    invoke-virtual {v1, v5, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_e

    :goto_9
    return-object v3

    :cond_e
    move-object v3, v0

    move-object v0, v2

    move-object v2, v4

    :goto_a
    check-cast v0, Ljava/lang/CharSequence;

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;

    invoke-direct {v4, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v4}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 39
    :goto_b
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 40
    :cond_f
    :goto_c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 8

    .line 41
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->g()Lcom/sumsub/sns/internal/features/data/model/common/F;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/F;->d:Ljava/util/List;

    if-nez v0, :cond_1

    .line 43
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 44
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/y;

    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    const/4 v6, 0x0

    const/16 v7, 0x1fc

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLjava/lang/String;Ljava/lang/Boolean;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->y:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x4

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
    check-cast v0, Ljava/lang/String;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final g()Lcom/sumsub/sns/internal/features/data/model/common/F;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->l:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->t:Lcom/sumsub/sns/internal/features/domain/appdata/b;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v3, v1

    .line 23
    .line 24
    :goto_0
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    check-cast v0, Ljava/util/List;

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v0, v1

    .line 48
    .line 49
    :goto_1
    if-eqz v0, :cond_5

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    move-object v3, v2

    .line 65
    .line 66
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/F;

    .line 67
    .line 68
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/F;->a:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 71
    .line 72
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 73
    const/4 v6, 0x0

    .line 74
    .line 75
    aget-object v5, v5, v6

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    move-result v3

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    move-object v1, v2

    .line 89
    .line 90
    :cond_4
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/F;

    .line 91
    :cond_5
    return-object v1
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
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/w;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/w;

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

.method public final h()Ljava/util/Map;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->C:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x6

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

.method public final onCleared()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->s:Lkotlinx/coroutines/m0;

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->r:Lkotlinx/coroutines/m1;

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :catch_0
    return-void

    .line 17
    :catch_1
    move-exception v0

    .line 18
    throw v0
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

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->onLoad()V

    .line 4
    .line 5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p1
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
