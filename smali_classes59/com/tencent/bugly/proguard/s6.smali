.class public Lcom/tencent/bugly/proguard/s6;
.super Lcom/tencent/bugly/proguard/z0;
.source "BUGLY"


# static fields
.field public static final i:Ljava/lang/String; = "RMotnior_FdLeak_ProcFdDump"

.field public static final j:Ljava/lang/String; = "/proc/self/fd"

.field public static final k:Ljava/lang/String; = "/proc/self/limits"

.field public static final l:Ljava/lang/String; = "Max open files"

.field public static final m:I = 0x1

.field public static final n:Ljava/lang/String; = "[^0-9]+"

.field public static final o:Ljava/util/regex/Pattern;

.field public static p:I

.field public static q:Ljava/lang/String;


# instance fields
.field public final h:Lcom/tencent/rmonitor/fd/cluser/FdCluster;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "[^0-9]+"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/proguard/s6;->o:Ljava/util/regex/Pattern;

    .line 9
    const/4 v0, -0x1

    .line 10
    .line 11
    sput v0, Lcom/tencent/bugly/proguard/s6;->p:I

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/z0;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/rmonitor/fd/cluser/FdCluster;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s6;->h:Lcom/tencent/rmonitor/fd/cluser/FdCluster;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static b(I)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string/jumbo p0, "others"

    .line 7
    return-object p0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    const-string/jumbo p0, "system_file"

    .line 11
    return-object p0

    .line 12
    .line 13
    :pswitch_1
    const-string p0, "device"

    .line 14
    return-object p0

    .line 15
    .line 16
    :pswitch_2
    const-string p0, "gpu"

    .line 17
    return-object p0

    .line 18
    .line 19
    .line 20
    :pswitch_3
    const-string/jumbo p0, "pipe"

    .line 21
    return-object p0

    .line 22
    .line 23
    :pswitch_4
    const-string p0, "file"

    .line 24
    return-object p0

    .line 25
    .line 26
    :pswitch_5
    const-string p0, "dmabuf"

    .line 27
    return-object p0

    .line 28
    .line 29
    :pswitch_6
    const-string p0, "ashmem"

    .line 30
    return-object p0

    .line 31
    .line 32
    :pswitch_7
    const-string p0, "eventfd"

    .line 33
    return-object p0

    .line 34
    .line 35
    .line 36
    :pswitch_8
    const-string/jumbo p0, "socket"

    .line 37
    return-object p0

    .line 38
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static c()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    new-instance v0, Ljava/io/File;

    .line 22
    const-string v1, "/proc/self/fd"

    .line 23
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 24
    const-string v0, "RMotnior_FdLeak_ProcFdDump"

    const-string v1, "dumpFdList failed"

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/fb;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 26
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    .line 28
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/tencent/bugly/proguard/s6;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 29
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static d()I
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    const-string v1, "/proc/self/fd"

    .line 3
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    array-length v0, v0

    return v0

    :cond_0
    const v0, 0x7fffffff

    return v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 2

    .line 5
    sget-object v0, Lcom/tencent/bugly/proguard/s6;->o:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p0

    .line 6
    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7
    aget-object p0, p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    .line 8
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 9
    :catch_0
    const-string/jumbo v0, "parseMaxOpenFiles failed: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "RMotnior_FdLeak_ProcFdDump"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 22
    const-string v0, "/proc/self/limits"

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverL()Z

    move-result v0

    const-string v1, "RMotnior_FdLeak_ProcFdDump"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {p0}, Landroid/system/Os;->readlink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    sput-object v2, Lcom/tencent/bugly/proguard/s6;->q:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/tencent/bugly/proguard/s6;->q:Ljava/lang/String;

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Os.readlink("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") failed: "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 6
    :cond_0
    const-string/jumbo v0, "sh -c readlink -f "

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    :try_start_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 8
    :try_start_2
    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 9
    :try_start_3
    new-instance v4, Ljava/io/BufferedReader;

    invoke-direct {v4, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 10
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 11
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 12
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 13
    invoke-static {v4}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-exception p0

    :goto_0
    move-object v2, v4

    goto :goto_6

    :catch_1
    move-exception v5

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_6

    :catch_2
    move-exception v4

    move-object v5, v4

    move-object v4, v2

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v3, v2

    move-object v4, v3

    :goto_1
    move-object v2, v0

    goto :goto_5

    :catch_3
    move-exception v3

    move-object v5, v3

    goto :goto_2

    :catchall_3
    move-exception p0

    move-object v3, v2

    move-object v4, v3

    goto :goto_5

    :catch_4
    move-exception v0

    move-object v5, v0

    move-object v0, v2

    :goto_2
    move-object v3, v2

    move-object v4, v3

    .line 14
    :goto_3
    :try_start_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " failed: "

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 15
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 16
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 17
    invoke-static {v4}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    :goto_4
    return-object v2

    :catchall_4
    move-exception p0

    goto :goto_1

    :goto_5
    move-object v0, v2

    goto :goto_0

    .line 18
    :goto_6
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 19
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 20
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 21
    throw p0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "/proc/self/fd"

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public static g()I
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/tencent/bugly/proguard/s6;->p:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    .line 10
    .line 11
    const-string v2, "/proc/self/limits"

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    .line 16
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-string v3, "Max open files"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/tencent/bugly/proguard/s6;->d(Ljava/lang/String;)I

    .line 37
    move-result v0

    .line 38
    .line 39
    sput v0, Lcom/tencent/bugly/proguard/s6;->p:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_5

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 51
    goto :goto_4

    .line 52
    :goto_1
    move-object v6, v2

    .line 53
    move-object v2, v0

    .line 54
    move-object v0, v6

    .line 55
    goto :goto_3

    .line 56
    :catchall_1
    move-exception v2

    .line 57
    goto :goto_2

    .line 58
    :catch_1
    move-exception v2

    .line 59
    goto :goto_3

    .line 60
    :goto_2
    move-object v6, v2

    .line 61
    move-object v2, v0

    .line 62
    move-object v0, v6

    .line 63
    goto :goto_5

    .line 64
    :catchall_2
    move-exception v1

    .line 65
    move-object v2, v0

    .line 66
    move-object v0, v1

    .line 67
    move-object v1, v2

    .line 68
    goto :goto_5

    .line 69
    :catch_2
    move-exception v1

    .line 70
    move-object v2, v1

    .line 71
    move-object v1, v0

    .line 72
    .line 73
    :goto_3
    :try_start_3
    const-string v3, "RMotnior_FdLeak_ProcFdDump"

    .line 74
    .line 75
    const-string v4, "get fd max count failed"

    .line 76
    .line 77
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v3, v4, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 87
    .line 88
    :goto_4
    sget v0, Lcom/tencent/bugly/proguard/s6;->p:I

    .line 89
    return v0

    .line 90
    .line 91
    .line 92
    :goto_5
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 96
    throw v0
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final a(F)Ljava/lang/String;
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v1

    float-to-int p1, p1

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/Map;FLjava/io/BufferedWriter;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/proguard/t5;",
            ">;F",
            "Ljava/io/BufferedWriter;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 3
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/t5;

    .line 4
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/t5;->d()I

    move-result v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/s6;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/t5;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/t5;->a()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, p2

    invoke-virtual {p0, v4}, Lcom/tencent/bugly/proguard/s6;->a(F)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    .line 6
    const-string v3, "%s,%d,%s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {p3, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->newLine()V

    .line 9
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/t5;->c()Ljava/util/List;

    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/v5;

    .line 11
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/v5;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/v5;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "%s,%d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {p3, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;
    .locals 5

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/s6;->c()Ljava/util/List;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/s6;->h:Lcom/tencent/rmonitor/fd/cluser/FdCluster;

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_5

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    const/4 v2, 0x0

    .line 5
    :try_start_0
    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, p1}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    :try_start_1
    new-instance v4, Ljava/io/BufferedWriter;

    invoke-direct {v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7
    :try_start_2
    invoke-virtual {p0, v1, v0, v4}, Lcom/tencent/bugly/proguard/s6;->a(Ljava/util/Map;FLjava/io/BufferedWriter;)V

    .line 8
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->flush()V

    .line 9
    invoke-virtual {p0, p1, v1}, Lcom/tencent/bugly/proguard/z0;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 11
    invoke-static {v4}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    move-object v2, v4

    goto :goto_4

    :goto_1
    move-object v2, v3

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v4, v2

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v4, v2

    goto :goto_3

    :catch_2
    move-exception p1

    move-object v4, v2

    .line 12
    :goto_2
    :try_start_3
    const-string v0, "RMotnior_FdLeak_ProcFdDump"

    const-string v1, "dump failed"

    .line 13
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v3, v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/z0;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 15
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 16
    invoke-static {v4}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    return-object p1

    :catchall_3
    move-exception p1

    :goto_3
    move-object v3, v2

    goto :goto_0

    .line 17
    :goto_4
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 18
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l9;->a(Ljava/io/Closeable;)V

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_5
    sget-object p1, Lcom/tencent/bugly/proguard/s6;->q:Ljava/lang/String;

    const/16 v0, 0xb

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/z0;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1
.end method
