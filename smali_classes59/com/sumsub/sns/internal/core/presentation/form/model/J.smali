.class public final Lcom/sumsub/sns/internal/core/presentation/form/model/J;
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    .line 9
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    move-object v6, v0

    .line 29
    .line 30
    check-cast v6, Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    const/4 v0, 0x1

    .line 39
    move v7, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v7, v1

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    move-result v0

    .line 46
    .line 47
    new-instance v8, Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    move v9, v1

    .line 52
    .line 53
    :goto_1
    if-eq v9, v0, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    move-result-object v10

    .line 58
    .line 59
    .line 60
    invoke-static {v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 61
    move-result-object v10

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    add-int/lit8 v9, v9, 0x1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 71
    move-result v0

    .line 72
    const/4 v9, 0x0

    .line 73
    .line 74
    if-nez v0, :cond_2

    .line 75
    move-object v10, v9

    .line 76
    goto :goto_3

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 80
    move-result v0

    .line 81
    .line 82
    new-instance v10, Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    move v11, v1

    .line 87
    .line 88
    :goto_2
    if-eq v11, v0, :cond_3

    .line 89
    .line 90
    sget-object v12, Lcom/sumsub/sns/internal/core/presentation/form/model/A;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 91
    .line 92
    .line 93
    invoke-interface {v12, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 94
    move-result-object v12

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    add-int/lit8 v11, v11, 0x1

    .line 100
    goto :goto_2

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 112
    move-result v11

    .line 113
    .line 114
    if-nez v11, :cond_4

    .line 115
    move-object v11, v9

    .line 116
    goto :goto_5

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 120
    move-result v9

    .line 121
    .line 122
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    .line 125
    invoke-direct {v11, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 126
    .line 127
    :goto_4
    if-eq v1, v9, :cond_5

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 131
    move-result-object v12

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 135
    move-result-object v13

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v12, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    goto :goto_4

    .line 142
    .line 143
    .line 144
    :cond_5
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 145
    move-result-object v12

    .line 146
    .line 147
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 148
    move-object v9, v10

    .line 149
    move-object v10, v0

    .line 150
    .line 151
    .line 152
    invoke-direct/range {v1 .. v12}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/util/List;Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;Ljava/lang/String;)V

    .line 153
    return-object v1
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
    new-array p1, p1, [Lcom/sumsub/sns/internal/core/presentation/form/model/K;

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
