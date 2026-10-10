.class public final synthetic Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.model.common.remote.RemoteIdDoc"

    .line 12
    const/4 v3, 0x6

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "idDocType"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    const-string v0, "country"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 27
    .line 28
    const-string v0, "idDocSubType"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 32
    .line 33
    const-string v0, "errors"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 37
    .line 38
    const-string v0, "imageId"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string/jumbo v0, "nfcSessionInfo"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 48
    .line 49
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;->descriptor:Lvg0/f;

    .line 50
    return-void
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->g:[Lkotlin/Lazy;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x2

    .line 14
    .line 15
    aget-object v5, v0, v4

    .line 16
    .line 17
    .line 18
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object v5

    .line 20
    .line 21
    check-cast v5, Ltg0/d;

    .line 22
    .line 23
    .line 24
    invoke-static {v5}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x3

    .line 27
    .line 28
    aget-object v0, v0, v6

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Ltg0/d;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;

    .line 45
    .line 46
    .line 47
    invoke-static {v7}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 48
    move-result-object v7

    .line 49
    const/4 v8, 0x6

    .line 50
    .line 51
    new-array v8, v8, [Ltg0/d;

    .line 52
    const/4 v9, 0x0

    .line 53
    .line 54
    aput-object v2, v8, v9

    .line 55
    const/4 v2, 0x1

    .line 56
    .line 57
    aput-object v3, v8, v2

    .line 58
    .line 59
    aput-object v5, v8, v4

    .line 60
    .line 61
    aput-object v0, v8, v6

    .line 62
    const/4 v0, 0x4

    .line 63
    .line 64
    aput-object v1, v8, v0

    .line 65
    const/4 v0, 0x5

    .line 66
    .line 67
    aput-object v7, v8, v0

    .line 68
    return-object v8
    .line 69
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
    .locals 25

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;->descriptor:Lvg0/f;

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
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->g:[Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x5

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v0, v9, v3, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v9

    .line 30
    .line 31
    check-cast v9, Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v0, v8, v3, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v8

    .line 36
    .line 37
    check-cast v8, Ljava/lang/String;

    .line 38
    .line 39
    aget-object v11, v2, v7

    .line 40
    .line 41
    .line 42
    invoke-interface {v11}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v11

    .line 44
    .line 45
    check-cast v11, Ltg0/c;

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v0, v7, v11, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 52
    .line 53
    aget-object v2, v2, v6

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    check-cast v2, Ltg0/c;

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v0, v6, v2, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    check-cast v2, Ljava/util/List;

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v0, v5, v3, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    check-cast v3, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v0, v4, v5, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    .line 80
    .line 81
    const/16 v5, 0x3f

    .line 82
    .line 83
    move-object/from16 v22, v2

    .line 84
    .line 85
    move-object/from16 v23, v3

    .line 86
    .line 87
    move-object/from16 v24, v4

    .line 88
    .line 89
    move/from16 v18, v5

    .line 90
    .line 91
    move-object/from16 v21, v7

    .line 92
    .line 93
    move-object/from16 v20, v8

    .line 94
    .line 95
    move-object/from16 v19, v9

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_0
    move/from16 v16, v8

    .line 100
    move v3, v9

    .line 101
    move-object v11, v10

    .line 102
    move-object v12, v11

    .line 103
    move-object v13, v12

    .line 104
    move-object v14, v13

    .line 105
    move-object v15, v14

    .line 106
    .line 107
    :goto_0
    if-eqz v16, :cond_1

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 111
    move-result v9

    .line 112
    .line 113
    .line 114
    packed-switch v9, :pswitch_data_0

    .line 115
    .line 116
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 120
    throw v0

    .line 121
    .line 122
    :pswitch_0
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;

    .line 123
    .line 124
    .line 125
    invoke-interface {v1, v0, v4, v9, v15}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    move-result-object v9

    .line 127
    move-object v15, v9

    .line 128
    .line 129
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    .line 130
    .line 131
    or-int/lit8 v3, v3, 0x20

    .line 132
    :goto_1
    const/4 v9, 0x0

    .line 133
    goto :goto_0

    .line 134
    .line 135
    :pswitch_1
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, v0, v5, v9, v14}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v9

    .line 140
    move-object v14, v9

    .line 141
    .line 142
    check-cast v14, Ljava/lang/String;

    .line 143
    .line 144
    or-int/lit8 v3, v3, 0x10

    .line 145
    goto :goto_1

    .line 146
    .line 147
    :pswitch_2
    aget-object v9, v2, v6

    .line 148
    .line 149
    .line 150
    invoke-interface {v9}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 151
    move-result-object v9

    .line 152
    .line 153
    check-cast v9, Ltg0/c;

    .line 154
    .line 155
    .line 156
    invoke-interface {v1, v0, v6, v9, v13}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    move-result-object v9

    .line 158
    move-object v13, v9

    .line 159
    .line 160
    check-cast v13, Ljava/util/List;

    .line 161
    .line 162
    or-int/lit8 v3, v3, 0x8

    .line 163
    goto :goto_1

    .line 164
    .line 165
    :pswitch_3
    aget-object v9, v2, v7

    .line 166
    .line 167
    .line 168
    invoke-interface {v9}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 169
    move-result-object v9

    .line 170
    .line 171
    check-cast v9, Ltg0/c;

    .line 172
    .line 173
    .line 174
    invoke-interface {v1, v0, v7, v9, v12}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    move-result-object v9

    .line 176
    move-object v12, v9

    .line 177
    .line 178
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 179
    .line 180
    or-int/lit8 v3, v3, 0x4

    .line 181
    goto :goto_1

    .line 182
    .line 183
    :pswitch_4
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v0, v8, v9, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    move-result-object v9

    .line 188
    move-object v11, v9

    .line 189
    .line 190
    check-cast v11, Ljava/lang/String;

    .line 191
    .line 192
    or-int/lit8 v3, v3, 0x2

    .line 193
    goto :goto_1

    .line 194
    .line 195
    :pswitch_5
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 196
    const/4 v4, 0x0

    .line 197
    .line 198
    .line 199
    invoke-interface {v1, v0, v4, v9, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    move-result-object v9

    .line 201
    move-object v10, v9

    .line 202
    .line 203
    check-cast v10, Ljava/lang/String;

    .line 204
    .line 205
    or-int/lit8 v3, v3, 0x1

    .line 206
    move v9, v4

    .line 207
    :goto_2
    const/4 v4, 0x5

    .line 208
    goto :goto_0

    .line 209
    :pswitch_6
    const/4 v4, 0x0

    .line 210
    move v9, v4

    .line 211
    .line 212
    move/from16 v16, v9

    .line 213
    goto :goto_2

    .line 214
    .line 215
    :cond_1
    move/from16 v18, v3

    .line 216
    .line 217
    move-object/from16 v19, v10

    .line 218
    .line 219
    move-object/from16 v20, v11

    .line 220
    .line 221
    move-object/from16 v21, v12

    .line 222
    .line 223
    move-object/from16 v22, v13

    .line 224
    .line 225
    move-object/from16 v23, v14

    .line 226
    .line 227
    move-object/from16 v24, v15

    .line 228
    .line 229
    .line 230
    :goto_3
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 231
    .line 232
    new-instance v17, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 233
    .line 234
    .line 235
    invoke-direct/range {v17 .. v24}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;)V

    .line 236
    return-object v17

    .line 237
    .line 238
    .line 239
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V0;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->g:[Lkotlin/Lazy;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 25
    .line 26
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    :goto_1
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 44
    .line 45
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 49
    :cond_3
    const/4 v2, 0x2

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 53
    move-result v3

    .line 54
    .line 55
    if-eqz v3, :cond_4

    .line 56
    goto :goto_2

    .line 57
    .line 58
    :cond_4
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->c:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 59
    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    :goto_2
    aget-object v3, v1, v2

    .line 63
    .line 64
    .line 65
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    check-cast v3, Ltg0/p;

    .line 69
    .line 70
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->c:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0, v2, v3, v4}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 74
    :cond_5
    const/4 v2, 0x3

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0, v2}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 78
    move-result v3

    .line 79
    .line 80
    if-eqz v3, :cond_6

    .line 81
    goto :goto_3

    .line 82
    .line 83
    :cond_6
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    .line 84
    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    :goto_3
    aget-object v1, v1, v2

    .line 88
    .line 89
    .line 90
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    check-cast v1, Ltg0/p;

    .line 94
    .line 95
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v0, v2, v1, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 99
    :cond_7
    const/4 v1, 0x4

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 103
    move-result v2

    .line 104
    .line 105
    if-eqz v2, :cond_8

    .line 106
    goto :goto_4

    .line 107
    .line 108
    :cond_8
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v2, :cond_9

    .line 111
    .line 112
    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 113
    .line 114
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 118
    :cond_9
    const/4 v1, 0x5

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 122
    move-result v2

    .line 123
    .line 124
    if-eqz v2, :cond_a

    .line 125
    goto :goto_5

    .line 126
    .line 127
    :cond_a
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    .line 128
    .line 129
    if-eqz v2, :cond_b

    .line 130
    .line 131
    :goto_5
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/s0;

    .line 132
    .line 133
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_b
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 140
    return-void
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
