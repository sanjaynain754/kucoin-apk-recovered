.class public final Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/k;


# static fields
.field public static final synthetic w:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final b:Lcom/sumsub/sns/internal/features/domain/e;

.field public final c:Lcom/sumsub/sns/internal/features/domain/U;

.field public final d:Lcom/sumsub/sns/internal/features/domain/e0;

.field public final e:Lcom/sumsub/sns/internal/features/domain/s0;

.field public final f:Lcom/sumsub/sns/internal/features/domain/q;

.field public final g:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final i:Ljava/lang/String;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final k:Lkotlinx/coroutines/flow/w;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final p:Lkotlinx/coroutines/flow/w;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final r:Lkotlinx/coroutines/flow/w;

.field public final s:Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;

.field public final t:Lkotlinx/coroutines/flow/e;

.field public u:Lkotlin/jvm/functions/Function1;

.field public v:Lkotlinx/coroutines/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "step"

    .line 6
    .line 7
    const-string v2, "getStep()Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "currentPageIndex"

    .line 15
    .line 16
    const-string v4, "getCurrentPageIndex()I"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "currentQuestionnaire"

    .line 23
    .line 24
    const-string v5, "getCurrentQuestionnaire()Lcom/sumsub/sns/internal/features/data/model/common/Questionnaire;"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "currentCountryKey"

    .line 31
    .line 32
    const-string v6, "getCurrentCountryKey()Ljava/lang/String;"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    const-string/jumbo v6, "pendingCameraFieldId"

    .line 40
    .line 41
    const-string v7, "getPendingCameraFieldId()Lcom/sumsub/sns/internal/core/presentation/form/FieldId;"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    const-string v7, "_formViewState"

    .line 48
    .line 49
    const-string v8, "get_formViewState()Lcom/sumsub/sns/internal/core/presentation/form/HostViewModel$FormViewState;"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 53
    move-result-object v0

    .line 54
    const/4 v7, 0x6

    .line 55
    .line 56
    new-array v7, v7, [Lkotlin/reflect/KProperty;

    .line 57
    .line 58
    aput-object v1, v7, v3

    .line 59
    const/4 v1, 0x1

    .line 60
    .line 61
    aput-object v2, v7, v1

    .line 62
    const/4 v1, 0x2

    .line 63
    .line 64
    aput-object v4, v7, v1

    .line 65
    const/4 v1, 0x3

    .line 66
    .line 67
    aput-object v5, v7, v1

    .line 68
    const/4 v1, 0x4

    .line 69
    .line 70
    aput-object v6, v7, v1

    .line 71
    const/4 v1, 0x5

    .line 72
    .line 73
    aput-object v0, v7, v1

    .line 74
    .line 75
    sput-object v7, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 76
    return-void
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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/U;Lcom/sumsub/sns/internal/features/domain/e0;Lcom/sumsub/sns/internal/features/domain/s0;Lcom/sumsub/sns/internal/features/domain/q;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
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
    invoke-direct {p0, p8, p10, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->b:Lcom/sumsub/sns/internal/features/domain/e;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->c:Lcom/sumsub/sns/internal/features/domain/U;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->d:Lcom/sumsub/sns/internal/features/domain/e0;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e:Lcom/sumsub/sns/internal/features/domain/s0;

    .line 20
    .line 21
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->f:Lcom/sumsub/sns/internal/features/domain/q;

    .line 22
    .line 23
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 24
    .line 25
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 26
    .line 27
    const-string p2, "IDDOCSETTYPE"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    check-cast p2, Ljava/lang/String;

    .line 34
    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    const-string p2, "TYPE_UNKNOWN"

    .line 38
    .line 39
    :cond_0
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    .line 40
    .line 41
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 42
    .line 43
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;->INIT:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;

    .line 44
    .line 45
    const-string p4, "KEY_STEP"

    .line 46
    const/4 p5, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {p2, p1, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 50
    .line 51
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 52
    .line 53
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 54
    .line 55
    aget-object p3, p3, p5

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 65
    move-result-object p2

    .line 66
    .line 67
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->k:Lkotlinx/coroutines/flow/w;

    .line 68
    .line 69
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 70
    .line 71
    .line 72
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    const-string p4, "KEY_PAGE_INDEX"

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, p1, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 83
    .line 84
    new-instance p3, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    .line 85
    const/4 p4, 0x0

    .line 86
    .line 87
    .line 88
    invoke-direct {p3, p4, v1}, Lcom/sumsub/sns/internal/features/data/model/common/W2;-><init>(Ljava/lang/String;I)V

    .line 89
    .line 90
    const-string p6, "KEY_CURRENT_QUESTIONNAIRE"

    .line 91
    .line 92
    .line 93
    invoke-direct {p2, p1, p6, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 94
    .line 95
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 96
    .line 97
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 98
    .line 99
    const-string p3, "KEY_CURRENT_COUNTRY"

    .line 100
    .line 101
    .line 102
    invoke-direct {p2, p1, p3, p4, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 103
    .line 104
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 105
    .line 106
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 107
    .line 108
    const-string p3, "KEY_PENDING_CAMERA_FIELD_ID"

    .line 109
    .line 110
    .line 111
    invoke-direct {p2, p1, p3, p4, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 112
    .line 113
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 114
    .line 115
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/v;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2, p1, p4}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/v;-><init>(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p2}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 122
    move-result-object p2

    .line 123
    .line 124
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/z;

    .line 125
    .line 126
    .line 127
    invoke-direct {p3, p2, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/z;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V

    .line 128
    .line 129
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/w;

    .line 130
    .line 131
    .line 132
    invoke-direct {p2, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p3, p2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 136
    move-result-object p2

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 140
    move-result-object p3

    .line 141
    .line 142
    .line 143
    invoke-static {p2, p3}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 144
    move-result-object p2

    .line 145
    .line 146
    .line 147
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 148
    move-result-object p3

    .line 149
    .line 150
    sget-object p6, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    .line 154
    move-result-object p6

    .line 155
    .line 156
    .line 157
    invoke-static {p2, p3, p6, p4}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->p:Lkotlinx/coroutines/flow/w;

    .line 161
    .line 162
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 163
    .line 164
    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 165
    .line 166
    const-string p6, "KEY_FORM_VIEW_STATE"

    .line 167
    .line 168
    .line 169
    invoke-direct {p2, p1, p6, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 170
    .line 171
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 175
    move-result-object p2

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p6, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

    .line 182
    .line 183
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;

    .line 184
    .line 185
    .line 186
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V

    .line 187
    .line 188
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->s:Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;

    .line 189
    .line 190
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/C;

    .line 191
    .line 192
    .line 193
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/C;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 194
    .line 195
    .line 196
    invoke-static {p2}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->t:Lkotlinx/coroutines/flow/e;

    .line 200
    .line 201
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/a0;

    .line 202
    .line 203
    .line 204
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/a0;-><init>()V

    .line 205
    .line 206
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->u:Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    .line 209
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 210
    move-result-object p5

    .line 211
    .line 212
    new-instance p8, Lcom/sumsub/sns/internal/features/presentation/questionnaire/h;

    .line 213
    .line 214
    .line 215
    invoke-direct {p8, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;)V

    .line 216
    const/4 p9, 0x3

    .line 217
    const/4 p10, 0x0

    .line 218
    const/4 p6, 0x0

    .line 219
    const/4 p7, 0x0

    .line 220
    .line 221
    .line 222
    invoke-static/range {p5 .. p10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 223
    return-void
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/domain/S;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 9
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->d:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v44, v9

    move-object v9, v4

    move-object v4, v10

    :goto_1
    move-object/from16 v10, v44

    goto :goto_3

    :cond_3
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v44, v9

    move-object v9, v4

    move-object/from16 v4, v44

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    move-object/from16 v9, p2

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iput v8, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    .line 11
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v1, v7, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_5

    .line 12
    :cond_5
    :goto_2
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez v1, :cond_6

    .line 13
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "failed to load config"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 14
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 15
    :cond_6
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v10, v8, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v44, v9

    move-object v9, v1

    move-object v1, v10

    goto :goto_1

    :goto_3
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez v1, :cond_8

    .line 16
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "failed to load applicant"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 17
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 18
    :cond_8
    sget-object v11, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v11

    .line 19
    invoke-virtual {v1, v11}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object v11

    if-eqz v11, :cond_9

    .line 20
    invoke-virtual {v11}, Lcom/sumsub/sns/internal/features/data/model/common/m;->c()Z

    move-result v11

    goto :goto_4

    :cond_9
    move v11, v7

    .line 21
    :goto_4
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->b:Lcom/sumsub/sns/internal/features/domain/e;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->a:Lcom/sumsub/sns/internal/features/domain/S;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->d:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/D;->g:I

    invoke-virtual {v12, v11, v2}, Lcom/sumsub/sns/internal/features/domain/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_a

    :goto_5
    return-object v3

    :cond_a
    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    move-object v4, v9

    move-object v9, v10

    .line 22
    :goto_6
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/4 v10, 0x0

    goto :goto_7

    :cond_b
    move-object v10, v1

    :goto_7
    check-cast v10, Lcom/sumsub/sns/internal/features/domain/n;

    if-nez v10, :cond_e

    .line 23
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Exception;

    if-eqz v2, :cond_c

    move-object v11, v1

    check-cast v11, Ljava/lang/Exception;

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    :goto_8
    if-nez v11, :cond_d

    new-instance v1, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "countries missing"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_d
    move-object v1, v11

    .line 24
    :goto_9
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 25
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 26
    :cond_e
    iget-object v1, v10, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    .line 27
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v13, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    aget-object v5, v13, v5

    .line 28
    iget-object v5, v12, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 29
    iget-object v12, v12, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v12, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/h;->g:Ljava/util/Map;

    .line 31
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/domain/S;->a:Ljava/lang/String;

    .line 32
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/S;->c:Lcom/sumsub/sns/internal/features/data/model/common/i3;

    .line 33
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/S;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;

    .line 34
    iget-object v5, v9, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a:Ljava/util/Map;

    .line 35
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->u:Lkotlin/jvm/functions/Function1;

    .line 36
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 37
    iget-object v13, v4, Lcom/sumsub/sns/internal/features/data/model/common/i3;->b:Ljava/util/List;

    if-eqz v13, :cond_11

    .line 38
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    .line 39
    iget-object v15, v15, Lcom/sumsub/sns/internal/features/data/model/common/W2;->a:Ljava/lang/String;

    move/from16 p3, v7

    .line 40
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->b:Ljava/lang/String;

    .line 41
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_b

    :cond_f
    move/from16 v7, p3

    goto :goto_a

    :cond_10
    move/from16 p3, v7

    const/4 v14, 0x0

    .line 42
    :goto_b
    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    goto :goto_c

    :cond_11
    move/from16 p3, v7

    const/4 v14, 0x0

    .line 43
    :goto_c
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->h:Ljava/util/List;

    if-eqz v7, :cond_3d

    .line 44
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move/from16 v15, p3

    :goto_d
    const/4 v13, 0x0

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v17, v15, 0x1

    if-gez v15, :cond_12

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_12
    move-object/from16 v15, v16

    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;

    move/from16 v16, v8

    .line 45
    iget-object v8, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->f:Ljava/lang/Boolean;

    .line 46
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    if-eqz v13, :cond_13

    .line 47
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 48
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 49
    iget-object v15, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->f:Ljava/lang/String;

    .line 50
    iget-object v11, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->g:Ljava/lang/String;

    move-object/from16 p2, v3

    .line 51
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    invoke-direct {v6, v8, v15, v11, v3}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 53
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_13
    move-object/from16 p2, v3

    :goto_f
    move-object/from16 v3, p2

    move/from16 v8, v16

    move/from16 v15, v17

    const/4 v6, 0x2

    goto :goto_d

    :cond_14
    move-object/from16 p2, v3

    .line 54
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 55
    iget-object v6, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->c:Ljava/lang/String;

    .line 56
    iget-object v8, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->d:Ljava/lang/String;

    .line 57
    iget-object v11, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->e:Ljava/lang/String;

    .line 58
    new-instance v18, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 59
    sget-object v23, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v27, 0x0

    const/16 v28, 0x300

    const/16 v19, 0x0

    .line 60
    const-string/jumbo v22, "section"

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v6

    move-object/from16 v21, v8

    move-object/from16 v26, v11

    invoke-direct/range {v18 .. v28}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    move-object/from16 v6, v18

    .line 61
    iget-object v8, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->a:Ljava/lang/String;

    if-nez v8, :cond_15

    .line 62
    const-string/jumbo v8, "sectionId"

    .line 63
    :cond_15
    invoke-direct {v3, v6, v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 64
    iget-object v6, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->e:Ljava/lang/String;

    .line 65
    iput-object v6, v3, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    if-nez v13, :cond_16

    .line 66
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 67
    :cond_16
    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v3, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->g:Ljava/util/List;

    if-eqz v3, :cond_3b

    .line 69
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 70
    iget-object v8, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s0;->a:Ljava/lang/String;

    const-string v11, ""

    if-nez v8, :cond_17

    move-object v8, v11

    .line 71
    :cond_17
    sget-object v18, Lcom/sumsub/sns/internal/features/data/model/common/FieldType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/e2;

    move-object/from16 v30, v3

    .line 72
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->d:Ljava/lang/String;

    .line 73
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v31, v7

    .line 74
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/FieldType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    move-result-object v7

    move-object/from16 v18, v11

    .line 75
    array-length v11, v7

    move-object/from16 v19, v7

    move/from16 v7, p3

    :goto_11
    if-ge v7, v11, :cond_19

    aget-object v20, v19, v7

    move/from16 v21, v7

    .line 76
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_12

    :cond_18
    add-int/lit8 v7, v21, 0x1

    goto :goto_11

    :cond_19
    const/16 v20, 0x0

    :goto_12
    if-nez v20, :cond_1a

    const/4 v3, -0x1

    goto :goto_13

    .line 77
    :cond_1a
    sget-object v3, Lcom/sumsub/sns/internal/features/data/utils/c;->a:[I

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v3, v3, v7

    :goto_13
    const-string/jumbo v7, "sns_quiestionnaire_attachment_label"

    const-string/jumbo v11, "sns_quiestionnaire_action_addFile"

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_1
    if-eqz v14, :cond_1b

    .line 78
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 79
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->b(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_14
    move-object/from16 v20, v8

    goto :goto_15

    :cond_1b
    const/4 v3, 0x0

    goto :goto_14

    .line 80
    :goto_15
    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    move-object/from16 v32, v15

    .line 81
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    .line 82
    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    if-eqz v8, :cond_1c

    .line 83
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_1d

    :cond_1c
    const/4 v8, 0x0

    goto :goto_16

    :cond_1d
    move-object v8, v6

    :goto_16
    if-nez v8, :cond_1e

    .line 84
    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    iget-object v15, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->b:Ljava/lang/String;

    move-object/from16 v34, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->c:Ljava/lang/String;

    move-object/from16 v36, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->d:Ljava/lang/String;

    move-object/from16 v37, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    move-object/from16 v38, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->g:Ljava/lang/String;

    move-object/from16 v40, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->h:Ljava/lang/String;

    move-object/from16 v41, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->i:Ljava/util/List;

    move-object/from16 v42, v8

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->j:Ljava/lang/String;

    .line 85
    new-instance v33, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    const-string/jumbo v39, "min_value:1"

    move-object/from16 v43, v8

    move-object/from16 v35, v15

    invoke-direct/range {v33 .. v43}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v19, v33

    goto :goto_17

    :cond_1e
    move-object/from16 v19, v8

    .line 86
    :goto_17
    invoke-interface {v5, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v8

    check-cast v22, Ljava/lang/String;

    const/16 v8, 0xa

    if-eqz v3, :cond_20

    .line 87
    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-static {v11}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v11

    const/16 v15, 0x10

    invoke-static {v11, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v11

    .line 88
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 89
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 90
    move-object/from16 v8, v18

    check-cast v8, Ljava/lang/String;

    move-object/from16 v18, v11

    .line 91
    invoke-interface {v9, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 92
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v15, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v11, v18

    const/16 v8, 0xa

    goto :goto_18

    :cond_1f
    move-object/from16 v28, v15

    goto :goto_19

    :cond_20
    const/16 v28, 0x0

    .line 93
    :goto_19
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v29, v7

    check-cast v29, Ljava/lang/String;

    .line 94
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v3, :cond_22

    .line 95
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 97
    check-cast v11, Ljava/lang/String;

    .line 98
    sget-object v11, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 99
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_21
    :goto_1b
    move-object/from16 v25, v7

    goto :goto_1c

    .line 100
    :cond_22
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    goto :goto_1b

    .line 101
    :goto_1c
    sget-object v27, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v26, 0x0

    move-object/from16 v21, v3

    .line 102
    invoke-direct/range {v18 .. v29}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/util/List;Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;Ljava/lang/String;)V

    :goto_1d
    move-object/from16 v3, v18

    const/4 v11, 0x0

    goto/16 :goto_2f

    :pswitch_2
    move-object/from16 v32, v15

    move-object/from16 v3, v18

    .line 103
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v14, :cond_23

    .line 104
    iget-object v15, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 105
    invoke-static {v14, v8, v15}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v21, v15

    goto :goto_1e

    :cond_23
    const/16 v21, 0x0

    .line 106
    :goto_1e
    invoke-interface {v5, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v22, v11

    check-cast v22, Ljava/lang/String;

    if-eqz v14, :cond_24

    .line 107
    iget-object v11, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 108
    invoke-static {v14, v8, v11}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_25

    :cond_24
    move-object v11, v3

    :cond_25
    invoke-interface {v9, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v27, v3

    check-cast v27, Ljava/lang/String;

    .line 109
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v28, v3

    check-cast v28, Ljava/lang/String;

    .line 110
    sget-object v24, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v26, v24

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 111
    invoke-direct/range {v18 .. v28}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1d

    :pswitch_3
    move-object/from16 v32, v15

    .line 112
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    .line 113
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    if-nez v3, :cond_26

    .line 114
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_26
    move-object/from16 v21, v3

    if-eqz v14, :cond_27

    .line 115
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 116
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->b(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v22, v3

    goto :goto_1f

    :cond_27
    const/16 v22, 0x0

    :goto_1f
    const/16 v23, 0x1

    const/16 v24, 0x0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 117
    invoke-direct/range {v18 .. v24}, Lcom/sumsub/sns/internal/core/presentation/form/model/o;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;ZLjava/lang/CharSequence;)V

    goto :goto_1d

    :pswitch_4
    move-object/from16 v32, v15

    .line 118
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 119
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    if-nez v3, :cond_28

    .line 120
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_28
    move-object/from16 v21, v3

    if-eqz v14, :cond_29

    .line 121
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 122
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v22, v3

    goto :goto_20

    :cond_29
    const/16 v22, 0x0

    :goto_20
    const/16 v24, 0x0

    const/16 v25, 0x60

    const/16 v23, 0x1

    move-object/from16 v20, v6

    move-object/from16 v19, v8

    .line 123
    invoke-direct/range {v18 .. v25}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    goto/16 :goto_1d

    :pswitch_5
    move-object/from16 v32, v15

    .line 124
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    if-eqz v14, :cond_2a

    .line 125
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 126
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->b(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_21

    :cond_2a
    const/16 v21, 0x0

    :goto_21
    const/16 v22, 0x0

    const/16 v23, 0xf8

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 127
    invoke-direct/range {v18 .. v23}, Lcom/sumsub/sns/internal/core/presentation/form/model/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    goto/16 :goto_1d

    :pswitch_6
    move-object/from16 v32, v15

    .line 128
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    if-eqz v14, :cond_2b

    .line 129
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 130
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_22

    :cond_2b
    const/16 v21, 0x0

    :goto_22
    const/16 v23, 0x0

    const/16 v24, 0x38

    const/16 v22, 0x0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 131
    invoke-direct/range {v18 .. v24}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    goto/16 :goto_1d

    :pswitch_7
    move-object/from16 v32, v15

    .line 132
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/T;

    if-eqz v14, :cond_2c

    .line 133
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 134
    invoke-static {v14, v8, v7}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object v11, v7

    :goto_23
    const/4 v7, 0x0

    goto :goto_24

    :cond_2c
    const/4 v11, 0x0

    goto :goto_23

    .line 135
    :goto_24
    invoke-direct {v3, v6, v8, v11, v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/T;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_25
    move-object v11, v7

    goto/16 :goto_2f

    :pswitch_8
    move-object/from16 v32, v15

    const/4 v7, 0x0

    .line 136
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/l;

    if-eqz v14, :cond_2d

    .line 137
    iget-object v11, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 138
    invoke-static {v14, v8, v11}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_26

    :cond_2d
    move-object v11, v7

    .line 139
    :goto_26
    invoke-direct {v3, v6, v8, v11, v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/l;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_25

    :pswitch_9
    move-object/from16 v32, v15

    const/4 v7, 0x0

    .line 140
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/u;

    if-eqz v14, :cond_2e

    .line 141
    iget-object v11, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 142
    invoke-static {v14, v8, v11}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_27

    :cond_2e
    move-object v11, v7

    .line 143
    :goto_27
    invoke-direct {v3, v6, v8, v11, v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/u;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_25

    :pswitch_a
    move-object/from16 v32, v15

    .line 144
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/s;

    if-eqz v14, :cond_2f

    .line 145
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 146
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v22, v7

    goto :goto_28

    :cond_2f
    const/16 v22, 0x0

    :goto_28
    const/16 v21, 0x0

    const/16 v24, 0x1

    const/16 v23, 0x0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 147
    invoke-direct/range {v18 .. v24}, Lcom/sumsub/sns/internal/core/presentation/form/model/s;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Z)V

    goto/16 :goto_1d

    :pswitch_b
    move-object/from16 v32, v15

    .line 148
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 149
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    if-nez v3, :cond_30

    .line 150
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_30
    move-object/from16 v21, v3

    .line 151
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    if-nez v3, :cond_31

    .line 152
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_31
    move-object/from16 v22, v3

    .line 153
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    if-eqz v14, :cond_32

    .line 154
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 155
    invoke-static {v14, v8, v7}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v25, v7

    goto :goto_29

    :cond_32
    const/16 v25, 0x0

    :goto_29
    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v24, 0x0

    move-object/from16 v23, v3

    move-object/from16 v20, v6

    move-object/from16 v19, v8

    .line 156
    invoke-direct/range {v18 .. v27}, Lcom/sumsub/sns/internal/core/presentation/form/model/O;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Z)V

    goto/16 :goto_1d

    :pswitch_c
    move-object/from16 v32, v15

    .line 157
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;

    if-eqz v14, :cond_33

    .line 158
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 159
    invoke-static {v14, v8, v7}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :goto_2a
    const/4 v11, 0x0

    goto :goto_2b

    :cond_33
    const/4 v7, 0x0

    goto :goto_2a

    .line 160
    :goto_2b
    invoke-direct {v3, v6, v8, v7, v11}, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_2f

    :pswitch_d
    move-object/from16 v32, v15

    const/4 v11, 0x0

    .line 161
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/M0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/v0;

    .line 162
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    .line 163
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Lcom/sumsub/sns/internal/features/data/model/common/v0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/M0;

    move-result-object v3

    .line 164
    instance-of v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/L0;

    if-eqz v3, :cond_37

    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 165
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    if-nez v3, :cond_34

    .line 166
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_34
    move-object/from16 v21, v3

    .line 167
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    if-nez v3, :cond_35

    .line 168
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_35
    move-object/from16 v22, v3

    .line 169
    iget-object v3, v10, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    if-eqz v14, :cond_36

    .line 170
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 171
    invoke-static {v14, v8, v7}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v25, v7

    goto :goto_2c

    :cond_36
    move-object/from16 v25, v11

    :goto_2c
    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v24, 0x0

    move-object/from16 v23, v3

    move-object/from16 v20, v6

    move-object/from16 v19, v8

    .line 172
    invoke-direct/range {v18 .. v27}, Lcom/sumsub/sns/internal/core/presentation/form/model/O;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Z)V

    :goto_2d
    move-object/from16 v3, v18

    goto :goto_2f

    .line 173
    :cond_37
    new-instance v18, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    if-eqz v14, :cond_38

    .line 174
    iget-object v3, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 175
    invoke-static {v14, v8, v3}, Lcom/sumsub/sns/internal/features/data/utils/d;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v21, v7

    goto :goto_2e

    :cond_38
    move-object/from16 v21, v11

    :goto_2e
    const/16 v25, 0x0

    const/16 v26, 0xf0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    .line 176
    invoke-direct/range {v18 .. v26}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    goto :goto_2d

    :pswitch_e
    move-object/from16 v32, v15

    const/4 v11, 0x0

    move-object v3, v11

    :goto_2f
    if-eqz v3, :cond_39

    .line 177
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->h:Ljava/lang/String;

    .line 178
    iput-object v6, v3, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    move-object v7, v3

    goto :goto_30

    :cond_39
    move-object v7, v11

    :goto_30
    if-eqz v7, :cond_3a

    .line 179
    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3a
    move-object/from16 v3, v30

    move-object/from16 v7, v31

    move-object/from16 v15, v32

    goto/16 :goto_10

    :cond_3b
    move-object/from16 v31, v7

    const/4 v11, 0x0

    move-object/from16 v3, p2

    move/from16 v8, v16

    move/from16 v15, v17

    move-object/from16 v7, v31

    const/4 v6, 0x2

    goto/16 :goto_e

    :cond_3c
    const/4 v11, 0x0

    :goto_31
    move-object/from16 p2, v3

    move/from16 v16, v8

    goto :goto_32

    :cond_3d
    const/4 v11, 0x0

    move-object v13, v11

    goto :goto_31

    :goto_32
    if-eqz v13, :cond_3f

    .line 180
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 181
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 182
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->f:Ljava/lang/String;

    .line 183
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;->g:Ljava/lang/String;

    .line 184
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_3e

    goto :goto_33

    :cond_3e
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    :goto_33
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 185
    invoke-direct {v3, v5, v6, v2, v7}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 186
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    :cond_3f
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Loaded pages: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "SNSQuestionnaireViewModel"

    invoke-static {v2, v5, v3}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-virtual/range {p2 .. p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v2

    .line 189
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 190
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_40
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_41

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v3, v7

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 191
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v3

    .line 192
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 193
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_34

    :cond_41
    move-object v7, v11

    .line 194
    :goto_34
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz v7, :cond_42

    .line 195
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getResult()Lcom/sumsub/sns/internal/features/data/model/common/M;

    move-result-object v2

    if-eqz v2, :cond_42

    .line 196
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/data/model/common/M;->e:Ljava/util/Map;

    goto :goto_35

    :cond_42
    move-object v7, v11

    :goto_35
    if-nez v7, :cond_43

    .line 197
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v7

    .line 198
    :cond_43
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 199
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_44
    :goto_36
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_45

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 200
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 201
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 202
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    if-ne v6, v7, :cond_44

    .line 203
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_36

    .line 204
    :cond_45
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_46

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 206
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    .line 207
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 208
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 209
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    .line 210
    invoke-direct {v6, v7, v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/A;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    .line 212
    :cond_46
    invoke-static {v12, v3}, Lcom/sumsub/sns/internal/core/presentation/form/m;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    .line 213
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a(Ljava/util/List;)V

    .line 214
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    aget-object v3, v3, v16

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 215
    iget-object v5, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 216
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v2, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 217
    iget-object v2, v4, Lcom/sumsub/sns/internal/features/data/model/common/i3;->b:Ljava/util/List;

    if-eqz v2, :cond_4a

    .line 218
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_47
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_48

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    .line 219
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/W2;->a:Ljava/lang/String;

    .line 220
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_47

    move-object v11, v3

    .line 221
    :cond_48
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    if-nez v11, :cond_49

    goto :goto_38

    :cond_49
    const/4 v2, 0x2

    goto :goto_39

    .line 222
    :cond_4a
    :goto_38
    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    const/4 v2, 0x2

    invoke-direct {v11, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/W2;-><init>(Ljava/lang/String;I)V

    .line 223
    :goto_39
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    aget-object v2, v3, v2

    .line 224
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 225
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v1, v11}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 226
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;->CHANGE_PAGE:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;

    .line 227
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v3, v3, p3

    .line 228
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 229
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 230
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 277
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "SNSQuestionnaireViewModel"

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->a:Z

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 278
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->f()Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object p2

    .line 279
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Submitting questionnaire "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v5, v7}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/W2;->a:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 281
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->f()Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Nothing to send, questionnaire id == null.\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v5, p2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->a(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 283
    :cond_3
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v2

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/questionnaire/F;

    invoke-direct {v7, p0, p2, v3}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lcom/sumsub/sns/internal/features/data/model/common/W2;Lkotlin/coroutines/Continuation;)V

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->a:Z

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/E;->d:I

    invoke-static {v2, v7, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    .line 284
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v3, p2

    :goto_2
    check-cast v3, Lkotlin/Unit;

    if-nez v3, :cond_9

    .line 285
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_6

    new-instance p2, Ljava/lang/Error;

    const-string v0, "Failed to submit questionnaire"

    invoke-direct {p2, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    :cond_6
    move-object v7, p2

    .line 286
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_7

    const-string p2, ""

    .line 288
    :cond_7
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 289
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 290
    invoke-virtual {v0, v5, p2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_8

    .line 291
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 292
    :cond_8
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 293
    :cond_9
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

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
    .locals 10

    .line 294
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v3

    .line 295
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    move-result-object v0

    .line 296
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 297
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->LOADING:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 298
    invoke-static {v0, v3, p2, v1}, Lcom/sumsub/sns/internal/core/presentation/form/m;->a(Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;)Ljava/util/List;

    move-result-object v0

    .line 299
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a(Ljava/util/List;)V

    .line 300
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/t;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, v6

    const/4 v6, 0x0

    move-object v7, v0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V
    .locals 5

    .line 231
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->f()Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/W2;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/util/Map;I)Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object v0

    .line 232
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v1

    .line 233
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p1

    .line 234
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 236
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 237
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 238
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/e3;

    invoke-direct {v4}, Lcom/sumsub/sns/internal/features/data/model/common/e3;-><init>()V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    if-nez p1, :cond_3

    goto :goto_2

    .line 239
    :cond_3
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 240
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    if-eqz p2, :cond_6

    .line 241
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_1

    .line 242
    :cond_5
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;->a:Ljava/util/Map;

    .line 243
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/a3;

    const/4 v4, 0x1

    invoke-direct {v3, v2, p2, v4}, Lcom/sumsub/sns/internal/features/data/model/common/a3;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 244
    :cond_6
    :goto_1
    iget-object p2, v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;->a:Ljava/util/Map;

    .line 245
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x2

    aget-object p2, p2, v1

    .line 247
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 248
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V
    .locals 0

    .line 3
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V
    .locals 13

    .line 249
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 250
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x4

    aget-object v6, v4, v5

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 251
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Got result from camera: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", result: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 252
    const-string v6, "SNSQuestionnaireViewModel"

    invoke-static {v2, v6, v3}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v3, v4, v5

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 254
    :cond_0
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v4, v4, v5

    .line 255
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 256
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    move-result-object v3

    .line 258
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 259
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 260
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 261
    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 262
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 263
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 264
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v6, 0x0

    :cond_2
    if-ge v6, v3, :cond_4

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    move-object v8, v7

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 265
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->getSectionId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 266
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v9

    .line 267
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v9, :cond_3

    .line 268
    invoke-static {v8}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 269
    :cond_3
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->getItemId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_4
    move-object v7, v5

    .line 270
    :goto_1
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    if-eqz v7, :cond_6

    .line 271
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 272
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->j:Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 273
    const-string v3, "ARBITRARY_DOC"

    goto :goto_2

    :cond_5
    const-string v3, "FILE_ATTACHMENT"

    goto :goto_2

    :cond_6
    move-object v3, v5

    :goto_2
    if-nez v3, :cond_7

    :goto_3
    return-void

    :cond_7
    const/16 v4, 0x3f7

    .line 274
    invoke-static {p1, v5, v3, v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 275
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/X;

    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    invoke-direct {v0, v6}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v0, v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 276
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/H;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 6

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/presentation/form/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/f;ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;I)Lcom/sumsub/sns/internal/core/presentation/form/f;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

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

    .line 4
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->s:Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;

    return-object v0
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 5

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->f()Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/W2;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Ljava/util/Map;I)Lcom/sumsub/sns/internal/features/data/model/common/W2;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p1

    .line 6
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 8
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 9
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 10
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/e3;

    invoke-direct {v4}, Lcom/sumsub/sns/internal/features/data/model/common/e3;-><init>()V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    const/4 v3, 0x2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    if-nez p1, :cond_3

    goto :goto_1

    .line 11
    :cond_3
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;->b:Ljava/util/Map;

    .line 12
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    if-nez p2, :cond_5

    .line 13
    iget-object p2, v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;->a:Ljava/util/Map;

    .line 14
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 15
    :cond_5
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/e3;->a:Ljava/util/Map;

    .line 16
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/a3;

    invoke-direct {v4, p2, v2, v3}, Lcom/sumsub/sns/internal/features/data/model/common/a3;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    invoke-interface {v1, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    aget-object p2, p2, v3

    .line 18
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 10

    .line 1
    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 7
    .line 8
    const-string v0, "SNSQuestionnaireViewModel"

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
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    .line 23
    const/4 v6, 0x4

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v2, p0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlinx/coroutines/flow/g;->C()Lkotlinx/coroutines/flow/e;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_0
    move-object v2, p0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    const-string/jumbo v0, "sns_questionnaire_mime_types"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v9, 0x1

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 54
    move-result v4

    .line 55
    xor-int/2addr v4, v9

    .line 56
    .line 57
    if-ne v4, v9, :cond_1

    .line 58
    move-object v6, v0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v6, v1

    .line 61
    .line 62
    :goto_0
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 63
    .line 64
    .line 65
    const-string/jumbo v0, "sns_quiestionnaire_field_isRequired"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    const-string/jumbo v4, "sns_quiestionnaire_field_isNotValid"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-direct {v7, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/form/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const/4 v8, 0x3

    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/internal/core/presentation/form/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/f;ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;I)Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 89
    .line 90
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 91
    const/4 v5, 0x5

    .line 92
    .line 93
    aget-object v4, v4, v5

    .line 94
    .line 95
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 96
    .line 97
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v3, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 101
    .line 102
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;

    .line 103
    .line 104
    .line 105
    const-string/jumbo v3, "sns_quiestionnaire_action_continue"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object v3

    .line 110
    const/4 v4, 0x0

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v4, v4, v9, v3}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;-><init>(IZZLjava/lang/CharSequence;)V

    .line 114
    .line 115
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->k:Lkotlinx/coroutines/flow/w;

    .line 116
    .line 117
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->p:Lkotlinx/coroutines/flow/w;

    .line 118
    .line 119
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->t:Lkotlinx/coroutines/flow/e;

    .line 120
    .line 121
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/questionnaire/r;

    .line 122
    .line 123
    .line 124
    invoke-direct {v6, p0, p1, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;Lkotlin/coroutines/Continuation;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3, v4, v5, v6}, Lkotlinx/coroutines/flow/g;->n(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/e;

    .line 128
    move-result-object p1

    .line 129
    return-object p1
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

.method public final d()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->r:Lkotlinx/coroutines/flow/w;

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

.method public final e()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    move-result v0

    .line 18
    return v0
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

.method public final f()Lcom/sumsub/sns/internal/features/data/model/common/W2;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x2

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
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/W2;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final g()Lcom/sumsub/sns/internal/core/presentation/form/f;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x5

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
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final h()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    sget-object v2, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    .line 9
    .line 10
    const/16 v6, 0xe

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 19
    return-void

    .line 20
    :cond_0
    move-object v1, p0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 24
    move-result v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 29
    .line 30
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 31
    const/4 v4, 0x1

    .line 32
    .line 33
    aget-object v4, v3, v4

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;->CHANGE_PAGE:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;

    .line 47
    .line 48
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 49
    const/4 v4, 0x0

    .line 50
    .line 51
    aget-object v3, v3, v4

    .line 52
    .line 53
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 64
    move-result v2

    .line 65
    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    const-string v4, "Showing previous page: "

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    const-string v3, "SNSQuestionnaireViewModel"

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v3, v2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

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

.method public final i()V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v1, v1, Lcom/sumsub/sns/internal/core/presentation/form/f;->a:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 12
    move-result v2

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    move v1, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v1, v3

    .line 23
    .line 24
    :goto_0
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/h0;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 31
    .line 32
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    move-result v7

    .line 44
    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 52
    .line 53
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_2
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->s:Lcom/sumsub/sns/internal/features/presentation/questionnaire/s;

    .line 60
    .line 61
    .line 62
    invoke-static {v6, v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/l;)Lcom/sumsub/sns/internal/core/presentation/form/model/e;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 70
    .line 71
    .line 72
    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 76
    .line 77
    if-eqz v6, :cond_9

    .line 78
    .line 79
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 80
    .line 81
    if-eqz v6, :cond_9

    .line 82
    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    move-result v7

    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    goto :goto_4

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    move-result-object v6

    .line 93
    .line 94
    .line 95
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    move-result v7

    .line 97
    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    .line 101
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    move-result-object v7

    .line 103
    .line 104
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 105
    .line 106
    instance-of v8, v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 107
    .line 108
    if-eqz v8, :cond_5

    .line 109
    .line 110
    iget-object v8, v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e;->a:Ljava/util/LinkedHashSet;

    .line 111
    .line 112
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 113
    .line 114
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;->e:Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 118
    move-result v7

    .line 119
    goto :goto_3

    .line 120
    .line 121
    :cond_5
    iget-object v8, v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e;->b:Ljava/util/LinkedHashSet;

    .line 122
    .line 123
    .line 124
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 125
    move-result v9

    .line 126
    .line 127
    if-eqz v9, :cond_6

    .line 128
    goto :goto_2

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    move-result-object v8

    .line 133
    .line 134
    .line 135
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    move-result v9

    .line 137
    .line 138
    if-eqz v9, :cond_8

    .line 139
    .line 140
    .line 141
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    move-result-object v9

    .line 143
    .line 144
    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->getSectionId()Ljava/lang/String;

    .line 148
    move-result-object v10

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    .line 152
    move-result-object v11

    .line 153
    .line 154
    .line 155
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    move-result v10

    .line 157
    .line 158
    if-eqz v10, :cond_7

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->getItemId()Ljava/lang/String;

    .line 162
    move-result-object v9

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 166
    move-result-object v10

    .line 167
    .line 168
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    move-result v9

    .line 173
    .line 174
    if-eqz v9, :cond_7

    .line 175
    move v7, v4

    .line 176
    goto :goto_3

    .line 177
    :cond_8
    :goto_2
    move v7, v3

    .line 178
    .line 179
    :goto_3
    if-nez v7, :cond_4

    .line 180
    goto :goto_5

    .line 181
    :cond_9
    :goto_4
    move v3, v4

    .line 182
    .line 183
    :goto_5
    if-eqz v3, :cond_b

    .line 184
    .line 185
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 186
    .line 187
    new-instance v5, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    const-string v6, "Empty page: "

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    const-string v5, "SNSQuestionnaireViewModel"

    .line 205
    .line 206
    .line 207
    invoke-static {v3, v5, v2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->a(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    if-eqz v1, :cond_a

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 216
    move-result-object v6

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 220
    move-result-object v7

    .line 221
    .line 222
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;

    .line 223
    const/4 v1, 0x0

    .line 224
    .line 225
    .line 226
    invoke-direct {v9, v0, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V

    .line 227
    const/4 v10, 0x2

    .line 228
    const/4 v11, 0x0

    .line 229
    const/4 v8, 0x0

    .line 230
    .line 231
    .line 232
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 233
    return-void

    .line 234
    .line 235
    .line 236
    :cond_a
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->h()V

    .line 237
    return-void

    .line 238
    .line 239
    .line 240
    :cond_b
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 241
    move-result-object v12

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 245
    move-result v13

    .line 246
    .line 247
    const/16 v16, 0x0

    .line 248
    .line 249
    const/16 v17, 0xe

    .line 250
    const/4 v14, 0x0

    .line 251
    const/4 v15, 0x0

    .line 252
    .line 253
    .line 254
    invoke-static/range {v12 .. v17}, Lcom/sumsub/sns/internal/core/presentation/form/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/f;ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;I)Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 255
    move-result-object v1

    .line 256
    .line 257
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 258
    .line 259
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 260
    const/4 v4, 0x5

    .line 261
    .line 262
    aget-object v3, v3, v4

    .line 263
    .line 264
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 265
    .line 266
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 270
    return-void
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 14

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/o;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/o;

    .line 8
    .line 9
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/k;->a:Lcom/sumsub/sns/internal/features/presentation/questionnaire/k;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    const/4 p1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;

    .line 31
    .line 32
    .line 33
    invoke-direct {v6, p0, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V

    .line 34
    const/4 v7, 0x2

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 40
    return-void

    .line 41
    .line 42
    :cond_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/n;

    .line 43
    const/4 v3, 0x3

    .line 44
    const/4 v4, 0x4

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/n;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/n;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 57
    .line 58
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 59
    .line 60
    aget-object v2, v1, v4

    .line 61
    .line 62
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/j;

    .line 70
    .line 71
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/documents/s;

    .line 72
    .line 73
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 74
    .line 75
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->i:Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-direct {v2, v4}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    aget-object v1, v1, v3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    check-cast v1, Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/form/f;->c:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/c;->a(Ljava/lang/String;)[Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    if-nez v3, :cond_2

    .line 103
    :cond_1
    const/4 v3, 0x0

    .line 104
    .line 105
    new-array v3, v3, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-direct {v0, v2, v1, v3}, Lcom/sumsub/sns/internal/features/domain/documents/s;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;[Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/j;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/s;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 115
    return-void

    .line 116
    .line 117
    :cond_3
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/m;

    .line 118
    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/m;

    .line 122
    .line 123
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/m;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 130
    .line 131
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 132
    .line 133
    aget-object v4, v1, v4

    .line 134
    .line 135
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/i;

    .line 143
    .line 144
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 145
    .line 146
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 147
    .line 148
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 149
    .line 150
    const-string v5, "TYPE_UNKNOWN"

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, v5}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v6, v0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 160
    move-result-object v7

    .line 161
    .line 162
    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    .line 163
    .line 164
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 165
    .line 166
    aget-object v1, v1, v3

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 170
    move-result-object v0

    .line 171
    move-object v11, v0

    .line 172
    .line 173
    check-cast v11, Ljava/lang/String;

    .line 174
    const/4 v12, 0x0

    .line 175
    .line 176
    const/16 v13, 0x110

    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v8, 0x0

    .line 179
    const/4 v9, 0x0

    .line 180
    .line 181
    .line 182
    invoke-direct/range {v4 .. v13}, Lcom/sumsub/sns/internal/features/domain/documents/M;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/util/List;ZZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;Ljava/lang/String;ZI)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/i;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/M;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 189
    return-void

    .line 190
    .line 191
    :cond_4
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/l;

    .line 192
    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/l;

    .line 196
    .line 197
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/l;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    .line 201
    return-void

    .line 202
    .line 203
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 204
    .line 205
    .line 206
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 207
    throw p1

    .line 208
    .line 209
    .line 210
    :cond_6
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 211
    return-void
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

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v6, 0xf

    .line 7
    const/4 v7, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 1

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
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->h()V

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
