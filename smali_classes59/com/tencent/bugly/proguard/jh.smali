.class public Lcom/tencent/bugly/proguard/jh;
.super Ljava/lang/Object;
.source "BUGLY"


# direct methods
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
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "front_end"

    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    const-string p0, "back_end"

    .line 12
    return-object p0

    .line 13
    .line 14
    .line 15
    :cond_1
    const-string/jumbo p0, "unknown"

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p0, v0, :cond_2

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    .line 12
    const-string/jumbo p0, "unknown"

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_0
    const-string p0, "disconnect"

    .line 16
    return-object p0

    .line 17
    .line 18
    .line 19
    :cond_1
    const-string/jumbo p0, "mobile"

    .line 20
    return-object p0

    .line 21
    .line 22
    .line 23
    :cond_2
    const-string/jumbo p0, "wifi"

    .line 24
    return-object p0
    .line 25
.end method
