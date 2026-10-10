.class public Lcom/facebook/fresco/vito/options/b;
.super Ljava/lang/Object;
.source "EncodedImageOptions.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/fresco/vito/options/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0008B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/facebook/fresco/vito/options/b;",
        "",
        "Lcom/facebook/fresco/vito/options/b$a;",
        "builder",
        "<init>",
        "(Lcom/facebook/fresco/vito/options/b$a;)V",
        "other",
        "",
        "a",
        "(Lcom/facebook/fresco/vito/options/b;)Z",
        "",
        "hashCode",
        "()I",
        "Lw3/f$a;",
        "e",
        "()Lw3/f$a;",
        "Lcom/facebook/imagepipeline/common/Priority;",
        "Lcom/facebook/imagepipeline/common/Priority;",
        "d",
        "()Lcom/facebook/imagepipeline/common/Priority;",
        "priority",
        "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;",
        "b",
        "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;",
        "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;",
        "cacheChoice",
        "",
        "c",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "diskCacheId",
        "options_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/facebook/imagepipeline/common/Priority;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/fresco/vito/options/b$a;)V
    .locals 2
    .param p1    # Lcom/facebook/fresco/vito/options/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fresco/vito/options/b$a<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "builder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/fresco/vito/options/b$a;->c()Lcom/facebook/imagepipeline/common/Priority;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/facebook/fresco/vito/options/b$a;->a()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/facebook/fresco/vito/options/b$a;->b()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/facebook/fresco/vito/options/b$a;->a()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    sget-object v1, Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;->DYNAMIC:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 33
    .line 34
    if-ne p1, v1, :cond_1

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    new-instance p1, Lcom/facebook/imagepipeline/request/ImageRequestBuilder$BuilderException;

    .line 40
    .line 41
    const-string v0, "Disk cache id must be set for dynamic cache choice"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder$BuilderException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1

    .line 46
    .line 47
    :cond_1
    if-eqz v0, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 51
    move-result p1

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_2
    new-instance p1, Lcom/facebook/imagepipeline/request/ImageRequestBuilder$BuilderException;

    .line 57
    .line 58
    const-string v0, "Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder$BuilderException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    :cond_3
    :goto_0
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method


# virtual methods
.method public final a(Lcom/facebook/fresco/vito/options/b;)Z
    .locals 2
    .param p1    # Lcom/facebook/fresco/vito/options/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "other"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 9
    .line 10
    iget-object v1, p1, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lw3/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 19
    .line 20
    iget-object v1, p1, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lw3/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Lw3/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
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
.end method

.method public final b()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 3
    return-object v0
    .line 4
    .line 5
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
    .line 18
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
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
    .line 18
.end method

.method public final d()Lcom/facebook/imagepipeline/common/Priority;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 3
    return-object v0
    .line 4
    .line 5
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
    .line 18
.end method

.method public e()Lw3/f$a;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lw3/f;->b(Ljava/lang/Object;)Lw3/f$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "priority"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "cacheChoice"

    .line 16
    .line 17
    iget-object v2, p0, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "diskCacheId"

    .line 24
    .line 25
    iget-object v2, p0, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v1, "add(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    return-object v0
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
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/fresco/vito/options/b;->a:Lcom/facebook/imagepipeline/common/Priority;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v2, p0, Lcom/facebook/fresco/vito/options/b;->b:Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v2, p0, Lcom/facebook/fresco/vito/options/b;->c:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 34
    move-result v1

    .line 35
    :cond_2
    add-int/2addr v0, v1

    .line 36
    return v0
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
.end method
