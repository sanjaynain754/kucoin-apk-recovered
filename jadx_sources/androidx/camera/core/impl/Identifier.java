package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class Identifier {
    public abstract Object getValue();

    public static Identifier create(Object obj) {
        return new AutoValue_Identifier(obj);
    }
}
