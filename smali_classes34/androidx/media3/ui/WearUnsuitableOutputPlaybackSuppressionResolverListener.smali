.class public final Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;
.super Ljava/lang/Object;
.source "WearUnsuitableOutputPlaybackSuppressionResolverListener.java"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# static fields
.field public static final DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS:J

.field private static final EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT:Ljava/lang/String; = "EXTRA_CLOSE_ON_CONNECT"

.field private static final EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY:Ljava/lang/String; = "EXTRA_CONNECTION_ONLY"

.field private static final EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE:Ljava/lang/String; = "android.bluetooth.devicepicker.extra.FILTER_TYPE"

.field private static final EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME:Ljava/lang/String; = "com.android.settings.panel.extra.PACKAGE_NAME"

.field private static final FILTER_TYPE_AUDIO:I = 0x1

.field private static final OUTPUT_SWITCHER_INTENT_ACTION_NAME:Ljava/lang/String; = "com.android.settings.panel.action.MEDIA_OUTPUT"

.field private static final WAKE_LOCK_TAG:Ljava/lang/String; = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock"


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private final autoResumeTimeoutAfterUnsuitableOutputSuppressionMs:J

.field private final clock:Landroidx/media3/common/util/Clock;

.field private unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

.field private final wakeLock:Landroid/os/PowerManager$WakeLock;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    const-wide/16 v1, 0x5

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    sput-wide v0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS:J

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-wide v0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS:J

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;-><init>(Landroid/content/Context;J)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;J)V
    .locals 1
    .param p2    # J
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 2
    sget-object v0, Landroidx/media3/common/util/Clock;->DEFAULT:Landroidx/media3/common/util/Clock;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;-><init>(Landroid/content/Context;JLandroidx/media3/common/util/Clock;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;JLandroidx/media3/common/util/Clock;)V
    .locals 3
    .param p2    # J
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 4
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->applicationContext:Landroid/content/Context;

    .line 6
    iput-wide p2, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->autoResumeTimeoutAfterUnsuitableOutputSuppressionMs:J

    .line 7
    iput-object p4, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->clock:Landroidx/media3/common/util/Clock;

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide p2, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

    .line 9
    const-string/jumbo p2, "power"

    .line 10
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    if-eqz p1, :cond_1

    .line 11
    const-string p2, "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock"

    invoke-virtual {p1, v2, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p1

    .line 12
    invoke-virtual {p1, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_1
    iput-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->wakeLock:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method private static getSystemOrSystemUpdatedAppComponent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result p1

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 26
    .line 27
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 37
    .line 38
    and-int/lit16 v0, v0, 0x81

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance p0, Landroid/content/ComponentName;

    .line 43
    .line 44
    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v0, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-object p0

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return-object p0
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
.end method

.method private static launchSystemMediaOutputSwitcherUi(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    const-string v1, "com.android.settings.panel.action.MEDIA_OUTPUT"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    const/high16 v1, 0x10000000

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "com.android.settings.panel.extra.PACKAGE_NAME"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->getSystemOrSystemUpdatedAppComponent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 39
    .line 40
    const-string v1, "android.settings.BLUETOOTH_SETTINGS"

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const v1, 0x10008000

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    const-string v1, "EXTRA_CLOSE_ON_CONNECT"

    .line 53
    const/4 v2, 0x1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    const-string v1, "EXTRA_CONNECTION_ONLY"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    const-string v1, "android.bluetooth.devicepicker.extra.FILTER_TYPE"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v0}, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->getSystemOrSystemUpdatedAppComponent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 82
    :cond_1
    return-void
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
.end method


# virtual methods
.method public onEvents(Landroidx/media3/common/Player;Landroidx/media3/common/Player$Events;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->applicationContext:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Util;->isWear(Landroid/content/Context;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x6

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroidx/media3/common/Player$Events;->contains(I)Z

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x5

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v2}, Landroidx/media3/common/Player$Events;->contains(I)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-interface {p1}, Landroidx/media3/common/Player;->getPlayWhenReady()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Landroidx/media3/common/Player;->getPlaybackSuppressionReason()I

    .line 34
    move-result v1

    .line 35
    const/4 v3, 0x3

    .line 36
    .line 37
    if-ne v1, v3, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Landroidx/media3/common/Player;->pause()V

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->clock:Landroidx/media3/common/util/Clock;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Landroidx/media3/common/util/Clock;->elapsedRealtime()J

    .line 46
    move-result-wide v0

    .line 47
    .line 48
    iput-wide v0, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 56
    move-result p1

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 61
    .line 62
    iget-wide v0, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->autoResumeTimeoutAfterUnsuitableOutputSuppressionMs:J

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p2, v2}, Landroidx/media3/common/Player$Events;->contains(I)Z

    .line 69
    move-result p1

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->applicationContext:Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->launchSystemMediaOutputSwitcherUi(Landroid/content/Context;)V

    .line 77
    return-void

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p2, v0}, Landroidx/media3/common/Player$Events;->contains(I)Z

    .line 81
    move-result p2

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Landroidx/media3/common/Player;->getPlaybackSuppressionReason()I

    .line 87
    move-result p2

    .line 88
    .line 89
    if-nez p2, :cond_4

    .line 90
    .line 91
    iget-wide v0, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    cmp-long p2, v0, v2

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget-object p2, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->clock:Landroidx/media3/common/util/Clock;

    .line 103
    .line 104
    .line 105
    invoke-interface {p2}, Landroidx/media3/common/util/Clock;->elapsedRealtime()J

    .line 106
    move-result-wide v0

    .line 107
    .line 108
    iget-wide v4, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

    .line 109
    sub-long/2addr v0, v4

    .line 110
    .line 111
    iget-wide v4, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->autoResumeTimeoutAfterUnsuitableOutputSuppressionMs:J

    .line 112
    .line 113
    cmp-long p2, v0, v4

    .line 114
    .line 115
    if-gez p2, :cond_4

    .line 116
    .line 117
    iput-wide v2, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->unsuitableOutputPlaybackSuppressionStartRealtimeMs:J

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Landroidx/media3/common/Player;->play()V

    .line 121
    .line 122
    iget-object p1, p0, Landroidx/media3/ui/WearUnsuitableOutputPlaybackSuppressionResolverListener;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 128
    :cond_4
    :goto_0
    return-void
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
.end method
