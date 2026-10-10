.class final Lcom/tencent/liteav/videobase/frame/k$a;
.super Lcom/tencent/liteav/videobase/frame/PixelFrame;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/videobase/frame/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final b:Lcom/tencent/liteav/videobase/frame/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/liteav/videobase/frame/g<",
            "Lcom/tencent/liteav/videobase/frame/k$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/tencent/liteav/videobase/frame/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/videobase/frame/l;->a()Lcom/tencent/liteav/videobase/frame/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/liteav/videobase/frame/k$a;->b:Lcom/tencent/liteav/videobase/frame/g;

    .line 7
    return-void
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
.end method

.method private constructor <init>(Lcom/tencent/liteav/videobase/frame/k$b;Ljava/lang/Object;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/liteav/videobase/frame/k$a;->b:Lcom/tencent/liteav/videobase/frame/g;

    invoke-direct {p0, v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;-><init>(Lcom/tencent/liteav/videobase/frame/g;)V

    .line 3
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/j;->retain()I

    .line 4
    iget v0, p1, Lcom/tencent/liteav/videobase/frame/k$b;->c:I

    .line 5
    iput v0, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mWidth:I

    .line 6
    iget v0, p1, Lcom/tencent/liteav/videobase/frame/k$b;->d:I

    .line 7
    iput v0, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mHeight:I

    .line 8
    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/k$a;->a:Lcom/tencent/liteav/videobase/frame/k$b;

    .line 9
    iget v0, p1, Lcom/tencent/liteav/videobase/frame/k$b;->a:I

    .line 10
    iput v0, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mTextureId:I

    .line 11
    iput-object p2, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mGLContext:Ljava/lang/Object;

    .line 12
    iget p1, p1, Lcom/tencent/liteav/videobase/frame/k$b;->b:I

    const/16 p2, 0xde1

    if-ne p1, p2, :cond_0

    .line 13
    sget-object p1, Lcom/tencent/liteav/videobase/base/GLConstants$a;->b:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mPixelBufferType:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    goto :goto_0

    :cond_0
    const p2, 0x8d65

    if-ne p1, p2, :cond_1

    .line 14
    sget-object p1, Lcom/tencent/liteav/videobase/base/GLConstants$a;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mPixelBufferType:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 15
    :cond_1
    :goto_0
    sget-object p1, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/PixelFrame;->mPixelFormatType:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/liteav/videobase/frame/k$b;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/videobase/frame/k$a;-><init>(Lcom/tencent/liteav/videobase/frame/k$b;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videobase/frame/k$a;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/videobase/frame/k$a;->a:Lcom/tencent/liteav/videobase/frame/k$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/frame/j;->release()V

    .line 6
    return-void
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
    .line 25
.end method


# virtual methods
.method public final setTextureId(I)V
    .locals 1

    .line 1
    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 3
    .line 4
    const-string v0, "Object is allocated by pool, can\'t change its Buffer"

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw p1
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
    .line 25
.end method
