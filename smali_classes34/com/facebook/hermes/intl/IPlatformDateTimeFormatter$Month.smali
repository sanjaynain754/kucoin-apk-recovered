.class public final enum Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;
.super Ljava/lang/Enum;
.source "IPlatformDateTimeFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Month"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DIGIT2:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final enum LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final enum NARROW:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final enum NUMERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final enum SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final enum UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

.field public static final synthetic b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 3
    .line 4
    const-string v1, "NUMERIC"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->NUMERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 13
    .line 14
    const-string v1, "DIGIT2"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->DIGIT2:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 21
    .line 22
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 23
    .line 24
    const-string v1, "LONG"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 31
    .line 32
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 33
    .line 34
    const-string v1, "SHORT"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 41
    .line 42
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 43
    .line 44
    const-string v1, "NARROW"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->NARROW:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 51
    .line 52
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 53
    .line 54
    const-string v1, "UNDEFINED"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->a()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 67
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static synthetic a()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->NUMERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->DIGIT2:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 5
    .line 6
    sget-object v2, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 7
    .line 8
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 9
    .line 10
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->NARROW:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 11
    .line 12
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

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

.method public static values()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$Month;

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


# virtual methods
.method public getSkeleonSymbol()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$a;->f:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 17
    throw v0

    .line 18
    .line 19
    :pswitch_0
    const-string v0, ""

    .line 20
    return-object v0

    .line 21
    .line 22
    :pswitch_1
    const-string v0, "MMMMM"

    .line 23
    return-object v0

    .line 24
    .line 25
    :pswitch_2
    const-string v0, "MMM"

    .line 26
    return-object v0

    .line 27
    .line 28
    :pswitch_3
    const-string v0, "MMMM"

    .line 29
    return-object v0

    .line 30
    .line 31
    :pswitch_4
    const-string v0, "MM"

    .line 32
    return-object v0

    .line 33
    .line 34
    :pswitch_5
    const-string v0, "M"

    .line 35
    return-object v0

    .line 36
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$a;->f:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 17
    throw v0

    .line 18
    .line 19
    :pswitch_0
    const-string v0, ""

    .line 20
    return-object v0

    .line 21
    .line 22
    :pswitch_1
    const-string v0, "narrow"

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :pswitch_2
    const-string/jumbo v0, "short"

    .line 27
    return-object v0

    .line 28
    .line 29
    :pswitch_3
    const-string v0, "long"

    .line 30
    return-object v0

    .line 31
    .line 32
    :pswitch_4
    const-string v0, "2-digit"

    .line 33
    return-object v0

    .line 34
    .line 35
    :pswitch_5
    const-string v0, "numeric"

    .line 36
    return-object v0

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
