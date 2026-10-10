.class public final enum Laai/telemetry/enums/PluginPlatform;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laai/telemetry/enums/PluginPlatform;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Cordova:Laai/telemetry/enums/PluginPlatform;

.field public static final enum Flutter:Laai/telemetry/enums/PluginPlatform;

.field public static final enum KMM:Laai/telemetry/enums/PluginPlatform;

.field public static final enum Others:Laai/telemetry/enums/PluginPlatform;

.field public static final enum ReactNative:Laai/telemetry/enums/PluginPlatform;

.field public static final enum Standard:Laai/telemetry/enums/PluginPlatform;

.field public static final enum Xamarin:Laai/telemetry/enums/PluginPlatform;

.field public static final synthetic b:[Laai/telemetry/enums/PluginPlatform;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 3
    .line 4
    const-string v1, "Standard"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->Standard:Laai/telemetry/enums/PluginPlatform;

    .line 11
    .line 12
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 13
    .line 14
    const-string v1, "KMM"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->KMM:Laai/telemetry/enums/PluginPlatform;

    .line 21
    .line 22
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 23
    .line 24
    const-string v1, "Flutter"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->Flutter:Laai/telemetry/enums/PluginPlatform;

    .line 31
    .line 32
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 33
    .line 34
    const-string v1, "Cordova"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->Cordova:Laai/telemetry/enums/PluginPlatform;

    .line 41
    .line 42
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 43
    .line 44
    const-string v1, "ReactNative"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->ReactNative:Laai/telemetry/enums/PluginPlatform;

    .line 51
    .line 52
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 53
    .line 54
    const-string v1, "Xamarin"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->Xamarin:Laai/telemetry/enums/PluginPlatform;

    .line 61
    .line 62
    new-instance v0, Laai/telemetry/enums/PluginPlatform;

    .line 63
    .line 64
    const-string v1, "Others"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Laai/telemetry/enums/PluginPlatform;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->Others:Laai/telemetry/enums/PluginPlatform;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Laai/telemetry/enums/PluginPlatform;->a()[Laai/telemetry/enums/PluginPlatform;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Laai/telemetry/enums/PluginPlatform;->b:[Laai/telemetry/enums/PluginPlatform;

    .line 77
    return-void
    .line 78
    .line 79
    .line 80
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
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic a()[Laai/telemetry/enums/PluginPlatform;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Laai/telemetry/enums/PluginPlatform;->Standard:Laai/telemetry/enums/PluginPlatform;

    .line 3
    .line 4
    sget-object v1, Laai/telemetry/enums/PluginPlatform;->KMM:Laai/telemetry/enums/PluginPlatform;

    .line 5
    .line 6
    sget-object v2, Laai/telemetry/enums/PluginPlatform;->Flutter:Laai/telemetry/enums/PluginPlatform;

    .line 7
    .line 8
    sget-object v3, Laai/telemetry/enums/PluginPlatform;->Cordova:Laai/telemetry/enums/PluginPlatform;

    .line 9
    .line 10
    sget-object v4, Laai/telemetry/enums/PluginPlatform;->ReactNative:Laai/telemetry/enums/PluginPlatform;

    .line 11
    .line 12
    sget-object v5, Laai/telemetry/enums/PluginPlatform;->Xamarin:Laai/telemetry/enums/PluginPlatform;

    .line 13
    .line 14
    sget-object v6, Laai/telemetry/enums/PluginPlatform;->Others:Laai/telemetry/enums/PluginPlatform;

    .line 15
    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [Laai/telemetry/enums/PluginPlatform;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
.end method

.method public static valueOf(Ljava/lang/String;)Laai/telemetry/enums/PluginPlatform;
    .locals 1

    .line 1
    .line 2
    const-class v0, Laai/telemetry/enums/PluginPlatform;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Laai/telemetry/enums/PluginPlatform;

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

.method public static values()[Laai/telemetry/enums/PluginPlatform;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Laai/telemetry/enums/PluginPlatform;->b:[Laai/telemetry/enums/PluginPlatform;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Laai/telemetry/enums/PluginPlatform;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Laai/telemetry/enums/PluginPlatform;

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
    .line 19
    .line 20
.end method
