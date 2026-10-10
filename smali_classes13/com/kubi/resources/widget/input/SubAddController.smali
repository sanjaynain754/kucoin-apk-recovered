.class public final Lcom/kubi/resources/widget/input/SubAddController;
.super Ljava/lang/Object;
.source "SubAddController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/input/SubAddController$InputAction;,
        Lcom/kubi/resources/widget/input/SubAddController$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008-\u0018\u00002\u00020\u0001:\u0001jB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u00106\u001a\u000207J\u0008\u00108\u001a\u000207H\u0002J\u0010\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010=\u001a\u00020>H\u0002J\u0008\u0010?\u001a\u000207H\u0002J\u0008\u0010@\u001a\u000207H\u0002J\u001c\u0010A\u001a\u0002072\u0008\u0008\u0002\u0010B\u001a\u00020\u00052\u0008\u0008\u0002\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020/H\u0002J\u0010\u0010F\u001a\u0002072\u0008\u0010G\u001a\u0004\u0018\u00010\u0016J\u000e\u0010L\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010M\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010N\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u0012J\u0010\u0010O\u001a\u0002072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010P\u001a\u0002072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010Q\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u0012J\u0008\u0010R\u001a\u000207H\u0002J\u0008\u0010S\u001a\u000207H\u0002J\u0006\u0010T\u001a\u000207J\u000e\u0010U\u001a\u0002072\u0006\u0010B\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020\rJ \u0010W\u001a\u0002072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0008\u0008\u0002\u0010X\u001a\u00020\u0005J\u0016\u0010J\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u0005J\u001e\u0010Z\u001a\u00020\u0012*\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\u0008\u0008\u0002\u0010[\u001a\u00020\u0005H\u0002J\u0014\u0010\\\u001a\u00020\u0005*\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0002J\u0008\u0010]\u001a\u00020\u0005H\u0002J\u0008\u0010^\u001a\u00020\u0005H\u0002J\u000e\u0010_\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u0012J\u0008\u0010`\u001a\u000207H\u0002J\u0008\u0010a\u001a\u000207H\u0002J\u0008\u0010b\u001a\u000207H\u0002J\u000e\u0010c\u001a\u0002072\u0006\u0010G\u001a\u00020\u001eJ\u000e\u0010d\u001a\u0002072\u0006\u0010G\u001a\u00020\u001cJ\u000e\u0010e\u001a\u0002072\u0006\u0010f\u001a\u00020\u0005J\u0010\u0010g\u001a\u0002072\u0006\u0010f\u001a\u00020\u0005H\u0002J\u0008\u0010h\u001a\u0004\u0018\u00010\u0012J\u000e\u0010i\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 @BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u00100\u001a\u000201\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0011\u00104\u001a\u000201\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00103R$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010K\u00a8\u0006k"
    }
    d2 = {
        "Lcom/kubi/resources/widget/input/SubAddController;",
        "",
        "inputViewFl",
        "Landroid/widget/FrameLayout;",
        "supportPercent",
        "",
        "supportTypeSelector",
        "supportStepSubAdd",
        "kcOrderStyleInputLayout",
        "Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;",
        "<init>",
        "(Landroid/widget/FrameLayout;ZZZLcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;)V",
        "paddingHorizontal",
        "",
        "innerFocus",
        "Landroid/view/View$OnFocusChangeListener;",
        "l",
        "increment",
        "Ljava/math/BigDecimal;",
        "precision",
        "ensureIncrement",
        "subListener",
        "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;",
        "initValue",
        "lowValue",
        "highValue",
        "percent",
        "percentFormatter",
        "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;",
        "percentChangeListener",
        "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;",
        "value",
        "Lcom/kubi/futures/view/AnimateDrawableEndView;",
        "typeSelector",
        "getTypeSelector",
        "()Lcom/kubi/futures/view/AnimateDrawableEndView;",
        "percentHintTextView",
        "Lcom/kubi/resources/widget/BaseTextView;",
        "percentTextView",
        "ivTradeSub",
        "Landroidx/appcompat/widget/AppCompatImageView;",
        "ivTradeAdd",
        "addSubItem",
        "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$DefaultAction;",
        "changeTypeItem",
        "dynamicallyEnabledTypeSelector",
        "requestedAction",
        "Lcom/kubi/resources/widget/input/SubAddController$InputAction;",
        "subLongTouchListener",
        "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;",
        "getSubLongTouchListener",
        "()Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;",
        "addLongTouchListener",
        "getAddLongTouchListener",
        "ensureTypeSelectorEnabled",
        "",
        "createTypeSelectorIfNeeded",
        "initStepSubAdd",
        "context",
        "Landroid/content/Context;",
        "initPercentTextView",
        "textInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "showSubAddOps",
        "showChangeTypeOps",
        "refreshInputAction",
        "hasFocus",
        "hasText",
        "requestAction",
        "action",
        "setSubOrAddClickListener",
        "listener",
        "getValue",
        "()Ljava/math/BigDecimal;",
        "setValue",
        "(Ljava/math/BigDecimal;)V",
        "setLowValue",
        "setHighValue",
        "setInitValue",
        "setInnerFocusChangeListener",
        "setRealInnerFocusChanged",
        "setEnsureIncrement",
        "subInput",
        "requestF",
        "addInput",
        "ensurePrecisions",
        "getPrecision",
        "setPrecision",
        "followStep",
        "needAnimation",
        "step",
        "isDown",
        "isStepped",
        "lessThanLowerValue",
        "reachHighValue",
        "setPercent",
        "setPercentByInternal",
        "hidePercent",
        "showPercent",
        "setOnPercentChangeListener",
        "setOnPercentFormatter",
        "setStatusEnabled",
        "enabled",
        "disableAddSubItem",
        "getPercent",
        "setSupportStepSubAdd",
        "InputAction",
        "TradeBaseLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubAddController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubAddController.kt\ncom/kubi/resources/widget/input/SubAddController\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TradeBaseIssues.kt\ncom/kubi/TradeBaseIssuesKt\n*L\n1#1,636:1\n58#2,23:637\n93#2,3:660\n1#3:663\n18#4,2:664\n18#4,2:666\n18#4,2:668\n*S KotlinDebug\n*F\n+ 1 SubAddController.kt\ncom/kubi/resources/widget/input/SubAddController\n*L\n144#1:637,23\n144#1:660,3\n329#1:664,2\n390#1:666,2\n443#1:668,2\n*E\n"
    }
.end annotation


# instance fields
.field public A:Lcom/kubi/resources/widget/input/SubAddController$InputAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final B:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final C:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a:Landroid/widget/FrameLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Z

.field public c:Z

.field public d:Z

.field public final e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:I

.field public g:Landroid/view/View$OnFocusChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:Landroid/view/View$OnFocusChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:I

.field public k:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public p:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public q:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public r:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public s:Lcom/kubi/futures/view/AnimateDrawableEndView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public t:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public u:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public v:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public w:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public x:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public y:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;ZZZLcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;)V
    .locals 1
    .param p1    # Landroid/widget/FrameLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inputViewFl"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "kcOrderStyleInputLayout"

    .line 8
    .line 9
    .line 10
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    iput-boolean p2, p0, Lcom/kubi/resources/widget/input/SubAddController;->b:Z

    .line 18
    .line 19
    iput-boolean p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->c:Z

    .line 20
    .line 21
    iput-boolean p4, p0, Lcom/kubi/resources/widget/input/SubAddController;->d:Z

    .line 22
    .line 23
    iput-object p5, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 24
    .line 25
    const/16 p3, 0xc

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p3}, Lcom/kubi/utils/extensions/core/c;->d(Landroid/view/View;I)I

    .line 29
    move-result p3

    .line 30
    .line 31
    iput p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->f:I

    .line 32
    .line 33
    sget-object p3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 34
    .line 35
    const-string p4, "ZERO"

    .line 36
    .line 37
    .line 38
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->i:Ljava/math/BigDecimal;

    .line 41
    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    iput v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->j:I

    .line 45
    .line 46
    .line 47
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->k:Ljava/math/BigDecimal;

    .line 50
    .line 51
    .line 52
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->m:Ljava/math/BigDecimal;

    .line 55
    .line 56
    .line 57
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 60
    .line 61
    .line 62
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 65
    .line 66
    .line 67
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 70
    .line 71
    new-instance p3, Lcom/kubi/resources/widget/input/SubAddController$d;

    .line 72
    .line 73
    .line 74
    invoke-direct {p3, p0}, Lcom/kubi/resources/widget/input/SubAddController$d;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 75
    .line 76
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->B:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 77
    .line 78
    new-instance p3, Lcom/kubi/resources/widget/input/SubAddController$b;

    .line 79
    .line 80
    .line 81
    invoke-direct {p3, p0}, Lcom/kubi/resources/widget/input/SubAddController$b;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 82
    .line 83
    iput-object p3, p0, Lcom/kubi/resources/widget/input/SubAddController;->C:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p5}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/widget/input/SubAddController;->z(Landroid/content/Context;Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 100
    .line 101
    :cond_0
    iget-boolean p2, p0, Lcom/kubi/resources/widget/input/SubAddController;->d:Z

    .line 102
    .line 103
    if-eqz p2, :cond_1

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/input/SubAddController;->A(Landroid/content/Context;)V

    .line 110
    .line 111
    :cond_1
    iget-boolean p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->c:Z

    .line 112
    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->o()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->W()V

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :cond_2
    iget-boolean p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->d:Z

    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Y()V

    .line 128
    .line 129
    .line 130
    :cond_3
    :goto_0
    invoke-virtual {p5}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    new-instance p2, Lyw/g;

    .line 134
    .line 135
    .line 136
    invoke-direct {p2, p0}, Lyw/g;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2}, Lh30/b;->d(Landroid/widget/EditText;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p5}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    new-instance p2, Lcom/kubi/resources/widget/input/SubAddController$c;

    .line 146
    .line 147
    .line 148
    invoke-direct {p2, p0}, Lcom/kubi/resources/widget/input/SubAddController$c;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 152
    .line 153
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 154
    .line 155
    if-eqz p1, :cond_5

    .line 156
    .line 157
    .line 158
    invoke-virtual {p5}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 159
    move-result-object p2

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    .line 166
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 167
    move-result p2

    .line 168
    .line 169
    if-nez p2, :cond_4

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->E()Z

    .line 173
    move-result p2

    .line 174
    .line 175
    if-nez p2, :cond_4

    .line 176
    .line 177
    .line 178
    invoke-virtual {p5}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 179
    move-result-object p2

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z

    .line 183
    move-result p2

    .line 184
    .line 185
    if-eqz p2, :cond_4

    .line 186
    const/4 p2, 0x1

    .line 187
    goto :goto_1

    .line 188
    :cond_4
    const/4 p2, 0x0

    .line 189
    .line 190
    .line 191
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 192
    :cond_5
    return-void
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
.end method

.method public static final B(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->b0()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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

.method public static final C(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->n()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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

.method public static synthetic H(Lcom/kubi/resources/widget/input/SubAddController;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p3, 0x1

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 17
    .line 18
    if-eqz p3, :cond_3

    .line 19
    .line 20
    iget-object p2, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 28
    move-result-object p2

    .line 29
    const/4 p3, 0x1

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 35
    move-result p2

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p2, 0x0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    move p2, p3

    .line 42
    :goto_1
    xor-int/2addr p2, p3

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/widget/input/SubAddController;->G(ZZ)V

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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
.end method

.method public static synthetic a(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/resources/widget/input/SubAddController;->C(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic a0(Lcom/kubi/resources/widget/input/SubAddController;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/math/BigDecimal;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x2

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p3, 0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/resources/widget/input/SubAddController;->Z(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)Ljava/math/BigDecimal;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method

.method public static synthetic b(Lcom/kubi/resources/widget/input/SubAddController;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/resources/widget/input/SubAddController;->d(Lcom/kubi/resources/widget/input/SubAddController;Landroid/view/View;Z)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static synthetic c(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/resources/widget/input/SubAddController;->B(Lcom/kubi/resources/widget/input/SubAddController;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final d(Lcom/kubi/resources/widget/input/SubAddController;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->s(Landroid/view/View;)Z

    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 21
    .line 22
    const-string v0, "ZERO"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/input/SubAddController;->P(Ljava/math/BigDecimal;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/input/SubAddController;->q(Z)V

    .line 32
    const/4 p1, 0x2

    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p2, v1, p1, v0}, Lcom/kubi/resources/widget/input/SubAddController;->H(Lcom/kubi/resources/widget/input/SubAddController;ZZILjava/lang/Object;)V

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static final synthetic e(Lcom/kubi/resources/widget/input/SubAddController;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/input/SubAddController;->z:Z

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
.end method

.method public static final synthetic f(Lcom/kubi/resources/widget/input/SubAddController;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

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
.end method

.method public static final synthetic g(Lcom/kubi/resources/widget/input/SubAddController;)Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

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
.end method

.method public static final synthetic h(Lcom/kubi/resources/widget/input/SubAddController;)Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

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
.end method

.method public static final synthetic i(Lcom/kubi/resources/widget/input/SubAddController;)Ljava/math/BigDecimal;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

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
.end method

.method public static final synthetic j(Lcom/kubi/resources/widget/input/SubAddController;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->E()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic k(Lcom/kubi/resources/widget/input/SubAddController;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->F()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic l(Lcom/kubi/resources/widget/input/SubAddController;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Y()V

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
.end method

.method public static final synthetic m(Lcom/kubi/resources/widget/input/SubAddController;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->b0()V

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
.end method


# virtual methods
.method public final A(Landroid/content/Context;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    sget v0, Lcom/kubi/tradebase/R$layout;->view_trade_input_layout_sub_add:I

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1}, Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;-><init>(Landroid/view/View;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->x:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 22
    .line 23
    sget v0, Lcom/kubi/tradebase/R$id;->iv_trade_sub:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    sget v0, Lcom/kubi/tradebase/R$id;->iv_trade_add:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    check-cast p1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    new-instance v3, Lyw/e;

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, p0}, Lyw/e;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, 0x0

    .line 53
    .line 54
    const-wide/16 v1, 0x0

    .line 55
    .line 56
    .line 57
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 58
    .line 59
    :cond_0
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->B:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 67
    .line 68
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    new-instance v4, Lyw/f;

    .line 73
    .line 74
    .line 75
    invoke-direct {v4, p0}, Lyw/f;-><init>(Lcom/kubi/resources/widget/input/SubAddController;)V

    .line 76
    const/4 v5, 0x1

    .line 77
    const/4 v6, 0x0

    .line 78
    .line 79
    const-wide/16 v2, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 85
    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->C:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 92
    :cond_3
    return-void
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

.method public final D(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    return v2

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 18
    move-result p1

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    return v2

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
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
.end method

.method public final E()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 3
    .line 4
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-gtz v0, :cond_0

    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_0
    return v1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final F()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 3
    .line 4
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_0
    return v1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final G(ZZ)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->W()V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Y()V

    .line 16
    return-void
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
.end method

.method public final I(Lcom/kubi/resources/widget/input/SubAddController$InputAction;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->A:Lcom/kubi/resources/widget/input/SubAddController$InputAction;

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->A:Lcom/kubi/resources/widget/input/SubAddController$InputAction;

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/resources/widget/input/SubAddController$a;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result p1

    .line 14
    .line 15
    aget p1, v0, p1

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    if-eq p1, v0, :cond_3

    .line 19
    const/4 v0, 0x2

    .line 20
    .line 21
    if-ne p1, v0, :cond_2

    .line 22
    .line 23
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->y:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->g(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;)V

    .line 31
    .line 32
    :cond_1
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->x:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 33
    .line 34
    if-eqz p1, :cond_5

    .line 35
    .line 36
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->d(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 46
    throw p1

    .line 47
    .line 48
    :cond_3
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->x:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->g(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;)V

    .line 56
    .line 57
    :cond_4
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->y:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->d(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;)V

    .line 65
    :cond_5
    :goto_0
    return-void
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

.method public final J()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 17
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
.end method

.method public final K(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "ensureIncrement"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->k:Ljava/math/BigDecimal;

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
.end method

.method public final L(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

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
.end method

.method public final M(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->m:Ljava/math/BigDecimal;

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
.end method

.method public final N(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

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
.end method

.method public final O(Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;)V
    .locals 1
    .param p1    # Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->q:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;

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
.end method

.method public final P(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "percent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Q()V

    .line 20
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
.end method

.method public final Q()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 3
    .line 4
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 8
    move-result v0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->W()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->y()V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->B:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;->a()Landroid/os/Handler;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Y()V

    .line 53
    .line 54
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->X()V

    .line 75
    .line 76
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 77
    const/4 v1, 0x1

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 83
    .line 84
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 85
    .line 86
    sget-object v3, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 90
    move-result v0

    .line 91
    .line 92
    if-gez v0, :cond_2

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    move v1, v2

    .line 95
    .line 96
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 102
    .line 103
    :cond_3
    if-nez v1, :cond_4

    .line 104
    .line 105
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->C:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;->a()Landroid/os/Handler;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 113
    .line 114
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->r:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    iget-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v1}, Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;->a(Ljava/math/BigDecimal;)V

    .line 122
    :cond_5
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final R(Ljava/math/BigDecimal;IZ)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "increment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput p2, p0, Lcom/kubi/resources/widget/input/SubAddController;->j:I

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->i:Ljava/math/BigDecimal;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/input/SubAddController;->K(Ljava/math/BigDecimal;)V

    .line 15
    .line 16
    :cond_0
    if-gtz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/kubi/numeric/financial/widget/FinancialInputEditText;->setInputType(I)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    const/16 p2, 0x2002

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lcom/kubi/numeric/financial/widget/FinancialInputEditText;->setInputType(I)V

    .line 39
    return-void
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public final S(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/input/SubAddController;->p(Z)V

    .line 13
    return-void
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

.method public final T(Z)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    const-string v0, "getContext(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/input/SubAddController;->A(Landroid/content/Context;)V

    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->d:Z

    .line 21
    .line 22
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->x:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->g(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;)V

    .line 30
    :cond_1
    return-void
    .line 31
    .line 32
.end method

.method public final U(Ljava/math/BigDecimal;)V
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/input/SubAddController;->V(Ljava/math/BigDecimal;Z)V

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
.end method

.method public final V(Ljava/math/BigDecimal;Z)V
    .locals 7
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v3, p0, Lcom/kubi/resources/widget/input/SubAddController;->k:Ljava/math/BigDecimal;

    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lcom/kubi/resources/widget/input/SubAddController;->a0(Lcom/kubi/resources/widget/input/SubAddController;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iget v2, v1, Lcom/kubi/resources/widget/input/SubAddController;->j:I

    .line 25
    .line 26
    sget-object v3, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 36
    move-result v2

    .line 37
    .line 38
    const-string v3, ""

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/FinancialInputEditText;->getRawInput()Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result v2

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v0, p1}, Lcom/kubi/numeric/financial/widget/FinancialInputEditText;->setBigDecimalValue(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 82
    move-result p1

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    move-result-object p1

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    const/4 p1, 0x0

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 92
    move-result p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    iget-object p1, v1, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    const-wide/16 p1, 0x28

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/v0;->b(J)V

    .line 111
    :cond_4
    :goto_1
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method

.method public final W()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/widget/input/SubAddController$InputAction;->TYPE_SELECTOR:Lcom/kubi/resources/widget/input/SubAddController$InputAction;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/input/SubAddController;->I(Lcom/kubi/resources/widget/input/SubAddController$InputAction;)V

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
    .line 33
.end method

.method public final X()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->q:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$b;->a(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    const-string v1, ""

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputEditText;->getHint()Ljava/lang/CharSequence;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    :cond_4
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final Y()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/widget/input/SubAddController$InputAction;->STEP_SUB_ADD:Lcom/kubi/resources/widget/input/SubAddController$InputAction;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/input/SubAddController;->I(Lcom/kubi/resources/widget/input/SubAddController$InputAction;)V

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
    .line 33
.end method

.method public final Z(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/widget/input/SubAddController;->D(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    :goto_0
    return-object p1

    .line 17
    .line 18
    :cond_1
    if-eqz p3, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 30
    return-object p1

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 34
    move-result-object p3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    return-object p1
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public final b0()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->l:Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;->a(Z)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->s(Landroid/view/View;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 24
    .line 25
    new-instance v1, Ljava/math/BigDecimal;

    .line 26
    .line 27
    const-string v2, "0.01"

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "subtract(...)"

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Q()V

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 55
    move-result v2

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    goto :goto_2

    .line 59
    .line 60
    :cond_2
    :try_start_0
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 64
    move-result v2

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 72
    move-result v2

    .line 73
    .line 74
    if-gtz v2, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->n:Ljava/math/BigDecimal;

    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object v2, v0

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :cond_3
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->i:Ljava/math/BigDecimal;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    const-string v1, "coerceAtLeast(...)"

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    check-cast v0, Ljava/math/BigDecimal;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/input/SubAddController;->U(Ljava/math/BigDecimal;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->J()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    return-void

    .line 108
    .line 109
    :goto_1
    new-instance v1, Lcom/kubi/ComponentException;

    .line 110
    .line 111
    const/16 v6, 0x8

    .line 112
    const/4 v7, 0x0

    .line 113
    .line 114
    const-string v3, "KcTradeNumAbInputView"

    .line 115
    const/4 v4, 0x0

    .line 116
    const/4 v5, 0x0

    .line 117
    .line 118
    .line 119
    invoke-direct/range {v1 .. v7}, Lcom/kubi/ComponentException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 120
    const/4 v0, 0x2

    .line 121
    const/4 v2, 0x0

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 125
    :goto_2
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final n()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->s(Landroid/view/View;)Z

    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 16
    .line 17
    sget-object v1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 27
    .line 28
    new-instance v1, Ljava/math/BigDecimal;

    .line 29
    .line 30
    const-string v2, "0.01"

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    const-string v1, "add(...)"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->Q()V

    .line 48
    return-void

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->m:Ljava/math/BigDecimal;

    .line 55
    .line 56
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 60
    move-result v2

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 66
    move-result v2

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->m:Ljava/math/BigDecimal;

    .line 71
    .line 72
    iget-object v4, p0, Lcom/kubi/resources/widget/input/SubAddController;->i:Ljava/math/BigDecimal;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 76
    move-result v2

    .line 77
    .line 78
    if-lez v2, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->m:Ljava/math/BigDecimal;

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_3
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->i:Ljava/math/BigDecimal;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 91
    .line 92
    :goto_1
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 96
    move-result v2

    .line 97
    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-object v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 104
    move-result v2

    .line 105
    .line 106
    if-ltz v2, :cond_4

    .line 107
    .line 108
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->o:Ljava/math/BigDecimal;

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/input/SubAddController;->U(Ljava/math/BigDecimal;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->J()V

    .line 115
    .line 116
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->l:Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0, v1}, Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;->a(Z)V

    .line 125
    :cond_5
    :goto_2
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final o()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->s:Lcom/kubi/futures/view/AnimateDrawableEndView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget v1, Lcom/kubi/tradebase/R$layout;->btradebase_view_trade_input_layout_change_type:I

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget v1, Lcom/kubi/tradebase/R$id;->changeTypeAnimEndView:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lcom/kubi/futures/view/AnimateDrawableEndView;

    .line 31
    .line 32
    iput-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->s:Lcom/kubi/futures/view/AnimateDrawableEndView;

    .line 33
    .line 34
    new-instance v1, Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v0}, Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;-><init>(Landroid/view/View;)V

    .line 41
    .line 42
    iput-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->y:Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$a;

    .line 43
    return-void
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final p(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    :cond_1
    return-void
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

.method public final q(Z)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->h:Landroid/view/View$OnFocusChangeListener;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1, p1}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->k:Ljava/math/BigDecimal;

    .line 21
    .line 22
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 39
    move-result p1

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->x()Ljava/math/BigDecimal;

    .line 45
    move-result-object p1

    .line 46
    const/4 v0, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/input/SubAddController;->V(Ljava/math/BigDecimal;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-void

    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    move-object v1, p1

    .line 54
    .line 55
    new-instance v0, Lcom/kubi/ComponentException;

    .line 56
    .line 57
    const/16 v5, 0x8

    .line 58
    const/4 v6, 0x0

    .line 59
    .line 60
    const-string v2, "KcTradeNumAbInputView"

    .line 61
    const/4 v3, 0x0

    .line 62
    const/4 v4, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v0 .. v6}, Lcom/kubi/ComponentException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    const/4 p1, 0x2

    .line 67
    const/4 v1, 0x0

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 71
    :cond_2
    :goto_0
    return-void
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

.method public final r()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->c:Z

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->z:Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/input/SubAddController;->o()V

    .line 9
    const/4 v0, 0x3

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v2, v2, v0, v1}, Lcom/kubi/resources/widget/input/SubAddController;->H(Lcom/kubi/resources/widget/input/SubAddController;ZZILjava/lang/Object;)V

    .line 15
    return-void
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
.end method

.method public final s()Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->C:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

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
.end method

.method public final setInnerFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnFocusChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->h:Landroid/view/View$OnFocusChangeListener;

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
.end method

.method public final setOnPercentChangeListener(Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;)V
    .locals 1
    .param p1    # Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->r:Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$a;

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
.end method

.method public final setRealInnerFocusChanged(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnFocusChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->g:Landroid/view/View$OnFocusChangeListener;

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
.end method

.method public final setSubOrAddClickListener(Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;)V
    .locals 0
    .param p1    # Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->l:Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;

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
.end method

.method public final t()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->p:Ljava/math/BigDecimal;

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
.end method

.method public final u()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->j:I

    .line 3
    return v0
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
.end method

.method public final v()Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->B:Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnLongTouchListener;

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
.end method

.method public final w()Lcom/kubi/futures/view/AnimateDrawableEndView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->s:Lcom/kubi/futures/view/AnimateDrawableEndView;

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
.end method

.method public final x()Ljava/math/BigDecimal;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 11
    .line 12
    const-string v1, "ZERO"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->e:Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;->getEditText()Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/numeric/financial/widget/FinancialInputEditText;->getRawInput()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v2, "combineLatestPriceAndAmount -> SubAddController getValue -> "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lro/b;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    return-object v0

    .line 59
    .line 60
    :cond_1
    :try_start_0
    new-instance v1, Ljava/math/BigDecimal;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    move-object v2, v0

    .line 67
    .line 68
    new-instance v1, Lcom/kubi/ComponentException;

    .line 69
    .line 70
    const/16 v6, 0x8

    .line 71
    const/4 v7, 0x0

    .line 72
    .line 73
    const-string v3, "KcTradeNumAbInputView"

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v1 .. v7}, Lcom/kubi/ComponentException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    const/4 v0, 0x2

    .line 80
    const/4 v2, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 84
    .line 85
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 89
    :goto_0
    return-object v1
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final y()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    :cond_3
    return-void
    .line 32
    .line 33
.end method

.method public final z(Landroid/content/Context;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/resources/widget/BaseTextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 14
    .line 15
    .line 16
    const v2, 0x800053

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 20
    .line 21
    sget v2, Lcom/kubi/tradebase/R$color;->c_text:I

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    const/high16 v2, 0x41600000    # 14.0f

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 34
    .line 35
    iget v2, p0, Lcom/kubi/resources/widget/input/SubAddController;->f:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x4

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 44
    move-result v4

    .line 45
    add-int/2addr v3, v4

    .line 46
    const/4 v4, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2, v4, v2, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 50
    .line 51
    new-instance v2, Lm10/b;

    .line 52
    .line 53
    .line 54
    invoke-direct {v2}, Lm10/b;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeWidth()I

    .line 58
    move-result v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Lm10/b;->x(I)Lm10/b;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeColor()I

    .line 66
    move-result v3

    .line 67
    .line 68
    .line 69
    filled-new-array {v3}, [I

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Lm10/b;->v([I)Lm10/b;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusTopStart()F

    .line 78
    move-result v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusTopEnd()F

    .line 82
    move-result v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusBottomStart()F

    .line 86
    move-result v6

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusBottomEnd()F

    .line 90
    move-result v7

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3, v5, v6, v7}, Lm10/b;->n(FFFF)Lm10/b;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 100
    .line 101
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 102
    const/4 v2, -0x1

    .line 103
    const/4 v3, -0x2

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 107
    .line 108
    const/16 v5, 0x50

    .line 109
    .line 110
    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 111
    .line 112
    iget-object v5, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 113
    .line 114
    iget-object v6, p0, Lcom/kubi/resources/widget/input/SubAddController;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    .line 119
    new-instance v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, p1}, Lcom/kubi/resources/widget/BaseTextView;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 129
    .line 130
    .line 131
    const v1, 0x800033

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 135
    .line 136
    sget v1, Lcom/kubi/tradebase/R$font;->regular:I

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 144
    .line 145
    sget v1, Lcom/kubi/tradebase/R$color;->c_text40:I

    .line 146
    .line 147
    .line 148
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 149
    move-result p1

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 153
    .line 154
    const/high16 p1, 0x41200000    # 10.0f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 158
    .line 159
    iget p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->f:I

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCollapsedPaddingTop()I

    .line 163
    move-result v1

    .line 164
    .line 165
    iget v5, p0, Lcom/kubi/resources/widget/input/SubAddController;->f:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, p1, v1, v5, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 169
    .line 170
    new-instance p1, Lm10/b;

    .line 171
    .line 172
    .line 173
    invoke-direct {p1}, Lm10/b;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeWidth()I

    .line 177
    move-result v1

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v1}, Lm10/b;->x(I)Lm10/b;

    .line 181
    move-result-object p1

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeColor()I

    .line 185
    move-result v1

    .line 186
    .line 187
    .line 188
    filled-new-array {v1}, [I

    .line 189
    move-result-object v1

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v1}, Lm10/b;->v([I)Lm10/b;

    .line 193
    move-result-object p1

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusTopStart()F

    .line 197
    move-result v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusTopEnd()F

    .line 201
    move-result v4

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusBottomStart()F

    .line 205
    move-result v5

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxCornerRadiusBottomEnd()F

    .line 209
    move-result p2

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v1, v4, v5, p2}, Lm10/b;->n(FFFF)Lm10/b;

    .line 213
    move-result-object p1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 217
    .line 218
    iput-object v0, p0, Lcom/kubi/resources/widget/input/SubAddController;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 219
    .line 220
    iget-object p1, p0, Lcom/kubi/resources/widget/input/SubAddController;->a:Landroid/widget/FrameLayout;

    .line 221
    .line 222
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 223
    .line 224
    .line 225
    invoke-direct {p2, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    return-void
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
.end method
