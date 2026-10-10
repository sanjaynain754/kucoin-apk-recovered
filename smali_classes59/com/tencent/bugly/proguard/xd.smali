.class public Lcom/tencent/bugly/proguard/xd;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/wd;


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_init"


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


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    .line 2
    const-string v0, "looper_stack"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/tencent/rmonitor/looper/LooperMonitor;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/tencent/rmonitor/looper/LooperMonitor;-><init>()V

    .line 14
    return-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string/jumbo v0, "work_thread_lag"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p1, Lcom/tencent/bugly/proguard/ti;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/ti;-><init>()V

    .line 29
    return-object p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
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
.end method

.method public final b(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    .line 2
    const-string v0, "activity_leak"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/cc$b;->a()Lcom/tencent/bugly/proguard/cc;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    const-string v0, "big_bitmap"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/bugly/proguard/r1;->a()Lcom/tencent/bugly/proguard/r1;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    const-string v0, "fd_leak"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/rmonitor/fd/FdLeakMonitor$b;->a()Lcom/tencent/rmonitor/fd/FdLeakMonitor;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    .line 42
    :cond_2
    const-string/jumbo v0, "native_memory"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    .line 55
    :cond_3
    const-string v0, "java_memory_ceiling_hprof"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/tencent/bugly/proguard/sb;->b()Lcom/tencent/bugly/proguard/sb;

    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_4
    const-string v0, "asan"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    move-result p1

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/tencent/bugly/proguard/m;->b()Lcom/tencent/bugly/proguard/m;

    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_5
    const/4 p1, 0x0

    .line 81
    return-object p1
.end method

.method public final c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    .line 2
    const-string v0, "looper_metric"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/tencent/bugly/proguard/t4;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/t4;-><init>()V

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    const-string v0, "memory_quantile"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    new-instance p1, Lcom/tencent/bugly/proguard/gc;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/gc;-><init>()V

    .line 28
    return-object p1

    .line 29
    .line 30
    .line 31
    :cond_1
    const-string/jumbo v0, "sub_memory_quantile"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    new-instance p1, Lcom/tencent/bugly/proguard/gc;

    .line 40
    .line 41
    .line 42
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/gc;-><init>()V

    .line 43
    return-object p1

    .line 44
    .line 45
    :cond_2
    const-string v0, "custom_event"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result p1

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    new-instance p1, Lcom/tencent/bugly/proguard/z3;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/z3;-><init>()V

    .line 57
    return-object p1

    .line 58
    :cond_3
    const/4 p1, 0x0

    .line 59
    return-object p1
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

.method public createPlugin(Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    iget-object p1, p1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->pluginName:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    return-object v0

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/xd;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/xd;->a(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    :cond_2
    if-nez v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/xd;->b(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    :cond_3
    if-nez v0, :cond_4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/xd;->e(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    :cond_4
    if-nez v0, :cond_5

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/xd;->d(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    :cond_5
    if-nez v0, :cond_6

    .line 44
    .line 45
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 46
    .line 47
    const-string v2, "create plugin fail {"

    .line 48
    .line 49
    .line 50
    const-string/jumbo v3, "}"

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p1, v3}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    const-string v2, "RMonitor_init"

    .line 57
    .line 58
    .line 59
    filled-new-array {v2, p1}, [Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 64
    :cond_6
    return-object v0
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

.method public final d(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "page_launch"

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    move-result p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lcom/tencent/bugly/proguard/td;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/td;-><init>()V

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final e(Ljava/lang/String;)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "traffic"

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lcom/tencent/bugly/proguard/hh;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/hh;-><init>()V

    .line 15
    return-object p1

    .line 16
    .line 17
    .line 18
    :cond_0
    const-string/jumbo v0, "traffic_detail"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance p1, Lcom/tencent/bugly/proguard/eh;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/eh;-><init>()V

    .line 30
    return-object p1

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string/jumbo v0, "net_quality"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    new-instance p1, Lcom/tencent/bugly/proguard/id;

    .line 42
    .line 43
    .line 44
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/id;-><init>()V

    .line 45
    return-object p1

    .line 46
    .line 47
    :cond_2
    const-string v0, "battery_element"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    new-instance p1, Lcom/tencent/bugly/proguard/i1;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/i1;-><init>()V

    .line 59
    return-object p1

    .line 60
    .line 61
    :cond_3
    const-string v0, "battery_ele_metric"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    new-instance p1, Lcom/tencent/bugly/proguard/h1;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/h1;-><init>()V

    .line 73
    return-object p1

    .line 74
    .line 75
    :cond_4
    const-string v0, "battery_metric"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    new-instance p1, Lcom/tencent/bugly/proguard/n1;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/n1;-><init>()V

    .line 87
    return-object p1

    .line 88
    :cond_5
    const/4 p1, 0x0

    .line 89
    return-object p1
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
