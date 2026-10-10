.class public final Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;
.super Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;


# instance fields
.field private final l1111l111111Il:Landroid/content/Context;

.field private l111l11111I1l:Landroid/content/ServiceConnection;

.field private final l111l11111lIl:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111lIl:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 12
    .line 13
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl$1;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl$1;-><init>(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111I1l:Landroid/content/ServiceConnection;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private l1111l111111Il(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 2
    const-string v0, "com.huawei.hwid"

    invoke-direct {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "com.huawei.hms"

    invoke-direct {p0, p1, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    const-string v1, "com.huawei.hwid.tv"

    invoke-direct {p0, p1, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method

.method public static synthetic l1111l111111Il(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111lIl:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method private l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-static {p1, p2}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111lIl(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static l1111l111111Il(Ljava/lang/String;)Z
    .locals 2

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "0"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "-"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0
.end method

.method private static l111l11111lIl(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x80

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    :cond_1
    :goto_0
    return-object v1
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
.end method


# virtual methods
.method public final l1111l111111Il()Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "com.huawei.hwid.tv"

    const-string v1, "com.huawei.hms"

    const-string v2, "com.huawei.hwid"

    const-string v3, ""

    :try_start_0
    iget-object v4, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, "pps_oaid"

    invoke-static {v4, v5}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const-string v5, "0"

    invoke-virtual {v4, v5, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "-"

    invoke-virtual {v5, v7, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    :goto_0
    if-nez v5, :cond_1

    return-object v4

    :cond_1
    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.uodis.opendevice.OPENIDS_SERVICE"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    invoke-direct {p0, v5, v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-direct {p0, v5, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-direct {p0, v5, v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_3
    move-object v0, v2

    :goto_1
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111I1l:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v4, v1, v6}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111lIl:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v4, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-interface {v0, v6, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v2}, Landroid/os/Parcel;->readException()V

    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v0, 0x0

    :goto_2
    :try_start_6
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111I1l:Landroid/content/ServiceConnection;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object v0

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    :try_start_8
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111I1l:Landroid/content/ServiceConnection;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v0

    :catch_1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Landroid/content/Context;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l111l11111I1l:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_5

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_5
    return-object v3
.end method
