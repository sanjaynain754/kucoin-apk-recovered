.class public Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;
.super Ljava/lang/Object;
.source "SDKConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/imsdk/manager/SDKConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DeviceInfo"
.end annotation


# instance fields
.field public deviceBrand:J

.field public deviceType:Ljava/lang/String;

.field public systemVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;->deviceType:Ljava/lang/String;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;->deviceBrand:J

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;->systemVersion:Ljava/lang/String;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method
