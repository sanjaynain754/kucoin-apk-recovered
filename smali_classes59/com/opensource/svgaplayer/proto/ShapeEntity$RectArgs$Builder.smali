.class public final Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
.super Lcom/squareup/wire/Message$Builder;
.source "ShapeEntity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message$Builder<",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field public cornerRadius:Ljava/lang/Float;

.field public height:Ljava/lang/Float;

.field public width:Ljava/lang/Float;

.field public x:Ljava/lang/Float;

.field public y:Ljava/lang/Float;


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
.method public build()Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;
    .locals 7

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->x:Ljava/lang/Float;

    iget-object v2, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->y:Ljava/lang/Float;

    iget-object v3, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->width:Ljava/lang/Float;

    iget-object v4, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->height:Ljava/lang/Float;

    iget-object v5, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->cornerRadius:Ljava/lang/Float;

    invoke-super {p0}, Lcom/squareup/wire/Message$Builder;->buildUnknownFields()Lokio/ByteString;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V

    return-object v0
.end method

.method public bridge synthetic build()Lcom/squareup/wire/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->build()Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    move-result-object v0

    return-object v0
.end method

.method public cornerRadius(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->cornerRadius:Ljava/lang/Float;

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

.method public height(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->height:Ljava/lang/Float;

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

.method public width(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->width:Ljava/lang/Float;

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

.method public x(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->x:Ljava/lang/Float;

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

.method public y(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs$Builder;->y:Ljava/lang/Float;

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
