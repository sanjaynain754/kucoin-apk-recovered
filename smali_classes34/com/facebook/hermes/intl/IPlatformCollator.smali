.class public interface abstract Lcom/facebook/hermes/intl/IPlatformCollator;
.super Ljava/lang/Object;
.source "IPlatformCollator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/IPlatformCollator$CaseFirst;,
        Lcom/facebook/hermes/intl/IPlatformCollator$Usage;,
        Lcom/facebook/hermes/intl/IPlatformCollator$Sensitivity;
    }
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract b(Lj5/b;)Lcom/facebook/hermes/intl/IPlatformCollator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj5/b<",
            "*>;)",
            "Lcom/facebook/hermes/intl/IPlatformCollator;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract c(Lcom/facebook/hermes/intl/IPlatformCollator$Sensitivity;)Lcom/facebook/hermes/intl/IPlatformCollator;
.end method

.method public abstract d()Lcom/facebook/hermes/intl/IPlatformCollator$Sensitivity;
.end method

.method public abstract e(Z)Lcom/facebook/hermes/intl/IPlatformCollator;
.end method

.method public abstract f(Lcom/facebook/hermes/intl/IPlatformCollator$CaseFirst;)Lcom/facebook/hermes/intl/IPlatformCollator;
.end method

.method public abstract g(Z)Lcom/facebook/hermes/intl/IPlatformCollator;
.end method
