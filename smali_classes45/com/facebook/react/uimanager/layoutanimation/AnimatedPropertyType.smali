.class public final enum Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;
.super Ljava/lang/Enum;
.source "AnimatedPropertyType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OPACITY",
        "SCALE_X",
        "SCALE_Y",
        "SCALE_XY",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

.field public static final Companion:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum OPACITY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

.field public static final enum SCALE_X:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

.field public static final enum SCALE_XY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

.field public static final enum SCALE_Y:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;


# direct methods
.method private static final synthetic $values()[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->OPACITY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_X:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 5
    .line 6
    sget-object v2, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_Y:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 7
    .line 8
    sget-object v3, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_XY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 3
    .line 4
    const-string v1, "OPACITY"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->OPACITY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 13
    .line 14
    const-string v1, "SCALE_X"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_X:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 21
    .line 22
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 23
    .line 24
    const-string v1, "SCALE_Y"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_Y:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 31
    .line 32
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 33
    .line 34
    const-string v1, "SCALE_XY"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->SCALE_XY:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->$values()[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->$VALUES:[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 53
    .line 54
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->Companion:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;

    .line 61
    return-void
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

.method public static final fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->Companion:Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

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

.method public static values()[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;->$VALUES:[Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;

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
