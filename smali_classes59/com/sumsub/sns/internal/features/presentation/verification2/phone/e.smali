.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic m:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function0;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public j:Lcom/sumsub/sns/core/widget/PhoneKit;

.field public final k:Lkotlin/Lazy;

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "snsPhone"

    .line 6
    .line 7
    const-string v2, "getSnsPhone()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "snsPhoneId"

    .line 16
    .line 17
    const-string v4, "getSnsPhoneId()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "snsPrimaryButton"

    .line 25
    .line 26
    const-string v5, "getSnsPrimaryButton()Lcom/sumsub/sns/core/widget/SNSPrimaryButton;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v0

    .line 31
    const/4 v4, 0x3

    .line 32
    .line 33
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 34
    .line 35
    aput-object v1, v4, v3

    .line 36
    const/4 v1, 0x1

    .line 37
    .line 38
    aput-object v2, v4, v1

    .line 39
    const/4 v1, 0x2

    .line 40
    .line 41
    aput-object v0, v4, v1

    .line 42
    .line 43
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->m:[Lkotlin/reflect/KProperty;

    .line 44
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->e:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    const-string p1, "PhoneNumber"

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->f:Ljava/lang/String;

    .line 11
    .line 12
    sget p1, Lcom/sumsub/sns/R$id;->sns_phone:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 19
    .line 20
    sget p1, Lcom/sumsub/sns/R$id;->sns_phone_id:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 27
    .line 28
    sget p1, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 35
    .line 36
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/j;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/j;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->k:Lkotlin/Lazy;

    .line 46
    return-void
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

.method public static final a(Lkotlin/jvm/functions/Function0;)Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;
    .locals 0

    .line 30
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;)Lkotlin/Unit;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->m:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    .line 3
    iget-boolean v4, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->c:Z

    xor-int/2addr v4, v3

    .line 4
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v1, v2

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    if-eqz v0, :cond_1

    .line 6
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->b:Ljava/lang/CharSequence;

    .line 7
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v1, v3

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    if-eqz v0, :cond_2

    .line 9
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b0;

    invoke-direct {v4, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;)V

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 10
    :cond_2
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->c:Z

    if-nez v0, :cond_6

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v1, v3

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    if-eqz v0, :cond_3

    .line 12
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_4
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->l:Z

    if-nez v0, :cond_6

    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v1, v3

    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    if-eqz v0, :cond_5

    .line 14
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 15
    :cond_5
    iput-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->l:Z

    goto :goto_1

    .line 16
    :cond_6
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->c:Z

    if-eqz v0, :cond_7

    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v3, v1, v3

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    if-eqz v0, :cond_7

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "input_method"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    .line 20
    invoke-virtual {v3, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 21
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->j:Lcom/sumsub/sns/core/widget/PhoneKit;

    if-eqz v0, :cond_8

    goto :goto_2

    .line 22
    :cond_8
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->d:Lcom/sumsub/sns/internal/features/domain/n;

    if-nez v0, :cond_9

    goto :goto_2

    .line 23
    :cond_9
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/d;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;)V

    .line 24
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v1, v1, v2

    invoke-virtual {v4, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 25
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 26
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    .line 27
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->a:Ljava/lang/CharSequence;

    .line 28
    invoke-static {v1, v2, v0, v3, p1}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneKitProviderKt;->getPhoneKit(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)Lcom/sumsub/sns/core/widget/PhoneKit;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->j:Lcom/sumsub/sns/core/widget/PhoneKit;

    .line 29
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p2, 0x6

    const/4 p4, 0x0

    if-ne p3, p2, :cond_2

    .line 31
    iget-boolean p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->e:Z

    if-eqz p0, :cond_2

    .line 32
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 33
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->m:[Lkotlin/reflect/KProperty;

    const/4 p3, 0x2

    aget-object p3, p2, p3

    invoke-virtual {p0, p1, p3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    if-eqz p0, :cond_0

    .line 34
    invoke-virtual {p0, p4}, Landroid/view/View;->setEnabled(Z)V

    .line 35
    :cond_0
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->e:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 36
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    const/4 p3, 0x1

    aget-object p2, p2, p3

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    if-eqz p0, :cond_1

    .line 37
    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    :cond_1
    return p3

    :cond_2
    return p4
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->f:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public final l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->k:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Lcom/sumsub/sns/internal/core/presentation/common/g;Lkotlin/jvm/functions/Function1;)V

    .line 17
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;->j:Lcom/sumsub/sns/core/widget/PhoneKit;

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
