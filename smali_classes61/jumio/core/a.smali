.class public final Ljumio/core/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/network/EncryptionProvider;


# instance fields
.field public final a:Lcom/jumio/ale/swig/ALECore;

.field public final b:Ljava/lang/String;

.field public c:Lcom/jumio/ale/swig/ALERequest;


# direct methods
.method public constructor <init>(Lcom/jumio/ale/swig/ALECore;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/jumio/ale/swig/ALECore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "mAleCore"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "mCredentials"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Ljumio/core/a;->a:Lcom/jumio/ale/swig/ALECore;

    .line 16
    .line 17
    iput-object p2, p0, Ljumio/core/a;->b:Ljava/lang/String;

    .line 18
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static a(Lcom/jumio/ale/swig/ALEInputStream;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/io/StringWriter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 6
    .line 7
    const/16 v1, 0x400

    .line 8
    .line 9
    new-array v1, v1, [C

    .line 10
    .line 11
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    .line 12
    .line 13
    new-instance v3, Ljava/io/InputStreamReader;

    .line 14
    .line 15
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, p0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {v2, v1}, Ljava/io/Reader;->read([C)I

    .line 25
    move-result v3

    .line 26
    const/4 v4, -0x1

    .line 27
    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v4, v3}, Ljava/io/Writer;->write([CII)V

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :catchall_1
    move-exception v1

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    throw v1
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
.end method


# virtual methods
.method public createRequest(Ljava/io/OutputStream;ILjava/lang/String;)Ljava/io/OutputStream;
    .locals 2
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "outputStream"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "contentType"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Ljumio/core/a;->a:Lcom/jumio/ale/swig/ALECore;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/jumio/ale/swig/ALECore;->createRequest()Lcom/jumio/ale/swig/ALERequest;

    .line 16
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    .line 21
    iput-object v0, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 22
    .line 23
    const-string v0, "Network/ALE"

    .line 24
    .line 25
    const-string v1, "encrypting plaintext"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    new-instance v0, Lcom/jumio/ale/swig/ALEHeader;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/jumio/ale/swig/ALEHeader;-><init>()V

    .line 34
    .line 35
    const-string v1, "Content-Type"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p3}, Lcom/jumio/ale/swig/ALEHeader;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    iget-object p3, p0, Ljumio/core/a;->b:Ljava/lang/String;

    .line 41
    .line 42
    const-string v1, "Authorization"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, p3}, Lcom/jumio/ale/swig/ALEHeader;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    new-instance p3, Lcom/jumio/ale/swig/ALEOutputStream;

    .line 48
    .line 49
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 53
    .line 54
    iget-object p1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 55
    .line 56
    if-nez p1, :cond_0

    .line 57
    .line 58
    const-string p1, "aleRequest"

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 62
    const/4 p1, 0x0

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-direct {p3, v1, p1, v0, p2}, Lcom/jumio/ale/swig/ALEOutputStream;-><init>(Ljava/io/OutputStream;Lcom/jumio/ale/swig/ALERequest;Lcom/jumio/ale/swig/ALEHeader;I)V

    .line 66
    return-object p3

    .line 67
    :catch_0
    move-exception p1

    .line 68
    .line 69
    new-instance p2, Ljava/lang/Exception;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 77
    throw p2
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
.end method

.method public finishRequest()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/a;->a:Lcom/jumio/ale/swig/ALECore;

    .line 3
    .line 4
    iget-object v1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "aleRequest"

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Lcom/jumio/ale/swig/ALECore;->destroyRequest(Lcom/jumio/ale/swig/ALERequest;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getResponse(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6
    .param p1    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljumio/core/b;,
            Ljumio/core/T3;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Response returned "

    .line 3
    .line 4
    const-string v1, "decrypting response stream"

    .line 5
    .line 6
    const-string v2, "Network/ALE"

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v1, Lcom/jumio/ale/swig/ALEInputStream;

    .line 12
    .line 13
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 17
    .line 18
    iget-object p1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 19
    const/4 v4, 0x0

    .line 20
    .line 21
    const-string v5, "aleRequest"

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    move-object p1, v4

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-direct {v1, v3, p1}, Lcom/jumio/ale/swig/ALEInputStream;-><init>(Ljava/io/InputStream;Lcom/jumio/ale/swig/ALERequest;)V

    .line 31
    .line 32
    iget-object p1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    move-object p1, v4

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Lcom/jumio/ale/swig/ALERequest;->isVerified()Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    .line 47
    const-string/jumbo p1, "valid"

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    const-string p1, "invalid"

    .line 51
    .line 52
    :goto_0
    const-string v3, "Response: "

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {v2, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    new-instance p1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "Error code: "

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    iget-object v3, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 69
    .line 70
    if-nez v3, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 74
    move-object v3, v4

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {v3}, Lcom/jumio/ale/swig/ALERequest;->getErrorCode()I

    .line 78
    move-result v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-static {v2, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    iget-object p1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    .line 95
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 96
    move-object p1, v4

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {p1}, Lcom/jumio/ale/swig/ALERequest;->isKeyUpdate()Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    .line 105
    const-string/jumbo p1, "true"

    .line 106
    goto :goto_1

    .line 107
    .line 108
    :cond_5
    const-string p1, "false"

    .line 109
    .line 110
    :goto_1
    const-string v3, "Key update: "

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-static {v2, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :try_start_0
    invoke-static {v1}, Ljumio/core/a;->a(Lcom/jumio/ale/swig/ALEInputStream;)Ljava/lang/String;

    .line 121
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_2

    .line 123
    .line 124
    :catch_0
    const-string p1, ""

    .line 125
    .line 126
    :goto_2
    :try_start_1
    iget-object v1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 127
    .line 128
    if-nez v1, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 132
    move-object v1, v4

    .line 133
    goto :goto_3

    .line 134
    :catchall_0
    move-exception p1

    .line 135
    goto :goto_6

    .line 136
    .line 137
    .line 138
    :cond_6
    :goto_3
    invoke-virtual {v1}, Lcom/jumio/ale/swig/ALERequest;->isVerified()Z

    .line 139
    move-result v1

    .line 140
    .line 141
    if-nez v1, :cond_b

    .line 142
    .line 143
    iget-object p1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 144
    .line 145
    if-nez p1, :cond_7

    .line 146
    .line 147
    .line 148
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 149
    move-object p1, v4

    .line 150
    .line 151
    .line 152
    :cond_7
    invoke-virtual {p1}, Lcom/jumio/ale/swig/ALERequest;->getErrorCode()I

    .line 153
    move-result p1

    .line 154
    .line 155
    if-eqz p1, :cond_a

    .line 156
    .line 157
    new-instance p1, Ljumio/core/T3;

    .line 158
    .line 159
    iget-object v1, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 160
    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    .line 164
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 165
    move-object v1, v4

    .line 166
    .line 167
    .line 168
    :cond_8
    invoke-virtual {v1}, Lcom/jumio/ale/swig/ALERequest;->getErrorCode()I

    .line 169
    move-result v1

    .line 170
    .line 171
    new-instance v2, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    iget-object v0, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 177
    .line 178
    if-nez v0, :cond_9

    .line 179
    .line 180
    .line 181
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 182
    goto :goto_4

    .line 183
    :cond_9
    move-object v4, v0

    .line 184
    .line 185
    .line 186
    :goto_4
    invoke-virtual {v4}, Lcom/jumio/ale/swig/ALERequest;->getErrorCode()I

    .line 187
    move-result v0

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    move-result-object v0

    .line 195
    .line 196
    .line 197
    invoke-direct {p1, v1, v0}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    .line 198
    throw p1

    .line 199
    .line 200
    :cond_a
    new-instance p1, Ljumio/core/T3;

    .line 201
    .line 202
    const-string v0, "Response not verified"

    .line 203
    const/4 v1, 0x0

    .line 204
    .line 205
    .line 206
    invoke-direct {p1, v1, v0}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    .line 207
    throw p1

    .line 208
    .line 209
    :cond_b
    iget-object v0, p0, Ljumio/core/a;->c:Lcom/jumio/ale/swig/ALERequest;

    .line 210
    .line 211
    if-nez v0, :cond_c

    .line 212
    .line 213
    .line 214
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 215
    goto :goto_5

    .line 216
    :cond_c
    move-object v4, v0

    .line 217
    .line 218
    .line 219
    :goto_5
    invoke-virtual {v4}, Lcom/jumio/ale/swig/ALERequest;->isKeyUpdate()Z

    .line 220
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    .line 222
    if-nez v0, :cond_d

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Ljumio/core/a;->finishRequest()V

    .line 226
    return-object p1

    .line 227
    .line 228
    :cond_d
    :try_start_2
    new-instance p1, Ljumio/core/b;

    .line 229
    .line 230
    .line 231
    invoke-direct {p1}, Ljumio/core/b;-><init>()V

    .line 232
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 233
    .line 234
    .line 235
    :goto_6
    invoke-virtual {p0}, Ljumio/core/a;->finishRequest()V

    .line 236
    throw p1
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method
