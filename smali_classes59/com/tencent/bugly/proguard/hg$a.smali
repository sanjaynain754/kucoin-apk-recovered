.class public Lcom/tencent/bugly/proguard/hg$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/hg;->onResume(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/hg;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/hg;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

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
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    const-string v1, "last_pause_time"

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iget-object v4, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

    .line 15
    .line 16
    iget-object v4, v4, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    const-string v5, "last_pause_activity_name"

    .line 19
    .line 20
    const-string v6, ""

    .line 21
    .line 22
    .line 23
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    move-result-wide v5

    .line 29
    .line 30
    cmp-long v2, v0, v2

    .line 31
    .line 32
    if-ltz v2, :cond_0

    .line 33
    .line 34
    sub-long v2, v5, v0

    .line 35
    .line 36
    iget-object v7, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

    .line 37
    .line 38
    iget-wide v8, v7, Lcom/tencent/bugly/proguard/hg;->b:J

    .line 39
    .line 40
    cmp-long v2, v2, v8

    .line 41
    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/hg;->e()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    iget-object v3, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

    .line 49
    const/4 v7, 0x1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2, v7}, Lcom/tencent/bugly/proguard/hg;->a(Ljava/lang/String;Z)V

    .line 53
    .line 54
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 55
    .line 56
    new-instance v7, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string/jumbo v8, "new session, session_id: "

    .line 60
    .line 61
    .line 62
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, ", threshold: "

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v2, p0, Lcom/tencent/bugly/proguard/hg$a;->b:Lcom/tencent/bugly/proguard/hg;

    .line 73
    .line 74
    iget-wide v8, v2, Lcom/tencent/bugly/proguard/hg;->b:J

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v2, ", currentTime: "

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v2, ", lastPauseTime: "

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v0, ", lastPauseActName: "

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    const-string v1, "RMonitor_SessionManager"

    .line 108
    .line 109
    .line 110
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 115
    :cond_0
    return-void
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
