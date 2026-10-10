.class public abstract Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService$Stub;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"

.field static final TRANSACTION_GETOAID:I = 0x1

.field static final TRANSACTION_ISOAIDTRACKLIMITED:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService$Stub$Proxy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/huawei/hms/ads/identifier/aidl/OpenDeviceIdentifierService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 6
    return-object v0
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
.end method
