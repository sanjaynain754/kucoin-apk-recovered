.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/sumsub/sns/internal/core/domain/h;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Ljava/lang/String;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p4}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->c:Landroid/os/Bundle;

    .line 10
    return-void
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
.method public final create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 10

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->c:Landroid/os/Bundle;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string p2, "extra_prefill_country"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    :goto_0
    move-object v2, p1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :goto_1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    move-object v3, p1

    .line 28
    .line 29
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 30
    .line 31
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object p1

    .line 38
    move-object v4, p1

    .line 39
    .line 40
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 41
    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 43
    .line 44
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 45
    .line 46
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/e;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 55
    .line 56
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 57
    .line 58
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 59
    .line 60
    .line 61
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 65
    .line 66
    .line 67
    invoke-direct {v6, p1, p2}, Lcom/sumsub/sns/internal/features/domain/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 68
    .line 69
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/x;

    .line 70
    .line 71
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 72
    .line 73
    .line 74
    invoke-direct {v7, p1}, Lcom/sumsub/sns/internal/features/domain/x;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 75
    .line 76
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 77
    .line 78
    .line 79
    invoke-direct {v8}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;-><init>()V

    .line 80
    .line 81
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/ekyc/d;

    .line 82
    .line 83
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;->b:Lcom/sumsub/sns/internal/core/domain/h;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 92
    .line 93
    .line 94
    invoke-direct {v9, p1}, Lcom/sumsub/sns/internal/features/domain/ekyc/d;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v0 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/x;Lcom/sumsub/sns/internal/features/domain/ekyc/b;Lcom/sumsub/sns/internal/features/domain/ekyc/d;)V

    .line 98
    return-object v0
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
