package com.facebook.react.defaults;

import com.facebook.react.fabric.ComponentFactory;
import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: DefaultComponentsRegistry.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 ¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "", "<init>", "()V", "register", "", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class DefaultComponentsRegistry {

    @NotNull
    public static final DefaultComponentsRegistry INSTANCE = new DefaultComponentsRegistry();

    @JvmStatic
    @InterfaceC44695a
    public static final native void register(@NotNull ComponentFactory componentFactory);

    static {
        DefaultSoLoader.INSTANCE.maybeLoadSoLibrary();
    }

    private DefaultComponentsRegistry() {
    }
}
