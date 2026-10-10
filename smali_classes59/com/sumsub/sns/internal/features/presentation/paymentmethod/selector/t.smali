.class public final Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic V:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final b:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;

.field public final e:Lcom/sumsub/sns/internal/core/analytics/f;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
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
    invoke-direct {p0, p2, p3, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 12
    .line 13
    new-instance p2, Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 14
    const/4 p3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/domain/utils/a;-><init>(I)V

    .line 18
    .line 19
    new-instance p3, Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 20
    .line 21
    const-string v0, "SNSPaymentMethodSelector"

    .line 22
    .line 23
    .line 24
    invoke-direct {p3, v0, p2}, Lcom/sumsub/sns/internal/features/domain/utils/b;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/utils/a;)V

    .line 25
    .line 26
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 27
    const/4 p2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;

    .line 36
    .line 37
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;)V

    .line 41
    .line 42
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/a0;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, v0, v1, p3}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/domain/utils/b;)V

    .line 49
    .line 50
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->d:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;

    .line 51
    .line 52
    new-instance p2, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 53
    .line 54
    sget-object p3, Lcom/sumsub/sns/internal/core/analytics/Screen;->PaymentMethodsSelectorScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-direct {p2, p3, p1}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)V

    .line 64
    .line 65
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->e:Lcom/sumsub/sns/internal/core/analytics/f;

    .line 66
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;)Lkotlin/Unit;
    .locals 7

    .line 1
    sget-object v1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/presentation/base/O;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/m;->q:Lcom/sumsub/sns/internal/features/data/model/common/K2;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_6

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/K2;->a:Lcom/sumsub/sns/internal/features/data/model/common/J2;

    if-nez p1, :cond_1

    .line 6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_2

    .line 7
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/J2;->a:Lcom/sumsub/sns/internal/features/data/model/common/G2;

    if-eqz p1, :cond_3

    .line 9
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/G2;->a:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_3

    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/a;

    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/G2;->b:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 12
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;)V

    :cond_3
    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object p1, v1

    :goto_2
    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    return-object p1

    .line 14
    :cond_6
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->a(Lcom/sumsub/sns/core/presentation/base/O;)Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 13
    .line 14
    const-string v2, "buildViewStateFlow: 0 options \u2192 throwError"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 18
    .line 19
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "No payment methods available for applicant"

    .line 22
    .line 23
    .line 24
    invoke-direct {v4, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    const/4 v7, 0x4

    .line 26
    const/4 v8, 0x0

    .line 27
    .line 28
    const-string v5, "PAYMENT_METHODS"

    .line 29
    const/4 v6, 0x0

    .line 30
    move-object v3, p0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v3, p0

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x1

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 45
    .line 46
    const-string v2, "buildViewStateFlow: 1 options \u2192 requestAutoOpen"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 50
    .line 51
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->d:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;)V

    .line 61
    .line 62
    :cond_1
    :goto_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 79
    .line 80
    const-string v2, "bankCard"

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    :cond_2
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 86
    .line 87
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 88
    .line 89
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/q;

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v1, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/q;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/List;)V

    .line 93
    return-object v2
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
.end method

.method public final e()V
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string/jumbo v3, "onContinueClicked, selected="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->e:Lcom/sumsub/sns/internal/core/analytics/f;

    .line 37
    .line 38
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 39
    .line 40
    .line 41
    const-string/jumbo v3, "selected"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x4

    .line 51
    const/4 v5, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2, v3, v5, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/r;

    .line 61
    .line 62
    .line 63
    invoke-direct {v9, p0, v0, v5}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 64
    const/4 v10, 0x3

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    .line 69
    .line 70
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 71
    return-void
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

.method public final f()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "onItemSelected, typeKey="

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "bankCard"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->e:Lcom/sumsub/sns/internal/core/analytics/f;

    .line 28
    .line 29
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ListItem:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v3, "selected"

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x4

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, v3, v4, v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->c:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "PAYMENT_METHODS"

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

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/k;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->d:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    iput-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->d:Z

    .line 10
    .line 11
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->c:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/utils/b;->a:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    .line 23
    .line 24
    const-string/jumbo v2, "onResumed after open \u2192 finishAfterReturn"

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->b:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 34
    return-void

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->a()V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/j;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->f()V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_2
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/i;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;->e()V

    .line 54
    :cond_3
    return-void
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
