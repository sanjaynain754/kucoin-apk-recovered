.class final enum Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State",
        "",
        "Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isDisconnected",
        "()Z",
        "DEFAULT",
        "CONNECTED",
        "DISCONNECTING",
        "DISCONNECTED",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

.field public static final enum CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

.field public static final enum DEFAULT:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

.field public static final enum DISCONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

.field public static final enum DISCONNECTING:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DEFAULT:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DISCONNECTING:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DISCONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 3
    .line 4
    const-string v1, "DEFAULT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DEFAULT:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 13
    .line 14
    const-string v1, "CONNECTED"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 21
    .line 22
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 23
    .line 24
    const-string v1, "DISCONNECTING"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DISCONNECTING:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 31
    .line 32
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 33
    .line 34
    const-string v1, "DISCONNECTED"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DISCONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->$values()[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->$VALUES:[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

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

.method public static values()[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->$VALUES:[Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

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
.method public final isDisconnected()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;->DISCONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
