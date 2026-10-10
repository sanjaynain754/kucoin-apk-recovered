package com.kubi.kumex.helper;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.kumex.utils.C17060n0;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.helper.i1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: V2Upgrade.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000H&J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00122\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u001e\u0010\u001b\u001a\u00020\u00122\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kumex/helper/UpgradeDialog;", "", "parent", "Landroid/view/ViewGroup;", "config", "Lcom/kubi/kumex/helper/UpgradeConfig;", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/kumex/helper/UpgradeConfig;)V", TIMPushProvider.f75062n, "Ljava/util/concurrent/atomic/AtomicBoolean;", "dialog", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getDialog", "()Landroid/view/View;", "dialog$delegate", "Lkotlin/Lazy;", "onCreate", "", "root", "isShow", "", "dismiss", "trackExpose", "pair", "Lkotlin/Pair;", "", "trackClick", "buildParams", "Lorg/json/JSONObject;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nV2Upgrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2Upgrade.kt\ncom/kubi/kumex/helper/UpgradeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public abstract class UpgradeDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ViewGroup f29260a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final UpgradeConfig f29261b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f29262c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f29263d;

    /* JADX INFO: renamed from: e */
    public static final boolean m33979e(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo33985i(@NotNull View view, @NotNull UpgradeDialog upgradeDialog);

    public UpgradeDialog(@NotNull ViewGroup parent, @NotNull UpgradeConfig config) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f29260a = parent;
        this.f29261b = config;
        this.f29262c = new AtomicBoolean(false);
        this.f29263d = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.helper.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpgradeDialog.m33978d(this.f29256b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final View m33978d(UpgradeDialog upgradeDialog) {
        View viewInflate = LayoutInflater.from(upgradeDialog.f29260a.getContext()).inflate(R$layout.bkumex_include_v2_upgrade, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        upgradeDialog.mo33985i(viewInflate, upgradeDialog);
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.kumex.helper.h1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return UpgradeDialog.m33979e(view, motionEvent);
            }
        });
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m33980m(UpgradeDialog upgradeDialog, Pair pair, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackExpose");
        }
        if ((i11 & 1) != 0) {
            pair = null;
        }
        upgradeDialog.m33988l(pair);
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m33981c(UpgradeConfig upgradeConfig, Pair<String, String> pair) throws JSONException {
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
    public final void m33982f() {
        if (this.f29262c.compareAndSet(true, false)) {
            GuideHelper.f29155a.m33877e();
            this.f29260a.removeView(m33983g());
        }
    }

    /* JADX INFO: renamed from: g */
    public final View m33983g() {
        return (View) this.f29263d.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m33984h() {
        return this.f29262c.get();
    }

    /* JADX INFO: renamed from: j */
    public final void m33986j() {
        if (this.f29262c.compareAndSet(false, true)) {
            GuideHelper.f29155a.m33880j();
            this.f29260a.addView(m33983g(), new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33987k(@Nullable Pair<String, String> pair) {
        C43852m.m96589a(C17060n0.m36552b(), "appUpdateAlert", "1", m33981c(this.f29261b, pair));
    }

    /* JADX INFO: renamed from: l */
    public final void m33988l(@Nullable Pair<String, String> pair) {
        C43852m.m96593e(C17060n0.m36552b(), "appUpdateAlert", "1", m33981c(this.f29261b, pair));
    }
}
