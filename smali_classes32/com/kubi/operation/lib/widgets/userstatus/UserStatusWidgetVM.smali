.class public final Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;
.super Lcom/kubi/mvi/state/m;
.source "UserStatusWidgetVM.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0094@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u000f2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;",
        "<init>",
        "()V",
        "tag",
        "",
        "repo",
        "Lcom/kubi/operation/lib/api/OperationRepo;",
        "firstLoad",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "initState",
        "getInitState",
        "()Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onCountDownFinish",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadData",
        "loadDataFromWelfare",
        "checkWelfare",
        "entity",
        "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
        "loadDataFromHome",
        "taskSigned",
        "",
        "applyJoinTask",
        "taskId",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "OperationLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserStatusWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStatusWidgetVM.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 8 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,180:1\n473#2,4:181\n473#2,4:185\n473#2,4:189\n136#3:193\n153#3,2:194\n15#3:198\n126#3,2:199\n144#3,2:202\n126#3,2:204\n153#3,2:206\n144#3,2:209\n15#3:211\n126#3,2:212\n126#3,2:214\n178#4:196\n178#4:208\n99#5:197\n1#6:201\n35#7,4:216\n39#7:222\n35#7,4:223\n39#7:229\n44#8,2:220\n44#8,2:227\n*S KotlinDebug\n*F\n+ 1 UserStatusWidgetVM.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM\n*L\n58#1:181,4\n59#1:185,4\n60#1:189,4\n75#1:193\n91#1:194,2\n116#1:198\n117#1:199,2\n121#1:202,2\n122#1:204,2\n133#1:206,2\n161#1:209,2\n165#1:211\n166#1:212,2\n170#1:214,2\n91#1:196\n133#1:208\n113#1:197\n39#1:216,4\n39#1:222\n45#1:223,4\n45#1:229\n39#1:220,2\n45#1:227,2\n*E\n"
    }
.end annotation


# static fields
.field public static final b0:Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c0:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d0:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final X:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lcom/kubi/operation/lib/api/OperationRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->b0:Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;

    .line 9
    .line 10
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/j0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/kubi/operation/lib/widgets/userstatus/j0;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sput-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->c0:Lkotlin/Lazy;

    .line 20
    .line 21
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/k0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lcom/kubi/operation/lib/widgets/userstatus/k0;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sput-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->d0:Lkotlin/Lazy;

    .line 31
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    const-string v0, "UserStatus"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/operation/lib/api/OperationRepo;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/operation/lib/api/OperationRepo;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Y:Lcom/kubi/operation/lib/api/OperationRepo;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    return-void
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
.end method

.method public static final B()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "platform_home_user_widget_skip_on_guide_finish"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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
.end method

.method public static final C()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "platform_home_user_widget_new_interface"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$b;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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
.end method

