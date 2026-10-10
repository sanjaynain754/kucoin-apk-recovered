.class public final Lcom/sumsub/sns/internal/features/presentation/camera/C;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 2
    const-string p1, "PickerResult"

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/C;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V
    .locals 1

    .line 3
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 4
    const-string p1, "PickerResult"

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/C;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/presentation/base/n;)V
    .locals 11

    .line 1
    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/n;->b:Ljava/lang/Object;

    .line 3
    .line 4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, v1

    .line 13
    .line 14
    :goto_0
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    move-object v2, p1

    .line 18
    .line 19
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v2, v1

    .line 22
    .line 23
    :goto_1
    instance-of v3, p1, Lcom/sumsub/sns/internal/features/domain/documents/V;

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/V;

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object p1, v1

    .line 30
    :goto_2
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 36
    .line 37
    new-instance v2, Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 41
    .line 42
    const-string v5, "DOCUMENT_UPLOAD_RESULT"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v5, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 46
    .line 47
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v4, v2, v3, v1}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_3
    if-eqz v0, :cond_5

    .line 54
    .line 55
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 60
    .line 61
    if-nez p1, :cond_4

    .line 62
    goto :goto_3

    .line 63
    .line 64
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 65
    .line 66
    new-instance v2, Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 70
    .line 71
    const-string v5, "DOCUMENT_RESULT"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v5, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v4, v2, v3, v1}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 80
    return-void

    .line 81
    .line 82
    :cond_5
    :goto_3
    if-eqz v2, :cond_6

    .line 83
    .line 84
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 85
    .line 86
    new-instance v0, Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    const-string v5, "DOCUMENT_RESULTS"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 95
    .line 96
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v4, v0, v3, v1}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 100
    return-void

    .line 101
    .line 102
    :cond_6
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 103
    const/4 v9, 0x7

    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v5 .. v10}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 111
    return-void
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

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/C;->e:Ljava/lang/String;

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
