package com.kubi.mine.lib.manger;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.C5264d;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mine.R$id;
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
import p538pq.C43522b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.mine.lib.manger.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: V2UpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/mine/lib/manger/V2Upgrade;", "", "increaseCount", "Lkotlin/Function0;", "", "decreaseCount", "futuresPageId", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "getIncreaseCount", "()Lkotlin/jvm/functions/Function0;", "getDecreaseCount", "getFuturesPageId", "()Ljava/lang/String;", "dialog", "Lcom/kubi/mine/lib/manger/UpgradeDialog;", "upgrade", "Ljava/util/concurrent/atomic/AtomicBoolean;", "checkUpgrade", "fragment", "Lcom/kubi/sdk/BaseFragment;", "checkExpose", "showForceUpgrade", "config", "Lcom/kubi/mine/lib/manger/UpgradeConfig;", "showRecommendUpgrade", "getUpgradeConfig", "checkVersionInterval", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nV2UpgradeManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2UpgradeManger.kt\ncom/kubi/mine/lib/manger/V2Upgrade\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,241:1\n35#2,4:242\n39#2:248\n44#3,2:246\n*S KotlinDebug\n*F\n+ 1 V2UpgradeManger.kt\ncom/kubi/mine/lib/manger/V2Upgrade\n*L\n133#1:242,4\n133#1:248\n133#1:246,2\n*E\n"})
public final class V2Upgrade {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Function0<Unit> f35114a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Function0<Unit> f35115b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f35116c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public UpgradeDialog f35117d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AtomicBoolean f35118e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.o$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<HashMap<String, UpgradeConfig>> {
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.o$b */
    /* JADX INFO: compiled from: V2UpgradeManger.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/mine/lib/manger/V2Upgrade$showForceUpgrade$1", "Lcom/kubi/mine/lib/manger/UpgradeDialog;", "onCreate", "", "root", "Landroid/view/View;", "dialog", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends UpgradeDialog {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ UpgradeConfig f35119h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, UpgradeConfig upgradeConfig) {
            super(viewGroup, upgradeConfig);
            this.f35119h = upgradeConfig;
        }

        /* JADX INFO: renamed from: q */
        public static final Unit m41774q(UpgradeConfig upgradeConfig, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Router.f46192a.m56184f(C27041f.m66668h(upgradeConfig.getLink())).m4048k();
            upgradeDialog.m41764l(TuplesKt.m90091to("clickPosition", "url"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m41775r(UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C43522b.f96058a.m95772c();
            upgradeDialog.m41764l(TuplesKt.m90091to("clickPosition", "update"));
            return Unit.INSTANCE;
        }

        @Override // com.kubi.mine.lib.manger.UpgradeDialog
        /* JADX INFO: renamed from: i */
        public void mo41761i(View root, final UpgradeDialog dialog) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            UpgradeDialog.m41756n(dialog, null, 1, null);
            TextView textView = (TextView) root.findViewById(R$id.tv_title);
            if (textView != null) {
                textView.setText(this.f35119h.getTitle());
            }
            TextView textView2 = (TextView) root.findViewById(R$id.tv_upgradeText);
            if (textView2 != null) {
                textView2.setText(this.f35119h.getContent());
            }
            TextView textView3 = (TextView) root.findViewById(R$id.upgradeLink);
            if (!TextUtils.isEmpty(this.f35119h.getLink())) {
                if (textView3 != null) {
                    C27046k.m66685H(textView3);
                }
                if (textView3 != null) {
                    textView3.setText(this.f35119h.getLink());
                }
                if (textView3 != null) {
                    final UpgradeConfig upgradeConfig = this.f35119h;
                    ViewExtKt.m66575f(textView3, new Function1() { // from class: com.kubi.mine.lib.manger.p
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V2Upgrade.b.m41774q(upgradeConfig, dialog, (View) obj);
                        }
                    });
                }
            } else if (textView3 != null) {
                C27046k.m66700o(textView3);
            }
            View viewFindViewById = root.findViewById(R$id.but_close);
            if (viewFindViewById != null) {
                ViewExtKt.m66577h(viewFindViewById);
            }
            View viewFindViewById2 = root.findViewById(R$id.but_upgrade);
            if (viewFindViewById2 != null) {
                ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.mine.lib.manger.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V2Upgrade.b.m41775r(dialog, (View) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.o$c */
    /* JADX INFO: compiled from: V2UpgradeManger.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/mine/lib/manger/V2Upgrade$showRecommendUpgrade$1", "Lcom/kubi/mine/lib/manger/UpgradeDialog;", "onCreate", "", "root", "Landroid/view/View;", "dialog", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends UpgradeDialog {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ UpgradeConfig f35120h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, UpgradeConfig upgradeConfig) {
            super(viewGroup, upgradeConfig);
            this.f35120h = upgradeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m41779r(UpgradeConfig upgradeConfig, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Router.f46192a.m56184f(C27041f.m66668h(upgradeConfig.getLink())).m4048k();
            upgradeDialog.m41764l(TuplesKt.m90091to("clickPosition", "url"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m41780s(c cVar, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.m41758f();
            upgradeDialog.m41764l(TuplesKt.m90091to("clickPosition", "close"));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m41781t(c cVar, UpgradeDialog upgradeDialog, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C43522b.f96058a.m95772c();
            cVar.m41758f();
            upgradeDialog.m41764l(TuplesKt.m90091to("clickPosition", "update"));
            return Unit.INSTANCE;
        }

        @Override // com.kubi.mine.lib.manger.UpgradeDialog
        /* JADX INFO: renamed from: i */
        public void mo41761i(View root, final UpgradeDialog dialog) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            UpgradeDialog.m41756n(dialog, null, 1, null);
            TextView textView = (TextView) root.findViewById(R$id.tv_title);
            if (textView != null) {
                textView.setText(this.f35120h.getTitle());
            }
            TextView textView2 = (TextView) root.findViewById(R$id.tv_upgradeText);
            if (textView2 != null) {
                textView2.setText(this.f35120h.getContent());
            }
            TextView textView3 = (TextView) root.findViewById(R$id.upgradeLink);
            if (!TextUtils.isEmpty(this.f35120h.getLink())) {
                if (textView3 != null) {
                    C27046k.m66685H(textView3);
                }
                if (textView3 != null) {
                    textView3.setText(this.f35120h.getLink());
                }
                if (textView3 != null) {
                    final UpgradeConfig upgradeConfig = this.f35120h;
                    ViewExtKt.m66575f(textView3, new Function1() { // from class: com.kubi.mine.lib.manger.r
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V2Upgrade.c.m41779r(upgradeConfig, dialog, (View) obj);
                        }
                    });
                }
            } else if (textView3 != null) {
                C27046k.m66700o(textView3);
            }
            View viewFindViewById = root.findViewById(R$id.but_close);
            if (viewFindViewById != null) {
                ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.mine.lib.manger.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V2Upgrade.c.m41780s(this.f35126b, dialog, (View) obj);
                    }
                });
            }
            View viewFindViewById2 = root.findViewById(R$id.but_upgrade);
            if (viewFindViewById2 != null) {
                ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.mine.lib.manger.t
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V2Upgrade.c.m41781t(this.f35128b, dialog, (View) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m41766a() {
        UpgradeDialog upgradeDialog;
        UpgradeDialog upgradeDialog2 = this.f35117d;
        if (upgradeDialog2 == null || !upgradeDialog2.m41760h() || (upgradeDialog = this.f35117d) == null) {
            return;
        }
        UpgradeDialog.m41756n(upgradeDialog, null, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m41767b(@NotNull BaseFragment fragment) {
        UpgradeConfig upgradeConfigM41769d;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!this.f35118e.compareAndSet(false, true) || (upgradeConfigM41769d = m41769d()) == null) {
            return;
        }
        String strM66668h = C27041f.m66668h(upgradeConfigM41769d.getUpgrade());
        if (Intrinsics.areEqual(strM66668h, "force")) {
            m41770e(fragment, upgradeConfigM41769d);
            return;
        }
        if (Intrinsics.areEqual(strM66668h, "advice")) {
            m41771f(fragment, upgradeConfigM41769d);
            return;
        }
        C44128b.m97265i("V2Upgrade:upgrade:" + upgradeConfigM41769d.getUpgrade());
    }

    /* JADX INFO: renamed from: d */
    public final UpgradeConfig m41769d() {
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

    public V2Upgrade(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable String str) {
        this.f35114a = function0;
        this.f35115b = function1;
        this.f35116c = str;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41768c(UpgradeConfig upgradeConfig) {
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

    /* JADX INFO: renamed from: e */
    public final void m41770e(BaseFragment baseFragment, UpgradeConfig upgradeConfig) {
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
        if (m41768c(upgradeConfig)) {
            b bVar = new b(viewGroup, upgradeConfig);
            this.f35117d = bVar;
            bVar.m41762j(this.f35114a, this.f35115b, this.f35116c);
            UpgradeDialog upgradeDialog = this.f35117d;
            if (upgradeDialog != null) {
                upgradeDialog.m41763k();
            }
            DataMapUtil.f54245a.m66379n(C27041f.m66668h(upgradeConfig.getUpgrade()), System.currentTimeMillis());
            return;
        }
        C44128b.m97266j("V2Upgrade", "force upgrade skip");
    }

    /* JADX INFO: renamed from: f */
    public final void m41771f(BaseFragment baseFragment, UpgradeConfig upgradeConfig) {
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
        if (m41768c(upgradeConfig)) {
            c cVar = new c(viewGroup, upgradeConfig);
            this.f35117d = cVar;
            cVar.m41762j(this.f35114a, this.f35115b, this.f35116c);
            UpgradeDialog upgradeDialog = this.f35117d;
            if (upgradeDialog != null) {
                upgradeDialog.m41763k();
            }
            DataMapUtil.f54245a.m66379n(C27041f.m66668h(upgradeConfig.getUpgrade()), System.currentTimeMillis());
            return;
        }
        C44128b.m97266j("V2Upgrade", "recommend upgrade skip");
    }
}
