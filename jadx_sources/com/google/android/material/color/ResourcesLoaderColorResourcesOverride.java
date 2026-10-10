package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.C7090R;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(api = 30)
class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {

    public static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride();

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }
    }

    private ResourcesLoaderColorResourcesOverride() {
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @NonNull
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C7090R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            ThemeUtils.applyThemeOverlay(context, C7090R.style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }
}
