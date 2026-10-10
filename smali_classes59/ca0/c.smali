.class public Lca0/c;
.super Ljava/lang/Object;
.source "DefaultAudioStretcher.java"

# interfaces
.implements Lca0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V
    .locals 2
    .param p1    # Ljava/nio/ShortBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ShortBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lca0/a;->c:Lca0/a;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lca0/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 24
    move-result v1

    .line 25
    .line 26
    if-le v0, v1, :cond_1

    .line 27
    .line 28
    sget-object v0, Lca0/a;->b:Lca0/a;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, p2, p3}, Lca0/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_1
    sget-object v0, Lca0/a;->a:Lca0/a;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p1, p2, p3}, Lca0/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    .line 38
    return-void
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
.end method
