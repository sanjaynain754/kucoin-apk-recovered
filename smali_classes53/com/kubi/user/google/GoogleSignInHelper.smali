.class public final Lcom/kubi/user/google/GoogleSignInHelper;
.super Ljava/lang/Object;
.source "GoogleSignInHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/user/google/GoogleSignInHelper$a;,
        Lcom/kubi/user/google/GoogleSignInHelper$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0008\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/kubi/user/google/GoogleSignInHelper;",
        "",
        "<init>",
        "()V",
        "DEBUG_WEB_CLIENT_ID",
        "",
        "RELEASE_WEB_CLIENT_ID",
        "webClientId",
        "getWebClientId",
        "()Ljava/lang/String;",
        "TAG",
        "CODE_USER_CANCEL",
        "CODE_EMPTY",
        "CODE_NOT_AVAILABLE",
        "CODE_PARSE",
        "CODE_NO_CREDENTIAL",
        "CODE_UNKNOWN",
        "authorize",
        "Lcom/kubi/user/google/GoogleSignInHelper$Result;",
        "activity",
        "Landroid/app/Activity;",
        "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildGoogleIdRequest",
        "Landroidx/credentials/GetCredentialRequest;",
        "filterByAuthorizedAccounts",
        "",
        "autoSelectEnabled",
        "buildSignInWithGoogleRequest",
        "parseGoogleCredential",
        "credential",
        "Landroidx/credentials/Credential;",
        "fail",
        "Lcom/kubi/user/google/GoogleSignInHelper$Result$Failure;",
        "code",
        "msg",
        "throwable",
        "",
        "ExtInfo",
        "Result",
        "UserCenterLib_googleRelease"
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
        "SMAP\nGoogleSignInHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleSignInHelper.kt\ncom/kubi/user/google/GoogleSignInHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,166:1\n1#2:167\n57#3,8:168\n76#3,2:176\n*S KotlinDebug\n*F\n+ 1 GoogleSignInHelper.kt\ncom/kubi/user/google/GoogleSignInHelper\n*L\n159#1:168,8\n161#1:176,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/user/google/GoogleSignInHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/user/google/GoogleSignInHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/user/google/GoogleSignInHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/user/google/GoogleSignInHelper;->a:Lcom/kubi/user/google/GoogleSignInHelper;

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
.end method

