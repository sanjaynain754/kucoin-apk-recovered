package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.AbstractC6318j;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.p062io.InputDecorator;
import com.fasterxml.jackson.core.p062io.OutputDecorator;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.j */
/* JADX INFO: compiled from: TSFBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6318j<F extends JsonFactory, B extends AbstractC6318j<F, B>> {

    /* JADX INFO: renamed from: f */
    public static final int f10130f = JsonFactory.Feature.collectDefaults();

    /* JADX INFO: renamed from: g */
    public static final int f10131g = JsonParser.Feature.collectDefaults();

    /* JADX INFO: renamed from: h */
    public static final int f10132h = JsonGenerator.Feature.collectDefaults();

    /* JADX INFO: renamed from: a */
    public int f10133a;

    /* JADX INFO: renamed from: b */
    public int f10134b;

    /* JADX INFO: renamed from: c */
    public int f10135c;

    /* JADX INFO: renamed from: d */
    public InputDecorator f10136d;

    /* JADX INFO: renamed from: e */
    public OutputDecorator f10137e;

    public AbstractC6318j() {
        this.f10133a = f10130f;
        this.f10134b = f10131g;
        this.f10135c = f10132h;
        this.f10136d = null;
        this.f10137e = null;
    }

    public AbstractC6318j(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public AbstractC6318j(int i11, int i12, int i13) {
        this.f10133a = i11;
        this.f10134b = i12;
        this.f10135c = i13;
    }
}
