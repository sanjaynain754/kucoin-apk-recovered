package com.kubi.lite.tab.container.provider;

import co.InterfaceC5033a;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeFragmentProvider.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/NativeFragmentProvider;", "Lcom/kubi/lite/tab/container/provider/FragmentProvider;", "<init>", "()V", "createFragment", "Lcom/kubi/sdk/BaseFragment;", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "newUrl", "", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NativeFragmentProvider implements InterfaceC5033a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32094a = new Companion(null);

    /* JADX INFO: compiled from: NativeFragmentProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/NativeFragmentProvider$Companion;", "", "<init>", "()V", "TAG", "", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // co.InterfaceC5033a
    @NotNull
    /* JADX INFO: renamed from: a */
    public BaseFragment mo5441a(@NotNull TabConfig tabConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        return PlaceholderFragment.f32095V.newInstance("Native Fragment - " + tabConfig.getTitle());
    }
}
