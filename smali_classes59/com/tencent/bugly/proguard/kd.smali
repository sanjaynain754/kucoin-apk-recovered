.class public Lcom/tencent/bugly/proguard/kd;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "NetWorkUtil"

.field public static final b:Ljava/lang/String; = "127\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}"

.field public static final c:Ljava/lang/String; = "10\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}"

.field public static final d:Ljava/lang/String; = "172\\.(?:1[6-9]|2[0-9]|3[0-1])\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}"

.field public static final e:Ljava/lang/String; = "192\\.168\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}"

.field public static final f:Ljava/lang/String; = "169\\.254\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}"

.field public static final g:Ljava/lang/String; = "::1"

.field public static final h:Ljava/lang/String; = "fe80:(?::[0-9a-fA-F]{0,4}){0,7}"

.field public static final i:Ljava/lang/String; = "fc[0-9a-fA-F]{2}:(?::[0-9a-fA-F]{0,4}){0,7}"

.field public static final j:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "^(127\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}|10\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}|172\\.(?:1[6-9]|2[0-9]|3[0-1])\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|192\\.168\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|169\\.254\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|::1|fe80:(?::[0-9a-fA-F]{0,4}){0,7}|fc[0-9a-fA-F]{2}:(?::[0-9a-fA-F]{0,4}){0,7})$"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/proguard/kd;->j:Ljava/util/regex/Pattern;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/kd;->j:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    const-string v1, "NetWorkUtil"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method
