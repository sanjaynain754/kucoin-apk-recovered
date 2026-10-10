.class public final Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;
.super Lcom/squareup/wire/Message$Builder;
.source "ShapeEntity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message$Builder<",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Float;

.field public b:Ljava/lang/Float;

.field public g:Ljava/lang/Float;

.field public r:Ljava/lang/Float;


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
.method public a(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->a:Ljava/lang/Float;

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

.method public b(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->b:Ljava/lang/Float;

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

.method public build()Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;
    .locals 6

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->r:Ljava/lang/Float;

    iget-object v2, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->g:Ljava/lang/Float;

    iget-object v3, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->b:Ljava/lang/Float;

    iget-object v4, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->a:Ljava/lang/Float;

    invoke-super {p0}, Lcom/squareup/wire/Message$Builder;->buildUnknownFields()Lokio/ByteString;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V

    return-object v0
.end method

.method public bridge synthetic build()Lcom/squareup/wire/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->build()Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->g:Ljava/lang/Float;

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

.method public r(Ljava/lang/Float;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor$Builder;->r:Ljava/lang/Float;

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
