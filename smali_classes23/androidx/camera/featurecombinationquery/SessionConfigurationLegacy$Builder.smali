.class public final Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
.super Ljava/lang/Object;
.source "SessionConfigurationLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mOutputConfigs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;->build()Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    .line 22
    return-void
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
.end method


# virtual methods
.method public addOutputConfiguration(Landroid/hardware/camera2/params/OutputConfiguration;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    return-object p0
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

.method public addOutputConfigurations(Ljava/util/Collection;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;)",
            "Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    return-object p0
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

.method public build()Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Landroidx/camera/featurecombinationquery/b;->a(Ljava/util/Collection;)Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3}, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;-><init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$1;)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public setSessionParameters(Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method
