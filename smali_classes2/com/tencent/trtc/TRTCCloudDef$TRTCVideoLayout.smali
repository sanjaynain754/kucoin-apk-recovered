.class public Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/trtc/TRTCCloudDef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TRTCVideoLayout"
.end annotation


# instance fields
.field public backgroundColor:I

.field public fillMode:I

.field public fixedVideoStreamType:I

.field public fixedVideoUser:Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;

.field public height:I

.field public placeHolderImage:Ljava/lang/String;

.field public width:I

.field public x:I

.field public y:I

.field public zOrder:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->x:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->y:I

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->width:I

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->height:I

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->zOrder:I

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->fillMode:I

    .line 17
    .line 18
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->backgroundColor:I

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    iput-object v1, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->placeHolderImage:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;-><init>()V

    .line 28
    .line 29
    iput-object v1, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->fixedVideoUser:Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;

    .line 30
    .line 31
    iput v0, p0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;->fixedVideoStreamType:I

    .line 32
    return-void
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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
