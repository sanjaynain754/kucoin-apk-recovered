.class public final Lcr/b;
.super Ljava/lang/Object;
.source "DeviceLevelHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\"\u0010#R\u0016\u0010\'\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lcr/b;",
        "",
        "<init>",
        "()V",
        "Lcom/kubi/monitor/utils/DeviceLevel;",
        "g",
        "()Lcom/kubi/monitor/utils/DeviceLevel;",
        "Landroid/content/Context;",
        "context",
        "",
        "i",
        "(Landroid/content/Context;)V",
        "m",
        "",
        "k",
        "(Landroid/content/Context;)I",
        "j",
        "()I",
        "h",
        "d",
        "",
        "file",
        "e",
        "(Ljava/lang/String;)I",
        "cores",
        "f",
        "(I)I",
        "Ljava/io/FileInputStream;",
        "stream",
        "l",
        "(Ljava/io/FileInputStream;)I",
        "",
        "buffer",
        "index",
        "c",
        "([BI)I",
        "Lcr/c;",
        "b",
        "Lcr/c;",
        "sLevelCache",
        "",
        "Z",
        "hasInitialed",
        "Ljava/io/FileFilter;",
        "Ljava/io/FileFilter;",
        "CPU_FILTER",
        "Monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcr/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lcr/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Z

