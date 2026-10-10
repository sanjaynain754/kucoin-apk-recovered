.class public final Ljumio/df/i;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;


# direct methods
.method public constructor <init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/df/i;->b:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljumio/df/i;

    .line 3
    .line 4
    iget-object v1, p0, Ljumio/df/i;->b:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Ljumio/df/i;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Ljumio/df/i;->a:Ljava/lang/Object;

    .line 10
    return-object v0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Landroid/graphics/Bitmap;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Ljumio/df/i;

    .line 7
    .line 8
    iget-object v1, p0, Ljumio/df/i;->b:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Ljumio/df/i;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Ljumio/df/i;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljumio/df/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/df/i;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/graphics/Bitmap;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    iget-object p1, p0, Ljumio/df/i;->b:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->access$getDocumentClassifier$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->recognizeMultiHeadOutput(Landroid/graphics/Bitmap;)Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
