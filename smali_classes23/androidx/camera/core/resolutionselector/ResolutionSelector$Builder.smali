.class public final Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
.super Ljava/lang/Object;
.source "ResolutionSelector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/resolutionselector/ResolutionSelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mAllowedResolutionMode:I

.field private mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

.field private mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

.field private mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Landroidx/camera/core/resolutionselector/AspectRatioStrategy;->RATIO_4_3_FALLBACK_AUTO_STRATEGY:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 4
    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAllowedResolutionMode:I

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Landroidx/camera/core/resolutionselector/AspectRatioStrategy;->RATIO_4_3_FALLBACK_AUTO_STRATEGY:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 9
    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAllowedResolutionMode:I

    .line 11
    invoke-virtual {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector;->getAspectRatioStrategy()Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    .line 12
    invoke-virtual {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector;->getResolutionStrategy()Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 13
    invoke-virtual {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector;->getResolutionFilter()Landroidx/camera/core/resolutionselector/ResolutionFilter;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

    .line 14
    invoke-virtual {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector;->getAllowedResolutionMode()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAllowedResolutionMode:I

    return-void
.end method

.method public static fromResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V

    .line 6
    return-object v0
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


# virtual methods
.method public build()Landroidx/camera/core/resolutionselector/ResolutionSelector;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

    .line 9
    .line 10
    iget v4, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAllowedResolutionMode:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/camera/core/resolutionselector/ResolutionSelector;-><init>(Landroidx/camera/core/resolutionselector/AspectRatioStrategy;Landroidx/camera/core/resolutionselector/ResolutionStrategy;Landroidx/camera/core/resolutionselector/ResolutionFilter;I)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public setAllowedResolutionMode(I)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAllowedResolutionMode:I

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

.method public setAspectRatioStrategy(Landroidx/camera/core/resolutionselector/AspectRatioStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mAspectRatioStrategy:Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

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

.method public setResolutionFilter(Landroidx/camera/core/resolutionselector/ResolutionFilter;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionFilter:Landroidx/camera/core/resolutionselector/ResolutionFilter;

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

.method public setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->mResolutionStrategy:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

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
