.class public Lcom/tencent/bugly/proguard/te;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/te$j;,
        Lcom/tencent/bugly/proguard/te$n;,
        Lcom/tencent/bugly/proguard/te$a;,
        Lcom/tencent/bugly/proguard/te$b;,
        Lcom/tencent/bugly/proguard/te$d;,
        Lcom/tencent/bugly/proguard/te$m;,
        Lcom/tencent/bugly/proguard/te$i;,
        Lcom/tencent/bugly/proguard/te$f;,
        Lcom/tencent/bugly/proguard/te$k;,
        Lcom/tencent/bugly/proguard/te$g;,
        Lcom/tencent/bugly/proguard/te$c;,
        Lcom/tencent/bugly/proguard/te$e;,
        Lcom/tencent/bugly/proguard/te$h;,
        Lcom/tencent/bugly/proguard/te$l;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "RMonitor_manager_Property"

.field public static e:Lcom/tencent/bugly/proguard/te;


# instance fields
.field public final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/tencent/bugly/proguard/z9;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/tencent/bugly/proguard/v9;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/tencent/bugly/proguard/w9;",
            ">;"
        }
    .end annotation
.end field


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
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/util/SparseArray;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/te;->a:Landroid/util/SparseArray;

    .line 13
    .line 14
    new-instance v1, Landroid/util/SparseArray;

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/tencent/bugly/proguard/te;->b:Landroid/util/SparseArray;

    .line 22
    .line 23
    new-instance v2, Landroid/util/SparseArray;

    .line 24
    const/4 v3, 0x3

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3}, Landroid/util/SparseArray;-><init>(I)V

    .line 28
    .line 29
    iput-object v2, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    .line 30
    .line 31
    new-instance v2, Lcom/tencent/bugly/proguard/te$j;

    .line 32
    .line 33
    .line 34
    invoke-direct {v2}, Lcom/tencent/bugly/proguard/te$j;-><init>()V

    .line 35
    .line 36
    const/16 v3, 0x68

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    new-instance v4, Lcom/tencent/bugly/proguard/te$n;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$n;-><init>()V

    .line 45
    .line 46
    const/16 v5, 0x66

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 50
    .line 51
    new-instance v4, Lcom/tencent/bugly/proguard/te$a;

    .line 52
    .line 53
    .line 54
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$a;-><init>()V

    .line 55
    .line 56
    const/16 v5, 0x65

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 60
    .line 61
    new-instance v4, Lcom/tencent/bugly/proguard/te$b;

    .line 62
    .line 63
    .line 64
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$b;-><init>()V

    .line 65
    .line 66
    const/16 v5, 0x64

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    .line 71
    new-instance v4, Lcom/tencent/bugly/proguard/te$d;

    .line 72
    .line 73
    .line 74
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$d;-><init>()V

    .line 75
    .line 76
    const/16 v5, 0x67

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 80
    .line 81
    new-instance v4, Lcom/tencent/bugly/proguard/te$m;

    .line 82
    .line 83
    .line 84
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$m;-><init>()V

    .line 85
    .line 86
    const/16 v5, 0x6a

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    new-instance v4, Lcom/tencent/bugly/proguard/te$i;

    .line 92
    .line 93
    .line 94
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$i;-><init>()V

    .line 95
    .line 96
    const/16 v5, 0x71

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 100
    .line 101
    new-instance v4, Lcom/tencent/bugly/proguard/te$f;

    .line 102
    .line 103
    .line 104
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$f;-><init>()V

    .line 105
    .line 106
    const/16 v5, 0x6c

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 110
    .line 111
    new-instance v4, Lcom/tencent/bugly/proguard/te$k;

    .line 112
    .line 113
    .line 114
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$k;-><init>()V

    .line 115
    .line 116
    const/16 v5, 0x6d

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    .line 121
    new-instance v4, Lcom/tencent/bugly/proguard/te$g;

    .line 122
    .line 123
    .line 124
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$g;-><init>()V

    .line 125
    .line 126
    const/16 v5, 0x6e

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 130
    .line 131
    new-instance v4, Lcom/tencent/bugly/proguard/te$c;

    .line 132
    .line 133
    .line 134
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/te$c;-><init>()V

    .line 135
    .line 136
    const/16 v5, 0x70

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 143
    .line 144
    new-instance v0, Lcom/tencent/bugly/proguard/te$e;

    .line 145
    .line 146
    .line 147
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/te$e;-><init>()V

    .line 148
    .line 149
    const/16 v2, 0x6b

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    .line 154
    new-instance v0, Lcom/tencent/bugly/proguard/te$h;

    .line 155
    .line 156
    .line 157
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/te$h;-><init>()V

    .line 158
    .line 159
    const/16 v2, 0xd6

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 163
    .line 164
    new-instance v0, Lcom/tencent/bugly/proguard/te$l;

    .line 165
    .line 166
    .line 167
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/te$l;-><init>()V

    .line 168
    .line 169
    const/16 v2, 0x6f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/te;->b()V

    .line 176
    return-void
    .line 177
.end method

.method public static a()Lcom/tencent/bugly/proguard/te;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/te;->e:Lcom/tencent/bugly/proguard/te;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/te;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/te;->e:Lcom/tencent/bugly/proguard/te;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/te;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/te;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/te;->e:Lcom/tencent/bugly/proguard/te;

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
    sget-object v0, Lcom/tencent/bugly/proguard/te;->e:Lcom/tencent/bugly/proguard/te;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/tencent/bugly/proguard/v9;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/v9;

    return-object p1
.end method

.method public b(I)Lcom/tencent/bugly/proguard/w9;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/w9;

    return-object p1
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->ioTracerListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IIoTracerListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xcf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->dbTracerListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IDBTracerListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->memoryLeakListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xc9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->memoryCeilingListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xca

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->dropFrameListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IDropFrameListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xcb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->looperListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/ILooperListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xcd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->bigBitmapListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->fdLeakListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->natMemListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->deviceInfoListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/IDeviceInfoListener;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->batteryListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/bugly/proguard/f8;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->pluginStateListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/bugly/proguard/p9;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->customDataCollector:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->customDataCollectorForIssue:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xd9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/tencent/bugly/proguard/za;

    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->memoryPeakListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    const-class v3, Lcom/tencent/bugly/proguard/i9;

    invoke-direct {v1, v3, v2}, Lcom/tencent/bugly/proguard/za;-><init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V

    const/16 v2, 0xdb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public c(I)Lcom/tencent/bugly/proguard/z9;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/te;->a:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lcom/tencent/bugly/proguard/z9;

    .line 9
    return-object p1
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
