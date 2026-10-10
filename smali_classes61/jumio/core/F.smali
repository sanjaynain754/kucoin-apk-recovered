.class public final Ljumio/core/F;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljumio/core/I;


# direct methods
.method public constructor <init>(Ljumio/core/I;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/F;->b:Ljumio/core/I;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method

.method public static final a(Lorg/json/JSONObject;)Ljumio/core/K;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljumio/core/K;->d:Lcom/jumio/core/preload/CDNPreloadConfiguration$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/jumio/core/preload/CDNPreloadConfiguration$Companion;->fromJson(Lorg/json/JSONObject;)Ljumio/core/K;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljumio/core/F;

    .line 3
    .line 4
    iget-object v1, p0, Ljumio/core/F;->b:Ljumio/core/I;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Ljumio/core/F;-><init>(Ljumio/core/I;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Ljumio/core/F;->a:Ljava/lang/Object;

    .line 10
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Ljumio/core/F;

    .line 7
    .line 8
    iget-object v1, p0, Ljumio/core/F;->b:Ljumio/core/I;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Ljumio/core/F;-><init>(Ljumio/core/I;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Ljumio/core/F;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljumio/core/F;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/F;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    iget-object p1, p0, Ljumio/core/F;->b:Ljumio/core/I;

    .line 13
    .line 14
    iget-object v0, p1, Ljumio/core/I;->b:Lcom/jumio/core/network/ByteArrayDownloadTask;

    .line 15
    .line 16
    new-instance v1, Ljumio/core/E;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1}, Ljumio/core/E;-><init>(Ljumio/core/I;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/jumio/core/network/DownloadTask;->setListener(Lcom/jumio/core/network/DownloadTask$ProgressListener;)V

    .line 23
    .line 24
    iget-object p1, p0, Ljumio/core/F;->b:Ljumio/core/I;

    .line 25
    .line 26
    iget-object p1, p1, Ljumio/core/I;->b:Lcom/jumio/core/network/ByteArrayDownloadTask;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/jumio/core/network/DownloadTask;->startSync()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, [B

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "Problem loading preload configuration for version "

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    sget-object v0, Ljumio/core/J;->a:Lkotlin/text/Regex;

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x2

    .line 46
    .line 47
    const-string v3, "4.17.0 (1)"

    .line 48
    const/4 v4, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v3, v1, v2, v4}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    :cond_0
    const-string v0, ""

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v0, ". Please ensure the file exists!"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    const-string v0, "CDNModelPreloader"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    return-object v4

    .line 81
    .line 82
    :cond_2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 83
    .line 84
    new-instance v1, Ljava/lang/String;

    .line 85
    .line 86
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :catch_0
    new-instance v0, Lorg/json/JSONArray;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 99
    .line 100
    :goto_0
    new-instance p1, Llg0/a;

    .line 101
    .line 102
    .line 103
    invoke-direct {p1}, Llg0/a;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, p1}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 107
    move-result-object p1

    .line 108
    return-object p1
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
.end method
