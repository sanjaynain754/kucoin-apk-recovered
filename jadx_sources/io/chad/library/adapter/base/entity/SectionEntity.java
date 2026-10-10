package io.chad.library.adapter.base.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes60.dex */
public abstract class SectionEntity<T> implements Serializable {
    public String header;
    public boolean isHeader;

    /* JADX INFO: renamed from: t */
    public T f86727t;

    public SectionEntity(boolean z11, String str) {
        this.isHeader = z11;
        this.header = str;
        this.f86727t = null;
    }

    public SectionEntity(T t11) {
        this.isHeader = false;
        this.header = null;
        this.f86727t = t11;
    }
}
