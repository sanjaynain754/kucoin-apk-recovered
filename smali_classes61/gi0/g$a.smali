.class public Lgi0/g$a;
.super Ljava/lang/Object;
.source "HuaweiImpl.java"

# interfaces
.implements Lgi0/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi0/g;->b(Lfi0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgi0/g;


# direct methods
.method public constructor <init>(Lgi0/g;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lgi0/g$a;->a:Lgi0/g;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lthird/sdk/oaid/OAIDException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService$Stub;->asInterface(Landroid/os/IBinder;)Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService;->isOaidTrackLimited()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService;->getOaid()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    new-instance p1, Lthird/sdk/oaid/OAIDException;

    .line 18
    .line 19
    const-string v0, "User has disabled advertising identifier"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Lthird/sdk/oaid/OAIDException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
