.class public final enum Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/device/TXDeviceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TXSystemVolumeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

.field public static final enum TXSystemVolumeTypeAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

.field public static final enum TXSystemVolumeTypeMedia:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

.field public static final enum TXSystemVolumeTypeVOIP:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 3
    .line 4
    const-string v1, "TXSystemVolumeTypeAuto"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 13
    .line 14
    const-string v2, "TXSystemVolumeTypeMedia"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeMedia:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 21
    .line 22
    new-instance v2, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 23
    .line 24
    const-string v3, "TXSystemVolumeTypeVOIP"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeVOIP:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->$VALUES:[Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

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

.method public static values()[Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->$VALUES:[Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

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
