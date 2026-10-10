.class public Lcom/tencent/bugly/proguard/a2;
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

.method public static a(I)V
    .locals 0

    .line 11
    invoke-static {p0}, Lcom/tencent/bugly/proguard/eb;->a(I)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    .line 1
    const-string p0, ""

    :cond_0
    if-nez p1, :cond_1

    .line 2
    const-string/jumbo p1, "null"

    .line 3
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v0, :cond_2

    .line 4
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_2
    const-string v0, "D"

    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/eb;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    if-nez p0, :cond_0

    .line 6
    const-string p0, ""

    :cond_0
    if-nez p1, :cond_1

    .line 7
    const-string/jumbo p1, "null"

    .line 8
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v0, :cond_2

    .line 9
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    :cond_2
    const-string p1, "E"

    invoke-static {p1, p0, p2}, Lcom/tencent/bugly/proguard/eb;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, ""

    .line 5
    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "null"

    .line 10
    .line 11
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    :cond_2
    const-string v0, "E"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/eb;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-void
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
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, ""

    .line 5
    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "null"

    .line 10
    .line 11
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    :cond_2
    const-string v0, "I"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/eb;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-void
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
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, ""

    .line 5
    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "null"

    .line 10
    .line 11
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    :cond_2
    const-string v0, "V"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/eb;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-void
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
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, ""

    .line 5
    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "null"

    .line 10
    .line 11
    :cond_1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    :cond_2
    const-string v0, "W"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/eb;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-void
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
.end method
