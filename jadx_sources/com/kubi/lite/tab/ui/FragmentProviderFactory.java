package com.kubi.lite.tab.ui;

import co.InterfaceC5033a;
import com.kubi.lite.tab.container.provider.FlutterFragmentProvider;
import com.kubi.lite.tab.container.provider.H5FragmentProvider;
import com.kubi.lite.tab.container.provider.NativeFragmentProvider;
import com.kubi.lite.tab.container.provider.RNFragmentProvider;
import com.kubi.route.config.model.RouteTechStack;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.lite.tab.ui.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FragmentProviderFactory.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/lite/tab/ui/FragmentProviderFactory;", "", "<init>", "()V", "providerCache", "", "Lcom/kubi/route/config/model/RouteTechStack;", "Lcom/kubi/lite/tab/container/provider/FragmentProvider;", "getProvider", "techStack", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFragmentProviderFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentProviderFactory.kt\ncom/kubi/lite/tab/ui/FragmentProviderFactory\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,34:1\n382#2,7:35\n*S KotlinDebug\n*F\n+ 1 FragmentProviderFactory.kt\ncom/kubi/lite/tab/ui/FragmentProviderFactory\n*L\n22#1:35,7\n*E\n"})
public final class FragmentProviderFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<RouteTechStack, InterfaceC5033a> f32127a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.lite.tab.ui.a$a */
    /* JADX INFO: compiled from: FragmentProviderFactory.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RouteTechStack.values().length];
            try {
                iArr[RouteTechStack.RN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteTechStack.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteTechStack.H5.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteTechStack.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouteTechStack.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC5033a m37633a(@NotNull RouteTechStack techStack) {
        Intrinsics.checkNotNullParameter(techStack, "techStack");
        Map<RouteTechStack, InterfaceC5033a> map = this.f32127a;
        InterfaceC5033a rNFragmentProvider = map.get(techStack);
        if (rNFragmentProvider == null) {
            int i11 = a.$EnumSwitchMapping$0[techStack.ordinal()];
            if (i11 == 1) {
                rNFragmentProvider = new RNFragmentProvider();
            } else if (i11 == 2) {
                rNFragmentProvider = new FlutterFragmentProvider();
            } else if (i11 == 3) {
                rNFragmentProvider = new H5FragmentProvider();
            } else {
                if (i11 != 4 && i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                rNFragmentProvider = new NativeFragmentProvider();
            }
            map.put(techStack, rNFragmentProvider);
        }
        return rNFragmentProvider;
    }
}
