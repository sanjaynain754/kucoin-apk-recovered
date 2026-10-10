.class public Lcom/tencent/bugly/proguard/k3$d;
.super Ljava/lang/Thread;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/k3;->a(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lcom/tencent/bugly/proguard/k3;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/k3;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/k3$d;->b:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->h()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-wide/16 v1, 0x2710

    .line 12
    .line 13
    const-string v3, "local_crash_lock"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v3, v1, v2}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;Ljava/lang/String;J)Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-array v0, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v1, "Failed to lock file for uploading local crash."

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/k3$d;->b:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->checkSaveRecordCrash()V

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->n()V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->a()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/tencent/bugly/proguard/cg$b;->a()Lcom/tencent/bugly/proguard/cg;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/cg;->c()V

    .line 57
    .line 58
    new-array v0, v1, [Ljava/lang/Object;

    .line 59
    .line 60
    const-string v2, "check db and upload record."

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 64
    .line 65
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j3;->b()Ljava/util/List;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 77
    move-result v2

    .line 78
    .line 79
    if-lez v2, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 83
    move-result v1

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 94
    .line 95
    const-string v4, "Size of crash list need to upload: %s"

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v4, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 99
    .line 100
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/util/List;)V

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_2
    new-array v0, v1, [Ljava/lang/Object;

    .line 107
    .line 108
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 109
    .line 110
    .line 111
    const-string/jumbo v2, "no crash need to be uploaded at this start."

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 115
    .line 116
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$d;->c:Lcom/tencent/bugly/proguard/k3;

    .line 117
    .line 118
    iget-object v0, v0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/bi;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 122
    return-void
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
