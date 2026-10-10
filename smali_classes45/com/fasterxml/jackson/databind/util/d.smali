.class public Lcom/fasterxml/jackson/databind/util/d;
.super Ljava/lang/Object;
.source "BeanUtil.java"


# direct methods
.method public static a(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/d;->c(Ljava/lang/String;)Z

    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x2e

    .line 18
    .line 19
    const/16 v3, 0xa

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->indexOf(II)I

    .line 23
    move-result v0

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    return-object v2

    .line 27
    .line 28
    :cond_0
    const-string v0, "Java 8 date/time"

    .line 29
    .line 30
    const-string v1, "com.fasterxml.jackson.datatype:jackson-datatype-jsr310"

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/d;->d(Ljava/lang/String;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string v0, "Joda date/time"

    .line 40
    .line 41
    const-string v1, "com.fasterxml.jackson.datatype:jackson-datatype-joda"

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/g;->G(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    const-string v0, "%s type %s not supported by default: add Module \"%s\" to enable handling"

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    return-object v2
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

.method public static b(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/g;->b0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/fasterxml/jackson/databind/util/g;->m(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->isContainerType()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_5

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ll7/a;->isReferenceType()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    const-class v1, Ljava/lang/String;

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    const-string p0, ""

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_2
    const-class v0, Ljava/util/Date;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JavaType;->isTypeOrSubTypeOf(Ljava/lang/Class;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    const-wide/16 v1, 0x0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    new-instance p0, Ljava/util/Date;

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 51
    return-object p0

    .line 52
    .line 53
    :cond_3
    const-class v0, Ljava/util/Calendar;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JavaType;->isTypeOrSubTypeOf(Ljava/lang/Class;)Z

    .line 57
    move-result p0

    .line 58
    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    new-instance p0, Ljava/util/GregorianCalendar;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 68
    return-object p0

    .line 69
    :cond_4
    const/4 p0, 0x0

    .line 70
    return-object p0

    .line 71
    .line 72
    :cond_5
    :goto_0
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 73
    return-object p0
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "java.time."

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "org.joda.time."

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    move-result p0

    .line 7
    return p0
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
.end method
