.class public interface abstract Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.super Ljava/lang/Object;
.source "IPlatformNumberFormatter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$RoundingType;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;,
        Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;
    }
.end annotation


# virtual methods
.method public abstract a(D)Ljava/text/AttributedCharacterIterator;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract b(D)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract c(Lj5/b;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj5/b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract d(Lj5/b;Ljava/lang/String;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj5/b<",
            "*>;",
            "Ljava/lang/String;",
            "Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;",
            "Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;",
            "Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;",
            "Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;",
            ")",
            "Lcom/facebook/hermes/intl/IPlatformNumberFormatter;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract f(I)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.end method

.method public abstract g(Z)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.end method

.method public abstract h(Lcom/facebook/hermes/intl/IPlatformNumberFormatter$RoundingType;II)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.end method

.method public abstract i(Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.end method

.method public abstract j(Lcom/facebook/hermes/intl/IPlatformNumberFormatter$RoundingType;II)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract k(Ljava/lang/String;Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;)Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation
.end method

.method public abstract l(Ljava/text/AttributedCharacterIterator$Attribute;D)Ljava/lang/String;
.end method
