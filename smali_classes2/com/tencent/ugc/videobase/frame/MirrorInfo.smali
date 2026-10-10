.class public Lcom/tencent/ugc/videobase/frame/MirrorInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::ugc"
.end annotation


# instance fields
.field public isHorizontal:Z

.field public isVertical:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/ugc/videobase/frame/MirrorInfo;->isHorizontal:Z

    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videobase/frame/MirrorInfo;->isVertical:Z

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-boolean p1, p0, Lcom/tencent/ugc/videobase/frame/MirrorInfo;->isHorizontal:Z

    .line 6
    iput-boolean p2, p0, Lcom/tencent/ugc/videobase/frame/MirrorInfo;->isVertical:Z

    return-void
.end method
