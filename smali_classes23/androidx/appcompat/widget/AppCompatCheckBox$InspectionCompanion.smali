.class public final Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;
.super Ljava/lang/Object;
.source "AppCompatCheckBox$InspectionCompanion.java"

# interfaces
.implements Landroid/view/inspector/InspectionCompanion;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1d
.end annotation

.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/view/inspector/InspectionCompanion;"
    }
.end annotation


# instance fields
.field private mBackgroundTintId:I

.field private mBackgroundTintModeId:I

.field private mButtonTintId:I

.field private mButtonTintModeId:I

.field private mDrawableTintId:I

.field private mDrawableTintModeId:I

.field private mPropertiesMapped:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mPropertiesMapped:Z

    .line 7
    return-void
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
.end method


# virtual methods
.method public mapProperties(Landroid/view/inspector/PropertyMapper;)V
    .locals 2
    .param p1    # Landroid/view/inspector/PropertyMapper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "backgroundTint"

    .line 3
    .line 4
    sget v1, Landroidx/appcompat/R$attr;->backgroundTint:I

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 8
    move-result v0

    .line 9
    .line 10
    iput v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mBackgroundTintId:I

    .line 11
    .line 12
    const-string v0, "backgroundTintMode"

    .line 13
    .line 14
    sget v1, Landroidx/appcompat/R$attr;->backgroundTintMode:I

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mBackgroundTintModeId:I

    .line 21
    .line 22
    const-string v0, "buttonTint"

    .line 23
    .line 24
    sget v1, Landroidx/appcompat/R$attr;->buttonTint:I

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 28
    move-result v0

    .line 29
    .line 30
    iput v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mButtonTintId:I

    .line 31
    .line 32
    const-string v0, "buttonTintMode"

    .line 33
    .line 34
    sget v1, Landroidx/appcompat/R$attr;->buttonTintMode:I

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 38
    move-result v0

    .line 39
    .line 40
    iput v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mButtonTintModeId:I

    .line 41
    .line 42
    const-string v0, "drawableTint"

    .line 43
    .line 44
    sget v1, Landroidx/appcompat/R$attr;->drawableTint:I

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 48
    move-result v0

    .line 49
    .line 50
    iput v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mDrawableTintId:I

    .line 51
    .line 52
    const-string v0, "drawableTintMode"

    .line 53
    .line 54
    sget v1, Landroidx/appcompat/R$attr;->drawableTintMode:I

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0, v1}, Landroidx/appcompat/widget/b;->a(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    .line 58
    move-result p1

    .line 59
    .line 60
    iput p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mDrawableTintModeId:I

    .line 61
    const/4 p1, 0x1

    .line 62
    .line 63
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mPropertiesMapped:Z

    .line 64
    return-void
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
.end method

.method public readProperties(Landroidx/appcompat/widget/AppCompatCheckBox;Landroid/view/inspector/PropertyReader;)V
    .locals 2
    .param p1    # Landroidx/appcompat/widget/AppCompatCheckBox;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mPropertiesMapped:Z

    if-eqz v0, :cond_0

    .line 3
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mBackgroundTintId:I

    invoke-virtual {p1}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    .line 4
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mBackgroundTintModeId:I

    invoke-virtual {p1}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    .line 5
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mButtonTintId:I

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    .line 6
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mButtonTintModeId:I

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getButtonTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    .line 7
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mDrawableTintId:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawableTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    .line 8
    iget v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->mDrawableTintModeId:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawableTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {p2, v0, p1}, Landroidx/appcompat/widget/a;->a(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    return-void

    .line 9
    :cond_0
    invoke-static {}, Landroidx/appcompat/widget/c;->a()Landroid/view/inspector/InspectionCompanion$UninitializedPropertyMapException;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatCheckBox$InspectionCompanion;->readProperties(Landroidx/appcompat/widget/AppCompatCheckBox;Landroid/view/inspector/PropertyReader;)V

    return-void
.end method
