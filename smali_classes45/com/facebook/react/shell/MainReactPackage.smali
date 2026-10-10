.class public final Lcom/facebook/react/shell/MainReactPackage;
.super Lcom/facebook/react/BaseReactPackage;
.source "MainReactPackage.kt"

# interfaces
.implements Lcom/facebook/react/ViewManagerOnDemandReactPackage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0008\u0007\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u001e\u0010\r\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\"\u0010\u0018\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0008\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/facebook/react/shell/MainReactPackage;",
        "Lcom/facebook/react/BaseReactPackage;",
        "Lcom/facebook/react/ViewManagerOnDemandReactPackage;",
        "config",
        "Lcom/facebook/react/shell/MainPackageConfig;",
        "<init>",
        "(Lcom/facebook/react/shell/MainPackageConfig;)V",
        "getModule",
        "Lcom/facebook/react/bridge/NativeModule;",
        "name",
        "",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "createViewManagers",
        "",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "viewManagersMap",
        "",
        "Lcom/facebook/react/bridge/ModuleSpec;",
        "getViewManagersMap",
        "()Ljava/util/Map;",
        "getViewManagers",
        "getViewManagerNames",
        "",
        "createViewManager",
        "viewManagerName",
        "getReactModuleInfoProvider",
        "Lcom/facebook/react/module/model/ReactModuleInfoProvider;",
        "fallbackForMissingClass",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainReactPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n3829#2:274\n4344#2,2:275\n1187#3,2:277\n1261#3,4:279\n*S KotlinDebug\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n*L\n258#1:274\n258#1:275,2\n259#1:277,2\n259#1:279,4\n*E\n"
    }
.end annotation


