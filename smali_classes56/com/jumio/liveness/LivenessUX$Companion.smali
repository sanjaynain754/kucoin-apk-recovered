.class public final Lcom/jumio/liveness/LivenessUX$Companion;
.super Ljava/lang/Object;
.source "LivenessUX.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/liveness/LivenessUX;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0087 J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\nH\u0087 \u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/jumio/liveness/LivenessUX$Companion;",
        "",
        "<init>",
        "()V",
        "loadType",
        "",
        "create",
        "Lcom/jumio/liveness/LivenessUX;",
        "configurations",
        "Lcom/jumio/liveness/PremiumLivenessConfigurations;",
        "Lcom/jumio/liveness/StandardLivenessConfigurations;",
        "dasdk_withoutAssetsRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jumio/liveness/LivenessUX$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$loadType(Lcom/jumio/liveness/LivenessUX$Companion;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/liveness/LivenessUX$Companion;->loadType()V

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
.end method

.method private final loadType()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/jumio/liveness/LivenessUX;->access$loadType()V

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
.end method


# virtual methods
.method public final create(Lcom/jumio/liveness/PremiumLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;
    .locals 0
    .param p1    # Lcom/jumio/liveness/PremiumLivenessConfigurations;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/jumio/liveness/LivenessUX;->create(Lcom/jumio/liveness/PremiumLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lcom/jumio/liveness/StandardLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;
    .locals 0
    .param p1    # Lcom/jumio/liveness/StandardLivenessConfigurations;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {p1}, Lcom/jumio/liveness/LivenessUX;->create(Lcom/jumio/liveness/StandardLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;

    move-result-object p1

    return-object p1
.end method
