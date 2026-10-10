.class public final enum Lshark/Hprof$HprofVersion;
.super Ljava/lang/Enum;
.source "Hprof.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/Hprof;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HprofVersion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lshark/Hprof$HprofVersion;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "Moved to top level class"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "shark.HprofVersion"
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lshark/Hprof$HprofVersion;",
        "",
        "(Ljava/lang/String;I)V",
        "versionString",
        "",
        "getVersionString",
        "()Ljava/lang/String;",
        "JDK1_2_BETA3",
        "JDK1_2_BETA4",
        "JDK_6",
        "ANDROID",
        "shark-hprof"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final enum ANDROID:Lshark/Hprof$HprofVersion;

.field public static final enum JDK1_2_BETA3:Lshark/Hprof$HprofVersion;

.field public static final enum JDK1_2_BETA4:Lshark/Hprof$HprofVersion;

.field public static final enum JDK_6:Lshark/Hprof$HprofVersion;

.field public static final synthetic b:[Lshark/Hprof$HprofVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lshark/Hprof$HprofVersion;

    .line 3
    .line 4
    const-string v1, "JDK1_2_BETA3"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lshark/Hprof$HprofVersion;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lshark/Hprof$HprofVersion;->JDK1_2_BETA3:Lshark/Hprof$HprofVersion;

    .line 11
    .line 12
    new-instance v1, Lshark/Hprof$HprofVersion;

    .line 13
    .line 14
    const-string v2, "JDK1_2_BETA4"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lshark/Hprof$HprofVersion;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lshark/Hprof$HprofVersion;->JDK1_2_BETA4:Lshark/Hprof$HprofVersion;

    .line 21
    .line 22
    new-instance v2, Lshark/Hprof$HprofVersion;

    .line 23
    .line 24
    const-string v3, "JDK_6"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lshark/Hprof$HprofVersion;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lshark/Hprof$HprofVersion;->JDK_6:Lshark/Hprof$HprofVersion;

    .line 31
    .line 32
    new-instance v3, Lshark/Hprof$HprofVersion;

    .line 33
    .line 34
    const-string v4, "ANDROID"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lshark/Hprof$HprofVersion;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lshark/Hprof$HprofVersion;->ANDROID:Lshark/Hprof$HprofVersion;

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v1, v2, v3}, [Lshark/Hprof$HprofVersion;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lshark/Hprof$HprofVersion;->b:[Lshark/Hprof$HprofVersion;

    .line 47
    return-void
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
    .line 106
    .line 107
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
.end method

.method public static valueOf(Ljava/lang/String;)Lshark/Hprof$HprofVersion;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lshark/Hprof$HprofVersion;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lshark/Hprof$HprofVersion;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static values()[Lshark/Hprof$HprofVersion;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/Hprof$HprofVersion;->b:[Lshark/Hprof$HprofVersion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lshark/Hprof$HprofVersion;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lshark/Hprof$HprofVersion;

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
    .line 21
.end method


# virtual methods
.method public final getVersionString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lshark/HprofVersion;->valueOf(Ljava/lang/String;)Lshark/HprofVersion;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lshark/HprofVersion;->getVersionString()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
