.class public Lcom/google/firebase/perf/logging/AndroidLogger;
.super Ljava/lang/Object;
.source "AndroidLogger.java"


# static fields
.field private static volatile instance:Lcom/google/firebase/perf/logging/AndroidLogger;


# instance fields
.field private isLogcatEnabled:Z

.field private final logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/google/firebase/perf/logging/AndroidLogger;-><init>(Lcom/google/firebase/perf/logging/LogWrapper;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/perf/logging/LogWrapper;)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-nez p1, :cond_0

    .line 3
    invoke-static {}, Lcom/google/firebase/perf/logging/LogWrapper;->getInstance()Lcom/google/firebase/perf/logging/LogWrapper;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    return-void
.end method

.method public static getInstance()Lcom/google/firebase/perf/logging/AndroidLogger;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/firebase/perf/logging/AndroidLogger;->instance:Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/google/firebase/perf/logging/AndroidLogger;->instance:Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lcom/google/firebase/perf/logging/AndroidLogger;-><init>()V

    .line 17
    .line 18
    sput-object v1, Lcom/google/firebase/perf/logging/AndroidLogger;->instance:Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    .line 27
    :cond_1
    :goto_2
    sget-object v0, Lcom/google/firebase/perf/logging/AndroidLogger;->instance:Lcom/google/firebase/perf/logging/AndroidLogger;

    .line 28
    return-object v0
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
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs debug(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->e(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs error(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->e(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public info(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs info(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public isLogcatEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    .line 3
    return v0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setLogcatEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    .line 3
    return-void
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
.end method

.method public verbose(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->v(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs verbose(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->v(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public warn(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->w(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs warn(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->isLogcatEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/firebase/perf/logging/AndroidLogger;->logWrapper:Lcom/google/firebase/perf/logging/LogWrapper;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/logging/LogWrapper;->w(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
