package p291go;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabScrollEvent;
import com.kubi.lite.tab.bean.TabSwitchEvent;
import com.kubi.lite.tab.config.TabConfigManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: go.a */
/* JADX INFO: compiled from: LiteTabViewModel.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001f\u001a\u00020\u000fJ\b\u0010 \u001a\u0004\u0018\u00010\tJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "TAG", "", "_tabConfigs", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/lite/tab/bean/TabConfig;", "tabConfigs", "Landroidx/lifecycle/LiveData;", "getTabConfigs", "()Landroidx/lifecycle/LiveData;", "_selectedPosition", "", "selectedPosition", "getSelectedPosition", "_switchTabEvent", "Lcom/kubi/lite/tab/bean/TabSwitchEvent;", "switchTabEvent", "getSwitchTabEvent", "_tabScrollEvent", "Lcom/kubi/lite/tab/bean/TabScrollEvent;", "tabScrollEvent", "getTabScrollEvent", "loadTabConfigs", "", "selectTab", ViewProps.POSITION, "newUrl", "getSelectPosition", "getSelectedConfig", "scrollTab", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37976a extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f85399V = "LiteV2-LiteTabViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<List<TabConfig>> f85400W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<List<TabConfig>> f85401X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Integer> f85402Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<Integer> f85403Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<TabSwitchEvent> f85404a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<TabSwitchEvent> f85405b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<TabScrollEvent> f85406c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final LiveData<TabScrollEvent> f85407d0;

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m85821v(C37976a c37976a, int i11, String str, int i12, Object obj) throws JSONException {
        if ((i12 & 2) != 0) {
            str = null;
        }
        c37976a.m85829u(i11, str);
    }

    /* JADX INFO: renamed from: n */
    public final int m85822n() {
        Integer value = this.f85402Y.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<Integer> m85823o() {
        return this.f85403Z;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<TabSwitchEvent> m85824p() {
        return this.f85405b0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<List<TabConfig>> m85825q() {
        return this.f85401X;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<TabScrollEvent> m85826r() {
        return this.f85407d0;
    }

    /* JADX INFO: renamed from: s */
    public final void m85827s() {
        this.f85400W.setValue(TabConfigManager.f32084a.m37554p());
    }

    /* JADX INFO: renamed from: t */
    public final void m85828t(@NotNull TabScrollEvent tabScrollEvent) {
        Intrinsics.checkNotNullParameter(tabScrollEvent, "tabScrollEvent");
        this.f85406c0.setValue(tabScrollEvent);
    }

    /* JADX INFO: renamed from: u */
    public final void m85829u(int i11, @Nullable String str) throws JSONException {
        TabConfig tabConfig;
        List<TabConfig> value = this.f85400W.getValue();
        if (value == null || (tabConfig = (TabConfig) CollectionsKt.getOrNull(value, i11)) == null) {
            return;
        }
        String str2 = this.f85399V;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("selectTab: pos=");
        sb2.append(i11);
        sb2.append(", hasNewUrl=");
        sb2.append(str != null);
        C44128b.m97266j(str2, sb2.toString());
        Integer value2 = this.f85402Y.getValue();
        if (value2 == null || value2.intValue() != i11) {
            this.f85402Y.setValue(Integer.valueOf(i11));
        }
        this.f85404a0.setValue(new TabSwitchEvent(i11, tabConfig, str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "kcApp.B1LiteBottomNavigation.navigation.1");
        jSONObject.put("spm", "kcApp.B1LiteBottomNavigation.navigation.1");
        jSONObject.put("after_click_element_value", tabConfig.getTitle());
        jSONObject.put("contentID", tabConfig.getTabId());
        jSONObject.put("app_mode", "lite");
        C43852m.m96605q("page_click", jSONObject);
    }

    public C37976a() {
        MutableLiveData<List<TabConfig>> mutableLiveData = new MutableLiveData<>();
        this.f85400W = mutableLiveData;
        this.f85401X = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(0);
        this.f85402Y = mutableLiveData2;
        this.f85403Z = mutableLiveData2;
        MutableLiveData<TabSwitchEvent> mutableLiveData3 = new MutableLiveData<>();
        this.f85404a0 = mutableLiveData3;
        this.f85405b0 = mutableLiveData3;
        MutableLiveData<TabScrollEvent> mutableLiveData4 = new MutableLiveData<>();
        this.f85406c0 = mutableLiveData4;
        this.f85407d0 = mutableLiveData4;
        m85827s();
    }
}
