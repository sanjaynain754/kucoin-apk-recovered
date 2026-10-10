.class final Lretrofit2/RequestFactory$Builder;
.super Ljava/lang/Object;
.source "RequestFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/RequestFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final PARAM:Ljava/lang/String; = "[a-zA-Z][a-zA-Z0-9_-]*"

.field private static final PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

.field private static final PARAM_URL_REGEX:Ljava/util/regex/Pattern;


# instance fields
.field contentType:Lokhttp3/MediaType;

.field gotBody:Z

.field gotField:Z

.field gotPart:Z

.field gotPath:Z

.field gotQuery:Z

.field gotQueryMap:Z

.field gotQueryName:Z

.field gotUrl:Z

.field hasBody:Z

.field headers:Lokhttp3/Headers;

.field httpMethod:Ljava/lang/String;

.field isFormEncoded:Z

.field isKotlinSuspendFunction:Z

.field isMultipart:Z

.field final method:Ljava/lang/reflect/Method;

.field final methodAnnotations:[Ljava/lang/annotation/Annotation;

.field final parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

.field parameterHandlers:[Lretrofit2/ParameterHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lretrofit2/ParameterHandler<",
            "*>;"
        }
    .end annotation
.end field

.field final parameterTypes:[Ljava/lang/reflect/Type;

.field relativeUrl:Ljava/lang/String;

.field relativeUrlParamNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final retrofit:Lretrofit2/Retrofit;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lretrofit2/RequestFactory$Builder;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "[a-zA-Z][a-zA-Z0-9_-]*"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lretrofit2/RequestFactory$Builder;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public constructor <init>(Lretrofit2/Retrofit;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 6
    .line 7
    iput-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->parameterTypes:[Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    .line 26
    return-void
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
.end method

.method private static boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 3
    .line 4
    if-ne v0, p0, :cond_0

    .line 5
    .line 6
    const-class p0, Ljava/lang/Boolean;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-ne v0, p0, :cond_1

    .line 12
    .line 13
    const-class p0, Ljava/lang/Byte;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    if-ne v0, p0, :cond_2

    .line 19
    .line 20
    const-class p0, Ljava/lang/Character;

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne v0, p0, :cond_3

    .line 26
    .line 27
    const-class p0, Ljava/lang/Double;

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    if-ne v0, p0, :cond_4

    .line 33
    .line 34
    const-class p0, Ljava/lang/Float;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne v0, p0, :cond_5

    .line 40
    .line 41
    const-class p0, Ljava/lang/Integer;

    .line 42
    return-object p0

    .line 43
    .line 44
    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne v0, p0, :cond_6

    .line 47
    .line 48
    const-class p0, Ljava/lang/Long;

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-ne v0, p0, :cond_7

    .line 54
    .line 55
    const-class p0, Ljava/lang/Short;

    .line 56
    :cond_7
    return-object p0
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
.end method

.method private parseHeaders([Ljava/lang/String;)Lokhttp3/Headers;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lokhttp3/Headers$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v4, p1, v3

    .line 13
    .line 14
    const/16 v5, 0x3a

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    .line 18
    move-result v5

    .line 19
    const/4 v6, -0x1

    .line 20
    .line 21
    if-eq v5, v6, :cond_1

    .line 22
    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 27
    move-result v6

    .line 28
    .line 29
    add-int/lit8 v6, v6, -0x1

    .line 30
    .line 31
    if-eq v5, v6, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    const-string v5, "Content-Type"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 51
    move-result v5

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-static {v4}, Lokhttp3/MediaType;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 57
    move-result-object v5

    .line 58
    .line 59
    iput-object v5, p0, Lretrofit2/RequestFactory$Builder;->contentType:Lokhttp3/MediaType;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    .line 63
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    const-string v1, "Malformed content type: %s"

    .line 66
    .line 67
    .line 68
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p1, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 73
    move-result-object p1

    .line 74
    throw p1

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {v0, v6, v4}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 78
    .line 79
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_1
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 83
    .line 84
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    .line 85
    .line 86
    .line 87
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0, v1}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 92
    move-result-object p1

    .line 93
    throw p1

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    .line 97
    move-result-object p1

    .line 98
    return-object p1
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
.end method

.method private parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->hasBody:Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    const/16 p1, 0x3f

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(I)I

    .line 21
    move-result p1

    .line 22
    const/4 p3, -0x1

    .line 23
    .line 24
    if-eq p1, p3, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 28
    move-result p3

    .line 29
    .line 30
    add-int/lit8 p3, p3, -0x1

    .line 31
    .line 32
    if-ge p1, p3, :cond_2

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    sget-object p3, Lretrofit2/RequestFactory$Builder;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    move-result-object p3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/util/regex/Matcher;->find()Z

    .line 48
    move-result p3

    .line 49
    .line 50
    if-nez p3, :cond_1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_1
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    const-string p3, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    .line 56
    .line 57
    .line 58
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p3, p1}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 63
    move-result-object p1

    .line 64
    throw p1

    .line 65
    .line 66
    :cond_2
    :goto_0
    iput-object p2, p0, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-static {p2}, Lretrofit2/RequestFactory$Builder;->parsePathParameters(Ljava/lang/String;)Ljava/util/Set;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->relativeUrlParamNames:Ljava/util/Set;

    .line 73
    return-void

    .line 74
    .line 75
    :cond_3
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 76
    .line 77
    const-string p3, "Only one HTTP method is allowed. Found: %s and %s."

    .line 78
    .line 79
    .line 80
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-static {p2, p3, p1}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 85
    move-result-object p1

    .line 86
    throw p1
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
.end method

.method private parseMethodAnnotation(Ljava/lang/annotation/Annotation;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lretrofit2/http/DELETE;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lretrofit2/http/DELETE;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lretrofit2/http/DELETE;->value()Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    const-string v0, "DELETE"

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, p1, v1}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, Lretrofit2/http/GET;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p1, Lretrofit2/http/GET;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lretrofit2/http/GET;->value()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v0, "GET"

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1, v1}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    return-void

    .line 34
    .line 35
    :cond_1
    instance-of v0, p1, Lretrofit2/http/HEAD;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    check-cast p1, Lretrofit2/http/HEAD;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lretrofit2/http/HEAD;->value()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string v0, "HEAD"

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v0, p1, v1}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_2
    instance-of v0, p1, Lretrofit2/http/PATCH;

    .line 52
    const/4 v2, 0x1

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    check-cast p1, Lretrofit2/http/PATCH;

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Lretrofit2/http/PATCH;->value()Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-string v0, "PATCH"

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v0, p1, v2}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_3
    instance-of v0, p1, Lretrofit2/http/POST;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    check-cast p1, Lretrofit2/http/POST;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Lretrofit2/http/POST;->value()Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    const-string v0, "POST"

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v0, p1, v2}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 82
    return-void

    .line 83
    .line 84
    :cond_4
    instance-of v0, p1, Lretrofit2/http/PUT;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    check-cast p1, Lretrofit2/http/PUT;

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Lretrofit2/http/PUT;->value()Ljava/lang/String;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    const-string v0, "PUT"

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v0, p1, v2}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 98
    return-void

    .line 99
    .line 100
    :cond_5
    instance-of v0, p1, Lretrofit2/http/OPTIONS;

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    check-cast p1, Lretrofit2/http/OPTIONS;

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Lretrofit2/http/OPTIONS;->value()Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    const-string v0, "OPTIONS"

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, v0, p1, v1}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_6
    instance-of v0, p1, Lretrofit2/http/HTTP;

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    check-cast p1, Lretrofit2/http/HTTP;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Lretrofit2/http/HTTP;->method()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-interface {p1}, Lretrofit2/http/HTTP;->path()Ljava/lang/String;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-interface {p1}, Lretrofit2/http/HTTP;->hasBody()Z

    .line 132
    move-result p1

    .line 133
    .line 134
    .line 135
    invoke-direct {p0, v0, v1, p1}, Lretrofit2/RequestFactory$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 136
    return-void

    .line 137
    .line 138
    :cond_7
    instance-of v0, p1, Lretrofit2/http/Headers;

    .line 139
    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    check-cast p1, Lretrofit2/http/Headers;

    .line 143
    .line 144
    .line 145
    invoke-interface {p1}, Lretrofit2/http/Headers;->value()[Ljava/lang/String;

    .line 146
    move-result-object p1

    .line 147
    array-length v0, p1

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, p1}, Lretrofit2/RequestFactory$Builder;->parseHeaders([Ljava/lang/String;)Lokhttp3/Headers;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    iput-object p1, p0, Lretrofit2/RequestFactory$Builder;->headers:Lokhttp3/Headers;

    .line 156
    return-void

    .line 157
    .line 158
    :cond_8
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 159
    .line 160
    const-string v0, "@Headers annotation is empty."

    .line 161
    .line 162
    new-array v1, v1, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0, v1}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 166
    move-result-object p1

    .line 167
    throw p1

    .line 168
    .line 169
    :cond_9
    instance-of v0, p1, Lretrofit2/http/Multipart;

    .line 170
    .line 171
    const-string v3, "Only one encoding annotation is allowed."

    .line 172
    .line 173
    if-eqz v0, :cond_b

    .line 174
    .line 175
    iget-boolean p1, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 176
    .line 177
    if-nez p1, :cond_a

    .line 178
    .line 179
    iput-boolean v2, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 180
    return-void

    .line 181
    .line 182
    :cond_a
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 183
    .line 184
    new-array v0, v1, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v3, v0}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 188
    move-result-object p1

    .line 189
    throw p1

    .line 190
    .line 191
    :cond_b
    instance-of p1, p1, Lretrofit2/http/FormUrlEncoded;

    .line 192
    .line 193
    if-eqz p1, :cond_d

    .line 194
    .line 195
    iget-boolean p1, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 196
    .line 197
    if-nez p1, :cond_c

    .line 198
    .line 199
    iput-boolean v2, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 200
    return-void

    .line 201
    .line 202
    :cond_c
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 203
    .line 204
    new-array v0, v1, [Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    invoke-static {p1, v3, v0}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 208
    move-result-object p1

    .line 209
    throw p1

    .line 210
    :cond_d
    return-void
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
.end method

.method private parseParameter(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Lretrofit2/ParameterHandler;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Z)",
            "Lretrofit2/ParameterHandler<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    if-eqz p3, :cond_2

    .line 5
    array-length v2, p3

    .line 6
    move v3, v0

    .line 7
    move-object v4, v1

    .line 8
    .line 9
    :goto_0
    if-ge v3, v2, :cond_3

    .line 10
    .line 11
    aget-object v5, p3, v3

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, v5}, Lretrofit2/RequestFactory$Builder;->parseParameterAnnotation(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    if-nez v4, :cond_1

    .line 21
    move-object v4, v5

    .line 22
    .line 23
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    const-string p3, "Multiple Retrofit annotations found, only one allowed."

    .line 29
    .line 30
    new-array p4, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 34
    move-result-object p1

    .line 35
    throw p1

    .line 36
    :cond_2
    move-object v4, v1

    .line 37
    .line 38
    :cond_3
    if-nez v4, :cond_5

    .line 39
    .line 40
    if-eqz p4, :cond_4

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    const-class p3, Lkotlin/coroutines/Continuation;

    .line 47
    .line 48
    if-ne p2, p3, :cond_4

    .line 49
    const/4 p2, 0x1

    .line 50
    .line 51
    iput-boolean p2, p0, Lretrofit2/RequestFactory$Builder;->isKotlinSuspendFunction:Z
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    return-object v1

    .line 53
    .line 54
    :catch_0
    :cond_4
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 55
    .line 56
    const-string p3, "No Retrofit annotation found."

    .line 57
    .line 58
    new-array p4, v0, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 62
    move-result-object p1

    .line 63
    throw p1

    .line 64
    :cond_5
    return-object v4
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
.end method

.method private parseParameterAnnotation(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lretrofit2/ParameterHandler<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lretrofit2/http/Url;

    .line 3
    .line 4
    const-string v1, "@Path parameters may not be used with @Url."

    .line 5
    .line 6
    const-class v2, Ljava/lang/String;

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_8

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 14
    .line 15
    iget-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->gotUrl:Z

    .line 16
    .line 17
    if-nez p3, :cond_7

    .line 18
    .line 19
    iget-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->gotPath:Z

    .line 20
    .line 21
    if-nez p3, :cond_6

    .line 22
    .line 23
    iget-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->gotQuery:Z

    .line 24
    .line 25
    if-nez p3, :cond_5

    .line 26
    .line 27
    iget-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->gotQueryName:Z

    .line 28
    .line 29
    if-nez p3, :cond_4

    .line 30
    .line 31
    iget-boolean p3, p0, Lretrofit2/RequestFactory$Builder;->gotQueryMap:Z

    .line 32
    .line 33
    if-nez p3, :cond_3

    .line 34
    .line 35
    iget-object p3, p0, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 36
    .line 37
    if-nez p3, :cond_2

    .line 38
    .line 39
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotUrl:Z

    .line 40
    .line 41
    const-class p3, Lokhttp3/HttpUrl;

    .line 42
    .line 43
    if-eq p2, p3, :cond_1

    .line 44
    .line 45
    if-eq p2, v2, :cond_1

    .line 46
    .line 47
    const-class p3, Ljava/net/URI;

    .line 48
    .line 49
    if-eq p2, p3, :cond_1

    .line 50
    .line 51
    instance-of p3, p2, Ljava/lang/Class;

    .line 52
    .line 53
    if-eqz p3, :cond_0

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    const-string p3, "android.net.Uri"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result p2

    .line 66
    .line 67
    if-eqz p2, :cond_0

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_0
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    const-string p3, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    .line 73
    .line 74
    new-array p4, v4, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 78
    move-result-object p1

    .line 79
    throw p1

    .line 80
    .line 81
    :cond_1
    :goto_0
    new-instance p2, Lretrofit2/ParameterHandler$RelativeUrl;

    .line 82
    .line 83
    iget-object p3, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    invoke-direct {p2, p3, p1}, Lretrofit2/ParameterHandler$RelativeUrl;-><init>(Ljava/lang/reflect/Method;I)V

    .line 87
    return-object p2

    .line 88
    .line 89
    :cond_2
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    iget-object p3, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 95
    move-result-object p3

    .line 96
    .line 97
    const-string p4, "@Url cannot be used with @%s URL"

    .line 98
    .line 99
    .line 100
    invoke-static {p2, p1, p4, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 101
    move-result-object p1

    .line 102
    throw p1

    .line 103
    .line 104
    :cond_3
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    const-string p3, "A @Url parameter must not come after a @QueryMap."

    .line 107
    .line 108
    new-array p4, v4, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 112
    move-result-object p1

    .line 113
    throw p1

    .line 114
    .line 115
    :cond_4
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 116
    .line 117
    const-string p3, "A @Url parameter must not come after a @QueryName."

    .line 118
    .line 119
    new-array p4, v4, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 123
    move-result-object p1

    .line 124
    throw p1

    .line 125
    .line 126
    :cond_5
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    const-string p3, "A @Url parameter must not come after a @Query."

    .line 129
    .line 130
    new-array p4, v4, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 134
    move-result-object p1

    .line 135
    throw p1

    .line 136
    .line 137
    :cond_6
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 138
    .line 139
    new-array p3, v4, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-static {p2, p1, v1, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 143
    move-result-object p1

    .line 144
    throw p1

    .line 145
    .line 146
    :cond_7
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    const-string p3, "Multiple @Url method annotations found."

    .line 149
    .line 150
    new-array p4, v4, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 154
    move-result-object p1

    .line 155
    throw p1

    .line 156
    .line 157
    :cond_8
    instance-of v0, p4, Lretrofit2/http/Path;

    .line 158
    .line 159
    if-eqz v0, :cond_e

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 163
    .line 164
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotQuery:Z

    .line 165
    .line 166
    if-nez v0, :cond_d

    .line 167
    .line 168
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotQueryName:Z

    .line 169
    .line 170
    if-nez v0, :cond_c

    .line 171
    .line 172
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotQueryMap:Z

    .line 173
    .line 174
    if-nez v0, :cond_b

    .line 175
    .line 176
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotUrl:Z

    .line 177
    .line 178
    if-nez v0, :cond_a

    .line 179
    .line 180
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotPath:Z

    .line 185
    .line 186
    check-cast p4, Lretrofit2/http/Path;

    .line 187
    .line 188
    .line 189
    invoke-interface {p4}, Lretrofit2/http/Path;->value()Ljava/lang/String;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, p1, v3}, Lretrofit2/RequestFactory$Builder;->validatePathName(ILjava/lang/String;)V

    .line 194
    .line 195
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 199
    move-result-object v4

    .line 200
    .line 201
    new-instance v0, Lretrofit2/ParameterHandler$Path;

    .line 202
    .line 203
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 204
    .line 205
    .line 206
    invoke-interface {p4}, Lretrofit2/http/Path;->encoded()Z

    .line 207
    move-result v5

    .line 208
    move v2, p1

    .line 209
    .line 210
    .line 211
    invoke-direct/range {v0 .. v5}, Lretrofit2/ParameterHandler$Path;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Lretrofit2/Converter;Z)V

    .line 212
    return-object v0

    .line 213
    .line 214
    :cond_9
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 215
    .line 216
    iget-object p3, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 220
    move-result-object p3

    .line 221
    .line 222
    const-string p4, "@Path can only be used with relative url on @%s"

    .line 223
    .line 224
    .line 225
    invoke-static {p2, p1, p4, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 226
    move-result-object p1

    .line 227
    throw p1

    .line 228
    .line 229
    :cond_a
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 230
    .line 231
    new-array p3, v4, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    invoke-static {p2, p1, v1, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 235
    move-result-object p1

    .line 236
    throw p1

    .line 237
    .line 238
    :cond_b
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 239
    .line 240
    const-string p3, "A @Path parameter must not come after a @QueryMap."

    .line 241
    .line 242
    new-array p4, v4, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 246
    move-result-object p1

    .line 247
    throw p1

    .line 248
    .line 249
    :cond_c
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 250
    .line 251
    const-string p3, "A @Path parameter must not come after a @QueryName."

    .line 252
    .line 253
    new-array p4, v4, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 257
    move-result-object p1

    .line 258
    throw p1

    .line 259
    .line 260
    :cond_d
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 261
    .line 262
    const-string p3, "A @Path parameter must not come after a @Query."

    .line 263
    .line 264
    new-array p4, v4, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 268
    move-result-object p1

    .line 269
    throw p1

    .line 270
    .line 271
    :cond_e
    instance-of v0, p4, Lretrofit2/http/Query;

    .line 272
    .line 273
    const-string v1, "<String>)"

    .line 274
    .line 275
    const-string v5, " must include generic type (e.g., "

    .line 276
    .line 277
    const-class v6, Ljava/lang/Iterable;

    .line 278
    .line 279
    if-eqz v0, :cond_12

    .line 280
    .line 281
    .line 282
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 283
    .line 284
    check-cast p4, Lretrofit2/http/Query;

    .line 285
    .line 286
    .line 287
    invoke-interface {p4}, Lretrofit2/http/Query;->value()Ljava/lang/String;

    .line 288
    move-result-object v0

    .line 289
    .line 290
    .line 291
    invoke-interface {p4}, Lretrofit2/http/Query;->encoded()Z

    .line 292
    move-result p4

    .line 293
    .line 294
    .line 295
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 296
    move-result-object v2

    .line 297
    .line 298
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotQuery:Z

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 302
    move-result v3

    .line 303
    .line 304
    if-eqz v3, :cond_10

    .line 305
    .line 306
    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    .line 307
    .line 308
    if-eqz v3, :cond_f

    .line 309
    .line 310
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 311
    .line 312
    .line 313
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 314
    move-result-object p1

    .line 315
    .line 316
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 320
    move-result-object p1

    .line 321
    .line 322
    new-instance p2, Lretrofit2/ParameterHandler$Query;

    .line 323
    .line 324
    .line 325
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 329
    move-result-object p1

    .line 330
    return-object p1

    .line 331
    .line 332
    :cond_f
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 333
    .line 334
    new-instance p3, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 341
    move-result-object p4

    .line 342
    .line 343
    .line 344
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 351
    move-result-object p4

    .line 352
    .line 353
    .line 354
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    move-result-object p3

    .line 362
    .line 363
    new-array p4, v4, [Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 367
    move-result-object p1

    .line 368
    throw p1

    .line 369
    .line 370
    .line 371
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 372
    move-result p1

    .line 373
    .line 374
    if-eqz p1, :cond_11

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 378
    move-result-object p1

    .line 379
    .line 380
    .line 381
    invoke-static {p1}, Lretrofit2/RequestFactory$Builder;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    .line 382
    move-result-object p1

    .line 383
    .line 384
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 388
    move-result-object p1

    .line 389
    .line 390
    new-instance p2, Lretrofit2/ParameterHandler$Query;

    .line 391
    .line 392
    .line 393
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 397
    move-result-object p1

    .line 398
    return-object p1

    .line 399
    .line 400
    :cond_11
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 404
    move-result-object p1

    .line 405
    .line 406
    new-instance p2, Lretrofit2/ParameterHandler$Query;

    .line 407
    .line 408
    .line 409
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 410
    return-object p2

    .line 411
    .line 412
    :cond_12
    instance-of v0, p4, Lretrofit2/http/QueryName;

    .line 413
    .line 414
    if-eqz v0, :cond_16

    .line 415
    .line 416
    .line 417
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 418
    .line 419
    check-cast p4, Lretrofit2/http/QueryName;

    .line 420
    .line 421
    .line 422
    invoke-interface {p4}, Lretrofit2/http/QueryName;->encoded()Z

    .line 423
    move-result p4

    .line 424
    .line 425
    .line 426
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 427
    move-result-object v0

    .line 428
    .line 429
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotQueryName:Z

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 433
    move-result v2

    .line 434
    .line 435
    if-eqz v2, :cond_14

    .line 436
    .line 437
    instance-of v2, p2, Ljava/lang/reflect/ParameterizedType;

    .line 438
    .line 439
    if-eqz v2, :cond_13

    .line 440
    .line 441
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 442
    .line 443
    .line 444
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 445
    move-result-object p1

    .line 446
    .line 447
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 451
    move-result-object p1

    .line 452
    .line 453
    new-instance p2, Lretrofit2/ParameterHandler$QueryName;

    .line 454
    .line 455
    .line 456
    invoke-direct {p2, p1, p4}, Lretrofit2/ParameterHandler$QueryName;-><init>(Lretrofit2/Converter;Z)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 460
    move-result-object p1

    .line 461
    return-object p1

    .line 462
    .line 463
    :cond_13
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 464
    .line 465
    new-instance p3, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 472
    move-result-object p4

    .line 473
    .line 474
    .line 475
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 482
    move-result-object p4

    .line 483
    .line 484
    .line 485
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    move-result-object p3

    .line 493
    .line 494
    new-array p4, v4, [Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 498
    move-result-object p1

    .line 499
    throw p1

    .line 500
    .line 501
    .line 502
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 503
    move-result p1

    .line 504
    .line 505
    if-eqz p1, :cond_15

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 509
    move-result-object p1

    .line 510
    .line 511
    .line 512
    invoke-static {p1}, Lretrofit2/RequestFactory$Builder;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    .line 513
    move-result-object p1

    .line 514
    .line 515
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 516
    .line 517
    .line 518
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 519
    move-result-object p1

    .line 520
    .line 521
    new-instance p2, Lretrofit2/ParameterHandler$QueryName;

    .line 522
    .line 523
    .line 524
    invoke-direct {p2, p1, p4}, Lretrofit2/ParameterHandler$QueryName;-><init>(Lretrofit2/Converter;Z)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 528
    move-result-object p1

    .line 529
    return-object p1

    .line 530
    .line 531
    :cond_15
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 532
    .line 533
    .line 534
    invoke-virtual {p1, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 535
    move-result-object p1

    .line 536
    .line 537
    new-instance p2, Lretrofit2/ParameterHandler$QueryName;

    .line 538
    .line 539
    .line 540
    invoke-direct {p2, p1, p4}, Lretrofit2/ParameterHandler$QueryName;-><init>(Lretrofit2/Converter;Z)V

    .line 541
    return-object p2

    .line 542
    .line 543
    :cond_16
    instance-of v0, p4, Lretrofit2/http/QueryMap;

    .line 544
    .line 545
    const-string v7, "Map must include generic types (e.g., Map<String, String>)"

    .line 546
    .line 547
    const-class v8, Ljava/util/Map;

    .line 548
    .line 549
    if-eqz v0, :cond_1a

    .line 550
    .line 551
    .line 552
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 553
    .line 554
    .line 555
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 556
    move-result-object v0

    .line 557
    .line 558
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotQueryMap:Z

    .line 559
    .line 560
    .line 561
    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 562
    move-result v1

    .line 563
    .line 564
    if-eqz v1, :cond_19

    .line 565
    .line 566
    .line 567
    invoke-static {p2, v0, v8}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 568
    move-result-object p2

    .line 569
    .line 570
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 571
    .line 572
    if-eqz v0, :cond_18

    .line 573
    .line 574
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 575
    .line 576
    .line 577
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 578
    move-result-object v0

    .line 579
    .line 580
    if-ne v2, v0, :cond_17

    .line 581
    .line 582
    .line 583
    invoke-static {v3, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 584
    move-result-object p2

    .line 585
    .line 586
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 590
    move-result-object p2

    .line 591
    .line 592
    new-instance p3, Lretrofit2/ParameterHandler$QueryMap;

    .line 593
    .line 594
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 595
    .line 596
    check-cast p4, Lretrofit2/http/QueryMap;

    .line 597
    .line 598
    .line 599
    invoke-interface {p4}, Lretrofit2/http/QueryMap;->encoded()Z

    .line 600
    move-result p4

    .line 601
    .line 602
    .line 603
    invoke-direct {p3, v0, p1, p2, p4}, Lretrofit2/ParameterHandler$QueryMap;-><init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;Z)V

    .line 604
    return-object p3

    .line 605
    .line 606
    :cond_17
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 607
    .line 608
    new-instance p3, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 612
    .line 613
    const-string p4, "@QueryMap keys must be of type String: "

    .line 614
    .line 615
    .line 616
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    move-result-object p3

    .line 624
    .line 625
    new-array p4, v4, [Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 629
    move-result-object p1

    .line 630
    throw p1

    .line 631
    .line 632
    :cond_18
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 633
    .line 634
    new-array p3, v4, [Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    invoke-static {p2, p1, v7, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 638
    move-result-object p1

    .line 639
    throw p1

    .line 640
    .line 641
    :cond_19
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 642
    .line 643
    const-string p3, "@QueryMap parameter type must be Map."

    .line 644
    .line 645
    new-array p4, v4, [Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 649
    move-result-object p1

    .line 650
    throw p1

    .line 651
    .line 652
    :cond_1a
    instance-of v0, p4, Lretrofit2/http/Header;

    .line 653
    .line 654
    if-eqz v0, :cond_1e

    .line 655
    .line 656
    .line 657
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 658
    .line 659
    check-cast p4, Lretrofit2/http/Header;

    .line 660
    .line 661
    .line 662
    invoke-interface {p4}, Lretrofit2/http/Header;->value()Ljava/lang/String;

    .line 663
    move-result-object p4

    .line 664
    .line 665
    .line 666
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 667
    move-result-object v0

    .line 668
    .line 669
    .line 670
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 671
    move-result v2

    .line 672
    .line 673
    if-eqz v2, :cond_1c

    .line 674
    .line 675
    instance-of v2, p2, Ljava/lang/reflect/ParameterizedType;

    .line 676
    .line 677
    if-eqz v2, :cond_1b

    .line 678
    .line 679
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 680
    .line 681
    .line 682
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 683
    move-result-object p1

    .line 684
    .line 685
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 686
    .line 687
    .line 688
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 689
    move-result-object p1

    .line 690
    .line 691
    new-instance p2, Lretrofit2/ParameterHandler$Header;

    .line 692
    .line 693
    .line 694
    invoke-direct {p2, p4, p1}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 698
    move-result-object p1

    .line 699
    return-object p1

    .line 700
    .line 701
    :cond_1b
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 702
    .line 703
    new-instance p3, Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 710
    move-result-object p4

    .line 711
    .line 712
    .line 713
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 720
    move-result-object p4

    .line 721
    .line 722
    .line 723
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    move-result-object p3

    .line 731
    .line 732
    new-array p4, v4, [Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 736
    move-result-object p1

    .line 737
    throw p1

    .line 738
    .line 739
    .line 740
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 741
    move-result p1

    .line 742
    .line 743
    if-eqz p1, :cond_1d

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 747
    move-result-object p1

    .line 748
    .line 749
    .line 750
    invoke-static {p1}, Lretrofit2/RequestFactory$Builder;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    .line 751
    move-result-object p1

    .line 752
    .line 753
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 754
    .line 755
    .line 756
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 757
    move-result-object p1

    .line 758
    .line 759
    new-instance p2, Lretrofit2/ParameterHandler$Header;

    .line 760
    .line 761
    .line 762
    invoke-direct {p2, p4, p1}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 766
    move-result-object p1

    .line 767
    return-object p1

    .line 768
    .line 769
    :cond_1d
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 770
    .line 771
    .line 772
    invoke-virtual {p1, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 773
    move-result-object p1

    .line 774
    .line 775
    new-instance p2, Lretrofit2/ParameterHandler$Header;

    .line 776
    .line 777
    .line 778
    invoke-direct {p2, p4, p1}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    .line 779
    return-object p2

    .line 780
    .line 781
    :cond_1e
    instance-of v0, p4, Lretrofit2/http/HeaderMap;

    .line 782
    .line 783
    if-eqz v0, :cond_23

    .line 784
    .line 785
    const-class p4, Lokhttp3/Headers;

    .line 786
    .line 787
    if-ne p2, p4, :cond_1f

    .line 788
    .line 789
    new-instance p2, Lretrofit2/ParameterHandler$Headers;

    .line 790
    .line 791
    iget-object p3, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 792
    .line 793
    .line 794
    invoke-direct {p2, p3, p1}, Lretrofit2/ParameterHandler$Headers;-><init>(Ljava/lang/reflect/Method;I)V

    .line 795
    return-object p2

    .line 796
    .line 797
    .line 798
    :cond_1f
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 799
    .line 800
    .line 801
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 802
    move-result-object p4

    .line 803
    .line 804
    .line 805
    invoke-virtual {v8, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 806
    move-result v0

    .line 807
    .line 808
    if-eqz v0, :cond_22

    .line 809
    .line 810
    .line 811
    invoke-static {p2, p4, v8}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 812
    move-result-object p2

    .line 813
    .line 814
    instance-of p4, p2, Ljava/lang/reflect/ParameterizedType;

    .line 815
    .line 816
    if-eqz p4, :cond_21

    .line 817
    .line 818
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 819
    .line 820
    .line 821
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 822
    move-result-object p4

    .line 823
    .line 824
    if-ne v2, p4, :cond_20

    .line 825
    .line 826
    .line 827
    invoke-static {v3, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 828
    move-result-object p2

    .line 829
    .line 830
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 831
    .line 832
    .line 833
    invoke-virtual {p4, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 834
    move-result-object p2

    .line 835
    .line 836
    new-instance p3, Lretrofit2/ParameterHandler$HeaderMap;

    .line 837
    .line 838
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 839
    .line 840
    .line 841
    invoke-direct {p3, p4, p1, p2}, Lretrofit2/ParameterHandler$HeaderMap;-><init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;)V

    .line 842
    return-object p3

    .line 843
    .line 844
    :cond_20
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 845
    .line 846
    new-instance p3, Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 850
    .line 851
    const-string v0, "@HeaderMap keys must be of type String: "

    .line 852
    .line 853
    .line 854
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    move-result-object p3

    .line 862
    .line 863
    new-array p4, v4, [Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 867
    move-result-object p1

    .line 868
    throw p1

    .line 869
    .line 870
    :cond_21
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 871
    .line 872
    new-array p3, v4, [Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    invoke-static {p2, p1, v7, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 876
    move-result-object p1

    .line 877
    throw p1

    .line 878
    .line 879
    :cond_22
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 880
    .line 881
    const-string p3, "@HeaderMap parameter type must be Map."

    .line 882
    .line 883
    new-array p4, v4, [Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 887
    move-result-object p1

    .line 888
    throw p1

    .line 889
    .line 890
    :cond_23
    instance-of v0, p4, Lretrofit2/http/Field;

    .line 891
    .line 892
    if-eqz v0, :cond_28

    .line 893
    .line 894
    .line 895
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 896
    .line 897
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 898
    .line 899
    if-eqz v0, :cond_27

    .line 900
    .line 901
    check-cast p4, Lretrofit2/http/Field;

    .line 902
    .line 903
    .line 904
    invoke-interface {p4}, Lretrofit2/http/Field;->value()Ljava/lang/String;

    .line 905
    move-result-object v0

    .line 906
    .line 907
    .line 908
    invoke-interface {p4}, Lretrofit2/http/Field;->encoded()Z

    .line 909
    move-result p4

    .line 910
    .line 911
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotField:Z

    .line 912
    .line 913
    .line 914
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 915
    move-result-object v2

    .line 916
    .line 917
    .line 918
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 919
    move-result v3

    .line 920
    .line 921
    if-eqz v3, :cond_25

    .line 922
    .line 923
    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    .line 924
    .line 925
    if-eqz v3, :cond_24

    .line 926
    .line 927
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 928
    .line 929
    .line 930
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 931
    move-result-object p1

    .line 932
    .line 933
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 934
    .line 935
    .line 936
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 937
    move-result-object p1

    .line 938
    .line 939
    new-instance p2, Lretrofit2/ParameterHandler$Field;

    .line 940
    .line 941
    .line 942
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 946
    move-result-object p1

    .line 947
    return-object p1

    .line 948
    .line 949
    :cond_24
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 950
    .line 951
    new-instance p3, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    .line 954
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 958
    move-result-object p4

    .line 959
    .line 960
    .line 961
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 968
    move-result-object p4

    .line 969
    .line 970
    .line 971
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    move-result-object p3

    .line 979
    .line 980
    new-array p4, v4, [Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 984
    move-result-object p1

    .line 985
    throw p1

    .line 986
    .line 987
    .line 988
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 989
    move-result p1

    .line 990
    .line 991
    if-eqz p1, :cond_26

    .line 992
    .line 993
    .line 994
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 995
    move-result-object p1

    .line 996
    .line 997
    .line 998
    invoke-static {p1}, Lretrofit2/RequestFactory$Builder;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    .line 999
    move-result-object p1

    .line 1000
    .line 1001
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {p2, p1, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1005
    move-result-object p1

    .line 1006
    .line 1007
    new-instance p2, Lretrofit2/ParameterHandler$Field;

    .line 1008
    .line 1009
    .line 1010
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {p2}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 1014
    move-result-object p1

    .line 1015
    return-object p1

    .line 1016
    .line 1017
    :cond_26
    iget-object p1, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {p1, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1021
    move-result-object p1

    .line 1022
    .line 1023
    new-instance p2, Lretrofit2/ParameterHandler$Field;

    .line 1024
    .line 1025
    .line 1026
    invoke-direct {p2, v0, p1, p4}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    .line 1027
    return-object p2

    .line 1028
    .line 1029
    :cond_27
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1030
    .line 1031
    const-string p3, "@Field parameters can only be used with form encoding."

    .line 1032
    .line 1033
    new-array p4, v4, [Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1037
    move-result-object p1

    .line 1038
    throw p1

    .line 1039
    .line 1040
    :cond_28
    instance-of v0, p4, Lretrofit2/http/FieldMap;

    .line 1041
    .line 1042
    if-eqz v0, :cond_2d

    .line 1043
    .line 1044
    .line 1045
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 1046
    .line 1047
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 1048
    .line 1049
    if-eqz v0, :cond_2c

    .line 1050
    .line 1051
    .line 1052
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1053
    move-result-object v0

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1057
    move-result v1

    .line 1058
    .line 1059
    if-eqz v1, :cond_2b

    .line 1060
    .line 1061
    .line 1062
    invoke-static {p2, v0, v8}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1063
    move-result-object p2

    .line 1064
    .line 1065
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 1066
    .line 1067
    if-eqz v0, :cond_2a

    .line 1068
    .line 1069
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1073
    move-result-object v0

    .line 1074
    .line 1075
    if-ne v2, v0, :cond_29

    .line 1076
    .line 1077
    .line 1078
    invoke-static {v3, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1079
    move-result-object p2

    .line 1080
    .line 1081
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, p2, p3}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1085
    move-result-object p2

    .line 1086
    .line 1087
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotField:Z

    .line 1088
    .line 1089
    new-instance p3, Lretrofit2/ParameterHandler$FieldMap;

    .line 1090
    .line 1091
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1092
    .line 1093
    check-cast p4, Lretrofit2/http/FieldMap;

    .line 1094
    .line 1095
    .line 1096
    invoke-interface {p4}, Lretrofit2/http/FieldMap;->encoded()Z

    .line 1097
    move-result p4

    .line 1098
    .line 1099
    .line 1100
    invoke-direct {p3, v0, p1, p2, p4}, Lretrofit2/ParameterHandler$FieldMap;-><init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;Z)V

    .line 1101
    return-object p3

    .line 1102
    .line 1103
    :cond_29
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1104
    .line 1105
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1109
    .line 1110
    const-string p4, "@FieldMap keys must be of type String: "

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1120
    move-result-object p3

    .line 1121
    .line 1122
    new-array p4, v4, [Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1126
    move-result-object p1

    .line 1127
    throw p1

    .line 1128
    .line 1129
    :cond_2a
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1130
    .line 1131
    new-array p3, v4, [Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    invoke-static {p2, p1, v7, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1135
    move-result-object p1

    .line 1136
    throw p1

    .line 1137
    .line 1138
    :cond_2b
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1139
    .line 1140
    const-string p3, "@FieldMap parameter type must be Map."

    .line 1141
    .line 1142
    new-array p4, v4, [Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1146
    move-result-object p1

    .line 1147
    throw p1

    .line 1148
    .line 1149
    :cond_2c
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1150
    .line 1151
    const-string p3, "@FieldMap parameters can only be used with form encoding."

    .line 1152
    .line 1153
    new-array p4, v4, [Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1157
    move-result-object p1

    .line 1158
    throw p1

    .line 1159
    .line 1160
    :cond_2d
    instance-of v0, p4, Lretrofit2/http/Part;

    .line 1161
    .line 1162
    const-class v9, Lokhttp3/MultipartBody$Part;

    .line 1163
    .line 1164
    if-eqz v0, :cond_3c

    .line 1165
    .line 1166
    .line 1167
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 1168
    .line 1169
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 1170
    .line 1171
    if-eqz v0, :cond_3b

    .line 1172
    .line 1173
    check-cast p4, Lretrofit2/http/Part;

    .line 1174
    .line 1175
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotPart:Z

    .line 1176
    .line 1177
    .line 1178
    invoke-interface {p4}, Lretrofit2/http/Part;->value()Ljava/lang/String;

    .line 1179
    move-result-object v0

    .line 1180
    .line 1181
    .line 1182
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1183
    move-result-object v2

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1187
    move-result v3

    .line 1188
    .line 1189
    if-eqz v3, :cond_34

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1193
    move-result p3

    .line 1194
    .line 1195
    const-string p4, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    .line 1196
    .line 1197
    if-eqz p3, :cond_30

    .line 1198
    .line 1199
    instance-of p3, p2, Ljava/lang/reflect/ParameterizedType;

    .line 1200
    .line 1201
    if-eqz p3, :cond_2f

    .line 1202
    .line 1203
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 1204
    .line 1205
    .line 1206
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1207
    move-result-object p2

    .line 1208
    .line 1209
    .line 1210
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1211
    move-result-object p2

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1215
    move-result p2

    .line 1216
    .line 1217
    if-eqz p2, :cond_2e

    .line 1218
    .line 1219
    sget-object p1, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {p1}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 1223
    move-result-object p1

    .line 1224
    return-object p1

    .line 1225
    .line 1226
    :cond_2e
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1227
    .line 1228
    new-array p3, v4, [Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    invoke-static {p2, p1, p4, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1232
    move-result-object p1

    .line 1233
    throw p1

    .line 1234
    .line 1235
    :cond_2f
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1236
    .line 1237
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1238
    .line 1239
    .line 1240
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1244
    move-result-object p4

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1254
    move-result-object p4

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1264
    move-result-object p3

    .line 1265
    .line 1266
    new-array p4, v4, [Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1270
    move-result-object p1

    .line 1271
    throw p1

    .line 1272
    .line 1273
    .line 1274
    :cond_30
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 1275
    move-result p2

    .line 1276
    .line 1277
    if-eqz p2, :cond_32

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1281
    move-result-object p2

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1285
    move-result p2

    .line 1286
    .line 1287
    if-eqz p2, :cond_31

    .line 1288
    .line 1289
    sget-object p1, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {p1}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 1293
    move-result-object p1

    .line 1294
    return-object p1

    .line 1295
    .line 1296
    :cond_31
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1297
    .line 1298
    new-array p3, v4, [Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    invoke-static {p2, p1, p4, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1302
    move-result-object p1

    .line 1303
    throw p1

    .line 1304
    .line 1305
    .line 1306
    :cond_32
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1307
    move-result p2

    .line 1308
    .line 1309
    if-eqz p2, :cond_33

    .line 1310
    .line 1311
    sget-object p1, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    .line 1312
    return-object p1

    .line 1313
    .line 1314
    :cond_33
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1315
    .line 1316
    new-array p3, v4, [Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    invoke-static {p2, p1, p4, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1320
    move-result-object p1

    .line 1321
    throw p1

    .line 1322
    .line 1323
    :cond_34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    .line 1326
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1327
    .line 1328
    const-string v7, "form-data; name=\""

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1335
    .line 1336
    const-string v0, "\""

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1343
    move-result-object v0

    .line 1344
    .line 1345
    const-string v3, "Content-Transfer-Encoding"

    .line 1346
    .line 1347
    .line 1348
    invoke-interface {p4}, Lretrofit2/http/Part;->encoding()Ljava/lang/String;

    .line 1349
    move-result-object p4

    .line 1350
    .line 1351
    const-string v7, "Content-Disposition"

    .line 1352
    .line 1353
    .line 1354
    filled-new-array {v7, v0, v3, p4}, [Ljava/lang/String;

    .line 1355
    move-result-object p4

    .line 1356
    .line 1357
    .line 1358
    invoke-static {p4}, Lokhttp3/Headers;->of([Ljava/lang/String;)Lokhttp3/Headers;

    .line 1359
    move-result-object p4

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1363
    move-result v0

    .line 1364
    .line 1365
    const-string v3, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    .line 1366
    .line 1367
    if-eqz v0, :cond_37

    .line 1368
    .line 1369
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 1370
    .line 1371
    if-eqz v0, :cond_36

    .line 1372
    .line 1373
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 1374
    .line 1375
    .line 1376
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1377
    move-result-object p2

    .line 1378
    .line 1379
    .line 1380
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1381
    move-result-object v0

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1385
    move-result v0

    .line 1386
    .line 1387
    if-nez v0, :cond_35

    .line 1388
    .line 1389
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1390
    .line 1391
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v0, p2, p3, v1}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1395
    move-result-object p2

    .line 1396
    .line 1397
    new-instance p3, Lretrofit2/ParameterHandler$Part;

    .line 1398
    .line 1399
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1400
    .line 1401
    .line 1402
    invoke-direct {p3, v0, p1, p4, p2}, Lretrofit2/ParameterHandler$Part;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lretrofit2/Converter;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {p3}, Lretrofit2/ParameterHandler;->iterable()Lretrofit2/ParameterHandler;

    .line 1406
    move-result-object p1

    .line 1407
    return-object p1

    .line 1408
    .line 1409
    :cond_35
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1410
    .line 1411
    new-array p3, v4, [Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    invoke-static {p2, p1, v3, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1415
    move-result-object p1

    .line 1416
    throw p1

    .line 1417
    .line 1418
    :cond_36
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1419
    .line 1420
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1427
    move-result-object p4

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1437
    move-result-object p4

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1447
    move-result-object p3

    .line 1448
    .line 1449
    new-array p4, v4, [Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1453
    move-result-object p1

    .line 1454
    throw p1

    .line 1455
    .line 1456
    .line 1457
    :cond_37
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 1458
    move-result v0

    .line 1459
    .line 1460
    if-eqz v0, :cond_39

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1464
    move-result-object p2

    .line 1465
    .line 1466
    .line 1467
    invoke-static {p2}, Lretrofit2/RequestFactory$Builder;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1468
    move-result-object p2

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1472
    move-result v0

    .line 1473
    .line 1474
    if-nez v0, :cond_38

    .line 1475
    .line 1476
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1477
    .line 1478
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v0, p2, p3, v1}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1482
    move-result-object p2

    .line 1483
    .line 1484
    new-instance p3, Lretrofit2/ParameterHandler$Part;

    .line 1485
    .line 1486
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1487
    .line 1488
    .line 1489
    invoke-direct {p3, v0, p1, p4, p2}, Lretrofit2/ParameterHandler$Part;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lretrofit2/Converter;)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {p3}, Lretrofit2/ParameterHandler;->array()Lretrofit2/ParameterHandler;

    .line 1493
    move-result-object p1

    .line 1494
    return-object p1

    .line 1495
    .line 1496
    :cond_38
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1497
    .line 1498
    new-array p3, v4, [Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    invoke-static {p2, p1, v3, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1502
    move-result-object p1

    .line 1503
    throw p1

    .line 1504
    .line 1505
    .line 1506
    :cond_39
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1507
    move-result v0

    .line 1508
    .line 1509
    if-nez v0, :cond_3a

    .line 1510
    .line 1511
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1512
    .line 1513
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v0, p2, p3, v1}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1517
    move-result-object p2

    .line 1518
    .line 1519
    new-instance p3, Lretrofit2/ParameterHandler$Part;

    .line 1520
    .line 1521
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1522
    .line 1523
    .line 1524
    invoke-direct {p3, v0, p1, p4, p2}, Lretrofit2/ParameterHandler$Part;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lretrofit2/Converter;)V

    .line 1525
    return-object p3

    .line 1526
    .line 1527
    :cond_3a
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1528
    .line 1529
    new-array p3, v4, [Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    invoke-static {p2, p1, v3, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1533
    move-result-object p1

    .line 1534
    throw p1

    .line 1535
    .line 1536
    :cond_3b
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1537
    .line 1538
    const-string p3, "@Part parameters can only be used with multipart encoding."

    .line 1539
    .line 1540
    new-array p4, v4, [Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1544
    move-result-object p1

    .line 1545
    throw p1

    .line 1546
    .line 1547
    :cond_3c
    instance-of v0, p4, Lretrofit2/http/PartMap;

    .line 1548
    .line 1549
    if-eqz v0, :cond_42

    .line 1550
    .line 1551
    .line 1552
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 1553
    .line 1554
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 1555
    .line 1556
    if-eqz v0, :cond_41

    .line 1557
    .line 1558
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotPart:Z

    .line 1559
    .line 1560
    .line 1561
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1562
    move-result-object v0

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1566
    move-result v1

    .line 1567
    .line 1568
    if-eqz v1, :cond_40

    .line 1569
    .line 1570
    .line 1571
    invoke-static {p2, v0, v8}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1572
    move-result-object p2

    .line 1573
    .line 1574
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 1575
    .line 1576
    if-eqz v0, :cond_3f

    .line 1577
    .line 1578
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 1579
    .line 1580
    .line 1581
    invoke-static {v4, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1582
    move-result-object v0

    .line 1583
    .line 1584
    if-ne v2, v0, :cond_3e

    .line 1585
    .line 1586
    .line 1587
    invoke-static {v3, p2}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1588
    move-result-object p2

    .line 1589
    .line 1590
    .line 1591
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1592
    move-result-object v0

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1596
    move-result v0

    .line 1597
    .line 1598
    if-nez v0, :cond_3d

    .line 1599
    .line 1600
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1601
    .line 1602
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v0, p2, p3, v1}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1606
    move-result-object p2

    .line 1607
    .line 1608
    check-cast p4, Lretrofit2/http/PartMap;

    .line 1609
    .line 1610
    new-instance p3, Lretrofit2/ParameterHandler$PartMap;

    .line 1611
    .line 1612
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1613
    .line 1614
    .line 1615
    invoke-interface {p4}, Lretrofit2/http/PartMap;->encoding()Ljava/lang/String;

    .line 1616
    move-result-object p4

    .line 1617
    .line 1618
    .line 1619
    invoke-direct {p3, v0, p1, p2, p4}, Lretrofit2/ParameterHandler$PartMap;-><init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;Ljava/lang/String;)V

    .line 1620
    return-object p3

    .line 1621
    .line 1622
    :cond_3d
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1623
    .line 1624
    const-string p3, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    .line 1625
    .line 1626
    new-array p4, v4, [Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1630
    move-result-object p1

    .line 1631
    throw p1

    .line 1632
    .line 1633
    :cond_3e
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1634
    .line 1635
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1636
    .line 1637
    .line 1638
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1639
    .line 1640
    const-string p4, "@PartMap keys must be of type String: "

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1650
    move-result-object p3

    .line 1651
    .line 1652
    new-array p4, v4, [Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1656
    move-result-object p1

    .line 1657
    throw p1

    .line 1658
    .line 1659
    :cond_3f
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1660
    .line 1661
    new-array p3, v4, [Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    invoke-static {p2, p1, v7, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1665
    move-result-object p1

    .line 1666
    throw p1

    .line 1667
    .line 1668
    :cond_40
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1669
    .line 1670
    const-string p3, "@PartMap parameter type must be Map."

    .line 1671
    .line 1672
    new-array p4, v4, [Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1676
    move-result-object p1

    .line 1677
    throw p1

    .line 1678
    .line 1679
    :cond_41
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1680
    .line 1681
    const-string p3, "@PartMap parameters can only be used with multipart encoding."

    .line 1682
    .line 1683
    new-array p4, v4, [Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1687
    move-result-object p1

    .line 1688
    throw p1

    .line 1689
    .line 1690
    :cond_42
    instance-of v0, p4, Lretrofit2/http/Body;

    .line 1691
    .line 1692
    if-eqz v0, :cond_45

    .line 1693
    .line 1694
    .line 1695
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 1696
    .line 1697
    iget-boolean p4, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 1698
    .line 1699
    if-nez p4, :cond_44

    .line 1700
    .line 1701
    iget-boolean p4, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 1702
    .line 1703
    if-nez p4, :cond_44

    .line 1704
    .line 1705
    iget-boolean p4, p0, Lretrofit2/RequestFactory$Builder;->gotBody:Z

    .line 1706
    .line 1707
    if-nez p4, :cond_43

    .line 1708
    .line 1709
    :try_start_0
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 1710
    .line 1711
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {p4, p2, p3, v0}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    .line 1715
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1716
    .line 1717
    iput-boolean v3, p0, Lretrofit2/RequestFactory$Builder;->gotBody:Z

    .line 1718
    .line 1719
    new-instance p3, Lretrofit2/ParameterHandler$Body;

    .line 1720
    .line 1721
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1722
    .line 1723
    .line 1724
    invoke-direct {p3, p4, p1, p2}, Lretrofit2/ParameterHandler$Body;-><init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;)V

    .line 1725
    return-object p3

    .line 1726
    :catch_0
    move-exception v0

    .line 1727
    move-object p3, v0

    .line 1728
    .line 1729
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1730
    .line 1731
    const-string v0, "Unable to create @Body converter for %s"

    .line 1732
    .line 1733
    .line 1734
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 1735
    move-result-object p2

    .line 1736
    .line 1737
    .line 1738
    invoke-static {p4, p3, p1, v0, p2}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1739
    move-result-object p1

    .line 1740
    throw p1

    .line 1741
    .line 1742
    :cond_43
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1743
    .line 1744
    const-string p3, "Multiple @Body method annotations found."

    .line 1745
    .line 1746
    new-array p4, v4, [Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1750
    move-result-object p1

    .line 1751
    throw p1

    .line 1752
    .line 1753
    :cond_44
    iget-object p2, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1754
    .line 1755
    const-string p3, "@Body parameters cannot be used with form or multi-part encoding."

    .line 1756
    .line 1757
    new-array p4, v4, [Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    invoke-static {p2, p1, p3, p4}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1761
    move-result-object p1

    .line 1762
    throw p1

    .line 1763
    .line 1764
    :cond_45
    instance-of p3, p4, Lretrofit2/http/Tag;

    .line 1765
    .line 1766
    if-eqz p3, :cond_49

    .line 1767
    .line 1768
    .line 1769
    invoke-direct {p0, p1, p2}, Lretrofit2/RequestFactory$Builder;->validateResolvableType(ILjava/lang/reflect/Type;)V

    .line 1770
    .line 1771
    .line 1772
    invoke-static {p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1773
    move-result-object p2

    .line 1774
    .line 1775
    add-int/lit8 p3, p1, -0x1

    .line 1776
    .line 1777
    :goto_1
    if-ltz p3, :cond_48

    .line 1778
    .line 1779
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 1780
    .line 1781
    aget-object p4, p4, p3

    .line 1782
    .line 1783
    instance-of v0, p4, Lretrofit2/ParameterHandler$Tag;

    .line 1784
    .line 1785
    if-eqz v0, :cond_47

    .line 1786
    .line 1787
    check-cast p4, Lretrofit2/ParameterHandler$Tag;

    .line 1788
    .line 1789
    iget-object p4, p4, Lretrofit2/ParameterHandler$Tag;->cls:Ljava/lang/Class;

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1793
    move-result p4

    .line 1794
    .line 1795
    if-nez p4, :cond_46

    .line 1796
    goto :goto_2

    .line 1797
    .line 1798
    :cond_46
    iget-object p4, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 1799
    .line 1800
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1801
    .line 1802
    .line 1803
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1804
    .line 1805
    const-string v1, "@Tag type "

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1812
    move-result-object p2

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1816
    .line 1817
    const-string p2, " is duplicate of parameter #"

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1821
    add-int/2addr p3, v3

    .line 1822
    .line 1823
    .line 1824
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1825
    .line 1826
    const-string p2, " and would always overwrite its value."

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1830
    .line 1831
    .line 1832
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1833
    move-result-object p2

    .line 1834
    .line 1835
    new-array p3, v4, [Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    invoke-static {p4, p1, p2, p3}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 1839
    move-result-object p1

    .line 1840
    throw p1

    .line 1841
    .line 1842
    :cond_47
    :goto_2
    add-int/lit8 p3, p3, -0x1

    .line 1843
    goto :goto_1

    .line 1844
    .line 1845
    :cond_48
    new-instance p1, Lretrofit2/ParameterHandler$Tag;

    .line 1846
    .line 1847
    .line 1848
    invoke-direct {p1, p2}, Lretrofit2/ParameterHandler$Tag;-><init>(Ljava/lang/Class;)V

    .line 1849
    return-object p1

    .line 1850
    :cond_49
    const/4 p1, 0x0

    .line 1851
    return-object p1
.end method

.method public static parsePathParameters(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lretrofit2/RequestFactory$Builder;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    goto :goto_0

    .line 27
    :cond_0
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
.end method

.method private validatePathName(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lretrofit2/RequestFactory$Builder;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->relativeUrlParamNames:Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    const-string v1, "URL \"%s\" does not contain \"{%s}\"."

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p1, v1, p2}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 35
    move-result-object p1

    .line 36
    throw p1

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    sget-object v1, Lretrofit2/RequestFactory$Builder;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    const-string v1, "@Path parameter name must match %s. Found: %s"

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p1, v1, p2}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 54
    move-result-object p1

    .line 55
    throw p1
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
.end method

.method private validateResolvableType(ILjava/lang/reflect/Type;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lretrofit2/Utils;->hasUnresolvableType(Ljava/lang/reflect/Type;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const-string v1, "Parameter type must not include a type variable or wildcard: %s"

    .line 12
    .line 13
    .line 14
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-static {v0, p1, v1, p2}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 19
    move-result-object p1

    .line 20
    throw p1
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
.end method


# virtual methods
.method public build()Lretrofit2/RequestFactory;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    .line 7
    :goto_0
    if-ge v3, v1, :cond_0

    .line 8
    .line 9
    aget-object v4, v0, v3

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v4}, Lretrofit2/RequestFactory$Builder;->parseMethodAnnotation(Ljava/lang/annotation/Annotation;)V

    .line 13
    .line 14
    add-int/lit8 v3, v3, 0x1

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_e

    .line 20
    .line 21
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->hasBody:Z

    .line 22
    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    const-string v1, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 37
    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 42
    move-result-object v0

    .line 43
    throw v0

    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    const-string v1, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 48
    .line 49
    new-array v2, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 53
    move-result-object v0

    .line 54
    throw v0

    .line 55
    .line 56
    :cond_3
    :goto_1
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    .line 57
    array-length v0, v0

    .line 58
    .line 59
    new-array v1, v0, [Lretrofit2/ParameterHandler;

    .line 60
    .line 61
    iput-object v1, p0, Lretrofit2/RequestFactory$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 62
    .line 63
    add-int/lit8 v1, v0, -0x1

    .line 64
    move v3, v2

    .line 65
    .line 66
    :goto_2
    if-ge v3, v0, :cond_5

    .line 67
    .line 68
    iget-object v4, p0, Lretrofit2/RequestFactory$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 69
    .line 70
    iget-object v5, p0, Lretrofit2/RequestFactory$Builder;->parameterTypes:[Ljava/lang/reflect/Type;

    .line 71
    .line 72
    aget-object v5, v5, v3

    .line 73
    .line 74
    iget-object v6, p0, Lretrofit2/RequestFactory$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    .line 75
    .line 76
    aget-object v6, v6, v3

    .line 77
    .line 78
    if-ne v3, v1, :cond_4

    .line 79
    const/4 v7, 0x1

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v7, v2

    .line 82
    .line 83
    .line 84
    :goto_3
    invoke-direct {p0, v3, v5, v6, v7}, Lretrofit2/RequestFactory$Builder;->parseParameter(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Lretrofit2/ParameterHandler;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    aput-object v5, v4, v3

    .line 88
    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    goto :goto_2

    .line 91
    .line 92
    :cond_5
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotUrl:Z

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    goto :goto_4

    .line 100
    .line 101
    :cond_6
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 102
    .line 103
    iget-object v1, p0, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    const-string v2, "Missing either @%s URL or @Url parameter."

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v2, v1}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 113
    move-result-object v0

    .line 114
    throw v0

    .line 115
    .line 116
    :cond_7
    :goto_4
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 117
    .line 118
    if-nez v0, :cond_9

    .line 119
    .line 120
    iget-boolean v1, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 121
    .line 122
    if-nez v1, :cond_9

    .line 123
    .line 124
    iget-boolean v1, p0, Lretrofit2/RequestFactory$Builder;->hasBody:Z

    .line 125
    .line 126
    if-nez v1, :cond_9

    .line 127
    .line 128
    iget-boolean v1, p0, Lretrofit2/RequestFactory$Builder;->gotBody:Z

    .line 129
    .line 130
    if-nez v1, :cond_8

    .line 131
    goto :goto_5

    .line 132
    .line 133
    :cond_8
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 134
    .line 135
    const-string v1, "Non-body HTTP method cannot contain @Body."

    .line 136
    .line 137
    new-array v2, v2, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 141
    move-result-object v0

    .line 142
    throw v0

    .line 143
    .line 144
    :cond_9
    :goto_5
    if-eqz v0, :cond_b

    .line 145
    .line 146
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotField:Z

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    goto :goto_6

    .line 150
    .line 151
    :cond_a
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 152
    .line 153
    const-string v1, "Form-encoded method must contain at least one @Field."

    .line 154
    .line 155
    new-array v2, v2, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 159
    move-result-object v0

    .line 160
    throw v0

    .line 161
    .line 162
    :cond_b
    :goto_6
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 163
    .line 164
    if-eqz v0, :cond_d

    .line 165
    .line 166
    iget-boolean v0, p0, Lretrofit2/RequestFactory$Builder;->gotPart:Z

    .line 167
    .line 168
    if-eqz v0, :cond_c

    .line 169
    goto :goto_7

    .line 170
    .line 171
    :cond_c
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 172
    .line 173
    const-string v1, "Multipart method must contain at least one @Part."

    .line 174
    .line 175
    new-array v2, v2, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 179
    move-result-object v0

    .line 180
    throw v0

    .line 181
    .line 182
    :cond_d
    :goto_7
    new-instance v0, Lretrofit2/RequestFactory;

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, p0}, Lretrofit2/RequestFactory;-><init>(Lretrofit2/RequestFactory$Builder;)V

    .line 186
    return-object v0

    .line 187
    .line 188
    :cond_e
    iget-object v0, p0, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 189
    .line 190
    const-string v1, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    .line 191
    .line 192
    new-array v2, v2, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->methodError(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 196
    move-result-object v0

    .line 197
    throw v0
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
.end method
