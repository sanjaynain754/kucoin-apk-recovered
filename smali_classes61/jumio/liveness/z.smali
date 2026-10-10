.class public final Ljumio/liveness/z;
.super Lcom/jumio/core/extraction/ExtractionClient;
.source "SourceFile"


# static fields
.field public static final synthetic F:I


# instance fields
.field public final A:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public B:Lcom/jumio/core/performance/FrameRateCheck;

.field public final C:Lcom/jumio/commons/camera/Size;

.field public D:Lcom/jumio/core/data/ScanMode;

.field public E:Ljava/lang/String;

.field public final u:Lcom/jumio/core/models/LivenessSettingsModel;

.field public final v:Ljumio/liveness/n;

.field public w:Lcom/jumio/core/cdn/CDNFeatureModel;

.field public x:Lcom/jumio/core/models/TimeModel;

.field public y:Z

.field public final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/jumio/core/MobileContext;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/LivenessSettingsModel;)V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljumio/liveness/n;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljumio/liveness/n;-><init>(Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 6
    .line 7
    const-string v1, "context"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v1, "scopeProvider"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v1, "livenessSettingsModel"

    .line 18
    .line 19
    .line 20
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v1, "livenessProcessor"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/extraction/ExtractionClient;-><init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 29
    .line 30
    iput-object p3, p0, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 31
    .line 32
    iput-object v0, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 33
    .line 34
    new-instance v2, Lcom/jumio/core/models/TimeModel;

    .line 35
    const/4 v7, 0x3

    .line 36
    const/4 v8, 0x0

    .line 37
    .line 38
    const-wide/16 v3, 0x0

    .line 39
    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v2 .. v8}, Lcom/jumio/core/models/TimeModel;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    iput-object v2, p0, Ljumio/liveness/z;->x:Lcom/jumio/core/models/TimeModel;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    const/4 p2, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 57
    .line 58
    iput-object p1, p0, Ljumio/liveness/z;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 64
    .line 65
    iput-object p1, p0, Ljumio/liveness/z;->A:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    .line 67
    new-instance p1, Lcom/jumio/core/performance/FrameRateCheck;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Lcom/jumio/core/models/LivenessSettingsModel;->getFrameRateThreshold()I

    .line 71
    move-result p2

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Lcom/jumio/core/models/LivenessSettingsModel;->getViolationLimit()I

    .line 75
    move-result p3

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, p2, p3}, Lcom/jumio/core/performance/FrameRateCheck;-><init>(II)V

    .line 79
    .line 80
    iput-object p1, p0, Ljumio/liveness/z;->B:Lcom/jumio/core/performance/FrameRateCheck;

    .line 81
    .line 82
    new-instance p1, Lcom/jumio/commons/camera/Size;

    .line 83
    .line 84
    const/16 p2, 0x780

    .line 85
    .line 86
    const/16 p3, 0x438

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, p2, p3}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 90
    .line 91
    iput-object p1, p0, Ljumio/liveness/z;->C:Lcom/jumio/commons/camera/Size;

    .line 92
    .line 93
    sget-object p1, Lcom/jumio/core/data/ScanMode;->JUMIO_LIVENESS:Lcom/jumio/core/data/ScanMode;

    .line 94
    .line 95
    iput-object p1, p0, Ljumio/liveness/z;->D:Lcom/jumio/core/data/ScanMode;

    .line 96
    return-void
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
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/extraction/ExtractionClient;->cancel()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "Cancelling "

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    const-class v1, Ljumio/liveness/z;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "LivenessExtractionClient"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v0, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljumio/liveness/n;->c()V

    .line 38
    .line 39
    sget-object v0, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 40
    return-void
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
.end method

