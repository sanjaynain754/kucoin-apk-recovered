package io.chad.library.adapter.base.entity;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractExpandableItem<T> implements IExpandable<T> {
    protected boolean mExpandable = false;
    protected List<T> mSubItems;

    public void addSubItem(T t11) {
        if (this.mSubItems == null) {
            this.mSubItems = new ArrayList();
        }
        this.mSubItems.add(t11);
    }

    public boolean removeSubItem(T t11) {
        List<T> list = this.mSubItems;
        return list != null && list.remove(t11);
    }

    public boolean contains(T t11) {
        List<T> list = this.mSubItems;
        return list != null && list.contains(t11);
    }

    public int getSubItemPosition(T t11) {
        List<T> list = this.mSubItems;
        if (list != null) {
            return list.indexOf(t11);
        }
        return -1;
    }

    @Override // io.chad.library.adapter.base.entity.IExpandable
    public List<T> getSubItems() {
        return this.mSubItems;
    }

    public boolean hasSubItem() {
        List<T> list = this.mSubItems;
        return list != null && list.size() > 0;
    }

    @Override // io.chad.library.adapter.base.entity.IExpandable
    public boolean isExpanded() {
        return this.mExpandable;
    }

    public boolean removeSubItem(int i11) {
        List<T> list = this.mSubItems;
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return false;
        }
        this.mSubItems.remove(i11);
        return true;
    }

    @Override // io.chad.library.adapter.base.entity.IExpandable
    public void setExpanded(boolean z11) {
        this.mExpandable = z11;
    }

    public void setSubItems(List<T> list) {
        this.mSubItems = list;
    }

    public T getSubItem(int i11) {
        if (hasSubItem() && i11 < this.mSubItems.size()) {
            return this.mSubItems.get(i11);
        }
        return null;
    }

    public void addSubItem(int i11, T t11) {
        List<T> list = this.mSubItems;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            this.mSubItems.add(i11, t11);
        } else {
            addSubItem(t11);
        }
    }
}
