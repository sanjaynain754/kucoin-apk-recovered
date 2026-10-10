.class public final enum Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;
.super Ljava/lang/Enum;
.source "IPlatformDateTimeFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TimeZoneName"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum LONGGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum LONGOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum SHORTGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum SHORTOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final enum UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

.field public static final synthetic b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 3
    .line 4
    const-string v1, "LONG"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 13
    .line 14
    const-string v1, "LONGOFFSET"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONGOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 21
    .line 22
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 23
    .line 24
    const-string v1, "LONGGENERIC"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONGGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 31
    .line 32
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 33
    .line 34
    const-string v1, "SHORT"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 41
    .line 42
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 43
    .line 44
    const-string v1, "SHORTOFFSET"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORTOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 51
    .line 52
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 53
    .line 54
    const-string v1, "SHORTGENERIC"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORTGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 61
    .line 62
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 63
    .line 64
    const-string v1, "UNDEFINED"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->a()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 77
    return-void
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

.method public static synthetic a()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONG:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONGOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 5
    .line 6
    sget-object v2, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->LONGGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 7
    .line 8
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORT:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 9
    .line 10
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORTOFFSET:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 11
    .line 12
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->SHORTGENERIC:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 13
    .line 14
    sget-object v6, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->UNDEFINED:Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 15
    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

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

.method public static values()[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->b:[Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$TimeZoneName;

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
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$a;->k:[I

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
    .line 23
    :pswitch_1
    const-string/jumbo v0, "v"

    .line 24
    return-object v0

    .line 25
    .line 26
    :pswitch_2
    const-string v0, "O"

    .line 27
    return-object v0

    .line 28
    .line 29
    .line 30
    :pswitch_3
    const-string/jumbo v0, "z"

    .line 31
    return-object v0

    .line 32
    .line 33
    .line 34
    :pswitch_4
    const-string/jumbo v0, "vvvv"

    .line 35
    return-object v0

    .line 36
    .line 37
    :pswitch_5
    const-string v0, "OOOO"

    .line 38
    return-object v0

    .line 39
    .line 40
    .line 41
    :pswitch_6
    const-string/jumbo v0, "zzzz"

    .line 42
    return-object v0

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformDateTimeFormatter$a;->k:[I

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
    .line 23
    :pswitch_1
    const-string/jumbo v0, "shortGeneric"

    .line 24
    return-object v0

    .line 25
    .line 26
    .line 27
    :pswitch_2
    const-string/jumbo v0, "shortOffset"

    .line 28
    return-object v0

    .line 29
    .line 30
    .line 31
    :pswitch_3
    const-string/jumbo v0, "short"

    .line 32
    return-object v0

    .line 33
    .line 34
    :pswitch_4
    const-string v0, "longGeneric"

    .line 35
    return-object v0

    .line 36
    .line 37
    :pswitch_5
    const-string v0, "longOffset"

    .line 38
    return-object v0

    .line 39
    .line 40
    :pswitch_6
    const-string v0, "long"

    .line 41
    return-object v0

    .line 42
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
