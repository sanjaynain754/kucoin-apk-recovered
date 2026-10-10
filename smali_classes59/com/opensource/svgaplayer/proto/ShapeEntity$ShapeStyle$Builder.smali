.class public final Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
.super Lcom/squareup/wire/Message$Builder;
.source "ShapeEntity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message$Builder<",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field public fill:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

.field public lineCap:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

.field public lineDashI:Ljava/lang/Float;

.field public lineDashII:Ljava/lang/Float;

.field public lineDashIII:Ljava/lang/Float;

.field public lineJoin:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

.field public miterLimit:Ljava/lang/Float;

.field public stroke:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

.field public strokeWidth:Ljava/lang/Float;


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
.method public build()Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;
    .locals 11

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;

    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->fill:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

    iget-object v2, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->stroke:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

    iget-object v3, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->strokeWidth:Ljava/lang/Float;

    iget-object v4, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineCap:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

    iget-object v5, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineJoin:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

    iget-object v6, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->miterLimit:Ljava/lang/Float;

    iget-object v7, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashI:Ljava/lang/Float;

    iget-object v8, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashII:Ljava/lang/Float;

    iget-object v9, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashIII:Ljava/lang/Float;

    invoke-super {p0}, Lcom/squareup/wire/Message$Builder;->buildUnknownFields()Lokio/ByteString;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;-><init>(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;Ljava/lang/Float;Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V

    return-object v0
.end method

.method public bridge synthetic build()Lcom/squareup/wire/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->build()Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle;

    move-result-object v0

    return-object v0
.end method

.method public fill(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->fill:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

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

.method public lineCap(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineCap:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

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

.method public lineDashI(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashI:Ljava/lang/Float;

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

.method public lineDashII(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashII:Ljava/lang/Float;

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

.method public lineDashIII(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineDashIII:Ljava/lang/Float;

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

.method public lineJoin(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->lineJoin:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

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

.method public miterLimit(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->miterLimit:Ljava/lang/Float;

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

.method public stroke(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->stroke:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

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

.method public strokeWidth(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$Builder;->strokeWidth:Ljava/lang/Float;

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
