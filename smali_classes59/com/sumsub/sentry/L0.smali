.class public final synthetic Lcom/sumsub/sentry/L0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sentry/L0;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/L0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/L0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/L0;->a:Lcom/sumsub/sentry/L0;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sentry.SentryStackTrace"

    .line 12
    const/4 v3, 0x3

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "frames"

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "registers"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "snapshot"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 34
    .line 35
    sput-object v1, Lcom/sumsub/sentry/L0;->descriptor:Lvg0/f;

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
    sget-object v0, Lcom/sumsub/sentry/N0;->d:[Lkotlin/Lazy;

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
    sget-object v4, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    new-array v5, v5, [Ltg0/d;

    .line 38
    .line 39
    aput-object v2, v5, v1

    .line 40
    .line 41
    aput-object v0, v5, v3

    .line 42
    const/4 v0, 0x2

    .line 43
    .line 44
    aput-object v4, v5, v0

    .line 45
    return-object v5
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
    sget-object v0, Lcom/sumsub/sentry/L0;->descriptor:Lvg0/f;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/b;->beginStructure(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sentry/N0;->d:[Lkotlin/Lazy;

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
    aget-object v2, v1, v5

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Ltg0/c;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, v5, v2, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    check-cast v2, Ljava/util/List;

    .line 33
    .line 34
    aget-object v1, v1, v4

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    check-cast v1, Ltg0/c;

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0, v4, v1, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    check-cast v1, Ljava/util/Map;

    .line 47
    .line 48
    sget-object v4, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0, v3, v4, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    check-cast v3, Ljava/lang/Boolean;

    .line 55
    const/4 v4, 0x7

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move v9, v4

    .line 58
    move v2, v5

    .line 59
    move-object v7, v6

    .line 60
    move-object v8, v7

    .line 61
    .line 62
    :goto_0
    if-eqz v9, :cond_5

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 66
    move-result v10

    .line 67
    const/4 v11, -0x1

    .line 68
    .line 69
    if-eq v10, v11, :cond_4

    .line 70
    .line 71
    if-eqz v10, :cond_3

    .line 72
    .line 73
    if-eq v10, v4, :cond_2

    .line 74
    .line 75
    if-ne v10, v3, :cond_1

    .line 76
    .line 77
    sget-object v10, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v0, v3, v10, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    move-result-object v8

    .line 82
    .line 83
    check-cast v8, Ljava/lang/Boolean;

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
    aget-object v10, v1, v4

    .line 95
    .line 96
    .line 97
    invoke-interface {v10}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 98
    move-result-object v10

    .line 99
    .line 100
    check-cast v10, Ltg0/c;

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v0, v4, v10, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    move-result-object v7

    .line 105
    .line 106
    check-cast v7, Ljava/util/Map;

    .line 107
    .line 108
    or-int/lit8 v2, v2, 0x2

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_3
    aget-object v10, v1, v5

    .line 112
    .line 113
    .line 114
    invoke-interface {v10}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 115
    move-result-object v10

    .line 116
    .line 117
    check-cast v10, Ltg0/c;

    .line 118
    .line 119
    .line 120
    invoke-interface {p1, v0, v5, v10, v6}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object v6

    .line 122
    .line 123
    check-cast v6, Ljava/util/List;

    .line 124
    .line 125
    or-int/lit8 v2, v2, 0x1

    .line 126
    goto :goto_0

    .line 127
    :cond_4
    move v9, v5

    .line 128
    goto :goto_0

    .line 129
    :cond_5
    move v4, v2

    .line 130
    move-object v2, v6

    .line 131
    move-object v1, v7

    .line 132
    move-object v3, v8

    .line 133
    .line 134
    .line 135
    :goto_1
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 136
    .line 137
    new-instance p1, Lcom/sumsub/sentry/N0;

    .line 138
    .line 139
    .line 140
    invoke-direct {p1, v4, v2, v1, v3}, Lcom/sumsub/sentry/N0;-><init>(ILjava/util/List;Ljava/util/Map;Ljava/lang/Boolean;)V

    .line 141
    return-object p1
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
    sget-object v0, Lcom/sumsub/sentry/L0;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sentry/N0;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sentry/L0;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sentry/N0;->d:[Lkotlin/Lazy;

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
    iget-object v3, p2, Lcom/sumsub/sentry/N0;->a:Ljava/util/List;

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
    iget-object v4, p2, Lcom/sumsub/sentry/N0;->a:Ljava/util/List;

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
    iget-object v3, p2, Lcom/sumsub/sentry/N0;->b:Ljava/util/Map;

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
    iget-object v3, p2, Lcom/sumsub/sentry/N0;->b:Ljava/util/Map;

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
    iget-object v2, p2, Lcom/sumsub/sentry/N0;->c:Ljava/lang/Boolean;

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/i;->a:Lkotlinx/serialization/internal/i;

    .line 75
    .line 76
    iget-object p2, p2, Lcom/sumsub/sentry/N0;->c:Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 83
    return-void
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
