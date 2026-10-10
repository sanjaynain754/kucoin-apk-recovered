.class public Landroidx/camera/video/FallbackStrategy;
.super Ljava/lang/Object;
.source "FallbackStrategy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/FallbackStrategy$RuleStrategy;
    }
.end annotation


# static fields
.field static final FALLBACK_RULE_HIGHER:I = 0x2

.field static final FALLBACK_RULE_HIGHER_OR_LOWER:I = 0x1

.field static final FALLBACK_RULE_LOWER:I = 0x4

.field static final FALLBACK_RULE_LOWER_OR_HIGHER:I = 0x3

.field static final FALLBACK_RULE_NONE:I

.field static final NONE:Landroidx/camera/video/FallbackStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;

    .line 3
    .line 4
    sget-object v1, Landroidx/camera/video/Quality;->NONE:Landroidx/camera/video/Quality;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;-><init>(Landroidx/camera/video/Quality;I)V

    .line 9
    .line 10
    sput-object v0, Landroidx/camera/video/FallbackStrategy;->NONE:Landroidx/camera/video/FallbackStrategy;

    .line 11
    return-void
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
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/video/FallbackStrategy$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/video/FallbackStrategy;-><init>()V

    return-void
.end method

.method public static higherQualityOrLowerThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;-><init>(Landroidx/camera/video/Quality;I)V

    .line 7
    return-object v0
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

.method public static higherQualityThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;-><init>(Landroidx/camera/video/Quality;I)V

    .line 7
    return-object v0
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

.method public static lowerQualityOrHigherThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;-><init>(Landroidx/camera/video/Quality;I)V

    .line 7
    return-object v0
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

.method public static lowerQualityThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Landroidx/camera/video/AutoValue_FallbackStrategy_RuleStrategy;-><init>(Landroidx/camera/video/Quality;I)V

    .line 7
    return-object v0
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
