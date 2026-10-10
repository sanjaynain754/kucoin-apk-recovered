.class public final enum Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;
.super Ljava/lang/Enum;
.source "ShapeEntity.java"

# interfaces
.implements Lcom/squareup/wire/WireEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/opensource/svgaplayer/proto/ShapeEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ShapeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;",
        ">;",
        "Lcom/squareup/wire/WireEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

.field public static final ADAPTER:Lcom/squareup/wire/ProtoAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/ProtoAdapter<",
            "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ELLIPSE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

.field public static final enum KEEP:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

.field public static final enum RECT:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

.field public static final enum SHAPE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 3
    .line 4
    const-string v1, "SHAPE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->SHAPE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 11
    .line 12
    new-instance v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 13
    .line 14
    const-string v2, "RECT"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v3}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->RECT:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 21
    .line 22
    new-instance v2, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 23
    .line 24
    const-string v3, "ELLIPSE"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4, v4}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v2, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->ELLIPSE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 31
    .line 32
    new-instance v3, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 33
    .line 34
    const-string v4, "KEEP"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5, v5}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v3, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->KEEP:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v1, v2, v3}, [Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->$VALUES:[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 47
    .line 48
    const-class v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/squareup/wire/ProtoAdapter;->newEnumAdapter(Ljava/lang/Class;)Lcom/squareup/wire/RuntimeEnumAdapter;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    sput-object v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->ADAPTER:Lcom/squareup/wire/ProtoAdapter;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->value:I

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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static fromValue(I)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_3

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_0
    sget-object p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->KEEP:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 16
    return-object p0

    .line 17
    .line 18
    :cond_1
    sget-object p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->ELLIPSE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_2
    sget-object p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->RECT:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_3
    sget-object p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->SHAPE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 25
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

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

.method public static values()[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->$VALUES:[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

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


# virtual methods
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->value:I

    .line 3
    return v0
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
.end method
