.class public final Lcom/sumsub/sentry/android/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final g:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/sumsub/sentry/android/a;

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;

.field public final e:Ljava/lang/Runtime;

.field public final f:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "UTF-8"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sentry/android/g;->g:Ljava/nio/charset/Charset;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;I)V
    .locals 16

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lcom/sumsub/sentry/android/a;

    invoke-direct {v0}, Lcom/sumsub/sentry/android/a;-><init>()V

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    .line 9
    :goto_0
    const-string v14, "/su/bin"

    .line 10
    const-string v15, "/system/xbin/daemonsu"

    const-string v4, "/system/app/Superuser.apk"

    const-string v5, "/sbin/su"

    const-string v6, "/system/bin/su"

    const-string v7, "/system/xbin/su"

    const-string v8, "/data/local/xbin/su"

    const-string v9, "/data/local/bin/su"

    const-string v10, "/system/sd/xbin/su"

    const-string v11, "/system/bin/failsafe/su"

    const-string v12, "/data/local/su"

    const-string v13, "/su/bin/su"

    filled-new-array/range {v4 .. v15}, [Ljava/lang/String;

    move-result-object v4

    .line 11
    const-string v9, "eu.chainfire.supersu"

    .line 12
    const-string v10, "com.noshufou.android.su"

    const-string v5, "com.devadvance.rootcloak"

    const-string v6, "com.devadvance.rootcloakplus"

    const-string v7, "com.koushikdutta.superuser"

    const-string v8, "com.thirdparty.superuser"

    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    move-result-object v5

    .line 13
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sentry/android/g;-><init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runtime;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runtime;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sentry/android/g;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/sumsub/sentry/android/g;->b:Lcom/sumsub/sentry/android/a;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sentry/android/g;->c:[Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/sumsub/sentry/android/g;->d:[Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/sumsub/sentry/android/g;->e:Ljava/lang/Runtime;

    .line 7
    new-instance p1, Lcom/sumsub/sentry/android/k;

    invoke-direct {p1, p0}, Lcom/sumsub/sentry/android/k;-><init>(Lcom/sumsub/sentry/android/g;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sentry/android/g;->f:Lkotlin/Lazy;

    return-void
.end method

.method public static final a(Lcom/sumsub/sentry/android/g;)Lcom/sumsub/sentry/android/i;
    .locals 13

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/android/i;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sentry/android/g;->b:Lcom/sumsub/sentry/android/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    sget-object v1, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v5, "test-keys"

    .line 18
    const/4 v6, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v5, v4, v6, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v4

    .line 28
    .line 29
    :goto_0
    iget-object v5, p0, Lcom/sumsub/sentry/android/g;->c:[Ljava/lang/String;

    .line 30
    array-length v6, v5

    .line 31
    move v7, v4

    .line 32
    .line 33
    :goto_1
    if-ge v7, v6, :cond_2

    .line 34
    .line 35
    aget-object v8, v5, v7

    .line 36
    .line 37
    :try_start_0
    new-instance v9, Ljava/io/File;

    .line 38
    .line 39
    .line 40
    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 44
    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    if-eqz v8, :cond_1

    .line 47
    move v5, v3

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v9

    .line 50
    .line 51
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object v10

    .line 56
    .line 57
    sget-object v11, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 58
    .line 59
    .line 60
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 61
    move-result-object v8

    .line 62
    .line 63
    .line 64
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    move-result-object v8

    .line 66
    .line 67
    const-string v11, "Error when trying to check if root file %s exists."

    .line 68
    .line 69
    .line 70
    invoke-static {v11, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    move-result-object v8

    .line 72
    .line 73
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v10, v8, v9}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    :cond_1
    add-int/2addr v7, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move v5, v4

    .line 80
    .line 81
    :goto_2
    const-string v6, "/system/xbin/which"

    .line 82
    .line 83
    .line 84
    const-string/jumbo v7, "su"

    .line 85
    .line 86
    .line 87
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 88
    move-result-object v6

    .line 89
    .line 90
    :try_start_1
    iget-object v7, p0, Lcom/sumsub/sentry/android/g;->e:Ljava/lang/Runtime;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v6}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 94
    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 95
    .line 96
    :try_start_2
    new-instance v7, Ljava/io/BufferedReader;

    .line 97
    .line 98
    new-instance v8, Ljava/io/InputStreamReader;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 102
    move-result-object v9

    .line 103
    .line 104
    sget-object v10, Lcom/sumsub/sentry/android/g;->g:Ljava/nio/charset/Charset;

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v9, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    .line 113
    :try_start_3
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 114
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    .line 116
    if-eqz v8, :cond_3

    .line 117
    move v8, v3

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move v8, v4

    .line 120
    .line 121
    .line 122
    :goto_3
    :try_start_4
    invoke-static {v7, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 126
    goto :goto_7

    .line 127
    :catchall_0
    move-exception v2

    .line 128
    goto :goto_4

    .line 129
    :catchall_1
    move-exception v2

    .line 130
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 131
    :catchall_2
    move-exception v8

    .line 132
    .line 133
    .line 134
    :try_start_6
    invoke-static {v7, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 135
    throw v8
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 136
    :catch_1
    move-object v2, v6

    .line 137
    goto :goto_5

    .line 138
    :catchall_3
    move-exception v6

    .line 139
    move-object v12, v6

    .line 140
    move-object v6, v2

    .line 141
    move-object v2, v12

    .line 142
    .line 143
    :goto_4
    :try_start_7
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 144
    .line 145
    .line 146
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    move-result-object v7

    .line 148
    .line 149
    const-string v8, "Error when trying to check if SU exists."

    .line 150
    .line 151
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9, v7, v8, v2}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 155
    .line 156
    if-eqz v6, :cond_5

    .line 157
    goto :goto_6

    .line 158
    :catchall_4
    move-exception p0

    .line 159
    .line 160
    if-eqz v6, :cond_4

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 164
    :cond_4
    throw p0

    .line 165
    .line 166
    :catch_2
    :goto_5
    if-eqz v2, :cond_5

    .line 167
    move-object v6, v2

    .line 168
    .line 169
    .line 170
    :goto_6
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 171
    :cond_5
    move v8, v4

    .line 172
    .line 173
    :goto_7
    iget-object v2, p0, Lcom/sumsub/sentry/android/g;->a:Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 177
    move-result-object v2

    .line 178
    .line 179
    if-eqz v2, :cond_6

    .line 180
    .line 181
    iget-object p0, p0, Lcom/sumsub/sentry/android/g;->d:[Ljava/lang/String;

    .line 182
    array-length v6, p0

    .line 183
    move v7, v4

    .line 184
    .line 185
    :goto_8
    if-ge v7, v6, :cond_6

    .line 186
    .line 187
    aget-object v9, p0, v7

    .line 188
    .line 189
    .line 190
    :try_start_8
    invoke-virtual {v2, v9, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_3

    .line 191
    goto :goto_9

    .line 192
    :catch_3
    add-int/2addr v7, v3

    .line 193
    goto :goto_8

    .line 194
    :cond_6
    move v3, v4

    .line 195
    .line 196
    .line 197
    :goto_9
    invoke-direct {v0, v1, v5, v8, v3}, Lcom/sumsub/sentry/android/i;-><init>(ZZZZ)V

    .line 198
    return-object v0
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
