.class public final Lcom/tencent/liteav/audio2/e;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/audio2/c$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/audio2/e$a;,
        Lcom/tencent/liteav/audio2/e$b;
    }
.end annotation


# static fields
.field static c:Lcom/tencent/liteav/audio2/c;


# instance fields
.field a:Landroid/telephony/TelephonyManager;

.field b:Landroid/media/AudioManager;

.field d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field e:Ljava/lang/Object;

.field f:Lcom/tencent/liteav/base/util/m;

.field g:I

.field private h:Lcom/tencent/liteav/audio2/e$b;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1a

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/liteav/audio2/c;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lcom/tencent/liteav/audio2/c;-><init>()V

    .line 12
    .line 13
    sput-object v0, Lcom/tencent/liteav/audio2/e;->c:Lcom/tencent/liteav/audio2/c;

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/tencent/liteav/audio2/e$b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/audio2/e;->g:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/liteav/audio2/e;->h:Lcom/tencent/liteav/audio2/e$b;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    const-string/jumbo v0, "phone"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/tencent/liteav/audio2/e;->a:Landroid/telephony/TelephonyManager;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string v0, "audio"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    check-cast p1, Landroid/media/AudioManager;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/tencent/liteav/audio2/e;->b:Landroid/media/AudioManager;

    .line 40
    .line 41
    new-instance p1, Lcom/tencent/liteav/base/util/m;

    .line 42
    .line 43
    const/16 v0, 0x3c

    .line 44
    .line 45
    const-string v1, "PhoneStateManager"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0, v1}, Lcom/tencent/liteav/base/util/m;-><init>(ILjava/lang/String;)V

    .line 49
    .line 50
    iput-object p1, p0, Lcom/tencent/liteav/audio2/e;->f:Lcom/tencent/liteav/base/util/m;

    .line 51
    return-void
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

.method public static synthetic a(Lcom/tencent/liteav/audio2/e;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/audio2/e;->d()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/audio2/e;Ljava/lang/Runnable;)V
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/tencent/liteav/audio2/e;->f:Lcom/tencent/liteav/base/util/m;

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/audio2/e;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/audio2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/audio2/e;->d()V

    return-void
.end method

.method public static b()Z
    .locals 6

    .line 2
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    .line 3
    :try_start_0
    const-string v3, "android.permission.READ_PHONE_STATE"

    .line 4
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v5

    .line 5
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    return v2

    :cond_1
    return v1

    :catchall_0
    move-exception v0

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "check permission exception, "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "PhoneStateManager"

    invoke-static {v3, v0, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method

.method public static synthetic c(Lcom/tencent/liteav/audio2/e;)Lcom/tencent/liteav/audio2/e$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/audio2/e;->h:Lcom/tencent/liteav/audio2/e$b;

    return-object p0
.end method

.method public static c()V
    .locals 3

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/liteav/audio2/e;->c:Lcom/tencent/liteav/audio2/c;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "PhoneStateManager"

    const-string/jumbo v2, "unregister audio playback callback."

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    sget-object v0, Lcom/tencent/liteav/audio2/e;->c:Lcom/tencent/liteav/audio2/c;

    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lcom/tencent/liteav/audio2/c;->a:Lcom/tencent/liteav/audio2/c$a;

    :cond_1
    :goto_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->h:Lcom/tencent/liteav/audio2/e$b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/tencent/liteav/audio2/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v2}, Landroid/media/AudioManager;->getMode()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    .line 4
    iput-boolean v2, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    .line 5
    invoke-interface {v0}, Lcom/tencent/liteav/audio2/e$b;->onInterruptedByPhoneCall()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 6
    :cond_1
    iget-boolean v2, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    if-eqz v2, :cond_2

    .line 7
    iput-boolean v1, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    .line 8
    invoke-interface {v0}, Lcom/tencent/liteav/audio2/e$b;->onResumedByPhoneCall()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    return-void

    .line 9
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "get Mode exception, "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PhoneStateManager"

    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lcom/tencent/liteav/audio2/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/audio2/e;->i:Z

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->f:Lcom/tencent/liteav/base/util/m;

    invoke-static {p0}, Lcom/tencent/liteav/audio2/g;->a(Lcom/tencent/liteav/audio2/e;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/liteav/base/util/m;->b(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final onCallStateChanged(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object p2, p0, Lcom/tencent/liteav/audio2/e;->h:Lcom/tencent/liteav/audio2/e$b;

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/audio2/e;->g:I

    .line 8
    .line 9
    if-ne v0, p1, :cond_1

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/audio2/e;->g:I

    .line 13
    const/4 v0, 0x2

    .line 14
    .line 15
    if-ne p1, v0, :cond_2

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Lcom/tencent/liteav/audio2/e$b;->onInterruptedByPhoneCall()V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_2
    if-nez p1, :cond_3

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Lcom/tencent/liteav/audio2/e$b;->onResumedByPhoneCall()V

    .line 25
    :cond_3
    :goto_0
    return-void
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
