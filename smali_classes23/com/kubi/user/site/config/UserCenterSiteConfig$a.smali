.class public final Lcom/kubi/user/site/config/UserCenterSiteConfig$a;
.super Ljava/lang/Object;
.source "UserCenterSiteConfig.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/user/site/config/UserCenterSiteConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/user/site/config/UserCenterSiteConfig;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/UserCenterSiteConfig;
    .locals 8

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
    new-instance v1, Lcom/kubi/user/site/config/UserCenterSiteConfig;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    move-object v0, v2

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lcom/kubi/user/site/config/AccountConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    :goto_0
    check-cast v0, Lcom/kubi/user/site/config/AccountConfig;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 29
    move-result v3

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    move-object v3, v2

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    sget-object v3, Lcom/kubi/user/site/config/RegisterConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 36
    .line 37
    .line 38
    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    :goto_1
    check-cast v3, Lcom/kubi/user/site/config/RegisterConfig;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    move-result v4

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    move-object v4, v2

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_2
    sget-object v4, Lcom/kubi/user/site/config/LoginConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    :goto_2
    check-cast v4, Lcom/kubi/user/site/config/LoginConfig;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 61
    move-result v5

    .line 62
    .line 63
    if-nez v5, :cond_3

    .line 64
    move-object v5, v2

    .line 65
    goto :goto_3

    .line 66
    .line 67
    :cond_3
    sget-object v5, Lcom/kubi/user/site/config/SecurityConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 68
    .line 69
    .line 70
    invoke-interface {v5, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    :goto_3
    check-cast v5, Lcom/kubi/user/site/config/SecurityConfig;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 77
    move-result v6

    .line 78
    .line 79
    if-nez v6, :cond_4

    .line 80
    move-object v6, v2

    .line 81
    goto :goto_4

    .line 82
    .line 83
    :cond_4
    sget-object v6, Lcom/kubi/user/site/config/TermConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    :goto_4
    check-cast v6, Lcom/kubi/user/site/config/TermConfig;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 93
    move-result v7

    .line 94
    .line 95
    if-nez v7, :cond_5

    .line 96
    goto :goto_5

    .line 97
    .line 98
    :cond_5
    sget-object v2, Lcom/kubi/user/site/config/MyConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 99
    .line 100
    .line 101
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 102
    move-result-object v2

    .line 103
    :goto_5
    move-object v7, v2

    .line 104
    .line 105
    check-cast v7, Lcom/kubi/user/site/config/MyConfig;

    .line 106
    move-object v2, v0

    .line 107
    .line 108
    .line 109
    invoke-direct/range {v1 .. v7}, Lcom/kubi/user/site/config/UserCenterSiteConfig;-><init>(Lcom/kubi/user/site/config/AccountConfig;Lcom/kubi/user/site/config/RegisterConfig;Lcom/kubi/user/site/config/LoginConfig;Lcom/kubi/user/site/config/SecurityConfig;Lcom/kubi/user/site/config/TermConfig;Lcom/kubi/user/site/config/MyConfig;)V

    .line 110
    return-object v1
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
.end method

.method public final b(I)[Lcom/kubi/user/site/config/UserCenterSiteConfig;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/user/site/config/UserCenterSiteConfig;

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
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/UserCenterSiteConfig$a;->a(Landroid/os/Parcel;)Lcom/kubi/user/site/config/UserCenterSiteConfig;

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
    invoke-virtual {p0, p1}, Lcom/kubi/user/site/config/UserCenterSiteConfig$a;->b(I)[Lcom/kubi/user/site/config/UserCenterSiteConfig;

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