.method public static synthetic e(Lcom/kubi/user/google/GoogleSignInHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p3, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/user/google/GoogleSignInHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 15
    .param p1    # Landroid/app/Activity;
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
            "Landroid/app/Activity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/user/google/GoogleSignInHelper$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v2, p1

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    instance-of v3, v0, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    move-object v3, v0

    .line 10
    .line 11
    check-cast v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;

    .line 12
    .line 13
    iget v4, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 14
    .line 15
    const/high16 v5, -0x80000000

    .line 16
    .line 17
    and-int v6, v4, v5

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    sub-int/2addr v4, v5

    .line 21
    .line 22
    iput v4, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, p0, v0}, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;-><init>(Lcom/kubi/user/google/GoogleSignInHelper;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v0, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    iget v5, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 37
    .line 38
    const-string v6, "user_cancel"

    .line 39
    .line 40
    const-string v7, "-1"

    .line 41
    .line 42
    const-string v8, "google_auth_error"

    .line 43
    const/4 v9, 0x3

    .line 44
    const/4 v10, 0x2

    .line 45
    const/4 v11, 0x1

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    if-eq v5, v11, :cond_3

    .line 50
    .line 51
    if-eq v5, v10, :cond_2

    .line 52
    .line 53
    if-ne v5, v9, :cond_1

    .line 54
    .line 55
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$3:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Landroidx/credentials/exceptions/NoCredentialException;

    .line 58
    .line 59
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroidx/credentials/exceptions/NoCredentialException;

    .line 62
    .line 63
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroidx/credentials/CredentialManager;

    .line 66
    .line 67
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    :catch_0
    move-exception v0

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    :catch_1
    move-exception v0

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    :catch_2
    move-exception v0

    .line 82
    .line 83
    goto/16 :goto_c

    .line 84
    :catch_3
    move-exception v0

    .line 85
    .line 86
    goto/16 :goto_d

    .line 87
    .line 88
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    throw v0

    .line 95
    .line 96
    :cond_2
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$2:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Landroidx/credentials/exceptions/NoCredentialException;

    .line 99
    .line 100
    iget-object v5, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Landroidx/credentials/CredentialManager;

    .line 103
    .line 104
    iget-object v10, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v10, Landroid/app/Activity;

    .line 107
    .line 108
    .line 109
    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    :catch_4
    move-exception v0

    .line 113
    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_3
    iget-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Landroidx/credentials/CredentialManager;

    .line 119
    .line 120
    iget-object v5, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Landroid/app/Activity;

    .line 123
    .line 124
    .line 125
    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 126
    move-object v14, v5

    .line 127
    move-object v5, v2

    .line 128
    move-object v2, v14

    .line 129
    goto :goto_2

    .line 130
    :catch_5
    move-exception v0

    .line 131
    move-object v12, v2

    .line 132
    move-object v2, v5

    .line 133
    :goto_1
    move-object v5, v0

    .line 134
    goto :goto_3

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 138
    .line 139
    sget-object v0, Lcom/kubi/user/google/b;->a:Lcom/kubi/user/google/b;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lcom/kubi/user/google/b;->b(Landroid/content/Context;)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-nez v0, :cond_5

    .line 146
    const/4 v5, 0x4

    .line 147
    const/4 v6, 0x0

    .line 148
    .line 149
    const-string v2, "not_available"

    .line 150
    .line 151
    const-string v3, "not_available"

    .line 152
    const/4 v4, 0x0

    .line 153
    move-object v1, p0

    .line 154
    .line 155
    .line 156
    invoke-static/range {v1 .. v6}, Lcom/kubi/user/google/GoogleSignInHelper;->e(Lcom/kubi/user/google/GoogleSignInHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    .line 160
    :cond_5
    :try_start_3
    sget-object v0, Landroidx/credentials/CredentialManager;->Companion:Landroidx/credentials/CredentialManager$Companion;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2}, Landroidx/credentials/CredentialManager$Companion;->create(Landroid/content/Context;)Landroidx/credentials/CredentialManager;

    .line 164
    move-result-object v5
    :try_end_3
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 165
    .line 166
    .line 167
    :try_start_4
    invoke-virtual {p0, v11, v11}, Lcom/kubi/user/google/GoogleSignInHelper;->b(ZZ)Landroidx/credentials/GetCredentialRequest;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    iput-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v5, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 173
    .line 174
    iput v11, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 175
    .line 176
    .line 177
    invoke-interface {v5, v2, v0, v3}, Landroidx/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-ne v0, v4, :cond_6

    .line 181
    goto :goto_6

    .line 182
    .line 183
    :cond_6
    :goto_2
    check-cast v0, Landroidx/credentials/GetCredentialResponse;
    :try_end_4
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 184
    goto :goto_8

    .line 185
    :catch_6
    move-exception v0

    .line 186
    move-object v12, v5

    .line 187
    goto :goto_1

    .line 188
    :goto_3
    const/4 v0, 0x0

    .line 189
    .line 190
    .line 191
    :try_start_5
    invoke-virtual {p0, v0, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->b(ZZ)Landroidx/credentials/GetCredentialRequest;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    iput-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v12, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    move-result-object v13

    .line 201
    .line 202
    iput-object v13, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$2:Ljava/lang/Object;

    .line 203
    .line 204
    iput v10, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 205
    .line 206
    .line 207
    invoke-interface {v12, v2, v0, v3}, Landroidx/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 208
    move-result-object v0
    :try_end_5
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 209
    .line 210
    if-ne v0, v4, :cond_7

    .line 211
    goto :goto_6

    .line 212
    :cond_7
    move-object v10, v2

    .line 213
    move-object v2, v5

    .line 214
    move-object v5, v12

    .line 215
    .line 216
    :goto_4
    :try_start_6
    check-cast v0, Landroidx/credentials/GetCredentialResponse;
    :try_end_6
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 217
    goto :goto_8

    .line 218
    :catch_7
    move-exception v0

    .line 219
    move-object v10, v2

    .line 220
    move-object v2, v5

    .line 221
    move-object v5, v12

    .line 222
    .line 223
    .line 224
    :goto_5
    :try_start_7
    invoke-virtual {p0}, Lcom/kubi/user/google/GoogleSignInHelper;->c()Landroidx/credentials/GetCredentialRequest;

    .line 225
    move-result-object v12

    .line 226
    .line 227
    .line 228
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    move-result-object v13

    .line 230
    .line 231
    iput-object v13, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$0:Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    move-result-object v13

    .line 236
    .line 237
    iput-object v13, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$1:Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    move-result-object v2

    .line 242
    .line 243
    iput-object v2, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$2:Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    iput-object v0, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->L$3:Ljava/lang/Object;

    .line 250
    .line 251
    iput v9, v3, Lcom/kubi/user/google/GoogleSignInHelper$authorize$1;->label:I

    .line 252
    .line 253
    .line 254
    invoke-interface {v5, v10, v12, v3}, Landroidx/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    if-ne v0, v4, :cond_8

    .line 258
    :goto_6
    return-object v4

    .line 259
    .line 260
    :cond_8
    :goto_7
    check-cast v0, Landroidx/credentials/GetCredentialResponse;

    .line 261
    .line 262
    .line 263
    :goto_8
    invoke-virtual {v0}, Landroidx/credentials/GetCredentialResponse;->getCredential()Landroidx/credentials/Credential;

    .line 264
    move-result-object v0

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->g(Landroidx/credentials/Credential;)Lcom/kubi/user/google/GoogleSignInHelper$b;

    .line 268
    move-result-object v0
    :try_end_7
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Landroidx/credentials/exceptions/NoCredentialException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 269
    goto :goto_e

    .line 270
    .line 271
    .line 272
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    if-nez v2, :cond_9

    .line 276
    .line 277
    const-string v2, "unknown"

    .line 278
    .line 279
    .line 280
    :cond_9
    invoke-virtual {p0, v8, v2, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 281
    move-result-object v0

    .line 282
    goto :goto_e

    .line 283
    .line 284
    .line 285
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    if-nez v2, :cond_a

    .line 289
    .line 290
    const-string v2, ""

    .line 291
    .line 292
    :cond_a
    const-string v3, "user cancel"

    .line 293
    .line 294
    .line 295
    invoke-static {v2, v3, v11}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 296
    move-result v3

    .line 297
    .line 298
    if-eqz v3, :cond_b

    .line 299
    .line 300
    new-instance v0, Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 301
    .line 302
    .line 303
    invoke-direct {v0, v7, v6}, Lcom/kubi/user/google/GoogleSignInHelper$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_e

    .line 305
    .line 306
    .line 307
    :cond_b
    invoke-virtual {v0}, Landroidx/credentials/exceptions/GetCredentialException;->getType()Ljava/lang/String;

    .line 308
    move-result-object v3

    .line 309
    .line 310
    .line 311
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 312
    move-result v4

    .line 313
    .line 314
    if-nez v4, :cond_c

    .line 315
    goto :goto_b

    .line 316
    :cond_c
    move-object v8, v3

    .line 317
    .line 318
    .line 319
    :goto_b
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 320
    move-result v3

    .line 321
    .line 322
    if-nez v3, :cond_d

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/credentials/exceptions/GetCredentialException;->getType()Ljava/lang/String;

    .line 326
    move-result-object v2

    .line 327
    .line 328
    .line 329
    :cond_d
    invoke-virtual {p0, v8, v2, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 330
    move-result-object v0

    .line 331
    goto :goto_e

    .line 332
    .line 333
    .line 334
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 335
    move-result-object v2

    .line 336
    .line 337
    const-string v3, "google_id_token_parse_error"

    .line 338
    .line 339
    if-nez v2, :cond_e

    .line 340
    move-object v2, v3

    .line 341
    .line 342
    .line 343
    :cond_e
    invoke-virtual {p0, v3, v2, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 344
    move-result-object v0

    .line 345
    goto :goto_e

    .line 346
    .line 347
    :goto_d
    const-string v2, "no_credential"

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v2, v2, v0}, Lcom/kubi/user/google/GoogleSignInHelper;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 351
    move-result-object v0

    .line 352
    goto :goto_e

    .line 353
    .line 354
    :catch_8
    new-instance v0, Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 355
    .line 356
    .line 357
    invoke-direct {v0, v7, v6}, Lcom/kubi/user/google/GoogleSignInHelper$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    :goto_e
    return-object v0
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
.end method

.method public final b(ZZ)Landroidx/credentials/GetCredentialRequest;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/user/google/GoogleSignInHelper;->f()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;->setServerClientId(Ljava/lang/String;)Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;->setFilterByAuthorizedAccounts(Z)Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;->setAutoSelectEnabled(Z)Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;->build()Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    new-instance p2, Landroidx/credentials/GetCredentialRequest$Builder;

    .line 28
    .line 29
    .line 30
    invoke-direct {p2}, Landroidx/credentials/GetCredentialRequest$Builder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p1}, Landroidx/credentials/GetCredentialRequest$Builder;->addCredentialOption(Landroidx/credentials/CredentialOption;)Landroidx/credentials/GetCredentialRequest$Builder;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/credentials/GetCredentialRequest$Builder;->build()Landroidx/credentials/GetCredentialRequest;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method public final c()Landroidx/credentials/GetCredentialRequest;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/user/google/GoogleSignInHelper;->f()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;->build()Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Landroidx/credentials/GetCredentialRequest$Builder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Landroidx/credentials/GetCredentialRequest$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroidx/credentials/GetCredentialRequest$Builder;->addCredentialOption(Landroidx/credentials/CredentialOption;)Landroidx/credentials/GetCredentialRequest$Builder;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/credentials/GetCredentialRequest$Builder;->build()Landroidx/credentials/GetCredentialRequest;

    .line 26
    move-result-object v0

    .line 27
    return-object v0
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
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;
    .locals 10

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "code="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ", msg="

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v1, "[google] authorize failed "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-string v1, "GoogleSignInHelper"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lqq/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    const-string v2, "authorize failed "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0, p3}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    const/4 v0, 0x2

    .line 69
    const/4 v1, 0x0

    .line 70
    .line 71
    if-eqz p3, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-static {p3}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 75
    move-result v2

    .line 76
    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-static {p3}, Ld70/a;->a(Ljava/lang/Throwable;)Z

    .line 81
    move-result v2

    .line 82
    .line 83
    const-string v5, "GoogleSignInHelper"

    .line 84
    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    new-instance v3, Lcom/kubi/user/exception/UserCenterException;

    .line 88
    .line 89
    const/16 v8, 0x8

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v6, 0x1

    .line 92
    const/4 v7, 0x0

    .line 93
    move-object v4, p3

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v3 .. v9}, Lcom/kubi/user/exception/UserCenterException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-object v4, p3

    .line 102
    .line 103
    .line 104
    invoke-static {v4, v5}, Ld70/a;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_1
    new-instance v2, Lcom/kubi/user/exception/UserCenterExtAccountMessage;

    .line 108
    const/4 v6, 0x4

    .line 109
    const/4 v7, 0x0

    .line 110
    .line 111
    const-string v4, "GoogleSignInHelper"

    .line 112
    const/4 v5, 0x0

    .line 113
    .line 114
    .line 115
    invoke-direct/range {v2 .. v7}, Lcom/kubi/user/exception/UserCenterExtAccountMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 119
    .line 120
    :cond_2
    :goto_0
    new-instance p3, Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 121
    .line 122
    .line 123
    invoke-direct {p3, p1, p2}, Lcom/kubi/user/google/GoogleSignInHelper$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    return-object p3
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
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/mvi/common/MviExKt;->m()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "558910264483-tv7kcn4t5e22o2j3tnmejag4gn37854t.apps.googleusercontent.com"

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    const-string v0, "341850103036-l8c3f4ob0oqe9g512u9cmlf0h5rarn9v.apps.googleusercontent.com"

    .line 12
    return-object v0
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
.end method

.method public final g(Landroidx/credentials/Credential;)Lcom/kubi/user/google/GoogleSignInHelper$b;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Landroidx/credentials/CustomCredential;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/credentials/Credential;->getType()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->Companion:Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/credentials/Credential;->getData()Landroid/os/Bundle;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;->createFrom(Landroid/os/Bundle;)Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getIdToken()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    const-string v3, "GOOGLE_CREDENTIAL_EMPTY"

    .line 41
    .line 42
    const-string v4, "GOOGLE_CREDENTIAL_EMPTY"

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v2, p0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v2 .. v7}, Lcom/kubi/user/google/GoogleSignInHelper;->e(Lcom/kubi/user/google/GoogleSignInHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getId()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x2

    .line 56
    .line 57
    const-string v4, "@"

    .line 58
    const/4 v5, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v4, v2, v3, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 62
    move-result v2

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v1, v5

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getDisplayName()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    new-instance v2, Lcom/kubi/user/google/GoogleSignInHelper$a;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2, v0, v1, p1}, Lcom/kubi/user/google/GoogleSignInHelper$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    new-instance p1, Lcom/kubi/user/google/GoogleSignInHelper$b$b;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v2}, Lcom/kubi/user/google/GoogleSignInHelper$b$b;-><init>(Lcom/kubi/user/google/GoogleSignInHelper$a;)V

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    const-string v1, "unexpected_credential_type:"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/credentials/Credential;->getType()Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    const/4 v4, 0x4

    .line 104
    const/4 v5, 0x0

    .line 105
    .line 106
    const-string v1, "GOOGLE_CREDENTIAL_EMPTY"

    .line 107
    const/4 v3, 0x0

    .line 108
    move-object v0, p0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v0 .. v5}, Lcom/kubi/user/google/GoogleSignInHelper;->e(Lcom/kubi/user/google/GoogleSignInHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/kubi/user/google/GoogleSignInHelper$b$a;

    .line 112
    move-result-object p1

    .line 113
    return-object p1
    .line 114
    .line 115
.end method
