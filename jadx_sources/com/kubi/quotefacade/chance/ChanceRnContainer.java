package com.kubi.quotefacade.chance;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.NewMarketConfig;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321hv.InterfaceC38351a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChanceRnContainer.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J$\u0010\u0013\u001a\u00020\u000e*\u0004\u0018\u00010\u00012\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0012\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/ChanceRnContainer;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "rnFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkAddedPreCall", "closure", "Lkotlin/Function1;", "onAgainShow", "initRn", "buildRnArgs", "includeMarket", "", "releaseRnFragment", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceRnContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceRnContainer.kt\ncom/kubi/quotefacade/chance/ChanceRnContainer\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,132:1\n35#2,4:133\n39#2:139\n44#3,2:137\n17#4,2:140\n*S KotlinDebug\n*F\n+ 1 ChanceRnContainer.kt\ncom/kubi/quotefacade/chance/ChanceRnContainer\n*L\n103#1:133,4\n103#1:139\n103#1:137,2\n107#1:140,2\n*E\n"})
public final class ChanceRnContainer extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f41634V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f41635U;

    /* JADX INFO: compiled from: ChanceRnContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/ChanceRnContainer$Companion;", "", "<init>", "()V", "RN_BIZ", "", "RN_ENTRY", "RN_COMPONENT", "RN_ROUTE", "newInstance", "Lcom/kubi/quotefacade/chance/ChanceRnContainer;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChanceRnContainer newInstance() {
            return new ChanceRnContainer();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chance.ChanceRnContainer$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21849a extends TypeToken<NewMarketConfig> {
    }

    /* JADX INFO: renamed from: o3 */
    private final void m51028o3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m51030q3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final Unit m51031r3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX INFO: renamed from: n3 */
    public final Bundle m51032n3(String str) {
        Object objM20457a;
        boolean z11;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21849a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("new_market_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        NewMarketConfig newMarketConfig = (NewMarketConfig) objM20457a;
        boolean zM66567e = C27025c.m66567e(newMarketConfig != null ? newMarketConfig.getMarketGreedVisible() : null, true);
        boolean zM66567e2 = C27025c.m66567e(newMarketConfig != null ? newMarketConfig.getMarketAdvanceDeclineVisible() : null, true);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38351a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC38351a) objM56186h).mo86540a() : true) {
            z11 = C27025c.m66567e(newMarketConfig != null ? newMarketConfig.getMarketEmotionBorrowVisible() : null, true);
        }
        String strEncode = Uri.encode("ChancePage?showGreed=" + zM66567e + "&showDecline=" + zM66567e2 + "&showBorrow=" + z11 + "&excludes=" + Uri.encode(str));
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BIZ, "opportunity");
        bundle.putString("entry", "main");
        bundle.putString(Constants.COMPONENT, "kucoin_opportunity_rn");
        bundle.putString("isEmbedMode", CredentialEntry.TRUE_STRING);
        bundle.putString("disableAddHome", "1");
        bundle.putString("route", strEncode);
        return bundle;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m51033s3() {
        BaseFragment baseFragment = this.f41635U;
        if (baseFragment != null) {
            C5286o.m6325i(baseFragment);
        }
        this.f41635U = null;
    }

    /* JADX INFO: renamed from: p3 */
    private final void m51029p3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChanceRnContainer$initRn$1(this, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        if (this.f41635U == null) {
            m51029p3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f41635U;
        if (baseFragment != null) {
            m51028o3(baseFragment, new Function1() { // from class: com.kubi.quotefacade.chance.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChanceRnContainer.m51030q3((BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m51029p3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        BaseFragment baseFragment = this.f41635U;
        if (baseFragment != null) {
            m51028o3(baseFragment, new Function1() { // from class: com.kubi.quotefacade.chance.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChanceRnContainer.m51031r3((BaseFragment) obj);
                }
            });
        }
    }
}
