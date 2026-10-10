package com.kubi.payment.channel.capitual.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.ChannelUserInfo;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.common.data.entities.Country;
import java.net.URLEncoder;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CapitualKycViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000eJ\u0012\u0010(\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/channel/capitual/kyc/CapitualKycViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "_userInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "userInfo", "Landroidx/lifecycle/LiveData;", "getUserInfo", "()Landroidx/lifecycle/LiveData;", "_webUrl", "", "webUrl", "getWebUrl", "_kycStatus", "kycStatus", "getKycStatus", "_loadUserInfoError", "loadUserInfoError", "getLoadUserInfoError", "_loadChannelKycError", "loadChannelKycError", "getLoadChannelKycError", "_country", "Lcom/kubi/payment/common/data/entities/Country;", "country", "getCountry", "loadUserInfo", "", "loadChannelKycStatus", "channelKycRequest", "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "isDoubleCheck", "", "decorateWebUrl", "tradeType", "fiatCurrency", "getRedirectPath", "parseCountry", JPushConstants.Analysis.KEY_JSON, "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CapitualKycViewModel extends C42874g {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f38232e0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IChannelRepository f38233X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<ChannelUserInfo> f38234Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f38235Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f38236a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f38237b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<String> f38238c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Country> f38239d0;

    /* JADX INFO: compiled from: CapitualKycViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/capitual/kyc/CapitualKycViewModel$Companion;", "", "<init>", "()V", "UTF_8", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CapitualKycViewModel(@NotNull IChannelRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38233X = repository;
        this.f38234Y = new MutableLiveData<>();
        this.f38235Z = new MutableLiveData<>();
        this.f38236a0 = new MutableLiveData<>();
        this.f38237b0 = new MutableLiveData<>();
        this.f38238c0 = new MutableLiveData<>();
        this.f38239d0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final String m45719A(@NotNull String webUrl, @NotNull String tradeType, @NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(webUrl);
        sb2.append("?return_url=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("?nativePath=");
        sb3.append(URLEncoder.encode(m45724F(tradeType) + "?fiat=" + fiatCurrency + "&backHome=1", "utf-8"));
        sb2.append(URLEncoder.encode(sb3.toString(), "utf-8"));
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<Country> m45720B() {
        return this.f38239d0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final LiveData<String> m45721C() {
        return this.f38236a0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<String> m45722D() {
        return this.f38238c0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<String> m45723E() {
        return this.f38237b0;
    }

    /* JADX INFO: renamed from: F */
    public final String m45724F(String str) {
        return Intrinsics.areEqual(str, "WITHDRAW") ? "otc/fiat/withdraw" : "otc/fiat/recharge";
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<ChannelUserInfo> m45725G() {
        return this.f38234Y;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<String> m45726H() {
        return this.f38235Z;
    }

    /* JADX INFO: renamed from: I */
    public final void m45727I(@NotNull ChannelKycRequest channelKycRequest, boolean z11) {
        Intrinsics.checkNotNullParameter(channelKycRequest, "channelKycRequest");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CapitualKycViewModel$loadChannelKycStatus$1(this, channelKycRequest, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m45729K(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CapitualKycViewModel$parseCountry$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m45728J() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CapitualKycViewModel$loadUserInfo$1(this, null), 3, null);
    }
}
