.class public Lcom/geetest/captcha/GTCaptcha4Config$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/captcha/NoProguard;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/geetest/captcha/GTCaptcha4Config;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:[Ljava/lang/String;

.field public e:[Ljava/lang/String;

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->a:Z

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput-object v1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "file:///android_asset/gt4-index.html"

    .line 12
    .line 13
    iput-object v2, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->f:Ljava/util/Map;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    iput-boolean v2, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->g:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->h:Z

    .line 21
    .line 22
    const/16 v2, 0x2710

    .line 23
    .line 24
    iput v2, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->i:I

    .line 25
    .line 26
    iput v0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->j:I

    .line 27
    .line 28
    iput-object v1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->k:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 31
    return-void
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
.end method

.method public static synthetic access$000(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->a:Z

    .line 3
    return p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$100(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->b:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$1000(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)[Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->d:[Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$1100(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)[Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->e:[Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$200(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->c:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$300(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->f:Ljava/util/Map;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$400(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->g:Z

    .line 3
    return p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$500(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->h:Z

    .line 3
    return p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$600(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->i:I

    .line 3
    return p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$700(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->j:I

    .line 3
    return p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$800(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->k:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$900(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public build()Lcom/geetest/captcha/GTCaptcha4Config;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/captcha/GTCaptcha4Config;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Lcom/geetest/captcha/GTCaptcha4Config;-><init>(Lcom/geetest/captcha/GTCaptcha4Config$Builder;Lcom/geetest/captcha/GTCaptcha4Config$a;)V

    .line 7
    return-object v0
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
.end method

.method public setApiServers([Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->d:[Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBackgroundColor(I)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->j:I

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setCanceledOnTouchOutside(Z)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->g:Z

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setDebug(Z)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->a:Z

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setDialogShowListener(Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setDialogStyle(Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->k:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setGTC4ViewHidden(Z)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->h:Z

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setLanguage(Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->b:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setParams(Ljava/util/Map;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/geetest/captcha/GTCaptcha4Config$Builder;"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->f:Ljava/util/Map;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setResourcePath(Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->c:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setStaticServers([Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->e:[Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setTimeOut(I)Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->i:I

    .line 3
    return-object p0
    .line 4
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
