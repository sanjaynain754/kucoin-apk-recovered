.class public final Lcom/sumsub/sns/internal/features/presentation/esign/n0;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/k;


# static fields
.field public static final synthetic t:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final c:Ljava/io/File;

.field public final d:Lcom/sumsub/sns/internal/features/domain/esign/g;

.field public final e:Lcom/sumsub/sns/internal/features/domain/esign/i;

.field public final f:Lcom/sumsub/sns/internal/features/domain/esign/k;

.field public final g:Lcom/sumsub/sns/internal/features/domain/esign/e;

.field public final h:Lcom/sumsub/sns/internal/features/domain/esign/b;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lcom/sumsub/sns/internal/features/presentation/esign/X;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final q:Ljava/util/LinkedHashMap;

.field public final r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public s:Lkotlinx/coroutines/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 3
    .line 4
    const-string v1, "fieldValueCache"

    .line 5
    .line 6
    const-string v2, "getFieldValueCache()Ljava/util/Map;"

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
    const-string v2, "initialFieldValueCache"

    .line 14
    .line 15
    const-string v4, "getInitialFieldValueCache()Ljava/util/Map;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "eOtpSentAtMs"

    .line 22
    .line 23
    const-string v5, "getEOtpSentAtMs()J"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    const-string v5, "agreementsAccepted"

    .line 30
    .line 31
    const-string v6, "getAgreementsAccepted()Z"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    const-string v6, "acceptedAgreementIds"

    .line 38
    .line 39
    const-string v7, "getAcceptedAgreementIds()Ljava/util/Set;"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    const-string v7, "isLastAgreementItemVisible"

    .line 46
    .line 47
    const-string v8, "isLastAgreementItemVisible()Z"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 51
    move-result-object v0

    .line 52
    const/4 v7, 0x6

    .line 53
    .line 54
    new-array v7, v7, [Lkotlin/reflect/KProperty;

    .line 55
    .line 56
    aput-object v1, v7, v3

    .line 57
    const/4 v1, 0x1

    .line 58
    .line 59
    aput-object v2, v7, v1

    .line 60
    const/4 v1, 0x2

    .line 61
    .line 62
    aput-object v4, v7, v1

    .line 63
    const/4 v1, 0x3

    .line 64
    .line 65
    aput-object v5, v7, v1

    .line 66
    const/4 v1, 0x4

    .line 67
    .line 68
    aput-object v6, v7, v1

    .line 69
    const/4 v1, 0x5

    .line 70
    .line 71
    aput-object v0, v7, v1

    .line 72
    .line 73
    sput-object v7, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 74
    return-void
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

.method public constructor <init>(Landroid/os/Bundle;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Ljava/io/File;Lcom/sumsub/sns/internal/features/domain/esign/g;Lcom/sumsub/sns/internal/features/domain/esign/i;Lcom/sumsub/sns/internal/features/domain/esign/k;Lcom/sumsub/sns/internal/features/domain/esign/e;Lcom/sumsub/sns/internal/features/domain/esign/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3, p4}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a:Landroid/os/Bundle;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->c:Ljava/io/File;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->d:Lcom/sumsub/sns/internal/features/domain/esign/g;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e:Lcom/sumsub/sns/internal/features/domain/esign/i;

    .line 14
    .line 15
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f:Lcom/sumsub/sns/internal/features/domain/esign/k;

    .line 16
    .line 17
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->g:Lcom/sumsub/sns/internal/features/domain/esign/e;

    .line 18
    .line 19
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->h:Lcom/sumsub/sns/internal/features/domain/esign/b;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 26
    .line 27
    .line 28
    invoke-direct {p3}, Lcom/sumsub/sns/internal/core/presentation/form/j;-><init>()V

    .line 29
    .line 30
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 31
    const/4 p5, 0x0

    .line 32
    const/4 p6, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct {p4, p6, p1, p5, p3}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    .line 42
    .line 43
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/X;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/X;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;)V

    .line 47
    .line 48
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->j:Lcom/sumsub/sns/internal/features/presentation/esign/X;

    .line 49
    .line 50
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 54
    move-result-object p3

    .line 55
    .line 56
    const-string p4, "KEY_FIELD_CACHE"

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p2, p4, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 60
    .line 61
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 62
    .line 63
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 67
    move-result-object p3

    .line 68
    .line 69
    const-string p4, "KEY_INITIAL_FIELD_CACHE"

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, p2, p4, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 73
    .line 74
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 75
    .line 76
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 77
    .line 78
    const-wide/16 p3, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    move-result-object p3

    .line 83
    .line 84
    const-string p4, "eOtpSentAtMs"

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, p2, p4, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 88
    .line 89
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 90
    .line 91
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 92
    .line 93
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    const-string p4, "agreementsAccepted"

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, p2, p4, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 99
    .line 100
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 101
    .line 102
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 103
    .line 104
    new-instance p4, Ljava/util/LinkedHashSet;

    .line 105
    .line 106
    .line 107
    invoke-direct {p4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 108
    .line 109
    const-string p5, "acceptedAgreementIds"

    .line 110
    .line 111
    .line 112
    invoke-direct {p1, p2, p5, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 113
    .line 114
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 115
    .line 116
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    .line 119
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 120
    .line 121
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 124
    .line 125
    const-string p4, "isLastAgreementItemVisible"

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, p2, p4, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 129
    .line 130
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 131
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/h;Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/f;)Lcom/sumsub/sns/internal/core/presentation/form/f;
    .locals 9

    .line 288
    iget v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/h;->a:I

    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/form/h;->b:Ljava/lang/String;

    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/h;->c:Ljava/lang/String;

    .line 289
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v2, v0, v1, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 290
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v3, p2

    .line 291
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/internal/core/presentation/form/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/f;ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;I)Lcom/sumsub/sns/internal/core/presentation/form/f;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 343
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "sns_esign_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object p0

    .line 344
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    .line 345
    const-string/jumbo v0, "sns_data_%s_%s"

    invoke-static {p1, p2, v0, p0}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/data/model/esign/Y;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 3
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    if-eqz v1, :cond_a

    .line 4
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/c;->a:Lcom/sumsub/sns/internal/features/data/model/esign/i;

    if-eqz v1, :cond_a

    .line 5
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/i;->b:Ljava/util/List;

    if-eqz v1, :cond_a

    .line 6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/esign/f;

    .line 7
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 8
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 9
    iget-object v8, v4, Lcom/sumsub/sns/internal/features/data/model/esign/f;->a:Ljava/lang/String;

    const/16 v16, 0x0

    const/16 v17, 0x3fe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 10
    invoke-direct/range {v7 .. v17}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 11
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "agreement_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-direct {v6, v7, v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/esign/f;->b:Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 15
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 16
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 17
    iget-object v9, v4, Lcom/sumsub/sns/internal/features/data/model/esign/f;->b:Ljava/lang/String;

    if-eqz v9, :cond_2

    const/4 v13, 0x4

    const/4 v14, 0x0

    .line 18
    const-string v10, "<br>"

    const-string v11, ""

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v11, v6

    goto :goto_3

    :cond_2
    :goto_2
    const-string v6, ""

    goto :goto_1

    :goto_3
    const/16 v17, 0x0

    const/16 v18, 0x3fa

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 19
    invoke-direct/range {v8 .. v18}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 20
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "text_agreement_"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v15, 0xb8

    const/4 v11, 0x0

    .line 21
    invoke-direct/range {v7 .. v15}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    .line 22
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_3
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/esign/f;->d:Ljava/util/List;

    if-eqz v4, :cond_9

    .line 24
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/esign/l;

    .line 26
    iget-object v9, v8, Lcom/sumsub/sns/internal/features/data/model/esign/l;->b:Ljava/lang/String;

    if-eqz v9, :cond_4

    .line 27
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_5

    goto :goto_4

    .line 28
    :cond_5
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/esign/l;->a:Ljava/lang/String;

    if-eqz v8, :cond_4

    .line 29
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    .line 30
    :cond_6
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 31
    :cond_7
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    if-eqz v6, :cond_9

    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "links_agreement_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 33
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 34
    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    const/16 v20, 0x0

    const/16 v21, 0x3fe

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 35
    invoke-direct {v3, v11, v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_6
    if-ge v4, v3, :cond_9

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v4, v4, 0x1

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/esign/l;

    .line 38
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 39
    new-instance v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 40
    iget-object v11, v7, Lcom/sumsub/sns/internal/features/data/model/esign/l;->b:Ljava/lang/String;

    .line 41
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/esign/l;->a:Ljava/lang/String;

    .line 42
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "- ["

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "]("

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ")"

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v20, 0x0

    const/16 v21, 0x3fa

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v11, v9

    .line 43
    invoke-direct/range {v11 .. v21}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    const/16 v16, 0xb8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 44
    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    .line 45
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    move v3, v5

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/esign/n0;)Z
    .locals 11

    .line 86
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 88
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 89
    :goto_0
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    if-eqz v3, :cond_8

    .line 90
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->d:Ljava/util/List;

    if-eqz v3, :cond_8

    .line 91
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_4

    .line 92
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    .line 93
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/data/model/esign/U;->e:Ljava/util/List;

    if-eqz v5, :cond_8

    .line 94
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 95
    :cond_3
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/esign/f;

    .line 96
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    .line 97
    iget-object v8, v4, Lcom/sumsub/sns/internal/features/data/model/esign/U;->a:Ljava/lang/String;

    if-nez v8, :cond_4

    .line 98
    const-string v8, ""

    :cond_4
    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    if-eqz v7, :cond_8

    .line 99
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/esign/A;->b:Ljava/util/List;

    if-eqz v7, :cond_8

    .line 100
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 101
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 102
    iget-object v10, v6, Lcom/sumsub/sns/internal/features/data/model/esign/f;->a:Ljava/lang/String;

    .line 103
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_6
    const/4 v8, 0x0

    :goto_3
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    if-eqz v8, :cond_8

    .line 104
    iget-boolean v6, v8, Lcom/sumsub/sns/internal/features/data/model/esign/w;->b:Z

    if-ne v6, v2, :cond_8

    goto :goto_2

    :cond_7
    :goto_4
    move p0, v2

    goto :goto_5

    :cond_8
    move p0, v1

    :goto_5
    if-nez v0, :cond_a

    if-eqz p0, :cond_9

    goto :goto_6

    :cond_9
    return v1

    :cond_a
    :goto_6
    return v2
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/esign/A;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 312
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->c:I

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->c:I

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 313
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 314
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/data/model/esign/Y;)V

    .line 315
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->a:Ljava/util/List;

    const/4 p1, 0x0

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->c:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->f:I

    const-string/jumbo v2, "sns_esign_agreement_title"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v5, v2

    move-object v2, p2

    move-object p2, v5

    .line 316
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 317
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->a:Ljava/util/List;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->b:Ljava/lang/String;

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->c:I

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/esign/A;->f:I

    const-string/jumbo v3, "sns_esign_agreement_subtitle"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, p2

    move-object p2, v0

    move-object v0, v2

    .line 318
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 319
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v2, p1, v1, p2, v0}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/o;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/esign/C;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->f:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->f:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 320
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->f:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->c:I

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->c:I

    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 321
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/appdata/b;

    const/4 v11, 0x0

    const/16 v12, 0x3f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/sumsub/sns/internal/features/domain/appdata/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/Map;Ljava/util/Map;I)V

    move-object/from16 v1, p1

    .line 322
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/o;->a:Ljava/util/List;

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    .line 323
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f()Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x0

    .line 324
    invoke-static {v1, v8, v9, v7}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/appdata/b;)Ljava/util/LinkedHashMap;

    move-result-object v8

    .line 325
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v10, v10, v4

    .line 326
    iget-object v10, v9, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 327
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v10, v9, v8}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    if-eqz v1, :cond_6

    .line 328
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 329
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 330
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/y;

    move-object v10, v7

    move-object v7, v9

    .line 331
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v9

    .line 332
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v11

    .line 333
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f()Ljava/util/Map;

    move-result-object v14

    .line 334
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v13, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v13, v13, v6

    invoke-virtual {v12}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Ljava/util/Map;

    .line 335
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/esign/u0;

    invoke-direct {v12, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/u0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;)V

    const/4 v13, 0x0

    const/16 v16, 0xe0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v5, v17

    invoke-static/range {v7 .. v16}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/appdata/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/jvm/functions/Function2;Ljava/lang/CharSequence;Ljava/util/Map;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    move-result-object v7

    .line 336
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v5

    move-object v7, v10

    const/4 v5, 0x2

    goto :goto_1

    :cond_5
    move-object v5, v8

    goto :goto_2

    .line 337
    :cond_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 338
    :goto_2
    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->a:Ljava/util/List;

    iput v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->c:I

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->f:I

    const-string/jumbo v1, "sns_esign_provided_data_title"

    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v6, v8

    .line 339
    :goto_3
    check-cast v1, Ljava/lang/String;

    .line 340
    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->a:Ljava/util/List;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->b:Ljava/lang/String;

    iput v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->c:I

    const/4 v5, 0x2

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/esign/C;->f:I

    const-string/jumbo v5, "sns_esign_provided_data_subtitle"

    invoke-virtual {v0, v5, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    move v3, v4

    move-object v4, v1

    move-object v1, v2

    move-object v2, v6

    .line 341
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 342
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v5, v3, v4, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v5
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/D;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->d:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->d:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 226
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->d:I

    const-string v6, "SNSESignViewModel"

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->a:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 227
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 228
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 229
    const-string v5, "confirmOtp"

    invoke-virtual {v2, v6, v5, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->h:Lcom/sumsub/sns/internal/features/domain/esign/b;

    .line 231
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 232
    new-instance v9, Lcom/sumsub/sns/internal/features/data/model/esign/D;

    invoke-direct {v9, v1}, Lcom/sumsub/sns/internal/features/data/model/esign/D;-><init>(Ljava/lang/String;)V

    .line 233
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v10

    .line 234
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 236
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    .line 237
    iget-object v14, v13, Lcom/sumsub/sns/internal/features/data/model/esign/A;->a:Ljava/lang/String;

    .line 238
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/esign/A;->b:Ljava/util/List;

    .line 239
    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v13, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v15, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 241
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 242
    new-instance v12, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 243
    iget-object v7, v13, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 244
    iget-boolean v13, v13, Lcom/sumsub/sns/internal/features/data/model/esign/w;->b:Z

    .line 245
    invoke-direct {v12, v7, v13}, Lcom/sumsub/sns/internal/features/data/model/esign/w;-><init>(Ljava/lang/String;Z)V

    .line 246
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    const/16 v12, 0xa

    goto :goto_2

    .line 247
    :cond_3
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    invoke-direct {v7, v14, v15}, Lcom/sumsub/sns/internal/features/data/model/esign/A;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 248
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v12, 0xa

    goto :goto_1

    .line 249
    :cond_4
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/esign/E;

    invoke-direct {v7, v9, v11}, Lcom/sumsub/sns/internal/features/data/model/esign/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/esign/D;Ljava/util/ArrayList;)V

    .line 250
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->a:Ljava/lang/String;

    const/4 v8, 0x1

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/esign/D;->d:I

    invoke-virtual {v2, v5, v7, v3}, Lcom/sumsub/sns/internal/features/domain/esign/b;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/model/esign/E;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    return-object v4

    .line 251
    :cond_5
    :goto_3
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "confirmOtp: success="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 252
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 253
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v5, 0x0

    .line 254
    invoke-virtual {v4, v6, v3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 256
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Lcom/sumsub/sns/internal/features/data/model/esign/Y;)V

    .line 257
    :cond_6
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 258
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v3

    .line 259
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/esign/l;

    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/l;-><init>(Ljava/lang/String;)V

    .line 260
    invoke-virtual {v0, v2, v3, v4}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 261
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/J;

    const/4 v1, 0x0

    invoke-direct {v8, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 262
    :cond_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/esign/z;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->m:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->m:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->k:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 346
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->m:I

    const/16 v5, 0xa

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->j:Ljava/lang/String;

    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->i:Ljava/util/Collection;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->h:Lcom/sumsub/sns/internal/features/data/model/esign/f;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->g:Ljava/util/Iterator;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->f:Ljava/util/Collection;

    iget-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->e:Ljava/lang/String;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->d:Ljava/lang/String;

    iget-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->c:Lcom/sumsub/sns/internal/features/data/model/esign/U;

    iget-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->b:Ljava/util/Iterator;

    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v11

    move-object/from16 v18, v13

    move-object v13, v8

    :goto_1
    move-object/from16 v17, v12

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    move-object v14, v9

    move-object v15, v10

    move-object v9, v4

    move-object v4, v7

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 347
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->d:Ljava/util/List;

    if-eqz v1, :cond_f

    .line 348
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v4, v2

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    .line 349
    iget-object v8, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->b:Ljava/lang/Integer;

    .line 350
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "esign_doc_section_"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 351
    iget-object v9, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->c:Ljava/lang/String;

    if-eqz v9, :cond_3

    const/4 v13, 0x4

    const/4 v14, 0x0

    .line 352
    const-string v10, ".pdf"

    const-string v11, ""

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    .line 353
    :goto_3
    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 354
    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    const/16 v20, 0x0

    const/16 v21, 0x3fc

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 355
    invoke-direct {v10, v11, v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 356
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    iget-object v10, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->e:Ljava/util/List;

    if-eqz v10, :cond_a

    .line 358
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v10, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 359
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v15, v2

    move-object v2, v4

    move-object v14, v7

    move-object v13, v8

    move-object v12, v9

    move-object v8, v11

    move-object v7, v1

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 360
    move-object v9, v1

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/esign/f;

    .line 361
    iget-object v1, v9, Lcom/sumsub/sns/internal/features/data/model/esign/f;->e:Ljava/util/List;

    if-eqz v1, :cond_8

    .line 362
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v4, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 363
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 364
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/esign/K;

    .line 365
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/esign/K;->b:Ljava/lang/Integer;

    .line 366
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    const/16 v23, 0x3e

    const/16 v24, 0x0

    .line 367
    const-string v17, ", "

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 368
    iput-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->a:Ljava/util/List;

    iput-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->b:Ljava/util/Iterator;

    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->c:Lcom/sumsub/sns/internal/features/data/model/esign/U;

    iput-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->d:Ljava/lang/String;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->e:Ljava/lang/String;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->f:Ljava/util/Collection;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->g:Ljava/util/Iterator;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->h:Lcom/sumsub/sns/internal/features/data/model/esign/f;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->i:Ljava/util/Collection;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->j:Ljava/lang/String;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/esign/z;->m:I

    const-string/jumbo v1, "sns_esign_documents_pages"

    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    move-object/from16 v16, v8

    move-object/from16 v18, v13

    move-object/from16 v13, v16

    goto/16 :goto_1

    :goto_6
    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_7

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string/jumbo v8, "{pages}"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_7

    :cond_6
    move-object v9, v1

    :cond_7
    :goto_7
    move-object v7, v4

    move-object v1, v9

    move-object v8, v13

    move-object v9, v14

    move-object v10, v15

    move-object/from16 v12, v17

    move-object/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v15, v20

    goto :goto_8

    :cond_8
    move-object/from16 v16, v8

    const/4 v1, 0x0

    .line 369
    :goto_8
    iget-object v4, v9, Lcom/sumsub/sns/internal/features/data/model/esign/f;->b:Ljava/lang/String;

    .line 370
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/esign/f;->a:Ljava/lang/String;

    .line 371
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "sns_agr_"

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 372
    new-instance v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    invoke-direct {v9, v6, v4, v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, v16

    const/4 v6, 0x1

    goto/16 :goto_4

    .line 374
    :cond_9
    check-cast v8, Ljava/util/List;

    move-object v4, v2

    move-object v1, v7

    move-object/from16 v27, v8

    move-object/from16 v20, v12

    move-object v10, v13

    move-object v7, v14

    move-object v2, v15

    goto :goto_9

    :cond_a
    move-object v10, v8

    move-object/from16 v20, v9

    const/16 v27, 0x0

    .line 375
    :goto_9
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->a:Ljava/lang/String;

    .line 376
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "sns_doc_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 377
    new-instance v18, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    const/16 v26, 0x0

    const/16 v28, 0x2fc

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 378
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    .line 379
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    .line 380
    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_LAUNCH:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x18

    move-object/from16 v9, v18

    .line 381
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 382
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 383
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->e:Ljava/util/List;

    const-string v8, ""

    if-eqz v6, :cond_c

    .line 384
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 385
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 386
    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/esign/f;

    .line 387
    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 388
    iget-object v12, v10, Lcom/sumsub/sns/internal/features/data/model/esign/f;->a:Ljava/lang/String;

    if-nez v12, :cond_b

    move-object v12, v8

    .line 389
    :cond_b
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v14, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    const/4 v15, 0x4

    aget-object v14, v14, v15

    invoke-virtual {v13}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Set;

    .line 390
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/esign/f;->a:Ljava/lang/String;

    .line 391
    invoke-static {v13, v10}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v10

    .line 392
    invoke-direct {v11, v12, v10}, Lcom/sumsub/sns/internal/features/data/model/esign/w;-><init>(Ljava/lang/String;Z)V

    .line 393
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 394
    :cond_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 395
    :cond_d
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/data/model/esign/U;->a:Ljava/lang/String;

    if-nez v6, :cond_e

    goto :goto_b

    :cond_e
    move-object v8, v6

    .line 396
    :goto_b
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    invoke-direct {v6, v8, v9}, Lcom/sumsub/sns/internal/features/data/model/esign/A;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 397
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x1

    goto/16 :goto_2

    .line 398
    :cond_f
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/m0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v1, v4, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 399
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/E;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 109
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->e:I

    const-string v3, "SNSESignViewModel"

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 110
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 111
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 112
    const-string v2, "loading ..."

    invoke-virtual {p1, v3, v2, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->d:Lcom/sumsub/sns/internal/features/domain/esign/g;

    .line 114
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 115
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->e:I

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/domain/esign/g;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 116
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "init esign: ok="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 117
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 118
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 119
    invoke-virtual {v7, v3, v2, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 121
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/E;->e:I

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->d(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, p1

    .line 122
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 123
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    .line 124
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/Q;

    invoke-direct {v0, v6}, Lcom/sumsub/sns/internal/features/presentation/esign/Q;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v5, v6}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    if-nez p1, :cond_6

    .line 125
    new-instance v7, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const-string v8, "Init failure"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v7

    .line 126
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v0

    .line 127
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/r;->a:Lcom/sumsub/sns/internal/features/presentation/esign/r;

    .line 128
    invoke-virtual {p0, p1, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/esign/k0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 292
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->b:Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->a:Z

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    :cond_3
    move-object v9, p2

    move p2, p1

    move-object p1, v9

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 293
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f:Lcom/sumsub/sns/internal/features/domain/esign/k;

    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->a:Z

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->f:I

    invoke-virtual {p2, v2, v0}, Lcom/sumsub/sns/internal/features/domain/esign/k;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    goto :goto_2

    .line 294
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "requestOtp: ok="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 295
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 296
    iget-object v6, v6, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 297
    const-string v7, "SNSESignViewModel"

    invoke-virtual {v6, v7, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 299
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 301
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v8, v8, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 302
    iget-object v7, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 303
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v7, v2, v6}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p2, :cond_5

    .line 304
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->g()V

    goto :goto_3

    .line 305
    :cond_5
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->b:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/k0;->f:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_2
    return-object v1

    .line 306
    :cond_6
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 307
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/esign/W;

    invoke-direct {p2, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/W;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, v5, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 308
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object p2

    .line 309
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/esign/w;->a:Lcom/sumsub/sns/internal/features/presentation/esign/w;

    .line 310
    invoke-virtual {p0, p1, p2, v0}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 311
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a()V
    .locals 4

    .line 105
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 107
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/f0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/f0;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v2, v0, v3, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(ILjava/io/File;)V
    .locals 4

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleFileDownloadSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 269
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 270
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 271
    const-string v2, "SNSESignViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 273
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 274
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    if-nez v1, :cond_0

    goto :goto_1

    .line 275
    :cond_0
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 276
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;->b:Lcom/sumsub/sns/internal/features/presentation/esign/n;

    if-eqz v0, :cond_7

    .line 277
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/n;->c:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 278
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/P;

    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/P;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    if-nez p2, :cond_1

    goto :goto_1

    .line 279
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    if-eqz v0, :cond_5

    .line 280
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->d:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 281
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    .line 282
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/esign/U;->b:Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_0

    .line 283
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_2

    move-object v3, v1

    :cond_4
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    if-eqz v3, :cond_5

    .line 284
    iget-object p1, v3, Lcom/sumsub/sns/internal/features/data/model/esign/U;->c:Ljava/lang/String;

    if-nez p1, :cond_6

    .line 285
    :cond_5
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    .line 286
    :cond_6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/t;

    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/t;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public final a(ILjava/lang/Throwable;)V
    .locals 2

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleFileDownloadFailed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 264
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 265
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 266
    const-string v1, "SNSESignViewModel"

    invoke-virtual {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/O;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, p2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 14

    .line 183
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 184
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 185
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;

    if-nez v0, :cond_a

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 186
    :cond_0
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    .line 187
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/M;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 188
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez p1, :cond_1

    .line 189
    const-string p1, ""

    :cond_1
    move-object v0, p1

    .line 190
    const-string/jumbo p1, "sns_doc_"

    const/4 v1, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v0, p1, v6, v1, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 191
    const-string/jumbo v1, "sns_doc_"

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 192
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_3

    .line 193
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    if-eqz v0, :cond_6

    .line 194
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->d:Ljava/util/List;

    if-eqz v0, :cond_6

    .line 195
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    .line 196
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/esign/U;->a:Ljava/lang/String;

    .line 197
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_5
    move-object v1, v7

    .line 198
    :goto_0
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/esign/U;

    goto :goto_1

    :cond_6
    move-object v1, v7

    .line 199
    :goto_1
    new-instance v8, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 200
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v0

    .line 201
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 202
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 203
    invoke-direct {v8, v0, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;)V

    .line 204
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v9

    .line 205
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v10

    .line 206
    sget-object v11, Lcom/sumsub/sns/internal/core/analytics/Control;->ListItem:Lcom/sumsub/sns/internal/core/analytics/Control;

    if-eqz v1, :cond_8

    .line 207
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/data/model/esign/U;->c:Ljava/lang/String;

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v0

    .line 208
    :cond_8
    :goto_2
    const-string v0, "docName"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 209
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    const/16 v13, 0x10

    .line 210
    invoke-static/range {v8 .. v13}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    if-eqz v1, :cond_a

    .line 211
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/U;->b:Ljava/lang/Integer;

    if-eqz p1, :cond_a

    .line 212
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 213
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    const/4 v1, 0x1

    if-eqz v0, :cond_9

    invoke-static {v0, v7, v1, v7}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 214
    :cond_9
    iput-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 215
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/d0;

    invoke-direct {v0, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/esign/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v6, v0, v1, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 216
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/esign/e0;

    invoke-direct {v11, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/esign/e0;-><init>(ILcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    :cond_a
    :goto_3
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V
    .locals 11

    .line 130
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 131
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 132
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onFieldValuesChanged: state="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 133
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 134
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 135
    const-string v2, "SNSESignViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 137
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 138
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 139
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p1

    .line 140
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz v4, :cond_1

    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 141
    const-string/jumbo v5, "sns_doc_"

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-nez p1, :cond_2

    const-string p1, ""

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    if-nez v0, :cond_3

    :goto_1
    return-void

    .line 143
    :cond_3
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/esign/A;->b:Ljava/util/List;

    .line 144
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 146
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    if-eqz p2, :cond_4

    .line 147
    iget-object v8, v5, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 148
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v10, "sns_agr_"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p2, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-ne v8, v7, :cond_4

    move v6, v7

    .line 149
    :cond_4
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 150
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    invoke-direct {v7, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/esign/w;-><init>(Ljava/lang/String;Z)V

    .line 151
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 152
    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 154
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v8, v6

    :goto_3
    if-ge v8, v5, :cond_7

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    .line 155
    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 156
    iget-boolean v10, v10, Lcom/sumsub/sns/internal/features/data/model/esign/w;->b:Z

    if-eqz v10, :cond_6

    .line 157
    invoke-virtual {p2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 158
    :cond_6
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 159
    :cond_7
    new-instance v5, Lkotlin/Pair;

    invoke-direct {v5, p2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 161
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    const/4 v9, 0x4

    aget-object v8, v8, v9

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    .line 162
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    .line 163
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {p2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 165
    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 166
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 167
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 168
    :cond_8
    invoke-interface {v5, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 169
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 171
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/esign/w;

    .line 172
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/esign/w;->a:Ljava/lang/String;

    .line 173
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 174
    :cond_9
    invoke-interface {v5, p2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 175
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v9

    .line 176
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 177
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p2, v5}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 178
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    .line 179
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/A;->a:Ljava/lang/String;

    .line 180
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/esign/A;

    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/features/data/model/esign/A;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 181
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/m0;

    invoke-direct {p1, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v6, p1, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/Y;)V
    .locals 13

    .line 46
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/c;->b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/esign/s;->d:Ljava/lang/Boolean;

    .line 49
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 50
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "confirmOtp: confirmed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 51
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 52
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 53
    const-string v4, "SNSESignViewModel"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    const/4 p1, 0x1

    if-eqz v0, :cond_1

    .line 55
    new-instance v7, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v7, p1}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 56
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;->SUBMITTED:Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;

    .line 57
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignFinishScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 58
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 59
    const-string v1, "esign"

    invoke-direct {v10, p1, v0, v1, v5}, Lcom/sumsub/sns/internal/features/presentation/result/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/result/k;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    .line 60
    invoke-static/range {v6 .. v12}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    :cond_1
    move-object v6, p0

    .line 61
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/K;

    invoke-direct {v0, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/esign/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v1, v0, p1, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 14

    .line 62
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    .line 63
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 64
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 65
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/h;

    if-nez v0, :cond_0

    return-void

    .line 66
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 69
    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 71
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v10, :cond_2

    .line 72
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_2
    move-object v10, v7

    :goto_1
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v11

    .line 73
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 74
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_3
    move-object v9, v7

    .line 75
    :goto_2
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/y;

    if-nez v9, :cond_4

    goto :goto_5

    .line 76
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f()Ljava/util/Map;

    move-result-object v8

    .line 77
    iget-object v10, v9, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v10, :cond_5

    .line 78
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    :cond_5
    move-object v10, v7

    :goto_3
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_6

    const-string v8, ""

    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v10

    invoke-static {v9, v8, v10, v7}, Lcom/sumsub/sns/internal/features/presentation/utils/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    .line 79
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    move v4, v6

    .line 80
    :cond_8
    :goto_4
    invoke-static {v5, v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/g0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    move-result-object v5

    .line 81
    :goto_5
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    if-eqz v4, :cond_a

    .line 82
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/t0;

    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/t0;-><init>(Lcom/sumsub/sns/internal/core/presentation/form/h;Ljava/util/List;)V

    .line 83
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void

    .line 84
    :cond_a
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/U;

    invoke-direct {p1, v7}, Lcom/sumsub/sns/internal/features/presentation/esign/U;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, p1, v6, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 85
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/esign/V;

    invoke-direct {v11, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/esign/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 10

    .line 217
    const-string v0, "esign_doc_section_"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 218
    const-string v5, "esign_doc_section_"

    const-string v6, ""

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 219
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 220
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v2, "String.toIntSafe"

    const-string v4, "invalid number"

    invoke-virtual {v0, v2, v4, p1}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    .line 221
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 222
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0, v3, v2, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 223
    :cond_1
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 224
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/d0;

    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v1, v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 225
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/esign/e0;

    invoke-direct {v7, p1, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/e0;-><init>(ILcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    return v2

    :cond_2
    return v1
.end method

.method public final b()Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->j:Lcom/sumsub/sns/internal/features/presentation/esign/X;

    return-object v0
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/esign/B;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->c:I

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->c:I

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    invoke-virtual {p0, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, p2

    .line 38
    :goto_1
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    const/4 p2, 0x0

    iput p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->c:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    const-string/jumbo v2, "sns_esign_documents_title"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v6, v2

    move-object v2, p1

    move p1, p2

    move-object p2, v6

    .line 39
    :goto_2
    check-cast p2, Ljava/lang/String;

    .line 40
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->a:Ljava/util/List;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->b:Ljava/lang/String;

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->c:I

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/esign/B;->f:I

    const-string/jumbo v3, "sns_esign_documents_subtitle"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v1, p2

    move-object p2, v0

    move-object v0, v2

    .line 41
    :goto_4
    check-cast p2, Ljava/lang/String;

    .line 42
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v2, p1, v1, p2, v0}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v2
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/esign/o;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/esign/L;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/L;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/esign/M;

    invoke-direct {p2, p1, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/esign/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/esign/o;Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, p2, v4, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 18
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/esign/o;->a:Ljava/util/List;

    if-eqz v2, :cond_5

    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 21
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    if-eqz v7, :cond_3

    .line 22
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v6, :cond_4

    .line 23
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_3

    .line 24
    invoke-interface {p2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 25
    :cond_5
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v7, v6, v3

    .line 26
    iget-object v7, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 27
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v7, v2, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v6, v6, v4

    .line 29
    iget-object v6, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 30
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v6, v2, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    .line 32
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->a:Lkotlinx/coroutines/flow/n;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/L;->d:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Lcom/sumsub/sns/internal/features/data/model/esign/o;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 33
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    invoke-direct {v0, v3, p2, v5, v5}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 34
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/esign/N;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/N;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 8
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    if-nez p1, :cond_3

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 10
    :cond_3
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/esign/l0;

    invoke-direct {v2, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/esign/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, v2, v4, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 11
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    .line 12
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->a:Lkotlinx/coroutines/flow/n;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/N;->d:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, v2

    .line 13
    :goto_1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 14
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/f;

    invoke-direct {v1, v3, p1, v5, v5}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p1

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 6
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 7
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/esign/F;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->d:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->d:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->a:Lkotlinx/coroutines/flow/n;

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    .line 59
    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/esign/c;->a:Lcom/sumsub/sns/internal/features/data/model/esign/i;

    .line 63
    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/esign/i;->b:Ljava/util/List;

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/esign/f;

    .line 85
    .line 86
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/esign/f;->b:Ljava/lang/String;

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_3
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/esign/G;

    .line 90
    .line 91
    .line 92
    invoke-direct {p2, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/esign/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v3, p2, v4, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 96
    .line 97
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->q:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->clear()V

    .line 101
    .line 102
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    .line 103
    .line 104
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->a:Lkotlinx/coroutines/flow/n;

    .line 105
    .line 106
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/esign/F;->d:I

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-ne p1, v1, :cond_4

    .line 113
    return-object v1

    .line 114
    :cond_4
    move-object v6, p2

    .line 115
    move-object p2, p1

    .line 116
    move-object p1, v6

    .line 117
    .line 118
    .line 119
    :goto_2
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 120
    move-result-object p2

    .line 121
    .line 122
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v3, p2, v5, v5}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    return-object p1
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

.method public final d(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->b:Lcom/sumsub/sns/internal/features/data/model/esign/ESignSubmissionResponse$Status;

    .line 2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "initStatus: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 3
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    const-string v5, "SNSESignViewModel"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v3, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 7
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->b:Lcom/sumsub/sns/internal/features/data/model/esign/ESignSubmissionResponse$Status;

    if-nez v3, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    .line 8
    :cond_0
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/esign/y;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    :goto_0
    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_3

    const/4 v1, 0x2

    if-eq v3, v1, :cond_2

    if-eq v3, v4, :cond_1

    .line 9
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/S;

    invoke-direct {v1, v6}, Lcom/sumsub/sns/internal/features/presentation/esign/S;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v5, v6}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    new-instance v7, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const-string v8, "Unknown submission status"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x6

    invoke-direct {v1, v7, v6, v6, v2}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 13
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_1

    .line 14
    :cond_2
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v1, v5}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 15
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;->SUBMITTED:Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;

    .line 16
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignFinishScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 17
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 18
    const-string v3, "esign"

    invoke-direct {v4, v0, v2, v3, v6}, Lcom/sumsub/sns/internal/features/presentation/result/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/result/k;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 19
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 20
    :goto_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 21
    :cond_3
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    if-eqz v3, :cond_4

    .line 22
    iget-object v7, v3, Lcom/sumsub/sns/internal/features/data/model/esign/c;->c:Lcom/sumsub/sns/internal/features/data/model/esign/Q;

    if-eqz v7, :cond_4

    .line 23
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/data/model/esign/Q;->a:Lcom/sumsub/sns/internal/features/data/model/esign/o;

    :cond_4
    if-eqz v6, :cond_6

    .line 24
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/esign/c;->c:Lcom/sumsub/sns/internal/features/data/model/esign/Q;

    .line 25
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/esign/Q;->a:Lcom/sumsub/sns/internal/features/data/model/esign/o;

    .line 26
    invoke-virtual {p0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b(Lcom/sumsub/sns/internal/features/data/model/esign/o;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    goto :goto_3

    :cond_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    .line 27
    :cond_6
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    aget-object v4, v6, v4

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_9

    .line 28
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    if-eqz v3, :cond_7

    .line 29
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/esign/c;->a:Lcom/sumsub/sns/internal/features/data/model/esign/i;

    if-eqz v3, :cond_7

    .line 30
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/features/data/model/esign/i;->a:Z

    if-ne v3, v5, :cond_7

    goto :goto_2

    .line 31
    :cond_7
    invoke-virtual/range {p0 .. p2}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->c(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    goto :goto_3

    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    .line 32
    :cond_9
    :goto_2
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_a

    goto :goto_3

    :cond_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    :goto_3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_b

    return-object v1

    :cond_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final d()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->i:Lkotlinx/coroutines/flow/n;

    return-object v0
.end method

.method public final e()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 9
    .line 10
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignOtpConfirmationScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignDocumentsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ESignAgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 25
    return-object v0
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

.method public final f()Ljava/util/Map;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

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

.method public final g()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 9
    const/4 v4, 0x2

    .line 10
    .line 11
    aget-object v3, v3, v4

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Number;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 21
    move-result-wide v2

    .line 22
    sub-long/2addr v0, v2

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 28
    move-result-wide v0

    .line 29
    .line 30
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/esign/c;->b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/esign/s;->c:Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    move-result v4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v4, v5

    .line 52
    :goto_0
    int-to-long v6, v4

    .line 53
    .line 54
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 58
    move-result-wide v0

    .line 59
    sub-long/2addr v6, v0

    .line 60
    .line 61
    .line 62
    invoke-static {v6, v7, v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 63
    move-result-wide v0

    .line 64
    long-to-int v0, v0

    .line 65
    .line 66
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/esign/T;

    .line 67
    const/4 v2, 0x0

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v0, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/esign/T;-><init>(ILcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 71
    const/4 v0, 0x1

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v5, v1, v0, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

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

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/s;->b:Lcom/sumsub/sns/internal/features/presentation/esign/s;

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/esign/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/p;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/esign/j;Z)V

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a:Landroid/os/Bundle;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v2, "ARG_DOCUMENT"

    .line 8
    .line 9
    const-class v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 13
    move-result-object v0

    .line 14
    move-object v1, v0

    .line 15
    .line 16
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 17
    .line 18
    :cond_0
    if-eqz v1, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-object v0

    .line 31
    .line 32
    :cond_2
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 33
    return-object v0
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

.method public final h()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "onButtonClick: "

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 29
    .line 30
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 31
    .line 32
    const-string v3, "SNSESignViewModel"

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/m;->b:Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->a(Ljava/util/List;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/i;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 55
    .line 56
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 57
    const/4 v2, 0x3

    .line 58
    .line 59
    aget-object v1, v1, v2

    .line 60
    .line 61
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 64
    .line 65
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/H;

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/H;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 74
    const/4 v1, 0x0

    .line 75
    const/4 v2, 0x1

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v1, v0, v2, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/I;

    .line 85
    .line 86
    .line 87
    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 88
    const/4 v9, 0x3

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    .line 93
    .line 94
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 95
    return-void

    .line 96
    .line 97
    :cond_1
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->g()V

    .line 103
    :cond_2
    return-void
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

.method public final onCleared()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    :cond_0
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->s:Lkotlinx/coroutines/x1;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/r;->a:Lcom/sumsub/sns/internal/features/presentation/esign/r;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 21
    .line 22
    const-string v1, "SNSESignViewModel"

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "onErrorCancelled: error"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    const/16 v8, 0xf

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v3, p0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v3 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 40
    :cond_0
    return-void
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
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/esign/w;->a:Lcom/sumsub/sns/internal/features/presentation/esign/w;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 18
    .line 19
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 20
    const/4 v1, 0x3

    .line 21
    .line 22
    aget-object v0, v0, v1

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/H;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/H;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v3, p1, v2, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/I;

    .line 46
    .line 47
    .line 48
    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 49
    const/4 v9, 0x3

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 56
    return-void

    .line 57
    .line 58
    :cond_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/l;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/esign/l;

    .line 63
    .line 64
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/l;->a:Ljava/lang/String;

    .line 65
    .line 66
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 69
    .line 70
    const-string v1, "SNSESignViewModel"

    .line 71
    .line 72
    .line 73
    const-string/jumbo v5, "onCheckCode"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/b0;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/b0;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v3, v0, v2, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/esign/c0;

    .line 91
    .line 92
    .line 93
    invoke-direct {v8, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 94
    const/4 v9, 0x3

    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    .line 99
    .line 100
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 101
    return-void

    .line 102
    .line 103
    :cond_1
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/esign/r;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 108
    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    const/16 v6, 0xf

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v2, 0x0

    .line 114
    const/4 v3, 0x0

    .line 115
    const/4 v4, 0x0

    .line 116
    const/4 v5, 0x0

    .line 117
    move-object v1, p0

    .line 118
    .line 119
    .line 120
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 121
    return-void

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 125
    return-void
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

.method public final onLoad()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/g0;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/g0;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v2, v0, v3, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/esign/h0;

    .line 18
    .line 19
    .line 20
    invoke-direct {v7, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/esign/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 21
    const/4 v8, 0x3

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 28
    return-void
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
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->onLoad()V

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
