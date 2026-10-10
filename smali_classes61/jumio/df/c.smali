.class public final Ljumio/df/c;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Lcom/jumio/core/processor/ProcessorState$TakePicture;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/String;

.field public e:Lcom/jumio/core/camera/CameraConnectionData;

.field public f:Lcom/jumio/core/data/document/CornerPoints;

.field public g:Z

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/df/c;->i:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/df/c;->h:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Ljumio/df/c;->j:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Ljumio/df/c;->j:I

    .line 10
    .line 11
    iget-object v0, p0, Ljumio/df/c;->i:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v8, p0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v0 .. v8}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->access$handleTakeImageState(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lcom/jumio/core/processor/ProcessorState$TakePicture;Ljava/util/List;Ljava/lang/String;ZLcom/jumio/core/camera/CameraConnectionData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
