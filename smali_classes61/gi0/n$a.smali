.class public Lgi0/n$a;
.super Ljava/lang/Object;
.source "OppoImpl.java"

# interfaces
.implements Lgi0/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi0/n;->b(Lfi0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgi0/n;


# direct methods
.method public constructor <init>(Lgi0/n;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lgi0/n$a;->a:Lgi0/n;

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
    :try_start_0
    iget-object v0, p0, Lgi0/n$a;->a:Lgi0/n;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lgi0/n;->c(Lgi0/n;Landroid/os/IBinder;)Ljava/lang/String;

    .line 6
    move-result-object p1
    :try_end_0
    .catch Lthird/sdk/oaid/OAIDException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p1

    .line 8
    :catch_0
    move-exception p1

    .line 9
    goto :goto_0

    .line 10
    :catch_1
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :catch_2
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :goto_0
    new-instance v0, Lthird/sdk/oaid/OAIDException;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1}, Lthird/sdk/oaid/OAIDException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    throw v0

    .line 20
    :goto_1
    throw p1
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
