package p343ii;

import com.kubi.kumex.data.platform.model.UserConfig;
import fm.C37571f;
import org.jetbrains.annotations.NotNull;
import p314hi.InterfaceC38220h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii.g */
/* JADX INFO: compiled from: FuturesUserConfigImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesUserConfigImpl;", "Lcom/kubi/futures/trade/config/IFuturesUserConfig;", "config", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "<init>", "(Lcom/kubi/kumex/data/platform/model/UserConfig;)V", "isLot", "", "defaultSymbol", "", "qtyUnit", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38651g implements InterfaceC38220h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final UserConfig f86654a;

    public C38651g(@NotNull UserConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f86654a = config;
    }

    @Override // p314hi.InterfaceC38220h
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo86284a() {
        return C37571f.m84694a(this.f86654a);
    }

    @Override // p314hi.InterfaceC38220h
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public String mo86285t0() {
        return C37571f.m84698e(this.f86654a);
    }

    @NotNull
    public String toString() {
        String string = this.f86654a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
