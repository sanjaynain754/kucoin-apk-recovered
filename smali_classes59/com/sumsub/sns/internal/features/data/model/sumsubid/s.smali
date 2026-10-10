.class public final synthetic Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;->a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdDocsResponse.SNSSumsubIdDocByStep"

    .line 12
    const/4 v3, 0x5

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "docId"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    const-string v0, "imageIds"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 27
    .line 28
    const-string v0, "info"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 32
    .line 33
    const-string v0, "idDoc"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 37
    .line 38
    const-string v0, "detectedLanguages"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 42
    .line 43
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;->descriptor:Lvg0/f;

    .line 44
    return-void
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
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->f:[Lkotlin/Lazy;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    .line 14
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    check-cast v3, Ltg0/d;

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x2

    .line 23
    .line 24
    aget-object v5, v0, v4

    .line 25
    .line 26
    .line 27
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    check-cast v5, Ltg0/d;

    .line 31
    .line 32
    .line 33
    invoke-static {v5}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;->a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;

    .line 37
    .line 38
    .line 39
    invoke-static {v6}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 40
    move-result-object v6

    .line 41
    const/4 v7, 0x4

    .line 42
    .line 43
    aget-object v0, v0, v7

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Ltg0/d;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 53
    move-result-object v0

    .line 54
    const/4 v8, 0x5

    .line 55
    .line 56
    new-array v8, v8, [Ltg0/d;

    .line 57
    const/4 v9, 0x0

    .line 58
    .line 59
    aput-object v1, v8, v9

    .line 60
    .line 61
    aput-object v3, v8, v2

    .line 62
    .line 63
    aput-object v5, v8, v4

    .line 64
    const/4 v1, 0x3

    .line 65
    .line 66
    aput-object v6, v8, v1

    .line 67
    .line 68
    aput-object v0, v8, v7

    .line 69
    return-object v8
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
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
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 23

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;->descriptor:Lvg0/f;

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
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->f:[Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x2

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v0, v8, v3, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    aget-object v8, v2, v7

    .line 33
    .line 34
    .line 35
    invoke-interface {v8}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 36
    move-result-object v8

    .line 37
    .line 38
    check-cast v8, Ltg0/c;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v0, v7, v8, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    check-cast v7, Ljava/util/List;

    .line 45
    .line 46
    aget-object v8, v2, v6

    .line 47
    .line 48
    .line 49
    invoke-interface {v8}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object v8

    .line 51
    .line 52
    check-cast v8, Ltg0/c;

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v0, v6, v8, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    check-cast v6, Ljava/util/Map;

    .line 59
    .line 60
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;->a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;

    .line 61
    .line 62
    .line 63
    invoke-interface {v1, v0, v4, v8, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/sumsubid/x;

    .line 67
    .line 68
    aget-object v2, v2, v5

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    check-cast v2, Ltg0/c;

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, v0, v5, v2, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    check-cast v2, Ljava/util/List;

    .line 81
    .line 82
    const/16 v5, 0x1f

    .line 83
    .line 84
    move-object/from16 v22, v2

    .line 85
    .line 86
    move-object/from16 v18, v3

    .line 87
    .line 88
    move-object/from16 v21, v4

    .line 89
    .line 90
    move/from16 v17, v5

    .line 91
    .line 92
    move-object/from16 v20, v6

    .line 93
    .line 94
    move-object/from16 v19, v7

    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    :cond_0
    move v14, v7

    .line 98
    move v3, v8

    .line 99
    move-object v10, v9

    .line 100
    move-object v11, v10

    .line 101
    move-object v12, v11

    .line 102
    move-object v13, v12

    .line 103
    .line 104
    :goto_0
    if-eqz v14, :cond_7

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 108
    move-result v15

    .line 109
    const/4 v8, -0x1

    .line 110
    .line 111
    if-eq v15, v8, :cond_6

    .line 112
    .line 113
    if-eqz v15, :cond_5

    .line 114
    .line 115
    if-eq v15, v7, :cond_4

    .line 116
    .line 117
    if-eq v15, v6, :cond_3

    .line 118
    .line 119
    if-eq v15, v4, :cond_2

    .line 120
    .line 121
    if-ne v15, v5, :cond_1

    .line 122
    .line 123
    aget-object v8, v2, v5

    .line 124
    .line 125
    .line 126
    invoke-interface {v8}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 127
    move-result-object v8

    .line 128
    .line 129
    check-cast v8, Ltg0/c;

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v0, v5, v8, v13}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    move-result-object v8

    .line 134
    move-object v13, v8

    .line 135
    .line 136
    check-cast v13, Ljava/util/List;

    .line 137
    .line 138
    or-int/lit8 v3, v3, 0x10

    .line 139
    :goto_1
    const/4 v8, 0x0

    .line 140
    goto :goto_0

    .line 141
    .line 142
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 143
    .line 144
    .line 145
    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 146
    throw v0

    .line 147
    .line 148
    :cond_2
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;->a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v0, v4, v8, v12}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object v8

    .line 153
    move-object v12, v8

    .line 154
    .line 155
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/sumsubid/x;

    .line 156
    .line 157
    or-int/lit8 v3, v3, 0x8

    .line 158
    goto :goto_1

    .line 159
    .line 160
    :cond_3
    aget-object v8, v2, v6

    .line 161
    .line 162
    .line 163
    invoke-interface {v8}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 164
    move-result-object v8

    .line 165
    .line 166
    check-cast v8, Ltg0/c;

    .line 167
    .line 168
    .line 169
    invoke-interface {v1, v0, v6, v8, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    move-result-object v8

    .line 171
    move-object v11, v8

    .line 172
    .line 173
    check-cast v11, Ljava/util/Map;

    .line 174
    .line 175
    or-int/lit8 v3, v3, 0x4

    .line 176
    goto :goto_1

    .line 177
    .line 178
    :cond_4
    aget-object v8, v2, v7

    .line 179
    .line 180
    .line 181
    invoke-interface {v8}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 182
    move-result-object v8

    .line 183
    .line 184
    check-cast v8, Ltg0/c;

    .line 185
    .line 186
    .line 187
    invoke-interface {v1, v0, v7, v8, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    move-result-object v8

    .line 189
    move-object v10, v8

    .line 190
    .line 191
    check-cast v10, Ljava/util/List;

    .line 192
    .line 193
    or-int/lit8 v3, v3, 0x2

    .line 194
    goto :goto_1

    .line 195
    .line 196
    :cond_5
    sget-object v8, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 197
    const/4 v15, 0x0

    .line 198
    .line 199
    .line 200
    invoke-interface {v1, v0, v15, v8, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object v8

    .line 202
    move-object v9, v8

    .line 203
    .line 204
    check-cast v9, Ljava/lang/String;

    .line 205
    .line 206
    or-int/lit8 v3, v3, 0x1

    .line 207
    move v8, v15

    .line 208
    goto :goto_0

    .line 209
    :cond_6
    const/4 v15, 0x0

    .line 210
    move v8, v15

    .line 211
    move v14, v8

    .line 212
    goto :goto_0

    .line 213
    .line 214
    :cond_7
    move/from16 v17, v3

    .line 215
    .line 216
    move-object/from16 v18, v9

    .line 217
    .line 218
    move-object/from16 v19, v10

    .line 219
    .line 220
    move-object/from16 v20, v11

    .line 221
    .line 222
    move-object/from16 v21, v12

    .line 223
    .line 224
    move-object/from16 v22, v13

    .line 225
    .line 226
    .line 227
    :goto_2
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 228
    .line 229
    new-instance v16, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;

    .line 230
    .line 231
    .line 232
    invoke-direct/range {v16 .. v22}, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/sumsubid/x;Ljava/util/List;)V

    .line 233
    return-object v16
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/s;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->f:[Lkotlin/Lazy;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 25
    .line 26
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->a:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 30
    :cond_1
    const/4 v2, 0x1

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 34
    move-result v3

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_2
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->b:Ljava/util/List;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    :goto_1
    aget-object v3, v1, v2

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    check-cast v3, Ltg0/p;

    .line 50
    .line 51
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->b:Ljava/util/List;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 55
    :cond_3
    const/4 v2, 0x2

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_4
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->c:Ljava/util/Map;

    .line 65
    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    :goto_2
    aget-object v3, v1, v2

    .line 69
    .line 70
    .line 71
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    check-cast v3, Ltg0/p;

    .line 75
    .line 76
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->c:Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 80
    :cond_5
    const/4 v2, 0x3

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_6

    .line 87
    goto :goto_3

    .line 88
    .line 89
    :cond_6
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->d:Lcom/sumsub/sns/internal/features/data/model/sumsubid/x;

    .line 90
    .line 91
    if-eqz v3, :cond_7

    .line 92
    .line 93
    :goto_3
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;->a:Lcom/sumsub/sns/internal/features/data/model/sumsubid/v;

    .line 94
    .line 95
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->d:Lcom/sumsub/sns/internal/features/data/model/sumsubid/x;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 99
    :cond_7
    const/4 v2, 0x4

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 103
    move-result v3

    .line 104
    .line 105
    if-eqz v3, :cond_8

    .line 106
    goto :goto_4

    .line 107
    .line 108
    :cond_8
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->e:Ljava/util/List;

    .line 109
    .line 110
    if-eqz v3, :cond_9

    .line 111
    .line 112
    :goto_4
    aget-object v1, v1, v2

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    check-cast v1, Ltg0/p;

    .line 119
    .line 120
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/u;->e:Ljava/util/List;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v0, v2, v1, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_9
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 127
    return-void
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
