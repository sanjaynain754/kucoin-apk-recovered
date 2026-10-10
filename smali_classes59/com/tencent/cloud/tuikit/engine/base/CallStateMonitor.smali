.class public Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;
.super Ljava/lang/Object;
.source "CallStateMonitor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;,
        Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;,
        Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;
    }
.end annotation


# static fields
.field private static final ANDROID_BUILD_VERSION_S:I = 0x1f

.field private static final CALL_STATE_CONNECTED:I = 0x3

.field private static final CALL_STATE_DISCONNECTED:I = 0x4

.field private static final TAG:Ljava/lang/String; = "CallStateMonitor"


# instance fields
.field private mAudioManager:Landroid/media/AudioManager;

.field private mAudioModeListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;

.field private mTelephonyManager:Landroid/telephony/TelephonyManager;

.field private mTelephonyStateListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    new-array p1, p1, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "CallStateMonitor"

    .line 15
    .line 16
    const-string v1, "CallStateMonitor init failed. Context is null"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    const-string v1, "audio"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Landroid/media/AudioManager;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioManager:Landroid/media/AudioManager;

    .line 31
    .line 32
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v2, 0x1f

    .line 35
    .line 36
    if-lt v1, v2, :cond_1

    .line 37
    .line 38
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p1}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;-><init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V

    .line 42
    .line 43
    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioModeListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioManager:Landroid/media/AudioManager;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Landroidx/media3/common/util/d;->a(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioModeListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/b;->a(Landroid/media/AudioManager;Ljava/util/concurrent/Executor;Landroid/media/AudioManager$OnModeChangedListener;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_1
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p0, p1}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;-><init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V

    .line 61
    .line 62
    iput-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mTelephonyStateListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;

    .line 63
    .line 64
    .line 65
    const-string/jumbo p1, "phone"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 72
    .line 73
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mTelephonyStateListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;

    .line 76
    .line 77
    const/16 v1, 0x20

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 81
    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;)Landroid/telephony/TelephonyManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    .line 3
    return-object p0
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
.method public destroy()V
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1f

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioManager:Landroid/media/AudioManager;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->mAudioModeListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/a;->a(Landroid/media/AudioManager;Landroid/media/AudioManager$OnModeChangedListener;)V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method
