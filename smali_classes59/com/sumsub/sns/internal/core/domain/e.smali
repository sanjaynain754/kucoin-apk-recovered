.class public final Lcom/sumsub/sns/internal/core/domain/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/S0;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/core/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/e;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/e;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 11
    .line 12
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->i:Lkotlinx/coroutines/flow/n;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_d

    .line 24
    .line 25
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 32
    .line 33
    if-eqz v0, :cond_d

    .line 34
    .line 35
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const-string v2, "errorCodes"

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v1

    .line 46
    .line 47
    :goto_0
    instance-of v2, v0, Ljava/util/Map;

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    check-cast v0, Ljava/util/Map;

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v0, v1

    .line 54
    .line 55
    :goto_1
    if-eqz v0, :cond_3

    .line 56
    .line 57
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    move-result v3

    .line 73
    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    check-cast v3, Ljava/util/Map$Entry;

    .line 81
    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    instance-of v4, v4, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 92
    move-result-object v4

    .line 93
    .line 94
    instance-of v4, v4, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 100
    move-result-object v4

    .line 101
    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move-object v2, v1

    .line 110
    .line 111
    :cond_4
    if-eqz v2, :cond_5

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 115
    move-result v0

    .line 116
    const/4 v3, 0x1

    .line 117
    xor-int/2addr v0, v3

    .line 118
    .line 119
    if-ne v0, v3, :cond_5

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move-object v2, v1

    .line 122
    .line 123
    :goto_3
    if-eqz v2, :cond_c

    .line 124
    .line 125
    new-instance v0, Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    :cond_6
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    move-result v3

    .line 141
    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    check-cast v3, Ljava/util/Map$Entry;

    .line 149
    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    move-result-object v4

    .line 153
    .line 154
    instance-of v5, v4, Ljava/lang/String;

    .line 155
    .line 156
    if-nez v5, :cond_7

    .line 157
    move-object v4, v1

    .line 158
    .line 159
    :cond_7
    check-cast v4, Ljava/lang/String;

    .line 160
    .line 161
    if-nez v4, :cond_8

    .line 162
    goto :goto_5

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 166
    move-result-object v3

    .line 167
    .line 168
    instance-of v5, v3, Ljava/lang/String;

    .line 169
    .line 170
    if-nez v5, :cond_9

    .line 171
    move-object v3, v1

    .line 172
    .line 173
    :cond_9
    check-cast v3, Ljava/lang/String;

    .line 174
    .line 175
    if-nez v3, :cond_a

    .line 176
    :goto_5
    move-object v3, v1

    .line 177
    goto :goto_6

    .line 178
    .line 179
    .line 180
    :cond_a
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 181
    move-result-object v3

    .line 182
    .line 183
    :goto_6
    if-eqz v3, :cond_6

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    goto :goto_4

    .line 188
    .line 189
    .line 190
    :cond_b
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 191
    move-result-object v0

    .line 192
    goto :goto_7

    .line 193
    :cond_c
    move-object v0, v1

    .line 194
    .line 195
    :goto_7
    if-eqz v0, :cond_d

    .line 196
    .line 197
    .line 198
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    check-cast p1, Ljava/lang/String;

    .line 202
    return-object p1

    .line 203
    :cond_d
    return-object v1
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
