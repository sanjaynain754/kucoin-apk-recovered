.class public final enum Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;
.super Ljava/lang/Enum;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Role"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

.field public static final enum GENERAL_USER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

.field public static final enum MANAGER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

.field public static final enum ROOM_OWNER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;


# instance fields
.field mValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 3
    .line 4
    const-string v1, "ROOM_OWNER"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->ROOM_OWNER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 13
    .line 14
    const-string v2, "MANAGER"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->MANAGER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 21
    .line 22
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 23
    .line 24
    const-string v3, "GENERAL_USER"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4, v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->GENERAL_USER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 37
    return-void
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

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->mValue:I

    .line 6
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    iget v4, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->mValue:I

    .line 13
    .line 14
    if-ne v4, p0, :cond_0

    .line 15
    return-object v3

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->GENERAL_USER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

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

.method public static values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

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
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->mValue:I

    .line 3
    return v0
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
