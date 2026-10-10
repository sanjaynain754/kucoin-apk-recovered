.class public Lcom/kubi/assets/view/ScannerEditText;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "ScannerEditText.java"


# instance fields
.field public n:Lta/m5;

.field public final o:Ljava/lang/String;

.field public final p:I

.field public q:Landroid/view/View$OnClickListener;

.field public r:Lio/reactivex/functions/Action;

.field public s:Z

.field public t:Lcom/kubi/resources/widget/round/widget/RoundTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/assets/view/ScannerEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/assets/view/ScannerEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-object p3, p0, Lcom/kubi/assets/view/ScannerEditText;->q:Landroid/view/View$OnClickListener;

    const/4 p3, 0x1

    .line 5
    iput-boolean p3, p0, Lcom/kubi/assets/view/ScannerEditText;->s:Z

    .line 6
    sget-object p3, Lcom/kubi/assets/R$styleable;->kucoin_ScannerEditText:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 7
    sget p3, Lcom/kubi/assets/R$styleable;->kucoin_ScannerEditText_kucoin_hint:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/kubi/assets/view/ScannerEditText;->o:Ljava/lang/String;

    .line 8
    sget p3, Lcom/kubi/assets/R$styleable;->kucoin_ScannerEditText_kucoin_hint_color:I

    sget v0, Lcom/kubi/assets/R$color;->emphasis:I

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/kubi/assets/view/ScannerEditText;->p:I

    .line 9
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    invoke-direct {p0}, Lcom/kubi/assets/view/ScannerEditText;->i()V

    return-void
.end method

