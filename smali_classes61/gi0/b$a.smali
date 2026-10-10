.class public Lgi0/b$a;
.super Ljava/lang/Object;
.source "CoolpadImpl.java"

# interfaces
.implements Lgi0/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi0/b;->b(Lfi0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgi0/b;


# direct methods
.method public constructor <init>(Lgi0/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lgi0/b$a;->a:Lgi0/b;

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
    invoke-static {p1}, Lthird/sdk/com/coolpad/deviceidsupport/IDeviceIdManager$Stub;->asInterface(Landroid/os/IBinder;)Lthird/sdk/com/coolpad/deviceidsupport/IDeviceIdManager;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lgi0/b$a;->a:Lgi0/b;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lgi0/b;->c(Lgi0/b;)Landroid/content/Context;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Lthird/sdk/com/coolpad/deviceidsupport/IDeviceIdManager;->getOAID(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    new-instance p1, Lthird/sdk/oaid/OAIDException;

    .line 24
    .line 25
    const-string v0, "IDeviceIdManager is null"

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Lthird/sdk/oaid/OAIDException;-><init>(Ljava/lang/String;)V

    .line 29
    throw p1
    .line 30
.end method