# instance fields
.field private final config:Lcom/facebook/react/shell/MainPackageConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final viewManagersMap:Ljava/util/Map;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "VisibleForTests"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 20
    .param p1    # Lcom/facebook/react/shell/MainPackageConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    .line 3
    invoke-direct {v0}, Lcom/facebook/react/BaseReactPackage;-><init>()V

    move-object/from16 v1, p1

    .line 4
    iput-object v1, v0, Lcom/facebook/react/shell/MainReactPackage;->config:Lcom/facebook/react/shell/MainPackageConfig;

    .line 5
    new-instance v1, La7/j;

    invoke-direct {v1}, La7/j;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 6
    const-string v2, "AndroidDrawerLayout"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 7
    new-instance v1, La7/r;

    invoke-direct {v1}, La7/r;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 8
    const-string v2, "AndroidHorizontalScrollView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 9
    new-instance v1, La7/b;

    invoke-direct {v1}, La7/b;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 10
    const-string v2, "AndroidHorizontalScrollContentView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 11
    new-instance v1, La7/c;

    invoke-direct {v1}, La7/c;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 12
    const-string v2, "AndroidProgressBar"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 13
    new-instance v1, La7/d;

    invoke-direct {v1}, La7/d;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 14
    const-string v2, "RCTSafeAreaView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    .line 15
    new-instance v1, La7/e;

    invoke-direct {v1}, La7/e;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 16
    const-string v2, "RCTScrollView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 17
    new-instance v1, La7/f;

    invoke-direct {v1}, La7/f;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    const-string v2, "AndroidSwitch"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 18
    new-instance v1, La7/g;

    invoke-direct {v1}, La7/g;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 19
    const-string v2, "AndroidSwipeRefreshLayout"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 20
    new-instance v1, La7/h;

    invoke-direct {v1}, La7/h;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 21
    const-string v2, "RCTTextInlineImage"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    .line 22
    new-instance v1, La7/i;

    invoke-direct {v1}, La7/i;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    const-string v2, "RCTImageView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 23
    new-instance v1, La7/k;

    invoke-direct {v1}, La7/k;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 24
    const-string v2, "RCTModalHostView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    .line 25
    new-instance v1, La7/l;

    invoke-direct {v1}, La7/l;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    const-string v2, "RCTRawText"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 26
    new-instance v1, La7/m;

    invoke-direct {v1}, La7/m;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 27
    const-string v2, "AndroidTextInput"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    .line 28
    new-instance v1, La7/n;

    invoke-direct {v1}, La7/n;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    const-string v2, "RCTText"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v16

    .line 29
    new-instance v1, La7/o;

    invoke-direct {v1}, La7/o;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    const-string v2, "RCTView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v17

    .line 30
    new-instance v1, La7/p;

    invoke-direct {v1}, La7/p;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 31
    const-string v2, "RCTVirtualText"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v18

    .line 32
    new-instance v1, La7/q;

    invoke-direct {v1}, La7/q;-><init>()V

    invoke-static {v1}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 33
    const-string v2, "UnimplementedNativeView"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v19

    filled-new-array/range {v3 .. v19}, [Lkotlin/Pair;

    move-result-object v1

    .line 34
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/shell/MainPackageConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public static synthetic a()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$9()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic b()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$12()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic c()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$15()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic d()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$2()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic e()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$5()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic f()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$16()Lcom/facebook/react/bridge/NativeModule;

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

.method private final fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 25

    .line 1
    .line 2
    const-class v23, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 3
    .line 4
    const-class v24, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 5
    .line 6
    const-class v1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 7
    .line 8
    const-class v2, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 9
    .line 10
    const-class v3, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 11
    .line 12
    const-class v4, Lcom/facebook/react/modules/blob/BlobModule;

    .line 13
    .line 14
    const-class v5, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 15
    .line 16
    const-class v6, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 17
    .line 18
    const-class v7, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 19
    .line 20
    const-class v8, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 21
    .line 22
    const-class v9, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 23
    .line 24
    const-class v10, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 25
    .line 26
    const-class v11, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 27
    .line 28
    const-class v12, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 29
    .line 30
    const-class v13, Lcom/facebook/react/modules/intent/IntentModule;

    .line 31
    .line 32
    const-class v14, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 33
    .line 34
    const-class v15, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 35
    .line 36
    const-class v16, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 37
    .line 38
    const-class v17, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 39
    .line 40
    const-class v18, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 41
    .line 42
    const-class v19, Lcom/facebook/react/modules/share/ShareModule;

    .line 43
    .line 44
    const-class v20, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 45
    .line 46
    const-class v21, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 47
    .line 48
    const-class v22, Lcom/facebook/react/modules/toast/ToastModule;

    .line 49
    .line 50
    .line 51
    filled-new-array/range {v1 .. v24}, [Ljava/lang/Class;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    new-instance v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    const/4 v2, 0x0

    .line 59
    .line 60
    :goto_0
    const-class v3, Lcom/facebook/react/module/annotations/ReactModule;

    .line 61
    .line 62
    const/16 v4, 0x18

    .line 63
    .line 64
    if-ge v2, v4, :cond_1

    .line 65
    .line 66
    aget-object v4, v0, v2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 70
    move-result v3

    .line 71
    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_1
    const/16 v0, 0xa

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 84
    move-result v0

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 88
    move-result v0

    .line 89
    .line 90
    const/16 v2, 0x10

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 94
    move-result v0

    .line 95
    .line 96
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    check-cast v4, Lcom/facebook/react/module/annotations/ReactModule;

    .line 124
    .line 125
    .line 126
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    new-instance v6, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 130
    .line 131
    .line 132
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 133
    move-result-object v7

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 137
    move-result-object v8

    .line 138
    .line 139
    const-string v9, "getName(...)"

    .line 140
    .line 141
    .line 142
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->canOverrideExistingModule()Z

    .line 146
    move-result v9

    .line 147
    .line 148
    .line 149
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->needsEagerInit()Z

    .line 150
    move-result v10

    .line 151
    .line 152
    .line 153
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->isCxxModule()Z

    .line 154
    move-result v11

    .line 155
    .line 156
    sget-object v4, Lcom/facebook/react/module/model/ReactModuleInfo;->Companion:Lcom/facebook/react/module/model/ReactModuleInfo$Companion;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v1}, Lcom/facebook/react/module/model/ReactModuleInfo$Companion;->classIsTurboModule(Ljava/lang/Class;)Z

    .line 160
    move-result v12

    .line 161
    .line 162
    .line 163
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 164
    .line 165
    .line 166
    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 175
    move-result-object v1

    .line 176
    .line 177
    .line 178
    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    goto :goto_1

    .line 180
    .line 181
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    const-string v1, "Required value was null."

    .line 184
    .line 185
    .line 186
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    throw v0

    .line 188
    .line 189
    :cond_3
    new-instance v0, La7/a;

    .line 190
    .line 191
    .line 192
    invoke-direct {v0, v2}, La7/a;-><init>(Ljava/util/Map;)V

    .line 193
    return-object v0
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method

.method private static final fallbackForMissingClass$lambda$19(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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
.end method

.method public static synthetic g()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$10()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic h()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$0()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic i()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$1()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic j()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$14()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic k()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$6()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic l(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass$lambda$19(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic m()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$3()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic n()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$7()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic o()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$11()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic p()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$8()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic q()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$4()Lcom/facebook/react/bridge/NativeModule;

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

.method public static synthetic r()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$13()Lcom/facebook/react/bridge/NativeModule;

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

.method private static final viewManagersMap$lambda$0()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

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

.method private static final viewManagersMap$lambda$1()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$10()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

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

.method private static final viewManagersMap$lambda$11()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/ReactRawTextManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactRawTextManager;-><init>()V

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

.method private static final viewManagersMap$lambda$12()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

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

.method private static final viewManagersMap$lambda$13()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$14()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/view/ReactViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$15()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$16()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$2()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$3()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$4()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$5()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$6()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

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

.method private static final viewManagersMap$lambda$7()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

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

.method private static final viewManagersMap$lambda$8()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>()V

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

.method private static final viewManagersMap$lambda$9()Lcom/facebook/react/bridge/NativeModule;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "viewManagerName"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 21
    const/4 p2, 0x0

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->getProvider()Ljavax/inject/Provider;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    check-cast p1, Lcom/facebook/react/bridge/NativeModule;

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p1, p2

    .line 38
    .line 39
    :goto_0
    instance-of v0, p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 44
    return-object p1

    .line 45
    :cond_1
    return-object p2
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 18
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 14
    .line 15
    new-instance v1, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>()V

    .line 19
    .line 20
    new-instance v2, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 24
    .line 25
    new-instance v3, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 29
    .line 30
    new-instance v4, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 31
    .line 32
    .line 33
    invoke-direct {v4}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>()V

    .line 34
    .line 35
    new-instance v5, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 36
    .line 37
    .line 38
    invoke-direct {v5}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 39
    .line 40
    new-instance v6, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 41
    .line 42
    .line 43
    invoke-direct {v6}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

    .line 44
    .line 45
    new-instance v7, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 46
    .line 47
    .line 48
    invoke-direct {v7}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 49
    .line 50
    new-instance v8, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 51
    .line 52
    .line 53
    invoke-direct {v8}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>()V

    .line 54
    .line 55
    new-instance v9, Lcom/facebook/react/views/image/ReactImageManager;

    .line 56
    const/4 v13, 0x7

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v9 .. v14}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    new-instance v10, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 66
    .line 67
    .line 68
    invoke-direct {v10}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 69
    .line 70
    new-instance v11, Lcom/facebook/react/views/text/ReactRawTextManager;

    .line 71
    .line 72
    .line 73
    invoke-direct {v11}, Lcom/facebook/react/views/text/ReactRawTextManager;-><init>()V

    .line 74
    .line 75
    new-instance v12, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 76
    .line 77
    .line 78
    invoke-direct {v12}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 79
    .line 80
    new-instance v13, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 81
    .line 82
    .line 83
    invoke-direct {v13}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>()V

    .line 84
    .line 85
    new-instance v14, Lcom/facebook/react/views/view/ReactViewManager;

    .line 86
    .line 87
    .line 88
    invoke-direct {v14}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 89
    .line 90
    new-instance v15, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;

    .line 91
    .line 92
    .line 93
    invoke-direct {v15}, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;-><init>()V

    .line 94
    .line 95
    new-instance v16, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 96
    .line 97
    .line 98
    invoke-direct/range {v16 .. v16}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 99
    .line 100
    move-object/from16 p1, v0

    .line 101
    .line 102
    const/16 v0, 0x11

    .line 103
    .line 104
    new-array v0, v0, [Lcom/facebook/react/uimanager/ViewManager;

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    aput-object p1, v0, v17

    .line 109
    .line 110
    const/16 v17, 0x1

    .line 111
    .line 112
    aput-object v1, v0, v17

    .line 113
    const/4 v1, 0x2

    .line 114
    .line 115
    aput-object v2, v0, v1

    .line 116
    const/4 v1, 0x3

    .line 117
    .line 118
    aput-object v3, v0, v1

    .line 119
    const/4 v1, 0x4

    .line 120
    .line 121
    aput-object v4, v0, v1

    .line 122
    const/4 v1, 0x5

    .line 123
    .line 124
    aput-object v5, v0, v1

    .line 125
    const/4 v1, 0x6

    .line 126
    .line 127
    aput-object v6, v0, v1

    .line 128
    const/4 v1, 0x7

    .line 129
    .line 130
    aput-object v7, v0, v1

    .line 131
    .line 132
    const/16 v1, 0x8

    .line 133
    .line 134
    aput-object v8, v0, v1

    .line 135
    .line 136
    const/16 v1, 0x9

    .line 137
    .line 138
    aput-object v9, v0, v1

    .line 139
    .line 140
    const/16 v1, 0xa

    .line 141
    .line 142
    aput-object v10, v0, v1

    .line 143
    .line 144
    const/16 v1, 0xb

    .line 145
    .line 146
    aput-object v11, v0, v1

    .line 147
    .line 148
    const/16 v1, 0xc

    .line 149
    .line 150
    aput-object v12, v0, v1

    .line 151
    .line 152
    const/16 v1, 0xd

    .line 153
    .line 154
    aput-object v13, v0, v1

    .line 155
    .line 156
    const/16 v1, 0xe

    .line 157
    .line 158
    aput-object v14, v0, v1

    .line 159
    .line 160
    const/16 v1, 0xf

    .line 161
    .line 162
    aput-object v15, v0, v1

    .line 163
    .line 164
    const/16 v1, 0x10

    .line 165
    .line 166
    aput-object v16, v0, v1

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 170
    move-result-object v0

    .line 171
    return-object v0
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "name"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "reactContext"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    sparse-switch v0, :sswitch_data_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :sswitch_0
    const-string v0, "Vibration"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    move-result p1

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_0
    new-instance p1, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/vibration/VibrationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 37
    return-object p1

    .line 38
    .line 39
    :sswitch_1
    const-string v0, "NativeAnimatedModule"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_1
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 53
    return-object p1

    .line 54
    .line 55
    :sswitch_2
    const-string v0, "ShareModule"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    new-instance p1, Lcom/facebook/react/modules/share/ShareModule;

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/share/ShareModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 69
    return-object p1

    .line 70
    .line 71
    :sswitch_3
    const-string v0, "BlobModule"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_3
    new-instance p1, Lcom/facebook/react/modules/blob/BlobModule;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/BlobModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 85
    return-object p1

    .line 86
    .line 87
    :sswitch_4
    const-string v0, "Networking"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result p1

    .line 92
    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_4
    new-instance p1, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 101
    return-object p1

    .line 102
    .line 103
    :sswitch_5
    const-string v0, "AppState"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_5
    new-instance p1, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appstate/AppStateModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 117
    return-object p1

    .line 118
    .line 119
    :sswitch_6
    const-string v0, "IntentAndroid"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    move-result p1

    .line 124
    .line 125
    if-nez p1, :cond_6

    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :cond_6
    new-instance p1, Lcom/facebook/react/modules/intent/IntentModule;

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/intent/IntentModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 133
    return-object p1

    .line 134
    .line 135
    :sswitch_7
    const-string v0, "Clipboard"

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_7
    new-instance p1, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 146
    .line 147
    .line 148
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/clipboard/ClipboardModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 149
    return-object p1

    .line 150
    .line 151
    :sswitch_8
    const-string v0, "FrescoModule"

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    move-result p1

    .line 156
    .line 157
    if-nez p1, :cond_8

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_8
    new-instance p1, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 162
    .line 163
    iget-object v0, p0, Lcom/facebook/react/shell/MainReactPackage;->config:Lcom/facebook/react/shell/MainPackageConfig;

    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/facebook/react/shell/MainPackageConfig;->getFrescoConfig()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    .line 169
    move-result-object v1

    .line 170
    :cond_9
    const/4 v0, 0x1

    .line 171
    .line 172
    .line 173
    invoke-direct {p1, p2, v0, v1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLcom/facebook/imagepipeline/core/ImagePipelineConfig;)V

    .line 174
    return-object p1

    .line 175
    .line 176
    :sswitch_9
    const-string v0, "DevLoadingView"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    move-result p1

    .line 181
    .line 182
    if-nez p1, :cond_a

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_a
    new-instance p1, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 187
    .line 188
    .line 189
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devloading/DevLoadingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 190
    return-object p1

    .line 191
    .line 192
    :sswitch_a
    const-string v0, "WebSocketModule"

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    move-result p1

    .line 197
    .line 198
    if-nez p1, :cond_b

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_b
    new-instance p1, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 203
    .line 204
    .line 205
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 206
    return-object p1

    .line 207
    .line 208
    :sswitch_b
    const-string v0, "StatusBarManager"

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    move-result p1

    .line 213
    .line 214
    if-nez p1, :cond_c

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_c
    new-instance p1, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 219
    .line 220
    .line 221
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/statusbar/StatusBarModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 222
    return-object p1

    .line 223
    .line 224
    :sswitch_c
    const-string v0, "AccessibilityInfo"

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    move-result p1

    .line 229
    .line 230
    if-nez p1, :cond_d

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_d
    new-instance p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 235
    .line 236
    .line 237
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 238
    return-object p1

    .line 239
    .line 240
    :sswitch_d
    const-string v0, "Appearance"

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    move-result p1

    .line 245
    .line 246
    if-nez p1, :cond_e

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_e
    new-instance p1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 251
    const/4 v0, 0x2

    .line 252
    .line 253
    .line 254
    invoke-direct {p1, p2, v1, v0, v1}, Lcom/facebook/react/modules/appearance/AppearanceModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 255
    return-object p1

    .line 256
    .line 257
    :sswitch_e
    const-string v0, "I18nManager"

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    move-result p1

    .line 262
    .line 263
    if-nez p1, :cond_f

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_f
    new-instance p1, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 268
    .line 269
    .line 270
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 271
    return-object p1

    .line 272
    .line 273
    :sswitch_f
    const-string v0, "ReactDevToolsSettingsManager"

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    move-result p1

    .line 278
    .line 279
    if-nez p1, :cond_10

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_10
    new-instance p1, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 284
    .line 285
    .line 286
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 287
    return-object p1

    .line 288
    .line 289
    :sswitch_10
    const-string v0, "ImageLoader"

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    move-result p1

    .line 294
    .line 295
    if-nez p1, :cond_11

    .line 296
    goto :goto_0

    .line 297
    .line 298
    :cond_11
    new-instance p1, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 299
    .line 300
    .line 301
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/image/ImageLoaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 302
    return-object p1

    .line 303
    .line 304
    :sswitch_11
    const-string v0, "PermissionsAndroid"

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    move-result p1

    .line 309
    .line 310
    if-nez p1, :cond_12

    .line 311
    goto :goto_0

    .line 312
    .line 313
    :cond_12
    new-instance p1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 314
    .line 315
    .line 316
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/permissions/PermissionsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 317
    return-object p1

    .line 318
    .line 319
    :sswitch_12
    const-string v0, "ReactDevToolsRuntimeSettingsModule"

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    move-result p1

    .line 324
    .line 325
    if-nez p1, :cond_13

    .line 326
    goto :goto_0

    .line 327
    .line 328
    :cond_13
    new-instance p1, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 329
    .line 330
    .line 331
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 332
    return-object p1

    .line 333
    .line 334
    :sswitch_13
    const-string v0, "FileReaderModule"

    .line 335
    .line 336
    .line 337
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    move-result p1

    .line 339
    .line 340
    if-nez p1, :cond_14

    .line 341
    goto :goto_0

    .line 342
    .line 343
    :cond_14
    new-instance p1, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 344
    .line 345
    .line 346
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/FileReaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 347
    return-object p1

    .line 348
    .line 349
    :sswitch_14
    const-string v0, "DialogManagerAndroid"

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    move-result p1

    .line 354
    .line 355
    if-nez p1, :cond_15

    .line 356
    goto :goto_0

    .line 357
    .line 358
    :cond_15
    new-instance p1, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 359
    .line 360
    .line 361
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 362
    return-object p1

    .line 363
    .line 364
    :sswitch_15
    const-string v0, "SoundManager"

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    move-result p1

    .line 369
    .line 370
    if-nez p1, :cond_16

    .line 371
    goto :goto_0

    .line 372
    .line 373
    :cond_16
    new-instance p1, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 374
    .line 375
    .line 376
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/sound/SoundManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 377
    return-object p1

    .line 378
    .line 379
    :sswitch_16
    const-string v0, "ImageStoreManager"

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    move-result p1

    .line 384
    .line 385
    if-nez p1, :cond_17

    .line 386
    goto :goto_0

    .line 387
    .line 388
    :cond_17
    new-instance p1, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 389
    .line 390
    .line 391
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/camera/ImageStoreManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 392
    return-object p1

    .line 393
    .line 394
    :sswitch_17
    const-string v0, "ToastAndroid"

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    move-result p1

    .line 399
    .line 400
    if-nez p1, :cond_18

    .line 401
    :goto_0
    return-object v1

    .line 402
    .line 403
    :cond_18
    new-instance p1, Lcom/facebook/react/modules/toast/ToastModule;

    .line 404
    .line 405
    .line 406
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 407
    return-object p1

    .line 408
    nop

    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    :sswitch_data_0
    .sparse-switch
        -0x7e115d98 -> :sswitch_17
        -0x74ffd399 -> :sswitch_16
        -0x6e4e4c42 -> :sswitch_15
        -0x629eae76 -> :sswitch_14
        -0x501dbf35 -> :sswitch_13
        -0x3f9971de -> :sswitch_12
        -0x3f4dc695 -> :sswitch_11
        -0x272d42d2 -> :sswitch_10
        -0x22e925fb -> :sswitch_f
        -0x21ff2871 -> :sswitch_e
        -0x1e16677c -> :sswitch_d
        -0x1b4a7d04 -> :sswitch_c
        -0x16ced634 -> :sswitch_b
        -0xf2876ed -> :sswitch_a
        -0x5ea6d34 -> :sswitch_9
        0x9baee92 -> :sswitch_8
        0x180dfd76 -> :sswitch_7
        0x219d6013 -> :sswitch_6
        0x48cceb10 -> :sswitch_5
        0x5a50c314 -> :sswitch_4
        0x5c43b489 -> :sswitch_3
        0x5cb5e70b -> :sswitch_2
        0x66989206 -> :sswitch_1
        0x72911272 -> :sswitch_0
    .end sparse-switch
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/common/ClassFinder;->canLoadClassesFromAnnotationProcessors()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/facebook/react/common/ClassFinder;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :catch_1
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    .line 34
    :goto_0
    instance-of v3, v1, Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    move-object v2, v1

    .line 38
    .line 39
    check-cast v2, Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 40
    .line 41
    :cond_2
    if-nez v2, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 45
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object v0

    .line 47
    :cond_3
    return-object v2

    .line 48
    .line 49
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    throw v2

    .line 54
    .line 55
    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    throw v2

    .line 60
    .line 61
    .line 62
    :catch_2
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 63
    move-result-object v0

    .line 64
    return-object v0
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
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final getViewManagersMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

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
.end method
