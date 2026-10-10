.class public Lcom/ishumei/smantifraud/IServiceImp;
.super Landroid/app/Service;


# instance fields
.field l1111l111111Il:Z

.field l111l11111I1l:Z

.field private final l111l11111Il:Lcom/ishumei/smantifraud/IService$l1111l111111Il;

.field l111l11111lIl:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/ishumei/smantifraud/IServiceImp$1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/ishumei/smantifraud/IServiceImp$1;-><init>(Lcom/ishumei/smantifraud/IServiceImp;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/ishumei/smantifraud/IServiceImp;->l111l11111Il:Lcom/ishumei/smantifraud/IService$l1111l111111Il;

    .line 11
    return-void
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
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Ljava/io/File;

    .line 3
    .line 4
    const-string v0, "/dev/gmt/files"

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 11
    move-result p1

    .line 12
    .line 13
    iput-boolean p1, p0, Lcom/ishumei/smantifraud/IServiceImp;->l111l11111lIl:Z

    .line 14
    .line 15
    new-instance p1, Ljava/io/File;

    .line 16
    .line 17
    const-string v0, "/dev/gmt/files/boot_id"

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 24
    move-result p1

    .line 25
    .line 26
    iput-boolean p1, p0, Lcom/ishumei/smantifraud/IServiceImp;->l111l11111I1l:Z

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/ishumei/smantifraud/dfp/SMSDK;->ma()Z

    .line 30
    move-result p1

    .line 31
    .line 32
    iput-boolean p1, p0, Lcom/ishumei/smantifraud/IServiceImp;->l1111l111111Il:Z

    .line 33
    .line 34
    iget-object p1, p0, Lcom/ishumei/smantifraud/IServiceImp;->l111l11111Il:Lcom/ishumei/smantifraud/IService$l1111l111111Il;

    .line 35
    return-object p1
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
.end method
