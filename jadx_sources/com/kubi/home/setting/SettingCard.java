package com.kubi.home.setting;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.IExposureCallback;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import fj.C37532m0;
import g00.InterfaceC37754f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SettingCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/setting/SettingCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinItemHomeSettingBinding", "Lcom/kubi/home/databinding/KucoinItemHomeSettingBinding;", "getKucoinItemHomeSettingBinding", "()Lcom/kubi/home/databinding/KucoinItemHomeSettingBinding;", "kucoinItemHomeSettingBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingCard.kt\ncom/kubi/home/setting/SettingCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,52:1\n147#2,16:53\n*S KotlinDebug\n*F\n+ 1 SettingCard.kt\ncom/kubi/home/setting/SettingCard\n*L\n23#1:53,16\n*E\n"})
public final class SettingCard extends BaseCard {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26201V = C45681e.m100799e(this, new Function1<SettingCard, C37532m0>() { // from class: com.kubi.home.setting.SettingCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37532m0 invoke(@NotNull SettingCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37532m0.m84527a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37532m0, Unit>() { // from class: com.kubi.home.setting.SettingCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37532m0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37532m0 c37532m0) {
            invoke(c37532m0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f26200X = {Reflection.property1(new PropertyReference1Impl(SettingCard.class, "kucoinItemHomeSettingBinding", "getKucoinItemHomeSettingBinding()Lcom/kubi/home/databinding/KucoinItemHomeSettingBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f26199W = new Companion(null);

    /* JADX INFO: compiled from: SettingCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/setting/SettingCard$Companion;", "", "<init>", "()V", "PAGE_ID", "", "BLOCK_ID", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.setting.SettingCard$a */
    /* JADX INFO: compiled from: SettingCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/setting/SettingCard$onViewCreated$1", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14848a implements IExposureCallback {
        public C14848a() {
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            BaseCardData f27849u = SettingCard.this.getF27849U();
            if (f27849u == null) {
                f27849u = null;
            }
            if (f27849u != null) {
                C43852m.m96595g(HomeCardViewHolderProxy.PAGE_ID, "homepageEdit", "1", null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final Unit m30228i3() {
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "homepageEdit", "1", null, 8, null);
        InterfaceC37754f.a.m85133e(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_item_home_setting;
    }

    /* JADX INFO: renamed from: h3 */
    public final C37532m0 m30229h3() {
        return (C37532m0) this.f26201V.getValue(this, f26200X[0]);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ExtensionKt.m32178d(view, new C14848a(), 0.0f, 0, 6, null);
        C37532m0 c37532m0M30229h3 = m30229h3();
        if (c37532m0M30229h3 == null || (frameLayout = c37532m0M30229h3.f83371b) == null) {
            return;
        }
        C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.setting.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingCard.m30228i3();
            }
        }, 1, null);
    }
}
