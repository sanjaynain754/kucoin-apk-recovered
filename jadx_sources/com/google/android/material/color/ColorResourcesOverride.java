package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ColorResourcesOverride {
    boolean applyIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    @NonNull
    Context wrapContextIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    @Nullable
    static ColorResourcesOverride getInstance() {
        int i11 = Build.VERSION.SDK_INT;
        if (30 <= i11 && i11 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i11 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}
