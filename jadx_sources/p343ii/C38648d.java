package p343ii;

import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import p314hi.InterfaceC38217e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii.d */
/* JADX INFO: compiled from: FuturesPreferencesSettingImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesPreferencesSettingImpl;", "Lcom/kubi/futures/trade/config/IFuturesPreferencesSetting;", "preferences", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "<init>", "(Lcom/kubi/kumex/data/platform/model/PreferencesEntity;)V", "enableTakerStop", "", "enableAdvancedSettings", "enableTwapSettings", "enableTriggerOrder", "enableIndexPrice", "enableFundingRate", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38648d implements InterfaceC38217e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PreferencesEntity f86645a;

    public C38648d(@NotNull PreferencesEntity preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f86645a = preferences;
    }

    @Override // p314hi.InterfaceC38217e
    /* JADX INFO: renamed from: a */
    public boolean mo86269a() {
        return C27025c.m66567e(this.f86645a.getSeniorOrder(), true);
    }

    @Override // p314hi.InterfaceC38217e
    /* JADX INFO: renamed from: b */
    public boolean mo86270b() {
        return C27025c.m66567e(this.f86645a.getConditionalOrder(), true);
    }

    @Override // p314hi.InterfaceC38217e
    /* JADX INFO: renamed from: c */
    public boolean mo86271c() {
        return C27025c.m66567e(this.f86645a.getTwapOrder(), true);
    }

    @Override // p314hi.InterfaceC38217e
    /* JADX INFO: renamed from: d */
    public boolean mo86272d() {
        return C27025c.m66567e(this.f86645a.getFundingRate(), true);
    }

    @Override // p314hi.InterfaceC38217e
    /* JADX INFO: renamed from: e */
    public boolean mo86273e() {
        return C27025c.m66567e(this.f86645a.getStopProfitAndLoss(), true);
    }

    @NotNull
    public String toString() {
        return this.f86645a.toString();
    }
}
