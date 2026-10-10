.class public final Lcom/kubi/credential/jetpack/JetpackManagerImpl;
.super Ljava/lang/Object;
.source "JetpackManagerImpl.kt"

# interfaces
.implements Lcom/kubi/credential/core/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/credential/jetpack/JetpackManagerImpl;",
        "Lcom/kubi/credential/core/a;",
        "Landroid/content/Context;",
        "context",
        "",
        "assetLinks",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Lef/a;",
        "request",
        "Lef/b;",
        "a",
        "(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lef/i;",
        "Lef/j;",
        "b",
        "(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "Lcom/kubi/credential/model/CredentialType;",
        "c",
        "()Ljava/util/List;",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Landroidx/credentials/CredentialManager;",
        "Lkotlin/Lazy;",
        "f",
        "()Landroidx/credentials/CredentialManager;",
        "manager",
        "credential_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->a:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->b:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;-><init>(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->c:Lkotlin/Lazy;

    .line 24
    return-void
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
.end method

.method public static final synthetic d(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->b:Ljava/lang/String;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic e(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->a:Landroid/content/Context;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public a(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lef/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lef/a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lef/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;->label:I

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
    iput v1, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;-><init>(Lcom/kubi/credential/jetpack/JetpackManagerImpl;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;->label:I

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
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/CreateCredentialException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v3, p1

    .line 45
    goto :goto_2

    .line 46
    :catch_1
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p0}, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->f()Landroidx/credentials/CredentialManager;

    .line 63
    move-result-object p3

    .line 64
    .line 65
    .line 66
    invoke-static {p2}, Lcom/kubi/credential/jetpack/b;->a(Lef/a;)Landroidx/credentials/CreateCredentialRequest;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    iput v3, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$createCredential$1;->label:I

    .line 70
    .line 71
    .line 72
    invoke-interface {p3, p1, p2, v0}, Landroidx/credentials/CredentialManager;->createCredential(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    if-ne p3, v1, :cond_3

    .line 76
    return-object v1

    .line 77
    .line 78
    :cond_3
    :goto_1
    check-cast p3, Landroidx/credentials/CreateCredentialResponse;

    .line 79
    .line 80
    .line 81
    invoke-static {p3}, Lcom/kubi/credential/jetpack/b;->e(Landroidx/credentials/CreateCredentialResponse;)Lef/b;

    .line 82
    move-result-object p1
    :try_end_1
    .catch Landroidx/credentials/exceptions/CreateCredentialException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    return-object p1

    .line 84
    .line 85
    :goto_2
    new-instance v0, Lcom/kubi/credential/exception/CreateCredentialException;

    .line 86
    const/4 v4, 0x2

    .line 87
    const/4 v5, 0x0

    .line 88
    .line 89
    const-string v1, "androidx.credentials.TYPE_CREATE_CREDENTIAL_JSON_EXCEPTION"

    .line 90
    const/4 v2, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v0 .. v5}, Lcom/kubi/credential/exception/CreateCredentialException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    throw v0

    .line 95
    .line 96
    .line 97
    :goto_3
    invoke-static {p1}, Lcom/kubi/credential/jetpack/b;->d(Landroidx/credentials/exceptions/CreateCredentialException;)Lcom/kubi/credential/exception/CreateCredentialException;

    .line 98
    move-result-object p1

    .line 99
    throw p1
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
.end method

.method public b(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lef/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lef/i;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lef/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;->label:I

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
    iput v1, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;-><init>(Lcom/kubi/credential/jetpack/JetpackManagerImpl;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;->label:I

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
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v3, p1

    .line 45
    goto :goto_2

    .line 46
    :catch_1
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p0}, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->f()Landroidx/credentials/CredentialManager;

    .line 63
    move-result-object p3

    .line 64
    .line 65
    .line 66
    invoke-static {p2}, Lcom/kubi/credential/jetpack/b;->c(Lef/i;)Landroidx/credentials/GetCredentialRequest;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    iput v3, v0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$getCredential$1;->label:I

    .line 70
    .line 71
    .line 72
    invoke-interface {p3, p1, p2, v0}, Landroidx/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    if-ne p3, v1, :cond_3

    .line 76
    return-object v1

    .line 77
    .line 78
    :cond_3
    :goto_1
    check-cast p3, Landroidx/credentials/GetCredentialResponse;

    .line 79
    .line 80
    .line 81
    invoke-static {p3}, Lcom/kubi/credential/jetpack/b;->h(Landroidx/credentials/GetCredentialResponse;)Lef/j;

    .line 82
    move-result-object p1
    :try_end_1
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    return-object p1

    .line 84
    .line 85
    :goto_2
    new-instance v0, Lcom/kubi/credential/exception/CreateCredentialException;

    .line 86
    const/4 v4, 0x2

    .line 87
    const/4 v5, 0x0

    .line 88
    .line 89
    const-string v1, "android.credentials.GetCredentialException.TYPE_JSON"

    .line 90
    const/4 v2, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v0 .. v5}, Lcom/kubi/credential/exception/CreateCredentialException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    throw v0

    .line 95
    .line 96
    .line 97
    :goto_3
    invoke-static {p1}, Lcom/kubi/credential/jetpack/b;->g(Landroidx/credentials/exceptions/GetCredentialException;)Lcom/kubi/credential/exception/GetCredentialException;

    .line 98
    move-result-object p1

    .line 99
    throw p1
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
.end method

.method public c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/credential/model/CredentialType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/credential/jetpack/c;->a:Lcom/kubi/credential/jetpack/c;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->a:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/kubi/credential/jetpack/c;->a(Landroid/content/Context;)Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method

.method public final f()Landroidx/credentials/CredentialManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/credentials/CredentialManager;

    .line 9
    return-object v0
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
.end method