.method public static synthetic a(Lcom/kubi/assets/view/ScannerEditText;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    .line 4
    iget-object p0, p0, Lta/m5;->e:Landroid/widget/EditText;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    .line 12
    return-void
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
.end method

.method public static synthetic b(Lcom/kubi/assets/view/ScannerEditText;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/assets/view/ScannerEditText;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
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
.end method

.method public static synthetic c(Lcom/kubi/assets/view/ScannerEditText;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/view/ScannerEditText;->j()V

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
.end method

.method public static synthetic d(Lcom/kubi/assets/view/ScannerEditText;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    .line 4
    iget-object p0, p0, Lta/m5;->e:Landroid/widget/EditText;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

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
.end method

.method public static synthetic e(Lcom/kubi/assets/view/ScannerEditText;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/kubi/utils/k;->e()Ljava/lang/CharSequence;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/kubi/assets/view/ScannerEditText;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :cond_0
    return-void
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
.end method

.method public static synthetic f(Lcom/kubi/assets/view/ScannerEditText;)Lta/m5;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    return-object p0
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
.end method

.method public static synthetic g(Lcom/kubi/assets/view/ScannerEditText;)Lcom/kubi/resources/widget/round/widget/RoundTextView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 3
    return-object p0
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
.end method

.method public static synthetic h(Lcom/kubi/assets/view/ScannerEditText;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/assets/view/ScannerEditText;->s:Z

    .line 3
    return p0
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
.end method

.method private i()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lta/m5;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lta/m5;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 24
    .line 25
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/kubi/assets/view/ScannerEditText;->o:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 33
    .line 34
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 35
    .line 36
    iget v1, p0, Lcom/kubi/assets/view/ScannerEditText;->p:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 42
    .line 43
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 47
    .line 48
    sget v0, Lcom/kubi/assets/R$drawable;->asset_edittext_background_with_emphasis3_4:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 54
    .line 55
    iget-object v0, v0, Lta/m5;->c:Landroid/widget/ImageButton;

    .line 56
    .line 57
    new-instance v1, Lcom/kubi/assets/view/u0;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p0}, Lcom/kubi/assets/view/u0;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 66
    .line 67
    iget-object v0, v0, Lta/m5;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 68
    .line 69
    new-instance v1, Lcom/kubi/assets/view/v0;

    .line 70
    .line 71
    .line 72
    invoke-direct {v1, p0}, Lcom/kubi/assets/view/v0;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 78
    .line 79
    iget-object v0, v0, Lta/m5;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    new-instance v1, Lcom/kubi/assets/view/w0;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, p0}, Lcom/kubi/assets/view/w0;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 90
    .line 91
    iget-object v0, v0, Lta/m5;->b:Landroid/widget/ImageButton;

    .line 92
    .line 93
    new-instance v1, Lcom/kubi/assets/view/x0;

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, p0}, Lcom/kubi/assets/view/x0;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    .line 101
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 102
    .line 103
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 104
    .line 105
    new-instance v1, Lcom/kubi/assets/view/ScannerEditText$a;

    .line 106
    .line 107
    .line 108
    invoke-direct {v1, p0}, Lcom/kubi/assets/view/ScannerEditText$a;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 112
    return-void
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
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
.end method


# virtual methods
.method public getInputEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    .line 4
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 5
    return-object v0
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
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    .line 4
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method

.method public final j()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->q:Landroid/view/View$OnClickListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    instance-of v1, v0, Lcom/kubi/sdk/BaseActivity;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/sdk/BaseActivity;

    .line 16
    .line 17
    sget-object v1, Lcom/kubi/qrcode/api/service/IQrCodeService;->a:Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;->get()Lcom/kubi/qrcode/api/service/IQrCodeService;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    new-instance v2, Lcom/kubi/assets/view/y0;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p0}, Lcom/kubi/assets/view/y0;-><init>(Lcom/kubi/assets/view/ScannerEditText;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0, v2}, Lcom/kubi/qrcode/api/service/IQrCodeService;->handleScanCodeResult(Lcom/kubi/sdk/BaseActivity;Lkotlin/jvm/functions/Function1;)V

    .line 30
    :cond_1
    :goto_0
    return-void
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
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
.end method

.method public setGone(Z)V
    .locals 4

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/view/ScannerEditText;->s:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 5
    .line 6
    iget-object v0, v0, Lta/m5;->b:Landroid/widget/ImageButton;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 20
    .line 21
    iget-object v0, v0, Lta/m5;->c:Landroid/widget/ImageButton;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    move v3, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v3, v1

    .line 27
    .line 28
    .line 29
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 32
    .line 33
    iget-object v0, v0, Lta/m5;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    move v1, v2

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    sget p1, Lcom/kubi/assets/R$drawable;->bassets_shape_border_dash:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 47
    :cond_3
    return-void
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
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public setOnSetCallBack(Lio/reactivex/functions/Action;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/view/ScannerEditText;->r:Lio/reactivex/functions/Action;

    .line 3
    return-void
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
.end method

.method public setScanClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/view/ScannerEditText;->q:Landroid/view/View$OnClickListener;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 5
    .line 6
    iget-object v0, v0, Lta/m5;->c:Landroid/widget/ImageButton;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v2}, Lcom/kubi/resources/widget/round/widget/RoundTextView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 17
    .line 18
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 19
    const/4 v2, -0x2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    iget-object v2, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 25
    .line 26
    const/high16 v3, 0x40800000    # 4.0f

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 30
    move-result v4

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 34
    move-result v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v4, v1, v3, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 38
    .line 39
    const/high16 v2, 0x41400000    # 12.0f

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 43
    move-result v3

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 47
    move-result v2

    .line 48
    .line 49
    const/high16 v4, -0x3f000000    # -8.0f

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 53
    move-result v4

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3, v2, v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 57
    .line 58
    iget-object v2, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 59
    .line 60
    const/high16 v3, 0x40000000    # 2.0f

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 64
    move-result v3

    .line 65
    int-to-float v3, v3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/round/widget/RoundTextView;->setCornerRadius(F)V

    .line 69
    .line 70
    iget-object v2, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 71
    .line 72
    sget v3, Lcom/kubi/assets/R$color;->primary8:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 76
    .line 77
    iget-object v2, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    sget v4, Lcom/kubi/assets/R$color;->primary:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 87
    move-result v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    .line 92
    iget-object v2, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 93
    .line 94
    iget-object v2, v2, Lta/m5;->g:Landroid/widget/LinearLayout;

    .line 95
    .line 96
    iget-object v3, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 100
    .line 101
    .line 102
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    move-result v0

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    iget-object p1, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 108
    .line 109
    const/16 v0, 0x8

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 113
    return-void

    .line 114
    .line 115
    :cond_1
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->t:Lcom/kubi/resources/widget/round/widget/RoundTextView;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    return-void
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
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 3
    .line 4
    iget-object v0, v0, Lta/m5;->e:Landroid/widget/EditText;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    iget-object p1, p0, Lcom/kubi/assets/view/ScannerEditText;->n:Lta/m5;

    .line 10
    .line 11
    iget-object p1, p1, Lta/m5;->e:Landroid/widget/EditText;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 23
    .line 24
    iget-object p1, p0, Lcom/kubi/assets/view/ScannerEditText;->r:Lio/reactivex/functions/Action;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-interface {p1}, Lio/reactivex/functions/Action;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    .line 33
    const-string v0, "ScannerEditText"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    :cond_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method
