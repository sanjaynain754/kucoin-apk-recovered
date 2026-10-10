.class public final Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

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
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 10
    return-object v0
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
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->b:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v4, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1

    .line 32
    .line 33
    :cond_1
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->a:I

    .line 34
    .line 35
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lkotlinx/coroutines/flow/f;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    goto :goto_2

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 60
    .line 61
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    move-object v1, v5

    .line 88
    .line 89
    :goto_0
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 90
    .line 91
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 92
    const/4 v7, 0x0

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    .line 97
    const-string/jumbo v8, "rotation"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 101
    move-result v6

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move v6, v7

    .line 104
    .line 105
    :goto_1
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 106
    .line 107
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 108
    .line 109
    if-nez v8, :cond_6

    .line 110
    .line 111
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;

    .line 112
    .line 113
    .line 114
    invoke-direct {v1, v5, v5, v7}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;I)V

    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_6
    const-string v7, "application/pdf"

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    move-result v1

    .line 123
    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 127
    .line 128
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 129
    .line 130
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 131
    .line 132
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->b:I

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 136
    move-result-object v3

    .line 137
    .line 138
    new-instance v4, Lcom/sumsub/sns/internal/core/common/z0;

    .line 139
    .line 140
    .line 141
    invoke-direct {v4, v1, v5}, Lcom/sumsub/sns/internal/core/common/z0;-><init>(Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    if-ne v1, v0, :cond_7

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    move-object v9, v1

    .line 150
    move-object v1, p1

    .line 151
    move-object p1, v9

    .line 152
    .line 153
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 157
    move-result p1

    .line 158
    .line 159
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 160
    .line 161
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 162
    .line 163
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;

    .line 164
    .line 165
    .line 166
    invoke-direct {v4, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;-><init>(ILjava/io/File;)V

    .line 167
    move-object p1, v1

    .line 168
    move-object v1, v4

    .line 169
    goto :goto_4

    .line 170
    .line 171
    :cond_8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 172
    .line 173
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 174
    .line 175
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 176
    .line 177
    iput v6, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->a:I

    .line 178
    .line 179
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->b:I

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 183
    move-result-object v3

    .line 184
    .line 185
    new-instance v4, Lcom/sumsub/sns/internal/core/common/y0;

    .line 186
    .line 187
    const/16 v7, 0x780

    .line 188
    .line 189
    .line 190
    invoke-direct {v4, v1, v7, v5}, Lcom/sumsub/sns/internal/core/common/y0;-><init>(Ljava/io/File;ILkotlin/coroutines/Continuation;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    if-ne v1, v0, :cond_9

    .line 197
    goto :goto_5

    .line 198
    :cond_9
    move-object v3, p1

    .line 199
    move-object p1, v1

    .line 200
    move v1, v6

    .line 201
    .line 202
    :goto_3
    check-cast p1, Landroid/graphics/Bitmap;

    .line 203
    .line 204
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->d:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 205
    .line 206
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 207
    .line 208
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;

    .line 209
    .line 210
    .line 211
    invoke-direct {v6, p1, v4, v1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;I)V

    .line 212
    move-object p1, v3

    .line 213
    move-object v1, v6

    .line 214
    .line 215
    :goto_4
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->c:Ljava/lang/Object;

    .line 216
    .line 217
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/j;->b:I

    .line 218
    .line 219
    .line 220
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 221
    move-result-object p1

    .line 222
    .line 223
    if-ne p1, v0, :cond_a

    .line 224
    :goto_5
    return-object v0

    .line 225
    .line 226
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 227
    return-object p1
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
