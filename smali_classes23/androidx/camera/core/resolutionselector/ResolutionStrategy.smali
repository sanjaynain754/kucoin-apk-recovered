.class public final Landroidx/camera/core/resolutionselector/ResolutionStrategy;
.super Ljava/lang/Object;
.source "ResolutionStrategy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/resolutionselector/ResolutionStrategy$ResolutionFallbackRule;
    }
.end annotation


# static fields
.field public static final FALLBACK_RULE_CLOSEST_HIGHER:I = 0x2

.field public static final FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER:I = 0x1

.field public static final FALLBACK_RULE_CLOSEST_LOWER:I = 0x4

.field public static final FALLBACK_RULE_CLOSEST_LOWER_THEN_HIGHER:I = 0x3

.field public static final FALLBACK_RULE_NONE:I

.field public static final HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;


# instance fields
.field private mBoundSize:Landroid/util/Size;

.field private mFallbackRule:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/resolutionselector/ResolutionStrategy;-><init>()V

    .line 6
    .line 7
    sput-object v0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 8
    return-void
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

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mBoundSize:Landroid/util/Size;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mFallbackRule:I

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mBoundSize:Landroid/util/Size;

    .line 6
    iput p2, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mFallbackRule:I

    return-void
.end method


# virtual methods
.method public getBoundSize()Landroid/util/Size;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mBoundSize:Landroid/util/Size;

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

.method public getFallbackRule()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->mFallbackRule:I

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
    .line 18
    .line 19
    .line 20
.end method
