package io.chad.library.adapter.base.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes60.dex */
public abstract class SectionMultiEntity<T> implements Serializable, MultiItemEntity {
    public String header;
    public boolean isHeader;

    /* JADX INFO: renamed from: t */
    public T f86728t;

    public SectionMultiEntity(boolean z11, String str) {
        this.isHeader = z11;
        this.header = str;
        this.f86728t = null;
    }

    public SectionMultiEntity(T t11) {
        this.isHeader = false;
        this.header = null;
        this.f86728t = t11;
    }
}
