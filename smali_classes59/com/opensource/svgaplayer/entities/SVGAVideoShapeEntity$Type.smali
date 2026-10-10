.class public final enum Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;
.super Ljava/lang/Enum;
.source "SVGAVideoShapeEntity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;",
        "",
        "(Ljava/lang/String;I)V",
        "shape",
        "rect",
        "ellipse",
        "keep",
        "com.opensource.svgaplayer"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# static fields
.field public static final synthetic b:[Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

.field public static final enum ellipse:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

.field public static final enum keep:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

.field public static final enum rect:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

.field public static final enum shape:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "shape"

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    sput-object v0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->shape:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 12
    .line 13
    new-instance v1, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "rect"

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2, v3}, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    sput-object v1, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->rect:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 23
    .line 24
    new-instance v2, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 25
    .line 26
    const-string v3, "ellipse"

    .line 27
    const/4 v4, 0x2

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    sput-object v2, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->ellipse:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 33
    .line 34
    new-instance v3, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 35
    .line 36
    const-string v4, "keep"

    .line 37
    const/4 v5, 0x3

    .line 38
    .line 39
    .line 40
    invoke-direct {v3, v4, v5}, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    sput-object v3, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->keep:Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 43
    .line 44
    .line 45
    filled-new-array {v0, v1, v2, v3}, [Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    sput-object v0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->b:[Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 9
    return-object p0
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

.method public static values()[Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->b:[Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
