.class public final Lio/trtc/tuikit/atomicxcore/impl/common/e;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/common/e;->a:I

    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/common/e;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x1781

    :goto_0
    if-nez p2, :cond_1

    .line 4
    const-string p2, ""

    .line 5
    :cond_1
    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 7
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/common/e;->a:I

    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/common/e;->b:Ljava/lang/String;

    return-void
.end method
