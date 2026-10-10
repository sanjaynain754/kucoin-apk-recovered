.class public Lcom/tencent/bugly/proguard/l5$b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/l5;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/l5;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/l5;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/l5$b;->b:Lcom/tencent/bugly/proguard/l5;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "Check and upload exit info."

    .line 6
    .line 7
    .line 8
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->b()I

    .line 12
    move-result v1

    .line 13
    .line 14
    const/16 v2, 0x1e

    .line 15
    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 21
    .line 22
    const-string v2, "Api level is lower than 30, cannot get app exit info."

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v2, "application_exit"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    instance-of v2, v1, Lcom/tencent/bugly/proguard/j5;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    check-cast v1, Lcom/tencent/bugly/proguard/j5;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/j5;->c()Z

    .line 46
    move-result v2

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lcom/tencent/bugly/proguard/l5;->a(Z)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/j5;->b()D

    .line 53
    move-result-wide v1

    .line 54
    .line 55
    sput-wide v1, Lcom/tencent/bugly/proguard/l5;->D:D

    .line 56
    .line 57
    .line 58
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l5;->a()Z

    .line 59
    move-result v1

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    const-string v1, "App exit info disable."

    .line 64
    .line 65
    new-array v0, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_0

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    const-string v2, "activity"

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    check-cast v1, Landroid/app/ActivityManager;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    .line 92
    const-string/jumbo v3, "setProcessStateSummary"

    .line 93
    .line 94
    const-class v4, [B

    .line 95
    .line 96
    .line 97
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 98
    move-result-object v4

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    sget-object v3, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    .line 107
    .line 108
    const-string v4, "UTF-8"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 112
    move-result-object v3

    .line 113
    .line 114
    .line 115
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    :cond_3
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l5$b;->b:Lcom/tencent/bugly/proguard/l5;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l5;->g()V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Lcom/tencent/bugly/common/utils/ProcessUtil;->isMainProcess(Landroid/content/Context;)Z

    .line 132
    move-result v2

    .line 133
    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5$b;->b:Lcom/tencent/bugly/proguard/l5;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l5;->d()V

    .line 140
    .line 141
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5$b;->b:Lcom/tencent/bugly/proguard/l5;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/l5;->a(Landroid/app/ActivityManager;)V

    .line 145
    .line 146
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5$b;->b:Lcom/tencent/bugly/proguard/l5;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l5;->c()V

    .line 150
    return-void

    .line 151
    .line 152
    :cond_4
    const-string v1, "Not main process, do not check exit info."

    .line 153
    .line 154
    new-array v0, v0, [Ljava/lang/Object;

    .line 155
    .line 156
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 157
    .line 158
    .line 159
    invoke-static {v2, v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    return-void

    .line 161
    .line 162
    :goto_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 166
    return-void
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
