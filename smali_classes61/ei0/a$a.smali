.class public abstract Lei0/a$a;
.super Landroid/os/Binder;
.source "IAdvertisingIdService.java"

# interfaces
.implements Lei0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei0/a$a$a;
    }
.end annotation


# direct methods
.method public static b(Landroid/os/IBinder;)Lei0/a;
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    const-string v0, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    instance-of v1, v0, Lei0/a;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Lei0/a;

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_1
    new-instance v0, Lei0/a$a$a;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0}, Lei0/a$a$a;-><init>(Landroid/os/IBinder;)V

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static c()Lei0/a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lei0/a$a$a;->b:Lei0/a;

    .line 3
    return-object v0
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
.end method
