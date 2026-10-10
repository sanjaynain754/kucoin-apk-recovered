.class public Lcom/tencent/bugly/proguard/h2$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/h2;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h2$a;->b:Landroid/content/Context;

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
    .locals 6

    .line 1
    .line 2
    :try_start_0
    const-string v0, "Start to check emulator."

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->m0:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    const-string v1, "emulator_modify_time"

    .line 17
    .line 18
    const-wide/16 v2, -0x1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    move-result-wide v4

    .line 27
    .line 28
    cmp-long v2, v0, v2

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    .line 33
    const-wide/32 v2, 0xf731400

    .line 34
    .line 35
    sub-long v2, v4, v2

    .line 36
    .line 37
    cmp-long v0, v2, v0

    .line 38
    .line 39
    if-ltz v0, :cond_2

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    const-string v1, "emulator"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    instance-of v1, v0, Lcom/tencent/bugly/proguard/z4;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    move-object v1, v0

    .line 55
    .line 56
    check-cast v1, Lcom/tencent/bugly/proguard/z4;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/z4;->c()Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v0, Lcom/tencent/bugly/proguard/z4;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/z4;->b()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/h2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h2$a;->b:Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/tencent/bugly/proguard/h2;->c(Landroid/content/Context;)V

    .line 78
    .line 79
    const-class v0, Lcom/tencent/bugly/proguard/l2;

    .line 80
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    :try_start_2
    monitor-exit v0

    .line 84
    .line 85
    iget-object v0, v1, Lcom/tencent/bugly/proguard/l2;->m0:Landroid/content/SharedPreferences;

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    const-string v1, "emulator_modify_time"

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->m0:Landroid/content/SharedPreferences;

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    const-string v1, "emulator_confidence"

    .line 111
    .line 112
    sget v2, Lcom/tencent/bugly/proguard/h2;->c:I

    .line 113
    .line 114
    .line 115
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 120
    .line 121
    const-string v0, "emulator_reason"

    .line 122
    .line 123
    sget-object v1, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    return-void

    .line 132
    :catchall_1
    move-exception v1

    .line 133
    monitor-exit v0

    .line 134
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 138
    :cond_2
    return-void
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
