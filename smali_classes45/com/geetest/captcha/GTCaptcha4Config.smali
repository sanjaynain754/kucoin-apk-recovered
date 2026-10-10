.class public Lcom/geetest/captcha/GTCaptcha4Config;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/captcha/NoProguard;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/captcha/GTCaptcha4Config$Builder;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:[Ljava/lang/String;

.field public final e:[Ljava/lang/String;

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;


# direct methods
.method private constructor <init>(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$000(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->a:Z

    .line 4
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$100(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->b:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$200(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->c:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$300(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->f:Ljava/util/Map;

    .line 7
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$400(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->g:Z

    .line 8
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$500(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->h:Z

    .line 9
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$600(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)I

    move-result v0

    iput v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->i:I

    .line 10
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$700(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)I

    move-result v0

    iput v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->j:I

    .line 11
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$800(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->k:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$900(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 13
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$1000(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->d:[Ljava/lang/String;

    .line 14
    invoke-static {p1}, Lcom/geetest/captcha/GTCaptcha4Config$Builder;->access$1100(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/geetest/captcha/GTCaptcha4Config;->e:[Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/geetest/captcha/GTCaptcha4Config$Builder;Lcom/geetest/captcha/GTCaptcha4Config$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/geetest/captcha/GTCaptcha4Config;-><init>(Lcom/geetest/captcha/GTCaptcha4Config$Builder;)V

    return-void
.end method


# virtual methods
.method public getApiServers()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->d:[Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->j:I

    .line 3
    return v0
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
.end method

.method public getDialogShowListener()Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->l:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 3
    return-object v0
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
.end method

.method public getDialogStyle()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->k:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getHtml()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->c:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->b:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->f:Ljava/util/Map;

    .line 3
    return-object v0
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
.end method

.method public getStaticServers()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->e:[Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getTimeOut()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->i:I

    .line 3
    return v0
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
.end method

.method public isCanceledOnTouchOutside()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->g:Z

    .line 3
    return v0
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
.end method

.method public isDebug()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->a:Z

    .line 3
    return v0
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
.end method

.method public isGTC4ViewHidden()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/captcha/GTCaptcha4Config;->h:Z

    .line 3
    return v0
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
.end method
