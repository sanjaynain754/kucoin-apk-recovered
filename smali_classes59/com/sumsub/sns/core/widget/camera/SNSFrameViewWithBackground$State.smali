.class public final enum Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DEFAULT",
        "RED",
        "YELLOW",
        "GREEN",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

.field public static final enum DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

.field public static final enum GREEN:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

.field public static final enum RED:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

.field public static final enum YELLOW:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->RED:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->YELLOW:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->GREEN:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    const-string v1, "DEFAULT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 13
    .line 14
    const-string v1, "RED"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->RED:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 21
    .line 22
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 23
    .line 24
    const-string v1, "YELLOW"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->YELLOW:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 31
    .line 32
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 33
    .line 34
    const-string v1, "GREEN"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->GREEN:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->$values()[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->$VALUES:[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

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

.method public static values()[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;->$VALUES:[Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

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
