.class public Lcom/tencent/bugly/proguard/vb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:Ljava/lang/String; = "RMonitor_MemoryCeiling_Trigger"

.field public static final f:I = 0x14


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

.field public final c:Ljava/util/ArrayList;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/tencent/bugly/proguard/ub;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ub;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vb;->a:Ljava/lang/String;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vb;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v1, 0x14

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vb;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/bugly/proguard/vb;->d:Lcom/tencent/bugly/proguard/ub;

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(J)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 3
    .line 4
    const-string v1, "java_memory_ceiling_hprof"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginEventSampling(Ljava/lang/String;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "RMonitor_MemoryCeiling_Trigger"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string p2, "memory ceiling don\'t dump for event sample ratio"

    .line 18
    .line 19
    .line 20
    filled-new-array {v2, p2}, [Ljava/lang/String;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 25
    return v1

    .line 26
    .line 27
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->memoryCeilingListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListener()Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vb;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p1, p2}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;->onLowMemory(J)Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 46
    .line 47
    const-string p2, "memory ceiling don\'t dump for user\'s onLowMemory call back"

    .line 48
    .line 49
    .line 50
    filled-new-array {v2, p2}, [Ljava/lang/String;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 55
    return v1

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, Lcom/tencent/bugly/proguard/vb;->a:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/tencent/bugly/proguard/vb;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 67
    move-result p1

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 72
    .line 73
    const-string p2, "memory ceiling don\'t dump for scene that has dumped"

    .line 74
    .line 75
    .line 76
    filled-new-array {v2, p2}, [Ljava/lang/String;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 81
    return v1

    .line 82
    :cond_2
    const/4 p1, 0x1

    .line 83
    return p1
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

.method public b(J)V
    .locals 7

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/sb;->u:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/vb;->a(J)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 13
    .line 14
    const-string p2, "dump hprof in scene:"

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vb;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "RMonitor_MemoryCeiling_Trigger"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, p2, v0}, [Ljava/lang/String;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object p1, p0, Lcom/tencent/bugly/proguard/vb;->c:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object p2, p0, Lcom/tencent/bugly/proguard/vb;->a:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    iget-object v4, p0, Lcom/tencent/bugly/proguard/vb;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/tb;->d()Z

    .line 42
    move-result v5

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    iget v6, p1, Lcom/tencent/bugly/proguard/tb;->n:I

    .line 49
    const/4 v2, 0x1

    .line 50
    const/4 v3, 0x0

    .line 51
    .line 52
    const-string v0, "LowMemory"

    .line 53
    .line 54
    const-string v1, "LowMemory"

    .line 55
    .line 56
    .line 57
    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/lang/String;Ljava/lang/String;ZZLcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;ZI)Lcom/tencent/rmonitor/base/meta/DumpResult;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    iget-boolean p2, p1, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    .line 61
    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    iget-object p2, p0, Lcom/tencent/bugly/proguard/vb;->d:Lcom/tencent/bugly/proguard/ub;

    .line 65
    .line 66
    .line 67
    const-string/jumbo v0, "onLowMemory"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1, v0}, Lcom/tencent/bugly/proguard/ub;->a(Lcom/tencent/rmonitor/base/meta/DumpResult;Ljava/lang/String;)V

    .line 71
    :cond_1
    return-void
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
