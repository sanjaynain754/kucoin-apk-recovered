package io.chad.library.adapter.base.entity;

import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public interface IExpandable<T> {
    int getLevel();

    List<T> getSubItems();

    boolean isExpanded();

    void setExpanded(boolean z11);
}
