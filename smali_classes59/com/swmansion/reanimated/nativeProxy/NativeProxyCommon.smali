.class public abstract Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;
.super Ljava/lang/Object;
.source "NativeProxyCommon.java"


# instance fields
.field private final ANIMATIONS_DRAG_FACTOR:I

.field protected cppVersion:Ljava/lang/String;

.field private firstUptime:Ljava/lang/Long;

.field private final gestureHandlerStateManager:Lpb0/a;

.field private final keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

.field protected final mContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;"
        }
    .end annotation
.end field

.field protected mNodesManager:Lcom/swmansion/reanimated/NodesManager;

.field protected final mWorkletsModule:Lcom/swmansion/worklets/WorkletsModule;

.field private final reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

.field private slowAnimationsEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reanimated"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

    .line 7
    return-void
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

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    move-result-wide v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->firstUptime:Ljava/lang/Long;

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->slowAnimationsEnabled:Z

    .line 17
    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    iput v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->ANIMATIONS_DRAG_FACTOR:I

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->cppVersion:Ljava/lang/String;

    .line 24
    .line 25
    const-class v1, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/swmansion/reanimated/ReanimatedModule;->getWorkletsModule()Lcom/swmansion/worklets/WorkletsModule;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iput-object v1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mWorkletsModule:Lcom/swmansion/worklets/WorkletsModule;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    iput-object v1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mContext:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    new-instance v2, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 50
    .line 51
    .line 52
    invoke-direct {v2, v1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 53
    .line 54
    iput-object v2, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 55
    .line 56
    new-instance v2, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, v1}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 60
    .line 61
    iput-object v2, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->addDevMenuOption()V

    .line 65
    .line 66
    :try_start_0
    const-class v1, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 67
    .line 68
    sget-object v2, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->Companion:Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$Companion;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    check-cast p1, Lpb0/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    move-object v0, p1

    .line 76
    .line 77
    :catch_0
    iput-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->gestureHandlerStateManager:Lpb0/a;

    .line 78
    return-void
    .line 79
    .line 80
    .line 81
.end method

