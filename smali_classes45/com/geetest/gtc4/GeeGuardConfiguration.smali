.class public Lcom/geetest/gtc4/GeeGuardConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:I

.field public final g:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$000(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$100(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->b:Z

    .line 5
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$200(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->c:Z

    .line 6
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$300(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->d:Ljava/util/HashMap;

    .line 7
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$400(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->e:Ljava/util/HashMap;

    .line 8
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$500(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)I

    move-result v0

    iput v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->f:I

    .line 9
    invoke-static {p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->access$600(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;Lcom/geetest/gtc4/q3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/GeeGuardConfiguration;-><init>(Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;)V

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->a:Ljava/lang/String;

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

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->g:Ljava/lang/String;

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

.method public getExtraInfo()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->e:Ljava/util/HashMap;

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

.method public getLevel()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->f:I

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

.method public getOuterInfo()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->d:Ljava/util/HashMap;

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

.method public isAlInfo()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->b:Z

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

.method public isDevInfo()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/gtc4/GeeGuardConfiguration;->c:Z

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
