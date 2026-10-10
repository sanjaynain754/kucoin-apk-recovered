.class Lcom/hcaptcha/sdk/HCaptcha$1;
.super Lcom/hcaptcha/sdk/HCaptchaStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hcaptcha/sdk/HCaptcha;->r(Lcom/hcaptcha/sdk/HCaptchaConfig;)Lcom/hcaptcha/sdk/HCaptcha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hcaptcha/sdk/HCaptcha;

.field final synthetic val$inputConfig:Lcom/hcaptcha/sdk/HCaptchaConfig;


# direct methods
.method public constructor <init>(Lcom/hcaptcha/sdk/HCaptcha;Lcom/hcaptcha/sdk/HCaptchaConfig;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->this$0:Lcom/hcaptcha/sdk/HCaptcha;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->val$inputConfig:Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/hcaptcha/sdk/HCaptchaStateListener;-><init>()V

    .line 8
    return-void
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
    .line 46
    .line 47
.end method


# virtual methods
.method public onFailure(Lcom/hcaptcha/sdk/HCaptchaException;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->this$0:Lcom/hcaptcha/sdk/HCaptcha;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/hcaptcha/sdk/HCaptcha;->p(Lcom/hcaptcha/sdk/HCaptcha;Lcom/hcaptcha/sdk/HCaptchaException;)V

    .line 6
    return-void
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
    .line 24
.end method

.method public onOpen()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->this$0:Lcom/hcaptcha/sdk/HCaptcha;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/hcaptcha/sdk/HCaptcha;->l(Lcom/hcaptcha/sdk/HCaptcha;)V

    .line 6
    return-void
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

.method public onSuccess(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->this$0:Lcom/hcaptcha/sdk/HCaptcha;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->val$inputConfig:Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTokenExpiration()J

    .line 8
    move-result-wide v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/hcaptcha/sdk/HCaptcha;->m(Lcom/hcaptcha/sdk/HCaptcha;J)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptcha$1;->this$0:Lcom/hcaptcha/sdk/HCaptcha;

    .line 14
    .line 15
    new-instance v1, Lcom/hcaptcha/sdk/l;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/hcaptcha/sdk/HCaptcha;->n(Lcom/hcaptcha/sdk/HCaptcha;)Landroid/os/Handler;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1, v2}, Lcom/hcaptcha/sdk/l;-><init>(Ljava/lang/String;Landroid/os/Handler;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/hcaptcha/sdk/HCaptcha;->o(Lcom/hcaptcha/sdk/HCaptcha;Ljava/lang/Object;)V

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
.end method
