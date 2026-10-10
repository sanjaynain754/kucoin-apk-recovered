package com.sensorsdata.analytics.android.sdk.visual.snap;

/* JADX INFO: loaded from: classes59.dex */
public class PropertyDescription {
    public final Caller accessor;
    private final String mMutatorName;
    public final String name;
    public final Class<?> targetClass;

    public String toString() {
        return "[PropertyDescription " + this.name + "," + this.targetClass + ", " + this.accessor + "/" + this.mMutatorName + "]";
    }

    public PropertyDescription(String str, Class<?> cls, Caller caller, String str2) {
        this.name = str;
        this.targetClass = cls;
        this.accessor = caller;
        this.mMutatorName = str2;
    }
}
