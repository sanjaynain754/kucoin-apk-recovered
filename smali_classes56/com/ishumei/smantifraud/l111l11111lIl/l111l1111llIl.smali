.class public final Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;
.super Ljava/lang/Object;


# static fields
.field private static l1111l111111Il:Z = false

.field private static l111l11111I1l:Ljava/lang/String; = "3.7.3"

.field private static l111l11111Il:Ljava/lang/String; = "hy_timeh"

.field private static l111l11111lIl:Z = false

.field private static l111l1111l1Il:Ljava/lang/String; = "android"

.field private static final l111l1111lI1l:Ljava/lang/String; = "fp-it.fengkongcloud.com"

.field private static final l111l1111lIl:Ljava/lang/String; = "api-fp-retry-bj.fengkongcloud.com"

.field private static l111l1111llIl:I = 0x1e

.field private static final l11l1111I11l:Ljava/lang/String; = "api-fp-retry-sa.fengkongcloud.com"

.field private static final l11l1111I1l:Ljava/lang/String; = "fp-na-it-acc.fengkongcloud.com"

.field private static final l11l1111I1ll:Ljava/lang/String; = "api-fp-retry-na.fengkongcloud.com"

.field private static final l11l1111Il:Ljava/lang/String; = "/deviceprofile/v4"

.field private static final l11l1111Il1l:Ljava/lang/String; = "/v3/cloudconf"

.field private static final l11l1111lIIl:Ljava/lang/String; = "fp-sa-it.fengkongcloud.com"


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
.end method

.method public static l1111l111111Il(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "fjny"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "xjp"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "bj"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    const-string p0, "011"

    return-object p0

    :pswitch_1
    const-string p0, "010"

    return-object p0

    :pswitch_2
    const-string p0, "001"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0xc48 -> :sswitch_2
        0x1cfbe -> :sswitch_1
        0x2ff98f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static l1111l111111Il(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/deviceprofile/v4"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Z)Ljava/lang/String;
    .locals 0

    .line 3
    if-eqz p0, :cond_0

    const-string p0, "https://"

    return-object p0

    :cond_0
    const-string p0, "http://"

    return-object p0
.end method

.method public static l111l11111I1l(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string p0, "/v3/cloudconf"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p0

    .line 30
    return-object p0
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
.end method

.method private static l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "xjp"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    const-string v0, "fjny"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result p0

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const-string p0, "api-fp-retry-bj.fengkongcloud.com"

    .line 24
    return-object p0

    .line 25
    .line 26
    :cond_0
    const-string p0, "fp-it.fengkongcloud.com"

    .line 27
    return-object p0

    .line 28
    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const-string p0, "api-fp-retry-na.fengkongcloud.com"

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_2
    const-string p0, "fp-na-it-acc.fengkongcloud.com"

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_3
    if-eqz p1, :cond_4

    .line 38
    .line 39
    const-string p0, "api-fp-retry-sa.fengkongcloud.com"

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_4
    const-string p0, "fp-sa-it.fengkongcloud.com"

    .line 43
    return-object p0
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static l111l11111lIl(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string p0, "/deviceprofile/v4"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p0

    .line 30
    return-object p0
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
.end method
