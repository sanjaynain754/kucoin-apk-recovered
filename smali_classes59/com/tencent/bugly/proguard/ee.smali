.class public interface abstract Lcom/tencent/bugly/proguard/ee;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final A:[Ljava/lang/String;

.field public static final a:Ljava/lang/String; = "looper_stack"

.field public static final b:Ljava/lang/String; = "looper_metric"

.field public static final c:Ljava/lang/String; = "looper_metric"

.field public static final d:Ljava/lang/String; = "memory_quantile"

.field public static final e:Ljava/lang/String; = "sub_memory_quantile"

.field public static final f:Ljava/lang/String; = "db"

.field public static final g:Ljava/lang/String; = "io"

.field public static final h:Ljava/lang/String; = "activity_leak"

.field public static final i:Ljava/lang/String; = "java_memory_ceiling_hprof"

.field public static final j:Ljava/lang/String; = "battery"

.field public static final k:Ljava/lang/String; = "device"

.field public static final l:Ljava/lang/String; = "fd_leak"

.field public static final m:Ljava/lang/String; = "big_bitmap"

.field public static final n:Ljava/lang/String; = "native_memory"

.field public static final o:Ljava/lang/String; = "launch_metric"

.field public static final p:Ljava/lang/String; = "work_thread_lag"

.field public static final q:Ljava/lang/String; = "traffic"

.field public static final r:Ljava/lang/String; = "traffic_detail"

.field public static final s:Ljava/lang/String; = "net_quality"

.field public static final t:Ljava/lang/String; = "battery_metric"

.field public static final u:Ljava/lang/String; = "battery_ele_metric"

.field public static final v:Ljava/lang/String; = "battery_element"

.field public static final w:Ljava/lang/String; = "asan"

.field public static final x:Ljava/lang/String; = "page_launch"

.field public static final y:Ljava/lang/String; = "custom_event"

.field public static final z:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 25

    .line 1
    .line 2
    .line 3
    const-string/jumbo v23, "page_launch"

    .line 4
    .line 5
    const-string v24, "custom_event"

    .line 6
    .line 7
    const-string v1, "looper_stack"

    .line 8
    .line 9
    const-string v2, "looper_metric"

    .line 10
    .line 11
    const-string v3, "memory_quantile"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v4, "sub_memory_quantile"

    .line 15
    .line 16
    const-string v5, "db"

    .line 17
    .line 18
    const-string v6, "io"

    .line 19
    .line 20
    const-string v7, "activity_leak"

    .line 21
    .line 22
    const-string v8, "java_memory_ceiling_hprof"

    .line 23
    .line 24
    const-string v9, "battery"

    .line 25
    .line 26
    const-string v10, "device"

    .line 27
    .line 28
    const-string v11, "fd_leak"

    .line 29
    .line 30
    const-string v12, "big_bitmap"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v13, "native_memory"

    .line 34
    .line 35
    const-string v14, "launch_metric"

    .line 36
    .line 37
    .line 38
    const-string/jumbo v15, "work_thread_lag"

    .line 39
    .line 40
    .line 41
    const-string/jumbo v16, "traffic"

    .line 42
    .line 43
    .line 44
    const-string/jumbo v17, "traffic_detail"

    .line 45
    .line 46
    .line 47
    const-string/jumbo v18, "net_quality"

    .line 48
    .line 49
    const-string v19, "battery_metric"

    .line 50
    .line 51
    const-string v20, "battery_ele_metric"

    .line 52
    .line 53
    const-string v21, "battery_element"

    .line 54
    .line 55
    const-string v22, "asan"

    .line 56
    .line 57
    .line 58
    filled-new-array/range {v1 .. v24}, [Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    sput-object v0, Lcom/tencent/bugly/proguard/ee;->z:[Ljava/lang/String;

    .line 62
    .line 63
    const-string v8, "battery_ele_metric"

    .line 64
    .line 65
    const-string v9, "custom_event"

    .line 66
    .line 67
    const-string v1, "device"

    .line 68
    .line 69
    const-string v2, "looper_metric"

    .line 70
    .line 71
    const-string v3, "launch_metric"

    .line 72
    .line 73
    const-string v4, "memory_quantile"

    .line 74
    .line 75
    .line 76
    const-string/jumbo v5, "sub_memory_quantile"

    .line 77
    .line 78
    .line 79
    const-string/jumbo v6, "traffic"

    .line 80
    .line 81
    const-string v7, "battery_metric"

    .line 82
    .line 83
    .line 84
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    sput-object v0, Lcom/tencent/bugly/proguard/ee;->A:[Ljava/lang/String;

    .line 88
    return-void
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
