.class public Lcom/horcrux/svg/SvgPackage$w;
.super Ljava/lang/Object;
.source "SvgPackage.java"

# interfaces
.implements Lcom/facebook/react/module/model/ReactModuleInfoProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgPackage;->getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/horcrux/svg/SvgPackage;


# direct methods
.method public constructor <init>(Lcom/horcrux/svg/SvgPackage;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/SvgPackage$w;->a:Lcom/horcrux/svg/SvgPackage;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.method public getReactModuleInfos()Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/module/model/ReactModuleInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    const-class v1, Lcom/horcrux/svg/SvgViewModule;

    .line 8
    .line 9
    const-class v2, Lcom/horcrux/svg/RNSVGRenderableManager;

    .line 10
    .line 11
    .line 12
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    const/4 v3, 0x2

    .line 16
    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    aget-object v3, v1, v2

    .line 20
    .line 21
    const-class v4, Lcom/facebook/react/module/annotations/ReactModule;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    check-cast v4, Lcom/facebook/react/module/annotations/ReactModule;

    .line 28
    .line 29
    .line 30
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    new-instance v6, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 34
    .line 35
    .line 36
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 37
    move-result-object v7

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object v8

    .line 42
    .line 43
    .line 44
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->canOverrideExistingModule()Z

    .line 45
    move-result v9

    .line 46
    .line 47
    .line 48
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->needsEagerInit()Z

    .line 49
    move-result v10

    .line 50
    .line 51
    .line 52
    invoke-interface {v4}, Lcom/facebook/react/module/annotations/ReactModule;->isCxxModule()Z

    .line 53
    move-result v11

    .line 54
    const/4 v12, 0x1

    .line 55
    .line 56
    .line 57
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