.field public static final d:Ljava/io/FileFilter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lcr/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcr/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcr/b;->a:Lcr/b;

    .line 8
    .line 9
    new-instance v1, Lcr/c;

    .line 10
    .line 11
    const/16 v9, 0x1f

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v10}, Lcr/c;-><init>(ILcom/kubi/monitor/utils/DeviceLevel;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    sput-object v1, Lcr/b;->b:Lcr/c;

    .line 25
    .line 26
    new-instance v0, Lcr/a;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcr/a;-><init>()V

    .line 30
    .line 31
    sput-object v0, Lcr/b;->d:Ljava/io/FileFilter;

    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static synthetic a(Ljava/io/File;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcr/b;->b(Ljava/io/File;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final b(Ljava/io/File;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "cpu\\d"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 10
    move-result p0

    .line 11
    return p0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public final c([BI)I
    .locals 3

    .line 1
    :goto_0
    array-length v0, p1

    .line 2
    .line 3
    if-ge p2, v0, :cond_2

    .line 4
    .line 5
    aget-byte v0, p1, p2

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    int-to-byte v1, v1

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Character;->isDigit(I)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    add-int/lit8 v0, p2, 0x1

    .line 19
    :goto_1
    array-length v1, p1

    .line 20
    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    aget-byte v1, p1, v0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sub-int/2addr v0, p2

    .line 34
    .line 35
    new-instance v1, Ljava/lang/String;

    .line 36
    .line 37
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p1, p2, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    .line 47
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 p1, -0x1

    .line 50
    return p1
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
.end method

.method public final d()I
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    const-string v1, "/sys/devices/system/cpu/"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v1, Lcr/b;->d:Ljava/io/FileFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_0
    array-length v0, v0

    .line 19
    return v0
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
.end method

.method public final e(Ljava/lang/String;)I
    .locals 6

    .line 1
    .line 2
    const-string v0, "[getCoresFromFile] error!"

    .line 3
    .line 4
    const-string v1, "Monitor::DeviceLevelHelper"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    .line 9
    .line 10
    .line 11
    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    :try_start_1
    new-instance p1, Ljava/io/BufferedReader;

    .line 14
    .line 15
    new-instance v3, Ljava/io/InputStreamReader;

    .line 16
    .line 17
    const-string v5, "UTF-8"

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    const-string v5, "[getCoresFromFile] content ! "

    .line 30
    .line 31
    .line 32
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v5}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    new-instance p1, Lkotlin/text/Regex;

    .line 44
    .line 45
    const-string v5, "0-\\d+$"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 52
    move-result p1

    .line 53
    .line 54
    if-nez p1, :cond_0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p1, 0x2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-string v3, "this as java.lang.String).substring(startIndex)"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 69
    move-result p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    add-int/lit8 v2, p1, 0x1

    .line 72
    .line 73
    .line 74
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception p1

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v0, p1}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    move-object v3, v4

    .line 83
    goto :goto_3

    .line 84
    :catch_1
    move-exception p1

    .line 85
    move-object v3, v4

    .line 86
    goto :goto_1

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 90
    return v2

    .line 91
    :catch_2
    move-exception p1

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v0, p1}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    return v2

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto :goto_3

    .line 98
    :catch_3
    move-exception p1

    .line 99
    .line 100
    .line 101
    :goto_1
    :try_start_4
    invoke-static {v1, v0, p1}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    if-nez v3, :cond_2

    .line 104
    goto :goto_2

    .line 105
    .line 106
    .line 107
    :cond_2
    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 108
    :goto_2
    return v2

    .line 109
    .line 110
    :goto_3
    if-nez v3, :cond_3

    .line 111
    goto :goto_4

    .line 112
    .line 113
    .line 114
    :cond_3
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 115
    goto :goto_4

    .line 116
    :catch_4
    move-exception v2

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v0, v2}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    :goto_4
    throw p1
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

.method public final f(I)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    .line 5
    :goto_0
    const-string v3, "Monitor::DeviceLevelHelper"

    .line 6
    .line 7
    if-ge v1, p1, :cond_2

    .line 8
    .line 9
    add-int/lit8 v4, v1, 0x1

    .line 10
    .line 11
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string v6, "/sys/devices/system/cpu/cpu"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "/cpufreq/cpuinfo_max_freq"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    new-instance v5, Ljava/io/File;

    .line 34
    .line 35
    .line 36
    invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/io/File;->canRead()Z

    .line 46
    move-result v1

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    const/16 v1, 0x80

    .line 51
    .line 52
    new-array v1, v1, [B

    .line 53
    .line 54
    new-instance v6, Ljava/io/FileInputStream;

    .line 55
    .line 56
    .line 57
    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 58
    .line 59
    .line 60
    :try_start_1
    invoke-virtual {v6, v1}, Ljava/io/FileInputStream;->read([B)I

    .line 61
    move v5, v0

    .line 62
    .line 63
    :goto_1
    aget-byte v7, v1, v5

    .line 64
    .line 65
    .line 66
    invoke-static {v7}, Ljava/lang/Character;->isDigit(I)Z

    .line 67
    move-result v7

    .line 68
    .line 69
    if-eqz v7, :cond_0

    .line 70
    .line 71
    add-int/lit8 v5, v5, 0x1

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_0
    new-instance v7, Ljava/lang/String;

    .line 75
    .line 76
    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 77
    .line 78
    .line 79
    invoke-direct {v7, v1, v0, v5, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 80
    .line 81
    const-string v1, "getCPUFreqKHz:::"

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 92
    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    add-int/2addr v2, v1

    .line 94
    .line 95
    .line 96
    :goto_2
    :try_start_2
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    :catchall_0
    :cond_1
    move v1, v4

    .line 98
    goto :goto_0

    .line 99
    :catchall_1
    move-exception p1

    .line 100
    goto :goto_3

    .line 101
    :catch_0
    move-exception v1

    .line 102
    .line 103
    .line 104
    :try_start_3
    invoke-static {v3, v1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 105
    goto :goto_2

    .line 106
    .line 107
    .line 108
    :goto_3
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    :catchall_2
    :try_start_5
    throw p1

    .line 110
    :catch_1
    move-exception p1

    .line 111
    goto :goto_5

    .line 112
    .line 113
    :cond_2
    if-nez v2, :cond_3

    .line 114
    .line 115
    new-instance p1, Ljava/io/FileInputStream;

    .line 116
    .line 117
    const-string v0, "/proc/cpuinfo"

    .line 118
    .line 119
    .line 120
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 121
    .line 122
    .line 123
    :try_start_6
    invoke-virtual {p0, p1}, Lcr/b;->l(Ljava/io/FileInputStream;)I

    .line 124
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 125
    .line 126
    mul-int/lit16 v0, v0, 0x3e8

    .line 127
    add-int/2addr v2, v0

    .line 128
    .line 129
    .line 130
    :goto_4
    :try_start_7
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 131
    goto :goto_6

    .line 132
    :catchall_3
    move-exception v0

    .line 133
    .line 134
    .line 135
    :try_start_8
    invoke-static {v3, v0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 136
    goto :goto_4

    .line 137
    :catchall_4
    move-exception v0

    .line 138
    .line 139
    .line 140
    :try_start_9
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 141
    :catchall_5
    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    .line 142
    .line 143
    .line 144
    :goto_5
    invoke-static {v3, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    const/4 v2, -0x1

    .line 146
    :catchall_6
    :cond_3
    :goto_6
    return v2
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

.method public final g()Lcom/kubi/monitor/utils/DeviceLevel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-boolean v0, Lcr/b;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lqq/i;->a:Lqq/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lqq/i;->c()Landroid/app/Application;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcr/b;->i(Landroid/content/Context;)V

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcr/b;->b:Lcr/c;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcr/c;->d()Lcom/kubi/monitor/utils/DeviceLevel;

    .line 19
    move-result-object v0

    .line 20
    return-object v0
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
.end method

.method public final h()I
    .locals 1

    .line 1
    .line 2
    :try_start_0
    const-string v0, "/sys/devices/system/cpu/possible"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcr/b;->e(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "/sys/devices/system/cpu/present"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcr/b;->e(Ljava/lang/String;)I

    .line 14
    move-result v0

    .line 15
    .line 16
    :cond_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcr/b;->d()I

    .line 20
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    const/4 v0, 0x0

    .line 23
    .line 24
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 25
    const/4 v0, 0x1

    .line 26
    :cond_2
    return v0
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final i(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "Monitor::DeviceLevelHelper"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, "initLevel context is null"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    move-result-wide v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcr/b;->k(Landroid/content/Context;)I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcr/b;->j()I

    .line 27
    move-result v3

    .line 28
    .line 29
    add-int v4, p1, v3

    .line 30
    const/4 v5, 0x1

    .line 31
    .line 32
    sput-boolean v5, Lcr/b;->c:Z

    .line 33
    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    if-lt v4, v5, :cond_1

    .line 37
    .line 38
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->BEST:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v5, 0x6

    .line 41
    .line 42
    if-lt v4, v5, :cond_2

    .line 43
    .line 44
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->HIGH:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v5, 0x4

    .line 47
    .line 48
    if-lt v4, v5, :cond_3

    .line 49
    .line 50
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->MIDDLE:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v5, 0x2

    .line 53
    .line 54
    if-le v4, v5, :cond_4

    .line 55
    .line 56
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->LOW:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_4
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->BAD:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 60
    .line 61
    :goto_0
    sget-object v6, Lcr/b;->b:Lcr/c;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v5}, Lcr/c;->i(Lcom/kubi/monitor/utils/DeviceLevel;)V

    .line 65
    .line 66
    sget-object v5, Lcr/b;->b:Lcr/c;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v4}, Lcr/c;->h(I)V

    .line 70
    .line 71
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    const-string v5, "getLevel, cost:"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    move-result-wide v5

    .line 84
    sub-long/2addr v5, v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v1, ", memLevel:"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string p1, ", cpuLevel:"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string p1, ", finalLevel:"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    sget-object p1, Lcr/b;->b:Lcr/c;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    goto :goto_2

    .line 128
    .line 129
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    if-nez p1, :cond_5

    .line 144
    goto :goto_3

    .line 145
    .line 146
    :cond_5
    new-instance v1, Lcom/kubi/monitor/utils/DeviceLevelException;

    .line 147
    .line 148
    .line 149
    invoke-direct {v1, p1}, Lcom/kubi/monitor/utils/DeviceLevelException;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v0}, Lwq/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 153
    :goto_3
    return-void
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

.method public final j()I
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcr/b;->h()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lcr/b;->f(I)I

    .line 12
    move-result v3

    .line 13
    int-to-long v3, v3

    .line 14
    .line 15
    const-wide/16 v5, 0x3e8

    .line 16
    div-long/2addr v3, v5

    .line 17
    int-to-long v5, v2

    .line 18
    .line 19
    div-long v5, v3, v5

    .line 20
    .line 21
    new-instance v7, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    const-string v8, "getNumOfCores cost:"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    move-result-wide v8

    .line 34
    sub-long/2addr v8, v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v0, ", cpuCross:"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, ", totalCpuZ:"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, ", avgCpuHz:"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    const-string v1, "Monitor::DeviceLevelHelper"

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    sget-object v0, Lcr/b;->b:Lcr/c;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v5, v6}, Lcr/c;->f(J)V

    .line 76
    .line 77
    sget-object v0, Lcr/b;->b:Lcr/c;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lcr/c;->g(I)V

    .line 81
    const/4 v0, 0x1

    .line 82
    const/4 v1, 0x4

    .line 83
    .line 84
    if-ge v2, v1, :cond_0

    .line 85
    return v0

    .line 86
    .line 87
    :cond_0
    const-wide/16 v2, 0x640

    .line 88
    .line 89
    cmp-long v2, v5, v2

    .line 90
    .line 91
    if-gez v2, :cond_1

    .line 92
    return v0

    .line 93
    .line 94
    :cond_1
    const-wide/16 v2, 0x866

    .line 95
    .line 96
    cmp-long v0, v5, v2

    .line 97
    .line 98
    if-gez v0, :cond_2

    .line 99
    const/4 v0, 0x2

    .line 100
    return v0

    .line 101
    .line 102
    :cond_2
    const-wide/16 v2, 0x8fc

    .line 103
    .line 104
    cmp-long v0, v5, v2

    .line 105
    .line 106
    if-gez v0, :cond_3

    .line 107
    const/4 v0, 0x3

    .line 108
    return v0

    .line 109
    :cond_3
    return v1
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
.end method

.method public final k(Landroid/content/Context;)I
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 10
    .line 11
    const-string v3, "activity"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz p1, :cond_5

    .line 18
    .line 19
    check-cast p1, Landroid/app/ActivityManager;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 23
    .line 24
    iget-wide v2, v2, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 25
    .line 26
    .line 27
    const-wide/32 v4, 0x40000000

    .line 28
    div-long/2addr v2, v4

    .line 29
    .line 30
    new-instance p1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v4, "getTotalMemory cost:"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    move-result-wide v4

    .line 43
    sub-long/2addr v4, v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, ", total_mem:"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v0, " GB"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    const-string v0, "Monitor::DeviceLevelHelper"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    sget-object p1, Lcr/b;->b:Lcr/c;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2, v3}, Lcr/c;->j(J)V

    .line 74
    .line 75
    const-wide/16 v0, 0x8

    .line 76
    .line 77
    cmp-long p1, v2, v0

    .line 78
    .line 79
    if-ltz p1, :cond_0

    .line 80
    const/4 p1, 0x5

    .line 81
    return p1

    .line 82
    .line 83
    :cond_0
    const-wide/16 v0, 0x6

    .line 84
    .line 85
    cmp-long p1, v2, v0

    .line 86
    .line 87
    if-ltz p1, :cond_1

    .line 88
    const/4 p1, 0x4

    .line 89
    return p1

    .line 90
    .line 91
    :cond_1
    const-wide/16 v0, 0x4

    .line 92
    .line 93
    cmp-long p1, v2, v0

    .line 94
    .line 95
    if-ltz p1, :cond_2

    .line 96
    const/4 p1, 0x3

    .line 97
    return p1

    .line 98
    .line 99
    :cond_2
    const-wide/16 v0, 0x2

    .line 100
    .line 101
    cmp-long p1, v2, v0

    .line 102
    .line 103
    if-ltz p1, :cond_3

    .line 104
    const/4 p1, 0x2

    .line 105
    return p1

    .line 106
    .line 107
    :cond_3
    const-wide/16 v0, 0x0

    .line 108
    .line 109
    cmp-long p1, v2, v0

    .line 110
    .line 111
    if-ltz p1, :cond_4

    .line 112
    const/4 p1, 0x1

    .line 113
    return p1

    .line 114
    :cond_4
    const/4 p1, 0x0

    .line 115
    return p1

    .line 116
    .line 117
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    const-string v0, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 120
    .line 121
    .line 122
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 123
    throw p1
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

.method public final l(Ljava/io/FileInputStream;)I
    .locals 7

    .line 1
    .line 2
    const/16 v0, 0x400

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :goto_0
    if-ge v1, p1, :cond_5

    .line 12
    .line 13
    aget-byte v2, v0, v1

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    int-to-byte v3, v3

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    if-nez v1, :cond_4

    .line 21
    .line 22
    :cond_0
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    :cond_1
    move v2, v1

    .line 26
    .line 27
    :goto_1
    if-ge v2, p1, :cond_4

    .line 28
    .line 29
    add-int/lit8 v3, v2, 0x1

    .line 30
    .line 31
    sub-int v4, v2, v1

    .line 32
    .line 33
    aget-byte v5, v0, v2

    .line 34
    .line 35
    const-string v6, "cpu MHz"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 39
    move-result v6

    .line 40
    int-to-byte v6, v6

    .line 41
    .line 42
    if-eq v5, v6, :cond_2

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v5, 0x6

    .line 45
    .line 46
    if-ne v4, v5, :cond_3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0, v2}, Lcr/b;->c([BI)I

    .line 50
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return p1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move v2, v3

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :goto_3
    const-string v0, "Monitor::DeviceLevelHelper"

    .line 61
    .line 62
    .line 63
    invoke-static {v0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    :cond_5
    const/4 p1, -0x1

    .line 65
    return p1
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
.end method

.method public final m()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lkotlin/Pair;

    .line 3
    .line 4
    sget-object v1, Lcr/b;->b:Lcr/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcr/c;->d()Lcom/kubi/monitor/utils/DeviceLevel;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/monitor/utils/DeviceLevel;->getValue()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    new-instance v1, Lkotlin/Pair;

    .line 24
    .line 25
    sget-object v2, Lcr/b;->b:Lcr/c;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcr/c;->e()J

    .line 29
    move-result-wide v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    const-string v3, "timeConsuming"

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    new-instance v2, Lkotlin/Pair;

    .line 41
    .line 42
    sget-object v3, Lcr/b;->b:Lcr/c;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Lcr/c;->a()J

    .line 46
    move-result-wide v3

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    const-string v4, "code"

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    new-instance v3, Lkotlin/Pair;

    .line 58
    .line 59
    sget-object v4, Lcr/b;->b:Lcr/c;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcr/c;->c()I

    .line 63
    move-result v4

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    const-string v5, "message"

    .line 70
    .line 71
    .line 72
    invoke-direct {v3, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    new-instance v4, Lkotlin/Pair;

    .line 75
    .line 76
    sget-object v5, Lcr/b;->b:Lcr/c;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Lcr/c;->b()I

    .line 80
    move-result v5

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    const-string v6, "error_msg"

    .line 87
    .line 88
    .line 89
    invoke-direct {v4, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    filled-new-array {v0, v1, v2, v3, v4}, [Lkotlin/Pair;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    const-string v1, "DeviceLevel"

    .line 96
    .line 97
    const-string v2, "Monitor"

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2, v0}, Lqq/m;->p(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 101
    return-void
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
.end method
