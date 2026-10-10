.class public Lcom/swmansion/reanimated/ReanimatedUIManagerFactory;
.super Ljava/lang/Object;
.source "ReanimatedUIManagerFactory.java"


# direct methods
.method public constructor <init>()V
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
.end method

.method public static create(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)Lcom/facebook/react/uimanager/UIManagerModule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;I)",
            "Lcom/facebook/react/uimanager/UIManagerModule;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/ViewManagerRegistry;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/ViewManagerRegistry;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    new-instance v1, Lcom/facebook/react/uimanager/ReanimatedUIManager;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/uimanager/ReanimatedUIManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)V

    .line 11
    .line 12
    new-instance p1, Lcom/facebook/react/uimanager/ReanimatedUIImplementation;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/UIManagerModule;->getEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0, v0, v2, p2}, Lcom/facebook/react/uimanager/ReanimatedUIImplementation;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V

    .line 20
    .line 21
    const-class p0, Lcom/facebook/react/uimanager/ReanimatedUIManager;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    .line 30
    const-string/jumbo p0, "reanimated"

    .line 31
    .line 32
    .line 33
    const-string/jumbo p1, "unable to resolve super class of ReanimatedUIManager"

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    return-object v1

    .line 38
    .line 39
    :cond_0
    :try_start_0
    const-string p2, "mUIImplementation"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    move-result-object p0

    .line 44
    const/4 p2, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 48
    .line 49
    :try_start_1
    const-class v0, Ljava/lang/reflect/Field;

    .line 50
    .line 51
    const-string v2, "accessFlags"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 62
    move-result p2

    .line 63
    .line 64
    and-int/lit8 p2, p2, -0x11

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception p2

    .line 70
    goto :goto_0

    .line 71
    :catch_1
    move-exception p2

    .line 72
    .line 73
    .line 74
    :goto_0
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-virtual {p0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 78
    goto :goto_3

    .line 79
    :catch_2
    move-exception p0

    .line 80
    goto :goto_2

    .line 81
    :catch_3
    move-exception p0

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    :goto_3
    return-object v1
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
