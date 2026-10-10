.class public Lcom/tencent/bugly/proguard/u$c;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/u;->q()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/u;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/u;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/u$c;->b:Lcom/tencent/bugly/proguard/u;

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
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u$c;->b:Lcom/tencent/bugly/proguard/u;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/u;->c(Lcom/tencent/bugly/proguard/u;)Lcom/tencent/bugly/proguard/l2;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-array v0, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "Found foreground anr, resend sigquit immediately."

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->resendSigquit()V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u$c;->b:Lcom/tencent/bugly/proguard/u;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/u;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 34
    .line 35
    new-array v0, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 38
    .line 39
    const-string v2, "Finish handling one anr."

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    return-void

    .line 44
    .line 45
    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v3, "Found background anr, resend sigquit later."

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 51
    .line 52
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u$c;->b:Lcom/tencent/bugly/proguard/u;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/u;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 56
    .line 57
    new-array v0, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 60
    .line 61
    const-string v2, "Finish handling one anr, now resend sigquit."

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->resendSigquit()V

    .line 72
    return-void
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
