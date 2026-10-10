.class public final enum Lcom/sumsub/sentry/Device$DeviceOrientation;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sentry/Device$DeviceOrientation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/sumsub/sentry/Device$DeviceOrientation",
        "",
        "Lcom/sumsub/sentry/Device$DeviceOrientation;",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "com/sumsub/sentry/w",
        "PORTRAIT",
        "LANDSCAPE",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sentry/Device$DeviceOrientation;

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

.field public static final Companion:Lcom/sumsub/sentry/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum LANDSCAPE:Lcom/sumsub/sentry/Device$DeviceOrientation;

.field public static final enum PORTRAIT:Lcom/sumsub/sentry/Device$DeviceOrientation;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sentry/Device$DeviceOrientation;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->PORTRAIT:Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/Device$DeviceOrientation;->LANDSCAPE:Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Lcom/sumsub/sentry/Device$DeviceOrientation;

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
    new-instance v0, Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 3
    .line 4
    const-string v1, "PORTRAIT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/Device$DeviceOrientation;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->PORTRAIT:Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 13
    .line 14
    const-string v1, "LANDSCAPE"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/Device$DeviceOrientation;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->LANDSCAPE:Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/sumsub/sentry/Device$DeviceOrientation;->$values()[Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$VALUES:[Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 33
    .line 34
    new-instance v0, Lcom/sumsub/sentry/w;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Lcom/sumsub/sentry/w;-><init>()V

    .line 38
    .line 39
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->Companion:Lcom/sumsub/sentry/w;

    .line 40
    .line 41
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 42
    .line 43
    new-instance v1, Lcom/sumsub/sentry/l1;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1}, Lcom/sumsub/sentry/l1;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

.method private static final synthetic _init_$_anonymous_()Ltg0/d;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/Device$DeviceOrientation;->values()[Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "portrait"

    .line 8
    .line 9
    const-string v2, "landscape"

    .line 10
    .line 11
    .line 12
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    filled-new-array {v2, v2}, [[Ljava/lang/annotation/Annotation;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    const-string v4, "com.sumsub.sentry.Device.DeviceOrientation"

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/i0;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ltg0/d;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method

.method public static synthetic a()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/Device$DeviceOrientation;->_init_$_anonymous_()Ltg0/d;

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
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$cachedSerializer$delegate:Lkotlin/Lazy;

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
            "Lcom/sumsub/sentry/Device$DeviceOrientation;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sentry/Device$DeviceOrientation;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sentry/Device$DeviceOrientation;

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

.method public static values()[Lcom/sumsub/sentry/Device$DeviceOrientation;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->$VALUES:[Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sentry/Device$DeviceOrientation;

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
