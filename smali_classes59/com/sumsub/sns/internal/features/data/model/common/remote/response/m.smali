.class public final synthetic Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.model.common.remote.response.ApiErrorResponse"

    .line 12
    const/4 v3, 0x5

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "description"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    const-string v0, "code"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 27
    .line 28
    const-string v0, "correlationId"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 32
    .line 33
    const-string v0, "errorCode"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 37
    .line 38
    const-string v0, "errorName"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 42
    .line 43
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;->descriptor:Lvg0/f;

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
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    sget-object v2, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 24
    move-result-object v0

    .line 25
    const/4 v5, 0x5

    .line 26
    .line 27
    new-array v5, v5, [Ltg0/d;

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    aput-object v1, v5, v6

    .line 31
    const/4 v1, 0x1

    .line 32
    .line 33
    aput-object v3, v5, v1

    .line 34
    const/4 v1, 0x2

    .line 35
    .line 36
    aput-object v4, v5, v1

    .line 37
    const/4 v1, 0x3

    .line 38
    .line 39
    aput-object v2, v5, v1

    .line 40
    const/4 v1, 0x4

    .line 41
    .line 42
    aput-object v0, v5, v1

    .line 43
    return-object v5
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

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 21

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;->descriptor:Lvg0/f;

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
    .line 11
    invoke-interface {v1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x4

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, v0, v7, v2, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v7

    .line 27
    .line 28
    check-cast v7, Ljava/lang/String;

    .line 29
    .line 30
    sget-object v9, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v0, v6, v9, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object v6

    .line 35
    .line 36
    check-cast v6, Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, v0, v5, v2, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v0, v3, v9, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v0, v4, v2, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    const/16 v4, 0x1f

    .line 57
    .line 58
    move-object/from16 v20, v2

    .line 59
    .line 60
    move-object/from16 v19, v3

    .line 61
    move v15, v4

    .line 62
    .line 63
    move-object/from16 v18, v5

    .line 64
    .line 65
    move-object/from16 v17, v6

    .line 66
    .line 67
    move-object/from16 v16, v7

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    :cond_0
    move v13, v6

    .line 71
    move v2, v7

    .line 72
    move-object v9, v8

    .line 73
    move-object v10, v9

    .line 74
    move-object v11, v10

    .line 75
    move-object v12, v11

    .line 76
    .line 77
    :goto_0
    if-eqz v13, :cond_7

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 81
    move-result v14

    .line 82
    const/4 v15, -0x1

    .line 83
    .line 84
    if-eq v14, v15, :cond_6

    .line 85
    .line 86
    if-eqz v14, :cond_5

    .line 87
    .line 88
    if-eq v14, v6, :cond_4

    .line 89
    .line 90
    if-eq v14, v5, :cond_3

    .line 91
    .line 92
    if-eq v14, v3, :cond_2

    .line 93
    .line 94
    if-ne v14, v4, :cond_1

    .line 95
    .line 96
    sget-object v14, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v0, v4, v14, v12}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    move-result-object v12

    .line 101
    .line 102
    check-cast v12, Ljava/lang/String;

    .line 103
    .line 104
    or-int/lit8 v2, v2, 0x10

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 111
    throw v0

    .line 112
    .line 113
    :cond_2
    sget-object v14, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 114
    .line 115
    .line 116
    invoke-interface {v1, v0, v3, v14, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object v11

    .line 118
    .line 119
    check-cast v11, Ljava/lang/Integer;

    .line 120
    .line 121
    or-int/lit8 v2, v2, 0x8

    .line 122
    goto :goto_0

    .line 123
    .line 124
    :cond_3
    sget-object v14, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 125
    .line 126
    .line 127
    invoke-interface {v1, v0, v5, v14, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object v10

    .line 129
    .line 130
    check-cast v10, Ljava/lang/String;

    .line 131
    .line 132
    or-int/lit8 v2, v2, 0x4

    .line 133
    goto :goto_0

    .line 134
    .line 135
    :cond_4
    sget-object v14, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, v0, v6, v14, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v9

    .line 140
    .line 141
    check-cast v9, Ljava/lang/Integer;

    .line 142
    .line 143
    or-int/lit8 v2, v2, 0x2

    .line 144
    goto :goto_0

    .line 145
    .line 146
    :cond_5
    sget-object v14, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 147
    .line 148
    .line 149
    invoke-interface {v1, v0, v7, v14, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-result-object v8

    .line 151
    .line 152
    check-cast v8, Ljava/lang/String;

    .line 153
    .line 154
    or-int/lit8 v2, v2, 0x1

    .line 155
    goto :goto_0

    .line 156
    :cond_6
    move v13, v7

    .line 157
    goto :goto_0

    .line 158
    :cond_7
    move v15, v2

    .line 159
    .line 160
    move-object/from16 v16, v8

    .line 161
    .line 162
    move-object/from16 v17, v9

    .line 163
    .line 164
    move-object/from16 v18, v10

    .line 165
    .line 166
    move-object/from16 v19, v11

    .line 167
    .line 168
    move-object/from16 v20, v12

    .line 169
    .line 170
    .line 171
    :goto_1
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 172
    .line 173
    new-instance v14, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;

    .line 174
    .line 175
    .line 176
    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 177
    return-object v14
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

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;->descriptor:Lvg0/f;

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
    .locals 4

    .line 1
    .line 2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->a:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 23
    .line 24
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->a:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 28
    :cond_1
    const/4 v1, 0x1

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_2
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->b:Ljava/lang/Integer;

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 42
    .line 43
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->b:Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 47
    :cond_3
    const/4 v1, 0x2

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_4
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->c:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 61
    .line 62
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->c:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 66
    :cond_5
    const/4 v1, 0x3

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 70
    move-result v2

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    goto :goto_3

    .line 74
    .line 75
    :cond_6
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->d:Ljava/lang/Integer;

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/v0;->a:Lkotlinx/serialization/internal/v0;

    .line 80
    .line 81
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->d:Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 85
    :cond_7
    const/4 v1, 0x4

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    goto :goto_4

    .line 93
    .line 94
    :cond_8
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->e:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v2, :cond_9

    .line 97
    .line 98
    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 99
    .line 100
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->e:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_9
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 107
    return-void
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
