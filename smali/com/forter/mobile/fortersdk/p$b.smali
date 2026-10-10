.class public final Lcom/forter/mobile/fortersdk/p$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/forter/mobile/fortersdk/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/forter/mobile/fortersdk/as;

.field public final synthetic b:Lcom/forter/mobile/fortersdk/p;


# direct methods
.method public constructor <init>(Lcom/forter/mobile/fortersdk/p;Lcom/forter/mobile/fortersdk/as;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/p$b;->b:Lcom/forter/mobile/fortersdk/p;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/forter/mobile/fortersdk/p$b;->a:Lcom/forter/mobile/fortersdk/as;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Ljava/net/HttpURLConnection;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p$b;->b:Lcom/forter/mobile/fortersdk/p;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/p$b;->a:Lcom/forter/mobile/fortersdk/as;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/forter/mobile/fortersdk/p;->e()Z

    .line 8
    .line 9
    iget-object v2, v0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lt7/a;->q()F

    .line 13
    move-result v2

    .line 14
    .line 15
    iget-object v3, v0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Lt7/a;->n()I

    .line 19
    move-result v3

    .line 20
    .line 21
    iget-object v4, v1, Lcom/forter/mobile/fortersdk/as;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 25
    move-result v4

    .line 26
    .line 27
    iget v5, v1, Lcom/forter/mobile/fortersdk/as;->b:F

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    int-to-float v5, v3

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    if-lez v4, :cond_1

    .line 34
    mul-float/2addr v2, v5

    .line 35
    add-float/2addr v5, v2

    .line 36
    .line 37
    :cond_1
    :goto_0
    iput v5, v1, Lcom/forter/mobile/fortersdk/as;->b:F

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 45
    .line 46
    iget-object p1, v0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lt7/a;->o()I

    .line 50
    move-result p1

    .line 51
    .line 52
    if-le v4, p1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->a()V

    .line 56
    :cond_2
    return-void
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
