.class public Lcom/kubi/safe/d;
.super Ljava/lang/Object;
.source "CommandUtils.java"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    const-string v2, "sh"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 12
    .line 13
    :try_start_1
    new-instance v2, Ljava/io/BufferedOutputStream;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    .line 22
    :try_start_2
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    .line 37
    .line 38
    const/16 p0, 0xa

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Process;->waitFor()I

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Lcom/kubi/safe/d;->c(Ljava/io/BufferedInputStream;)Ljava/lang/String;

    .line 54
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    .line 64
    return-object p0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    :goto_0
    move-object v0, v2

    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception p0

    .line 69
    goto :goto_2

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    move-object v3, v0

    .line 72
    goto :goto_0

    .line 73
    :catch_1
    move-exception p0

    .line 74
    move-object v3, v0

    .line 75
    goto :goto_2

    .line 76
    :catchall_2
    move-exception p0

    .line 77
    move-object v3, v0

    .line 78
    goto :goto_3

    .line 79
    :catch_2
    move-exception p0

    .line 80
    move-object v2, v0

    .line 81
    :goto_1
    move-object v3, v2

    .line 82
    goto :goto_2

    .line 83
    :catchall_3
    move-exception p0

    .line 84
    move-object v1, v0

    .line 85
    move-object v3, v1

    .line 86
    goto :goto_3

    .line 87
    :catch_3
    move-exception p0

    .line 88
    move-object v1, v0

    .line 89
    move-object v2, v1

    .line 90
    goto :goto_1

    .line 91
    .line 92
    .line 93
    :goto_2
    :try_start_4
    invoke-static {p0}, Lro/a;->h(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 100
    .line 101
    if-eqz v1, :cond_0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    .line 105
    :cond_0
    return-object v0

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-static {v0}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v3}, Lcom/kubi/safe/e;->a(Ljava/io/Closeable;)V

    .line 112
    .line 113
    if-eqz v1, :cond_1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    .line 117
    :cond_1
    throw p0
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
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v1, "android.os.SystemProperties"

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    const-string v2, "get"

    .line 10
    .line 11
    const-class v3, Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object p0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lro/a;->h(Ljava/lang/Throwable;)V

    .line 37
    :cond_0
    return-object v0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static c(Ljava/io/BufferedInputStream;)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, ""

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    const/16 v0, 0x200

    .line 8
    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_1
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-lez v3, :cond_2

    .line 21
    .line 22
    new-instance v4, Ljava/lang/String;

    .line 23
    const/4 v5, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, v1, v5, v3}, Ljava/lang/String;-><init>([BII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_2
    :goto_0
    if-ge v3, v0, :cond_1

    .line 35
    goto :goto_2

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {p0}, Lro/a;->h(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p0

    .line 43
    return-object p0
    .line 44
    .line 45
.end method
