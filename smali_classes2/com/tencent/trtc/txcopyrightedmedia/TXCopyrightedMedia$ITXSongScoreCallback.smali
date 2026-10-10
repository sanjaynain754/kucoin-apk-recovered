.class public interface abstract Lcom/tencent/trtc/txcopyrightedmedia/TXCopyrightedMedia$ITXSongScoreCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/trtc/txcopyrightedmedia/TXCopyrightedMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ITXSongScoreCallback"
.end annotation


# virtual methods
.method public abstract onMIDIGroveAndHint(Ljava/lang/String;ZFFI)V
.end method

.method public abstract onMIDISCoreUpdate(Ljava/lang/String;III)V
.end method

.method public abstract onMIDIScoreError(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public abstract onMIDIScoreFinish(Ljava/lang/String;[II)V
.end method

.method public abstract onMIDIScorePrepared(Ljava/lang/String;)V
.end method
