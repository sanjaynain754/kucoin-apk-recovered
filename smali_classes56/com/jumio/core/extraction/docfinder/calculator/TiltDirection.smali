.class public final enum Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INVALID",
        "UP",
        "DOWN",
        "LEFT",
        "RIGHT",
        "jumio-docfinder_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum DOWN:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final enum INVALID:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final enum LEFT:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final enum RIGHT:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final enum UP:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final synthetic a:[Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

.field public static final synthetic b:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 3
    .line 4
    const-string v1, "INVALID"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->INVALID:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 11
    .line 12
    new-instance v1, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 13
    .line 14
    const-string v2, "UP"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->UP:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 21
    .line 22
    new-instance v2, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 23
    .line 24
    const-string v3, "DOWN"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->DOWN:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 31
    .line 32
    new-instance v3, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 33
    .line 34
    const-string v4, "LEFT"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->LEFT:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 41
    .line 42
    new-instance v4, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 43
    .line 44
    const-string v5, "RIGHT"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->RIGHT:Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 51
    .line 52
    .line 53
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sput-object v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->a:[Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    sput-object v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->b:Lkotlin/enums/EnumEntries;

    .line 63
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
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

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
    .line 46
    .line 47
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->b:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

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
.end method

.method public static values()[Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;->a:[Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
