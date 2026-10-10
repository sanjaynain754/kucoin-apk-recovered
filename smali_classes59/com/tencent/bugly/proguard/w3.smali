.class public Lcom/tencent/bugly/proguard/w3;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static a:Lcom/tencent/rmonitor/custom/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public static a()Lcom/tencent/rmonitor/custom/a;
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/w3;->a:Lcom/tencent/rmonitor/custom/a;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/w3;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/w3;->a:Lcom/tencent/rmonitor/custom/a;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/rmonitor/custom/a;

    invoke-direct {v1}, Lcom/tencent/rmonitor/custom/a;-><init>()V

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/qe$a;->a()Lcom/tencent/bugly/proguard/qe;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/qe;->d()Lcom/tencent/bugly/proguard/r9;

    move-result-object v2

    .line 7
    iput-object v2, v1, Lcom/tencent/rmonitor/custom/a;->h:Lcom/tencent/bugly/proguard/r9;

    .line 8
    sput-object v1, Lcom/tencent/bugly/proguard/w3;->a:Lcom/tencent/rmonitor/custom/a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 10
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/w3;->a:Lcom/tencent/rmonitor/custom/a;

    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/s9;)Lcom/tencent/rmonitor/custom/a;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 11
    :cond_0
    invoke-interface {p0}, Lcom/tencent/bugly/proguard/s9;->a()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    new-instance v0, Lcom/tencent/rmonitor/custom/a;

    invoke-direct {v0}, Lcom/tencent/rmonitor/custom/a;-><init>()V

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 15
    invoke-static {p0, v0, v2}, Lcom/tencent/bugly/proguard/w3;->a(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V
    .locals 2

    .line 16
    sget-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->NUMBER_PARAM_KEYS:[Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/i2;->a([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    .line 17
    invoke-interface {p0, p2, v0, v1}, Lcom/tencent/bugly/proguard/s9;->a(Ljava/lang/String;D)D

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Lcom/tencent/rmonitor/custom/a;->putNumberParam(Ljava/lang/String;D)Z

    return-void

    .line 18
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->STRING_PARAM_KEYS:[Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/i2;->a([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 19
    invoke-interface {p0, p2, v1}, Lcom/tencent/bugly/proguard/s9;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lcom/tencent/rmonitor/custom/a;->putStringParam(Ljava/lang/String;Ljava/lang/String;)Z

    return-void

    .line 20
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->STRING_ARRAY_PARAM_KEYS:[Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/i2;->a([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/w3;->c(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V

    return-void

    .line 22
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/custom/a;->l:[Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/i2;->a([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/w3;->b(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V

    return-void

    .line 24
    :cond_3
    const-string/jumbo v0, "user_data_"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0xa

    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, p2, v1}, Lcom/tencent/bugly/proguard/s9;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lcom/tencent/rmonitor/custom/a;->putUserData(Ljava/lang/String;Ljava/lang/String;)Z

    :cond_4
    return-void
.end method

.method public static b()Lcom/tencent/rmonitor/custom/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/rmonitor/custom/a;

    invoke-direct {v0}, Lcom/tencent/rmonitor/custom/a;-><init>()V

    return-object v0
.end method

.method public static b(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p2, v0}, Lcom/tencent/bugly/proguard/s9;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 5
    invoke-virtual {p1, p2, v0}, Lcom/tencent/rmonitor/custom/a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Lcom/tencent/bugly/proguard/s9;Lcom/tencent/rmonitor/custom/a;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p2, v0}, Lcom/tencent/bugly/proguard/s9;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lcom/tencent/rmonitor/custom/a;->addStringToStringArrayParam(Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
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
.end method