.method public static synthetic n()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->C()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static synthetic o()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->B()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static final synthetic p(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->u(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
.end method

.method public static final synthetic q()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->d0:Lkotlin/Lazy;

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
.end method

.method public static final synthetic r()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->c0:Lkotlin/Lazy;

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
.end method

.method public static final synthetic s(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
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
.end method

.method public static final synthetic t(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
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
.end method

.method private final u(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;-><init>(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 64
    move-result p2

    .line 65
    .line 66
    if-nez p2, :cond_3

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_3
    iget-boolean p2, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->a0:Z

    .line 70
    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    return-object p1

    .line 75
    .line 76
    :cond_4
    iget-object p2, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Y:Lcom/kubi/operation/lib/api/OperationRepo;

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object p0, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    iput v3, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$applyJoinTask$1;->label:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, p1, v0}, Lcom/kubi/operation/lib/api/OperationRepo;->s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    if-ne p2, v1, :cond_5

    .line 93
    return-object v1

    .line 94
    :cond_5
    move-object p1, p0

    .line 95
    .line 96
    :goto_2
    check-cast p2, Lcom/kubi/operation/api/entity/WelfareSignupEntity;

    .line 97
    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/kubi/operation/api/entity/WelfareSignupEntity;->getSigned()Ljava/lang/Boolean;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result p2

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    const/4 p2, 0x0

    .line 113
    .line 114
    :goto_3
    iput-boolean p2, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->a0:Z

    .line 115
    .line 116
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 117
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
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
.end method

.method private final x(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lgz/a;->a:Lgz/a;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    const-string v2, "B1homepage"

    .line 6
    .line 7
    const-string v3, "userStatusGuide"

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v4, v1, v4}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lgz/a;->a(Ljava/lang/String;Z)Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-instance p1, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v2, v4, v1, v4}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_0
    sget-object v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->b0:Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;->access$getSkipWhenGuideFinish(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;)Z

    .line 37
    move-result v3

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    sget-object v3, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 45
    move-result v3

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    sget-object v3, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/kubi/operation/lib/utils/w;->c()Ly70/g;

    .line 53
    move-result-object v3

    .line 54
    const/4 v5, 0x0

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v5}, Ly70/a;->d(Ly70/g;Z)Z

    .line 58
    move-result v3

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    new-instance p1, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v2, v4, v1, v4}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    return-object p1

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-static {v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;->access$getUseNewInterface(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$Companion;)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    if-ne p1, v0, :cond_2

    .line 88
    return-object p1

    .line 89
    .line 90
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 91
    return-object p1

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    if-ne p1, v0, :cond_4

    .line 102
    return-object p1

    .line 103
    .line 104
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method


# virtual methods
.method public final A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->x(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method

.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;-><init>(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v5, :cond_3

    .line 42
    .line 43
    if-eq v2, v4, :cond_2

    .line 44
    .line 45
    if-ne v2, v3, :cond_1

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$CountDownFinish;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 54
    .line 55
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lcom/kubi/mvi/state/BaseStateVM;

    .line 58
    .line 59
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 62
    .line 63
    .line 64
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1

    .line 75
    .line 76
    :cond_2
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$4:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;

    .line 79
    .line 80
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 83
    .line 84
    iget-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lcom/kubi/mvi/state/BaseStateVM;

    .line 87
    .line 88
    iget-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lcom/kubi/mvi/state/BaseStateVM;

    .line 91
    .line 92
    iget-object v4, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Lcom/kubi/mvi/state/d;

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :cond_3
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$5:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$LoadData;

    .line 104
    .line 105
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$4:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 108
    .line 109
    iget-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Lcom/kubi/mvi/state/BaseStateVM;

    .line 112
    .line 113
    iget-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Lcom/kubi/mvi/state/BaseStateVM;

    .line 116
    .line 117
    iget-object v5, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v5, Lcom/kubi/mvi/state/BaseStateVM;

    .line 120
    .line 121
    iget-object v8, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, Lcom/kubi/mvi/state/d;

    .line 124
    .line 125
    .line 126
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 127
    goto :goto_1

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 131
    .line 132
    instance-of p2, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$LoadData;

    .line 133
    .line 134
    if-eqz p2, :cond_6

    .line 135
    move-object p2, p1

    .line 136
    .line 137
    check-cast p2, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$LoadData;

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    move-result-object v2

    .line 142
    .line 143
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    move-result-object v2

    .line 148
    .line 149
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$4:Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    move-result-object p2

    .line 168
    .line 169
    iput-object p2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$5:Ljava/lang/Object;

    .line 170
    .line 171
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$0:I

    .line 172
    .line 173
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$1:I

    .line 174
    .line 175
    iput v5, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 176
    .line 177
    .line 178
    invoke-direct {p0, v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->x(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    move-result-object p2

    .line 180
    .line 181
    if-ne p2, v1, :cond_5

    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    :cond_5
    move-object v2, p0

    .line 185
    move-object v5, v2

    .line 186
    move-object v8, p1

    .line 187
    :goto_1
    move-object p2, v2

    .line 188
    move-object v2, v5

    .line 189
    goto :goto_2

    .line 190
    :cond_6
    move-object p2, p0

    .line 191
    move-object v2, p2

    .line 192
    move-object v8, p1

    .line 193
    .line 194
    :goto_2
    instance-of v5, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;

    .line 195
    .line 196
    if-eqz v5, :cond_8

    .line 197
    move-object v5, p1

    .line 198
    .line 199
    check-cast v5, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;->getTaskId()Ljava/lang/String;

    .line 203
    move-result-object v9

    .line 204
    .line 205
    .line 206
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    move-result-object v10

    .line 208
    .line 209
    iput-object v10, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    move-result-object v10

    .line 214
    .line 215
    iput-object v10, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    move-result-object p2

    .line 220
    .line 221
    iput-object p2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    move-result-object p2

    .line 228
    .line 229
    iput-object p2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$4:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v6, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$5:Ljava/lang/Object;

    .line 232
    .line 233
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$0:I

    .line 234
    .line 235
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$1:I

    .line 236
    .line 237
    iput v4, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 238
    .line 239
    .line 240
    invoke-direct {p0, v9, v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->u(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 241
    move-result-object p2

    .line 242
    .line 243
    if-ne p2, v1, :cond_7

    .line 244
    goto :goto_4

    .line 245
    :cond_7
    move-object v4, v8

    .line 246
    :goto_3
    move-object v8, v4

    .line 247
    .line 248
    :cond_8
    instance-of p2, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$CountDownFinish;

    .line 249
    .line 250
    if-eqz p2, :cond_9

    .line 251
    move-object p2, p1

    .line 252
    .line 253
    check-cast p2, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$CountDownFinish;

    .line 254
    .line 255
    .line 256
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    move-result-object v4

    .line 258
    .line 259
    iput-object v4, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    move-result-object v2

    .line 264
    .line 265
    iput-object v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    move-result-object p1

    .line 272
    .line 273
    iput-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v6, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$4:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v6, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->L$5:Ljava/lang/Object;

    .line 278
    .line 279
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$0:I

    .line 280
    .line 281
    iput v7, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->I$1:I

    .line 282
    .line 283
    iput v3, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$dispatchIntent$1;->label:I

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 287
    move-result-object p1

    .line 288
    .line 289
    if-ne p1, v1, :cond_9

    .line 290
    :goto_4
    return-object v1

    .line 291
    .line 292
    :cond_9
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 293
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->w()Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;

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
.end method

.method public final v(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskType()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    :cond_1
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    const-string v3, "US"

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v2, "toUpperCase(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    sget-object v2, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    const-string v2, "SIGN_UP"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "hasLogin, but taskType is SIGN_UP, maybe token refresh now"

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-void

    .line 54
    .line 55
    :cond_2
    sget-object v2, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;->SIGN_UP:Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 56
    .line 57
    sget-object v3, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;->KYC:Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 58
    .line 59
    sget-object v4, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;->OLD_KYC:Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 60
    .line 61
    sget-object v5, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;->DEPOSIT:Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 62
    .line 63
    .line 64
    filled-new-array {v2, v3, v4, v5}, [Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    move-object v4, v3

    .line 85
    .line 86
    check-cast v4, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v1}, Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskType;->equalString(Ljava/lang/String;)Z

    .line 90
    move-result v4

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move-object v3, v0

    .line 95
    :goto_1
    const/4 v1, 0x0

    .line 96
    const/4 v2, 0x1

    .line 97
    .line 98
    if-eqz v3, :cond_5

    .line 99
    move v3, v2

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move v3, v1

    .line 102
    .line 103
    :goto_2
    if-eqz p1, :cond_6

    .line 104
    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    :cond_6
    if-eqz p1, :cond_7

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskCompletion()Ljava/lang/Boolean;

    .line 111
    move-result-object v4

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    move-object v4, v0

    .line 114
    .line 115
    .line 116
    :goto_3
    invoke-static {v4}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 117
    move-result v4

    .line 118
    .line 119
    if-eqz v4, :cond_a

    .line 120
    .line 121
    :cond_8
    iget-object v1, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 122
    .line 123
    new-instance v4, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    const-string v5, "showAssetView,isGuideType="

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v3, ",completion="

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    if-eqz p1, :cond_9

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskCompletion()Ljava/lang/Boolean;

    .line 145
    move-result-object p1

    .line 146
    goto :goto_4

    .line 147
    :cond_9
    move-object p1, v0

    .line 148
    .line 149
    .line 150
    :goto_4
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    .line 157
    invoke-static {v1, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    sget-object p1, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->d()Ly70/g;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    .line 166
    invoke-static {v1}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->c()Ly70/g;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-static {p1, v2}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 174
    .line 175
    new-instance p1, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 176
    const/4 v1, 0x2

    .line 177
    .line 178
    .line 179
    invoke-direct {p1, v2, v0, v1, v0}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 183
    return-void

    .line 184
    .line 185
    :cond_a
    iget-object v0, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 186
    .line 187
    const-string v2, "showGuide-network"

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    if-eqz p1, :cond_b

    .line 193
    .line 194
    sget-object v0, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/kubi/operation/lib/utils/w;->d()Ly70/g;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    .line 201
    invoke-static {v0, p1}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 202
    .line 203
    :cond_b
    sget-object v0, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/kubi/operation/lib/utils/w;->c()Ly70/g;

    .line 207
    move-result-object v0

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 211
    .line 212
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 213
    .line 214
    new-instance v2, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;

    .line 215
    const/4 v6, 0x6

    .line 216
    const/4 v7, 0x0

    .line 217
    const/4 v4, 0x0

    .line 218
    const/4 v5, 0x0

    .line 219
    move-object v3, p1

    .line 220
    .line 221
    .line 222
    invoke-direct/range {v2 .. v7}, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;-><init>(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/Boolean;Lcom/kubi/operation/lib/entity/CommonCardInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v0, v1, v2}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 229
    return-void
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method

.method public w()Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;-><init>()V

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
.end method

.method public final y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;-><init>(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->label:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    iget-wide v0, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->J$0:J

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object p1, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v5, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 62
    move-result p1

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    sget-object v2, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/kubi/operation/lib/utils/w;->e()Ly70/g;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    sget-object v6, Ly70/a;->a:Ly70/a;

    .line 73
    .line 74
    const-class v7, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v2, v7, v4}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    check-cast v2, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;

    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    iget-object v6, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 85
    .line 86
    const-string v7, "showGuide-cache"

    .line 87
    .line 88
    .line 89
    invoke-static {v6, v7}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    new-instance v6, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 92
    .line 93
    .line 94
    invoke-direct {v6, v3, v2}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v6}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 98
    .line 99
    :cond_3
    sget-object v2, Loj/h;->a:Loj/h;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Loj/h;->b()J

    .line 103
    move-result-wide v6

    .line 104
    .line 105
    iget-object v2, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Y:Lcom/kubi/operation/lib/api/OperationRepo;

    .line 106
    .line 107
    iput-boolean p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->Z$0:Z

    .line 108
    .line 109
    iput-wide v6, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->J$0:J

    .line 110
    .line 111
    iput v5, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromHome$1;->label:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v0}, Lcom/kubi/operation/lib/api/OperationRepo;->j(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    if-ne p1, v1, :cond_4

    .line 118
    return-object v1

    .line 119
    :cond_4
    move-wide v0, v6

    .line 120
    .line 121
    :goto_1
    check-cast p1, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;

    .line 122
    .line 123
    sget-object v2, Loj/h;->a:Loj/h;

    .line 124
    .line 125
    sget-object v6, Lcom/kubi/home/api/HomeWidgetCode;->UserStatus:Lcom/kubi/home/api/HomeWidgetCode;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Loj/h;->b()J

    .line 133
    move-result-wide v7

    .line 134
    sub-long/2addr v7, v0

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v6, v7, v8}, Loj/h;->d(Ljava/lang/String;J)V

    .line 138
    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->hitABTest()Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-ne v0, v5, :cond_b

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->getNewcomerCard()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskType()Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    goto :goto_2

    .line 157
    :cond_5
    move-object v1, v4

    .line 158
    .line 159
    :goto_2
    if-nez v1, :cond_6

    .line 160
    .line 161
    const-string v1, ""

    .line 162
    .line 163
    :cond_6
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 164
    .line 165
    const-string v6, "US"

    .line 166
    .line 167
    .line 168
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    const-string v2, "toUpperCase(...)"

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    sget-object v2, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 183
    move-result v2

    .line 184
    .line 185
    if-eqz v2, :cond_7

    .line 186
    .line 187
    const-string v2, "SIGN_UP"

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    move-result v1

    .line 192
    .line 193
    if-eqz v1, :cond_7

    .line 194
    .line 195
    iget-object p1, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 196
    .line 197
    const-string v0, "hasLogin, but taskType is SIGN_UP, maybe token refresh now"

    .line 198
    .line 199
    .line 200
    invoke-static {p1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 203
    return-object p1

    .line 204
    .line 205
    :cond_7
    new-instance v1, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->getNewcomerCard()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 209
    move-result-object v2

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->hitABTest()Z

    .line 213
    move-result v6

    .line 214
    .line 215
    .line 216
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->getCommonCardInfo()Lcom/kubi/operation/lib/entity/CommonCardInfo;

    .line 221
    move-result-object p1

    .line 222
    .line 223
    .line 224
    invoke-direct {v1, v2, v6, p1}, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;-><init>(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/Boolean;Lcom/kubi/operation/lib/entity/CommonCardInfo;)V

    .line 225
    .line 226
    sget-object p1, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->e()Ly70/g;

    .line 230
    move-result-object v2

    .line 231
    .line 232
    .line 233
    invoke-static {v2, v1}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 234
    .line 235
    if-eqz v0, :cond_8

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskCompletion()Ljava/lang/Boolean;

    .line 239
    move-result-object v2

    .line 240
    goto :goto_3

    .line 241
    :cond_8
    move-object v2, v4

    .line 242
    .line 243
    .line 244
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 245
    move-result v2

    .line 246
    .line 247
    if-eqz v2, :cond_a

    .line 248
    .line 249
    iget-object v2, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 250
    .line 251
    new-instance v3, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    const-string v6, "showAssetView,completion="

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    if-eqz v0, :cond_9

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;->getTaskCompletion()Ljava/lang/Boolean;

    .line 265
    move-result-object v4

    .line 266
    .line 267
    .line 268
    :cond_9
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    move-result-object v0

    .line 273
    .line 274
    .line 275
    invoke-static {v2, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->d()Ly70/g;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->c()Ly70/g;

    .line 286
    move-result-object p1

    .line 287
    .line 288
    .line 289
    invoke-static {p1, v5}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 290
    .line 291
    new-instance p1, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 292
    .line 293
    .line 294
    invoke-direct {p1, v5, v1}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 298
    goto :goto_4

    .line 299
    .line 300
    :cond_a
    iget-object v0, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 301
    .line 302
    const-string v2, "showGuide-network"

    .line 303
    .line 304
    .line 305
    invoke-static {v0, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, Lcom/kubi/operation/lib/utils/w;->c()Ly70/g;

    .line 309
    move-result-object p1

    .line 310
    .line 311
    .line 312
    invoke-static {p1, v3}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 313
    .line 314
    new-instance p1, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 315
    .line 316
    .line 317
    invoke-direct {p1, v3, v1}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 321
    .line 322
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 323
    return-object p1

    .line 324
    .line 325
    :cond_b
    if-eqz p1, :cond_c

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;->getNewcomerCard()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 329
    move-result-object v4

    .line 330
    .line 331
    .line 332
    :cond_c
    invoke-virtual {p0, v4}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->v(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;)V

    .line 333
    .line 334
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 335
    return-object p1
.end method

.method public final z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;-><init>(Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    sget-object v4, Lcom/kubi/operation/lib/utils/w;->a:Lcom/kubi/operation/lib/utils/w;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/kubi/operation/lib/utils/w;->d()Ly70/g;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    sget-object v5, Ly70/a;->a:Ly70/a;

    .line 70
    .line 71
    const-class v6, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 72
    const/4 v7, 0x0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v4, v6, v7}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 76
    move-result-object v4

    .line 77
    move-object v6, v4

    .line 78
    .line 79
    check-cast v6, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 80
    .line 81
    if-eqz v6, :cond_3

    .line 82
    .line 83
    iget-object v4, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->X:Ljava/lang/String;

    .line 84
    .line 85
    const-string v5, "showGuide-cache"

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v5}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    new-instance v4, Lcom/kubi/operation/lib/widgets/userstatus/i0;

    .line 91
    .line 92
    new-instance v5, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;

    .line 93
    const/4 v9, 0x6

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v5 .. v10}, Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;-><init>(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/Boolean;Lcom/kubi/operation/lib/entity/CommonCardInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v4, v2, v5}, Lcom/kubi/operation/lib/widgets/userstatus/i0;-><init>(ZLcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v4}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 106
    .line 107
    :cond_3
    iget-object v2, p0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->Y:Lcom/kubi/operation/lib/api/OperationRepo;

    .line 108
    .line 109
    iput-boolean p1, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->Z$0:Z

    .line 110
    .line 111
    iput v3, v0, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM$loadDataFromWelfare$1;->label:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v0}, Lcom/kubi/operation/lib/api/OperationRepo;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    if-ne p1, v1, :cond_4

    .line 118
    return-object v1

    .line 119
    .line 120
    :cond_4
    :goto_1
    check-cast p1, Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;->v(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;)V

    .line 124
    .line 125
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 126
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method
