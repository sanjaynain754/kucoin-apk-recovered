.class public final Lcom/sumsub/sns/internal/features/domain/appdata/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/socket/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/appdata/f;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/appdata/f;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/appdata/f;->c:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string p2, "GetApplUptStat_"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method


# virtual methods
.method public final a(ZLcom/sumsub/sns/internal/features/data/repository/applicant/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p3

    .line 5
    .line 6
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/domain/appdata/d;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v0

    .line 10
    .line 11
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;

    .line 12
    .line 13
    iget v3, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/features/domain/appdata/d;-><init>(Lcom/sumsub/sns/internal/features/domain/appdata/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 29
    .line 30
    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->e:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 37
    const/4 v5, 0x5

    .line 38
    const/4 v6, 0x4

    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    .line 43
    const-string v10, "GetApplicantDataAndUpdateStatusIfNeededUseCase"

    .line 44
    const/4 v11, 0x0

    .line 45
    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    if-eq v4, v9, :cond_5

    .line 49
    .line 50
    if-eq v4, v8, :cond_4

    .line 51
    .line 52
    if-eq v4, v7, :cond_3

    .line 53
    .line 54
    if-eq v4, v6, :cond_2

    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 61
    .line 62
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Ljava/util/List;

    .line 65
    .line 66
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    goto/16 :goto_a

    .line 74
    :catch_0
    move-exception v0

    .line 75
    .line 76
    goto/16 :goto_b

    .line 77
    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    throw v0

    .line 85
    .line 86
    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ljava/util/List;

    .line 89
    .line 90
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 93
    .line 94
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 97
    .line 98
    .line 99
    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    move-object v5, v4

    .line 101
    move-object v4, v6

    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_3
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 106
    .line 107
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v7, Ljava/util/List;

    .line 110
    .line 111
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 114
    .line 115
    iget-object v9, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 118
    .line 119
    .line 120
    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 121
    .line 122
    goto/16 :goto_4

    .line 123
    .line 124
    :cond_4
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 125
    .line 126
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v8, Ljava/util/List;

    .line 129
    .line 130
    iget-object v12, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 133
    .line 134
    iget-object v13, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v13, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 137
    .line 138
    .line 139
    :try_start_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 140
    .line 141
    move-object/from16 v21, v12

    .line 142
    move-object v12, v8

    .line 143
    .line 144
    move-object/from16 v8, v21

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_5
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 151
    .line 152
    .line 153
    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 154
    goto :goto_1

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 158
    .line 159
    :try_start_5
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 160
    .line 161
    move-object/from16 v4, p2

    .line 162
    .line 163
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 164
    .line 165
    iput v9, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 166
    .line 167
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 168
    .line 169
    move/from16 v12, p1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v12, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    if-ne v0, v3, :cond_7

    .line 176
    .line 177
    goto/16 :goto_8

    .line 178
    .line 179
    :cond_7
    :goto_1
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 183
    move-result-object v12

    .line 184
    .line 185
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 189
    move-result-object v13

    .line 190
    .line 191
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/common/j3;->d:Lcom/sumsub/sns/internal/features/data/model/common/B3;

    .line 192
    .line 193
    if-eqz v13, :cond_8

    .line 194
    .line 195
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/common/B3;->a:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 196
    goto :goto_2

    .line 197
    :cond_8
    move-object v13, v11

    .line 198
    .line 199
    :goto_2
    iget-object v14, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    move-result-object v15

    .line 204
    .line 205
    new-instance v5, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v14, ": running with applicant="

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    move-result-object v5

    .line 224
    .line 225
    sget-object v14, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 226
    .line 227
    iget-object v14, v14, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v14, v10, v5, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 233
    .line 234
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v12, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v13, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 241
    .line 242
    iput v8, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 243
    .line 244
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->e:Ljava/util/Locale;

    .line 250
    .line 251
    if-ne v5, v3, :cond_9

    .line 252
    .line 253
    goto/16 :goto_8

    .line 254
    :cond_9
    move-object v8, v13

    .line 255
    move-object v13, v4

    .line 256
    move-object v4, v8

    .line 257
    move-object v8, v0

    .line 258
    move-object v0, v5

    .line 259
    .line 260
    :goto_3
    check-cast v0, Ljava/util/Locale;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 264
    move-result-object v0

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/p;->g()Ljava/lang/String;

    .line 268
    move-result-object v5

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v5, v9}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 272
    move-result v5

    .line 273
    .line 274
    if-nez v5, :cond_b

    .line 275
    .line 276
    iput-object v13, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v8, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v12, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 283
    .line 284
    iput v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 285
    move-object v9, v13

    .line 286
    .line 287
    check-cast v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    if-ne v0, v3, :cond_a

    .line 294
    .line 295
    goto/16 :goto_8

    .line 296
    :cond_a
    move-object v7, v12

    .line 297
    :goto_4
    move-object v12, v7

    .line 298
    move-object v13, v9

    .line 299
    .line 300
    :cond_b
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/O;

    .line 301
    .line 302
    .line 303
    invoke-direct {v0, v8}, Lcom/sumsub/sns/internal/features/data/model/common/O;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v12, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 307
    move-result-object v0

    .line 308
    .line 309
    .line 310
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 311
    move-result-object v5

    .line 312
    .line 313
    iget-boolean v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 317
    move-result-object v7

    .line 318
    .line 319
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 320
    .line 321
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Init:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 322
    .line 323
    if-ne v7, v9, :cond_14

    .line 324
    .line 325
    if-nez v5, :cond_14

    .line 326
    .line 327
    if-eqz v0, :cond_c

    .line 328
    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 331
    move-result v5

    .line 332
    .line 333
    if-eqz v5, :cond_c

    .line 334
    goto :goto_5

    .line 335
    .line 336
    .line 337
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    move-result-object v5

    .line 339
    .line 340
    .line 341
    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    move-result v7

    .line 343
    .line 344
    if-eqz v7, :cond_e

    .line 345
    .line 346
    .line 347
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    move-result-object v7

    .line 349
    .line 350
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    .line 354
    move-result v7

    .line 355
    .line 356
    if-nez v7, :cond_d

    .line 357
    .line 358
    goto/16 :goto_9

    .line 359
    .line 360
    :cond_e
    :goto_5
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 361
    .line 362
    new-instance v7, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v5, ": setting to \'pending\'"

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    move-result-object v5

    .line 378
    .line 379
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 380
    .line 381
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v10, v5, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->c:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

    .line 387
    .line 388
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 389
    .line 390
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/appdata/e;

    .line 391
    .line 392
    .line 393
    invoke-direct {v9, v13, v11}, Lcom/sumsub/sns/internal/features/domain/appdata/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lkotlin/coroutines/Continuation;)V

    .line 394
    .line 395
    iput-object v8, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v11, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 402
    .line 403
    iput v6, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 404
    .line 405
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/socket/p;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5, v7, v9, v2}, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/appdata/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 409
    move-result-object v5

    .line 410
    .line 411
    if-ne v5, v3, :cond_f

    .line 412
    goto :goto_8

    .line 413
    :cond_f
    move-object v7, v5

    .line 414
    move-object v5, v0

    .line 415
    move-object v0, v7

    .line 416
    move-object v7, v8

    .line 417
    .line 418
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 422
    move-result v0

    .line 423
    .line 424
    if-eqz v0, :cond_13

    .line 425
    .line 426
    .line 427
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 428
    move-result-object v0

    .line 429
    .line 430
    sget-object v14, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Pending:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 431
    .line 432
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->a:Ljava/lang/Integer;

    .line 433
    .line 434
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->c:Ljava/lang/Integer;

    .line 435
    .line 436
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->d:Ljava/lang/String;

    .line 437
    .line 438
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 439
    .line 440
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->f:Ljava/lang/Long;

    .line 441
    .line 442
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->g:Ljava/lang/Long;

    .line 443
    .line 444
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->h:Ljava/lang/String;

    .line 445
    .line 446
    move-object/from16 v19, v12

    .line 447
    .line 448
    new-instance v12, Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 449
    .line 450
    move-object/from16 v20, v0

    .line 451
    .line 452
    move-object/from16 v16, v6

    .line 453
    .line 454
    move-object/from16 v17, v8

    .line 455
    .line 456
    move-object/from16 v18, v9

    .line 457
    .line 458
    .line 459
    invoke-direct/range {v12 .. v20}, Lcom/sumsub/sns/internal/features/data/model/common/o;-><init>(Ljava/lang/Integer;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/n3;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V

    .line 460
    .line 461
    instance-of v0, v7, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 462
    .line 463
    if-eqz v0, :cond_10

    .line 464
    .line 465
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 466
    .line 467
    const/16 v0, 0x1fdf

    .line 468
    .line 469
    .line 470
    invoke-static {v7, v11, v12, v0}, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a(Lcom/sumsub/sns/internal/features/data/model/common/t3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 471
    move-result-object v0

    .line 472
    goto :goto_7

    .line 473
    .line 474
    :cond_10
    instance-of v0, v7, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 475
    .line 476
    if-eqz v0, :cond_12

    .line 477
    .line 478
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 479
    .line 480
    const/16 v0, 0x7fdf

    .line 481
    .line 482
    .line 483
    invoke-static {v7, v11, v12, v0}, Lcom/sumsub/sns/internal/features/data/model/common/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/a;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 484
    move-result-object v0

    .line 485
    .line 486
    :goto_7
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 487
    .line 488
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->a:Ljava/lang/Object;

    .line 489
    .line 490
    iput-object v5, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->b:Ljava/lang/Object;

    .line 491
    .line 492
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->c:Ljava/lang/Object;

    .line 493
    const/4 v7, 0x5

    .line 494
    .line 495
    iput v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/d;->g:I

    .line 496
    .line 497
    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 498
    .line 499
    iget-object v2, v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c()V

    .line 506
    .line 507
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 508
    .line 509
    if-ne v2, v3, :cond_11

    .line 510
    :goto_8
    return-object v3

    .line 511
    :cond_11
    move-object v3, v0

    .line 512
    move-object v2, v4

    .line 513
    move-object v4, v5

    .line 514
    goto :goto_a

    .line 515
    .line 516
    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 517
    .line 518
    .line 519
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 520
    throw v0

    .line 521
    :cond_13
    move-object v2, v4

    .line 522
    move-object v4, v5

    .line 523
    move-object v3, v7

    .line 524
    goto :goto_a

    .line 525
    :cond_14
    :goto_9
    move-object v2, v4

    .line 526
    move-object v3, v8

    .line 527
    move-object v4, v0

    .line 528
    .line 529
    .line 530
    :goto_a
    invoke-static {v3, v4, v2}, Lcom/sumsub/sns/internal/features/data/model/common/H;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Lcom/sumsub/sns/core/data/model/SNSSDKState;

    .line 531
    move-result-object v0

    .line 532
    .line 533
    if-eqz v0, :cond_15

    .line 534
    .line 535
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 536
    .line 537
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 541
    .line 542
    :cond_15
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 543
    .line 544
    new-instance v5, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    const-string v0, ": finished"

    .line 553
    .line 554
    .line 555
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    move-result-object v0

    .line 560
    .line 561
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 562
    .line 563
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v5, v10, v0, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 567
    .line 568
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 569
    .line 570
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/appdata/c;

    .line 571
    .line 572
    .line 573
    invoke-direct {v0, v3, v4, v2}, Lcom/sumsub/sns/internal/features/domain/appdata/c;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)V

    .line 574
    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 578
    return-object v0

    .line 579
    .line 580
    :goto_b
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->d:Ljava/lang/String;

    .line 581
    .line 582
    new-instance v3, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    const-string v2, ": finished with error"

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    move-result-object v2

    .line 598
    .line 599
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 600
    .line 601
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v3, v10, v2, v0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 605
    .line 606
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 607
    .line 608
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/appdata/f;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 609
    .line 610
    .line 611
    invoke-static {v2, v0}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    .line 612
    move-result-object v0

    .line 613
    .line 614
    .line 615
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 616
    move-result-object v0

    .line 617
    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    move-result-object v0

    .line 621
    return-object v0
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method
