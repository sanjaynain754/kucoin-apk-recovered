package com.kubi.kumex.helper;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$id;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kumex.helper.j1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: V2Upgrade.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "废弃", replaceWith = @ReplaceWith(expression = "com.kubi.mine.lib.manger.V2Upgrade", imports = {}))
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/helper/V2Upgrade;", "", "<init>", "()V", "dialog", "Lcom/kubi/kumex/helper/UpgradeDialog;", "upgrade", "Ljava/util/concurrent/atomic/AtomicBoolean;", "checkUpgrade", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "checkExpose", "showForceUpgrade", "config", "Lcom/kubi/kumex/helper/UpgradeConfig;", "showRecommendUpgrade", "getUpgradeConfig", "upgradeApp", "checkVersionInterval", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nV2Upgrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2Upgrade.kt\ncom/kubi/kumex/helper/V2Upgrade\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,243:1\n35#2,4:244\n39#2:250\n44#3,2:248\n*S KotlinDebug\n*F\n+ 1 V2Upgrade.kt\ncom/kubi/kumex/helper/V2Upgrade\n*L\n138#1:244,4\n138#1:250\n138#1:248,2\n*E\n"})
public final class V2Upgrade {

    /* JADX INFO: renamed from: a */
    @Nullable
    public UpgradeDialog f29266a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicBoolean f29267b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.kumex.helper.j1$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<HashMap<String, UpgradeConfig>> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.helper.j1$b */
    /* JADX INFO: compiled from: V2Upgrade.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/helper/V2Upgrade$showForceUpgrade$1", "Lcom/kubi/kumex/helper/UpgradeDialog;", "onCreate", "", "root", "Landroid/view/View;", "dialog", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends UpgradeDialog {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ UpgradeConfig f29268e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ V2Upgrade f29269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, UpgradeConfig upgradeConfig, V2Upgrade v2Upgrade) {
            super(viewGroup, upgradeConfig);
            this.f29268e = upgradeConfig;
            this.f29269f = v2Upgrade;
        }

        /* JADX INFO: renamed from: p */
        public static final Unit m33999p(UpgradeConfig upgradeConfig, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Router.f46192a.m56184f(C27041f.m66668h(upgradeConfig.getLink())).m4048k();
            upgradeDialog.m33987k(TuplesKt.m90091to("clickPosition", "url"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static final Unit m34000q(V2Upgrade v2Upgrade, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            v2Upgrade.m33996h();
            upgradeDialog.m33987k(TuplesKt.m90091to("clickPosition", "update"));
            return Unit.INSTANCE;
        }

        @Override // com.kubi.kumex.helper.UpgradeDialog
        /* JADX INFO: renamed from: i */
        public void mo33985i(View root, final UpgradeDialog dialog) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            UpgradeDialog.m33980m(dialog, null, 1, null);
            ((TextView) root.findViewById(R$id.upgradeTitle)).setText(this.f29268e.getTitle());
            ((TextView) root.findViewById(R$id.upgradeContent)).setText(this.f29268e.getContent());
            if (TextUtils.isEmpty(this.f29268e.getLink())) {
                View viewFindViewById = root.findViewById(R$id.upgradeLink);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                C27046k.m66700o(viewFindViewById);
            } else {
                int i11 = R$id.upgradeLink;
                View viewFindViewById2 = root.findViewById(i11);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                C27046k.m66685H(viewFindViewById2);
                ((TextView) root.findViewById(i11)).setText(this.f29268e.getLink());
                View viewFindViewById3 = root.findViewById(i11);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                final UpgradeConfig upgradeConfig = this.f29268e;
                ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.kumex.helper.k1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V2Upgrade.b.m33999p(upgradeConfig, dialog, (View) obj);
                    }
                });
            }
            View viewFindViewById4 = root.findViewById(R$id.upgradeClose);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById4);
            View viewFindViewById5 = root.findViewById(R$id.upgradeButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            final V2Upgrade v2Upgrade = this.f29269f;
            ViewExtKt.m66575f(viewFindViewById5, new Function1() { // from class: com.kubi.kumex.helper.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return V2Upgrade.b.m34000q(v2Upgrade, dialog, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.helper.j1$c */
    /* JADX INFO: compiled from: V2Upgrade.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/helper/V2Upgrade$showRecommendUpgrade$1", "Lcom/kubi/kumex/helper/UpgradeDialog;", "onCreate", "", "root", "Landroid/view/View;", "dialog", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends UpgradeDialog {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ UpgradeConfig f29270e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ V2Upgrade f29271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, UpgradeConfig upgradeConfig, V2Upgrade v2Upgrade) {
            super(viewGroup, upgradeConfig);
            this.f29270e = upgradeConfig;
            this.f29271f = v2Upgrade;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final Unit m34004q(UpgradeConfig upgradeConfig, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Router.f46192a.m56184f(C27041f.m66668h(upgradeConfig.getLink())).m4048k();
            upgradeDialog.m33987k(TuplesKt.m90091to("clickPosition", "url"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m34005r(c cVar, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.m33982f();
            upgradeDialog.m33987k(TuplesKt.m90091to("clickPosition", "close"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m34006s(V2Upgrade v2Upgrade, c cVar, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            v2Upgrade.m33996h();
            cVar.m33982f();
            upgradeDialog.m33987k(TuplesKt.m90091to("clickPosition", "update"));
            return Unit.INSTANCE;
        }

        @Override // com.kubi.kumex.helper.UpgradeDialog
        /* JADX INFO: renamed from: i */
        public void mo33985i(View root, final UpgradeDialog dialog) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            UpgradeDialog.m33980m(dialog, null, 1, null);
            ((TextView) root.findViewById(R$id.upgradeTitle)).setText(this.f29270e.getTitle());
            ((TextView) root.findViewById(R$id.upgradeContent)).setText(this.f29270e.getContent());
            if (TextUtils.isEmpty(this.f29270e.getLink())) {
                View viewFindViewById = root.findViewById(R$id.upgradeLink);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                C27046k.m66700o(viewFindViewById);
            } else {
                int i11 = R$id.upgradeLink;
                View viewFindViewById2 = root.findViewById(i11);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                C27046k.m66685H(viewFindViewById2);
                ((TextView) root.findViewById(i11)).setText(this.f29270e.getLink());
                View viewFindViewById3 = root.findViewById(i11);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                final UpgradeConfig upgradeConfig = this.f29270e;
                ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.kumex.helper.m1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V2Upgrade.c.m34004q(upgradeConfig, dialog, (View) obj);
                    }
                });
            }
            View viewFindViewById4 = root.findViewById(R$id.upgradeClose);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ViewExtKt.m66575f(viewFindViewById4, new Function1() { // from class: com.kubi.kumex.helper.n1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return V2Upgrade.c.m34005r(this.f29286b, dialog, (View) obj);
                }
            });
            View viewFindViewById5 = root.findViewById(R$id.upgradeButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            final V2Upgrade v2Upgrade = this.f29271f;
            ViewExtKt.m66575f(viewFindViewById5, new Function1() { // from class: com.kubi.kumex.helper.o1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return V2Upgrade.c.m34006s(v2Upgrade, this, dialog, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m33990b() {
        UpgradeDialog upgradeDialog;
        UpgradeDialog upgradeDialog2 = this.f29266a;
        if (upgradeDialog2 == null || !upgradeDialog2.m33984h() || (upgradeDialog = this.f29266a) == null) {
            return;
        }
        UpgradeDialog.m33980m(upgradeDialog, null, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m33991c(@NotNull BaseFragment fragment) {
        UpgradeConfig upgradeConfigM33993e;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!this.f29267b.compareAndSet(false, true) || (upgradeConfigM33993e = m33993e()) == null) {
            return;
        }
        String strM66668h = C27041f.m66668h(upgradeConfigM33993e.getUpgrade());
        if (Intrinsics.areEqual(strM66668h, "force")) {
            m33994f(fragment, upgradeConfigM33993e);
            return;
        }
        if (Intrinsics.areEqual(strM66668h, "advice")) {
            m33995g(fragment, upgradeConfigM33993e);
            return;
        }
        C44128b.m97265i("V2Upgrade:upgrade:" + upgradeConfigM33993e.getUpgrade());
    }

    /* JADX INFO: renamed from: e */
    public final UpgradeConfig m33993e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("futures_upgrade", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        HashMap map = (HashMap) objM20457a;
        if (map != null) {
            return (UpgradeConfig) map.get(MultiLanguageManager.f46811g.getLocalString());
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m33996h() {
        if (!StringsKt.equals("GOOGLE", C45590s.f102687a.m100665P(), true)) {
            C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse(HostManager.a.e() + "/download")));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.kubi.kucoin"));
            intent.addFlags(268435456);
            intent.setPackage("com.android.vending");
            C5258a.m6129l(intent);
        } catch (Throwable unused) {
            C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse(HostManager.a.e() + "/download")));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33992d(UpgradeConfig upgradeConfig) {
        String version = upgradeConfig.getVersion();
        if (version == null) {
            return false;
        }
        if (VersionUtils.f47483a.m57851b(C5264d.m6166l(), version) >= 0) {
            return false;
        }
        if (System.currentTimeMillis() - DataMapUtil.f54245a.m66372e(C27041f.m66668h(upgradeConfig.getUpgrade()), 0L) <= C27039d.m66651k(upgradeConfig.getInterval(), 0) * 3600000) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m33994f(BaseFragment baseFragment, UpgradeConfig upgradeConfig) {
        ViewGroup viewGroup;
        View view = baseFragment.getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        if (m33992d(upgradeConfig)) {
            b bVar = new b(viewGroup, upgradeConfig, this);
            this.f29266a = bVar;
            bVar.m33986j();
            DataMapUtil.f54245a.m66379n(C27041f.m66668h(upgradeConfig.getUpgrade()), System.currentTimeMillis());
            return;
        }
        C44128b.m97266j("V2Upgrade", "force upgrade skip");
    }

    /* JADX INFO: renamed from: g */
    public final void m33995g(BaseFragment baseFragment, UpgradeConfig upgradeConfig) {
        ViewGroup viewGroup;
        View view = baseFragment.getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        if (m33992d(upgradeConfig)) {
            c cVar = new c(viewGroup, upgradeConfig, this);
            this.f29266a = cVar;
            cVar.m33986j();
            DataMapUtil.f54245a.m66379n(C27041f.m66668h(upgradeConfig.getUpgrade()), System.currentTimeMillis());
            return;
        }
        C44128b.m97266j("V2Upgrade", "recommend upgrade skip");
    }
}
