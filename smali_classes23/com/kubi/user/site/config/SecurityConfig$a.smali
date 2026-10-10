.class public final Lcom/kubi/user/site/config/SecurityConfig$a;
.super Ljava/lang/Object;
.source "UserCenterSiteConfig.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/user/site/config/SecurityConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/user/site/config/SecurityConfig;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/SecurityConfig;
    .locals 14

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
    new-instance v1, Lcom/kubi/user/site/config/SecurityConfig;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    move-object v0, v4

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    move v0, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v0, v2

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 36
    move-result v5

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    move-object v5, v4

    .line 40
    goto :goto_3

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 44
    move-result v5

    .line 45
    .line 46
    if-eqz v5, :cond_3

    .line 47
    move v5, v3

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move v5, v2

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 57
    move-result v6

    .line 58
    .line 59
    if-nez v6, :cond_4

    .line 60
    move-object v6, v4

    .line 61
    goto :goto_5

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 65
    move-result v6

    .line 66
    .line 67
    if-eqz v6, :cond_5

    .line 68
    move v6, v3

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    move v6, v2

    .line 71
    .line 72
    .line 73
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    move-result-object v6

    .line 75
    .line 76
    .line 77
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    move-result v7

    .line 79
    .line 80
    if-nez v7, :cond_6

    .line 81
    move-object v7, v4

    .line 82
    goto :goto_7

    .line 83
    .line 84
    .line 85
    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 86
    move-result v7

    .line 87
    .line 88
    if-eqz v7, :cond_7

    .line 89
    move v7, v3

    .line 90
    goto :goto_6

    .line 91
    :cond_7
    move v7, v2

    .line 92
    .line 93
    .line 94
    :goto_6
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    move-result-object v7

    .line 96
    .line 97
    .line 98
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 99
    move-result v8

    .line 100
    .line 101
    if-nez v8, :cond_8

    .line 102
    move-object v8, v4

    .line 103
    goto :goto_9

    .line 104
    .line 105
    .line 106
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 107
    move-result v8

    .line 108
    .line 109
    if-eqz v8, :cond_9

    .line 110
    move v8, v3

    .line 111
    goto :goto_8

    .line 112
    :cond_9
    move v8, v2

    .line 113
    .line 114
    .line 115
    :goto_8
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    move-result-object v8

    .line 117
    .line 118
    .line 119
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 120
    move-result v9

    .line 121
    .line 122
    if-nez v9, :cond_a

    .line 123
    move-object v9, v4

    .line 124
    goto :goto_b

    .line 125
    .line 126
    .line 127
    :cond_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 128
    move-result v9

    .line 129
    .line 130
    if-eqz v9, :cond_b

    .line 131
    move v9, v3

    .line 132
    goto :goto_a

    .line 133
    :cond_b
    move v9, v2

    .line 134
    .line 135
    .line 136
    :goto_a
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 137
    move-result-object v9

    .line 138
    .line 139
    .line 140
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 141
    move-result v10

    .line 142
    .line 143
    if-nez v10, :cond_c

    .line 144
    move-object v10, v4

    .line 145
    goto :goto_d

    .line 146
    .line 147
    .line 148
    :cond_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 149
    move-result v10

    .line 150
    .line 151
    if-eqz v10, :cond_d

    .line 152
    move v10, v3

    .line 153
    goto :goto_c

    .line 154
    :cond_d
    move v10, v2

    .line 155
    .line 156
    .line 157
    :goto_c
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 158
    move-result-object v10

    .line 159
    .line 160
    .line 161
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 162
    move-result v11

    .line 163
    .line 164
    if-nez v11, :cond_e

    .line 165
    move-object v11, v4

    .line 166
    goto :goto_f

    .line 167
    .line 168
    .line 169
    :cond_e
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 170
    move-result v11

    .line 171
    .line 172
    if-eqz v11, :cond_f

    .line 173
    move v11, v3

    .line 174
    goto :goto_e

    .line 175
    :cond_f
    move v11, v2

    .line 176
    .line 177
    .line 178
    :goto_e
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    move-result-object v11

    .line 180
    .line 181
    .line 182
    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 183
    move-result v12

    .line 184
    .line 185
    if-nez v12, :cond_10

    .line 186
    move-object v12, v4

    .line 187
    goto :goto_11

    .line 188
    .line 189
    .line 190
    :cond_10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 191
    move-result v12

    .line 192
    .line 193
    if-eqz v12, :cond_11

    .line 194
    move v12, v3

    .line 195
    goto :goto_10

    .line 196
    :cond_11
    move v12, v2

    .line 197
    .line 198
    .line 199
    :goto_10
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    move-result-object v12

    .line 201
    .line 202
    .line 203
    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 204
    move-result v13

    .line 205
    .line 206
    if-nez v13, :cond_12

    .line 207
    :goto_12
    move-object v2, v0

    .line 208
    move-object v3, v5

    .line 209
    move-object v5, v7

    .line 210
    move-object v7, v9

    .line 211
    move-object v9, v11

    .line 212
    move-object v11, v4

    .line 213
    move-object v4, v6

    .line 214
    move-object v6, v8

    .line 215
    move-object v8, v10

    .line 216
    move-object v10, v12

    .line 217
    goto :goto_13

    .line 218
    .line 219
    .line 220
    :cond_12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 221
    move-result p1

    .line 222
    .line 223
    if-eqz p1, :cond_13

    .line 224
    move v2, v3

    .line 225
    .line 226
    .line 227
    :cond_13
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 228
    move-result-object v4

    .line 229
    goto :goto_12

    .line 230
    .line 231
    .line 232
    :goto_13
    invoke-direct/range {v1 .. v11}, Lcom/kubi/user/site/config/SecurityConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 233
    return-object v1
    .line 234
.end method

.method public final b(I)[Lcom/kubi/user/site/config/SecurityConfig;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/user/site/config/SecurityConfig;

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
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/SecurityConfig$a;->a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/SecurityConfig;

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
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/SecurityConfig$a;->b(I)[Lcom/kubi/user/site/config/SecurityConfig;

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
