.class public Lcom/tencent/bugly/proguard/ig;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;


# static fields
.field public static final c:Ljava/lang/String; = "SPProvider"

.field public static d:Lcom/tencent/bugly/proguard/ig;


# instance fields
.field public a:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

.field public b:Landroid/content/SharedPreferences;


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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ig;->a:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ig;->b:Landroid/content/SharedPreferences;

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

.method public static a()Lcom/tencent/bugly/proguard/ig;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/ig;->d:Lcom/tencent/bugly/proguard/ig;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/ig;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ig;->d:Lcom/tencent/bugly/proguard/ig;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/ig;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ig;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/ig;->d:Lcom/tencent/bugly/proguard/ig;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/ig;->d:Lcom/tencent/bugly/proguard/ig;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ig;->b:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 10
    const-string v0, "RMonitor_SP"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/ig;->b:Landroid/content/SharedPreferences;

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ig;->b:Landroid/content/SharedPreferences;

    return-object p1
.end method

.method public a(Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;)V
    .locals 2

    if-ne p1, p0, :cond_0

    .line 7
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "SPProvider"

    const-string/jumbo v1, "setProvider fail , can\'t set SharedPreferencesProvider self."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ig;->a:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

    return-void
.end method

.method public getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ig;->a:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_2

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    const/4 p3, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p3, 0x0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_2
    const/4 p1, 0x0

    .line 23
    return-object p1
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
