package com.ishumei.smantifraud.l1111l111111Il;

import com.ishumei.smantifraud.VDataListener;

/* JADX INFO: loaded from: classes56.dex */
public abstract class l11l11IlIIll {
    protected VDataListener mListener;

    public void unregister() {
        this.mListener = null;
    }

    public void register(VDataListener vDataListener) {
        this.mListener = vDataListener;
    }
}
