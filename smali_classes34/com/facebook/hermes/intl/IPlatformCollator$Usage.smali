.class public final enum Lcom/facebook/hermes/intl/IPlatformCollator$Usage;
.super Ljava/lang/Enum;
.source "IPlatformCollator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/IPlatformCollator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Usage"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/IPlatformCollator$Usage;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum SEARCH:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

.field public static final enum SORT:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

.field public static final synthetic b:[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 3
    .line 4
    const-string v1, "SORT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->SORT:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 13
    .line 14
    const-string v1, "SEARCH"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->SEARCH:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->a()[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->b:[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 27
    return-void
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

.method public static synthetic a()[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->SORT:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->SEARCH:Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

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
    .line 18
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/IPlatformCollator$Usage;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

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

.method public static values()[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->b:[Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/IPlatformCollator$Usage;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/hermes/intl/IPlatformCollator$Usage;

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
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformCollator$a;->b:[I

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
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v0, "search"

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 24
    throw v0

    .line 25
    .line 26
    .line 27
    :cond_1
    const-string/jumbo v0, "sort"

    .line 28
    return-object v0
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
