.class public final Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;
.super Ljava/lang/Object;
.source "UserInfoRequestHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0086@\u00a2\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "queryAuditUserInfo",
        "Lkotlin/Pair;",
        "",
        "Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "commitAuditUserInfo",
        "Lkotlin/Triple;",
        "Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;",
        "avatar",
        "nickName",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "MineLib_googleRelease"
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
        "SMAP\nUserInfoRequestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoRequestHelper.kt\ncom/kubi/mine/lib/helper/UserInfoRequestHelper\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,79:1\n196#2,3:80\n*S KotlinDebug\n*F\n+ 1 UserInfoRequestHelper.kt\ncom/kubi/mine/lib/helper/UserInfoRequestHelper\n*L\n55#1:80,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;->a:Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;

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
.end method

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p3

    .line 3
    .line 4
    instance-of v1, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;

    .line 10
    .line 11
    iget v2, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->label:I

    .line 12
    .line 13
    const/high16 v3, -0x80000000

    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    sub-int/2addr v2, v3

    .line 19
    .line 20
    iput v2, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->label:I

    .line 21
    .line 22
    move-object/from16 v2, p0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;-><init>(Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    :goto_0
    iget-object v0, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    iget v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->label:I

    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x1

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget-object v3, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$4:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$3:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Lcom/kubi/utils/x;

    .line 57
    .line 58
    iget-object v3, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 61
    .line 62
    iget-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    throw v0

    .line 82
    .line 83
    :cond_2
    iget-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$3:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;

    .line 86
    .line 87
    iget-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$2:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Lhq/d;

    .line 90
    .line 91
    iget-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v9, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v9, Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    goto :goto_1

    .line 102
    :catch_0
    move-exception v0

    .line 103
    goto :goto_2

    .line 104
    :catch_1
    move-exception v0

    .line 105
    move-object v10, v4

    .line 106
    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :try_start_1
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    const-class v4, Lhq/d;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    check-cast v0, Lhq/d;

    .line 123
    .line 124
    new-instance v4, Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;
    :try_end_1
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    .line 126
    move-object/from16 v9, p1

    .line 127
    .line 128
    move-object/from16 v10, p2

    .line 129
    .line 130
    .line 131
    :try_start_2
    invoke-direct {v4, v9, v10}, Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    move-result-object v11

    .line 136
    .line 137
    iput-object v11, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    move-result-object v11

    .line 142
    .line 143
    iput-object v11, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$1:Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    move-result-object v11

    .line 148
    .line 149
    iput-object v11, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$2:Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    move-result-object v11

    .line 154
    .line 155
    iput-object v11, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$3:Ljava/lang/Object;

    .line 156
    .line 157
    iput v6, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->label:I

    .line 158
    .line 159
    .line 160
    invoke-interface {v0, v4, v1}, Lhq/d;->a(Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 161
    move-result-object v0
    :try_end_2
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 162
    .line 163
    if-ne v0, v3, :cond_4

    .line 164
    .line 165
    goto/16 :goto_4

    .line 166
    :cond_4
    move-object v4, v10

    .line 167
    .line 168
    :goto_1
    :try_start_3
    check-cast v0, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;

    .line 169
    .line 170
    new-instance v10, Lkotlin/Triple;

    .line 171
    .line 172
    .line 173
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 174
    move-result-object v6

    .line 175
    .line 176
    .line 177
    invoke-direct {v10, v6, v0, v7}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 178
    return-object v10

    .line 179
    :catch_2
    move-exception v0

    .line 180
    goto :goto_3

    .line 181
    :catch_3
    move-exception v0

    .line 182
    .line 183
    move-object/from16 v9, p1

    .line 184
    .line 185
    move-object/from16 v10, p2

    .line 186
    goto :goto_3

    .line 187
    .line 188
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    const-string v3, "commitAuditUserInfo failed, exception is "

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    const-string v1, "UserInfoRequestHelper"

    .line 206
    .line 207
    .line 208
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    new-instance v0, Lkotlin/Triple;

    .line 211
    .line 212
    .line 213
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    new-instance v8, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;

    .line 217
    .line 218
    const/16 v15, 0x3f

    .line 219
    .line 220
    const/16 v16, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v10, 0x0

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    .line 228
    .line 229
    invoke-direct/range {v8 .. v16}, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v0, v1, v8, v7}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :goto_3
    iget-object v4, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 237
    .line 238
    const-string v6, "500900"

    .line 239
    .line 240
    .line 241
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v4

    .line 243
    .line 244
    if-eqz v4, :cond_8

    .line 245
    .line 246
    iget-object v4, v0, Lcom/kubi/network/retrofit/exception/ApiException;->dataStr:Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v4, :cond_8

    .line 249
    .line 250
    .line 251
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 252
    move-result v4

    .line 253
    .line 254
    if-nez v4, :cond_5

    .line 255
    .line 256
    goto/16 :goto_6

    .line 257
    .line 258
    :cond_5
    sget-object v4, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 259
    .line 260
    iget-object v6, v0, Lcom/kubi/network/retrofit/exception/ApiException;->dataStr:Ljava/lang/String;

    .line 261
    .line 262
    const-string v11, "dataStr"

    .line 263
    .line 264
    .line 265
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    new-instance v11, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$$inlined$fromJsonOrNull$1;

    .line 268
    .line 269
    .line 270
    invoke-direct {v11, v6, v7}, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v11}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 274
    move-result-object v11

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 278
    move-result-object v12

    .line 279
    .line 280
    .line 281
    invoke-static {v11, v12}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 282
    move-result-object v11

    .line 283
    .line 284
    .line 285
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    move-result-object v9

    .line 287
    .line 288
    iput-object v9, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    move-result-object v9

    .line 293
    .line 294
    iput-object v9, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$1:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v0, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$2:Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    move-result-object v4

    .line 301
    .line 302
    iput-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$3:Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    move-result-object v4

    .line 307
    .line 308
    iput-object v4, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->L$4:Ljava/lang/Object;

    .line 309
    .line 310
    iput v8, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->I$0:I

    .line 311
    .line 312
    iput v5, v1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$commitAuditUserInfo$1;->label:I

    .line 313
    .line 314
    .line 315
    invoke-static {v11, v1}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 316
    move-result-object v1

    .line 317
    .line 318
    if-ne v1, v3, :cond_6

    .line 319
    :goto_4
    return-object v3

    .line 320
    :cond_6
    move-object v3, v0

    .line 321
    move-object v0, v1

    .line 322
    .line 323
    :goto_5
    check-cast v0, Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;

    .line 324
    .line 325
    if-eqz v0, :cond_7

    .line 326
    .line 327
    new-instance v9, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;->getCanAuditAvatar()Ljava/lang/Boolean;

    .line 331
    move-result-object v10

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;->getAvatarLimitMsg()Ljava/lang/String;

    .line 335
    move-result-object v12

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;->getCanAuditNickname()Ljava/lang/Boolean;

    .line 339
    move-result-object v13

    .line 340
    const/4 v14, 0x0

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lcom/kubi/mine/lib/entity/UserCommitAuditErrorEntity;->getNickNameLimitMsg()Ljava/lang/String;

    .line 344
    move-result-object v15

    .line 345
    const/4 v11, 0x0

    .line 346
    .line 347
    .line 348
    invoke-direct/range {v9 .. v15}, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    new-instance v0, Lkotlin/Triple;

    .line 351
    .line 352
    .line 353
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 354
    move-result-object v1

    .line 355
    .line 356
    .line 357
    invoke-direct {v0, v1, v9, v7}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 358
    goto :goto_7

    .line 359
    .line 360
    :cond_7
    new-instance v0, Lkotlin/Triple;

    .line 361
    .line 362
    .line 363
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 364
    move-result-object v1

    .line 365
    .line 366
    new-instance v4, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;

    .line 367
    .line 368
    const/16 v11, 0x3f

    .line 369
    const/4 v12, 0x0

    .line 370
    const/4 v5, 0x0

    .line 371
    const/4 v6, 0x0

    .line 372
    const/4 v7, 0x0

    .line 373
    const/4 v8, 0x0

    .line 374
    const/4 v9, 0x0

    .line 375
    const/4 v10, 0x0

    .line 376
    .line 377
    .line 378
    invoke-direct/range {v4 .. v12}, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 382
    move-result-object v3

    .line 383
    .line 384
    .line 385
    invoke-direct {v0, v1, v4, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    goto :goto_7

    .line 387
    .line 388
    :cond_8
    :goto_6
    new-instance v1, Lkotlin/Triple;

    .line 389
    .line 390
    .line 391
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 392
    move-result-object v3

    .line 393
    .line 394
    new-instance v4, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;

    .line 395
    .line 396
    const/16 v11, 0x3f

    .line 397
    const/4 v12, 0x0

    .line 398
    const/4 v5, 0x0

    .line 399
    const/4 v6, 0x0

    .line 400
    const/4 v7, 0x0

    .line 401
    const/4 v8, 0x0

    .line 402
    const/4 v9, 0x0

    .line 403
    const/4 v10, 0x0

    .line 404
    .line 405
    .line 406
    invoke-direct/range {v4 .. v12}, Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 410
    move-result-object v0

    .line 411
    .line 412
    .line 413
    invoke-direct {v1, v3, v4, v0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    move-object v0, v1

    .line 415
    :goto_7
    return-object v0
.end method

.method public final b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->label:I

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
    iput v1, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;-><init>(Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->label:I

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
    iget-object v0, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lhq/d;

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_2

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    const-class v2, Lhq/d;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    check-cast p1, Lhq/d;

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    iput-object v2, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, v0, Lcom/kubi/mine/lib/helper/UserInfoRequestHelper$queryAuditUserInfo$1;->label:I

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v0}, Lhq/d;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    if-ne p1, v1, :cond_3

    .line 86
    return-object v1

    .line 87
    .line 88
    :cond_3
    :goto_1
    check-cast p1, Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;

    .line 89
    .line 90
    new-instance v0, Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 98
    return-object v0

    .line 99
    .line 100
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    const-string v1, "queryAuditUserInfo failed, exception is "

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    const-string v0, "UserInfoRequestHelper"

    .line 118
    .line 119
    .line 120
    invoke-static {v0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    new-instance p1, Lkotlin/Pair;

    .line 123
    const/4 v0, 0x0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    new-instance v1, Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;

    .line 130
    .line 131
    const/16 v8, 0x3f

    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v3, 0x0

    .line 135
    const/4 v4, 0x0

    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v1 .. v9}, Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    return-object p1
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
.end method
