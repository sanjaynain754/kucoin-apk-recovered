.class public final Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
.super Lcom/squareup/wire/Message$Builder;
.source "AudioEntity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/AudioEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message$Builder<",
        "Lcom/opensource/svgaplayer/proto/AudioEntity;",
        "Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field public audioKey:Ljava/lang/String;

.field public endFrame:Ljava/lang/Integer;

.field public startFrame:Ljava/lang/Integer;

.field public startTime:Ljava/lang/Integer;

.field public totalTime:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/squareup/wire/Message$Builder;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public audioKey(Ljava/lang/String;)Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->audioKey:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public build()Lcom/opensource/svgaplayer/proto/AudioEntity;
    .locals 7

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/AudioEntity;

    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->audioKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->startFrame:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->endFrame:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->startTime:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->totalTime:Ljava/lang/Integer;

    invoke-super {p0}, Lcom/squareup/wire/Message$Builder;->buildUnknownFields()Lokio/ByteString;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/opensource/svgaplayer/proto/AudioEntity;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)V

    return-object v0
.end method

.method public bridge synthetic build()Lcom/squareup/wire/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->build()Lcom/opensource/svgaplayer/proto/AudioEntity;

    move-result-object v0

    return-object v0
.end method

.method public endFrame(Ljava/lang/Integer;)Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->endFrame:Ljava/lang/Integer;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public startFrame(Ljava/lang/Integer;)Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->startFrame:Ljava/lang/Integer;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public startTime(Ljava/lang/Integer;)Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->startTime:Ljava/lang/Integer;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public totalTime(Ljava/lang/Integer;)Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/AudioEntity$Builder;->totalTime:Ljava/lang/Integer;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
