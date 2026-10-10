.class public interface abstract Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService;
.super Ljava/lang/Object;
.source "OpenDeviceIdentifierService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService$Stub;,
        Lthird/sdk/com/uodis/opendevice/aidl/OpenDeviceIdentifierService$Default;
    }
.end annotation


# virtual methods
.method public abstract getOaid()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract isOaidTrackLimited()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
