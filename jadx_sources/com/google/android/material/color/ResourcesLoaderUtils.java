package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(api = 30)
final class ResourcesLoaderUtils {
    public static boolean isColorResource(int i11) {
        return 28 <= i11 && i11 <= 31;
    }

    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate != null) {
            context.getResources().addLoaders(resourcesLoaderCreate);
            return true;
        }
        return false;
    }
}
