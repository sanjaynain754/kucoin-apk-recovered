.class public final Lcom/kubi/user/site/config/OverviewConfig$a;
.super Ljava/lang/Object;
.source "UserCenterSiteConfig.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/user/site/config/OverviewConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/user/site/config/OverviewConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


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
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/OverviewConfig;
    .locals 13

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "parcel"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/user/site/config/OverviewConfig;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 16
    move-result v0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    move-object v0, v5

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    move v0, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v0, v3

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 40
    move-result v6

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    move-object v6, v5

    .line 44
    goto :goto_3

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 48
    move-result v6

    .line 49
    .line 50
    if-eqz v6, :cond_3

    .line 51
    move v6, v4

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v6, v3

    .line 54
    .line 55
    .line 56
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    move-result-object v6

    .line 58
    .line 59
    .line 60
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 61
    move-result v7

    .line 62
    .line 63
    if-nez v7, :cond_4

    .line 64
    move-object v7, v5

    .line 65
    goto :goto_5

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 69
    move-result v7

    .line 70
    .line 71
    if-eqz v7, :cond_5

    .line 72
    move v7, v4

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    move v7, v3

    .line 75
    .line 76
    .line 77
    :goto_4
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    move-result-object v7

    .line 79
    .line 80
    .line 81
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 82
    move-result v8

    .line 83
    .line 84
    if-nez v8, :cond_6

    .line 85
    move-object v8, v5

    .line 86
    goto :goto_7

    .line 87
    .line 88
    .line 89
    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 90
    move-result v8

    .line 91
    .line 92
    if-eqz v8, :cond_7

    .line 93
    move v8, v4

    .line 94
    goto :goto_6

    .line 95
    :cond_7
    move v8, v3

    .line 96
    .line 97
    .line 98
    :goto_6
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    move-result-object v8

    .line 100
    .line 101
    .line 102
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 103
    move-result v9

    .line 104
    .line 105
    if-nez v9, :cond_8

    .line 106
    move-object v9, v5

    .line 107
    goto :goto_9

    .line 108
    .line 109
    .line 110
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 111
    move-result v9

    .line 112
    .line 113
    if-eqz v9, :cond_9

    .line 114
    move v9, v4

    .line 115
    goto :goto_8

    .line 116
    :cond_9
    move v9, v3

    .line 117
    .line 118
    .line 119
    :goto_8
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    move-result-object v9

    .line 121
    .line 122
    .line 123
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 124
    move-result v10

    .line 125
    .line 126
    if-nez v10, :cond_a

    .line 127
    move-object v10, v5

    .line 128
    goto :goto_b

    .line 129
    .line 130
    .line 131
    :cond_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 132
    move-result v10

    .line 133
    .line 134
    if-eqz v10, :cond_b

    .line 135
    move v10, v4

    .line 136
    goto :goto_a

    .line 137
    :cond_b
    move v10, v3

    .line 138
    .line 139
    .line 140
    :goto_a
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    move-result-object v10

    .line 142
    .line 143
    .line 144
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 145
    move-result v11

    .line 146
    .line 147
    if-nez v11, :cond_c

    .line 148
    move-object v11, v5

    .line 149
    goto :goto_d

    .line 150
    .line 151
    .line 152
    :cond_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 153
    move-result v11

    .line 154
    .line 155
    if-eqz v11, :cond_d

    .line 156
    move v11, v4

    .line 157
    goto :goto_c

    .line 158
    :cond_d
    move v11, v3

    .line 159
    .line 160
    .line 161
    :goto_c
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    move-result-object v11

    .line 163
    .line 164
    .line 165
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 166
    move-result v12

    .line 167
    .line 168
    if-nez v12, :cond_e

    .line 169
    :goto_e
    move-object v3, v0

    .line 170
    move-object v4, v6

    .line 171
    move-object v6, v8

    .line 172
    move-object v8, v10

    .line 173
    move-object v10, v5

    .line 174
    move-object v5, v7

    .line 175
    move-object v7, v9

    .line 176
    move-object v9, v11

    .line 177
    goto :goto_f

    .line 178
    .line 179
    .line 180
    :cond_e
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 181
    move-result p1

    .line 182
    .line 183
    if-eqz p1, :cond_f

    .line 184
    move v3, v4

    .line 185
    .line 186
    .line 187
    :cond_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    move-result-object v5

    .line 189
    goto :goto_e

    .line 190
    .line 191
    .line 192
    :goto_f
    invoke-direct/range {v1 .. v10}, Lcom/kubi/user/site/config/OverviewConfig;-><init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 193
    return-object v1
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
.end method

.method public final b(I)[Lcom/kubi/user/site/config/OverviewConfig;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/user/site/config/OverviewConfig;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/OverviewConfig$a;->a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/OverviewConfig;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/OverviewConfig$a;->b(I)[Lcom/kubi/user/site/config/OverviewConfig;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method
