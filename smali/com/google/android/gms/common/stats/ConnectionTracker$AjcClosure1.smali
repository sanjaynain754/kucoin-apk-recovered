.class public Lcom/google/android/gms/common/stats/ConnectionTracker$AjcClosure1;
.super Lorg/aspectj/runtime/internal/a;
.source "com.google.android.gms:play-services-basement@@18.5.0"


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/aspectj/runtime/internal/a;-><init>([Ljava/lang/Object;)V

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
.end method


# virtual methods
.method public run([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    iget-object p1, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget-object v0, p1, v0

    .line 6
    move-object v1, v0

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/gms/common/stats/ConnectionTracker;

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    aget-object v0, p1, v0

    .line 12
    move-object v2, v0

    .line 13
    .line 14
    check-cast v2, Landroid/content/Context;

    .line 15
    const/4 v0, 0x2

    .line 16
    .line 17
    aget-object v0, p1, v0

    .line 18
    move-object v3, v0

    .line 19
    .line 20
    check-cast v3, Landroid/content/Intent;

    .line 21
    const/4 v0, 0x3

    .line 22
    .line 23
    aget-object v0, p1, v0

    .line 24
    move-object v4, v0

    .line 25
    .line 26
    check-cast v4, Landroid/content/ServiceConnection;

    .line 27
    const/4 v0, 0x4

    .line 28
    .line 29
    aget-object v0, p1, v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lorg/aspectj/runtime/internal/b;->d(Ljava/lang/Object;)I

    .line 33
    move-result v5

    .line 34
    const/4 v0, 0x5

    .line 35
    .line 36
    aget-object p1, p1, v0

    .line 37
    move-object v6, p1

    .line 38
    .line 39
    check-cast v6, Lorg/aspectj/lang/a;

    .line 40
    .line 41
    .line 42
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/common/stats/ConnectionTracker;->bindService_aroundBody0(Lcom/google/android/gms/common/stats/ConnectionTracker;Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;ILorg/aspectj/lang/a;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lorg/aspectj/runtime/internal/b;->a(Z)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    return-object p1
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
