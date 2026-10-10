.class final Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AdvancedCertificationProtocolHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.kubi.kyc.protocol.AdvancedCertificationProtocolHandler$openJumio$1"
    f = "AdvancedCertificationProtocolHandler.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x10b
    }
    m = "invokeSuspend"
    n = {
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAdvancedCertificationProtocolHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvancedCertificationProtocolHandler.kt\ncom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n196#2,3:265\n48#3,2:268\n48#3,2:270\n44#3,2:272\n44#3,2:274\n1#4:276\n*S KotlinDebug\n*F\n+ 1 AdvancedCertificationProtocolHandler.kt\ncom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1\n*L\n91#1:265,3\n94#1:268,2\n109#1:270,2\n145#1:272,2\n134#1:274,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $activity:Lcom/kubi/sdk/BaseActivity;

.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/kubi/kyc/protocol/AdvancedCertificationResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $channel:Ljava/lang/String;

.field final synthetic $data:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/kubi/kyc/protocol/AdvancedCertificationResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/kubi/sdk/BaseActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$data:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$channel:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$activity:Lcom/kubi/sdk/BaseActivity;

    .line 9
    const/4 p1, 0x2

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 13
    return-void
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
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;ZLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->f(Lkotlin/jvm/functions/Function1;ZLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

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
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;ZLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string p1, "result"

    .line 5
    .line 6
    const-string p3, "true"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object p1, Lkn/a;->a:Lkn/a;

    .line 12
    .line 13
    const-string p3, "0"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Lkn/a;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    sget-object p1, Lcom/kubi/kyc/protocol/AdvancedCertificationResult;->e:Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Lcom/kubi/router/utils/RouteExKt;->d0(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;->success(Ljava/util/Map;)Lcom/kubi/kyc/protocol/AdvancedCertificationResult;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    sget-object p1, Lkn/a;->a:Lkn/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p4}, Lkn/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v1, Ljava/lang/Exception;

    .line 38
    .line 39
    new-instance p1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    const-string p2, "code "

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string p2, ", errorMsg "

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    new-instance v0, Lcom/kubi/kyc/exception/KycException;

    .line 68
    .line 69
    const/16 v5, 0x8

    .line 70
    const/4 v6, 0x0

    .line 71
    .line 72
    const-string v2, "AdvancedCertificationProtocol"

    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v0 .. v6}, Lcom/kubi/kyc/exception/KycException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    const/4 p1, 0x2

    .line 79
    const/4 p2, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static {v0, p2, p1, p2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 83
    .line 84
    sget-object p1, Lcom/kubi/kyc/protocol/AdvancedCertificationResult;->e:Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;

    .line 85
    .line 86
    .line 87
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 88
    move-result p2

    .line 89
    .line 90
    if-nez p2, :cond_1

    .line 91
    .line 92
    const-string p4, "-299999"

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 96
    move-result p2

    .line 97
    .line 98
    if-nez p2, :cond_2

    .line 99
    .line 100
    const-string p3, "advanced certification failed"

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-virtual {p1, p4, p3}, Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;->failure(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/protocol/AdvancedCertificationResult;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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
    new-instance v0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$data:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$channel:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$activity:Lcom/kubi/sdk/BaseActivity;

    .line 11
    move-object v5, p2

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)V

    .line 15
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    const-string v0, "-200001"

    .line 5
    .line 6
    const-string v2, "-200010"

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    iget v4, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->label:I

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    if-ne v4, v7, :cond_0

    .line 21
    .line 22
    iget-object v3, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lcom/kubi/utils/x;

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    move-object/from16 v4, p1

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object v10, v0

    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    :try_start_1
    sget-object v4, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 52
    .line 53
    iget-object v9, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$data:Ljava/lang/String;

    .line 54
    .line 55
    new-instance v10, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 56
    .line 57
    .line 58
    invoke-direct {v10, v9, v8}, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v10}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 62
    move-result-object v10

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 66
    move-result-object v11

    .line 67
    .line 68
    .line 69
    invoke-static {v10, v11}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 70
    move-result-object v10

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    iput-object v4, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    iput-object v4, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v5, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->I$0:I

    .line 85
    .line 86
    iput v7, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->label:I

    .line 87
    .line 88
    .line 89
    invoke-static {v10, v1}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    if-ne v4, v3, :cond_2

    .line 93
    return-object v3

    .line 94
    .line 95
    :cond_2
    :goto_0
    check-cast v4, Ljava/util/HashMap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    .line 97
    const-string v3, "channel:"

    .line 98
    .line 99
    if-eqz v4, :cond_7

    .line 100
    .line 101
    .line 102
    :try_start_2
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 103
    move-result v5

    .line 104
    .line 105
    if-eqz v5, :cond_3

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_3
    const-string v2, "token"

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    check-cast v2, Ljava/lang/String;

    .line 116
    .line 117
    const-string v5, "dataCenter"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object v5

    .line 122
    .line 123
    check-cast v5, Ljava/lang/String;

    .line 124
    .line 125
    const-string v7, "needNFC"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 135
    move-result v4

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    .line 140
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 141
    move-result v7

    .line 142
    .line 143
    if-nez v7, :cond_4

    .line 144
    goto :goto_1

    .line 145
    .line 146
    :cond_4
    if-eqz v5, :cond_6

    .line 147
    .line 148
    .line 149
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 150
    move-result v7

    .line 151
    .line 152
    if-nez v7, :cond_5

    .line 153
    goto :goto_1

    .line 154
    .line 155
    :cond_5
    iget-object v0, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$activity:Lcom/kubi/sdk/BaseActivity;

    .line 156
    .line 157
    iget-object v3, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    new-instance v7, Lcom/kubi/kyc/protocol/b;

    .line 160
    .line 161
    .line 162
    invoke-direct {v7, v3}, Lcom/kubi/kyc/protocol/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v2, v5, v4, v7}, Lqn/a;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function4;)V

    .line 166
    .line 167
    goto/16 :goto_4

    .line 168
    .line 169
    :cond_6
    :goto_1
    sget-object v4, Lkn/a;->a:Lkn/a;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v0}, Lkn/a;->a(Ljava/lang/String;)V

    .line 173
    .line 174
    new-instance v4, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    iget-object v3, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$channel:Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v3, " token("

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v2, ") or dataCenter("

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v2, ") is null or empty"

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    move-result-object v10

    .line 211
    .line 212
    const-string v11, "AdvancedCertificationProtocol"

    .line 213
    .line 214
    new-instance v9, Lcom/kubi/kyc/exception/KycMessage;

    .line 215
    const/4 v13, 0x4

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    .line 219
    .line 220
    invoke-direct/range {v9 .. v14}, Lcom/kubi/kyc/exception/KycMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v9, v8, v6, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 224
    .line 225
    iget-object v2, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 226
    .line 227
    sget-object v3, Lcom/kubi/kyc/protocol/AdvancedCertificationResult;->e:Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;

    .line 228
    .line 229
    const-string v4, "token or dataCenter is null or empty"

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v0, v4}, Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;->failure(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/protocol/AdvancedCertificationResult;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    .line 236
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 239
    return-object v0

    .line 240
    .line 241
    :cond_7
    :goto_2
    sget-object v0, Lkn/a;->a:Lkn/a;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v2}, Lkn/a;->a(Ljava/lang/String;)V

    .line 245
    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    iget-object v3, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$channel:Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v3, " data is null or Illegal"

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    move-result-object v10

    .line 267
    .line 268
    const-string v11, "AdvancedCertificationProtocol"

    .line 269
    .line 270
    new-instance v9, Lcom/kubi/kyc/exception/KycMessage;

    .line 271
    const/4 v13, 0x4

    .line 272
    const/4 v14, 0x0

    .line 273
    const/4 v12, 0x0

    .line 274
    .line 275
    .line 276
    invoke-direct/range {v9 .. v14}, Lcom/kubi/kyc/exception/KycMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v9, v8, v6, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 280
    .line 281
    iget-object v0, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 282
    .line 283
    sget-object v3, Lcom/kubi/kyc/protocol/AdvancedCertificationResult;->e:Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;

    .line 284
    .line 285
    const-string v4, "data is null or empty"

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v2, v4}, Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;->failure(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/protocol/AdvancedCertificationResult;

    .line 289
    move-result-object v2

    .line 290
    .line 291
    .line 292
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    return-object v0

    .line 296
    .line 297
    :goto_3
    sget-object v0, Lkn/a;->a:Lkn/a;

    .line 298
    .line 299
    const-string v2, "-299999"

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v2}, Lkn/a;->a(Ljava/lang/String;)V

    .line 303
    .line 304
    new-instance v9, Lcom/kubi/kyc/exception/KycException;

    .line 305
    .line 306
    const/16 v14, 0x8

    .line 307
    const/4 v15, 0x0

    .line 308
    .line 309
    const-string v11, "AdvancedCertificationProtocol"

    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    .line 313
    .line 314
    invoke-direct/range {v9 .. v15}, Lcom/kubi/kyc/exception/KycException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v9, v8, v6, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 318
    .line 319
    iget-object v0, v1, Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openJumio$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 320
    .line 321
    sget-object v3, Lcom/kubi/kyc/protocol/AdvancedCertificationResult;->e:Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 325
    move-result-object v4

    .line 326
    .line 327
    if-nez v4, :cond_8

    .line 328
    .line 329
    const-string v4, "advanced certification failed"

    .line 330
    .line 331
    .line 332
    :cond_8
    invoke-virtual {v3, v2, v4}, Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;->failure(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/protocol/AdvancedCertificationResult;

    .line 333
    move-result-object v2

    .line 334
    .line 335
    .line 336
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 339
    return-object v0
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
.end method
