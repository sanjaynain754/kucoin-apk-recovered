.class public Lcom/tencent/bugly/proguard/nc$c;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/nc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/nc;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/nc;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nc$c;->b:Lcom/tencent/bugly/proguard/nc;

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
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "RMonitor_looper_metric"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "regular Collect Task run"

    .line 8
    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->c()J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 22
    move-result-wide v2

    .line 23
    .line 24
    iget-object v4, p0, Lcom/tencent/bugly/proguard/nc$c;->b:Lcom/tencent/bugly/proguard/nc;

    .line 25
    .line 26
    iget-wide v4, v4, Lcom/tencent/bugly/proguard/nc;->j:J

    .line 27
    sub-long/2addr v2, v4

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 31
    move-result-wide v2

    .line 32
    .line 33
    cmp-long v0, v2, v0

    .line 34
    .line 35
    if-ltz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc$c;->b:Lcom/tencent/bugly/proguard/nc;

    .line 38
    .line 39
    const-string v1, "longTime"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/nc;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc$c;->b:Lcom/tencent/bugly/proguard/nc;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/tencent/bugly/proguard/nc;->c:Lcom/tencent/bugly/proguard/kc;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->d()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kc;->c()Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nc$c;->b:Lcom/tencent/bugly/proguard/nc;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nc;->d()V

    .line 66
    :cond_1
    return-void
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
.end method
