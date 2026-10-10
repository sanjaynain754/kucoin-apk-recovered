.class public interface abstract Lcf0/i;
.super Ljava/lang/Object;
.source "MarkwonPlugin.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf0/i$b;,
        Lcf0/i$a;
    }
.end annotation


# virtual methods
.method public abstract afterRender(Lih0/s;Lcf0/l;)V
    .param p1    # Lih0/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcf0/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract beforeRender(Lih0/s;)V
    .param p1    # Lih0/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configure(Lcf0/i$b;)V
    .param p1    # Lcf0/i$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configureConfiguration(Lcf0/g$b;)V
    .param p1    # Lcf0/g$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configureParser(Ljh0/d$b;)V
    .param p1    # Ljh0/d$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configureSpansFactory(Lcf0/j$a;)V
    .param p1    # Lcf0/j$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configureTheme(Ldf0/a$a;)V
    .param p1    # Ldf0/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract configureVisitor(Lcf0/l$b;)V
    .param p1    # Lcf0/l$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract processMarkdown(Ljava/lang/String;)Ljava/lang/String;
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
