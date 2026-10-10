package com.bumptech.glide;

import com.bumptech.glide.AbstractC5315i;
import p460n2.C42703a;
import p460n2.InterfaceC42705c;

/* JADX INFO: renamed from: com.bumptech.glide.i */
/* JADX INFO: compiled from: TransitionOptions.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5315i<CHILD extends AbstractC5315i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: b */
    public InterfaceC42705c<? super TranscodeType> f6728b = C42703a.m93595b();

    /* JADX INFO: renamed from: b */
    public final InterfaceC42705c<? super TranscodeType> m6644b() {
        return this.f6728b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }
}
