.class public Lcom/fasterxml/jackson/core/d;
.super Lcom/fasterxml/jackson/core/j;
.source "JsonFactoryBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/core/j<",
        "Lcom/fasterxml/jackson/core/JsonFactory;",
        "Lcom/fasterxml/jackson/core/d;",
        ">;"
    }
.end annotation


# instance fields
.field public i:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

.field public j:Lcom/fasterxml/jackson/core/i;

.field public k:I

.field public l:C


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/j;-><init>()V

    const/16 v0, 0x22

    .line 2
    iput-char v0, p0, Lcom/fasterxml/jackson/core/d;->l:C

    .line 3
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/i;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/d;->j:Lcom/fasterxml/jackson/core/i;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/fasterxml/jackson/core/d;->k:I

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/j;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    const/16 v0, 0x22

    .line 6
    iput-char v0, p0, Lcom/fasterxml/jackson/core/d;->l:C

    .line 7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonFactory;->getCharacterEscapes()Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/d;->i:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 8
    iget-object v0, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/i;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/d;->j:Lcom/fasterxml/jackson/core/i;

    .line 9
    iget p1, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_maximumNonEscapedChar:I

    iput p1, p0, Lcom/fasterxml/jackson/core/d;->k:I

    return-void
.end method
