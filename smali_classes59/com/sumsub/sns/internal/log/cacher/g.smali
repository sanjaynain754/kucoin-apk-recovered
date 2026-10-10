.class public final Lcom/sumsub/sns/internal/log/cacher/g;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:[Ljava/io/File;

.field public e:Lcom/sumsub/sns/internal/log/cacher/l;

.field public f:I

.field public final synthetic g:Lcom/sumsub/sns/internal/log/cacher/l;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/log/cacher/g;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/log/cacher/g;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/log/cacher/g;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/log/cacher/g;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/log/cacher/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->f:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->c:I

    .line 14
    .line 15
    iget v3, p0, Lcom/sumsub/sns/internal/log/cacher/g;->b:I

    .line 16
    .line 17
    iget v4, p0, Lcom/sumsub/sns/internal/log/cacher/g;->a:I

    .line 18
    .line 19
    iget-object v5, p0, Lcom/sumsub/sns/internal/log/cacher/g;->e:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 20
    .line 21
    iget-object v6, p0, Lcom/sumsub/sns/internal/log/cacher/g;->d:[Ljava/io/File;

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    const/4 v4, 0x0

    .line 43
    .line 44
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 45
    .line 46
    iget-object v1, p1, Lcom/sumsub/sns/internal/log/cacher/l;->a:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v3, Ljava/io/File;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/cacher/l;->f:Ljava/io/File;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 60
    move-result p1

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 65
    .line 66
    iget-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 67
    .line 68
    iget-object v6, p1, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    const-string v1, "Cache directory "

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string p1, " is not a directory"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    move-result-object v7

    .line 95
    const/4 v9, 0x4

    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    .line 99
    .line 100
    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 101
    .line 102
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 103
    return-object p1

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    if-eqz p1, :cond_3

    .line 110
    array-length v1, p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    move v1, v4

    .line 113
    .line 114
    :goto_0
    if-lez v1, :cond_4

    .line 115
    .line 116
    :try_start_2
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 119
    .line 120
    iget-object v6, v3, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    const-string v7, "Processing cache ("

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v7, " files) ... "

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    move-result-object v7

    .line 143
    const/4 v9, 0x4

    .line 144
    const/4 v10, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    .line 147
    .line 148
    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 149
    goto :goto_1

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    move-object p1, v0

    .line 152
    move v4, v1

    .line 153
    goto :goto_4

    .line 154
    .line 155
    :cond_4
    :goto_1
    if-eqz p1, :cond_7

    .line 156
    .line 157
    iget-object v3, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 158
    array-length v5, p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 159
    move v6, v4

    .line 160
    move v4, v1

    .line 161
    move v1, v5

    .line 162
    move-object v5, v3

    .line 163
    move v3, v6

    .line 164
    move-object v6, p1

    .line 165
    .line 166
    :goto_2
    if-ge v3, v1, :cond_6

    .line 167
    .line 168
    :try_start_3
    aget-object p1, v6, v3

    .line 169
    .line 170
    iput-object v6, p0, Lcom/sumsub/sns/internal/log/cacher/g;->d:[Ljava/io/File;

    .line 171
    .line 172
    iput-object v5, p0, Lcom/sumsub/sns/internal/log/cacher/g;->e:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 173
    .line 174
    iput v4, p0, Lcom/sumsub/sns/internal/log/cacher/g;->a:I

    .line 175
    .line 176
    iput v3, p0, Lcom/sumsub/sns/internal/log/cacher/g;->b:I

    .line 177
    .line 178
    iput v1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->c:I

    .line 179
    .line 180
    iput v2, p0, Lcom/sumsub/sns/internal/log/cacher/g;->f:I

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, p1, p0}, Lcom/sumsub/sns/internal/log/cacher/l;->a(Ljava/io/File;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 184
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    .line 186
    if-ne p1, v0, :cond_5

    .line 187
    return-object v0

    .line 188
    :cond_5
    :goto_3
    add-int/2addr v3, v2

    .line 189
    goto :goto_2

    .line 190
    :cond_6
    move v1, v4

    .line 191
    .line 192
    :cond_7
    if-lez v1, :cond_8

    .line 193
    .line 194
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 195
    .line 196
    iget-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 197
    .line 198
    iget-object v3, p1, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 199
    const/4 v6, 0x4

    .line 200
    const/4 v7, 0x0

    .line 201
    .line 202
    const-string v4, "Done processing cache"

    .line 203
    const/4 v5, 0x0

    .line 204
    .line 205
    .line 206
    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 207
    .line 208
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 209
    return-object p1

    .line 210
    .line 211
    :goto_4
    if-lez v4, :cond_9

    .line 212
    .line 213
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 214
    .line 215
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/cacher/g;->g:Lcom/sumsub/sns/internal/log/cacher/l;

    .line 216
    .line 217
    iget-object v6, v0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 218
    const/4 v9, 0x4

    .line 219
    const/4 v10, 0x0

    .line 220
    .line 221
    const-string v7, "Done processing cache"

    .line 222
    const/4 v8, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 226
    :cond_9
    throw p1
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
