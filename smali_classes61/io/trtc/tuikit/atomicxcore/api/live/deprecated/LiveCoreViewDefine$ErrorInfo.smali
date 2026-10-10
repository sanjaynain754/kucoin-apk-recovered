.class public final Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ErrorInfo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0017\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;",
        "",
        "()V",
        "error",
        "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;",
        "message",
        "",
        "(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public error:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public message:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;->error:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 6
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;->error:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 7
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;->message:Ljava/lang/String;

    return-void
.end method
