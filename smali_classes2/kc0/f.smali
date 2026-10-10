.class public Lkc0/f;
.super Ljava/lang/Object;
.source "LogItem.java"


# instance fields
.field public a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/tencentcloudapi/cls/android/cls/Cls$Log;->newBuilder()Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    move-result-object v0

    iput-object v0, p0, Lkc0/f;->a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    .line 3
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;->c(J)Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {}, Lcom/tencentcloudapi/cls/android/cls/Cls$Log;->newBuilder()Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    move-result-object v0

    iput-object v0, p0, Lkc0/f;->a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    .line 6
    invoke-virtual {v0, p1, p2}, Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;->c(J)Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    return-void
.end method


# virtual methods
.method public a(Lkc0/e;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkc0/f;->a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    .line 3
    .line 4
    iget-object p1, p1, Lkc0/e;->a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$Content$a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;->a(Lcom/tencentcloudapi/cls/android/cls/Cls$Log$Content$a;)Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

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
.end method
