.class public final Ljumio/core/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/jumio/core/cdn/CDNCache;

.field public final b:Lcom/jumio/core/network/ByteArrayDownloadTask;


# direct methods
.method public constructor <init>(Lcom/jumio/core/cdn/CDNCache;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "cdnCache"

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
    iput-object p1, p0, Ljumio/core/I;->a:Lcom/jumio/core/cdn/CDNCache;

    .line 11
    .line 12
    sget-object p1, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    .line 13
    .line 14
    new-instance v0, Llg0/j;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Llg0/j;-><init>()V

    .line 18
    .line 19
    const-class v1, Lcom/jumio/core/cdn/CDNConfigInterface;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Lcom/jumio/core/cdn/CDNConfigInterface;

    .line 26
    .line 27
    new-instance v0, Lcom/jumio/core/network/ByteArrayDownloadTask;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lcom/jumio/core/cdn/CDNConfigInterface;->getUrl()Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    sget-object p1, Ljumio/core/L;->a:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    sget-object p1, Ljumio/core/J;->a:Lkotlin/text/Regex;

    .line 47
    const/4 v2, 0x2

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    const-string v4, "4.17.0 (1)"

    .line 51
    const/4 v5, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v4, v5, v2, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    :cond_0
    const-string p1, ""

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string p1, ".json"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    const/4 v4, 0x4

    .line 79
    const/4 v5, 0x0

    .line 80
    .line 81
    const/16 v2, 0x7530

    .line 82
    const/4 v3, 0x0

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/network/ByteArrayDownloadTask;-><init>(Ljava/lang/String;ILkotlinx/coroutines/j0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    iput-object v0, p0, Ljumio/core/I;->b:Lcom/jumio/core/network/ByteArrayDownloadTask;

    .line 88
    return-void
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
.end method

.method public static final a()Lcom/jumio/core/cdn/CDNConfigInterface;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/cdn/DefaultCDNConfig;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/cdn/DefaultCDNConfig;-><init>()V

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
.end method
