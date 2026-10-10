package com.facebook.react.uimanager;

import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: ComponentNameResolverBinding.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0087 ¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/uimanager/ComponentNameResolverBinding;", "", "<init>", "()V", "install", "", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "componentNameResolver", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ComponentNameResolverBinding {

    @NotNull
    public static final ComponentNameResolverBinding INSTANCE = new ComponentNameResolverBinding();

    @JvmStatic
    public static final native void install(@NotNull RuntimeExecutor runtimeExecutor, @NotNull Object componentNameResolver);

    static {
        SoLoader.loadLibrary("uimanagerjni");
    }

    private ComponentNameResolverBinding() {
    }
}
