package com.fasterxml.jackson.core;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.i */
/* JADX INFO: compiled from: SerializableString.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6306i {
    int appendQuoted(char[] cArr, int i11);

    int appendQuotedUTF8(byte[] bArr, int i11);

    int appendUnquoted(char[] cArr, int i11);

    int appendUnquotedUTF8(byte[] bArr, int i11);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    String getValue();
}