.method public static synthetic a(Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->toggleSlowAnimations()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private addDevMenuOption()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mContext:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    new-instance v1, Lcom/swmansion/reanimated/nativeProxy/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/swmansion/reanimated/nativeProxy/a;-><init>(Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/swmansion/reanimated/DevMenuUtils;->addDevMenuOption(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V

    .line 17
    return-void
.end method

.method private convertProps(Lcom/facebook/react/bridge/ReadableNativeArray;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReadableNativeArray;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReadableNativeArray;->toArrayList()Ljava/util/ArrayList;

    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 14
    move-result v2

    .line 15
    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0
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
    .line 81
.end method

.method private toggleSlowAnimations()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->slowAnimationsEnabled:Z

    .line 3
    .line 4
    xor-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->slowAnimationsEnabled:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->firstUptime:Ljava/lang/Long;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->slowAnimationsEnabled:Z

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/swmansion/reanimated/NodesManager;->enableSlowAnimations(ZI)V

    .line 28
    return-void
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
.end method


# virtual methods
.method public checkCppVersion()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->cppVersion:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->getReanimatedJavaVersion()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->cppVersion:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    const-string v3, "[Reanimated] Mismatch between Java code version and C++ code version ("

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v0, " vs. "

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->cppVersion:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information."

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 55
    throw v1

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 58
    .line 59
    const-string v1, "[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information."

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 63
    throw v0
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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public configureProps(Lcom/facebook/react/bridge/ReadableNativeArray;Lcom/facebook/react/bridge/ReadableNativeArray;)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->convertProps(Lcom/facebook/react/bridge/ReadableNativeArray;)Ljava/util/Set;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->convertProps(Lcom/facebook/react/bridge/ReadableNativeArray;)Ljava/util/Set;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/swmansion/reanimated/NodesManager;->configureProps(Ljava/util/Set;Ljava/util/Set;)V

    .line 14
    return-void
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
.end method

.method public dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/swmansion/reanimated/NodesManager;->dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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

.method public getAnimationTimestamp()J
    .locals 6
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->slowAnimationsEnabled:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->firstUptime:Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    iget-object v4, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->firstUptime:Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 20
    move-result-wide v4

    .line 21
    sub-long/2addr v2, v4

    .line 22
    .line 23
    const-wide/16 v4, 0xa

    .line 24
    div-long/2addr v2, v4

    .line 25
    add-long/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 30
    move-result-wide v0

    .line 31
    return-wide v0
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
.end method

.method public abstract getHybridData()Lcom/facebook/jni/HybridData;
.end method

.method public getIsReducedMotion()Z
    .locals 2
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mContext:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "transition_animation_scale"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 29
    :goto_0
    const/4 v1, 0x0

    .line 30
    .line 31
    cmpl-float v0, v0, v1

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    return v0
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
.end method

.method public getReanimatedJavaVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    const-string v0, "3.18.2"

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
.end method

.method public native installJSIBindings()V
.end method

.method public maybeFlushUIUpdatesQueue()V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->isAnimationRunning()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->performOperations()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public measure(I)[F
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NodesManager;->measure(I)[F

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 25
.end method

.method public obtainProp(ILjava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/swmansion/reanimated/NodesManager;->obtainProp(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public prepareLayoutAnimations(Lcom/swmansion/reanimated/layoutReanimation/LayoutAnimations;)V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/swmansion/reanimated/Utils;->isChromeDebugger:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string p1, "[REANIMATED]"

    .line 7
    .line 8
    const-string v0, "You can not use LayoutAnimation with enabled Chrome Debugger"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mContext:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 21
    .line 22
    const-class v1, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/swmansion/reanimated/ReanimatedModule;->getNodesManager()Lcom/swmansion/reanimated/NodesManager;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mContext:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/swmansion/reanimated/ReanimatedModule;->getNodesManager()Lcom/swmansion/reanimated/NodesManager;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->getAnimationsManager()Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcom/swmansion/reanimated/NativeProxy;->createNativeMethodsHolder(Lcom/swmansion/reanimated/layoutReanimation/LayoutAnimations;)Lcom/swmansion/reanimated/layoutReanimation/NativeMethodsHolder;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->setNativeMethods(Lcom/swmansion/reanimated/layoutReanimation/NativeMethodsHolder;)V

    .line 70
    return-void
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
.end method

.method public registerEventHandler(Lcom/swmansion/reanimated/nativeProxy/EventHandler;)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->getEventNameResolver()Lcom/facebook/react/uimanager/UIManagerModule$CustomEventNamesResolver;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iput-object v0, p1, Lcom/swmansion/reanimated/nativeProxy/EventHandler;->mCustomEventNamesResolver:Lcom/facebook/react/uimanager/UIManagerModule$CustomEventNamesResolver;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NodesManager;->registerEventHandler(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    .line 14
    return-void
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
    .line 25
.end method

.method public registerSensor(IILcom/swmansion/reanimated/nativeProxy/SensorSetter;)I
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->getInstanceById(I)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->registerSensor(Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;ILcom/swmansion/reanimated/nativeProxy/SensorSetter;)I

    .line 10
    move-result p1

    .line 11
    return p1
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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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

.method public requestRender(Lcom/swmansion/reanimated/nativeProxy/AnimationFrameCallback;)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NodesManager;->postOnAnimation(Lcom/swmansion/reanimated/NodesManager$OnAnimationFrame;)V

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
    .line 25
.end method

.method public scrollTo(IDDZ)V
    .locals 7
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    move v6, p6

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {v0 .. v6}, Lcom/swmansion/reanimated/NodesManager;->scrollTo(IDDZ)V

    .line 10
    return-void
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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
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
.end method

.method public setCppVersion(Ljava/lang/String;)V
    .locals 0
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->cppVersion:Ljava/lang/String;

    .line 3
    return-void
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
    .line 25
.end method

.method public setGestureState(II)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->gestureHandlerStateManager:Lpb0/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lpb0/a;->setGestureHandlerState(II)V

    .line 8
    :cond_0
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
    .line 21
    .line 22
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
.end method

.method public subscribeForKeyboardEvents(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->subscribeForKeyboardUpdates(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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

.method public unregisterSensor(I)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->unregisterSensor(I)V

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
    .line 25
.end method

.method public unsubscribeFromKeyboardEvents(I)V
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->unsubscribeFromKeyboardUpdates(I)V

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
    .line 25
.end method

.method public updateProps(ILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nativeProxy/NativeProxyCommon;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/swmansion/reanimated/NodesManager;->updateProps(ILjava/util/Map;)V

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
.end method
