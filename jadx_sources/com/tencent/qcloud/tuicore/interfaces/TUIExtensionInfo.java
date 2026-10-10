package com.tencent.qcloud.tuicore.interfaces;

import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TUIExtensionInfo implements Comparable<TUIExtensionInfo> {
    private Map<String, Object> data;
    private TUIExtensionEventListener extensionListener;
    private Object icon;
    private String text;
    private int weight;

    @Override // java.lang.Comparable
    public int compareTo(TUIExtensionInfo tUIExtensionInfo) {
        return tUIExtensionInfo.getWeight() - this.weight;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public TUIExtensionEventListener getExtensionListener() {
        return this.extensionListener;
    }

    public Object getIcon() {
        return this.icon;
    }

    public String getText() {
        return this.text;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public void setExtensionListener(TUIExtensionEventListener tUIExtensionEventListener) {
        this.extensionListener = tUIExtensionEventListener;
    }

    public void setIcon(Object obj) {
        this.icon = obj;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setWeight(int i11) {
        this.weight = i11;
    }
}
