.class public interface abstract Lk10/a;
.super Ljava/lang/Object;
.source "ILoadingView.java"


# virtual methods
.method public abstract showContent()V
.end method

.method public abstract showEmpty(IILandroid/view/View$OnClickListener;)V
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param
.end method

.method public abstract showEmpty(Ljava/lang/CharSequence;ILandroid/view/View$OnClickListener;)V
    .param p2    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param
.end method

.method public abstract showError(ILandroid/view/View$OnClickListener;)V
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
.end method

.method public abstract showLoading()V
.end method
