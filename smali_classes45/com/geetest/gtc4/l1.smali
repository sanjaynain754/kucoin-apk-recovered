.class public Lcom/geetest/gtc4/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/f;
.implements Lcom/geetest/gtc4/i5;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/geetest/gtc4/c0;


# direct methods
.method public constructor <init>(IILcom/geetest/gtc4/c0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/geetest/gtc4/l1;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/geetest/gtc4/l1;->b:I

    .line 8
    .line 9
    iput-object p3, p0, Lcom/geetest/gtc4/l1;->c:Lcom/geetest/gtc4/c0;

    .line 10
    return-void
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
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method


# virtual methods
.method public b()Lcom/geetest/gtc4/w;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/l1;->c:Lcom/geetest/gtc4/c0;

    .line 3
    .line 4
    iget v1, p0, Lcom/geetest/gtc4/l1;->a:I

    .line 5
    .line 6
    iget v2, p0, Lcom/geetest/gtc4/l1;->b:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/geetest/gtc4/c0;->a(II)Lcom/geetest/gtc4/k1;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final d()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/geetest/gtc4/l1;->b()Lcom/geetest/gtc4/w;

    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    .line 8
    new-instance v1, Lcom/geetest/gtc4/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/v;-><init>(Ljava/lang/String;)V

    .line 16
    throw v1
    .line 17
    .line 18
.end method
