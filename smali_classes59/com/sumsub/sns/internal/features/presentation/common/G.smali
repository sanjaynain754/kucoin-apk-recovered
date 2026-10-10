.class public abstract Lcom/sumsub/sns/internal/features/presentation/common/G;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/utils/N;


# static fields
.field public static final synthetic V:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

.field public final b:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/domain/utils/a;)V
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
    invoke-direct {p0, p1, p2, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->c:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->d:Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    iput-object p0, p3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/common/h;

    .line 31
    .line 32
    .line 33
    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Lkotlin/coroutines/Continuation;)V

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method


# virtual methods
.method public abstract a(Lcom/sumsub/sns/internal/features/domain/documents/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 25
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onDocumentsPicked, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SNSImageDocumentsAwareViewModel"

    invoke-static {p3, v1, v0}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 26
    invoke-virtual {p0, p3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 27
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 28
    new-instance p3, Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 29
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 30
    iget-boolean v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->b:Ljava/util/Map;

    .line 32
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    .line 34
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v3

    .line 35
    :goto_0
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-eqz p1, :cond_1

    .line 36
    iget p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/c;->a:I

    .line 37
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    .line 38
    :cond_1
    invoke-direct {p3, v0, v2, v3}, Lcom/sumsub/sns/internal/features/domain/documents/D;-><init>(Ljava/io/File;ZLjava/lang/Integer;)V

    .line 39
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/common/s;

    invoke-direct {p1, p3}, Lcom/sumsub/sns/internal/features/presentation/common/s;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/D;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 40
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    const-string/jumbo p2, "onDocumentsPicked, no issues with images"

    invoke-static {p1, v1, p2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;)Lkotlin/Unit;
.end method

.method public abstract a(ILjava/io/File;)V
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/data/model/common/J;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "On photo pick result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSImageDocumentsAwareViewModel"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_0

    const/4 p3, 0x1

    .line 2
    invoke-virtual {p0, p3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/common/v;

    invoke-direct {v5, p2, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/common/v;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/J;Lcom/sumsub/sns/internal/features/presentation/common/G;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    :cond_0
    const/16 p1, 0x64

    if-ne p3, p1, :cond_1

    .line 4
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/common/w;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/common/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_1
    return-void
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/K;)V
    .locals 8

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onPreviewShowed, result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSImageDocumentsAwareViewModel"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/F;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/F;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/F;->a:Ljava/io/File;

    .line 8
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/io/File;)V

    return-void

    .line 9
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/H;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/H;

    .line 11
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/domain/documents/H;->a:Ljava/io/File;

    .line 12
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/io/File;)V

    .line 13
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/H;->b:Z

    if-eqz p1, :cond_1

    .line 14
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/common/q;->a:Lcom/sumsub/sns/internal/features/presentation/common/q;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 15
    :cond_1
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->b(Z)V

    return-void

    .line 16
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/J;

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v3

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/common/x;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/common/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/domain/documents/K;Lcom/sumsub/sns/internal/features/presentation/common/G;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 19
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 3

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "showWarningBottomSheet, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSImageDocumentsAwareViewModel"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->c:Lkotlinx/coroutines/flow/n;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/common/i;

    invoke-direct {v1, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/common/i;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public final a(Z)V
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onNothingPicked, currentResultsEmpty="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "SNSImageDocumentsAwareViewModel"

    invoke-static {v0, v1, p1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 43
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    return-void
.end method

.method public final a(ZLandroid/os/Parcelable;)V
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "On instructions showed, success="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", payload="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSImageDocumentsAwareViewModel"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 23
    instance-of p1, p2, Lcom/sumsub/sns/core/presentation/base/r;

    if-eqz p1, :cond_0

    .line 24
    check-cast p2, Lcom/sumsub/sns/core/presentation/base/r;

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_0
    return-void
.end method

.method public final b(Z)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

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
    const-string/jumbo v2, "showCamera, retake="

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "SNSImageDocumentsAwareViewModel"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/common/y;

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct {v6, p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/common/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;ZLkotlin/coroutines/Continuation;)V

    .line 36
    const/4 v7, 0x3

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 43
    return-void
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

.method public abstract e()V
.end method

.method public intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "Intent: "

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
    const-string v2, "SNSImageDocumentsAwareViewModel"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/o;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/o;

    .line 31
    .line 32
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/o;->a:Z

    .line 33
    .line 34
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/o;->b:Landroid/os/Parcelable;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->a(ZLandroid/os/Parcelable;)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/r;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    const/4 p1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->b(Z)V

    .line 47
    return-void

    .line 48
    .line 49
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/n;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/n;

    .line 54
    .line 55
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/n;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 56
    .line 57
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/common/n;->b:Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 58
    .line 59
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/n;->c:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/data/model/common/J;I)V

    .line 63
    return-void

    .line 64
    .line 65
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/u;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/common/G;->e()V

    .line 71
    return-void

    .line 72
    .line 73
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/t;

    .line 74
    const/4 v1, 0x0

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/t;

    .line 79
    .line 80
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/t;->a:I

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/common/B;

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/common/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;ILkotlin/coroutines/Continuation;)V

    .line 90
    const/4 v6, 0x3

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    .line 95
    .line 96
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 97
    return-void

    .line 98
    .line 99
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/j;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 104
    .line 105
    const-string v0, "dismissBottomSheet"

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v2, v0}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->c:Lkotlinx/coroutines/flow/n;

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/k;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/k;

    .line 121
    .line 122
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/k;->a:Ljava/io/File;

    .line 123
    .line 124
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/k;->b:I

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/common/A;

    .line 131
    .line 132
    .line 133
    invoke-direct {v5, p0, v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/common/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Ljava/io/File;ILkotlin/coroutines/Continuation;)V

    .line 134
    const/4 v6, 0x3

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v3, 0x0

    .line 137
    const/4 v4, 0x0

    .line 138
    .line 139
    .line 140
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 141
    return-void

    .line 142
    .line 143
    :cond_6
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/p;

    .line 144
    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/p;

    .line 148
    .line 149
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/p;->a:Lcom/sumsub/sns/internal/features/domain/documents/K;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->a(Lcom/sumsub/sns/internal/features/domain/documents/K;)V

    .line 153
    return-void

    .line 154
    .line 155
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/m;

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/m;

    .line 160
    .line 161
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/common/m;->a:Landroid/content/Context;

    .line 162
    .line 163
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/common/m;->b:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/common/m;->c:Landroid/net/Uri;

    .line 166
    .line 167
    .line 168
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/z;

    .line 172
    const/4 v5, 0x0

    .line 173
    move-object v1, p0

    .line 174
    .line 175
    .line 176
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/common/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    .line 177
    const/4 v9, 0x3

    .line 178
    const/4 v10, 0x0

    .line 179
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    move-object v5, p1

    .line 182
    move-object v8, v0

    .line 183
    .line 184
    .line 185
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 186
    :cond_8
    return-void
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
