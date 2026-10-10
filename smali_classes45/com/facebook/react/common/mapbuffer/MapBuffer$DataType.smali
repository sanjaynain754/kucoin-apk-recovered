.class public final enum Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;
.super Ljava/lang/Enum;
.source "MapBuffer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/common/mapbuffer/MapBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DataType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BOOL",
        "INT",
        "DOUBLE",
        "STRING",
        "MAP",
        "LONG",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum BOOL:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum DOUBLE:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum INT:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum LONG:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum MAP:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

.field public static final enum STRING:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;


# direct methods
.method private static final synthetic $values()[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->BOOL:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->INT:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 5
    .line 6
    sget-object v2, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->DOUBLE:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 7
    .line 8
    sget-object v3, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->STRING:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 9
    .line 10
    sget-object v4, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->MAP:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 11
    .line 12
    sget-object v5, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->LONG:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 3
    .line 4
    const-string v1, "BOOL"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->BOOL:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 13
    .line 14
    const-string v1, "INT"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->INT:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 21
    .line 22
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 23
    .line 24
    const-string v1, "DOUBLE"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->DOUBLE:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 31
    .line 32
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 33
    .line 34
    const-string v1, "STRING"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->STRING:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 41
    .line 42
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 43
    .line 44
    const-string v1, "MAP"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->MAP:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 51
    .line 52
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 53
    .line 54
    const-string v1, "LONG"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->LONG:Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->$values()[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->$VALUES:[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 73
    return-void
    .line 74
    .line 75
.end method

.method private constructor <init>(Ljava/lang/String;I)V
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

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
.end method

.method public static values()[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;->$VALUES:[Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;

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
    .line 18
.end method
