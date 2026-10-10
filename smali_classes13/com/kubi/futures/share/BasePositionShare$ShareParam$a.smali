.class public final Lcom/kubi/futures/share/BasePositionShare$ShareParam$a;
.super Ljava/lang/Object;
.source "BasePositionShare.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/share/BasePositionShare$ShareParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/futures/share/BasePositionShare$ShareParam;",
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
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "parcel"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v2, Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    move v1, v3

    .line 19
    move v3, v4

    .line 20
    move v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    move v5, v4

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    const-class v6, Lcom/kubi/futures/share/BasePositionShare$ShareParam;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 33
    move-result-object v6

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    check-cast v6, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 40
    move v7, v5

    .line 41
    move-object v5, v6

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 49
    move-result-object v8

    .line 50
    .line 51
    check-cast v8, Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 55
    move-result-object v9

    .line 56
    .line 57
    check-cast v9, Ljava/math/BigDecimal;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 61
    move-result-object v10

    .line 62
    .line 63
    check-cast v10, Ljava/math/BigDecimal;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 67
    move-result v11

    .line 68
    .line 69
    if-nez v11, :cond_1

    .line 70
    const/4 v11, 0x0

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 75
    move-result-wide v11

    .line 76
    .line 77
    .line 78
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    move-result-object v11

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 83
    move-result-object v12

    .line 84
    .line 85
    check-cast v12, Ljava/math/BigDecimal;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 89
    move-result-object v13

    .line 90
    .line 91
    check-cast v13, Ljava/math/BigDecimal;

    .line 92
    move v14, v7

    .line 93
    move-object v7, v8

    .line 94
    move-object v8, v9

    .line 95
    move-object v9, v10

    .line 96
    move-object v10, v11

    .line 97
    move-object v11, v12

    .line 98
    move-object v12, v13

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 102
    move-result-object v13

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 106
    move-result v15

    .line 107
    .line 108
    if-eqz v15, :cond_2

    .line 109
    move v15, v14

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    move v15, v14

    .line 112
    move v14, v1

    .line 113
    .line 114
    .line 115
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 116
    move-result v16

    .line 117
    .line 118
    if-eqz v16, :cond_3

    .line 119
    .line 120
    move/from16 v16, v15

    .line 121
    goto :goto_3

    .line 122
    .line 123
    :cond_3
    move/from16 v16, v15

    .line 124
    move v15, v1

    .line 125
    .line 126
    .line 127
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 128
    move-result v17

    .line 129
    .line 130
    if-eqz v17, :cond_4

    .line 131
    goto :goto_4

    .line 132
    .line 133
    :cond_4
    move/from16 v16, v1

    .line 134
    .line 135
    .line 136
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 137
    move-result-object v17

    .line 138
    .line 139
    .line 140
    invoke-direct/range {v2 .. v17}, Lcom/kubi/futures/share/BasePositionShare$ShareParam;-><init>(ZLjava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 141
    return-object v2
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
.end method

.method public final b(I)[Lcom/kubi/futures/share/BasePositionShare$ShareParam;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/futures/share/BasePositionShare$ShareParam;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/share/BasePositionShare$ShareParam$a;->a(Landroid/os/Parcel;)Lcom/kubi/futures/share/BasePositionShare$ShareParam;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/share/BasePositionShare$ShareParam$a;->b(I)[Lcom/kubi/futures/share/BasePositionShare$ShareParam;

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
.end method
