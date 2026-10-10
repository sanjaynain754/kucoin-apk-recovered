.class public Lcom/tencent/bugly/proguard/bh;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/bh$c;,
        Lcom/tencent/bugly/proguard/bh$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}"

.field public static final b:Ljava/lang/String; = "-{5}\\send\\s\\d+\\s-{5}"

.field public static final c:Ljava/lang/String; = "Cmd\\sline:\\s(\\S+)"

.field public static final d:Ljava/lang/String; = "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*"

.field public static final e:Ljava/lang/String; = "yyyy-MM-dd HH:mm:ss"


# direct methods
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
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/bh$c;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/bh$c;-><init>()V

    .line 2
    new-instance v2, Lcom/tencent/bugly/proguard/bh$a;

    invoke-direct {v2, v1, p0, p2}, Lcom/tencent/bugly/proguard/bh$a;-><init>(Lcom/tencent/bugly/proguard/bh$c;Ljava/lang/String;Z)V

    invoke-static {p1, v2}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/bh$d;)V

    .line 3
    iget-wide p0, v1, Lcom/tencent/bugly/proguard/bh$c;->a:J

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-lez p0, :cond_1

    iget-wide p0, v1, Lcom/tencent/bugly/proguard/bh$c;->c:J

    cmp-long p0, p0, v2

    if-lez p0, :cond_1

    iget-object p0, v1, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    if-eqz p0, :cond_1

    return-object v1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static a(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 4
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "path:%s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 5
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/bh$c;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/bh$c;-><init>()V

    .line 6
    new-instance v2, Lcom/tencent/bugly/proguard/bh$b;

    invoke-direct {v2, v1, p1}, Lcom/tencent/bugly/proguard/bh$b;-><init>(Lcom/tencent/bugly/proguard/bh$c;Z)V

    invoke-static {p0, v2}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/bh$d;)V

    .line 7
    iget-wide p0, v1, Lcom/tencent/bugly/proguard/bh$c;->a:J

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-lez p0, :cond_1

    iget-wide p0, v1, Lcom/tencent/bugly/proguard/bh$c;->c:J

    cmp-long p0, p0, v2

    if-lez p0, :cond_1

    iget-object p0, v1, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    if-eqz p0, :cond_1

    return-object v1

    .line 8
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, v1, Lcom/tencent/bugly/proguard/bh$c;->a:J

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Lcom/tencent/bugly/proguard/bh$c;->c:J

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v1, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "first dump error %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static a(Ljava/io/BufferedReader;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 83
    :goto_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 84
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 86
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Lcom/tencent/bugly/proguard/bh$d;)V
    .locals 16

    move-object/from16 v1, p0

    const-string v6, "\\s"

    if-eqz v1, :cond_b

    if-nez p1, :cond_0

    goto/16 :goto_8

    .line 9
    :cond_0
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_8

    .line 11
    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 12
    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v4

    move-object/from16 v0, p1

    .line 13
    invoke-interface/range {v0 .. v5}, Lcom/tencent/bugly/proguard/bh$d;->a(Ljava/lang/String;JJ)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_8

    :cond_2
    const/4 v1, 0x0

    .line 14
    :try_start_0
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/FileReader;

    invoke-direct {v0, v7}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v8, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    const-string v0, "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    .line 16
    const-string v0, "-{5}\\send\\s\\d+\\s-{5}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v9

    .line 17
    const-string v0, "Cmd\\sline:\\s(\\S+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    .line 18
    const-string v0, "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    .line 19
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string/jumbo v0, "yyyy-MM-dd HH:mm:ss"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v12, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 20
    :cond_3
    :goto_0
    filled-new-array {v7}, [Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 21
    filled-new-array {v10}, [Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-static {v8, v1}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v13, 0x0

    if-nez v1, :cond_4

    .line 22
    const-string v0, "Failed to find process name."

    new-array v1, v13, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :try_start_2
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 24
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :catch_1
    move-exception v0

    goto/16 :goto_2

    :cond_4
    const/4 v14, 0x1

    .line 26
    :try_start_3
    aget-object v0, v0, v14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x2

    .line 27
    aget-object v2, v0, v15

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x4

    aget-object v5, v0, v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x5

    aget-object v0, v0, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 29
    aget-object v0, v1, v14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 31
    invoke-virtual {v0, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    invoke-virtual {v0, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    move-wide v1, v2

    move-wide v3, v4

    move-object v5, v0

    move-object/from16 v0, p1

    .line 33
    invoke-interface/range {v0 .. v5}, Lcom/tencent/bugly/proguard/bh$d;->a(JJLjava/lang/String;)Z

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_5

    .line 34
    :try_start_4
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    return-void

    :catch_2
    move-exception v0

    .line 35
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_8

    .line 37
    :cond_5
    :try_start_5
    filled-new-array {v11, v9}, [Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 38
    aget-object v1, v0, v13

    if-ne v1, v11, :cond_6

    .line 39
    aget-object v0, v0, v14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 40
    const-string v1, "\".+\""

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 41
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 43
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v14

    invoke-virtual {v1, v14, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 45
    const-string v2, "NATIVE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    .line 46
    const-string/jumbo v2, "tid=\\d+"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 47
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 49
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    .line 50
    const-string v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v14

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 52
    invoke-static {v8}, Lcom/tencent/bugly/proguard/bh;->b(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-static {v8}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    .line 54
    invoke-interface/range {v0 .. v5}, Lcom/tencent/bugly/proguard/bh$d;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v2, v0

    if-nez v1, :cond_5

    .line 55
    :try_start_6
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    return-void

    :catch_3
    move-exception v0

    .line 56
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 57
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_8

    :cond_6
    move-object/from16 v2, p1

    .line 58
    :try_start_7
    aget-object v0, v0, v14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 59
    aget-object v0, v0, v15

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 60
    invoke-interface {v2, v0, v1}, Lcom/tencent/bugly/proguard/bh$d;->a(J)Z

    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-nez v0, :cond_3

    .line 61
    :try_start_8
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    return-void

    :catch_4
    move-exception v0

    .line 62
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 63
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_8

    :cond_7
    move-object/from16 v2, p1

    goto/16 :goto_0

    .line 64
    :cond_8
    :try_start_9
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    return-void

    :catch_5
    move-exception v0

    .line 65
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_5

    :goto_1
    move-object v1, v0

    goto :goto_6

    :goto_2
    move-object v1, v8

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_6
    move-exception v0

    goto :goto_4

    :goto_3
    move-object v8, v1

    goto :goto_1

    .line 66
    :goto_4
    :try_start_a
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 67
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    :cond_9
    const-string/jumbo v2, "trace open fail:%s : %s"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 69
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-eqz v1, :cond_b

    .line 70
    :try_start_b
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    goto :goto_8

    :catch_7
    move-exception v0

    .line 71
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 72
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_8

    :goto_6
    if-eqz v8, :cond_a

    .line 73
    :try_start_c
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    goto :goto_7

    :catch_8
    move-exception v0

    .line 74
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 75
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    :cond_a
    :goto_7
    throw v1

    :cond_b
    :goto_8
    return-void
.end method

.method public static varargs a(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 78
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p1, v3

    .line 79
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 80
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 81
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static b(Ljava/io/BufferedReader;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    const/4 v2, 0x3

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    .line 19
    :cond_0
    const-string v3, "\n"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    return-object p0
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
.end method
