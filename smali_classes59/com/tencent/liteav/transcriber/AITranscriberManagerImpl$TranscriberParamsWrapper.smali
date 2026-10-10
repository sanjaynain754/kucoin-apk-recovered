.class Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TranscriberParamsWrapper"
.end annotation


# instance fields
.field private a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;->a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;

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
.method public getSourceLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;->a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;->sourceLanguage:Ljava/lang/String;

    .line 5
    return-object v0
    .line 6
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
.end method

.method public getTranscriberRobotId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;->a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;->transcriberRobotId:Ljava/lang/String;

    .line 5
    return-object v0
    .line 6
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
.end method

.method public getTranslationLanguages()[Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;->a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;->translationLanguages:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    new-array v1, v1, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, [Ljava/lang/String;

    .line 18
    return-object v0
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
.end method

.method public getUserIdsToTranscribe()[Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/transcriber/AITranscriberManagerImpl$TranscriberParamsWrapper;->a:Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/transcriber/AITranscriberManager$TranscriberParams;->userIdsToTranscribe:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    new-array v1, v1, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, [Ljava/lang/String;

    .line 18
    return-object v0
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
.end method
