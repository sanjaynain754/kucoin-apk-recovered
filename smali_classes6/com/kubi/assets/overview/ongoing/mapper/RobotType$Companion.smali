.class public final Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;
.super Ljava/lang/Object;
.source "RobotMapper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/overview/ongoing/mapper/RobotType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;",
        "",
        "<init>",
        "()V",
        "fromType",
        "Lcom/kubi/assets/overview/ongoing/mapper/RobotType;",
        "type",
        "",
        "(Ljava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/RobotType;",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRobotMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotMapper.kt\ncom/kubi/assets/overview/ongoing/mapper/RobotType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromType(Ljava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/RobotType;
    .locals 6
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/ongoing/mapper/RobotType;->values()[Lcom/kubi/assets/overview/ongoing/mapper/RobotType;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_2

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/kubi/assets/overview/ongoing/mapper/RobotType;->getType()I

    .line 14
    move-result v4

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    move-result v5

    .line 22
    .line 23
    if-ne v4, v5, :cond_1

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v3, 0x0

    .line 29
    .line 30
    :goto_2
    if-nez v3, :cond_3

    .line 31
    .line 32
    sget-object p1, Lcom/kubi/assets/overview/ongoing/mapper/RobotType;->UNKNOWN:Lcom/kubi/assets/overview/ongoing/mapper/RobotType;

    .line 33
    return-object p1

    .line 34
    :cond_3
    return-object v3
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
