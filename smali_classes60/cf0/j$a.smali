.class public interface abstract Lcf0/j$a;
.super Ljava/lang/Object;
.source "MarkwonSpansFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcf0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/Class;Lcf0/s;)Lcf0/j$a;
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcf0/s;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lih0/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;",
            "Lcf0/s;",
            ")",
            "Lcf0/j$a;"
        }
    .end annotation
.end method

.method public abstract build()Lcf0/j;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
