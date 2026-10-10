.class public final Ljx/b;
.super Landroid/os/Handler;
.source "MessageHandler.java"


# instance fields
.field public final a:Lcom/kubi/resources/widget/wheel/view/WheelView;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/wheel/view/WheelView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Ljx/b;->a:Lcom/kubi/resources/widget/wheel/view/WheelView;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    const/16 v0, 0x3e8

    .line 5
    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/16 v0, 0x7d0

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0xbb8

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Ljx/b;->a:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->m()V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Ljx/b;->a:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 24
    .line 25
    sget-object v0, Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;->FLING:Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->q(Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_2
    iget-object p1, p0, Ljx/b;->a:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 35
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
.end method
