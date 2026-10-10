.class public abstract Lcom/sumsub/sns/internal/features/presentation/utils/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/C;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/A;

    .line 5
    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/A;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/A;->d:Ljava/util/List;

    .line 11
    .line 12
    new-instance v11, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/z;

    .line 38
    .line 39
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    .line 40
    .line 41
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/data/model/common/z;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/z;->b:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v4, v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/A;->b:Ljava/lang/String;

    .line 55
    const/4 v10, 0x0

    .line 56
    .line 57
    const/16 v12, 0x2fc

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    .line 64
    move-object/from16 v3, p1

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v2 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 68
    .line 69
    iget v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/A;->c:I

    .line 70
    .line 71
    .line 72
    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->a:Ljava/lang/String;

    .line 80
    :goto_1
    move-object v15, v0

    .line 81
    goto :goto_2

    .line 82
    :cond_1
    const/4 v0, 0x0

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :goto_2
    new-instance v12, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 86
    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x38

    .line 90
    .line 91
    const-string v14, "appdata"

    .line 92
    .line 93
    const/16 v16, 0x0

    .line 94
    move-object v13, v2

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v12 .. v18}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    .line 98
    return-object v12

    .line 99
    .line 100
    :cond_2
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/B;

    .line 101
    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/B;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/B;->b:Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/model/w;

    .line 113
    .line 114
    const-string v2, "appdata"

    .line 115
    .line 116
    .line 117
    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-object v1

    .line 119
    .line 120
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 121
    .line 122
    .line 123
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 124
    throw v0
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
