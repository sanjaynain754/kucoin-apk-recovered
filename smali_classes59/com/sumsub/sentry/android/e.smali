.class public final Lcom/sumsub/sentry/android/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/sumsub/sentry/android/a;

.field public final c:Lcom/sumsub/sentry/android/g;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/concurrent/Future;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;Lcom/sumsub/sentry/android/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sentry/android/e;->b:Lcom/sumsub/sentry/android/a;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sentry/android/e;->c:Lcom/sumsub/sentry/android/g;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sentry/android/e;->d:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    new-instance p2, Lcom/sumsub/sentry/android/j;

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p0}, Lcom/sumsub/sentry/android/j;-><init>(Lcom/sumsub/sentry/android/e;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    iput-object p2, p0, Lcom/sumsub/sentry/android/e;->e:Ljava/util/concurrent/Future;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 30
    .line 31
    sget-object p1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/sumsub/sentry/android/e;->f:Ljava/lang/String;

    .line 34
    .line 35
    sget-object p1, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/sumsub/sentry/android/e;->g:Ljava/lang/String;

    .line 38
    return-void
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

.method public static final a(Lcom/sumsub/sentry/android/e;)Ljava/util/Map;
    .locals 8

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    iget-object v1, p0, Lcom/sumsub/sentry/android/e;->c:Lcom/sumsub/sentry/android/g;

    .line 30
    iget-object v1, v1, Lcom/sumsub/sentry/android/g;->f:Lkotlin/Lazy;

    .line 31
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sentry/android/i;

    .line 32
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->a:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 33
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->b:Z

    if-nez v2, :cond_1

    .line 34
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->c:Z

    if-nez v2, :cond_1

    .line 35
    iget-boolean v1, v1, Lcom/sumsub/sentry/android/i;->d:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 36
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string/jumbo v2, "rooted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    const-string/jumbo v1, "os.version"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 38
    new-instance v2, Ljava/io/File;

    const-string v4, "/proc/version"

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    goto :goto_3

    .line 40
    :cond_2
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/FileReader;

    invoke-direct {v6, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v4, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v1, v2

    goto :goto_3

    :catch_0
    move-exception v2

    goto :goto_2

    :catchall_0
    move-exception v2

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v6

    :try_start_4
    invoke-static {v4, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 41
    :goto_2
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 42
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v7, "Exception while attempting to read kernel information"

    invoke-virtual {v6, v4, v7, v2}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    if-eqz v1, :cond_3

    .line 43
    const-string v2, "kernelVersion"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sentry/android/e;->b:Lcom/sumsub/sentry/android/a;

    invoke-virtual {v1}, Lcom/sumsub/sentry/android/a;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "emulator"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :try_start_5
    sget-object v1, Lcom/sumsub/sentry/android/c;->a:Lcom/sumsub/sentry/android/c;

    iget-object v2, p0, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1

    .line 46
    :try_start_6
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v2

    .line 47
    :try_start_7
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Error getting package info."

    .line 48
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v4, v1, v3, v2}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v5

    .line 49
    :goto_4
    iget-object p0, p0, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz v1, :cond_5

    if-eqz p0, :cond_5

    .line 50
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 51
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_1

    const-string v2, "isSideLoaded"

    if-eqz p0, :cond_4

    .line 53
    :try_start_8
    const-string v3, "false"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    const-string v2, "installerStore"

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 55
    :cond_4
    const-string/jumbo p0, "true"

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_1

    :goto_5
    move-object v5, v1

    :catch_1
    :cond_5
    if-eqz v5, :cond_6

    .line 56
    const-string/jumbo p0, "sideLoaded"

    invoke-virtual {v0, p0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sentry/n0;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 2
    const-string/jumbo v1, "os"

    invoke-virtual {v0, v1}, Lcom/sumsub/sentry/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    const-class v2, Lcom/sumsub/sentry/P;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    .line 4
    :goto_0
    check-cast v0, Lcom/sumsub/sentry/P;

    .line 5
    new-instance v2, Lcom/sumsub/sentry/P;

    invoke-direct {v2}, Lcom/sumsub/sentry/P;-><init>()V

    .line 6
    const-string v3, "Android"

    iput-object v3, v2, Lcom/sumsub/sentry/P;->a:Ljava/lang/String;

    .line 7
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 8
    iput-object v3, v2, Lcom/sumsub/sentry/P;->b:Ljava/lang/String;

    .line 9
    sget-object v3, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 10
    iput-object v3, v2, Lcom/sumsub/sentry/P;->d:Ljava/lang/String;

    .line 11
    :try_start_0
    iget-object v3, p0, Lcom/sumsub/sentry/android/e;->e:Ljava/util/concurrent/Future;

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const-string v5, "kernelVersion"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 12
    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_1

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :catchall_0
    move-exception v3

    goto :goto_2

    :cond_1
    move-object v3, v4

    .line 13
    :goto_1
    iput-object v3, v2, Lcom/sumsub/sentry/P;->e:Ljava/lang/String;

    .line 14
    :cond_2
    iget-object v3, p0, Lcom/sumsub/sentry/android/e;->e:Ljava/util/concurrent/Future;

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const-string/jumbo v5, "rooted"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 15
    instance-of v5, v3, Ljava/lang/Boolean;

    if-eqz v5, :cond_3

    move-object v4, v3

    check-cast v4, Ljava/lang/Boolean;

    .line 16
    :cond_3
    iput-object v4, v2, Lcom/sumsub/sentry/P;->f:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 17
    :goto_2
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 18
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v6, "Error getting OperatingSystem."

    invoke-virtual {v5, v4, v6, v3}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    :cond_4
    :goto_3
    iget-object v3, p1, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 20
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_7

    .line 21
    iget-object v1, v0, Lcom/sumsub/sentry/P;->a:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    .line 23
    :cond_5
    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "os_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    .line 24
    :cond_6
    :goto_4
    const-string/jumbo v1, "os_1"

    .line 25
    :goto_5
    iget-object p1, p1, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 26
    invoke-virtual {p1, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-void
.end method

.method public final b(Lcom/sumsub/sentry/n0;)Lcom/sumsub/sentry/n0;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v3, 0x1

    .line 1
    iget-object v0, v2, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 2
    const-string v4, "app"

    invoke-virtual {v0, v4}, Lcom/sumsub/sentry/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    const-class v5, Lcom/sumsub/sentry/c;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    invoke-virtual {v5, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v7

    .line 4
    :goto_0
    check-cast v0, Lcom/sumsub/sentry/c;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lcom/sumsub/sentry/c;

    invoke-direct {v0}, Lcom/sumsub/sentry/c;-><init>()V

    :cond_1
    move-object v5, v0

    .line 6
    :try_start_0
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 7
    iget v6, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-nez v6, :cond_3

    .line 8
    iget-object v6, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v6, :cond_2

    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 10
    :cond_2
    iget-object v6, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 11
    :cond_3
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-object v0, v7

    .line 12
    :goto_1
    iput-object v0, v5, Lcom/sumsub/sentry/c;->d:Ljava/lang/String;

    .line 13
    sget-object v6, Lcom/sumsub/sentry/android/c;->a:Lcom/sumsub/sentry/android/c;

    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    .line 14
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v9, 0x1000

    invoke-virtual {v8, v0, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    .line 15
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v6}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 16
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v9, "Error getting package info."

    invoke-virtual {v8, v6, v9, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    :goto_2
    const/4 v6, 0x2

    const/4 v8, 0x0

    if-eqz v0, :cond_8

    .line 17
    invoke-static {v0}, Lcom/sumsub/sentry/android/c;->a(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v9

    .line 18
    iget-object v10, v2, Lcom/sumsub/sentry/a0;->i:Ljava/lang/String;

    if-nez v10, :cond_4

    .line 19
    iput-object v9, v2, Lcom/sumsub/sentry/a0;->i:Ljava/lang/String;

    .line 20
    :cond_4
    iget-object v9, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 21
    iput-object v9, v5, Lcom/sumsub/sentry/c;->a:Ljava/lang/String;

    .line 22
    iget-object v9, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 23
    iput-object v9, v5, Lcom/sumsub/sentry/c;->e:Ljava/lang/String;

    .line 24
    invoke-static {v0}, Lcom/sumsub/sentry/android/c;->a(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v9

    .line 25
    iput-object v9, v5, Lcom/sumsub/sentry/c;->f:Ljava/lang/String;

    .line 26
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 27
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 28
    iget-object v11, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-eqz v10, :cond_7

    .line 29
    array-length v12, v10

    if-nez v12, :cond_5

    goto :goto_5

    :cond_5
    if-eqz v11, :cond_7

    array-length v12, v11

    if-lez v12, :cond_7

    .line 30
    array-length v12, v10

    move v13, v8

    :goto_3
    if-ge v13, v12, :cond_7

    .line 31
    aget-object v14, v10, v13

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v15, 0x2e

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 32
    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v3

    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    .line 33
    aget v15, v11, v13

    and-int/2addr v15, v6

    if-ne v15, v6, :cond_6

    .line 34
    const-string v15, "granted"

    goto :goto_4

    :cond_6
    const-string/jumbo v15, "not_granted"

    :goto_4
    invoke-virtual {v9, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v13, v3

    goto :goto_3

    .line 35
    :cond_7
    :goto_5
    iput-object v9, v5, Lcom/sumsub/sentry/c;->g:Ljava/util/Map;

    .line 36
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 37
    iget-object v9, v2, Lcom/sumsub/sentry/a0;->c:Ljava/util/Map;

    if-eqz v9, :cond_8

    .line 38
    const-string v10, "app.package"

    invoke-interface {v9, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_8
    iget-object v0, v2, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 40
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, v2, Lcom/sumsub/sentry/n0;->s:Lcom/sumsub/sentry/X0;

    if-eqz v0, :cond_b

    .line 42
    iget-object v0, v0, Lcom/sumsub/sentry/X0;->a:Ljava/util/List;

    .line 43
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sentry/T0;

    .line 44
    iget-object v5, v4, Lcom/sumsub/sentry/T0;->f:Ljava/lang/Boolean;

    if-nez v5, :cond_9

    .line 45
    iget-object v5, v4, Lcom/sumsub/sentry/T0;->a:Ljava/lang/Long;

    if-eqz v5, :cond_a

    .line 46
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    .line 47
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v11

    cmp-long v5, v11, v9

    if-nez v5, :cond_a

    move v5, v3

    goto :goto_7

    :cond_a
    move v5, v8

    .line 48
    :goto_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 49
    iput-object v5, v4, Lcom/sumsub/sentry/T0;->f:Ljava/lang/Boolean;

    goto :goto_6

    .line 50
    :cond_b
    iget-object v0, v2, Lcom/sumsub/sentry/a0;->g:Lcom/sumsub/sentry/h1;

    if-nez v0, :cond_d

    .line 51
    new-instance v0, Lcom/sumsub/sentry/h1;

    iget-object v4, v1, Lcom/sumsub/sentry/android/e;->d:Ljava/lang/String;

    if-nez v4, :cond_c

    .line 52
    :try_start_2
    sget-object v4, Lcom/sumsub/sentry/android/f;->a:Lcom/sumsub/sentry/android/f;

    iget-object v5, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/sumsub/sentry/android/f;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    move-object v4, v7

    :cond_c
    :goto_8
    const/16 v5, 0xe

    .line 53
    invoke-direct {v0, v4, v5}, Lcom/sumsub/sentry/h1;-><init>(Ljava/lang/String;I)V

    .line 54
    iput-object v0, v2, Lcom/sumsub/sentry/a0;->g:Lcom/sumsub/sentry/h1;

    goto :goto_a

    .line 55
    :cond_d
    iget-object v4, v0, Lcom/sumsub/sentry/h1;->b:Ljava/lang/String;

    if-nez v4, :cond_f

    .line 56
    iget-object v4, v1, Lcom/sumsub/sentry/android/e;->d:Ljava/lang/String;

    if-nez v4, :cond_e

    .line 57
    :try_start_3
    sget-object v4, Lcom/sumsub/sentry/android/f;->a:Lcom/sumsub/sentry/android/f;

    iget-object v5, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/sumsub/sentry/android/f;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    move-object v4, v7

    .line 58
    :cond_e
    :goto_9
    iput-object v4, v0, Lcom/sumsub/sentry/h1;->b:Ljava/lang/String;

    .line 59
    :cond_f
    :goto_a
    iget-object v0, v2, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 60
    const-string v4, "device"

    invoke-virtual {v0, v4}, Lcom/sumsub/sentry/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 61
    const-class v5, Lcom/sumsub/sentry/x;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-virtual {v5, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_b

    :cond_10
    move-object v0, v7

    .line 62
    :goto_b
    check-cast v0, Lcom/sumsub/sentry/x;

    if-nez v0, :cond_41

    .line 63
    iget-object v5, v2, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 64
    new-instance v9, Lcom/sumsub/sentry/x;

    .line 65
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v10, "device_name"

    invoke-static {v0, v10}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_11

    const-string v0, "Unknown"

    :cond_11
    move-object v10, v0

    .line 66
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 67
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 68
    :try_start_4
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v12, Lkotlin/text/Regex;

    const-string v13, " "

    invoke-direct {v12, v13}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0, v8}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v0

    .line 69
    new-array v12, v8, [Ljava/lang/String;

    invoke-interface {v0, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 70
    aget-object v0, v0, v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v12, v0

    goto :goto_c

    :catchall_4
    move-exception v0

    .line 71
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 72
    sget-object v13, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v14, "Error getting device family."

    invoke-virtual {v13, v12, v14, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v12, v7

    .line 73
    :goto_c
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 74
    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 75
    :try_start_5
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v3, :cond_13

    if-eq v0, v6, :cond_12

    move-object v13, v7

    goto :goto_e

    .line 76
    :cond_12
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->LANDSCAPE:Lcom/sumsub/sentry/Device$DeviceOrientation;

    goto :goto_d

    :catchall_5
    move-exception v0

    move-object v13, v7

    goto :goto_f

    .line 77
    :cond_13
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->PORTRAIT:Lcom/sumsub/sentry/Device$DeviceOrientation;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :goto_d
    move-object v13, v0

    :goto_e
    if-nez v13, :cond_14

    .line 78
    :try_start_6
    sget-object v14, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    const-string v16, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)"

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-object v13, v7

    goto :goto_10

    :catchall_6
    move-exception v0

    .line 79
    :goto_f
    sget-object v14, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 80
    sget-object v15, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v8, "Error getting device orientation."

    invoke-virtual {v15, v14, v8, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    :cond_14
    :goto_10
    invoke-direct {v9, v10, v11, v12, v13}, Lcom/sumsub/sentry/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/Device$DeviceOrientation;)V

    .line 82
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->f:Ljava/lang/String;

    iget-object v8, v1, Lcom/sumsub/sentry/android/e;->g:Ljava/lang/String;

    filled-new-array {v0, v8}, [Ljava/lang/String;

    move-result-object v0

    .line 83
    iput-object v0, v9, Lcom/sumsub/sentry/x;->g:[Ljava/lang/String;

    .line 84
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    new-instance v8, Landroid/content/IntentFilter;

    const-string v10, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v8, v10}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v8

    if-eqz v8, :cond_1a

    const/4 v10, -0x1

    .line 85
    :try_start_7
    const-string v0, "level"

    invoke-virtual {v8, v0, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 86
    const-string/jumbo v11, "scale"

    invoke-virtual {v8, v11, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    if-eq v0, v10, :cond_16

    if-ne v11, v10, :cond_15

    goto :goto_11

    :cond_15
    int-to-float v0, v0

    int-to-float v11, v11

    div-float/2addr v0, v11

    const/high16 v11, 0x42c80000    # 100.0f

    mul-float/2addr v0, v11

    .line 87
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_13

    :catchall_7
    move-exception v0

    goto :goto_12

    :cond_16
    :goto_11
    move-object v0, v7

    goto :goto_13

    .line 88
    :goto_12
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 89
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v13, "Error getting device battery level."

    invoke-virtual {v12, v11, v13, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_11

    .line 90
    :goto_13
    iput-object v0, v9, Lcom/sumsub/sentry/x;->h:Ljava/lang/Float;

    .line 91
    :try_start_8
    const-string/jumbo v0, "plugged"

    invoke-virtual {v8, v0, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v3, :cond_18

    if-ne v0, v6, :cond_17

    goto :goto_14

    :cond_17
    const/4 v0, 0x0

    goto :goto_15

    :cond_18
    :goto_14
    move v0, v3

    .line 92
    :goto_15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_16

    :catchall_8
    move-exception v0

    .line 93
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 94
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v13, "Error getting device charging state."

    invoke-virtual {v12, v11, v13, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 95
    :goto_16
    iput-object v0, v9, Lcom/sumsub/sentry/x;->i:Ljava/lang/Boolean;

    .line 96
    :try_start_9
    const-string/jumbo v0, "temperature"

    invoke-virtual {v8, v0, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v10, :cond_19

    int-to-float v0, v0

    const/16 v8, 0xa

    int-to-float v8, v8

    div-float/2addr v0, v8

    .line 97
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_17

    :catchall_9
    move-exception v0

    .line 98
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 99
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v11, "Error getting battery temperature."

    invoke-virtual {v10, v8, v11, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    move-object v0, v7

    .line 100
    :goto_17
    iput-object v0, v9, Lcom/sumsub/sentry/x;->E:Ljava/lang/Float;

    .line 101
    :cond_1a
    sget-object v0, Lcom/sumsub/sentry/android/b;->a:Lcom/sumsub/sentry/android/b;

    iget-object v8, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    .line 102
    const-string v10, "connectivity"

    invoke-virtual {v8, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Landroid/net/ConnectivityManager;

    if-eqz v12, :cond_1b

    check-cast v11, Landroid/net/ConnectivityManager;

    goto :goto_18

    :cond_1b
    move-object v11, v7

    :goto_18
    if-nez v11, :cond_1c

    .line 103
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "ConnectivityManager is null and cannot check network status"

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1c
    const-string v12, "android.permission.ACCESS_NETWORK_STATE"

    if-nez v11, :cond_1d

    .line 104
    sget-object v0, Lcom/sumsub/sentry/android/ConnectivityChecker$Status;->UNKNOWN:Lcom/sumsub/sentry/android/ConnectivityChecker$Status;

    goto :goto_19

    .line 105
    :cond_1d
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v13

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v14

    invoke-virtual {v8, v12, v13, v14}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v8

    if-nez v8, :cond_20

    .line 106
    invoke-virtual {v11}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v8

    if-nez v8, :cond_1e

    .line 107
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "NetworkInfo is null, there\'s no active network."

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 108
    sget-object v0, Lcom/sumsub/sentry/android/ConnectivityChecker$Status;->NOT_CONNECTED:Lcom/sumsub/sentry/android/ConnectivityChecker$Status;

    goto :goto_19

    .line 109
    :cond_1e
    invoke-virtual {v8}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Lcom/sumsub/sentry/android/ConnectivityChecker$Status;->CONNECTED:Lcom/sumsub/sentry/android/ConnectivityChecker$Status;

    goto :goto_19

    :cond_1f
    sget-object v0, Lcom/sumsub/sentry/android/ConnectivityChecker$Status;->NOT_CONNECTED:Lcom/sumsub/sentry/android/ConnectivityChecker$Status;

    goto :goto_19

    .line 110
    :cond_20
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "No permission (ACCESS_NETWORK_STATE) to check network status."

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    sget-object v0, Lcom/sumsub/sentry/android/ConnectivityChecker$Status;->NO_PERMISSION:Lcom/sumsub/sentry/android/ConnectivityChecker$Status;

    .line 112
    :goto_19
    sget-object v8, Lcom/sumsub/sentry/android/d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v8, v0

    if-eq v0, v3, :cond_22

    if-eq v0, v6, :cond_21

    move-object v0, v7

    goto :goto_1a

    .line 113
    :cond_21
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1a

    .line 114
    :cond_22
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    :goto_1a
    iput-object v0, v9, Lcom/sumsub/sentry/x;->j:Ljava/lang/Boolean;

    .line 116
    :try_start_a
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    const-string v8, "activity"

    invoke-virtual {v0, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v8, v0, Landroid/app/ActivityManager;

    if-eqz v8, :cond_23

    check-cast v0, Landroid/app/ActivityManager;

    goto :goto_1b

    :catchall_a
    move-exception v0

    goto :goto_1c

    :cond_23
    move-object v0, v7

    .line 117
    :goto_1b
    new-instance v8, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v8}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    if-eqz v0, :cond_24

    .line 118
    invoke-virtual {v0, v8}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    goto :goto_1e

    .line 119
    :cond_24
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const-string v19, "Error getting MemoryInfo."

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto :goto_1d

    .line 120
    :goto_1c
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 121
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v13, "Error getting MemoryInfo."

    invoke-virtual {v11, v8, v13, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1d
    move-object v8, v7

    :goto_1e
    if-eqz v8, :cond_25

    .line 122
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v13

    .line 123
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 124
    iput-object v0, v9, Lcom/sumsub/sentry/x;->m:Ljava/lang/Long;

    .line 125
    iget-wide v13, v8, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 126
    iput-object v0, v9, Lcom/sumsub/sentry/x;->n:Ljava/lang/Long;

    .line 127
    iget-boolean v0, v8, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 128
    iput-object v0, v9, Lcom/sumsub/sentry/x;->p:Ljava/lang/Boolean;

    .line 129
    :cond_25
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_26

    .line 130
    new-instance v11, Landroid/os/StatFs;

    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 131
    :try_start_b
    invoke-virtual {v11}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v13

    .line 132
    invoke-virtual {v11}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v17

    mul-long v17, v17, v13

    .line 133
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    goto :goto_1f

    :catchall_b
    move-exception v0

    .line 134
    sget-object v13, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 135
    sget-object v14, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v15, "Error getting total internal storage amount."

    invoke-virtual {v14, v13, v15, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 136
    :goto_1f
    iput-object v0, v9, Lcom/sumsub/sentry/x;->q:Ljava/lang/Long;

    .line 137
    :try_start_c
    invoke-virtual {v11}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v13

    .line 138
    invoke-virtual {v11}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v17

    mul-long v17, v17, v13

    .line 139
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    goto :goto_20

    :catchall_c
    move-exception v0

    .line 140
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 141
    sget-object v13, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v14, "Error getting unused internal storage amount."

    invoke-virtual {v13, v11, v14, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 142
    :goto_20
    iput-object v0, v9, Lcom/sumsub/sentry/x;->r:Ljava/lang/Long;

    .line 143
    :cond_26
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 144
    const-string/jumbo v11, "mounted"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_27

    const-string/jumbo v11, "mounted_ro"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 145
    :cond_27
    invoke-static {}, Landroid/os/Environment;->isExternalStorageEmulated()Z

    move-result v0

    if-nez v0, :cond_28

    .line 146
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "External storage is not mounted or emulated."

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :goto_21
    move-object v6, v7

    goto/16 :goto_25

    .line 147
    :cond_28
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2c

    if-eqz v8, :cond_29

    .line 148
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    goto :goto_22

    :cond_29
    move-object v8, v7

    .line 149
    :goto_22
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/io/File;

    if-nez v11, :cond_2a

    goto :goto_23

    :cond_2a
    if-eqz v8, :cond_2e

    .line 150
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_2b

    goto :goto_24

    .line 151
    :cond_2b
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-static {v13, v8, v14, v6, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2e

    goto :goto_23

    .line 152
    :cond_2c
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "Not possible to read getExternalFilesDirs"

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_2d
    move-object v11, v7

    :cond_2e
    :goto_24
    if-eqz v11, :cond_2f

    .line 153
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {v11}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    goto :goto_25

    .line 154
    :cond_2f
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "Not possible to read external files directory"

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_21

    :goto_25
    if-eqz v6, :cond_30

    .line 155
    :try_start_d
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v13

    .line 156
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v17

    mul-long v17, v17, v13

    .line 157
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_26

    :catchall_d
    move-exception v0

    .line 158
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 159
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v13, "Error getting total external storage amount."

    invoke-virtual {v11, v8, v13, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 160
    :goto_26
    iput-object v0, v9, Lcom/sumsub/sentry/x;->s:Ljava/lang/Long;

    .line 161
    :try_start_e
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v13

    .line 162
    invoke-virtual {v6}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v17

    mul-long v17, v17, v13

    .line 163
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    goto :goto_27

    :catchall_e
    move-exception v0

    .line 164
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 165
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v11, "Error getting unused external storage amount."

    invoke-virtual {v8, v6, v11, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 166
    :goto_27
    iput-object v0, v9, Lcom/sumsub/sentry/x;->t:Ljava/lang/Long;

    .line 167
    :cond_30
    iget-object v0, v9, Lcom/sumsub/sentry/x;->D:Ljava/lang/String;

    if-nez v0, :cond_3a

    .line 168
    sget-object v0, Lcom/sumsub/sentry/android/b;->a:Lcom/sumsub/sentry/android/b;

    iget-object v6, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    .line 169
    invoke-virtual {v6, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v10, v8, Landroid/net/ConnectivityManager;

    if-eqz v10, :cond_31

    check-cast v8, Landroid/net/ConnectivityManager;

    goto :goto_28

    :cond_31
    move-object v8, v7

    :goto_28
    if-nez v8, :cond_32

    .line 170
    sget-object v17, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v19, "ConnectivityManager is null and cannot check network status"

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_32
    if-nez v8, :cond_33

    goto :goto_29

    .line 171
    :cond_33
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v10

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v11

    invoke-virtual {v6, v12, v10, v11}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v6

    if-nez v6, :cond_39

    .line 172
    invoke-virtual {v8}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v6

    if-nez v6, :cond_35

    .line 173
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "Network is null and cannot check network status"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_34
    :goto_29
    move-object v0, v7

    goto :goto_2a

    .line 174
    :cond_35
    invoke-virtual {v8, v6}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v6

    if-nez v6, :cond_36

    .line 175
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "NetworkCapabilities is null and cannot check network type"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_29

    :cond_36
    const/4 v0, 0x3

    .line 176
    invoke-virtual {v6, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    .line 177
    invoke-virtual {v6, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v3

    const/4 v14, 0x0

    .line 178
    invoke-virtual {v6, v14}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v6

    if-eqz v0, :cond_37

    .line 179
    const-string v0, "ethernet"

    goto :goto_2a

    :cond_37
    if-eqz v3, :cond_38

    .line 180
    const-string/jumbo v0, "wifi"

    goto :goto_2a

    :cond_38
    if-eqz v6, :cond_34

    .line 181
    const-string v0, "cellular"

    goto :goto_2a

    .line 182
    :cond_39
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "No permission (ACCESS_NETWORK_STATE) to check network status."

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_29

    .line 183
    :goto_2a
    iput-object v0, v9, Lcom/sumsub/sentry/x;->D:Ljava/lang/String;

    .line 184
    :cond_3a
    :try_start_f
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->e:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v3, "emulator"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3b

    .line 185
    check-cast v0, Ljava/lang/Boolean;

    .line 186
    iput-object v0, v9, Lcom/sumsub/sentry/x;->l:Ljava/lang/Boolean;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    goto :goto_2b

    :catchall_f
    move-exception v0

    .line 187
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 188
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v8, "Error getting emulator."

    invoke-virtual {v6, v3, v8, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    :cond_3b
    :goto_2b
    :try_start_10
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    goto :goto_2c

    :catchall_10
    move-exception v0

    .line 190
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 191
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v8, "Error getting DisplayMetrics."

    invoke-virtual {v6, v3, v8, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    :goto_2c
    if-eqz v0, :cond_3c

    .line 192
    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 193
    iput-object v3, v9, Lcom/sumsub/sentry/x;->u:Ljava/lang/Integer;

    .line 194
    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 195
    iput-object v3, v9, Lcom/sumsub/sentry/x;->v:Ljava/lang/Integer;

    .line 196
    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 197
    iput-object v3, v9, Lcom/sumsub/sentry/x;->w:Ljava/lang/Float;

    .line 198
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 199
    iput-object v0, v9, Lcom/sumsub/sentry/x;->x:Ljava/lang/Integer;

    .line 200
    :cond_3c
    :try_start_11
    sget-object v0, Lcom/sumsub/sentry/n;->a:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 201
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 203
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0
    :try_end_11
    .catch Ljava/lang/IllegalArgumentException; {:try_start_11 .. :try_end_11} :catch_0

    goto :goto_2d

    :catch_0
    move-exception v0

    .line 204
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 205
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v8, "Error getting the device\'s boot time."

    invoke-virtual {v6, v3, v8, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    .line 206
    :goto_2d
    iput-object v0, v9, Lcom/sumsub/sentry/x;->y:Ljava/util/Date;

    .line 207
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    .line 208
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3d

    const/4 v14, 0x0

    .line 209
    invoke-virtual {v0, v14}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    .line 210
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    goto :goto_2e

    .line 211
    :cond_3d
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    .line 212
    :goto_2e
    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    .line 213
    iput-object v0, v9, Lcom/sumsub/sentry/x;->z:Ljava/lang/String;

    .line 214
    iget-object v0, v9, Lcom/sumsub/sentry/x;->A:Ljava/lang/String;

    if-nez v0, :cond_3e

    .line 215
    :try_start_12
    sget-object v0, Lcom/sumsub/sentry/android/f;->a:Lcom/sumsub/sentry/android/f;

    iget-object v3, v1, Lcom/sumsub/sentry/android/e;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/sumsub/sentry/android/f;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    goto :goto_2f

    :catchall_11
    move-object v0, v7

    .line 216
    :goto_2f
    iput-object v0, v9, Lcom/sumsub/sentry/x;->A:Ljava/lang/String;

    .line 217
    :cond_3e
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 218
    iget-object v3, v9, Lcom/sumsub/sentry/x;->B:Ljava/lang/String;

    if-nez v3, :cond_3f

    .line 219
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 220
    iput-object v3, v9, Lcom/sumsub/sentry/x;->B:Ljava/lang/String;

    .line 221
    :cond_3f
    iget-object v3, v9, Lcom/sumsub/sentry/x;->C:Ljava/lang/String;

    if-nez v3, :cond_40

    .line 222
    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    .line 223
    iput-object v0, v9, Lcom/sumsub/sentry/x;->C:Ljava/lang/String;

    .line 224
    :cond_40
    invoke-virtual {v5, v4, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    :cond_41
    invoke-virtual/range {p0 .. p1}, Lcom/sumsub/sentry/android/e;->a(Lcom/sumsub/sentry/n0;)V

    .line 226
    :try_start_13
    iget-object v0, v1, Lcom/sumsub/sentry/android/e;->e:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string/jumbo v3, "sideLoaded"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/util/Map;

    if-eqz v3, :cond_42

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    goto :goto_30

    :catchall_12
    move-exception v0

    goto :goto_32

    :cond_42
    :goto_30
    if-eqz v7, :cond_44

    .line 227
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_43
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 228
    iget-object v5, v2, Lcom/sumsub/sentry/a0;->c:Ljava/util/Map;

    if-eqz v5, :cond_43

    .line 229
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    goto :goto_31

    .line 230
    :goto_32
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 231
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v5, "Error getting side loaded info."

    invoke-virtual {v4, v3, v5, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_44
    return-object v2
.end method
