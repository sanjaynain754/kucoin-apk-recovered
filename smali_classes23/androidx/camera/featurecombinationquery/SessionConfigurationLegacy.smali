.class public Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
.super Ljava/lang/Object;
.source "SessionConfigurationLegacy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    }
.end annotation


# instance fields
.field private final mOutputConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;


# direct methods
.method private constructor <init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;",
            "Landroidx/camera/featurecombinationquery/SessionParametersLegacy;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mOutputConfigs:Ljava/util/List;

    .line 4
    iput-object p2, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;-><init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)V

    return-void
.end method


# virtual methods
.method public getOutputConfigurations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mOutputConfigs:Ljava/util/List;

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
    .line 18
    .line 19
    .line 20
.end method

.method public getSessionParameters()Landroidx/camera/featurecombinationquery/SessionParametersLegacy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

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
    .line 18
    .line 19
    .line 20
.end method
