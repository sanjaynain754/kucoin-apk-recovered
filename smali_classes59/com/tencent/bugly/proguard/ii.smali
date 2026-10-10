.class public Lcom/tencent/bugly/proguard/ii;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final i:J = 0xea60L

.field public static final j:Ljava/lang/String; = "300400"

.field public static final k:Ljava/lang/String; = "300401"

.field public static final l:Ljava/lang/String; = "RMonitor_launch_warm"


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/b0;

.field public b:Z

.field public c:J

.field public d:J

.field public e:Z

.field public f:I

.field public g:I

.field public h:J


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/b0;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->b:Z

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    .line 11
    .line 12
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/ii;->d:J

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 17
    .line 18
    iput v0, p0, Lcom/tencent/bugly/proguard/ii;->g:I

    .line 19
    .line 20
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/ii;->h:J

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ii;->a:Lcom/tencent/bugly/proguard/b0;

    .line 23
    return-void
    .line 24
    .line 25
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->b:Z

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->h:J

    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->d:J

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/h$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->c()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/a0;)Z
    .locals 2

    .line 3
    iget v0, p0, Lcom/tencent/bugly/proguard/ii;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/tencent/bugly/proguard/a0;->c:Lcom/tencent/bugly/proguard/a0;

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ii;->a:Lcom/tencent/bugly/proguard/b0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/b0;->e()Lcom/tencent/bugly/proguard/a0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/ii;->a(Lcom/tencent/bugly/proguard/a0;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->h()V

    .line 20
    :cond_0
    return-void
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
.end method

.method public final c()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/ii;->d:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    .line 10
    .line 11
    iget v0, p0, Lcom/tencent/bugly/proguard/ii;->g:I

    .line 12
    const/4 v1, 0x1

    .line 13
    add-int/2addr v0, v1

    .line 14
    .line 15
    iput v0, p0, Lcom/tencent/bugly/proguard/ii;->g:I

    .line 16
    .line 17
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->b:Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ii;->a:Lcom/tencent/bugly/proguard/b0;

    .line 23
    .line 24
    sget-object v1, Lcom/tencent/bugly/proguard/b0$b;->c:Lcom/tencent/bugly/proguard/b0$b;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b0;->a(Lcom/tencent/bugly/proguard/b0$b;)V

    .line 28
    return-void
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
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->b:Z

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
.end method

.method public final e()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public f()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->a()V

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 16
    return-void
    .line 17
.end method

.method public g()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/ii;->f:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->e()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ii;->i()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public h()V
    .locals 9

    .line 1
    .line 2
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    .line 3
    .line 4
    .line 5
    const-wide/32 v0, 0xea60

    .line 6
    .line 7
    cmp-long v0, v4, v0

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    cmp-long v3, v4, v1

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ii;->a:Lcom/tencent/bugly/proguard/b0;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/ii;->d:J

    .line 20
    .line 21
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/ii;->h:J

    .line 22
    .line 23
    .line 24
    const-string/jumbo v1, "warm_launch"

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/bugly/proguard/b0;->a(Ljava/lang/String;JJJ)V

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_0
    if-ltz v0, :cond_1

    .line 31
    .line 32
    const-string v0, "300401"

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    cmp-long v0, v4, v1

    .line 36
    .line 37
    if-gez v0, :cond_2

    .line 38
    .line 39
    const-string v0, "300400"

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    .line 43
    :goto_0
    if-eqz v0, :cond_3

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ii;->a:Lcom/tencent/bugly/proguard/b0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/tencent/bugly/proguard/d0;->b()Lcom/tencent/bugly/proguard/d0;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0, v1}, Lcom/tencent/bugly/proguard/d0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    :cond_3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 62
    .line 63
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 67
    move-result-object v7

    .line 68
    .line 69
    const-string v8, "]"

    .line 70
    .line 71
    const-string v3, "RMonitor_launch_warm"

    .line 72
    .line 73
    .line 74
    const-string/jumbo v4, "reportWarmCost has invalid data of launchType["

    .line 75
    .line 76
    .line 77
    const-string/jumbo v5, "warm_launch"

    .line 78
    .line 79
    const-string v6, "], warmCostInMs["

    .line 80
    .line 81
    .line 82
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 87
    :goto_1
    const/4 v0, 0x0

    .line 88
    .line 89
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    .line 90
    return-void
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
.end method

.method public final i()V
    .locals 3

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->h:J

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/ii;->b:Z

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->d:J

    .line 10
    .line 11
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/ii;->e:Z

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ii;->c:J

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method
