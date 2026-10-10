.class public final Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;
.super Ljava/lang/Object;
.source "ReactNativeFeatureFlagsForTests.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;",
        "",
        "<init>",
        "()V",
        "setUp",
        "",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;->INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;->setUp$lambda$0()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method private static final setUp$lambda$0()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsLocalAccessor;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsLocalAccessor;-><init>()V

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
.end method


# virtual methods
.method public final setUp()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;

    .line 3
    .line 4
    new-instance v1, Lv6/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lv6/b;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->setAccessorProvider$ReactAndroid_release(Lkotlin/jvm/functions/Function0;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
