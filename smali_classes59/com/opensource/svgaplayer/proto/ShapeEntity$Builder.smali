.class public final Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
.super Lcom/squareup/wire/Message$Builder;
.source "ShapeEntity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/ShapeEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message$Builder<",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity;",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field public ellipse:Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;

.field public rect:Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

.field public shape:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;

.field public styles:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;

.field public transform:Lcom/opensource/svgaplayer/proto/Transform;

.field public type:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;


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
.method public build()Lcom/opensource/svgaplayer/proto/ShapeEntity;
    .locals 8

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/ShapeEntity;

    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->type:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    iget-object v2, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->styles:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;

    iget-object v3, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->transform:Lcom/opensource/svgaplayer/proto/Transform;

    iget-object v4, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->shape:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;

    iget-object v5, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->rect:Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    iget-object v6, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->ellipse:Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;

    invoke-super {p0}, Lcom/squareup/wire/Message$Builder;->buildUnknownFields()Lokio/ByteString;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/opensource/svgaplayer/proto/ShapeEntity;-><init>(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;Lcom/opensource/svgaplayer/proto/Transform;Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;Lokio/ByteString;)V

    return-object v0
.end method

.method public bridge synthetic build()Lcom/squareup/wire/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->build()Lcom/opensource/svgaplayer/proto/ShapeEntity;

    move-result-object v0

    return-object v0
.end method

.method public ellipse(Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->ellipse:Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->shape:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->rect:Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    .line 8
    return-object p0
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

.method public rect(Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->rect:Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->shape:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->ellipse:Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;

    .line 8
    return-object p0
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

.method public shape(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->shape:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeArgs;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->rect:Lcom/opensource/svgaplayer/proto/ShapeEntity$RectArgs;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->ellipse:Lcom/opensource/svgaplayer/proto/ShapeEntity$EllipseArgs;

    .line 8
    return-object p0
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

.method public styles(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->styles:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;

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

.method public transform(Lcom/opensource/svgaplayer/proto/Transform;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->transform:Lcom/opensource/svgaplayer/proto/Transform;

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

.method public type(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;)Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$Builder;->type:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

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
