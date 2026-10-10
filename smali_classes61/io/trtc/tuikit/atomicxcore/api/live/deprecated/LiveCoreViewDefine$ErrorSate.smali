.class public final Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorSate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ErrorSate"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorSate;",
        "",
        "()V",
        "errorInfo",
        "Landroidx/lifecycle/LiveData;",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;",
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
.field public final errorInfo:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ErrorSate;->errorInfo:Landroidx/lifecycle/LiveData;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
