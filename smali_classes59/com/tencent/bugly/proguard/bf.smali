.class public interface abstract Lcom/tencent/bugly/proguard/bf;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/bf$b;,
        Lcom/tencent/bugly/proguard/bf$a;,
        Lcom/tencent/bugly/proguard/bf$e;,
        Lcom/tencent/bugly/proguard/bf$c;,
        Lcom/tencent/bugly/proguard/bf$d;
    }
.end annotation


# static fields
.field public static final A:I = 0xd4

.field public static final B:I = 0xd5

.field public static final C:I = 0xd7

.field public static final D:I = 0xd8

.field public static final E:I = 0xd9

.field public static final F:I = 0xdb

.field public static final G:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final H:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final I:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final J:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final K:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final L:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final M:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final N:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final O:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final P:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final Q:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final R:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final S:I

.field public static final T:I

.field public static final U:I

.field public static final V:I

.field public static final W:I

.field public static final X:I

.field public static final a:I = 0x64

.field public static final b:I = 0x65

.field public static final c:I = 0x66

.field public static final d:I = 0x67

.field public static final e:I = 0x68

.field public static final f:I = 0x69
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:I = 0x6a
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:I = 0x6a

.field public static final i:I = 0x6b

.field public static final j:I = 0x6c
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final k:I = 0x6d
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final l:I = 0x6d

.field public static final m:I = 0x6e

.field public static final n:I = 0x6f

.field public static final o:I = 0x70

.field public static final p:I = 0x71

.field public static final q:I = 0xd6

.field public static final r:I = 0xc9

.field public static final s:I = 0xca

.field public static final t:I = 0xcb

.field public static final u:I = 0xcd

.field public static final v:I = 0xcf

.field public static final w:I = 0xd0

.field public static final x:I = 0xd1

.field public static final y:I = 0xd2

.field public static final z:I = 0xd3


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "activity_leak"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lcom/tencent/bugly/proguard/bf;->G:I

    .line 9
    .line 10
    const-string v0, "io"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Lcom/tencent/bugly/proguard/bf;->H:I

    .line 17
    .line 18
    const-string v0, "db"

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Lcom/tencent/bugly/proguard/bf;->I:I

    .line 25
    .line 26
    const-string v0, "looper_stack"

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Lcom/tencent/bugly/proguard/bf;->J:I

    .line 33
    .line 34
    const-string v0, "looper_metric"

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 38
    move-result v1

    .line 39
    .line 40
    sput v1, Lcom/tencent/bugly/proguard/bf;->K:I

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 44
    move-result v0

    .line 45
    .line 46
    sput v0, Lcom/tencent/bugly/proguard/bf;->L:I

    .line 47
    .line 48
    const-string v0, "fd_leak"

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 52
    move-result v0

    .line 53
    .line 54
    sput v0, Lcom/tencent/bugly/proguard/bf;->M:I

    .line 55
    .line 56
    .line 57
    const-string/jumbo v0, "native_memory"

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 61
    move-result v0

    .line 62
    .line 63
    sput v0, Lcom/tencent/bugly/proguard/bf;->N:I

    .line 64
    .line 65
    const-string v0, "big_bitmap"

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 69
    move-result v0

    .line 70
    .line 71
    sput v0, Lcom/tencent/bugly/proguard/bf;->O:I

    .line 72
    .line 73
    .line 74
    const-string/jumbo v0, "work_thread_lag"

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 78
    move-result v0

    .line 79
    .line 80
    sput v0, Lcom/tencent/bugly/proguard/bf;->P:I

    .line 81
    .line 82
    .line 83
    const-string/jumbo v0, "traffic"

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 87
    move-result v0

    .line 88
    .line 89
    sput v0, Lcom/tencent/bugly/proguard/bf;->Q:I

    .line 90
    .line 91
    .line 92
    const-string/jumbo v0, "traffic_detail"

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Lcom/tencent/bugly/proguard/de;->a(Ljava/lang/String;)I

    .line 96
    move-result v0

    .line 97
    .line 98
    sput v0, Lcom/tencent/bugly/proguard/bf;->R:I

    .line 99
    .line 100
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->OFF:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 104
    move-result v0

    .line 105
    .line 106
    sput v0, Lcom/tencent/bugly/proguard/bf;->S:I

    .line 107
    .line 108
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 112
    move-result v0

    .line 113
    .line 114
    sput v0, Lcom/tencent/bugly/proguard/bf;->T:I

    .line 115
    .line 116
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 120
    move-result v0

    .line 121
    .line 122
    sput v0, Lcom/tencent/bugly/proguard/bf;->U:I

    .line 123
    .line 124
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 128
    move-result v0

    .line 129
    .line 130
    sput v0, Lcom/tencent/bugly/proguard/bf;->V:I

    .line 131
    .line 132
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 136
    move-result v0

    .line 137
    .line 138
    sput v0, Lcom/tencent/bugly/proguard/bf;->W:I

    .line 139
    .line 140
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 144
    move-result v0

    .line 145
    .line 146
    sput v0, Lcom/tencent/bugly/proguard/bf;->X:I

    .line 147
    return-void
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
