package bo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import co.InterfaceC5033a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.ui.FragmentProviderFactory;
import com.kubi.route.config.model.RouteTechStack;
import com.kubi.sdk.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p238eo.C37218a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: bo.a */
/* JADX INFO: compiled from: TabFragmentManager.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001c\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/lite/tab/container/TabFragmentManager;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "fragmentProviderFactory", "Lcom/kubi/lite/tab/ui/FragmentProviderFactory;", "<init>", "(Landroidx/fragment/app/FragmentManager;ILcom/kubi/lite/tab/ui/FragmentProviderFactory;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "fragmentCache", "", "Lcom/kubi/sdk/BaseFragment;", "currentFragmentTag", "getOrCreateFragment", ViewProps.POSITION, "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "newUrl", "getFragment", "createFragmentByTechStack", "switchToFragment", "", "getCurrentFragment", "clear", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4638a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentManager f4170a;

    /* JADX INFO: renamed from: b */
    public final int f4171b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FragmentProviderFactory f4172c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f4173d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<String, BaseFragment> f4174e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f4175f;

    public C4638a(@NotNull FragmentManager fragmentManager, int i11, @NotNull FragmentProviderFactory fragmentProviderFactory) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentProviderFactory, "fragmentProviderFactory");
        this.f4170a = fragmentManager;
        this.f4171b = i11;
        this.f4172c = fragmentProviderFactory;
        this.f4173d = "LiteV2-TabFragmentManager";
        this.f4174e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m4570a() {
        this.f4174e.clear();
        this.f4175f = null;
        C44128b.m97266j(this.f4173d, "clear completed");
    }

    /* JADX INFO: renamed from: b */
    public final BaseFragment m4571b(int i11, TabConfig tabConfig, String str) {
        C44128b.m97266j(this.f4173d, "createFragmentByTechStack start: position=" + i11);
        RouteTechStack routeTechStackM83261b = C37218a.f82536a.m83261b(tabConfig);
        String str2 = this.f4173d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating fragment - tech stack: ");
        sb2.append(routeTechStackM83261b);
        sb2.append(", URL: ");
        String url = tabConfig.getUrl();
        if (url == null) {
            url = "null";
        }
        sb2.append(url);
        C44128b.m97266j(str2, sb2.toString());
        InterfaceC5033a interfaceC5033aM37633a = this.f4172c.m37633a(routeTechStackM83261b);
        if (interfaceC5033aM37633a == null) {
            C44128b.m97266j(this.f4173d, "Warning: No provider found for tech stack: " + routeTechStackM83261b);
        }
        BaseFragment baseFragmentMo5441a = interfaceC5033aM37633a != null ? interfaceC5033aM37633a.mo5441a(tabConfig, str) : null;
        if (baseFragmentMo5441a != null) {
            C44128b.m97266j(this.f4173d, "Fragment created successfully: tabId=" + tabConfig.getConfigTabId() + ", fragment=" + baseFragmentMo5441a.getClass().getSimpleName());
            return baseFragmentMo5441a;
        }
        C44128b.m97266j(this.f4173d, "Error: Fragment creation failed: tabId=" + tabConfig.getConfigTabId());
        throw new IllegalStateException("Cannot create Fragment: tabId=" + tabConfig.getConfigTabId());
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final BaseFragment m4572c() {
        String str = this.f4175f;
        if (str == null) {
            return null;
        }
        Fragment fragmentFindFragmentByTag = this.f4170a.findFragmentByTag(str);
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            return (BaseFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m4574e(int i11, @NotNull TabConfig tabConfig, @Nullable String str) {
        Fragment fragmentFindFragmentByTag;
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        String configTabId = tabConfig.getConfigTabId();
        String url = tabConfig.getUrl();
        if (url == null) {
            url = "";
        }
        String str2 = "tab_" + i11 + '_' + configTabId;
        C44128b.m97266j(this.f4173d, "switchToFragment start: position=" + i11 + ", tag=" + str2 + ", url=" + url);
        if (this.f4170a.isDestroyed()) {
            C44128b.m97266j(this.f4173d, "FragmentManager is destroyed, skipping switch: tag=" + str2);
            return;
        }
        if (Intrinsics.areEqual(this.f4175f, str2)) {
            C44128b.m97266j(this.f4173d, "Already on current fragment, skipping");
            return;
        }
        BaseFragment baseFragmentM4573d = m4573d(i11, tabConfig, str);
        FragmentTransaction fragmentTransactionBeginTransaction = this.f4170a.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        String str3 = this.f4175f;
        if (str3 != null && (fragmentFindFragmentByTag = this.f4170a.findFragmentByTag(str3)) != null) {
            fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag);
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.STARTED);
            C44128b.m97266j(this.f4173d, "Hiding and suspending lifecycle for: " + str3);
        }
        Fragment fragmentFindFragmentByTag2 = this.f4170a.findFragmentByTag(str2);
        if (fragmentFindFragmentByTag2 != null) {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag2, Lifecycle.State.RESUMED);
            C44128b.m97266j(this.f4173d, "Showing and resuming lifecycle for existing: " + str2);
        } else {
            fragmentTransactionBeginTransaction.add(this.f4171b, baseFragmentM4573d, str2);
            fragmentTransactionBeginTransaction.setMaxLifecycle(baseFragmentM4573d, Lifecycle.State.RESUMED);
            C44128b.m97266j(this.f4173d, "Adding and resuming lifecycle for new: " + str2);
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        this.f4175f = str2;
        C44128b.m97266j(this.f4173d, "Fragment switch completed: position=" + i11 + ", tag=" + str2);
    }

    /* JADX INFO: renamed from: d */
    public final BaseFragment m4573d(int i11, TabConfig tabConfig, String str) {
        String configTabId = tabConfig.getConfigTabId();
        String str2 = i11 + '_' + configTabId;
        C44128b.m97266j(this.f4173d, "getOrCreateFragment start: position=" + i11 + ", tabId=" + configTabId + ", cacheKey=" + str2);
        BaseFragment baseFragment = this.f4174e.get(str2);
        if (baseFragment != null) {
            C44128b.m97266j(this.f4173d, "Using cached fragment: cacheKey=" + str2);
            return baseFragment;
        }
        C44128b.m97266j(this.f4173d, "Creating new fragment: position=" + i11 + ", tabId=" + configTabId);
        BaseFragment baseFragmentM4571b = m4571b(i11, tabConfig, str);
        this.f4174e.put(str2, baseFragmentM4571b);
        C44128b.m97266j(this.f4173d, "Fragment cached: cacheKey=" + str2 + ", total cache size=" + this.f4174e.size());
        return baseFragmentM4571b;
    }

    public /* synthetic */ C4638a(FragmentManager fragmentManager, int i11, FragmentProviderFactory fragmentProviderFactory, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, i11, (i12 & 4) != 0 ? new FragmentProviderFactory() : fragmentProviderFactory);
    }
}
