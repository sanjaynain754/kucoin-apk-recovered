.class public Lgi0/f$a;
.super Ljava/lang/Object;
.source "GmsImpl.java"

# interfaces
.implements Lgi0/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi0/f;->b(Lfi0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgi0/f;


# direct methods
.method public constructor <init>(Lgi0/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lgi0/f$a;->a:Lgi0/f;

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
    invoke-static {p1}, Lei0/a$a;->b(Landroid/os/IBinder;)Lei0/a;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Lei0/a;->isLimitAdTrackingEnabled(Z)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "User has disabled advertising identifier"

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lei0/a;->getId()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
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
