.class public final Lcom/facebook/react/uimanager/UIConstantsProviderBinding;
.super Ljava/lang/Object;
.source "UIConstantsProviderBinding.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;,
        Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;,
        Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0087 \u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/UIConstantsProviderBinding;",
        "",
        "<init>",
        "()V",
        "install",
        "",
        "runtimeExecutor",
        "Lcom/facebook/react/bridge/RuntimeExecutor;",
        "defaultEventTypesProvider",
        "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;",
        "viewManagerConstantsProvider",
        "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;",
        "constantsProvider",
        "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;",
        "DefaultEventTypesProvider",
        "ConstantsForViewManagerProvider",
        "ConstantsProvider",
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
.field public static final INSTANCE:Lcom/facebook/react/uimanager/UIConstantsProviderBinding;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/UIConstantsProviderBinding;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/uimanager/UIConstantsProviderBinding;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/UIConstantsProviderBinding;->INSTANCE:Lcom/facebook/react/uimanager/UIConstantsProviderBinding;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "uimanagerjni"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

    .line 14
    return-void
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

.method public static final native install(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;)V
    .param p0    # Lcom/facebook/react/bridge/RuntimeExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method
