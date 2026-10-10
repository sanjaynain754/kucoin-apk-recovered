.class public final Lcom/sumsub/sns/internal/features/data/model/common/P;
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
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    check-cast v1, Ljava/io/File;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Ljava/io/File;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 26
    move-result v5

    .line 27
    const/4 v6, 0x0

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    move-object v5, v6

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 43
    move-result v7

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    .line 47
    if-eqz v7, :cond_1

    .line 48
    move-object v7, v6

    .line 49
    move v6, v9

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v7, v6

    .line 52
    move v6, v8

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 56
    move-result v10

    .line 57
    .line 58
    if-nez v10, :cond_2

    .line 59
    move-object v10, v7

    .line 60
    goto :goto_3

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 64
    move-result v10

    .line 65
    .line 66
    if-eqz v10, :cond_3

    .line 67
    move v10, v9

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v10, v8

    .line 70
    .line 71
    .line 72
    :goto_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    move-result-object v10

    .line 74
    .line 75
    .line 76
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 77
    move-result v11

    .line 78
    .line 79
    if-nez v11, :cond_4

    .line 80
    move-object v11, v7

    .line 81
    goto :goto_4

    .line 82
    .line 83
    :cond_4
    sget-object v11, Lcom/sumsub/sns/internal/features/data/model/common/S;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    .line 86
    invoke-interface {v11, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 87
    move-result-object v11

    .line 88
    .line 89
    :goto_4
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 93
    move-result v12

    .line 94
    .line 95
    if-eqz v12, :cond_5

    .line 96
    move v12, v9

    .line 97
    goto :goto_5

    .line 98
    :cond_5
    move v12, v9

    .line 99
    move v9, v8

    .line 100
    .line 101
    .line 102
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 103
    move-result v13

    .line 104
    .line 105
    if-nez v13, :cond_6

    .line 106
    move-object v8, v10

    .line 107
    move-object v10, v7

    .line 108
    move-object v7, v8

    .line 109
    :goto_6
    move-object v8, v11

    .line 110
    goto :goto_7

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 114
    move-result p1

    .line 115
    .line 116
    if-eqz p1, :cond_7

    .line 117
    move v8, v12

    .line 118
    .line 119
    .line 120
    :cond_7
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    move-result-object p1

    .line 122
    move-object v7, v10

    .line 123
    move-object v10, p1

    .line 124
    goto :goto_6

    .line 125
    .line 126
    .line 127
    :goto_7
    invoke-direct/range {v0 .. v10}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;ZLjava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;ZLjava/lang/Boolean;)V

    .line 128
    return-object v0
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
    new-array p1, p1, [Lcom/sumsub/sns/internal/features/data/model/common/T;

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
