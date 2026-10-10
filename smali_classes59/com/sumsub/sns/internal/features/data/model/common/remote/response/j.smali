.class public final synthetic Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.model.common.remote.response.AllowedTypesSettingsRemote"

    .line 12
    const/4 v3, 0x3

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "type"

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    const-string/jumbo v0, "validMonths"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 29
    .line 30
    const-string v0, "allowedSubTypes"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 34
    .line 35
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;->descriptor:Lvg0/f;

    .line 36
    return-void
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->d:[Lkotlin/Lazy;

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
    .line 10
    sget-object v2, Lkotlinx/serialization/internal/c0;->a:Lkotlinx/serialization/internal/c0;

    .line 11
    .line 12
    .line 13
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x2

    .line 16
    .line 17
    aget-object v0, v0, v3

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ltg0/d;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 27
    move-result-object v0

    .line 28
    const/4 v4, 0x3

    .line 29
    .line 30
    new-array v4, v4, [Ltg0/d;

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    aput-object v1, v4, v5

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    aput-object v2, v4, v1

    .line 37
    .line 38
    aput-object v0, v4, v3

    .line 39
    return-object v4
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
    .locals 12

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;->descriptor:Lvg0/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/b;->beginStructure(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->d:[Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0, v5, v2, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v5, Lkotlinx/serialization/internal/c0;->a:Lkotlinx/serialization/internal/c0;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0, v4, v5, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    check-cast v4, Ljava/lang/Double;

    .line 35
    .line 36
    aget-object v1, v1, v3

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ltg0/c;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0, v3, v1, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Ljava/util/List;

    .line 49
    const/4 v3, 0x7

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v9, v4

    .line 52
    move v2, v5

    .line 53
    move-object v7, v6

    .line 54
    move-object v8, v7

    .line 55
    .line 56
    :goto_0
    if-eqz v9, :cond_5

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 60
    move-result v10

    .line 61
    const/4 v11, -0x1

    .line 62
    .line 63
    if-eq v10, v11, :cond_4

    .line 64
    .line 65
    if-eqz v10, :cond_3

    .line 66
    .line 67
    if-eq v10, v4, :cond_2

    .line 68
    .line 69
    if-ne v10, v3, :cond_1

    .line 70
    .line 71
    aget-object v10, v1, v3

    .line 72
    .line 73
    .line 74
    invoke-interface {v10}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 75
    move-result-object v10

    .line 76
    .line 77
    check-cast v10, Ltg0/c;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v0, v3, v10, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    move-result-object v8

    .line 82
    .line 83
    check-cast v8, Ljava/util/List;

    .line 84
    .line 85
    or-int/lit8 v2, v2, 0x4

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 92
    throw p1

    .line 93
    .line 94
    :cond_2
    sget-object v10, Lkotlinx/serialization/internal/c0;->a:Lkotlinx/serialization/internal/c0;

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v0, v4, v10, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    move-result-object v7

    .line 99
    .line 100
    check-cast v7, Ljava/lang/Double;

    .line 101
    .line 102
    or-int/lit8 v2, v2, 0x2

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_3
    sget-object v10, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 106
    .line 107
    .line 108
    invoke-interface {p1, v0, v5, v10, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v6

    .line 110
    .line 111
    check-cast v6, Ljava/lang/String;

    .line 112
    .line 113
    or-int/lit8 v2, v2, 0x1

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    move v9, v5

    .line 116
    goto :goto_0

    .line 117
    :cond_5
    move v3, v2

    .line 118
    move-object v2, v6

    .line 119
    move-object v4, v7

    .line 120
    move-object v1, v8

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 124
    .line 125
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v3, v2, v4, v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;)V

    .line 129
    return-object p1
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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->d:[Lkotlin/Lazy;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    sget-object v3, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 25
    .line 26
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->a:Ljava/lang/String;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->b:Ljava/lang/Double;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    :goto_1
    sget-object v3, Lkotlinx/serialization/internal/c0;->a:Lkotlinx/serialization/internal/c0;

    .line 44
    .line 45
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->b:Ljava/lang/Double;

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
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->c:Ljava/util/List;

    .line 59
    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    :goto_2
    aget-object v1, v1, v2

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Ltg0/p;

    .line 69
    .line 70
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->c:Ljava/util/List;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0, v2, v1, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 77
    return-void
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
