package com.kubi.mine.lib.manger;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.mine.R$layout;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.mine.lib.manger.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: V2UpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H&J0\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\nJ\u001e\u0010\u001f\u001a\u00020\n2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010!J\u001e\u0010\"\u001a\u00020\n2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010!J(\u0010#\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, m90084d2 = {"Lcom/kubi/mine/lib/manger/UpgradeDialog;", "", "parent", "Landroid/view/ViewGroup;", "config", "Lcom/kubi/mine/lib/manger/UpgradeConfig;", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/mine/lib/manger/UpgradeConfig;)V", "guideHelperIncreaseCount", "Lkotlin/Function0;", "", "guideHelperDecreaseCount", "futuresPageId", "", TIMPushProvider.f75062n, "Ljava/util/concurrent/atomic/AtomicBoolean;", "dialog", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getDialog", "()Landroid/view/View;", "dialog$delegate", "Lkotlin/Lazy;", "onCreate", "root", "setVariableData", "increaseCount", "decreaseCount", "isShow", "", "dismiss", "trackExpose", "pair", "Lkotlin/Pair;", "trackClick", "buildParams", "Lorg/json/JSONObject;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nV2UpgradeManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2UpgradeManger.kt\ncom/kubi/mine/lib/manger/UpgradeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class UpgradeDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ViewGroup f35107a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final UpgradeConfig f35108b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function0<Unit> f35109c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f35110d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f35111e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AtomicBoolean f35112f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f35113g;

    /* JADX INFO: renamed from: e */
    public static final boolean m41755e(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo41761i(@NotNull View view, @NotNull UpgradeDialog upgradeDialog);

    public UpgradeDialog(@NotNull ViewGroup parent, @NotNull UpgradeConfig config) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f35107a = parent;
        this.f35108b = config;
        this.f35112f = new AtomicBoolean(false);
        this.f35113g = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.manger.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpgradeDialog.m41754d(this.f35106b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final View m41754d(UpgradeDialog upgradeDialog) {
        View viewInflate = LayoutInflater.from(upgradeDialog.f35107a.getContext()).inflate(R$layout.kucoin_dialog_appupgrade_v2_upgrade, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        upgradeDialog.mo41761i(viewInflate, upgradeDialog);
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.mine.lib.manger.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return UpgradeDialog.m41755e(view, motionEvent);
            }
        });
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m41756n(UpgradeDialog upgradeDialog, Pair pair, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackExpose");
        }
        if ((i11 & 1) != 0) {
            pair = null;
        }
        upgradeDialog.m41765m(pair);
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m41757c(UpgradeConfig upgradeConfig, Pair<String, String> pair) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocale().getLanguage());
        jSONObject.put("postTitle", upgradeConfig.getTitle());
        jSONObject.put("contentItem", upgradeConfig.getContent());
        jSONObject.put("yesOrNo", TextUtils.isEmpty(upgradeConfig.getLink()) ? 1 : 0);
        jSONObject.put("contentType", upgradeConfig.getUpgrade());
        if (pair != null) {
            jSONObject.put(pair.getFirst(), pair.getSecond());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final void m41758f() {
        if (this.f35112f.compareAndSet(true, false)) {
            Function0<Unit> function0 = this.f35110d;
            if (function0 != null) {
                function0.invoke();
            }
            this.f35107a.removeView(m41759g());
        }
    }

    /* JADX INFO: renamed from: g */
    public final View m41759g() {
        return (View) this.f35113g.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m41760h() {
        return this.f35112f.get();
    }

    /* JADX INFO: renamed from: j */
    public final void m41762j(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable String str) {
        this.f35109c = function0;
        this.f35110d = function1;
        this.f35111e = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m41763k() {
        if (this.f35112f.compareAndSet(false, true)) {
            Function0<Unit> function0 = this.f35109c;
            if (function0 != null) {
                function0.invoke();
            }
            this.f35107a.addView(m41759g(), new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m41764l(@Nullable Pair<String, String> pair) {
        String str = this.f35111e;
        if (str != null) {
            C43852m.m96589a(str, "appUpdateAlert", "1", m41757c(this.f35108b, pair));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m41765m(@Nullable Pair<String, String> pair) {
        String str = this.f35111e;
        if (str != null) {
            C43852m.m96593e(str, "appUpdateAlert", "1", m41757c(this.f35108b, pair));
        }
    }
}
