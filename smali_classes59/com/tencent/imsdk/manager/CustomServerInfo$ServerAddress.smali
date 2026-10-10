.class public Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;
.super Ljava/lang/Object;
.source "CustomServerInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/imsdk/manager/CustomServerInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ServerAddress"
.end annotation


# instance fields
.field public ip:Ljava/lang/String;

.field public isIPv6:Z

.field public isQuic:Z

.field public isTLS:Z

.field public port:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;->ip:Ljava/lang/String;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;->port:I

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;->isIPv6:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;->isQuic:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/CustomServerInfo$ServerAddress;->isTLS:Z

    .line 17
    return-void
.end method
