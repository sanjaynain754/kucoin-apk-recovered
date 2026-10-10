.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Z;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;)Lcom/sumsub/sns/internal/features/data/model/common/Q2;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c0;

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c0;->a:Ljava/lang/Boolean;

    .line 10
    .line 11
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c0;->b:Ljava/lang/Boolean;

    .line 12
    .line 13
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c0;->c:Ljava/lang/Double;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c0;->d:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v6, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 23
    move-result v7

    .line 24
    .line 25
    .line 26
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v7

    .line 35
    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v7

    .line 41
    .line 42
    check-cast v7, Ljava/lang/String;

    .line 43
    .line 44
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v7}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 51
    move-result-object v7

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v6, v2

    .line 57
    .line 58
    :cond_1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/S2;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v3, v4, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/common/S2;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/util/ArrayList;)V

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v0, v2

    .line 64
    .line 65
    :goto_1
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;->b:Ljava/util/List;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 73
    move-result v1

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;

    .line 93
    .line 94
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/e;

    .line 95
    .line 96
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v6, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->b:Ljava/lang/Double;

    .line 99
    .line 100
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/l;->c:Ljava/util/List;

    .line 101
    .line 102
    .line 103
    invoke-direct {v4, v5, v6, v3}, Lcom/sumsub/sns/internal/features/data/model/common/e;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V;->c:Ljava/lang/Boolean;

    .line 110
    .line 111
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 112
    .line 113
    .line 114
    invoke-direct {v1, v0, v2, p0}, Lcom/sumsub/sns/internal/features/data/model/common/Q2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/S2;Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    .line 115
    return-object v1
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
