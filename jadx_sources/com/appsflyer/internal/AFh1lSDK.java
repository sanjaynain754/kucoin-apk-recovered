package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1lSDK extends AFh1mSDK {
    private final boolean equals;
    private final boolean toString;

    public AFh1lSDK() {
        this(null, null, null);
    }

    public AFh1lSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.toString = bool != null ? bool.booleanValue() : true;
        this.equals = true;
    }
}
