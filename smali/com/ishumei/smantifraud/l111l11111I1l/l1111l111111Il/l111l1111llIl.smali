.class public Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;
.super Ljava/lang/Object;


# static fields
.field private static final l1111l111111Il:J = 0x7d0L

.field private static l111l11111Il:Z = false

.field private static l111l1111l1Il:Z = false

.field private static l111l1111lI1l:Ljava/lang/String; = "hy_timeh"

.field private static l111l1111lIl:Ljava/lang/String; = "android"

.field private static l111l1111llIl:Ljava/lang/String; = "3.7.3"

.field private static final l11l1111I11l:Ljava/lang/String; = "fp-it.fengkongcloud.com"

.field private static final l11l1111I1l:Ljava/lang/String; = "api-fp-retry-bj.fengkongcloud.com"

.field private static final l11l1111I1ll:Ljava/lang/String; = "fp-sa-it.fengkongcloud.com"

.field private static final l11l1111Il:Ljava/lang/String; = "api-fp-retry-sa.fengkongcloud.com"

.field private static final l11l1111Il1l:Ljava/lang/String; = "fp-na-it-acc.fengkongcloud.com"

.field private static final l11l1111Ill:Ljava/lang/String; = "api-fp-retry-na.fengkongcloud.com"

.field private static l11l1111lIIl:I = 0x1e

.field private static final l11l111l11Il:Ljava/lang/String; = "/v3/cloudconf"

.field private static final l11l11IlIIll:Ljava/lang/String; = "/deviceprofile/v4"


# instance fields
.field private l111l11111I1l:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;

.field private final l111l11111lIl:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    if-eqz p1, :cond_b

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l1111l111111Il;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l1111l111111Il;-><init>(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_0
    const-string v1, "huawei"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "honor"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string v1, "lenovo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111I1l;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111I1l;-><init>(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_2
    const-string v1, "meizu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111Il;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111Il;-><init>(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_3
    const-string v1, "nubia"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111l1Il;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111l1Il;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_4
    const-string v1, "oneplus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lIl;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lIl;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_5
    const-string v1, "oppo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111lIIl;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111lIIl;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_6
    const-string v1, "samsung"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I11l;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I11l;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_7
    const-string/jumbo v1, "vivo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1l;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1l;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_8
    const-string/jumbo v1, "xiaomi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1ll;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1ll;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_9
    const-string/jumbo v1, "zte"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111Il;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111Il;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_a
    :goto_0
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_b
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;

    return-void
.end method

.method public static l1111l111111Il(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
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
    const-string/jumbo v1, "xjp"

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

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

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

    .line 4
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
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

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
    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

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

.method private static l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "xjp"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    const-string v0, "fjny"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    move-result p0

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-string p0, "api-fp-retry-bj.fengkongcloud.com"

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_0
    const-string p0, "fp-it.fengkongcloud.com"

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_1
    if-eqz p1, :cond_2

    .line 31
    .line 32
    const-string p0, "api-fp-retry-na.fengkongcloud.com"

    .line 33
    return-object p0

    .line 34
    .line 35
    :cond_2
    const-string p0, "fp-na-it-acc.fengkongcloud.com"

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_3
    if-eqz p1, :cond_4

    .line 39
    .line 40
    const-string p0, "api-fp-retry-sa.fengkongcloud.com"

    .line 41
    return-object p0

    .line 42
    .line 43
    :cond_4
    const-string p0, "fp-sa-it.fengkongcloud.com"

    .line 44
    return-object p0
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

.method private l111l11111lIl()Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "asus"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l1111l111111Il;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l1111l111111Il;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_1
    const-string v2, "huawei"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    const-string v2, "honor"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v2, "lenovo"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111I1l;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111I1l;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_3
    const-string v2, "meizu"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111Il;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111Il;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_4
    const-string v2, "nubia"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111l1Il;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111l1Il;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_5
    const-string v2, "oneplus"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lIl;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lIl;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_6
    const-string v2, "oppo"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111lIIl;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111lIIl;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_7
    const-string v2, "samsung"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I11l;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I11l;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_8
    const-string/jumbo v2, "vivo"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1l;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1l;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_9
    const-string/jumbo v2, "xiaomi"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1ll;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111I1ll;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_a
    const-string/jumbo v2, "zte"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111Il;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l11l1111Il;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_b
    return-object v1

    :cond_c
    :goto_0
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111lIl:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static l111l11111lIl(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l1111l111111Il(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111Il(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/deviceprofile/v4"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final l1111l111111Il()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
