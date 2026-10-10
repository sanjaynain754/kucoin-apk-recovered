.class public final synthetic Lcom/sumsub/sns/internal/features/data/repository/navigation/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.repository.navigation.SdkParamsDto"

    .line 12
    const/4 v3, 0x4

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "documentsByCountries"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "tinCountryInfo"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 28
    .line 29
    const-string v0, "eKycConfig"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    const-string/jumbo v0, "passiveLiveness"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 39
    .line 40
    sput-object v1, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->descriptor:Lvg0/f;

    .line 41
    return-void
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
.end method

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
.method public final childSerializers()[Ltg0/d;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->e:[Lkotlin/Lazy;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-object v2, v0, v1

    .line 6
    .line 7
    .line 8
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    check-cast v2, Ltg0/d;

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    aget-object v0, v0, v3

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Ltg0/d;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/L;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/L;

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    sget-object v5, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 37
    .line 38
    .line 39
    invoke-static {v5}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 40
    move-result-object v5

    .line 41
    const/4 v6, 0x4

    .line 42
    .line 43
    new-array v6, v6, [Ltg0/d;

    .line 44
    .line 45
    aput-object v2, v6, v1

    .line 46
    .line 47
    aput-object v0, v6, v3

    .line 48
    const/4 v0, 0x2

    .line 49
    .line 50
    aput-object v4, v6, v0

    .line 51
    const/4 v0, 0x3

    .line 52
    .line 53
    aput-object v5, v6, v0

    .line 54
    return-object v6
    .line 55
    .line 56
    .line 57
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 19

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->descriptor:Lvg0/f;

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/b;->beginStructure(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->e:[Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    aget-object v3, v2, v7

    .line 24
    .line 25
    .line 26
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    check-cast v3, Ltg0/c;

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v0, v7, v3, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    check-cast v3, Ljava/util/Map;

    .line 36
    .line 37
    aget-object v2, v2, v6

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Ltg0/c;

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v0, v6, v2, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    check-cast v2, Ljava/util/Map;

    .line 50
    .line 51
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/L;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/L;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v0, v5, v6, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    .line 58
    .line 59
    sget-object v6, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v0, v4, v6, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    check-cast v4, Ljava/lang/Boolean;

    .line 66
    .line 67
    const/16 v6, 0xf

    .line 68
    .line 69
    move-object/from16 v16, v2

    .line 70
    move-object v15, v3

    .line 71
    .line 72
    move-object/from16 v18, v4

    .line 73
    .line 74
    move-object/from16 v17, v5

    .line 75
    move v14, v6

    .line 76
    .line 77
    goto/16 :goto_1

    .line 78
    :cond_0
    move v12, v6

    .line 79
    move v3, v7

    .line 80
    move-object v9, v8

    .line 81
    move-object v10, v9

    .line 82
    move-object v11, v10

    .line 83
    .line 84
    :goto_0
    if-eqz v12, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 88
    move-result v13

    .line 89
    const/4 v14, -0x1

    .line 90
    .line 91
    if-eq v13, v14, :cond_5

    .line 92
    .line 93
    if-eqz v13, :cond_4

    .line 94
    .line 95
    if-eq v13, v6, :cond_3

    .line 96
    .line 97
    if-eq v13, v5, :cond_2

    .line 98
    .line 99
    if-ne v13, v4, :cond_1

    .line 100
    .line 101
    sget-object v13, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 102
    .line 103
    .line 104
    invoke-interface {v1, v0, v4, v13, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    move-result-object v11

    .line 106
    .line 107
    check-cast v11, Ljava/lang/Boolean;

    .line 108
    .line 109
    or-int/lit8 v3, v3, 0x8

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 116
    throw v0

    .line 117
    .line 118
    :cond_2
    sget-object v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/L;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/L;

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v0, v5, v13, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object v10

    .line 123
    .line 124
    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    .line 125
    .line 126
    or-int/lit8 v3, v3, 0x4

    .line 127
    goto :goto_0

    .line 128
    .line 129
    :cond_3
    aget-object v13, v2, v6

    .line 130
    .line 131
    .line 132
    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 133
    move-result-object v13

    .line 134
    .line 135
    check-cast v13, Ltg0/c;

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, v0, v6, v13, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v9

    .line 140
    .line 141
    check-cast v9, Ljava/util/Map;

    .line 142
    .line 143
    or-int/lit8 v3, v3, 0x2

    .line 144
    goto :goto_0

    .line 145
    .line 146
    :cond_4
    aget-object v13, v2, v7

    .line 147
    .line 148
    .line 149
    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 150
    move-result-object v13

    .line 151
    .line 152
    check-cast v13, Ltg0/c;

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v0, v7, v13, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object v8

    .line 157
    .line 158
    check-cast v8, Ljava/util/Map;

    .line 159
    .line 160
    or-int/lit8 v3, v3, 0x1

    .line 161
    goto :goto_0

    .line 162
    :cond_5
    move v12, v7

    .line 163
    goto :goto_0

    .line 164
    :cond_6
    move v14, v3

    .line 165
    move-object v15, v8

    .line 166
    .line 167
    move-object/from16 v16, v9

    .line 168
    .line 169
    move-object/from16 v17, v10

    .line 170
    .line 171
    move-object/from16 v18, v11

    .line 172
    .line 173
    .line 174
    :goto_1
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 175
    .line 176
    new-instance v13, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 177
    .line 178
    .line 179
    invoke-direct/range {v13 .. v18}, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;-><init>(ILjava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/remote/N;Ljava/lang/Boolean;)V

    .line 180
    return-object v13
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

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->descriptor:Lvg0/f;

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

.method public final serialize(Lwg0/c;Ljava/lang/Object;)V
    .locals 5

    .line 1
    .line 2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->e:[Lkotlin/Lazy;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 15
    move-result v3

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->a:Ljava/util/Map;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    aget-object v3, v1, v2

    .line 25
    .line 26
    .line 27
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    check-cast v3, Ltg0/p;

    .line 31
    .line 32
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->a:Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 36
    :cond_1
    const/4 v2, 0x1

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_2
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->b:Ljava/util/Map;

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    :goto_1
    aget-object v1, v1, v2

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    check-cast v1, Ltg0/p;

    .line 56
    .line 57
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->b:Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0, v2, v1, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 61
    :cond_3
    const/4 v1, 0x2

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 65
    move-result v2

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_4
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    :goto_2
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/L;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/L;

    .line 75
    .line 76
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 80
    :cond_5
    const/4 v1, 0x3

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 84
    move-result v2

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    goto :goto_3

    .line 88
    .line 89
    :cond_6
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->d:Ljava/lang/Boolean;

    .line 90
    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 94
    .line 95
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;->d:Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 102
    return-void
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
.end method

.method public final typeParametersSerializers()[Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lkotlinx/serialization/internal/m0$a;->a(Lkotlinx/serialization/internal/m0;)[Ltg0/d;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
