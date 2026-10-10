.class public final enum Lcom/sumsub/sns/core/data/model/DayNightMode;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/data/model/DayNightMode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/core/data/model/DayNightMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DAY",
        "NIGHT",
        "Companion",
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

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/core/data/model/DayNightMode;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ltg0/d<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/sumsub/sns/core/data/model/DayNightMode$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DAY:Lcom/sumsub/sns/core/data/model/DayNightMode;

.field public static final enum NIGHT:Lcom/sumsub/sns/core/data/model/DayNightMode;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/core/data/model/DayNightMode;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->DAY:Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/data/model/DayNightMode;->NIGHT:Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 8
    move-result-object v0

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

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 3
    .line 4
    const-string v1, "DAY"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/data/model/DayNightMode;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->DAY:Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 13
    .line 14
    const-string v1, "NIGHT"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/core/data/model/DayNightMode;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->NIGHT:Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/sumsub/sns/core/data/model/DayNightMode;->$values()[Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$VALUES:[Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 33
    .line 34
    new-instance v0, Lcom/sumsub/sns/core/data/model/DayNightMode$Companion;

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/data/model/DayNightMode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    .line 40
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->Companion:Lcom/sumsub/sns/core/data/model/DayNightMode$Companion;

    .line 41
    .line 42
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 43
    .line 44
    new-instance v1, Lcom/sumsub/sns/core/data/model/a;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1}, Lcom/sumsub/sns/core/data/model/a;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    sput-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 54
    return-void
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

.method private static final synthetic _init_$_anonymous_()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/data/model/DayNightMode;->values()[Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "com.sumsub.sns.core.data.model.DayNightMode"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlinx/serialization/internal/i0;->b(Ljava/lang/String;[Ljava/lang/Enum;)Ltg0/d;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/data/model/DayNightMode;->_init_$_anonymous_()Ltg0/d;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/core/data/model/DayNightMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/DayNightMode;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/core/data/model/DayNightMode;

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

.method public static values()[Lcom/sumsub/sns/core/data/model/DayNightMode;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/data/model/DayNightMode;->$VALUES:[Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/core/data/model/DayNightMode;

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
