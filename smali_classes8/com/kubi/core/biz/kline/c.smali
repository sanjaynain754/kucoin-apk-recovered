.class public final Lcom/kubi/core/biz/kline/c;
.super Ljava/lang/Object;
.source "KLineNftToggleMenuExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "updateToggleWhenExpandKLineChart",
        "",
        "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;",
        "updateToggleWhenCloseKLineChart",
        "updateToggleWhenExpandNftChart",
        "updateToggleWhenCloseNftChart",
        "updateToggleWhenResetChart",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)V
    .locals 3
    .param p0    # Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->e()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    instance-of v1, v0, Lxo/c;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lxo/c;

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v2

    .line 25
    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lxo/c;->n1()Landroid/view/View;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    instance-of v1, v0, Lxo/c;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    move-object v2, v0

    .line 45
    .line 46
    check-cast v2, Lxo/c;

    .line 47
    .line 48
    :cond_2
    if-eqz v2, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Lxo/c;->M2()Landroid/view/View;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Lcom/kubi/core/biz/kline/b;->g(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Laf/a;->d(Landroid/view/View;Z)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->h()Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object v0, v0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->k(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 81
    move-result p0

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p0}, Laf/a;->d(Landroid/view/View;Z)V

    .line 85
    :cond_4
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
.end method

.method public static final b(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)V
    .locals 2
    .param p0    # Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->e()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Laf/a;->d(Landroid/view/View;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->h()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1}, Laf/a;->d(Landroid/view/View;Z)V

    .line 45
    :cond_1
    return-void
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
.end method

.method public static final c(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)V
    .locals 4
    .param p0    # Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->e()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    instance-of v2, v0, Lxo/c;

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    check-cast v0, Lxo/c;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v3

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lxo/c;->n1()Landroid/view/View;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    instance-of v2, v0, Lxo/c;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    move-object v3, v0

    .line 46
    .line 47
    check-cast v3, Lxo/c;

    .line 48
    .line 49
    :cond_2
    if-eqz v3, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-interface {v3}, Lxo/c;->M2()Landroid/view/View;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Laf/a;->d(Landroid/view/View;Z)V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->h()Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 68
    move-result-object p0

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget-object p0, p0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v1}, Laf/a;->d(Landroid/view/View;Z)V

    .line 78
    :cond_4
    return-void
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
.end method

.method public static final d(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)V
    .locals 1
    .param p0    # Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Laf/a;->d(Landroid/view/View;Z)V

    .line 20
    :cond_0
    return-void
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
.end method

.method public static final e(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)V
    .locals 3
    .param p0    # Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->e()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/kubi/core/biz/kline/b;->g(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lv30/b0;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->i(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->k(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 49
    move-result v2

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2}, Laf/a;->d(Landroid/view/View;Z)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    instance-of v2, v0, Lxo/c;

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    check-cast v0, Lxo/c;

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v0, v1

    .line 65
    .line 66
    :goto_0
    if-eqz v0, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lxo/c;->n1()Landroid/view/View;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    instance-of v2, v0, Lxo/c;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    move-object v1, v0

    .line 85
    .line 86
    check-cast v1, Lxo/c;

    .line 87
    .line 88
    :cond_4
    if-eqz v1, :cond_d

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Lxo/c;->M2()Landroid/view/View;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_d

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Lcom/kubi/core/biz/kline/b;->g(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 98
    move-result p0

    .line 99
    .line 100
    .line 101
    invoke-static {v0, p0}, Laf/a;->d(Landroid/view/View;Z)V

    .line 102
    return-void

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-static {}, Lcom/kubi/core/biz/kline/b;->h()Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_9

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, Lcom/kubi/core/biz/kline/b;->g(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 112
    move-result v0

    .line 113
    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    iget-object v0, v0, Lv30/b0;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->i(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Ljava/lang/String;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    if-eqz v0, :cond_7

    .line 138
    .line 139
    iget-object v0, v0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->k(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 145
    move-result v2

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v2}, Laf/a;->d(Landroid/view/View;Z)V

    .line 149
    .line 150
    .line 151
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 152
    move-result-object p0

    .line 153
    .line 154
    instance-of v0, p0, Lxo/c;

    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    move-object v1, p0

    .line 158
    .line 159
    check-cast v1, Lxo/c;

    .line 160
    .line 161
    :cond_8
    if-eqz v1, :cond_d

    .line 162
    .line 163
    .line 164
    invoke-interface {v1}, Lxo/c;->n1()Landroid/view/View;

    .line 165
    move-result-object p0

    .line 166
    .line 167
    if-eqz p0, :cond_d

    .line 168
    .line 169
    .line 170
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 171
    return-void

    .line 172
    .line 173
    .line 174
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    iget-object v0, v0, Lv30/b0;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 180
    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    .line 184
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->i(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Ljava/lang/String;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;->Q3()Lv30/b0;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    iget-object v0, v0, Lv30/b0;->e:Landroid/widget/RelativeLayout;

    .line 197
    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    .line 201
    invoke-static {p0}, Lcom/kubi/core/biz/kline/w;->k(Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;)Z

    .line 202
    move-result v2

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v2}, Laf/a;->d(Landroid/view/View;Z)V

    .line 206
    .line 207
    .line 208
    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 209
    move-result-object p0

    .line 210
    .line 211
    instance-of v0, p0, Lxo/c;

    .line 212
    .line 213
    if-eqz v0, :cond_c

    .line 214
    move-object v1, p0

    .line 215
    .line 216
    check-cast v1, Lxo/c;

    .line 217
    .line 218
    :cond_c
    if-eqz v1, :cond_d

    .line 219
    .line 220
    .line 221
    invoke-interface {v1}, Lxo/c;->n1()Landroid/view/View;

    .line 222
    move-result-object p0

    .line 223
    .line 224
    if-eqz p0, :cond_d

    .line 225
    .line 226
    .line 227
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 228
    :cond_d
    return-void
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
.end method
