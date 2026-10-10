.class public Lcom/tencent/bugly/proguard/ta;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "BuglyPro"

.field public static final b:Ljava/lang/String; = "BuglyOA"

.field public static final c:Ljava/lang/String; = "BuglyQQ"

.field public static final d:Ljava/lang/String; = "BuglySLALaunchEvent"


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

.method public static a(JJZ)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const-string p4, "BuglyPro"

    .line 12
    :goto_0
    move-object v5, p4

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_1
    const-class p4, Lcom/tencent/bugly/proguard/l2;

    .line 16
    monitor-enter p4

    .line 17
    .line 18
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p4

    .line 20
    .line 21
    iget-boolean p4, v0, Lcom/tencent/bugly/proguard/l2;->k0:Z

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    const-string p4, "BuglyOA"

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_2
    const-string p4, "BuglyQQ"

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 33
    move-result-object p4

    .line 34
    .line 35
    new-instance v0, Lcom/tencent/bugly/proguard/ta$a;

    .line 36
    move-wide v3, p0

    .line 37
    move-wide v1, p2

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/ta$a;-><init>(JJLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, v0}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    monitor-exit p4

    .line 48
    throw p0
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