.method public final configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "dataManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "configurationModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/jumio/core/extraction/ExtractionClient;->configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->isConfigured()Z

    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x2

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v3, v0, v4, v2}, Lcom/jumio/core/environment/Environment;->loadDaClientLib$default(Lcom/jumio/core/environment/Environment;Landroid/content/Context;ZILjava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v1, v0

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p0, v1}, Lcom/jumio/core/extraction/ExtractionClient;->setConfigured(Z)V

    .line 43
    .line 44
    instance-of v1, p2, Lcom/jumio/core/models/ScanPartModel;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    const-class v1, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    check-cast v1, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 55
    .line 56
    iput-object v1, p0, Ljumio/liveness/z;->w:Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 57
    .line 58
    const-class v1, Lcom/jumio/core/models/TimeModel;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    check-cast v1, Lcom/jumio/core/models/TimeModel;

    .line 65
    .line 66
    iput-object v1, p0, Ljumio/liveness/z;->x:Lcom/jumio/core/models/TimeModel;

    .line 67
    .line 68
    instance-of v1, p2, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    move-object v2, p2

    .line 72
    .line 73
    check-cast v2, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 74
    .line 75
    :cond_1
    if-eqz v2, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    iput-object p2, p0, Ljumio/liveness/z;->D:Lcom/jumio/core/data/ScanMode;

    .line 82
    .line 83
    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_PREMIUM:Lcom/jumio/core/data/ScanMode;

    .line 84
    .line 85
    if-ne p2, v1, :cond_3

    .line 86
    .line 87
    const-class p2, Lcom/jumio/core/models/InitiateModel;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    check-cast p1, Lcom/jumio/core/models/InitiateModel;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/jumio/core/models/InitiateModel;->getWorkflowExecutionId()Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    iput-object p1, p0, Ljumio/liveness/z;->E:Ljava/lang/String;

    .line 100
    return-void

    .line 101
    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    const-string p2, "Configuration model should be an instance of ScanPartModel"

    .line 105
    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->setConfigured(Z)V

    .line 115
    :cond_3
    return-void
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
.end method

.method public final destroy()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/extraction/ExtractionClient;->destroy()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "Destroying "

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    const-class v1, Ljumio/liveness/z;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "LivenessExtractionClient"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v0, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljumio/liveness/n;->c()V

    .line 38
    return-void
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
.end method

.method public final getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/z;->B:Lcom/jumio/core/performance/FrameRateCheck;

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
    .line 21
.end method

.method public final getPreferredPreviewSize()Lcom/jumio/commons/camera/Size;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/z;->C:Lcom/jumio/commons/camera/Size;

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
    .line 21
.end method

