.class public final Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$a;
.super Ljava/lang/Object;
.source "CardListRspV2.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;",
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;
    .locals 11

    .line 1
    .line 2
    const-string v0, "parcel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    move v5, v4

    .line 21
    goto :goto_2

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    move v0, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v3

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 39
    move-result v4

    .line 40
    move v6, v5

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 44
    move-result v5

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 48
    move-result v7

    .line 49
    .line 50
    if-nez v7, :cond_2

    .line 51
    goto :goto_4

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 55
    move-result v1

    .line 56
    .line 57
    new-instance v7, Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    move v8, v3

    .line 62
    .line 63
    :goto_3
    if-eq v8, v1, :cond_3

    .line 64
    .line 65
    sget-object v9, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 66
    .line 67
    .line 68
    invoke-interface {v9, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 69
    move-result-object v9

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    add-int/lit8 v8, v8, 0x1

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move-object v1, v7

    .line 77
    .line 78
    .line 79
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 80
    move-result v7

    .line 81
    move v8, v7

    .line 82
    .line 83
    new-instance v7, Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    move v9, v3

    .line 88
    .line 89
    :goto_5
    if-eq v9, v8, :cond_4

    .line 90
    .line 91
    sget-object v10, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 92
    .line 93
    .line 94
    invoke-interface {v10, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 95
    move-result-object v10

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    add-int/lit8 v9, v9, 0x1

    .line 101
    goto :goto_5

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    move-result p1

    .line 106
    .line 107
    if-eqz p1, :cond_5

    .line 108
    move v8, v6

    .line 109
    :goto_6
    move-object v6, v1

    .line 110
    goto :goto_7

    .line 111
    :cond_5
    move v8, v3

    .line 112
    goto :goto_6

    .line 113
    .line 114
    :goto_7
    new-instance v1, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;

    .line 115
    move-object v3, v0

    .line 116
    .line 117
    .line 118
    invoke-direct/range {v1 .. v8}, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;-><init>(Ljava/lang/String;Ljava/lang/Boolean;IILjava/util/List;Ljava/util/List;Z)V

    .line 119
    return-object v1
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
.end method

.method public final b(I)[Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$a;->a(Landroid/os/Parcel;)Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$a;->b(I)[Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;

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
.end method
