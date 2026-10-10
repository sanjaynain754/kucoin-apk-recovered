.class public final Lcom/sumsub/sns/internal/features/data/model/common/remote/response/z0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    move-object v1, v2

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 23
    move-result v3

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    move-object v3, v2

    .line 27
    goto :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 43
    move-result v5

    .line 44
    .line 45
    if-nez v5, :cond_2

    .line 46
    move-object v5, v2

    .line 47
    goto :goto_2

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 59
    move-result v6

    .line 60
    .line 61
    if-nez v6, :cond_3

    .line 62
    move-object v6, v2

    .line 63
    goto :goto_3

    .line 64
    .line 65
    :cond_3
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 66
    .line 67
    .line 68
    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    :goto_3
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 75
    move-result v7

    .line 76
    .line 77
    if-nez v7, :cond_4

    .line 78
    move-object v7, v2

    .line 79
    goto :goto_4

    .line 80
    .line 81
    :cond_4
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 82
    .line 83
    .line 84
    invoke-interface {v7, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 85
    move-result-object v7

    .line 86
    .line 87
    :goto_4
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 91
    move-result v8

    .line 92
    .line 93
    if-nez v8, :cond_5

    .line 94
    goto :goto_5

    .line 95
    .line 96
    :cond_5
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 97
    .line 98
    .line 99
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    :goto_5
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;

    .line 103
    move-object v9, v7

    .line 104
    move-object v7, v2

    .line 105
    move-object v2, v3

    .line 106
    move-object v3, v4

    .line 107
    move-object v4, v5

    .line 108
    move-object v5, v6

    .line 109
    move-object v6, v9

    .line 110
    .line 111
    .line 112
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationStatus;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/J;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/B;)V

    .line 113
    return-object v0
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    .line 3
    return-object p1
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