.method public final init()V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    .line 5
    invoke-super {v1}, Lcom/jumio/core/extraction/ExtractionClient;->init()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    new-instance v5, Ljumio/liveness/t;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v5, v1, v0}, Ljumio/liveness/t;-><init>(Ljumio/liveness/z;Lkotlin/coroutines/Continuation;)V

    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Initialising "

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    const-class v3, Ljumio/liveness/z;

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    const-string v3, "LivenessExtractionClient"

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v2}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    iget-object v2, v1, Ljumio/liveness/z;->w:Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 58
    const/4 v4, 0x2

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    const-string v5, "livenessAssets"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v5}, Lcom/jumio/core/cdn/CDNFeatureModel;->get(Ljava/lang/String;)Lcom/jumio/core/cdn/CDNEncryptedEntry;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    :cond_0
    move/from16 v17, v4

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {v2}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->isPreloadedFile()Z

    .line 76
    move-result v5

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    sget-object v5, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 81
    .line 82
    const-string v6, "livenessAssetsPreloaded"

    .line 83
    .line 84
    .line 85
    invoke-static {v6, v0, v4, v0}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 90
    .line 91
    :cond_2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 92
    .line 93
    iget-object v5, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Lcom/jumio/core/models/LivenessSettingsModel;->getSamplingTimeInMs()J

    .line 97
    move-result-wide v5

    .line 98
    .line 99
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 103
    move-result-wide v5

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v5, v6, v1}, Lcom/jumio/core/extraction/ExtractionClient;->startFrameRateObservation(JLcom/jumio/core/performance/FrameRateCallback;)V

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v7, "Frame rate observation initialised with:\n"

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    iget-object v7, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Lcom/jumio/core/models/LivenessSettingsModel;->getFrameRateThreshold()I

    .line 119
    move-result v7

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v7, " FPS threshold\n"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v5, " Ns sampling time\n"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    iget-object v5, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5}, Lcom/jumio/core/models/LivenessSettingsModel;->getViolationLimit()I

    .line 141
    move-result v5

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v5, " violation limit"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    .line 156
    invoke-static {v3, v0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 159
    .line 160
    sget-object v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceCenterArea()I

    .line 164
    move-result v6

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 172
    move-result-object v7

    .line 173
    .line 174
    iget-object v8, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaxFaceCenterDifference()D

    .line 178
    move-result-wide v9

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 182
    move-result-object v11

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 186
    move-result v11

    .line 187
    int-to-double v11, v11

    .line 188
    mul-double/2addr v9, v11

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaxFaceCenterDifference()D

    .line 192
    move-result-wide v11

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 196
    move-result-object v8

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 200
    move-result v8

    .line 201
    int-to-double v13, v8

    .line 202
    mul-double/2addr v11, v13

    .line 203
    .line 204
    new-instance v8, Lcom/jumio/core/extraction/JumioRect;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 208
    move-result-object v13

    .line 209
    .line 210
    .line 211
    invoke-virtual {v13}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 212
    move-result v13

    .line 213
    div-int/2addr v13, v4

    .line 214
    int-to-double v13, v13

    .line 215
    move-object v15, v5

    .line 216
    .line 217
    move/from16 v16, v6

    .line 218
    int-to-double v5, v4

    .line 219
    div-double/2addr v9, v5

    .line 220
    sub-double/2addr v13, v9

    .line 221
    double-to-int v13, v13

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 225
    move-result-object v14

    .line 226
    .line 227
    .line 228
    invoke-virtual {v14}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 229
    move-result v14

    .line 230
    div-int/2addr v14, v4

    .line 231
    .line 232
    move/from16 v17, v4

    .line 233
    .line 234
    move-wide/from16 v18, v5

    .line 235
    int-to-double v4, v14

    .line 236
    .line 237
    div-double v11, v11, v18

    .line 238
    sub-double/2addr v4, v11

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    const-wide v18, 0x3ff199999999999aL    # 1.1

    .line 244
    .line 245
    mul-double v4, v4, v18

    .line 246
    double-to-int v4, v4

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 250
    move-result-object v5

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 254
    move-result v5

    .line 255
    .line 256
    div-int/lit8 v5, v5, 0x2

    .line 257
    int-to-double v5, v5

    .line 258
    add-double/2addr v5, v9

    .line 259
    double-to-int v5, v5

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 263
    move-result-object v6

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 267
    move-result v6

    .line 268
    .line 269
    div-int/lit8 v6, v6, 0x2

    .line 270
    int-to-double v6, v6

    .line 271
    add-double/2addr v6, v11

    .line 272
    .line 273
    mul-double v6, v6, v18

    .line 274
    double-to-int v6, v6

    .line 275
    .line 276
    .line 277
    invoke-direct {v8, v13, v4, v5, v6}, Lcom/jumio/core/extraction/JumioRect;-><init>(IIII)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8}, Lcom/jumio/core/extraction/JumioRect;->toRectF()Landroid/graphics/RectF;

    .line 281
    move-result-object v4

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v4}, Lcom/jumio/commons/camera/CameraUtilsKt;->previewToSurface(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 285
    move-result-object v7

    .line 286
    const/4 v9, 0x4

    .line 287
    const/4 v10, 0x0

    .line 288
    const/4 v8, 0x0

    .line 289
    move-object v5, v15

    .line 290
    .line 291
    move/from16 v6, v16

    .line 292
    .line 293
    .line 294
    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    .line 295
    move-result-object v0

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v0}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 299
    .line 300
    :try_start_0
    new-instance v4, Ljumio/liveness/B;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    .line 304
    move-result-object v0

    .line 305
    .line 306
    const-string v5, "null cannot be cast to non-null type com.jumio.core.MobileContext"

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    move-object v5, v0

    .line 311
    .line 312
    check-cast v5, Lcom/jumio/core/MobileContext;

    .line 313
    .line 314
    iget-object v6, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 315
    .line 316
    iget-object v7, v1, Ljumio/liveness/z;->x:Lcom/jumio/core/models/TimeModel;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 324
    move-result-object v0

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->isPortrait()Z

    .line 328
    move-result v8

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    iget-object v9, v1, Ljumio/liveness/z;->u:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9}, Lcom/jumio/core/models/LivenessSettingsModel;->getModelInitTimeoutInMs()J

    .line 338
    move-result-wide v9

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v0, v9, v10}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->load(Landroid/content/Context;J)Ljava/nio/ByteBuffer;

    .line 342
    move-result-object v9

    .line 343
    .line 344
    iget-object v10, v1, Ljumio/liveness/z;->D:Lcom/jumio/core/data/ScanMode;

    .line 345
    .line 346
    iget-object v11, v1, Ljumio/liveness/z;->E:Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    invoke-direct/range {v4 .. v11}, Ljumio/liveness/B;-><init>(Lcom/jumio/core/MobileContext;Lcom/jumio/core/models/LivenessSettingsModel;Lcom/jumio/core/models/TimeModel;ZLjava/nio/ByteBuffer;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;)V

    .line 350
    .line 351
    iget-object v0, v1, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 352
    .line 353
    new-instance v2, Ljumio/liveness/y;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Ljumio/liveness/y;-><init>(Ljumio/liveness/z;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v2, v4}, Ljumio/liveness/n;->a(Ljumio/liveness/y;Ljumio/liveness/B;)V

    .line 360
    .line 361
    iget-object v0, v1, Ljumio/liveness/z;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 362
    const/4 v2, 0x0

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    return-void

    .line 367
    :catch_0
    move-exception v0

    .line 368
    .line 369
    new-instance v2, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v4, "Liveness error: "

    .line 372
    .line 373
    .line 374
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    move-result-object v4

    .line 379
    .line 380
    .line 381
    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 382
    move-result-object v4

    .line 383
    .line 384
    .line 385
    invoke-interface {v4}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 386
    move-result-object v4

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v4, " | "

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 398
    move-result-object v4

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    move-result-object v2

    .line 406
    .line 407
    .line 408
    invoke-static {v3, v2}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 412
    .line 413
    new-instance v2, Lcom/jumio/analytics/MetaInfo;

    .line 414
    .line 415
    .line 416
    invoke-direct {v2}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 420
    move-result-object v0

    .line 421
    .line 422
    const-string v3, "message"

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v3, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 428
    .line 429
    const-string v3, "livenessError"

    .line 430
    .line 431
    .line 432
    invoke-static {v3, v2}, Lcom/jumio/analytics/MobileEvents;->misc(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 433
    move-result-object v2

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 437
    .line 438
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->SCANNING_ERROR:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v0}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 442
    return-void

    .line 443
    .line 444
    :goto_0
    const-string v2, "Could not find encrypted model for livenessAssets"

    .line 445
    .line 446
    .line 447
    invoke-static {v3, v2}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    .line 449
    sget-object v2, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 450
    .line 451
    const-string v3, "livenessAssetsNotAvailable"

    .line 452
    .line 453
    move/from16 v4, v17

    .line 454
    .line 455
    .line 456
    invoke-static {v3, v0, v4, v0}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 457
    move-result-object v0

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 461
    .line 462
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->SCANNING_ERROR:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v0}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 466
    return-void
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
.end method

