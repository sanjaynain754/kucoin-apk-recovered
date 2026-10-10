.class final Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ReactNativeStartupTask.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/rn/startup/ReactNativeStartupTask;->run(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.rn.startup.ReactNativeStartupTask$run$5"
    f = "ReactNativeStartupTask.kt"
    i = {
        0x2
    }
    l = {
        0x7d,
        0x88,
        0x8b,
        0x91
    }
    m = "invokeSuspend"
    n = {
        "taskLimit"
    }
    s = {
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $application:Landroid/app/Application;

.field final synthetic $pkgPlatformEnabled:Z

.field final synthetic $watcher:Lqq/l$a;

.field I$0:I

.field label:I


# direct methods
.method public constructor <init>(Landroid/app/Application;ZLqq/l$a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Z",
            "Lqq/l$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$pkgPlatformEnabled:Z

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$watcher:Lqq/l$a;

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$pkgPlatformEnabled:Z

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$watcher:Lqq/l$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;-><init>(Landroid/app/Application;ZLqq/l$a;Lkotlin/coroutines/Continuation;)V

    .line 12
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->label:I

    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v5, :cond_3

    .line 15
    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    throw p1

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    goto :goto_2

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    .line 48
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    sget-object p1, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 53
    .line 54
    iput v5, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->label:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1, p0}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->W(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    goto :goto_3

    .line 62
    .line 63
    :cond_5
    :goto_0
    iget-boolean p1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$pkgPlatformEnabled:Z

    .line 64
    .line 65
    if-nez p1, :cond_6

    .line 66
    .line 67
    const-string p1, "ReactNativeStartupTask"

    .line 68
    .line 69
    const-string v1, "enableBundleManagerServer=false\uff0c\u6e05\u7406\u5305\u7ba1\u7406\u5e73\u53f0\u6b8b\u7559\u672c\u5730\u5305"

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    sget-object p1, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    .line 75
    .line 76
    iget-object v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->z(Landroid/content/Context;)V

    .line 80
    .line 81
    :cond_6
    sget-object p1, Lcom/kubi/rn/core/ReactNativeEngine;->INSTANCE:Lcom/kubi/rn/core/ReactNativeEngine;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/rn/core/ReactNativeEngine;->isDisable$BReactNativeLib_googleRelease()Z

    .line 85
    move-result p1

    .line 86
    .line 87
    if-eqz p1, :cond_7

    .line 88
    .line 89
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    return-object p1

    .line 91
    .line 92
    :cond_7
    sget-object p1, Lcom/kubi/web/api/IWebService;->a:Lcom/kubi/web/api/IWebService$Companion;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/kubi/web/api/IWebService$Companion;->get()Lcom/kubi/web/api/IWebService;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    iput v4, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->label:I

    .line 99
    const/4 v1, 0x0

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v1, p0}, Lcom/kubi/web/api/IWebService;->b(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    if-ne p1, v0, :cond_8

    .line 106
    goto :goto_3

    .line 107
    .line 108
    :cond_8
    :goto_1
    sget-object p1, Lcom/kubi/rn/core/ReactNativeEngine;->INSTANCE:Lcom/kubi/rn/core/ReactNativeEngine;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/kubi/rn/core/ReactNativeEngine;->getAutoStartDownload()Z

    .line 112
    move-result v1

    .line 113
    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    sget-object v1, Lcom/kubi/widget/web/helper/PackageConfigHelper;->a:Lcom/kubi/widget/web/helper/PackageConfigHelper;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/kubi/widget/web/helper/PackageConfigHelper;->b()I

    .line 120
    move-result v1

    .line 121
    .line 122
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    .line 123
    .line 124
    iget-object v5, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/kubi/rn/core/ReactNativeEngine;->getCriticalBizList()Ljava/util/List;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iput v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->I$0:I

    .line 131
    .line 132
    iput v3, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->label:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v5, v1, p1, p0}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->Z(Landroid/content/Context;ILjava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    if-ne p1, v0, :cond_9

    .line 139
    goto :goto_3

    .line 140
    .line 141
    :cond_9
    :goto_2
    sget-object p1, Lcom/kubi/rn/core/BundleLoader;->INSTANCE:Lcom/kubi/rn/core/BundleLoader;

    .line 142
    .line 143
    iget-object v1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$application:Landroid/app/Application;

    .line 144
    .line 145
    iput v2, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->label:I

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v1, p0}, Lcom/kubi/rn/core/BundleLoader;->prepare(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-ne p1, v0, :cond_a

    .line 152
    :goto_3
    return-object v0

    .line 153
    .line 154
    :cond_a
    :goto_4
    iget-object p1, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;->$watcher:Lqq/l$a;

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, Lqq/l$a;->stop()V

    .line 158
    .line 159
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 160
    return-object p1
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method
