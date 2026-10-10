package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.CharacterEscapes;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.d */
/* JADX INFO: compiled from: JsonFactoryBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6300d extends AbstractC6318j<JsonFactory, C6300d> {

    /* JADX INFO: renamed from: i */
    public CharacterEscapes f10041i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6306i f10042j;

    /* JADX INFO: renamed from: k */
    public int f10043k;

    /* JADX INFO: renamed from: l */
    public char f10044l;

    public C6300d() {
        this.f10044l = '\"';
        this.f10042j = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.f10043k = 0;
    }

    public C6300d(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.f10044l = '\"';
        this.f10041i = jsonFactory.getCharacterEscapes();
        this.f10042j = jsonFactory._rootValueSeparator;
        this.f10043k = jsonFactory._maximumNonEscapedChar;
    }
}
