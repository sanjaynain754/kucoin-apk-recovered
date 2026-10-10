.class public final Lcom/google/api/client/util/escape/CharEscapers;
.super Ljava/lang/Object;
.source "CharEscapers.java"


# static fields
.field private static final APPLICATION_X_WWW_FORM_URLENCODED:Lcom/google/api/client/util/escape/Escaper;

.field private static final URI_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

.field private static final URI_PATH_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

.field private static final URI_QUERY_STRING_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

.field private static final URI_RESERVED_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

.field private static final URI_USERINFO_ESCAPER:Lcom/google/api/client/util/escape/Escaper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    const-string v2, "-_.*"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v2, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;Z)V

    .line 9
    .line 10
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->APPLICATION_X_WWW_FORM_URLENCODED:Lcom/google/api/client/util/escape/Escaper;

    .line 11
    .line 12
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;Z)V

    .line 17
    .line 18
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 19
    .line 20
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 21
    .line 22
    const-string v1, "-_.!~*\'()@:$&,;=+"

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_PATH_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 28
    .line 29
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 30
    .line 31
    const-string v1, "-_.!~*\'()@:$&,;=+/?"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_RESERVED_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 37
    .line 38
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 39
    .line 40
    const-string v1, "-_.!~*\'():$&,;="

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_USERINFO_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 46
    .line 47
    new-instance v0, Lcom/google/api/client/util/escape/PercentEscaper;

    .line 48
    .line 49
    const-string v1, "-_.!~*\'()@:$,;/?:"

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Lcom/google/api/client/util/escape/PercentEscaper;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    sput-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_QUERY_STRING_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 55
    return-void
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
.end method

.method private constructor <init>()V
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
.end method

.method public static decodeUri(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    .line 14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static decodeUriPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    :try_start_0
    const-string v0, "+"

    .line 7
    .line 8
    const-string v1, "%2B"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    .line 26
    new-instance v0, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 30
    throw v0
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
.end method

.method public static escapeUri(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->APPLICATION_X_WWW_FORM_URLENCODED:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static escapeUriConformant(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static escapeUriPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_PATH_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static escapeUriPathWithoutReserved(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_RESERVED_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static escapeUriQuery(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_QUERY_STRING_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public static escapeUriUserInfo(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/util/escape/CharEscapers;->URI_USERINFO_ESCAPER:Lcom/google/api/client/util/escape/Escaper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/google/api/client/util/escape/Escaper;->escape(Ljava/lang/String;)Ljava/lang/String;

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
.end method