.method public final onFramesSampled(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/z;->B:Lcom/jumio/core/performance/FrameRateCheck;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/jumio/core/performance/FrameRateCheck;->checkFrameRate(I)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 13
    .line 14
    const-string v0, "livenessFrameRateFallback"

    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v1, v2}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 24
    .line 25
    sget-object p1, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 29
    :cond_0
    return-void
    .line 30
.end method

.method public final process(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "frame"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "cameraSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p2, "extractionArea"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-boolean p2, p0, Ljumio/liveness/z;->y:Z

    .line 18
    const/4 p3, 0x0

    .line 19
    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 36
    move-result p2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz p2, :cond_b

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 66
    move-result v2

    .line 67
    .line 68
    const/16 v3, 0x2d0

    .line 69
    .line 70
    if-lt v2, v3, :cond_a

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 74
    move-result v1

    .line 75
    .line 76
    if-lt v1, v3, :cond_a

    .line 77
    .line 78
    iget-object v1, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljumio/liveness/n;->b()Z

    .line 82
    move-result v1

    .line 83
    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    const-string p1, "LivenessExtractionClient"

    .line 87
    .line 88
    const-string p2, "Liveness client not ready, could not process image!"

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 95
    return-void

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "Processing frame with timeStamp="

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 113
    move-result-wide v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v2, ", width="

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string p2, ", height="

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string p2, ", rotation="

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 141
    move-result-object p2

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getRotation()I

    .line 145
    move-result p2

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string p2, ", orientation="

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getOrientation()I

    .line 161
    move-result p2

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object p2

    .line 169
    .line 170
    const-string v0, "LivenessExtractionClient"

    .line 171
    .line 172
    .line 173
    invoke-static {v0, p2}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    iget-object p2, p0, Ljumio/liveness/z;->A:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 179
    move-result p2

    .line 180
    .line 181
    if-eqz p2, :cond_3

    .line 182
    .line 183
    .line 184
    invoke-static {}, Lcom/jumio/core/util/QAKt;->getQA()Lcom/jumio/core/interfaces/QAInterface;

    .line 185
    move-result-object p2

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    :cond_3
    iget-object p2, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    const-string v0, "frame"

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Ljumio/liveness/n;->b()Z

    .line 202
    move-result v0

    .line 203
    .line 204
    if-nez v0, :cond_4

    .line 205
    .line 206
    goto/16 :goto_8

    .line 207
    .line 208
    :cond_4
    :try_start_0
    iget-object v1, p2, Ljumio/liveness/n;->i:Ljava/lang/Object;

    .line 209
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    .line 211
    :try_start_1
    iget-object v0, p2, Ljumio/liveness/n;->c:Lcom/jumio/liveness/LivenessUX;

    .line 212
    .line 213
    if-eqz v0, :cond_5

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/jumio/liveness/LivenessUX;->onBeforeFrame()V

    .line 217
    .line 218
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    goto :goto_0

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    move-object p1, v0

    .line 222
    .line 223
    goto/16 :goto_6

    .line 224
    :cond_5
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 228
    move-result-wide v3

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;

    .line 236
    move-result-object v0

    .line 237
    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    iget-object v1, p2, Ljumio/liveness/n;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 241
    .line 242
    .line 243
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 244
    move-result-object v2

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    goto :goto_1

    .line 249
    :catch_0
    move-exception v0

    .line 250
    move-object p1, v0

    .line 251
    .line 252
    goto/16 :goto_7

    .line 253
    .line 254
    :cond_6
    :goto_1
    iget-object v1, p2, Ljumio/liveness/n;->h:Ljava/lang/Object;

    .line 255
    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    .line 257
    :try_start_3
    iget-object v0, p2, Ljumio/liveness/n;->n:Lcom/jumio/core/sensors/SensorProxy;

    .line 258
    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    sget-object v2, Lcom/jumio/core/sensors/SensorType;->LIGHT:Lcom/jumio/core/sensors/SensorType;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v2}, Lcom/jumio/core/sensors/SensorProxy;->firstOrNull(Lcom/jumio/core/sensors/SensorType;)Lcom/jumio/core/sensors/SensorInterface;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    if-eqz v0, :cond_7

    .line 268
    .line 269
    .line 270
    invoke-interface {v0}, Lcom/jumio/core/sensors/SensorInterface;->getLatestData()[F

    .line 271
    move-result-object v0

    .line 272
    .line 273
    if-eqz v0, :cond_7

    .line 274
    .line 275
    aget v0, v0, p3

    .line 276
    goto :goto_2

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    move-object p1, v0

    .line 279
    goto :goto_5

    .line 280
    .line 281
    .line 282
    :cond_7
    invoke-static {}, Lcom/jumio/core/sensors/LightSensorKt;->getLIGHT_SENSOR_DEFAULT_VALUE()[F

    .line 283
    move-result-object v0

    .line 284
    .line 285
    aget v0, v0, p3

    .line 286
    .line 287
    :goto_2
    iget-object v2, p2, Ljumio/liveness/n;->b:Lcom/jumio/liveness/DaClient2;

    .line 288
    .line 289
    if-eqz v2, :cond_8

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 293
    move-result-object v5

    .line 294
    .line 295
    .line 296
    invoke-static {v5, v0}, Ljumio/liveness/p;->a(Lcom/jumio/commons/camera/Frame$Metadata;F)[Lkotlin/Pair;

    .line 297
    move-result-object v9

    .line 298
    .line 299
    const-string v0, "<this>"

    .line 300
    .line 301
    .line 302
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    const-string v0, "frame"

    .line 305
    .line 306
    .line 307
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    const-string v0, "attributes"

    .line 310
    .line 311
    .line 312
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getByteArray()[B

    .line 316
    move-result-object v5

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 324
    move-result-object v0

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 328
    move-result v6

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 336
    move-result-object v0

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 340
    move-result v7

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 344
    move-result-object p1

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame$Metadata;->getRotation()I

    .line 348
    move-result v8

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v2 .. v9}, Lcom/jumio/liveness/DaClient2;->sendFrameNV21(J[BIII[Lkotlin/Pair;)V

    .line 352
    .line 353
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 354
    :cond_8
    :try_start_4
    monitor-exit v1

    .line 355
    .line 356
    iget-object p1, p2, Ljumio/liveness/n;->i:Ljava/lang/Object;

    .line 357
    monitor-enter p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 358
    .line 359
    :try_start_5
    iget-object p2, p2, Ljumio/liveness/n;->c:Lcom/jumio/liveness/LivenessUX;

    .line 360
    .line 361
    if-eqz p2, :cond_9

    .line 362
    .line 363
    .line 364
    invoke-virtual {p2}, Lcom/jumio/liveness/LivenessUX;->onAfterFrame()V

    .line 365
    .line 366
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 367
    goto :goto_3

    .line 368
    :catchall_2
    move-exception v0

    .line 369
    move-object p2, v0

    .line 370
    goto :goto_4

    .line 371
    :cond_9
    :goto_3
    :try_start_6
    monitor-exit p1

    .line 372
    goto :goto_8

    .line 373
    :goto_4
    monitor-exit p1

    .line 374
    throw p2

    .line 375
    :goto_5
    monitor-exit v1

    .line 376
    throw p1

    .line 377
    :goto_6
    monitor-exit v1

    .line 378
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 379
    .line 380
    .line 381
    :goto_7
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 382
    .line 383
    :goto_8
    sget-object p1, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 387
    return-void

    .line 388
    .line 389
    :cond_a
    sget-object p1, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 396
    return-void

    .line 397
    .line 398
    .line 399
    :cond_b
    :goto_9
    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 400
    return-void
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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
.end method

.method public final setFrameRateCheck(Lcom/jumio/core/performance/FrameRateCheck;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/liveness/z;->B:Lcom/jumio/core/performance/FrameRateCheck;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final shouldFeed()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/z;->v:Ljumio/liveness/n;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljumio/liveness/n;->b()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ljumio/liveness/z;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method
