.class public final synthetic Lcom/sumsub/sns/internal/features/data/repository/navigation/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.repository.navigation.SdkStepDto"

    .line 12
    const/4 v3, 0x4

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "stepType"

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 23
    .line 24
    const-string v0, "idDocSetType"

    .line 25
    const/4 v2, 0x1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string/jumbo v0, "restriction"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 35
    .line 36
    const-string v0, "idDocSet"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 40
    .line 41
    sput-object v1, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->descriptor:Lvg0/f;

    .line 42
    return-void
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
    .locals 6

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
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    sget-object v3, Lcom/sumsub/sns/internal/features/data/repository/navigation/l;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/l;

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x4

    .line 20
    .line 21
    new-array v4, v4, [Ltg0/d;

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    aput-object v0, v4, v5

    .line 25
    const/4 v0, 0x1

    .line 26
    .line 27
    aput-object v1, v4, v0

    .line 28
    const/4 v0, 0x2

    .line 29
    .line 30
    aput-object v2, v4, v0

    .line 31
    const/4 v0, 0x3

    .line 32
    .line 33
    aput-object v3, v4, v0

    .line 34
    return-object v4
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
    .locals 18

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->descriptor:Lvg0/f;

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
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v0, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    sget-object v6, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v0, v5, v6, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, v0, v4, v6, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 40
    .line 41
    sget-object v6, Lcom/sumsub/sns/internal/features/data/repository/navigation/l;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/l;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v0, v3, v6, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/navigation/n;

    .line 48
    .line 49
    const/16 v6, 0xf

    .line 50
    move-object v14, v2

    .line 51
    .line 52
    move-object/from16 v17, v3

    .line 53
    .line 54
    move-object/from16 v16, v4

    .line 55
    move-object v15, v5

    .line 56
    move v13, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    move v11, v5

    .line 59
    move v2, v6

    .line 60
    move-object v8, v7

    .line 61
    move-object v9, v8

    .line 62
    move-object v10, v9

    .line 63
    .line 64
    :goto_0
    if-eqz v11, :cond_6

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 68
    move-result v12

    .line 69
    const/4 v13, -0x1

    .line 70
    .line 71
    if-eq v12, v13, :cond_5

    .line 72
    .line 73
    if-eqz v12, :cond_4

    .line 74
    .line 75
    if-eq v12, v5, :cond_3

    .line 76
    .line 77
    if-eq v12, v4, :cond_2

    .line 78
    .line 79
    if-ne v12, v3, :cond_1

    .line 80
    .line 81
    sget-object v12, Lcom/sumsub/sns/internal/features/data/repository/navigation/l;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/l;

    .line 82
    .line 83
    .line 84
    invoke-interface {v1, v0, v3, v12, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object v10

    .line 86
    .line 87
    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/navigation/n;

    .line 88
    .line 89
    or-int/lit8 v2, v2, 0x8

    .line 90
    goto :goto_0

    .line 91
    .line 92
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0, v12}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 96
    throw v0

    .line 97
    .line 98
    :cond_2
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;

    .line 99
    .line 100
    .line 101
    invoke-interface {v1, v0, v4, v12, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object v9

    .line 103
    .line 104
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 105
    .line 106
    or-int/lit8 v2, v2, 0x4

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_3
    sget-object v12, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v0, v5, v12, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object v8

    .line 114
    .line 115
    check-cast v8, Ljava/lang/String;

    .line 116
    .line 117
    or-int/lit8 v2, v2, 0x2

    .line 118
    goto :goto_0

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-interface {v1, v0, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 122
    move-result-object v7

    .line 123
    .line 124
    or-int/lit8 v2, v2, 0x1

    .line 125
    goto :goto_0

    .line 126
    :cond_5
    move v11, v6

    .line 127
    goto :goto_0

    .line 128
    :cond_6
    move v13, v2

    .line 129
    move-object v14, v7

    .line 130
    move-object v15, v8

    .line 131
    .line 132
    move-object/from16 v16, v9

    .line 133
    .line 134
    move-object/from16 v17, v10

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 138
    .line 139
    new-instance v12, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v12 .. v17}, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;Lcom/sumsub/sns/internal/features/data/repository/navigation/n;)V

    .line 143
    return-object v12
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->a:Ljava/lang/String;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0, v2, v1}, Lwg0/b;->encodeStringElement(Lvg0/f;ILjava/lang/String;)V

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->b:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 29
    .line 30
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->b:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 34
    :cond_1
    const/4 v1, 0x2

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 38
    move-result v2

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    :goto_1
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l0;

    .line 48
    .line 49
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 53
    :cond_3
    const/4 v1, 0x3

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :cond_4
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->d:Lcom/sumsub/sns/internal/features/data/repository/navigation/n;

    .line 63
    .line 64
    if-eqz v2, :cond_5

    .line 65
    .line 66
    :goto_2
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/l;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/l;

    .line 67
    .line 68
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;->d:Lcom/sumsub/sns/internal/features/data/repository/navigation/n;

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 75
    return-void
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
