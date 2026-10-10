.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic v:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

.field public final d:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final g:Lkotlinx/coroutines/flow/w;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final j:Lkotlinx/coroutines/flow/w;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final l:Lkotlinx/coroutines/flow/w;

.field public final m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final n:Lkotlinx/coroutines/flow/w;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final p:Lkotlinx/coroutines/flow/w;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public r:Z

.field public s:Z

.field public t:Z

.field public final u:Lcom/sumsub/sns/internal/core/presentation/android/g;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "step"

    .line 6
    .line 7
    const-string v2, "getStep()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;"

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
    const-string v2, "email"

    .line 15
    .line 16
    const-string v4, "getEmail()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdEmail;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "documentItems"

    .line 23
    .line 24
    const-string v5, "getDocumentItems()Ljava/util/List;"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "agreementState"

    .line 31
    .line 32
    const-string v6, "getAgreementState()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdAgreementState;"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    const-string v6, "accountInfo"

    .line 39
    .line 40
    const-string v7, "getAccountInfo()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdAccountInfoHolder;"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    const-string v7, "lastLoginResponse"

    .line 47
    .line 48
    const-string v8, "getLastLoginResponse()Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdLoginResponse;"

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 52
    move-result-object v0

    .line 53
    const/4 v7, 0x6

    .line 54
    .line 55
    new-array v7, v7, [Lkotlin/reflect/KProperty;

    .line 56
    .line 57
    aput-object v1, v7, v3

    .line 58
    const/4 v1, 0x1

    .line 59
    .line 60
    aput-object v2, v7, v1

    .line 61
    const/4 v1, 0x2

    .line 62
    .line 63
    aput-object v4, v7, v1

    .line 64
    const/4 v1, 0x3

    .line 65
    .line 66
    aput-object v5, v7, v1

    .line 67
    const/4 v1, 0x4

    .line 68
    .line 69
    aput-object v6, v7, v1

    .line 70
    const/4 v1, 0x5

    .line 71
    .line 72
    aput-object v0, v7, v1

    .line 73
    .line 74
    sput-object v7, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    .line 75
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/presentation/verification/d;Landroidx/lifecycle/SavedStateHandle;)V
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
    invoke-direct {p0, p1, p2, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->d:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 20
    .line 21
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 22
    .line 23
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 24
    .line 25
    .line 26
    const-string/jumbo p3, "step"

    .line 27
    const/4 p5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, p7, p3, p2, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 31
    .line 32
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p7, p3, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->g:Lkotlinx/coroutines/flow/w;

    .line 39
    .line 40
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 41
    .line 42
    iget-object p2, p4, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    .line 45
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 49
    .line 50
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->h:Lkotlinx/coroutines/flow/n;

    .line 60
    .line 61
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 62
    .line 63
    const-string p6, "email"

    .line 64
    .line 65
    .line 66
    invoke-direct {p3, p7, p6, p1, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 67
    .line 68
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p7, p6, p1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->j:Lkotlinx/coroutines/flow/w;

    .line 75
    .line 76
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 77
    .line 78
    new-instance p3, Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    const-string v0, "documents"

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, p7, v0, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 87
    .line 88
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p7, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->l:Lkotlinx/coroutines/flow/w;

    .line 100
    .line 101
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 102
    .line 103
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;

    .line 104
    .line 105
    .line 106
    invoke-direct {p3}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;-><init>()V

    .line 107
    .line 108
    const-string v0, "agreement"

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, p7, v0, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 112
    .line 113
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 114
    .line 115
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p7, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->n:Lkotlinx/coroutines/flow/w;

    .line 125
    .line 126
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 127
    .line 128
    const-string p3, "account"

    .line 129
    const/4 v0, 0x0

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p7, p3, v0, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 133
    .line 134
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p7, p3, v0}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 138
    move-result-object p1

    .line 139
    .line 140
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->p:Lkotlinx/coroutines/flow/w;

    .line 141
    .line 142
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 143
    .line 144
    const-string p3, "login_response"

    .line 145
    .line 146
    .line 147
    invoke-direct {p1, p7, p3, v0, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 148
    .line 149
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 150
    .line 151
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 152
    .line 153
    .line 154
    invoke-direct {p1, p7}, Lcom/sumsub/sns/internal/core/presentation/android/g;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 155
    .line 156
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->u:Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 157
    .line 158
    iget-object p1, p4, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 159
    .line 160
    .line 161
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 165
    .line 166
    iget-boolean p3, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->b:Z

    .line 167
    .line 168
    if-eqz p3, :cond_0

    .line 169
    .line 170
    iget-object p3, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a:Ljava/lang/String;

    .line 171
    .line 172
    if-eqz p3, :cond_0

    .line 173
    .line 174
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 175
    .line 176
    .line 177
    invoke-direct {p4, p3}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    .line 180
    const/4 p5, 0x1

    .line 181
    .line 182
    aget-object p3, p3, p5

    .line 183
    .line 184
    .line 185
    invoke-virtual {p7, p6, p4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->c:Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c(Z)V

    .line 191
    .line 192
    .line 193
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 194
    move-result-object p1

    .line 195
    .line 196
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/V;

    .line 197
    .line 198
    .line 199
    invoke-direct {p3, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 203
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 27
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 28
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    const/4 v2, 0x0

    invoke-direct {p2, v2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 30
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    aget-object v4, v4, v3

    .line 31
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 32
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v2, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    .line 33
    const-string p2, "(?:[a-z0-9!#$%&\'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&\'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"

    const/4 v2, 0x2

    invoke-static {p2, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 34
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 36
    :cond_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 37
    :cond_4
    :goto_1
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w0;->d:I

    const-string/jumbo p1, "sns_data_error_fieldIsMalformed"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/CharSequence;

    .line 38
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    move-result-object p1

    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;->a:Ljava/lang/String;

    .line 40
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 41
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    aget-object p1, p1, v3

    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 43
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    const-string p0, "check email, invalid email"

    invoke-static {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 45
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->b:Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    const-string p1, "accept agreement"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 4
    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->e:I

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;

    .line 6
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;

    .line 8
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    :goto_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne p1, v1, :cond_6

    goto :goto_7

    .line 10
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 12
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object v2, p1

    check-cast v2, Lkotlin/Unit;

    .line 13
    const-string v2, "agreement accepted"

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 14
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdGreetingScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;)V

    .line 15
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 16
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 17
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 18
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->c:Z

    .line 19
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c(Z)V

    .line 20
    :cond_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 21
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 22
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    const-string v5, "SnsId"

    const-string v6, "error while accepting agreement"

    invoke-virtual {v4, v5, v6, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->b:Ljava/lang/Throwable;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j0;->e:I

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    move-object v0, v2

    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 25
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/X;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/X;

    const-string v1, "SumsubId"

    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 26
    :cond_9
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_7
    return-object v1
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;

    .line 4
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K0;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v2, p0

    move-object p0, p1

    move-object p1, v0

    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 6
    const-string/jumbo v1, "sumsubid.confirmationFailure.title"

    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    .line 7
    :goto_2
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v0, p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    invoke-direct {v3, v0, p0, v1}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;)V

    const/16 v7, 0xc

    const/4 v8, 0x0

    .line 9
    const-string v4, "SumsubId"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 57
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    instance-of p2, p1, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    if-eqz p2, :cond_6

    .line 59
    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getCode()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x191

    if-ne v5, v6, :cond_6

    .line 60
    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getErrorCode()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v5, 0x28a2

    if-ne v2, v5, :cond_6

    .line 61
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_3

    :cond_6
    :goto_2
    if-eqz p2, :cond_a

    .line 62
    move-object p2, p1

    check-cast p2, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    invoke-virtual {p2}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getCode()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v5, 0x193

    if-ne v2, v5, :cond_a

    .line 63
    invoke-virtual {p2}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getErrorCode()Ljava/lang/Integer;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v2, 0x28a1

    if-ne p2, v2, :cond_a

    .line 64
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C0;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->b(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    const/4 v4, 0x0

    .line 65
    :cond_a
    :goto_5
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/analytics/Screen;)V
    .locals 3

    .line 49
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->s:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->t:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->t:Z

    .line 52
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 53
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/StepAction;->Completed:Lcom/sumsub/sns/internal/core/analytics/StepAction;

    const-string v2, "SumsubId"

    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/StepAction;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v0

    .line 54
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "screenName"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p1}, [Lkotlin/Pair;

    move-result-object p1

    .line 55
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    const/4 p1, 0x0

    .line 56
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 47
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 48
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->a:Ljava/lang/Throwable;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    const-string p2, "Throw blocked error"

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->a:Ljava/lang/Throwable;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M0;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 14
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 15
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    .line 16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "SumsubId account is blocked"

    invoke-direct {v0, v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Z;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Z;

    .line 18
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    const/4 v3, 0x0

    if-eqz p2, :cond_4

    .line 19
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 20
    const-string/jumbo v5, "sumsubid.accountBlocked.title"

    invoke-static {v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    if-eqz p2, :cond_5

    .line 21
    iget-object v5, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 22
    const-string/jumbo v6, "sumsubid.accountBlocked.subtitle"

    invoke-static {v6, v5}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v3

    :goto_3
    if-eqz p2, :cond_6

    .line 23
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 24
    const-string/jumbo v3, "sumsubid.accountBlocked.action"

    invoke-static {v3, p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    :cond_6
    const/16 p2, 0x18

    .line 25
    invoke-direct {v2, p2, v4, v5, v3}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-direct {v1, v0, p1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    .line 27
    const-string v2, "SumsubId"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->g:Lkotlinx/coroutines/flow/w;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k0;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, v2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k0;-><init>(Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lcom/sumsub/sns/core/presentation/base/O;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public final c(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 5
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->a:Ljava/lang/Throwable;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 6
    const-string p2, "Throw session expired error"

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 7
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->a:Ljava/lang/Throwable;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N0;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 8
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 9
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    .line 10
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;

    .line 11
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    const/4 v3, 0x0

    if-eqz p2, :cond_4

    .line 12
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 13
    const-string/jumbo v5, "sumsubid.sessionExpired.title"

    invoke-static {v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    if-eqz p2, :cond_5

    .line 14
    iget-object v5, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 15
    const-string/jumbo v6, "sumsubid.sessionExpired.subtitle"

    invoke-static {v6, v5}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v3

    :goto_3
    if-eqz p2, :cond_6

    .line 16
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 17
    const-string/jumbo v3, "sumsubid.sessionExpired.action"

    invoke-static {v3, p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    :cond_6
    const/16 p2, 0x18

    .line 18
    invoke-direct {v2, p2, v4, v5, v3}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-direct {v1, p1, v0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    .line 20
    const-string v2, "SumsubId"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 21
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final c(Z)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "proceedWithHasDocs, hasDocs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v1

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D0;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 4
    :cond_0
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->NO_DATA:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    return-void
.end method

.method public final e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 12

    .line 1
    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v3, "intent, "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;

    .line 23
    .line 24
    if-eqz v2, :cond_e

    .line 25
    move-object v2, p1

    .line 26
    .line 27
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;

    .line 28
    .line 29
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    move-object v0, p1

    .line 33
    .line 34
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->h:Lkotlinx/coroutines/flow/n;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G;->a:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_0
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H;

    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;->a:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 61
    move-result-object v6

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 65
    move-result-object v7

    .line 66
    .line 67
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/E0;

    .line 68
    .line 69
    .line 70
    invoke-direct {v9, p0, v5, v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/E0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 71
    const/4 v10, 0x2

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 77
    return-void

    .line 78
    .line 79
    :cond_1
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M;

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;->a:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 94
    move-result-object v6

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 98
    move-result-object v7

    .line 99
    .line 100
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/J0;

    .line 101
    .line 102
    .line 103
    invoke-direct {v9, p0, v5, v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/J0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 104
    const/4 v10, 0x2

    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v8, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 110
    return-void

    .line 111
    .line 112
    :cond_2
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;

    .line 113
    .line 114
    if-eqz v3, :cond_3

    .line 115
    move-object v0, p1

    .line 116
    .line 117
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;

    .line 118
    .line 119
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;->a:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;->b:Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 128
    move-result-object v6

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 132
    move-result-object v7

    .line 133
    .line 134
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/v0;

    .line 135
    const/4 v2, 0x0

    .line 136
    move-object v4, p0

    .line 137
    move-object v1, p0

    .line 138
    .line 139
    .line 140
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/v0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Ljava/lang/Long;)V

    .line 141
    const/4 v10, 0x2

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v8, 0x0

    .line 144
    move-object v9, v0

    .line 145
    .line 146
    .line 147
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 148
    return-void

    .line 149
    .line 150
    :cond_3
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D;

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;

    .line 155
    move-object v0, p1

    .line 156
    .line 157
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D;

    .line 158
    .line 159
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D;->a:Z

    .line 160
    .line 161
    .line 162
    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e;-><init>(Z)V

    .line 163
    .line 164
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 165
    .line 166
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    .line 167
    const/4 v4, 0x3

    .line 168
    .line 169
    aget-object v3, v3, v4

    .line 170
    .line 171
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 172
    .line 173
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    return-void

    .line 178
    .line 179
    :cond_4
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/E;

    .line 180
    .line 181
    if-eqz v3, :cond_5

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 185
    .line 186
    .line 187
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 188
    move-result-object v6

    .line 189
    .line 190
    .line 191
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 192
    move-result-object v7

    .line 193
    .line 194
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H0;

    .line 195
    .line 196
    .line 197
    invoke-direct {v9, p0, v5, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 198
    const/4 v10, 0x2

    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v8, 0x0

    .line 201
    .line 202
    .line 203
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 204
    return-void

    .line 205
    .line 206
    :cond_5
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/F;

    .line 207
    .line 208
    if-eqz v3, :cond_6

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 212
    .line 213
    .line 214
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 215
    move-result-object v6

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 219
    move-result-object v7

    .line 220
    .line 221
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L0;

    .line 222
    .line 223
    .line 224
    invoke-direct {v9, p0, v5, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 225
    const/4 v10, 0x2

    .line 226
    const/4 v11, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    .line 229
    .line 230
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 231
    return-void

    .line 232
    .line 233
    :cond_6
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;

    .line 234
    .line 235
    if-eqz v3, :cond_7

    .line 236
    move-object v0, p1

    .line 237
    .line 238
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;

    .line 239
    .line 240
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;->a:Ljava/lang/String;

    .line 241
    const/4 v2, 0x0

    .line 242
    const/4 v3, 0x2

    .line 243
    .line 244
    .line 245
    invoke-static {p0, v0, v2, v3, v5}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 246
    return-void

    .line 247
    .line 248
    :cond_7
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;

    .line 249
    .line 250
    if-eqz v3, :cond_8

    .line 251
    move-object v0, p1

    .line 252
    .line 253
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;

    .line 254
    .line 255
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;->a:Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 259
    .line 260
    .line 261
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 262
    move-result-object v6

    .line 263
    .line 264
    .line 265
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 266
    move-result-object v7

    .line 267
    .line 268
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B0;

    .line 269
    .line 270
    .line 271
    invoke-direct {v9, p0, v5, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Z)V

    .line 272
    const/4 v10, 0x2

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    .line 276
    .line 277
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 278
    return-void

    .line 279
    .line 280
    :cond_8
    instance-of v0, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/J;

    .line 281
    .line 282
    if-eqz v0, :cond_9

    .line 283
    .line 284
    .line 285
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 286
    move-result-object v6

    .line 287
    .line 288
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/F0;

    .line 289
    .line 290
    .line 291
    invoke-direct {v9, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/F0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;)V

    .line 292
    const/4 v10, 0x3

    .line 293
    const/4 v11, 0x0

    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x0

    .line 296
    .line 297
    .line 298
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 299
    return-void

    .line 300
    .line 301
    :cond_9
    instance-of v0, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K;

    .line 302
    .line 303
    if-eqz v0, :cond_a

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 307
    .line 308
    .line 309
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 310
    move-result-object v6

    .line 311
    .line 312
    .line 313
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 314
    move-result-object v7

    .line 315
    .line 316
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G0;

    .line 317
    .line 318
    .line 319
    invoke-direct {v9, p0, v5, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 320
    const/4 v10, 0x2

    .line 321
    const/4 v11, 0x0

    .line 322
    const/4 v8, 0x0

    .line 323
    .line 324
    .line 325
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 326
    return-void

    .line 327
    .line 328
    :cond_a
    instance-of v0, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C;

    .line 329
    .line 330
    if-eqz v0, :cond_c

    .line 331
    .line 332
    const-string v0, "log out"

    .line 333
    .line 334
    .line 335
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 336
    .line 337
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 338
    .line 339
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 340
    .line 341
    .line 342
    :cond_b
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 343
    move-result-object v2

    .line 344
    move-object v3, v2

    .line 345
    .line 346
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 347
    .line 348
    new-instance v4, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 349
    .line 350
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a:Ljava/lang/String;

    .line 351
    .line 352
    const/16 v5, 0xe

    .line 353
    .line 354
    .line 355
    invoke-direct {v4, v3, v5}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;-><init>(Ljava/lang/String;I)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v0, v2, v4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    move-result v2

    .line 360
    .line 361
    if-eqz v2, :cond_b

    .line 362
    .line 363
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 367
    return-void

    .line 368
    .line 369
    :cond_c
    instance-of v0, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I;

    .line 370
    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/T;

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 377
    return-void

    .line 378
    .line 379
    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 380
    .line 381
    .line 382
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 383
    throw v0

    .line 384
    :cond_e
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v1, "Error cancelled, "

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    const-string p1, "log out"

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    .line 40
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 41
    .line 42
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 43
    .line 44
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a:Ljava/lang/String;

    .line 45
    .line 46
    const/16 v3, 0xe

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v1, v3}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;-><init>(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 61
    .line 62
    const/16 v5, 0xf

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    move-object v0, p0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 72
    return-void
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 9

    .line 1
    .line 2
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->r:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    goto :goto_2

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 13
    .line 14
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    aget-object v1, v1, v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 24
    .line 25
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i0;->a:[I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 29
    move-result p1

    .line 30
    .line 31
    aget p1, v1, p1

    .line 32
    const/4 v1, 0x4

    .line 33
    .line 34
    if-eq p1, v1, :cond_4

    .line 35
    const/4 v1, 0x5

    .line 36
    .line 37
    if-eq p1, v1, :cond_1

    .line 38
    return v0

    .line 39
    .line 40
    :cond_1
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->NO_DATA:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 44
    .line 45
    .line 46
    const-string/jumbo p1, "reloadDocuments()"

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;->a:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 61
    move-result p1

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I0;

    .line 78
    const/4 p1, 0x0

    .line 79
    .line 80
    .line 81
    invoke-direct {v6, p0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 82
    const/4 v7, 0x2

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v5, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_3
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 94
    :goto_1
    return v2

    .line 95
    .line 96
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 100
    return v2

    .line 101
    :cond_5
    :goto_2
    return v0
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

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "Handle error, "

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/h0;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Z;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Z;

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    const-string p1, "log out"

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->c:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 59
    .line 60
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    move-object v0, p1

    .line 66
    .line 67
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 68
    .line 69
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a:Ljava/lang/String;

    .line 72
    .line 73
    const/16 v4, 0xe

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, v0, v4}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, p1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 88
    .line 89
    const/16 p1, 0x33

    .line 90
    const/4 v0, 0x2

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1, v2, v0, v2}, Lcom/sumsub/sns/core/presentation/base/C;->finishWithResult$default(Lcom/sumsub/sns/core/presentation/base/C;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_2
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/b0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/b0;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result v1

    .line 101
    const/4 v3, 0x1

    .line 102
    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G0;

    .line 117
    .line 118
    .line 119
    invoke-direct {v7, p0, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 120
    const/4 v8, 0x2

    .line 121
    const/4 v9, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    .line 124
    .line 125
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 126
    return-void

    .line 127
    .line 128
    :cond_3
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/d0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/d0;

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    move-result v1

    .line 133
    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 141
    move-result-object v4

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 145
    move-result-object v5

    .line 146
    .line 147
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L0;

    .line 148
    .line 149
    .line 150
    invoke-direct {v7, p0, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 151
    const/4 v8, 0x2

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v6, 0x0

    .line 154
    .line 155
    .line 156
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 157
    return-void

    .line 158
    .line 159
    :cond_4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/X;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/X;

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    move-result v1

    .line 164
    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 169
    .line 170
    .line 171
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 172
    move-result-object v4

    .line 173
    .line 174
    .line 175
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 176
    move-result-object v5

    .line 177
    .line 178
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H0;

    .line 179
    .line 180
    .line 181
    invoke-direct {v7, p0, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 182
    const/4 v8, 0x2

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    .line 186
    .line 187
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 188
    return-void

    .line 189
    .line 190
    :cond_5
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f0;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f0;

    .line 191
    .line 192
    .line 193
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    move-result v0

    .line 195
    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    .line 199
    const-string/jumbo p1, "reloadDocuments()"

    .line 200
    .line 201
    .line 202
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S;->a(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->e()Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;

    .line 206
    move-result-object p1

    .line 207
    .line 208
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/s;->a:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p1, :cond_7

    .line 211
    .line 212
    .line 213
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 214
    move-result p1

    .line 215
    .line 216
    if-eqz p1, :cond_6

    .line 217
    goto :goto_0

    .line 218
    .line 219
    .line 220
    :cond_6
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 221
    .line 222
    .line 223
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 224
    move-result-object v4

    .line 225
    .line 226
    .line 227
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 228
    move-result-object v5

    .line 229
    .line 230
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I0;

    .line 231
    .line 232
    .line 233
    invoke-direct {v7, p0, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I0;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 234
    const/4 v8, 0x2

    .line 235
    const/4 v9, 0x0

    .line 236
    const/4 v6, 0x0

    .line 237
    .line 238
    .line 239
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 240
    return-void

    .line 241
    .line 242
    :cond_7
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;->ENTER_EMAIL:Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;)V

    .line 246
    return-void

    .line 247
    .line 248
    .line 249
    :cond_8
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 250
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method
